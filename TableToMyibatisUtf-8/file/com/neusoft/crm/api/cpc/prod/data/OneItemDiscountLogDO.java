package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述了一次性费用手工优惠和营业前台对一次性费用减免的记录，含审批人员、审批时间、减免原因、减免金额等信息。
 * @实体表  :ONE_ITEM_DISCOUNT_LOG
 */
public class OneItemDiscountLogDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ONE_ITEM_DISCOUNT_LOG_S";

    /**
     * 一次性费用优惠标识
     */
    public java.lang.Long oneChargeDiscountId;

    /**
     * 关联一次性费用表帐目标识
     */
    public java.lang.Long oneAcctItemId;

    /**
     * 客户订单编码
     */
    public java.lang.String custOrderNbr;

    /**
     * 订单项标识
     */
    public java.lang.Long orderItemId;

    /**
     * 帐户标识
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 销售品实例标识
     */
    public java.lang.Long offerInstId;

    /**
     * 优惠金额{（单位：厘）}
     */
    public java.lang.Long discount;

    /**
     * 记录批准人。
     */
    public java.lang.Long agreeStaffId;

    /**
     * 记录批准序号。
     */
    public java.lang.Long agreeSeq;

    /**
     * 记录批准人部门。
     */
    public java.lang.String agreeDeptNo;

    /**
     * 调整原因
     */
    public java.lang.String adjustReason;

    /**
     * 记录状态 。 LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 设置 一次性费用优惠标识
     */
    public void setOneChargeDiscountId(java.lang.Long oneChargeDiscountId) {
        this.oneChargeDiscountId = oneChargeDiscountId;
    }

    /**
     * 获取 一次性费用优惠标识
     */
    public java.lang.Long getOneChargeDiscountId() {
        return this.oneChargeDiscountId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.oneChargeDiscountId = SeqUtils.createLongId(ID_SEQ);
         return this.oneChargeDiscountId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 关联一次性费用表帐目标识
     */
    public void setOneAcctItemId(java.lang.Long oneAcctItemId) {
        this.oneAcctItemId = oneAcctItemId;
    }

    /**
     * 获取 关联一次性费用表帐目标识
     */
    public java.lang.Long getOneAcctItemId() {
        return this.oneAcctItemId;
    }

    /**
     * 设置 客户订单编码
     */
    public void setCustOrderNbr(java.lang.String custOrderNbr) {
        this.custOrderNbr = custOrderNbr;
    }

    /**
     * 获取 客户订单编码
     */
    public java.lang.String getCustOrderNbr() {
        return this.custOrderNbr;
    }

    /**
     * 设置 订单项标识
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 订单项标识
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 帐户标识
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 产品实例标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 销售品实例标识
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 销售品实例标识
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 优惠金额{（单位：厘）}
     */
    public void setDiscount(java.lang.Long discount) {
        this.discount = discount;
    }

    /**
     * 获取 优惠金额{（单位：厘）}
     */
    public java.lang.Long getDiscount() {
        return this.discount;
    }

    /**
     * 设置 记录批准人。
     */
    public void setAgreeStaffId(java.lang.Long agreeStaffId) {
        this.agreeStaffId = agreeStaffId;
    }

    /**
     * 获取 记录批准人。
     */
    public java.lang.Long getAgreeStaffId() {
        return this.agreeStaffId;
    }

    /**
     * 设置 记录批准序号。
     */
    public void setAgreeSeq(java.lang.Long agreeSeq) {
        this.agreeSeq = agreeSeq;
    }

    /**
     * 获取 记录批准序号。
     */
    public java.lang.Long getAgreeSeq() {
        return this.agreeSeq;
    }

    /**
     * 设置 记录批准人部门。
     */
    public void setAgreeDeptNo(java.lang.String agreeDeptNo) {
        this.agreeDeptNo = agreeDeptNo;
    }

    /**
     * 获取 记录批准人部门。
     */
    public java.lang.String getAgreeDeptNo() {
        return this.agreeDeptNo;
    }

    /**
     * 设置 调整原因
     */
    public void setAdjustReason(java.lang.String adjustReason) {
        this.adjustReason = adjustReason;
    }

    /**
     * 获取 调整原因
     */
    public java.lang.String getAdjustReason() {
        return this.adjustReason;
    }

    /**
     * 设置 记录状态 。 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态 。 LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
