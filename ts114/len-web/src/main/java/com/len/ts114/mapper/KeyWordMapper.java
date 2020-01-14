package com.len.ts114.mapper;

import com.len.base.BaseMapper;
import com.len.ts114.entity.KeyWord;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface KeyWordMapper extends BaseMapper<KeyWord,String> {
    /**
     * 根据公司id查询关键字列表
     * @param enterpeiseId
     * @return
     */
    List<KeyWord> findKeywordByEnterprise(long enterpeiseId);
}