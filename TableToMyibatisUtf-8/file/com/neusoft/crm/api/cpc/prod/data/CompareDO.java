package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :COMPARE
 */
public class CompareDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COMPARE_S";

    /**
     * 
     */
    public java.lang.String id1;

    /**
     * 设置 
     */
    public void setId1(java.lang.String id1) {
        this.id1 = id1;
    }

    /**
     * 获取 
     */
    public java.lang.String getId1() {
        return this.id1;
    }

}
