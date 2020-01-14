package com.len.ts114.service;

import com.len.base.BaseService;
import com.len.ts114.entity.Zserver;
import com.len.ts114.entity.vo.ServerVo;
import com.len.util.JsonUtil;
import com.len.util.ReType;

public interface ZserverService extends BaseService<Zserver, String> {
    ReType getServerVo(Zserver zserver, Integer page, Integer limit);

    ServerVo getServerVoByZId(long id);
    JsonUtil updateZserver(Zserver zserver);
}
