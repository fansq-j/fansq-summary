package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销资源订单的支付信息，记录客户是如何支付地，一个订单可以有多个支付信息，如一部分采用银行支付，一部分现金
 * @实体表  :MKT_ORD_PAY_INFO
 */
public class MktOrdPayInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_ORD_PAY_INFO_S";

    /**
     * 营销资源订单支付标识
     */
    public java.lang.Integer mktOrdPayId;

    /**
     * 营销资源订单费用标识
     */
    public java.lang.String mktOrdInfoId;

    /**
     * 客户订单号
     */
    public java.lang.Long custOrderId;

    /**
     * 帐户标识
     */
    public java.lang.Long acctId;

    /**
     * 支付金额
     */
    public java.lang.Long amount;

    /**
     * LOVB=PRC-C-0052
     */
    public java.lang.String payMethod;

    /**
     * LOVB=PRC-C-0046
     */
    public java.lang.String payStatus;

    /**
     * 设置 营销资源订单支付标识
     */
    public void setMktOrdPayId(java.lang.Integer mktOrdPayId) {
        this.mktOrdPayId = mktOrdPayId;
    }

    /**
     * 获取 营销资源订单支付标识
     */
    public java.lang.Integer getMktOrdPayId() {
        return this.mktOrdPayId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.mktOrdPayId = SeqUtils.createIntegerId(ID_SEQ);
         return this.mktOrdPayId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 营销资源订单费用标识
     */
    public void setMktOrdInfoId(java.lang.String mktOrdInfoId) {
        this.mktOrdInfoId = mktOrdInfoId;
    }

    /**
     * 获取 营销资源订单费用标识
     */
    public java.lang.String getMktOrdInfoId() {
        return this.mktOrdInfoId;
    }

    /**
     * 设置 客户订单号
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 客户订单号
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
     * 设置 支付金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 支付金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 LOVB=PRC-C-0052
     */
    public void setPayMethod(java.lang.String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取 LOVB=PRC-C-0052
     */
    public java.lang.String getPayMethod() {
        return this.payMethod;
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

}
