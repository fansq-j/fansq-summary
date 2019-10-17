package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:资费模板实例
 * @实体表  :TARIFF_TEMPLATE_INST
 */
public class TariffTemplateInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TARIFF_TEMPLATE_INST_S";

    /**
     * 资费模板实例标识
     */
    public java.lang.Long tariffTemplateInstId;

    /**
     * 资费模板标识
     */
    public java.lang.Long tariffTemplateId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 资费模板实例名称
     */
    public java.lang.String templateInstName;

    /**
     * 资费模板实例描述
     */
    public java.lang.String templateInstDesc;

    /**
     * 外部资费模板实例标识
     */
    public java.lang.Long extTariffTemplateInstId;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.tariffTemplateInstId = SeqUtils.createLongId(ID_SEQ);
         return this.tariffTemplateInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 资费模板实例名称
     */
    public void setTemplateInstName(java.lang.String templateInstName) {
        this.templateInstName = templateInstName;
    }

    /**
     * 获取 资费模板实例名称
     */
    public java.lang.String getTemplateInstName() {
        return this.templateInstName;
    }

    /**
     * 设置 资费模板实例描述
     */
    public void setTemplateInstDesc(java.lang.String templateInstDesc) {
        this.templateInstDesc = templateInstDesc;
    }

    /**
     * 获取 资费模板实例描述
     */
    public java.lang.String getTemplateInstDesc() {
        return this.templateInstDesc;
    }

    /**
     * 设置 外部资费模板实例标识
     */
    public void setExtTariffTemplateInstId(java.lang.Long extTariffTemplateInstId) {
        this.extTariffTemplateInstId = extTariffTemplateInstId;
    }

    /**
     * 获取 外部资费模板实例标识
     */
    public java.lang.Long getExtTariffTemplateInstId() {
        return this.extTariffTemplateInstId;
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
