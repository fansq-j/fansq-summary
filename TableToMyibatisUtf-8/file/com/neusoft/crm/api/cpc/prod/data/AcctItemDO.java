package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指帐务处理中形成的用户费用数据，用于统计、销帐等处理。
 * @实体表  :ACCT_ITEM
 */
public class AcctItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_S";

    /**
     * 为不同帐目生成的唯一编号。
     */
    public java.lang.Long acctItemId;

    /**
     * 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer itemSourceId;

    /**
     * 该帐目对应的费用。
     */
    public java.lang.Long billId;

    /**
     * 为每种付款方式定义的唯一代码。OTC-0001
     */
    public java.lang.Integer paymentMethod;

    /**
     * 电信产品服务费用中的其中一种费用类型。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 为每个产品实例生成的唯一编号。
     */
    public java.lang.Long prodInstId;

    /**
     * 出帐金额
     */
    public java.lang.Long amount;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 费用可以开始收取的帐期周期
            判信控的周期
     */
    public java.lang.Integer payCycleId;

    /**
     * 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
            年交套餐每个月缴费的账期
     */
    public java.lang.Integer feeCycleId;

    /**
     * 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long acctId;

    /**
     * 帐目的状态。ACC-C-0015
     */
    public java.lang.Integer statusCd;

    /**
     * 帐目状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 客户标识，各种统计会用到，前台如果根据客户查询费用，也会用到
            
     */
    public java.lang.Long custId;

    /**
     * 销售品实例标识,填主套餐实例
     */
    public java.lang.Long offerInstId;

    /**
     * 用于拆分销帐，记录拆分出来的帐目的来源（被拆分的帐目）
     */
    public java.lang.Long oriAcctItemId;

    /**
     * 为余额本金冲减金额，已提供一次性发票，月结不再提供发票，本金不抵减电信收入；
            
     */
    public java.lang.Long hadInvoiceAmount;

    /**
     * 为余额本金冲减金额，未提供一次性发票，月结需要提供发票，本金不抵减电信收入；
            
     */
    public java.lang.Long noInvoiceAmount;

    /**
     * 为余额赠金冲减金额，不能提供发票，抵减电信收入；
            
     */
    public java.lang.Long presentAmount;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 一次性费用帐目表中的帐目标识，一次性费用帐目转入帐目表时必填
     */
    public java.lang.Long oneAcctItemId;

    /**
     * 设置 为不同帐目生成的唯一编号。
     */
    public void setAcctItemId(java.lang.Long acctItemId) {
        this.acctItemId = acctItemId;
    }

    /**
     * 获取 为不同帐目生成的唯一编号。
     */
    public java.lang.Long getAcctItemId() {
        return this.acctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.acctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.acctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
    }

    /**
     * 设置 该帐目对应的费用。
     */
    public void setBillId(java.lang.Long billId) {
        this.billId = billId;
    }

    /**
     * 获取 该帐目对应的费用。
     */
    public java.lang.Long getBillId() {
        return this.billId;
    }

    /**
     * 设置 为每种付款方式定义的唯一代码。OTC-0001
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取 为每种付款方式定义的唯一代码。OTC-0001
     */
    public java.lang.Integer getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * 设置 电信产品服务费用中的其中一种费用类型。
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 电信产品服务费用中的其中一种费用类型。
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 为每个产品实例生成的唯一编号。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 为每个产品实例生成的唯一编号。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 出帐金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 出帐金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 业务处理的帐期周期
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 业务处理的帐期周期
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 费用可以开始收取的帐期周期
            判信控的周期
     */
    public void setPayCycleId(java.lang.Integer payCycleId) {
        this.payCycleId = payCycleId;
    }

    /**
     * 获取 费用可以开始收取的帐期周期
            判信控的周期
     */
    public java.lang.Integer getPayCycleId() {
        return this.payCycleId;
    }

    /**
     * 设置 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
            年交套餐每个月缴费的账期
     */
    public void setFeeCycleId(java.lang.Integer feeCycleId) {
        this.feeCycleId = feeCycleId;
    }

    /**
     * 获取 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
            年交套餐每个月缴费的账期
     */
    public java.lang.Integer getFeeCycleId() {
        return this.feeCycleId;
    }

    /**
     * 设置 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 帐目的状态。ACC-C-0015
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 帐目的状态。ACC-C-0015
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 帐目状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 帐目状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 客户标识，各种统计会用到，前台如果根据客户查询费用，也会用到
            
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 客户标识，各种统计会用到，前台如果根据客户查询费用，也会用到
            
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 销售品实例标识,填主套餐实例
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 销售品实例标识,填主套餐实例
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 用于拆分销帐，记录拆分出来的帐目的来源（被拆分的帐目）
     */
    public void setOriAcctItemId(java.lang.Long oriAcctItemId) {
        this.oriAcctItemId = oriAcctItemId;
    }

    /**
     * 获取 用于拆分销帐，记录拆分出来的帐目的来源（被拆分的帐目）
     */
    public java.lang.Long getOriAcctItemId() {
        return this.oriAcctItemId;
    }

    /**
     * 设置 为余额本金冲减金额，已提供一次性发票，月结不再提供发票，本金不抵减电信收入；
            
     */
    public void setHadInvoiceAmount(java.lang.Long hadInvoiceAmount) {
        this.hadInvoiceAmount = hadInvoiceAmount;
    }

    /**
     * 获取 为余额本金冲减金额，已提供一次性发票，月结不再提供发票，本金不抵减电信收入；
            
     */
    public java.lang.Long getHadInvoiceAmount() {
        return this.hadInvoiceAmount;
    }

    /**
     * 设置 为余额本金冲减金额，未提供一次性发票，月结需要提供发票，本金不抵减电信收入；
            
     */
    public void setNoInvoiceAmount(java.lang.Long noInvoiceAmount) {
        this.noInvoiceAmount = noInvoiceAmount;
    }

    /**
     * 获取 为余额本金冲减金额，未提供一次性发票，月结需要提供发票，本金不抵减电信收入；
            
     */
    public java.lang.Long getNoInvoiceAmount() {
        return this.noInvoiceAmount;
    }

    /**
     * 设置 为余额赠金冲减金额，不能提供发票，抵减电信收入；
            
     */
    public void setPresentAmount(java.lang.Long presentAmount) {
        this.presentAmount = presentAmount;
    }

    /**
     * 获取 为余额赠金冲减金额，不能提供发票，抵减电信收入；
            
     */
    public java.lang.Long getPresentAmount() {
        return this.presentAmount;
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
     * 设置 一次性费用帐目表中的帐目标识，一次性费用帐目转入帐目表时必填
     */
    public void setOneAcctItemId(java.lang.Long oneAcctItemId) {
        this.oneAcctItemId = oneAcctItemId;
    }

    /**
     * 获取 一次性费用帐目表中的帐目标识，一次性费用帐目转入帐目表时必填
     */
    public java.lang.Long getOneAcctItemId() {
        return this.oneAcctItemId;
    }

}
