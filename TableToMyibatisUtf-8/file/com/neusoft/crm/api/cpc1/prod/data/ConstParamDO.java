package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:常量
 * @实体表  :CONST_PARAM
 */
public class ConstParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONST_PARAM_S";

    /**
     * 主键
     */
    public java.lang.Long constParamId;

    /**
     * 用于唯一标识表达式的内部编号
     */
    public java.lang.Long expressId;

    /**
     * 用于唯一标识形参的内部编号
     */
    public java.lang.Long formalParamId;

    /**
     * 用于唯一标识属性的内部编号
     */
    public java.lang.Long propertyId;

    /**
     * 取值
     */
    public java.lang.String value;

    /**
     * 设置 主键
     */
    public void setConstParamId(java.lang.Long constParamId) {
        this.constParamId = constParamId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getConstParamId() {
        return this.constParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.constParamId = SeqUtils.createLongId(ID_SEQ);
         return this.constParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 用于唯一标识表达式的内部编号
     */
    public void setExpressId(java.lang.Long expressId) {
        this.expressId = expressId;
    }

    /**
     * 获取 用于唯一标识表达式的内部编号
     */
    public java.lang.Long getExpressId() {
        return this.expressId;
    }

    /**
     * 设置 用于唯一标识形参的内部编号
     */
    public void setFormalParamId(java.lang.Long formalParamId) {
        this.formalParamId = formalParamId;
    }

    /**
     * 获取 用于唯一标识形参的内部编号
     */
    public java.lang.Long getFormalParamId() {
        return this.formalParamId;
    }

    /**
     * 设置 用于唯一标识属性的内部编号
     */
    public void setPropertyId(java.lang.Long propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * 获取 用于唯一标识属性的内部编号
     */
    public java.lang.Long getPropertyId() {
        return this.propertyId;
    }

    /**
     * 设置 取值
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    /**
     * 获取 取值
     */
    public java.lang.String getValue() {
        return this.value;
    }

}
