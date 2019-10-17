package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:佣金方案，即中国电信提供给合作伙伴可订购的结算方案

 * @实体表  :SETT_OFFER
 */
public class SettOfferDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_OFFER_S";

    /**
     * 合作伙伴佣金方案标识
     */
    public java.lang.Long settOfferId;

    /**
     * 合作伙伴佣金方案名称
     */
    public java.lang.String settOfferName;

    /**
     * 合作伙伴佣金方案描述
     */
    public java.lang.String settOfferComments;

    /**
     * 定价计划标识
     */
    public java.lang.Integer pricingPlanId;

    /**
     * 优先级别取值，自定义优先级值
     */
    public java.lang.Integer priorityValue;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 佣金政策模板标识
     */
    public java.lang.Long policyTemplateId;

    /**
     * 审核状态，LOVB=PRC-C-0054
            1		未审核
            2		审核中
            3		审核成功
            4		审核失败
            
     */
    public java.lang.Integer auditState;

    /**
     * 审核状态时间
     */
    public java.util.Date auditStateDate;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 合作伙伴佣金方案标识
     */
    public void setSettOfferId(java.lang.Long settOfferId) {
        this.settOfferId = settOfferId;
    }

    /**
     * 获取 合作伙伴佣金方案标识
     */
    public java.lang.Long getSettOfferId() {
        return this.settOfferId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settOfferId = SeqUtils.createLongId(ID_SEQ);
         return this.settOfferId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 合作伙伴佣金方案名称
     */
    public void setSettOfferName(java.lang.String settOfferName) {
        this.settOfferName = settOfferName;
    }

    /**
     * 获取 合作伙伴佣金方案名称
     */
    public java.lang.String getSettOfferName() {
        return this.settOfferName;
    }

    /**
     * 设置 合作伙伴佣金方案描述
     */
    public void setSettOfferComments(java.lang.String settOfferComments) {
        this.settOfferComments = settOfferComments;
    }

    /**
     * 获取 合作伙伴佣金方案描述
     */
    public java.lang.String getSettOfferComments() {
        return this.settOfferComments;
    }

    /**
     * 设置 定价计划标识
     */
    public void setPricingPlanId(java.lang.Integer pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    /**
     * 获取 定价计划标识
     */
    public java.lang.Integer getPricingPlanId() {
        return this.pricingPlanId;
    }

    /**
     * 设置 优先级别取值，自定义优先级值
     */
    public void setPriorityValue(java.lang.Integer priorityValue) {
        this.priorityValue = priorityValue;
    }

    /**
     * 获取 优先级别取值，自定义优先级值
     */
    public java.lang.Integer getPriorityValue() {
        return this.priorityValue;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 佣金政策模板标识
     */
    public void setPolicyTemplateId(java.lang.Long policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    /**
     * 获取 佣金政策模板标识
     */
    public java.lang.Long getPolicyTemplateId() {
        return this.policyTemplateId;
    }

    /**
     * 设置 审核状态，LOVB=PRC-C-0054
            1		未审核
            2		审核中
            3		审核成功
            4		审核失败
            
     */
    public void setAuditState(java.lang.Integer auditState) {
        this.auditState = auditState;
    }

    /**
     * 获取 审核状态，LOVB=PRC-C-0054
            1		未审核
            2		审核中
            3		审核成功
            4		审核失败
            
     */
    public java.lang.Integer getAuditState() {
        return this.auditState;
    }

    /**
     * 设置 审核状态时间
     */
    public void setAuditStateDate(java.util.Date auditStateDate) {
        this.auditStateDate = auditStateDate;
    }

    /**
     * 获取 审核状态时间
     */
    public java.util.Date getAuditStateDate() {
        return this.auditStateDate;
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
