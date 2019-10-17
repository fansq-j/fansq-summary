package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营销资源订单的费用信息
 * @实体表  :MKT_ORD_INFO
 */
public class MktOrdInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_ORD_INFO_S";

    /**
     * 营销资源订单费用标识，主键
     */
    public java.lang.Integer mktOrdInfoId;

    /**
     * 营销时的受理客户订单号
     */
    public java.lang.Long custOrderId;

    /**
     * 帐户标识
     */
    public java.lang.Long acctId;

    /**
     * 订单总金额
     */
    public java.lang.Long totalAmount;

    /**
     * 实际支付金额
     */
    public java.lang.Long actualPaidAmount;

    /**
     * 订单税费
     */
    public java.lang.Long totalTax;

    /**
     * 订单运费
     */
    public java.lang.Long totalShip;

    /**
     * 优惠金额
     */
    public java.lang.Long discount;

    /**
     * LOVB=PRC-C-0046
     */
    public java.lang.String payStatus;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 付款时间
     */
    public java.util.Date paymentDate;

    /**
     * 订单的审核时间
     */
    public java.util.Date verifyDate;

    /**
     * 订单取消原因
     */
    public java.lang.String orderCancelReason;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 营销资源订单费用标识，主键
     */
    public void setMktOrdInfoId(java.lang.Integer mktOrdInfoId) {
        this.mktOrdInfoId = mktOrdInfoId;
    }

    /**
     * 获取 营销资源订单费用标识，主键
     */
    public java.lang.Integer getMktOrdInfoId() {
        return this.mktOrdInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.mktOrdInfoId = SeqUtils.createIntegerId(ID_SEQ);
         return this.mktOrdInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 营销时的受理客户订单号
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 营销时的受理客户订单号
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
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
     * 设置 订单总金额
     */
    public void setTotalAmount(java.lang.Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取 订单总金额
     */
    public java.lang.Long getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * 设置 实际支付金额
     */
    public void setActualPaidAmount(java.lang.Long actualPaidAmount) {
        this.actualPaidAmount = actualPaidAmount;
    }

    /**
     * 获取 实际支付金额
     */
    public java.lang.Long getActualPaidAmount() {
        return this.actualPaidAmount;
    }

    /**
     * 设置 订单税费
     */
    public void setTotalTax(java.lang.Long totalTax) {
        this.totalTax = totalTax;
    }

    /**
     * 获取 订单税费
     */
    public java.lang.Long getTotalTax() {
        return this.totalTax;
    }

    /**
     * 设置 订单运费
     */
    public void setTotalShip(java.lang.Long totalShip) {
        this.totalShip = totalShip;
    }

    /**
     * 获取 订单运费
     */
    public java.lang.Long getTotalShip() {
        return this.totalShip;
    }

    /**
     * 设置 优惠金额
     */
    public void setDiscount(java.lang.Long discount) {
        this.discount = discount;
    }

    /**
     * 获取 优惠金额
     */
    public java.lang.Long getDiscount() {
        return this.discount;
    }

    /**
     * 设置 LOVB=PRC-C-0046
     */
    public void setPayStatus(java.lang.String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取 LOVB=PRC-C-0046
     */
    public java.lang.String getPayStatus() {
        return this.payStatus;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 付款时间
     */
    public void setPaymentDate(java.util.Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 获取 付款时间
     */
    public java.util.Date getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * 设置 订单的审核时间
     */
    public void setVerifyDate(java.util.Date verifyDate) {
        this.verifyDate = verifyDate;
    }

    /**
     * 获取 订单的审核时间
     */
    public java.util.Date getVerifyDate() {
        return this.verifyDate;
    }

    /**
     * 设置 订单取消原因
     */
    public void setOrderCancelReason(java.lang.String orderCancelReason) {
        this.orderCancelReason = orderCancelReason;
    }

    /**
     * 获取 订单取消原因
     */
    public java.lang.String getOrderCancelReason() {
        return this.orderCancelReason;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
