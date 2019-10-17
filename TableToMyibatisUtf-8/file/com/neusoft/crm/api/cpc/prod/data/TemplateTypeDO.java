package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:资费模板类型，如计费模板、结算模板、信控模板、提醒模板。
模板下又可以分类，如计费模板下有月租费模板、套餐免
 * @实体表  :TEMPLATE_TYPE
 */
public class TemplateTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_TYPE_S";

    /**
     * 模板类型标识
     */
    public java.lang.Integer templateTypeId;

    /**
     * 父模板类型标识
     */
    public java.lang.Integer upTemplateTypeId;

    /**
     * 
     */
    public java.lang.String templateTypeCode;

    /**
     * 模板类型名称
     */
    public java.lang.String typeName;

    /**
     * 模板类型描述
     */
    public java.lang.String typeDesc;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date stateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 模板类型标识
     */
    public void setTemplateTypeId(java.lang.Integer templateTypeId) {
        this.templateTypeId = templateTypeId;
    }

    /**
     * 获取 模板类型标识
     */
    public java.lang.Integer getTemplateTypeId() {
        return this.templateTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.templateTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.templateTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 父模板类型标识
     */
    public void setUpTemplateTypeId(java.lang.Integer upTemplateTypeId) {
        this.upTemplateTypeId = upTemplateTypeId;
    }

    /**
     * 获取 父模板类型标识
     */
    public java.lang.Integer getUpTemplateTypeId() {
        return this.upTemplateTypeId;
    }

    /**
     * 设置 
     */
    public void setTemplateTypeCode(java.lang.String templateTypeCode) {
        this.templateTypeCode = templateTypeCode;
    }

    /**
     * 获取 
     */
    public java.lang.String getTemplateTypeCode() {
        return this.templateTypeCode;
    }

    /**
     * 设置 模板类型名称
     */
    public void setTypeName(java.lang.String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取 模板类型名称
     */
    public java.lang.String getTypeName() {
        return this.typeName;
    }

    /**
     * 设置 模板类型描述
     */
    public void setTypeDesc(java.lang.String typeDesc) {
        this.typeDesc = typeDesc;
    }

    /**
     * 获取 模板类型描述
     */
    public java.lang.String getTypeDesc() {
        return this.typeDesc;
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
     * 设置 修改时间
     */
    public void setStateDate(java.util.Date stateDate) {
        this.stateDate = stateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getStateDate() {
        return this.stateDate;
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

}
