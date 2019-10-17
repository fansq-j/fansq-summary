package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录模板参数实例的取值。当模板参数实例中的“是否复选标识”为“复选”时，则表示该参数存在多个实例取值，在本实体中会存在
 * @实体表  :TEMPLATE_PARAM_INST_VAL
 */
public class TemplateParamInstValDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_PARAM_INST_VAL_S";

    /**
     * 模板参数实例取值标识
     */
    public java.lang.Long templateParamInstValId;

    /**
     * 
     */
    public java.lang.Long templateParamInstId;

    /**
     * 记录模板参数实例取值
     */
    public java.lang.String templateParamInstVal;

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
     * 设置 模板参数实例取值标识
     */
    public void setTemplateParamInstValId(java.lang.Long templateParamInstValId) {
        this.templateParamInstValId = templateParamInstValId;
    }

    /**
     * 获取 模板参数实例取值标识
     */
    public java.lang.Long getTemplateParamInstValId() {
        return this.templateParamInstValId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.templateParamInstValId = SeqUtils.createLongId(ID_SEQ);
         return this.templateParamInstValId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 
     */
    public void setTemplateParamInstId(java.lang.Long templateParamInstId) {
        this.templateParamInstId = templateParamInstId;
    }

    /**
     * 获取 
     */
    public java.lang.Long getTemplateParamInstId() {
        return this.templateParamInstId;
    }

    /**
     * 设置 记录模板参数实例取值
     */
    public void setTemplateParamInstVal(java.lang.String templateParamInstVal) {
        this.templateParamInstVal = templateParamInstVal;
    }

    /**
     * 获取 记录模板参数实例取值
     */
    public java.lang.String getTemplateParamInstVal() {
        return this.templateParamInstVal;
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
