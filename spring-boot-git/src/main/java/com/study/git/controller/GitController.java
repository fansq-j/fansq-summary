package com.study.git.controller;

import com.study.git.config.AppCodeConfig;
import com.study.git.config.GitConfig;
import com.study.git.domain.Conflict;
import com.study.git.domain.Merge;
import com.study.git.domain.MergeDetail;
import com.study.git.repository.ConflictRepository;
import com.study.git.repository.MergeDetailRepository;
import com.study.git.repository.MergeRepository;
import com.study.git.service.MergeService;
import com.study.git.service.WebSocketService;
import com.study.git.utils.Constants;
import com.study.git.utils.JsonResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jgit.api.CheckoutCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.MergeResult;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author TangFD@HF 2018/11/26
 */
@RestController
public class GitController {
    private static final Log LOG = LogFactory.getLog(GitController.class);
    @Resource
    private GitConfig gitConfig;
    @Resource
    private MergeService mergeService;
    @Resource
    private MergeRepository mergeRepository;
    @Resource
    private ConflictRepository conflictRepository;
    @Resource
    private MergeDetailRepository mergeDetailRepository;

    public static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1024));

    @RequestMapping("/delMerge")
    private JsonResult delMerge(String id) {
        try {
            mergeService.deleteById(id);
            return new JsonResult<>();
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult<>(false, "DELETE_FAILED");
        }
    }

    @RequestMapping("/delDetail")
    private JsonResult delDetail(String detailId) {
        try {
            mergeDetailRepository.deleteById(detailId);
            return new JsonResult<>();
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult<>(false, "DELETE_FAILED");
        }
    }

    @RequestMapping("/merge")
    private JsonResult merge(String detailId) {
        MergeDetail mergeDetail = mergeDetailRepository.findById(detailId).get();
        if (mergeDetail == null) {
            return new JsonResult(false, "DETAIL_NOT_EXIST");
        }

        String mergeStatus = mergeDetail.getMergeStatus();
        if (Constants.MERGE_STATUS_FINISHED.equals(mergeStatus)) {
            return new JsonResult(false, "APP_MERGE_FINISHED");
        } else if (Constants.MERGE_STATUS_MERGING.equals(mergeStatus)) {
            return new JsonResult(false, "APP_MERGING");
        }

        THREAD_POOL.execute(() -> {
            mergeApp(mergeDetail);
        });

        return new JsonResult();
    }

    private void mergeApp(MergeDetail mergeDetail) {
        String appCode = mergeDetail.getAppCode();
        if (StringUtils.isEmpty(appCode)) {
            return;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean initGitRepertory = false;
        try {
            updateMergeStatus(mergeDetail, Constants.MERGE_STATUS_MERGING);
            initGitRepertory = initGitRepertory(appCode);
        } catch (Exception e) {
            e.printStackTrace();
            WebSocketService.send("应用[" + appCode + "] 合并失败！" + e.getMessage());
        }

        if (!initGitRepertory) {
            updateMergeStatus(mergeDetail, Constants.MERGE_STATUS_FAILED);
            return;
        }

        try {
            Merge merge = mergeRepository.findById(mergeDetail.getMergeId()).get();
            List<String> conflictFiles = mergeCode(merge, appCode);
            if (CollectionUtils.isEmpty(conflictFiles)) {
                updateMergeStatus(mergeDetail, Constants.MERGE_STATUS_FINISHED);
                merge.setStatus(Constants.MERGE_STATUS_FINISHED);
                mergeRepository.save(merge);
                return;
            }

            updateMergeStatus(mergeDetail, Constants.MERGE_STATUS_FAILED);
            List<Conflict> conflicts = new ArrayList<>(conflictFiles.size());
            conflicts.addAll(conflictFiles.stream().map(conflictFile -> new Conflict(mergeDetail.getId(), conflictFile)).collect(Collectors.toList()));
            conflictRepository.saveAll(conflicts);
        } catch (Exception e) {
            e.printStackTrace();
            WebSocketService.send("应用[" + appCode + "] 合并失败！" + e.getMessage());
            updateMergeStatus(mergeDetail, Constants.MERGE_STATUS_FAILED);
        }
    }

    private void updateMergeStatus(MergeDetail mergeDetail, String mergeStatus) {
        mergeDetail.setMergeStatus(mergeStatus);
        mergeDetail.setLastModifyTime(new Date());
        mergeDetailRepository.save(mergeDetail);
    }

    private List<String> mergeCode(Merge merge, String appCode) throws Exception {
        String v4Branch = merge.getV4Branch();
        String v5Branch = merge.getV5Branch();
        WebSocketService.send("开始合并 " + appCode + " 应用代码 [v4代码分支 : " + v4Branch +
                " ,v5代码分支 : " + v5Branch + "]");
        String middleDir = getMiddleDir(appCode);
        String codeDir = gitConfig.getDir();
        String path = codeDir + middleDir + File.separator + appCode;
        Git git = Git.open(new File(path));
        CheckoutCommand command = git.checkout().setName(v4Branch);
        if (!localHasBranch(git, v4Branch)) {
            command = command.setCreateBranch(true);
        }

        WebSocketService.send("切换到v4分支[" + v4Branch + "]");
        command.call();
        CredentialsProvider credentialsProvider = gitConfig.getCredentialsProvider();
        WebSocketService.send("更新v4分支[" + v4Branch + "]最新代码");
        git.pull().setCredentialsProvider(credentialsProvider).call();
        try {
            command = git.checkout().setName(v5Branch);
            if (!localHasBranch(git, v5Branch)) {
                command = command.setCreateBranch(true);
            }
            WebSocketService.send("切换到v5分支[" + v5Branch + "]");
            command.call();
            WebSocketService.send("更新v5分支[" + v5Branch + "]最新代码");
            git.pull().setCredentialsProvider(credentialsProvider).call();
        } catch (Exception e) {
            e.printStackTrace();
            String branchTmp = v5Branch;
            boolean strikeThrough = v5Branch.contains("-");
            boolean underline = v5Branch.contains("_");
            if (strikeThrough) {
                v5Branch = v5Branch.replace("-", "_");
            } else if (underline) {
                v5Branch = v5Branch.replace("_", "-");
            }

            WebSocketService.send("更新v5分支[" + branchTmp + "]最新代码失败，尝试切换到v5分支[" + v5Branch + "]");
            command = git.checkout().setName(v5Branch);
            if (!localHasBranch(git, v5Branch)) {
                command = command.setCreateBranch(true);
            }
            command.call();
            WebSocketService.send("切换并更新v5分支[" + v5Branch + "]最新代码");
            git.pull().setCredentialsProvider(credentialsProvider).call();
        }

        String tmpBranch = UUID.randomUUID().toString();
        git.branchCreate().setName(tmpBranch).call();
        git.checkout().setName(tmpBranch).call();
        git.add().addFilepattern(".").call();
        git.commit().setMessage("merge tmp commit").call();
        WebSocketService.send("创建并切换到本地临时分支：" + tmpBranch + "");
        Repository repository = git.getRepository();
        Ref ref = repository.findRef(v4Branch);
        WebSocketService.send("开始合并v4分支[" + v4Branch + "]到本地临时分支");
        MergeResult result = git.merge().include(v4Branch, ref.getObjectId()).call();
        MergeResult.MergeStatus mergeStatus = result.getMergeStatus();
        WebSocketService.send("v4分支[" + v4Branch + "]合并到本地临时分支：【" + (mergeStatus.isSuccessful() ? "成功" : "失败") + "】");
        List<String> conflictFiles = null;
        if (!mergeStatus.isSuccessful()) {
            WebSocketService.send("合并过程中，出现冲突的文件：");
            Map<String, int[][]> conflicts = result.getConflicts();
            conflictFiles = new ArrayList<>(conflicts.keySet());
            conflictFiles.forEach(LOG::info);
            WebSocketService.send("回滚临时分支上的冲突文件");
            git.revert().call();
        }

        WebSocketService.send("切换到v5分支[" + v5Branch + "]");
        git.checkout().setName(v5Branch).call();
        WebSocketService.send("删除本地临时分支：" + tmpBranch + "");
        git.branchDelete().setBranchNames("refs/heads/" + tmpBranch).setForce(true).call();
        if (!mergeStatus.isSuccessful()) {
            return conflictFiles;
        }

        WebSocketService.send("开始合并v4分支[" + v4Branch + "]到v5分支[" + v5Branch + "]");
        result = git.merge().include(v4Branch, ref.getObjectId()).call();
        mergeStatus = result.getMergeStatus();
        WebSocketService.send("v4分支合并到v5分支：【" + (mergeStatus.isSuccessful() ? "成功" : "失败") + "】");
        WebSocketService.send("推送v5分支[" + v5Branch + "]合并的代码到远程分支");
        git.push().setCredentialsProvider(credentialsProvider).call();
        WebSocketService.send("代码推送远程成功");
        return conflictFiles;
    }

    private boolean localHasBranch(Git git, String branchName) {
        try {
            List<Ref> list = git.branchList().call();
            for (Ref ref : list) {
                String name = ref.getName();
                name = name.replace("refs/heads/", "");
                if (name.equals(branchName)) {
                    return true;
                }
            }
        } catch (GitAPIException e) {
            e.printStackTrace();
        }

        return false;
    }

    private boolean initGitRepertory(String appCode) {
        WebSocketService.send("初始化 [" + appCode + "] 本地代码仓库");
        String middleDir = getMiddleDir(appCode);
        String codeDir = gitConfig.getDir();
        String path = codeDir + middleDir + File.separator + appCode;
        WebSocketService.send("本地代码仓库位置：" + path + "");
        File file = new File(path);
        if (file.exists()) {
            WebSocketService.send("本地代码仓库已存在");
            return true;
        }

        file.mkdirs();
        String gitUrl = gitConfig.getUrl() + appCode + Constants.GIT_URL_SUFFIX;
        WebSocketService.send("远程代码仓库位置：" + gitUrl + "");
        try {
            Git.cloneRepository().
                    setURI(gitUrl).
                    setDirectory(file).
                    setCredentialsProvider(gitConfig.getCredentialsProvider()).call();
            WebSocketService.send("本地代码仓库克隆成功");
            return true;
        } catch (GitAPIException e) {
            e.printStackTrace();
            WebSocketService.send("本地代码仓库克隆失败");
            WebSocketService.send(e.getMessage());
            return false;
        }
    }

    private String getMiddleDir(String appCode) {
        String middleDir = appCode;
        if (appCode.startsWith("app")|| "tam".equals(appCode)|| "mto".equals(appCode)) {
            middleDir = "app";
        } else if (appCode.startsWith("paas")) {
            middleDir = "paas";
        }

        return middleDir;
    }

    @RequestMapping("/mergeAll")
    private JsonResult mergeAll(String id) {
        List<MergeDetail> detailList = mergeDetailRepository.findByMergeIdOrderByLastModifyTimeDesc(id);
        if (CollectionUtils.isEmpty(detailList)) {
            return new JsonResult(false, "DETAIL_NOT_EXIST");
        }

        for (Iterator<MergeDetail> iterator = detailList.iterator(); iterator.hasNext(); ) {
            MergeDetail detail = iterator.next();
            String mergeStatus = detail.getMergeStatus();
            if (Constants.MERGE_STATUS_FINISHED.equals(mergeStatus)
                    || Constants.MERGE_STATUS_MERGING.equals(mergeStatus)) {
                iterator.remove();
            }
        }

        if (CollectionUtils.isEmpty(detailList)) {
            return new JsonResult(false, "MERGING_OR_FINISHED");
        }

        THREAD_POOL.execute(() -> {
            for (MergeDetail mergeDetail : detailList) {
                try {
                    mergeApp(mergeDetail);
                } catch (Exception e) {
                    e.printStackTrace();
                    WebSocketService.send("应用[" + mergeDetail.getAppCode() + "] 合并失败！" + e.getMessage());
                }
            }
        });

        return new JsonResult();
    }

    @RequestMapping("/packageAll")
    private JsonResult packageAll(String id) {
        List<MergeDetail> detailList = mergeDetailRepository.findByMergeIdOrderByLastModifyTimeDesc(id);
        if (CollectionUtils.isEmpty(detailList)) {
            return new JsonResult(false, "DETAIL_NOT_EXIST");
        }

        for (Iterator<MergeDetail> iterator = detailList.iterator(); iterator.hasNext(); ) {
            MergeDetail detail = iterator.next();
            String packageStatus = detail.getPackageStatus();
            if (Constants.MERGE_STATUS_FINISHED.equals(packageStatus)
                    || Constants.MERGE_STATUS_PACKAGING.equals(packageStatus)) {
                iterator.remove();
            }
        }

        if (CollectionUtils.isEmpty(detailList)) {
            return new JsonResult(false, "PACKAGING_OR_FINISHED");
        }

        THREAD_POOL.execute(() -> {
            int packageCount = 0;
            for (MergeDetail mergeDetail : detailList) {
                try {
                    if (packageApp(mergeDetail)) {
                        packageCount++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    WebSocketService.send("应用[" + mergeDetail.getAppCode() + "] 打包失败！" + e.getMessage());
                }
            }
            WebSocketService.send("------>>应用打包完成<<------");
            WebSocketService.send(packageCount + "个应用打包成功");
            WebSocketService.send((detailList.size() - packageCount) + "个应用打包失败");
        });

        return new JsonResult();
    }

    @RequestMapping("/packageApp")
    private JsonResult packageApp(String detailId) {
        MergeDetail detail = mergeDetailRepository.findById(detailId).get();
        if (detail == null) {
            return new JsonResult(false, "DETAIL_NOT_EXIST");
        }

        String packageStatus = detail.getPackageStatus();
        if (Constants.MERGE_STATUS_FINISHED.equals(packageStatus)
                || Constants.MERGE_STATUS_PACKAGING.equals(packageStatus)) {
            return new JsonResult(false, "PACKAGING_OR_FINISHED");
        }

        THREAD_POOL.execute(() -> {
            try {
                packageApp(detail);
            } catch (Exception e) {
                e.printStackTrace();
                WebSocketService.send("应用[" + detail.getAppCode() + "] 打包失败！" + e.getMessage());
            }
        });

        return new JsonResult();
    }

    private void updatePackageStatus(MergeDetail detail, String packageStatus) {
        detail.setPackageStatus(packageStatus);
        detail.setLastModifyTime(new Date());
        mergeDetailRepository.save(detail);
    }

    private boolean packageApp(MergeDetail mergeDetail) {
        String appCode = mergeDetail.getAppCode();
        if (StringUtils.isEmpty(appCode)) {
            return false;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String middleDir = getMiddleDir(appCode);
        String codeDir = gitConfig.getDir();
        String path = codeDir + middleDir + File.separator + appCode;
        WebSocketService.send("本地代码仓库位置：" + path + "");
        InputStream in = null;
        BufferedReader reader = null;
        try {
            updatePackageStatus(mergeDetail, Constants.MERGE_STATUS_PACKAGING);
            String batPath = gitConfig.getBatPath();
            WebSocketService.send("执行命令 【" + batPath + "】");
            String command;
            String os = System.getProperty("os.name");
            if (os.toLowerCase().startsWith("win")) {
                command = "cmd /k " + batPath + " " + path;
            } else {
                command = "sh " + batPath + " " + path;
            }

            Process process = Runtime.getRuntime().exec(command);
            in = process.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in));
            String content;
            boolean failed = false;
            while ((content = reader.readLine()) != null) {
                if (!failed && (content.contains("[ERROR]") || content.contains("BUILD FAILURE"))) {
                    failed = true;
                }
                WebSocketService.send(content);
            }

            process.waitFor(60 * 2, TimeUnit.SECONDS);
            if (failed) {
                WebSocketService.send("应用[" + appCode + "]打包失败");
                updatePackageStatus(mergeDetail, Constants.MERGE_STATUS_FAILED);
                return false;
            }

            WebSocketService.send("应用[" + appCode + "]打包完成");
            updatePackageStatus(mergeDetail, Constants.MERGE_STATUS_FINISHED);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            updatePackageStatus(mergeDetail, Constants.MERGE_STATUS_FAILED);
            WebSocketService.send("应用[" + appCode + "]打包失败; " + e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }

                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
