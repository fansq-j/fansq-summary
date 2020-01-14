package com.len.ts114_client.controller;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.len.ts114.entity.EnterpriseInformation;
import com.len.ts114.entity.KeyWord;
import com.len.ts114.service.EnterpriseInformationService;
import com.len.ts114_client.service.ClientQueryBiz;
import com.len.ts114_client.util.FileUtils;
import com.len.ts114_client.util.shangchuan;
import com.len.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class IndexController {
    @Autowired
    EnterpriseInformationService enterpriseInformationService;
    @Autowired
    ClientQueryBiz clientQueryBiz;

    /**
     * 首页
     *
     * @param model
     * @return 首页
     */
    @GetMapping("IndexLista")
    public String IndexList(Model model) {
        List<Map> findfatherserverClient = clientQueryBiz.findFatherServerClient();
        List<Map> sunserverClient = clientQueryBiz.findSunServerClient();
        List<Map> findKeyWordRes = clientQueryBiz.findKeyWordRes();
        model.addAttribute("findfatherserverClient", findfatherserverClient);
        model.addAttribute("sunserverClient", sunserverClient);
        model.addAttribute("findKeyWordRes", findKeyWordRes);
        return "/client_ftl/interface/indexList";
    }

    /**
     * 分类查询结果
     *
     * @param model
     * @param keyword 关键字
     * @param gsxx_id 公司ID
     * @return 查询结果页
     */
    @GetMapping("IndexListRes")
    public String IndexListRes(Model model, String keyword, Long gsxx_id, Long num) {
        num = new Long(0);
        List<Map> serverClientRes = clientQueryBiz.findServerClientRes(keyword, gsxx_id, num);
        List<Map> findKeyWordRes = clientQueryBiz.findKeyWordRes();
        KeyWord key = new KeyWord();
        if (serverClientRes != null && serverClientRes.size() != 0) {
            for (Map map1 : findKeyWordRes) {
                for (Map map : serverClientRes) {
                    if (map1.get("name").equals(map.get("gjz_name"))) {
                        key.setName((String) map1.get("name"));
                        Long h = (Long) map1.get("heat");
                        h++;
                        key.setHeat(h);
                        clientQueryBiz.updateKeyWordHeat(key);
                    }
                }
            }
        }
        model.addAttribute("keyword", keyword);
        model.addAttribute("serverClientRes", serverClientRes);
        model.addAttribute("findKeyWordRes", findKeyWordRes);
        return "/client_ftl/interface/indexListRes";
    }

    /**
     * 公司详情信息
     *
     * @param model
     * @param keyword 关键字
     * @param gsxx_id 公司ID
     * @return 公司详情页
     */
    @GetMapping("CompanyDetails")
    public String CompanyDetails(Model model, String keyword, Long gsxx_id, Long num) {
        List<Map> serverClientRes = clientQueryBiz.findServerClientRes(keyword, gsxx_id, num);
        List<Map> findKeyWordRes = clientQueryBiz.findKeyWordRes();
        model.addAttribute("findKeyWordRes", findKeyWordRes);
        model.addAttribute("serverClientRes", serverClientRes);
        return "/client_ftl/interface/companyDetailss";
    }

    /**
     * 搜索结果
     *
     * @param model
     * @param keyword 关键字
     * @param gsxx_id 公司ID
     * @return 首页（数据覆盖）
     */
    @ResponseBody
    @GetMapping("IndexListRess")
    public List<Map> IndexListRess(Model model, String keyword, Long gsxx_id, Long num) {
        List<Map> serverClientRes = clientQueryBiz.findServerClientRes(keyword, gsxx_id, num);
        List<Map> findKeyWordRes = clientQueryBiz.findKeyWordRes();
        KeyWord key = new KeyWord();
        if (serverClientRes != null && serverClientRes.size() != 0) {
            for (Map map1 : findKeyWordRes) {
                for (Map map : serverClientRes) {
                    if (map1.get("name").equals(map.get("gjz_name"))) {
                        key.setName((String) map1.get("name"));
                        Long h = (Long) map1.get("heat");
                        h++;
                        key.setHeat(h);
                        clientQueryBiz.updateKeyWordHeat(key);
                    }
                }
            }
        }
        return serverClientRes;
    }

    @Value("${web.upload-path}")
    private String uploadDir;
    /*@Value("${web.localhost}")
    private String localhost;*/

    /**
     * 录入公司
     *
     * @param enterpriseInformation 公司实体类
     * @param keywords              关键字数组
     * @return 公司详情页
     */
    @ResponseBody
    @RequestMapping(value = "/addEnterprise", method = RequestMethod.POST)
    public JsonUtil addEnterprise(MultipartFile file,EnterpriseInformation enterpriseInformation, String[] keywords) {

        String filename = null;
        try {
            filename = shangchuan.upload(file, uploadDir, file.getOriginalFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }

        enterpriseInformation.setState((byte) 1);
        enterpriseInformation.setLicense(filename);
        JsonUtil jsonUtil = enterpriseInformationService.addEnterprise(enterpriseInformation, keywords);
        return jsonUtil;
    }

    /**
     * 跳转
     *
     * @return 添加页面
     */
    @GetMapping("addCompanyTz")
    public String addCompanyTz(Model model) {
        List<Map> findKeyWordRes = clientQueryBiz.findKeyWordRes();
        model.addAttribute("findKeyWordRes", findKeyWordRes);
        return "/client_ftl/interface/addCompanys";
    }

}
