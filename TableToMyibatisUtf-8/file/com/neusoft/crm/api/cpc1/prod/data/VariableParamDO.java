package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:变量
 * @实体表  :VARIABLE_PARAM
 */
public class VariableParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VARIABLE_PARAM_S";

    /**
     * 主键
     */
    public java.lang.Long variableParamId;

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
     * 业务对象类,代表业务对象的JAVA类的类路径
     */
    public java.lang.String objectClass;

    /**
     * 业务对象方法,代表业务对象的JAVA方法名
     */
    public java.lang.String objectMethod;

    /**
     * 对端业务对象类,代表业务对象的JAVA类的类路径
     */
    public java.lang.String correspondObjectClass;

    /**
     * 对端业务对象方法,代表业务对象的JAVA方法名
     */
    public java.lang.String correspondObjectMethod;

    /**
     * 变量类型1：输入直接获取，2：输入间接获取，3：输出参数
     */
    public java.lang.Integer variableType;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 主键
     */
    public void setVariableParamId(java.lang.Long variableParamId) {
        this.variableParamId = variableParamId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getVariableParamId() {
        return this.variableParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.variableParamId = SeqUtils.createLongId(ID_SEQ);
         return this.variableParamId;
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
     * 设置 业务对象类,代表业务对象的JAVA类的类路径
     */
    public void setObjectClass(java.lang.String objectClass) {
        this.objectClass = objectClass;
    }

    /**
     * 获取 业务对象类,代表业务对象的JAVA类的类路径
     */
    public java.lang.String getObjectClass() {
        return this.objectClass;
    }

    /**
     * 设置 业务对象方法,代表业务对象的JAVA方法名
     */
    public void setObjectMethod(java.lang.String objectMethod) {
        this.objectMethod = objectMethod;
    }

    /**
     * 获取 业务对象方法,代表业务对象的JAVA方法名
     */
    public java.lang.String getObjectMethod() {
        return this.objectMethod;
    }

    /**
     * 设置 对端业务对象类,代表业务对象的JAVA类的类路径
     */
    public void setCorrespondObjectClass(java.lang.String correspondObjectClass) {
        this.correspondObjectClass = correspondObjectClass;
    }

    /**
     * 获取 对端业务对象类,代表业务对象的JAVA类的类路径
     */
    public java.lang.String getCorrespondObjectClass() {
        return this.correspondObjectClass;
    }

    /**
     * 设置 对端业务对象方法,代表业务对象的JAVA方法名
     */
    public void setCorrespondObjectMethod(java.lang.String correspondObjectMethod) {
        this.correspondObjectMethod = correspondObjectMethod;
    }

    /**
     * 获取 对端业务对象方法,代表业务对象的JAVA方法名
     */
    public java.lang.String getCorrespondObjectMethod() {
        return this.correspondObjectMethod;
    }

    /**
     * 设置 变量类型1：输入直接获取，2：输入间接获取，3：输出参数
     */
    public void setVariableType(java.lang.Integer variableType) {
        this.variableType = variableType;
    }

    /**
     * 获取 变量类型1：输入直接获取，2：输入间接获取，3：输出参数
     */
    public java.lang.Integer getVariableType() {
        return this.variableType;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
