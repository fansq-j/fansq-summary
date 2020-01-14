package com.len.ts114.controller;

import com.len.core.annotation.Log;
import com.len.ts114.entity.Fserver;
import com.len.ts114.entity.Zserver;
import com.len.ts114.entity.vo.ServerVo;
import com.len.ts114.service.FserverService;
import com.len.ts114.service.ZserverService;
import com.len.util.JsonUtil;
import com.len.util.ReType;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("zserver")
public class ZserverController {
    @Autowired
    ZserverService zserverService;
    @Autowired
    FserverService fserverService;
    @GetMapping("/showZserver")
    public String showZserver(){
        return "system/zserver/zserverList";
    }
    @GetMapping("/showAddZserver")
    public String showAddZserver(Model model){
        List<Fserver> fserverList = fserverService.selectAll();
        model.addAttribute("fserverList",fserverList);
        return "system/zserver/add-zserver";
    }
    @GetMapping("/showUpdateZserver")
    public String showUpdateZserver(long id, Model model){
        ServerVo serverVo = zserverService.getServerVoByZId(id);
        List<Fserver> fserverList = fserverService.selectAll();
        model.addAttribute("fserverList",fserverList);
        model.addAttribute("server",serverVo);
        return "system/zserver/update-zserver";
    }
    @RequestMapping("/showZserverList")
    @ResponseBody
    @RequiresPermissions("zserver:show")
    public ReType showZserverList(Zserver zserver, String page, String limit) {
        return zserverService.getServerVo(zserver,Integer.valueOf(page), Integer.valueOf(limit));
    }
    @RequestMapping("/updateZserver")
    @ResponseBody
    @RequiresPermissions("zserver:update")
    public JsonUtil updateZserver(Zserver zserver) {
        return zserverService.updateZserver(zserver);
    }
    @RequestMapping("/del")
    @ResponseBody
    @RequiresPermissions("zserver:del")
    public JsonUtil delZserver(long id){
        JsonUtil jsonUtil = new JsonUtil();
        Integer row = zserverService.deleteByPrimaryKey(id);
        if (row > 0 ) {
            jsonUtil.setFlag(true);
            jsonUtil.setMsg("删除成功");
        }else {
            jsonUtil.setFlag(false);
            jsonUtil.setMsg("删除失败");
        }
        return jsonUtil;
    }
    @ApiOperation(value = "/addZserver", httpMethod = "POST", notes = "添加子类服务")
    @Log(desc = "添加子类服务")
    @PostMapping("/addZserver")
    @ResponseBody
    public JsonUtil addZserver(Zserver zserver) {
        JsonUtil j = new JsonUtil();
        if (zserver == null && zserver.getSubclassName() == null){
            return JsonUtil.error("数据不能为空");
        }
        zserver.setCreateTime(new Date());
        Integer row = zserverService.insertSelective(zserver);
        if (row>0) {
            j.setMsg("添加成功");
            j.setFlag(true);
        }else {
            j.setFlag(false);
            j.setMsg("添加失败");
        }
        return j;
    }
}
