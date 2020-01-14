package com.len.ts114.mapper;

import com.len.base.BaseMapper;
import com.len.ts114.entity.Fserver;

import java.util.List;

public interface FserverMapper extends BaseMapper<Fserver,String>{
    List<Fserver> checkFserver(Fserver fserve);
}