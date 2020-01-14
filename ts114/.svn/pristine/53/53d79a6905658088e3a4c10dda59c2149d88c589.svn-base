package com.len.ts114.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.exception.MyException;
import com.len.ts114.entity.Zserver;
import com.len.ts114.entity.vo.ServerVo;
import com.len.ts114.mapper.ZserverMapper;
import com.len.ts114.service.ZserverService;
import com.len.util.BeanUtil;
import com.len.util.JsonUtil;
import com.len.util.ReType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ZserverServiceImpl extends BaseServiceImpl<Zserver, String> implements ZserverService {
    @Autowired
    ZserverMapper zserverMapper;
    @Override
    public BaseMapper<Zserver, String> getMappser() {
        return zserverMapper;
    }
    @Override
    public ReType getServerVo(Zserver zserver, Integer page, Integer limit) {
        List<ServerVo> serverVos = null;
        Page<ServerVo> tPage = PageHelper.startPage(page, limit);
        try {
            serverVos = zserverMapper.getServerList(zserver);

        } catch (MyException e) {
            log.error("class:BaseServiceImpl ->method:show->message:" + e.getMessage());
            e.printStackTrace();
        }
        return new ReType(tPage.getTotal(), serverVos);
    }

    @Override
    public ServerVo getServerVoByZId(long id) {
        return zserverMapper.getServerVoByZId(id);
    }

    @Override
    public JsonUtil updateZserver(Zserver zserver) {
        JsonUtil jsonUtil = new JsonUtil();
        if (zserver.getSubclassName()==null || zserver.getSubclassName().equals("")) {
            jsonUtil.setMsg("数据不能为空");
        }
        try {
            Zserver oldZserver = zserverMapper.selectByPrimaryKey(zserver.getId());
            BeanUtil.copyNotNullBean(zserver, oldZserver);
            updateByPrimaryKeySelective(oldZserver);
            jsonUtil.setFlag(true);
            jsonUtil.setMsg("修改成功");
        } catch (MyException e) {
            jsonUtil.setMsg("修改失败");
            jsonUtil.setFlag(false);
        }

        return jsonUtil;
    }
}
