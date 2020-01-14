package com.len.ts114_client.service;

import com.len.ts114.entity.KeyWord;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface ClientQueryBiz {

    List<Map> findFatherServerClient();
    List<Map> findSunServerClient();
    List<Map> findKeyWordRes();
    List<Map> findServerClientRes(String keyword, Long gsxx_id, Long num);
    Integer updateKeyWordHeat(KeyWord keyWord);

}
