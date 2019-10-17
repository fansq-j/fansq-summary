package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录资费模板标签关系
 * @实体表  :TEMPLATE_LABEL_REL
 */
public class TemplateLabelRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_LABEL_REL_S";

    /**
     * 资费模板标签关系标识
     */
    public java.lang.Integer templateLabelRelId;

    /**
     * 模板标签标识
     */
    public java.lang.Integer templateLabelId;

    /**
     * 资费模板标识
     */
    public java.lang.Long tariffTemplateId;

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
     * 设置 资费模板标签关系标识
     */
    public void setTemplateLabelRelId(java.lang.Integer templateLabelRelId) {
        this.templateLabelRelId = templateLabelRelId;
    }

    /**
     * 获取 资费模板标签关系标识
     */
    public java.lang.Integer getTemplateLabelRelId() {
        return this.templateLabelRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.templateLabelRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.templateLabelRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 模板标签标识
     */
    public void setTemplateLabelId(java.lang.Integer templateLabelId) {
        this.templateLabelId = templateLabelId;
    }

    /**
     * 获取 模板标签标识
     */
    public java.lang.Integer getTemplateLabelId() {
        return this.templateLabelId;
    }

    /**
     * 设置 资费模板标识
     */
    public void setTariffTemplateId(java.lang.Long tariffTemplateId) {
        this.tariffTemplateId = tariffTemplateId;
    }

    /**
     * 获取 资费模板标识
     */
    public java.lang.Long getTariffTemplateId() {
        return this.tariffTemplateId;
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
