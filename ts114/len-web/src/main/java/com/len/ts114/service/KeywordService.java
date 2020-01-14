package com.len.ts114.service;

import com.len.base.BaseService;
import com.len.ts114.entity.KeyWord;
import com.len.util.JsonUtil;

import java.util.List;

public interface KeywordService extends BaseService<KeyWord,String> {
    /**
     * 根据公司id查找关键字
     * @param enterpriseId
     * @return
     */
    List<KeyWord> findKeywordByEnterprise(long enterpriseId);


}
