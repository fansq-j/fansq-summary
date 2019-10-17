package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:模板参数定义
 * @实体表  :TEMPLATE_PARAMETER
 */
public class TemplateParameterDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_PARAMETER_S";

    /**
     * 模板参数标识
     */
    public java.lang.Long templateParamId;

    /**
     * 模板参数类型标识
     */
    public java.lang.Integer templateParamTypeId;

    /**
     * 
     */
    public java.lang.String templateParamNbr;

    /**
     * 参数描述
     */
    public java.lang.String parameterDesc;

    /**
     * 默认值，如果套餐配置时未传递该参数，则该参数默认填写本字段取值
     */
    public java.lang.String defaultValue;

    /**
     * 指定参数取值类型，如整型，浮点型，字符型，枚举值  
     */
    public java.lang.Long valueTypeId;

    /**
     * 参数名称
     */
    public java.lang.String parameterName;

    /**
     * 外部模板参数标识
     */
    public java.lang.Long extTemplateParamId;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 是否显示
     */
    public java.lang.Integer ifDisplay;

    /**
     * 设置 模板参数标识
     */
    public void setTemplateParamId(java.lang.Long templateParamId) {
        this.templateParamId = templateParamId;
    }

    /**
     * 获取 模板参数标识
     */
    public java.lang.Long getTemplateParamId() {
        return this.templateParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.templateParamId = SeqUtils.createLongId(ID_SEQ);
         return this.templateParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 模板参数类型标识
     */
    public void setTemplateParamTypeId(java.lang.Integer templateParamTypeId) {
        this.templateParamTypeId = templateParamTypeId;
    }

    /**
     * 获取 模板参数类型标识
     */
    public java.lang.Integer getTemplateParamTypeId() {
        return this.templateParamTypeId;
    }

    /**
     * 设置 
     */
    public void setTemplateParamNbr(java.lang.String templateParamNbr) {
        this.templateParamNbr = templateParamNbr;
    }

    /**
     * 获取 
     */
    public java.lang.String getTemplateParamNbr() {
        return this.templateParamNbr;
    }

    /**
     * 设置 参数描述
     */
    public void setParameterDesc(java.lang.String parameterDesc) {
        this.parameterDesc = parameterDesc;
    }

    /**
     * 获取 参数描述
     */
    public java.lang.String getParameterDesc() {
        return this.parameterDesc;
    }

    /**
     * 设置 默认值，如果套餐配置时未传递该参数，则该参数默认填写本字段取值
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 默认值，如果套餐配置时未传递该参数，则该参数默认填写本字段取值
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 指定参数取值类型，如整型，浮点型，字符型，枚举值  
     */
    public void setValueTypeId(java.lang.Long valueTypeId) {
        this.valueTypeId = valueTypeId;
    }

    /**
     * 获取 指定参数取值类型，如整型，浮点型，字符型，枚举值  
     */
    public java.lang.Long getValueTypeId() {
        return this.valueTypeId;
    }

    /**
     * 设置 参数名称
     */
    public void setParameterName(java.lang.String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * 获取 参数名称
     */
    public java.lang.String getParameterName() {
        return this.parameterName;
    }

    /**
     * 设置 外部模板参数标识
     */
    public void setExtTemplateParamId(java.lang.Long extTemplateParamId) {
        this.extTemplateParamId = extTemplateParamId;
    }

    /**
     * 获取 外部模板参数标识
     */
    public java.lang.Long getExtTemplateParamId() {
        return this.extTemplateParamId;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 是否显示
     */
    public void setIfDisplay(java.lang.Integer ifDisplay) {
        this.ifDisplay = ifDisplay;
    }

    /**
     * 获取 是否显示
     */
    public java.lang.Integer getIfDisplay() {
        return this.ifDisplay;
    }

}
