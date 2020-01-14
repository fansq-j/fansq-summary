package com.len.ts114_client.dao;

import com.len.base.BaseMapper;
import com.len.ts114.entity.KeyWord;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ClientQueryDao {
    List<Map> findFatherServerClient();
    List<Map> findSunServerClient();
    List<Map> findKeyWordRes();
    List<Map> findServerClientRes(@Param("keyword")String keyword, @Param("gsxx_id")Long gsxx_id,@Param("num")Long num);
    Integer updateKeyWordHeat(KeyWord keyWord);
}
