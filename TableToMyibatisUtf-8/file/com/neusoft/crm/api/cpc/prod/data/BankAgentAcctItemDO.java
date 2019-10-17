package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述银行送托的帐目数据。
 * @实体表  :BANK_AGENT_ACCT_ITEM
 */
public class BankAgentAcctItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BANK_AGENT_ACCT_ITEM_S";

    /**
     * 托收编号
     */
    public java.lang.Long agentAcctItemId;

    /**
     * 为不同帐目生成的唯一编号。
     */
    public java.lang.Long acctItemId;

    /**
     * 一个批次包括多条帐目
     */
    public java.lang.Long sendId;

    /**
     * 金额
     */
    public java.lang.Long amount;

    /**
     * 帐务周期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 帐户标识
     */
    public java.lang.Long acctId;

    /**
     * 送托金额
     */
    public java.lang.Long agentCharge;

    /**
     * LOVB=ACC-C-0177
     */
    public java.lang.Integer agentType;

    /**
     * 开户银行
     */
    public java.lang.Integer branchId;

    /**
     * 开户的银行帐号
     */
    public java.lang.String bankAcct;

    /**
     * 银行帐目类型标识
     */
    public java.lang.Integer bankItemTypeLatnId;

    /**
     * 记录产生时间
     */
    public java.util.Date createDate;

    /**
     * LOVB=ACC-C-0179
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 托收编号
     */
    public void setAgentAcctItemId(java.lang.Long agentAcctItemId) {
        this.agentAcctItemId = agentAcctItemId;
    }

    /**
     * 获取 托收编号
     */
    public java.lang.Long getAgentAcctItemId() {
        return this.agentAcctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agentAcctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.agentAcctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 一个批次包括多条帐目
     */
    public void setSendId(java.lang.Long sendId) {
        this.sendId = sendId;
    }

    /**
     * 获取 一个批次包括多条帐目
     */
    public java.lang.Long getSendId() {
        return this.sendId;
    }

    /**
     * 设置 金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 帐务周期标识
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 帐务周期标识
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
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
     * 设置 送托金额
     */
    public void setAgentCharge(java.lang.Long agentCharge) {
        this.agentCharge = agentCharge;
    }

    /**
     * 获取 送托金额
     */
    public java.lang.Long getAgentCharge() {
        return this.agentCharge;
    }

    /**
     * 设置 LOVB=ACC-C-0177
     */
    public void setAgentType(java.lang.Integer agentType) {
        this.agentType = agentType;
    }

    /**
     * 获取 LOVB=ACC-C-0177
     */
    public java.lang.Integer getAgentType() {
        return this.agentType;
    }

    /**
     * 设置 开户银行
     */
    public void setBranchId(java.lang.Integer branchId) {
        this.branchId = branchId;
    }

    /**
     * 获取 开户银行
     */
    public java.lang.Integer getBranchId() {
        return this.branchId;
    }

    /**
     * 设置 开户的银行帐号
     */
    public void setBankAcct(java.lang.String bankAcct) {
        this.bankAcct = bankAcct;
    }

    /**
     * 获取 开户的银行帐号
     */
    public java.lang.String getBankAcct() {
        return this.bankAcct;
    }

    /**
     * 设置 银行帐目类型标识
     */
    public void setBankItemTypeLatnId(java.lang.Integer bankItemTypeLatnId) {
        this.bankItemTypeLatnId = bankItemTypeLatnId;
    }

    /**
     * 获取 银行帐目类型标识
     */
    public java.lang.Integer getBankItemTypeLatnId() {
        return this.bankItemTypeLatnId;
    }

    /**
     * 设置 记录产生时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录产生时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 LOVB=ACC-C-0179
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0179
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

}
