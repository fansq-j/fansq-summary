package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录销售品协议项定制的一次性或使用费信息。
 * @实体表  :OFFER_AGREE_FEE
 */
public class OfferAgreeFeeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_AGREE_FEE_S";

    /**
     * 记录协议项费用标识
     */
    public java.lang.Long offerAgreeFeeId;

    /**
     * 记录销售品协议项标识
     */
    public java.lang.Long offerAgreeId;

    /**
     * 协议项费用类型，LOVB=ARG-C-0018
     */
    public java.lang.String feeType;

    /**
     * 帐目类型标识
     */
    public java.lang.String acctItemTypeId;

    /**
     * 协议项费用优惠方式，LOVB=ARG-C-0019
     */
    public java.lang.String ratioMethdod;

    /**
     * 记录优惠额度
     */
    public java.lang.Double ratioValue;

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
     * 设置 记录协议项费用标识
     */
    public void setOfferAgreeFeeId(java.lang.Long offerAgreeFeeId) {
        this.offerAgreeFeeId = offerAgreeFeeId;
    }

    /**
     * 获取 记录协议项费用标识
     */
    public java.lang.Long getOfferAgreeFeeId() {
        return this.offerAgreeFeeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerAgreeFeeId = SeqUtils.createLongId(ID_SEQ);
         return this.offerAgreeFeeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 协议项费用类型，LOVB=ARG-C-0018
     */
    public void setFeeType(java.lang.String feeType) {
        this.feeType = feeType;
    }

    /**
     * 获取 协议项费用类型，LOVB=ARG-C-0018
     */
    public java.lang.String getFeeType() {
        return this.feeType;
    }

    /**
     * 设置 帐目类型标识
     */
    public void setAcctItemTypeId(java.lang.String acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 帐目类型标识
     */
    public java.lang.String getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 协议项费用优惠方式，LOVB=ARG-C-0019
     */
    public void setRatioMethdod(java.lang.String ratioMethdod) {
        this.ratioMethdod = ratioMethdod;
    }

    /**
     * 获取 协议项费用优惠方式，LOVB=ARG-C-0019
     */
    public java.lang.String getRatioMethdod() {
        return this.ratioMethdod;
    }

    /**
     * 设置 记录优惠额度
     */
    public void setRatioValue(java.lang.Double ratioValue) {
        this.ratioValue = ratioValue;
    }

    /**
     * 获取 记录优惠额度
     */
    public java.lang.Double getRatioValue() {
        return this.ratioValue;
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
