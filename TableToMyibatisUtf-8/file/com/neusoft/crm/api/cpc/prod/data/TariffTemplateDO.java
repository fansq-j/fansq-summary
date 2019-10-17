package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:资费模板定义
 * @实体表  :TARIFF_TEMPLATE
 */
public class TariffTemplateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TARIFF_TEMPLATE_S";

    /**
     * 资费模板标识
     */
    public java.lang.Long tariffTemplateId;

    /**
     * 模板类型标识
     */
    public java.lang.Integer templateTypeId;

    /**
     * 资费模板名称
     */
    public java.lang.String templateName;

    /**
     * 
     */
    public java.lang.String templateNbr;

    /**
     * 资费模板描述
     */
    public java.lang.String templateDesc;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.tariffTemplateId = SeqUtils.createLongId(ID_SEQ);
         return this.tariffTemplateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 资费模板名称
     */
    public void setTemplateName(java.lang.String templateName) {
        this.templateName = templateName;
    }

    /**
     * 获取 资费模板名称
     */
    public java.lang.String getTemplateName() {
        return this.templateName;
    }

    /**
     * 设置 
     */
    public void setTemplateNbr(java.lang.String templateNbr) {
        this.templateNbr = templateNbr;
    }

    /**
     * 获取 
     */
    public java.lang.String getTemplateNbr() {
        return this.templateNbr;
    }

    /**
     * 设置 资费模板描述
     */
    public void setTemplateDesc(java.lang.String templateDesc) {
        this.templateDesc = templateDesc;
    }

    /**
     * 获取 资费模板描述
     */
    public java.lang.String getTemplateDesc() {
        return this.templateDesc;
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
