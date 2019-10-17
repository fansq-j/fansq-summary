package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于记录银行托收送托的信息。
 * @实体表  :BANK_AGENT_SEND
 */
public class BankAgentSendDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BANK_AGENT_SEND_S";

    /**
     * 托收编号
     */
    public java.lang.Long sendId;

    /**
     * 托收批次
     */
    public java.lang.Long sendBatchId;

    /**
     * 帐务周期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 记录帐户的唯一编号。
     */
    public java.lang.Long acctId;

    /**
     * 金额
     */
    public java.lang.Long amount;

    /**
     * LOVB=ACC-C-0177
     */
    public java.lang.Integer agentType;

    /**
     * 开户银行
     */
    public java.lang.Integer telBranchId;

    /**
     * 开户帐号
     */
    public java.lang.String telBankAcct;

    /**
     * 上级银行标识
     */
    public java.lang.Integer bankId;

    /**
     * 送托金额
     */
    public java.lang.Long agentCharge;

    /**
     * 送托时间
     */
    public java.util.Date sendDate;

    /**
     * 记录送银行的文件名称。
     */
    public java.lang.String bankFile;

    /**
     * 托收次数
     */
    public java.lang.Integer agentTimes;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 记录销帐流水的唯一编号。
     */
    public java.lang.Long billId;

    /**
     * 销帐结果
     */
    public java.lang.Integer billResult;

    /**
     * 原因
     */
    public java.lang.String reason;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * LOVB=ACC-C-0178
     */
    public java.lang.Integer statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 托收编号
     */
    public void setSendId(java.lang.Long sendId) {
        this.sendId = sendId;
    }

    /**
     * 获取 托收编号
     */
    public java.lang.Long getSendId() {
        return this.sendId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.sendId = SeqUtils.createLongId(ID_SEQ);
         return this.sendId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 托收批次
     */
    public void setSendBatchId(java.lang.Long sendBatchId) {
        this.sendBatchId = sendBatchId;
    }

    /**
     * 获取 托收批次
     */
    public java.lang.Long getSendBatchId() {
        return this.sendBatchId;
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
     * 设置 记录帐户的唯一编号。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 记录帐户的唯一编号。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
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
    public void setTelBranchId(java.lang.Integer telBranchId) {
        this.telBranchId = telBranchId;
    }

    /**
     * 获取 开户银行
     */
    public java.lang.Integer getTelBranchId() {
        return this.telBranchId;
    }

    /**
     * 设置 开户帐号
     */
    public void setTelBankAcct(java.lang.String telBankAcct) {
        this.telBankAcct = telBankAcct;
    }

    /**
     * 获取 开户帐号
     */
    public java.lang.String getTelBankAcct() {
        return this.telBankAcct;
    }

    /**
     * 设置 上级银行标识
     */
    public void setBankId(java.lang.Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取 上级银行标识
     */
    public java.lang.Integer getBankId() {
        return this.bankId;
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
     * 设置 送托时间
     */
    public void setSendDate(java.util.Date sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * 获取 送托时间
     */
    public java.util.Date getSendDate() {
        return this.sendDate;
    }

    /**
     * 设置 记录送银行的文件名称。
     */
    public void setBankFile(java.lang.String bankFile) {
        this.bankFile = bankFile;
    }

    /**
     * 获取 记录送银行的文件名称。
     */
    public java.lang.String getBankFile() {
        return this.bankFile;
    }

    /**
     * 设置 托收次数
     */
    public void setAgentTimes(java.lang.Integer agentTimes) {
        this.agentTimes = agentTimes;
    }

    /**
     * 获取 托收次数
     */
    public java.lang.Integer getAgentTimes() {
        return this.agentTimes;
    }

    /**
     * 设置 员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 记录销帐流水的唯一编号。
     */
    public void setBillId(java.lang.Long billId) {
        this.billId = billId;
    }

    /**
     * 获取 记录销帐流水的唯一编号。
     */
    public java.lang.Long getBillId() {
        return this.billId;
    }

    /**
     * 设置 销帐结果
     */
    public void setBillResult(java.lang.Integer billResult) {
        this.billResult = billResult;
    }

    /**
     * 获取 销帐结果
     */
    public java.lang.Integer getBillResult() {
        return this.billResult;
    }

    /**
     * 设置 原因
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    /**
     * 获取 原因
     */
    public java.lang.String getReason() {
        return this.reason;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 LOVB=ACC-C-0178
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0178
     */
    public java.lang.Integer getStatusCd() {
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
