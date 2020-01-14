package com.len.ts114.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;

import com.len.exception.MyException;
import com.len.ts114.entity.Fserver;
import com.len.ts114.mapper.FserverMapper;
import com.len.ts114.mapper.ZserverMapper;
import com.len.ts114.service.FserverService;
import com.len.util.BeanUtil;
import com.len.util.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FserverServiceImpl extends BaseServiceImpl<Fserver, String> implements FserverService {
    @Autowired
    FserverMapper fserveMapper;
    @Autowired
    ZserverMapper zserverMapper;
    /**
     * 添加父类服务
     * @param fserver
     * @return
     */
    @Override
    public JsonUtil addFserver(Fserver fserver) {
        JsonUtil j = new JsonUtil();
        if (fserver.getServerName() == null && fserver.getServerName().equals("")) {

            return JsonUtil.error("父类服务名称不能为空");

        }
        if (fserveMapper.checkFserver(fserver) !=null && fserveMapper.checkFserver(fserver).size()>0 ){
            return JsonUtil.error("服务类型已存在");
        }
        try {
            fserver.setCreateTime(new Date());
            insertSelective(fserver);
            j.setMsg("添加成功");
            j.setFlag(true);
        } catch (MyException e) {
            j.setMsg("添加失败");
            j.setFlag(false);
        }
        return j;
    }

    @Override
    public JsonUtil checkFserver(Fserver fserver) {
        JsonUtil j = new JsonUtil();
        j.setFlag(Boolean.FALSE);
        if (StringUtils.isEmpty(fserver.getServerName())) {
            j.setMsg("获取数据失败");
            return j;
        }
        List<Fserver> row= fserveMapper.checkFserver(fserver);
        if (row!=null && row.size()>0) {
            j.setMsg("服务名称已存在");
            return j;
        }
        j.setFlag(true);
        return j;
    }

    @Override
    public JsonUtil updateFserver(Fserver fserver) {
        JsonUtil j = new JsonUtil();
        if (fserver == null) {
            return JsonUtil.error("获取数据失败");
        }
        System.out.println(fserveMapper.checkFserver(fserver));
        if (fserveMapper.checkFserver(fserver) !=null && fserveMapper.checkFserver(fserver).size()>0 ){
            return JsonUtil.error("服务类型已存在");
        }
        try {
            Fserver oldFserver = fserveMapper.selectByPrimaryKey(fserver.getId());
            BeanUtil.copyNotNullBean(fserver,oldFserver);
            updateByPrimaryKeySelective(oldFserver);
            j.setFlag(true);
            j.setMsg("修改成功");
        } catch (MyException e) {
            j.setMsg("修改失败");
            j.setFlag(false);
        }

        return j;
    }

    @Override
    public JsonUtil delFserver(Long id) {
        JsonUtil j = new JsonUtil();
        try {

            Integer row = fserveMapper.deleteByPrimaryKey(id);
            if (row >0) {
                zserverMapper.delZserverByFId(id);
                j.setFlag(true);
                j.setMsg("删除成功");

            }else {
                j.setMsg("删除失败");
                j.setFlag(false);
            }
        } catch (MyException e){
            j.setMsg("删除失败");
            j.setFlag(false);
        }

        return j;
    }

    @Override
    public BaseMapper<Fserver, String> getMappser() {
        return fserveMapper;
    }
}
