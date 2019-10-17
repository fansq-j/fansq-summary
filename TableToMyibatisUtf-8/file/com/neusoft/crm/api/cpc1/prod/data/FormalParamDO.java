package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:形参
 * @实体表  :FORMAL_PARAM
 */
public class FormalParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FORMAL_PARAM_S";

    /**
     * 主键
     */
    public java.lang.Long formalParamId;

    /**
     * 用于唯一标识表达式模版的内部编号
     */
    public java.lang.Long expressTemplateId;

    /**
     * 形参的名称
     */
    public java.lang.String formalParamName;

    /**
     * 形参的代码
     */
    public java.lang.String formalParamCode;

    /**
     * 设置 主键
     */
    public void setFormalParamId(java.lang.Long formalParamId) {
        this.formalParamId = formalParamId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getFormalParamId() {
        return this.formalParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.formalParamId = SeqUtils.createLongId(ID_SEQ);
         return this.formalParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 用于唯一标识表达式模版的内部编号
     */
    public void setExpressTemplateId(java.lang.Long expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    /**
     * 获取 用于唯一标识表达式模版的内部编号
     */
    public java.lang.Long getExpressTemplateId() {
        return this.expressTemplateId;
    }

    /**
     * 设置 形参的名称
     */
    public void setFormalParamName(java.lang.String formalParamName) {
        this.formalParamName = formalParamName;
    }

    /**
     * 获取 形参的名称
     */
    public java.lang.String getFormalParamName() {
        return this.formalParamName;
    }

    /**
     * 设置 形参的代码
     */
    public void setFormalParamCode(java.lang.String formalParamCode) {
        this.formalParamCode = formalParamCode;
    }

    /**
     * 获取 形参的代码
     */
    public java.lang.String getFormalParamCode() {
        return this.formalParamCode;
    }

}
