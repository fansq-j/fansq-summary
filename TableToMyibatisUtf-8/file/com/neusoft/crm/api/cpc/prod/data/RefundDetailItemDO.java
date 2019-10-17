package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:退款具体的帐目明细
 * @实体表  :REFUND_DETAIL_ITEM
 */
public class RefundDetailItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "REFUND_DETAIL_ITEM_S";

    /**
     * 退款帐目明细标识。
     */
    public java.lang.Long refundDetailId;

    /**
     * 退款标识。
     */
    public java.lang.Long refundId;

    /**
     * 记录帐户标识。
     */
    public java.lang.Long acctId;

    /**
     * 记录产品实例标识。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录帐务周期标识。
     */
    public java.lang.Integer billingCycleId;

    /**
     * 记录退款的帐目标识。
     */
    public java.lang.Long acctItemId;

    /**
     * 记录帐单销帐时间。
     */
    public java.util.Date billPaymentDate;

    /**
     * 记录帐目类型标识。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 记录帐目来源标识。
     */
    public java.lang.Integer itemSourceId;

    /**
     * 退款金额。
     */
    public java.lang.Long amount;

    /**
     * 设置 退款帐目明细标识。
     */
    public void setRefundDetailId(java.lang.Long refundDetailId) {
        this.refundDetailId = refundDetailId;
    }

    /**
     * 获取 退款帐目明细标识。
     */
    public java.lang.Long getRefundDetailId() {
        return this.refundDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.refundDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.refundDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 退款标识。
     */
    public void setRefundId(java.lang.Long refundId) {
        this.refundId = refundId;
    }

    /**
     * 获取 退款标识。
     */
    public java.lang.Long getRefundId() {
        return this.refundId;
    }

    /**
     * 设置 记录帐户标识。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 记录帐户标识。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 记录产品实例标识。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录帐务周期标识。
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 记录帐务周期标识。
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 记录退款的帐目标识。
     */
    public void setAcctItemId(java.lang.Long acctItemId) {
        this.acctItemId = acctItemId;
    }

    /**
     * 获取 记录退款的帐目标识。
     */
    public java.lang.Long getAcctItemId() {
        return this.acctItemId;
    }

    /**
     * 设置 记录帐单销帐时间。
     */
    public void setBillPaymentDate(java.util.Date billPaymentDate) {
        this.billPaymentDate = billPaymentDate;
    }

    /**
     * 获取 记录帐单销帐时间。
     */
    public java.util.Date getBillPaymentDate() {
        return this.billPaymentDate;
    }

    /**
     * 设置 记录帐目类型标识。
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 记录帐目类型标识。
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 记录帐目来源标识。
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 记录帐目来源标识。
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
    }

    /**
     * 设置 退款金额。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 退款金额。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

}
