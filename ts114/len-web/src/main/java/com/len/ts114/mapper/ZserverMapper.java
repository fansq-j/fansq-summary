package com.len.ts114.mapper;

import com.len.base.BaseMapper;
import com.len.ts114.entity.Zserver;
import com.len.ts114.entity.vo.ServerVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ZserverMapper extends BaseMapper<Zserver,String> {
    Integer delZserverByFId(long fserverId);
    List<ServerVo> getServerList(Zserver zserver);
    ServerVo getServerVoByZId(long id);
}