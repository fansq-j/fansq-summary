package com.study.git.controller;

import com.study.git.config.AppCodeConfig;
import com.study.git.domain.Conflict;
import com.study.git.domain.Merge;
import com.study.git.domain.MergeDetail;
import com.study.git.repository.ConflictRepository;
import com.study.git.repository.MergeDetailRepository;
import com.study.git.repository.MergeRepository;
import com.study.git.service.MergeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author TangFD@HF 2018/11/26
 */
@Controller
public class IndexController {

    @Resource
    private AppCodeConfig appCodeConfig;
    @Resource
    private MergeRepository mergeRepository;
    @Resource
    private ConflictRepository conflictRepository;
    @Resource
    private MergeDetailRepository mergeDetailRepository;
    @Resource
    private MergeService mergeService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("merge", new Merge());
        return "index";
    }

    @RequestMapping("/testApp")
    @ResponseBody
    public Map<String, Set<String>> testApp(String appCodes) {
        Set<String> appCodeList = appCodeConfig.getAppCodeList(appCodes);
        Set<String> excludeCodes = appCodeConfig.getExcludeCodes(appCodes);
        Map<String, Set<String>> appCode = new HashMap<>(2);
        appCode.put("appCode", appCodeList);
        appCode.put("exclude", excludeCodes);
        return appCode;
    }

    @RequestMapping("/addMerge")
    public String addMerge(Model model, Merge merge) {
        String appCodes = merge.getAppCodes();
        Set<String> appCodeList = appCodeConfig.getAppCodeList(appCodes);
        if (CollectionUtils.isEmpty(appCodeList)) {
            model.addAttribute("message", "INVALID_CODES");
            model.addAttribute("merge", new Merge());
            return "index";
        }

        Merge saveMerge = new Merge(appCodeList.toString());
        String v4Branch = merge.getV4Branch();
        if (StringUtils.isNotEmpty(v4Branch)) {
            saveMerge.setV4Branch(v4Branch);
        }

        String v5Branch = merge.getV5Branch();
        if (StringUtils.isNotEmpty(v5Branch)) {
            saveMerge.setV5Branch(v5Branch);
        }

        mergeService.save(saveMerge, new ArrayList<>(appCodeList));
        return "redirect:detail?id=" + saveMerge.getId();
    }

    @RequestMapping("/detail")
    public String detail(Model model, String id) {
        Merge merge = mergeRepository.findById(id).get();
        model.addAttribute("merge", merge);
        List<MergeDetail> mergeDetails = mergeDetailRepository.findByMergeIdOrderByLastModifyTimeDesc(id);
        model.addAttribute("mergeDetails", mergeDetails);
        return "detail";
    }

    @RequestMapping("/history")
    public String history(Model model) {
        List<Merge> mergeList = mergeRepository.findAll(new Sort(Sort.Direction.DESC, "lastModifyTime"));
        model.addAttribute("mergeList", mergeList);
        return "history";
    }

    @RequestMapping("/mergeLog")
    public String mergeLog() {
        return "mergeLog";
    }

    @RequestMapping("/conflict")
    public String conflict(Model model, String detailId) {
        List<Conflict> conflictList = conflictRepository.findByDetailIdOrderByCreateTimeDesc(detailId);
        model.addAttribute("conflictList", conflictList);
        MergeDetail mergeDetail = mergeDetailRepository.findById(detailId).get();
        model.addAttribute("mergeId", mergeDetail.getMergeId());
        return "conflict";
    }
}
