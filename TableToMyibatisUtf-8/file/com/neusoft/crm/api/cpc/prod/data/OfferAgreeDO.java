package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是协议条款中作用的销售品规格信息。
 * @实体表  :OFFER_AGREE
 */
public class OfferAgreeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_AGREE_S";

    /**
     * 记录销售品协议项标识
     */
    public java.lang.Long offerAgreeId;

    /**
     * 记录协议标识
     */
    public java.lang.Long agreeId;

    /**
     * 协议模板主键
     */
    public java.lang.Long agreementTmpId;

    /**
     * 记录销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 记录销售品协议项标识
     */
    public void setOfferAgreeId(java.lang.Long offerAgreeId) {
        this.offerAgreeId = offerAgreeId;
    }

    /**
     * 获取 记录销售品协议项标识
     */
    public java.lang.Long getOfferAgreeId() {
        return this.offerAgreeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerAgreeId = SeqUtils.createLongId(ID_SEQ);
         return this.offerAgreeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录协议标识
     */
    public void setAgreeId(java.lang.Long agreeId) {
        this.agreeId = agreeId;
    }

    /**
     * 获取 记录协议标识
     */
    public java.lang.Long getAgreeId() {
        return this.agreeId;
    }

    /**
     * 设置 协议模板主键
     */
    public void setAgreementTmpId(java.lang.Long agreementTmpId) {
        this.agreementTmpId = agreementTmpId;
    }

    /**
     * 获取 协议模板主键
     */
    public java.lang.Long getAgreementTmpId() {
        return this.agreementTmpId;
    }

    /**
     * 设置 记录销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
