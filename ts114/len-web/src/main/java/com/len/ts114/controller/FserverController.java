package com.len.ts114.controller;

import com.len.core.annotation.Log;
import com.len.ts114.entity.Fserver;
import com.len.ts114.service.FserverService;
import com.len.util.JsonUtil;
import com.len.util.ReType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("fserver")
@Api(value = "父类服务管理",description="父类服务业务处理")
public class FserverController {
    @Autowired
    FserverService fserverService;
    @GetMapping("/showAddFserver")
    public String showAddFserver() {
        return "system/fserver/add-fserver";
    }
    @GetMapping("/showFserver")
    public String showFserverList() {
        return "system/fserver/fserverList";
    }
    @GetMapping("/showUpdateFserver")
    public String showUpdateFserver(Long id, Model model, boolean detail) {
        Fserver fserver = fserverService.selectByPrimaryKey(id);
        model.addAttribute("fserver",fserver);
        model.addAttribute("detail",detail);
        return "system/fserver/update-fserver";
    }
    /**
     * 添加父类服务
     * @param fserver 父类服务类型
     * @return
     */
    @ApiOperation(value = "/addFserver", httpMethod = "POST", notes = "添加父类服务")
    @Log(desc = "添加父类服务")
    @PostMapping("/addFserver")
    @ResponseBody
    public JsonUtil addFserver(Fserver fserver){
        return fserverService.addFserver(fserver);
    }
  /*  @ApiOperation(value = "/showFserverList", httpMethod = "GET", notes = "展示父类服务")
    @Log(desc = "展示父类服务")*/
    @GetMapping("/showFserverList")
    @ResponseBody
    @RequiresPermissions("fserver:show")
    public ReType showFserverList(Fserver fserver, String page, String limit) {
        return fserverService.show(fserver, Integer.valueOf(page), Integer.valueOf(limit));
    }

    /**
     * 验证服务类型是否存在
     * @param
     * @return
     */
    @GetMapping(value = "checkFserver")
    @ResponseBody
    public JsonUtil checkFserver(Fserver fserver) {
       return fserverService.checkFserver(fserver);
    }
    @ApiOperation(value = "/updateFserver", httpMethod = "POST", notes="修改父类服务类型")
    @Log(desc = "修改父类服务类型")
    @RequestMapping("/updateFserver")
    @ResponseBody
    @RequiresPermissions("fserver:update")
    public JsonUtil updateFserver(Fserver fserver) {
        return fserverService.updateFserver(fserver);
    }
    @Log(desc = "删除父类服务", type = Log.LOG_TYPE.DEL)
    @ApiOperation(value = "/del", httpMethod = "POST", notes = "删除父类服务")
    @PostMapping(value = "del")
    @ResponseBody
    @RequiresPermissions("fserver:del")
    public JsonUtil delFserver(long id) {
        return fserverService.delFserver(id);
    }
}
