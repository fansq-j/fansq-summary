package com.len.ts114.service.impl;

import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.ts114.entity.EnterpriseInformation;
import com.len.ts114.entity.KeyWord;
import com.len.ts114.mapper.KeyWordMapper;
import com.len.ts114.service.KeywordService;
import com.len.util.JsonUtil;
import com.len.util.ReType;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KeywordServiceImpl extends BaseServiceImpl<KeyWord,String> implements KeywordService {
    @Autowired
    KeyWordMapper keyWordMapper;
    @Override
    public BaseMapper getMappser() {
        return this.getMappser();
    }


    @Override
    public List<KeyWord> findKeywordByEnterprise(long enterpriseId) {
        return keyWordMapper.findKeywordByEnterprise(enterpriseId);
    }


}
