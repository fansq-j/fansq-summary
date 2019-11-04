package com.study.git;

import org.eclipse.jgit.api.CheckoutCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.MergeResult;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.AnyObjectId;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootGitApplicationTests {

    private File client;
    private CredentialsProvider credentialsProvider;
    private static final String GIT_DIR_PATH = "H:\\testJGit\\";

    @Before
    public void init() {
        credentialsProvider = new UsernamePasswordCredentialsProvider("tangfd@foxmail.com", "tfd681312");
        client = new File(GIT_DIR_PATH);
        if (!client.exists()) {
            client.mkdirs();
        }

    }

    @Test
    public void testGit() throws Exception {
        testCloneGit();
        testMerge();
    }

    @Test
    public void testCloneGit() throws GitAPIException {
        Git git = Git.cloneRepository().setURI("https://gitee.com/tangfd/test.git").
                setDirectory(client).setCredentialsProvider(credentialsProvider).call();
        System.out.println("===========test git clone success========");
    }

    @Test
    public void testCleanGit() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        git.clean().setCleanDirectories(true).setForce(true).call();
    }

    @Test
    public void testAddFile() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
//        git.checkout().setName("v5-master").call();
        git.add().addFilepattern(".").call();
        git.commit().setMessage("commit v5 test txt").call();
        git.push().setCredentialsProvider(credentialsProvider).call();
    }

    @Test
    public void testCheckout() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        String branch = "v5-master";
        CheckoutCommand command = git.checkout().setName(branch);
        if (!localHasBranch(git, branch)) {
            command = command.setCreateBranch(true);
        }

        command.call();
        git.pull().setCredentialsProvider(credentialsProvider).call();
    }

    @Test
    public void testNewBranch() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        git.branchCreate().setName("mergeTmp").call();
        git.checkout().setName("mergeTmp").call();
    }

    @Test
    public void testCommit() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        git.commit().setMessage("merge Tmp commit").call();
    }

    @Test
    public void testDelete() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        git.branchDelete().setBranchNames("refs/heads/1d76dcc4-ea8c-416d-8def-9e0e2f21e4c5").setForce(true).call();
    }

    @Test
    public void testLocalBranch() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        List<Ref> list = git.branchList().call();
        System.out.println("==========================");
        for (Ref ref : list) {
            System.out.println(ref.getName());
        }
        System.out.println("==========================");
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

    private AnyObjectId getAnyObjectId(Git git, String branchName) {
        try {
            List<Ref> list = git.branchList().call();
            for (Ref ref : list) {
                String name = ref.getName();
                name = name.replace("refs/heads/", "");
                if (name.equals(branchName)) {
                    return ref.getObjectId();
                }
            }
        } catch (GitAPIException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 拿到当前本地分支名
     */
    @Test
    public void getCurrentBranch() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        System.out.println("======================");
        System.out.println("local current branch : " + git.getRepository().getBranch());
        System.out.println("======================");
    }

    @Test
    public void testMerge() throws Exception {
        Git git = Git.open(new File(GIT_DIR_PATH));
        String master = "master";
        CheckoutCommand command = git.checkout().setName(master);
        if (!localHasBranch(git, master)) {
            command = command.setCreateBranch(true);
        }

        System.out.println("==========checkout branch to master=============");
        command.call();
        git.pull().setCredentialsProvider(credentialsProvider).call();
        String v5Branch = "v5-master";
        command = git.checkout().setName(v5Branch);
        if (!localHasBranch(git, v5Branch)) {
            command = command.setCreateBranch(true);
        }

        System.out.println("==========checkout branch to v5-master=============");
        command.call();
        git.pull().setCredentialsProvider(credentialsProvider).call();

        String tmpBranch = UUID.randomUUID().toString();
        git.branchCreate().setName(tmpBranch).call();
        git.checkout().setName(tmpBranch).call();
        git.add().addFilepattern(".").call();
        git.commit().setMessage("merge tmp commit").call();
        System.out.println("==========checkout branch to " + tmpBranch + "=============");
        AnyObjectId anyObjectId = getAnyObjectId(git, master);
        if (anyObjectId == null) {
            return;
        }

        MergeResult result = git.merge().include(master, anyObjectId).call();
        MergeResult.MergeStatus mergeStatus = result.getMergeStatus();
        System.out.println();
        System.out.println("==========merge Status : " + mergeStatus.isSuccessful() + "=============");
        if (!mergeStatus.isSuccessful()) {
            System.out.println("==========Merge Failure files : =============");
            Map<String, int[][]> conflicts = result.getConflicts();
            conflicts.keySet().forEach(System.out::println);
            System.out.println("==========Merge Failure files : =============");
            git.add().addFilepattern(".").call();
            System.out.println("==========commit all files : =============");
            git.commit().call();
        }

        System.out.println("==========checkout branch to v5-master=============");
        git.checkout().setName(v5Branch).call();
        System.out.println("==========delete branch : " + tmpBranch + "=============");
        git.branchDelete().setBranchNames("refs/heads/" + tmpBranch).setForce(true).call();
    }
}
