package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:模板参数实例
 * @实体表  :TEMPLATE_PARAM_INST
 */
public class TemplateParamInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_PARAM_INST_S";

    /**
     * 模板参数实例
     */
    public java.lang.Long templateParamInstId;

    /**
     * 资费模板实例标识
     */
    public java.lang.Long tariffTemplateInstId;

    /**
     * 资费模板参数关系标识
     */
    public java.lang.Long templateParameterRelId;

    /**
     * PRC-C-0023
     */
    public java.lang.Integer attrFlag;

    /**
     * 参数取值
     */
    public java.lang.String paramValue;

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
     * 设置 模板参数实例
     */
    public void setTemplateParamInstId(java.lang.Long templateParamInstId) {
        this.templateParamInstId = templateParamInstId;
    }

    /**
     * 获取 模板参数实例
     */
    public java.lang.Long getTemplateParamInstId() {
        return this.templateParamInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.templateParamInstId = SeqUtils.createLongId(ID_SEQ);
         return this.templateParamInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 资费模板实例标识
     */
    public void setTariffTemplateInstId(java.lang.Long tariffTemplateInstId) {
        this.tariffTemplateInstId = tariffTemplateInstId;
    }

    /**
     * 获取 资费模板实例标识
     */
    public java.lang.Long getTariffTemplateInstId() {
        return this.tariffTemplateInstId;
    }

    /**
     * 设置 资费模板参数关系标识
     */
    public void setTemplateParameterRelId(java.lang.Long templateParameterRelId) {
        this.templateParameterRelId = templateParameterRelId;
    }

    /**
     * 获取 资费模板参数关系标识
     */
    public java.lang.Long getTemplateParameterRelId() {
        return this.templateParameterRelId;
    }

    /**
     * 设置 PRC-C-0023
     */
    public void setAttrFlag(java.lang.Integer attrFlag) {
        this.attrFlag = attrFlag;
    }

    /**
     * 获取 PRC-C-0023
     */
    public java.lang.Integer getAttrFlag() {
        return this.attrFlag;
    }

    /**
     * 设置 参数取值
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }

    /**
     * 获取 参数取值
     */
    public java.lang.String getParamValue() {
        return this.paramValue;
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

}
