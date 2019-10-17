package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :COMPARE2
 */
public class Compare2DO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COMPARE2_S";

    /**
     * 
     */
    public java.lang.String id2;

    /**
     * 设置 
     */
    public void setId2(java.lang.String id2) {
        this.id2 = id2;
    }

    /**
     * 获取 
     */
    public java.lang.String getId2() {
        return this.id2;
    }

}
