package com.len.ts114_client.service.Impl;

import com.len.ts114.entity.KeyWord;
import com.len.ts114_client.dao.ClientQueryDao;
import com.len.ts114_client.service.ClientQueryBiz;
import com.len.ts114_client.util.shangchuan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Map;
@Service
public class ClientQueryBizImpl implements ClientQueryBiz {

    @Autowired
    ClientQueryDao clientQueryDao;

    @Override
    public List<Map> findFatherServerClient() {
        return clientQueryDao.findFatherServerClient();
    }

    @Override
    public List<Map> findSunServerClient() {
        return clientQueryDao.findSunServerClient();
    }

    @Override
    public List<Map> findKeyWordRes() {
        return clientQueryDao.findKeyWordRes();
    }

    @Override
    public List<Map> findServerClientRes(String keyword, Long gsxx_id, Long num) {
        return clientQueryDao.findServerClientRes(keyword, gsxx_id, num);
    }

    @Override
    public Integer updateKeyWordHeat(KeyWord keyWord) {
        Integer i = 0;
        if (keyWord.getName() != null && keyWord.getName() != "" && keyWord.getHeat() != null && keyWord.getHeat() != 0) {
            i = clientQueryDao.updateKeyWordHeat(keyWord);
        }
        return i;
    }

}