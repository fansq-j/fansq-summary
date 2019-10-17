package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述余额帐本操作的日志，余额来源时填余额来源操作流水、余额来源原金额，支出操作流水、支出金额不填
余额支出时
 * @实体表  :ACCT_BALANCE_LOG
 */
public class AcctBalanceLogDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_BALANCE_LOG_S";

    /**
     * 余额帐本日志标识
     */
    public java.lang.Long balanceLogId;

    /**
     * 余额帐本标识
     */
    public java.lang.Long acctBalanceId;

    /**
     * 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long operIncomeId;

    /**
     * 余额来源原金额
     */
    public java.lang.Long srcAmount;

    /**
     * 支出操作流水
     */
    public java.lang.Long operPayoutId;

    /**
     * 支出金额
     */
    public java.lang.Long payoutAmount;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 设置 余额帐本日志标识
     */
    public void setBalanceLogId(java.lang.Long balanceLogId) {
        this.balanceLogId = balanceLogId;
    }

    /**
     * 获取 余额帐本日志标识
     */
    public java.lang.Long getBalanceLogId() {
        return this.balanceLogId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.balanceLogId = SeqUtils.createLongId(ID_SEQ);
         return this.balanceLogId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 余额帐本标识
     */
    public void setAcctBalanceId(java.lang.Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    /**
     * 获取 余额帐本标识
     */
    public java.lang.Long getAcctBalanceId() {
        return this.acctBalanceId;
    }

    /**
     * 设置 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public void setOperIncomeId(java.lang.Long operIncomeId) {
        this.operIncomeId = operIncomeId;
    }

    /**
     * 获取 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long getOperIncomeId() {
        return this.operIncomeId;
    }

    /**
     * 设置 余额来源原金额
     */
    public void setSrcAmount(java.lang.Long srcAmount) {
        this.srcAmount = srcAmount;
    }

    /**
     * 获取 余额来源原金额
     */
    public java.lang.Long getSrcAmount() {
        return this.srcAmount;
    }

    /**
     * 设置 支出操作流水
     */
    public void setOperPayoutId(java.lang.Long operPayoutId) {
        this.operPayoutId = operPayoutId;
    }

    /**
     * 获取 支出操作流水
     */
    public java.lang.Long getOperPayoutId() {
        return this.operPayoutId;
    }

    /**
     * 设置 支出金额
     */
    public void setPayoutAmount(java.lang.Long payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    /**
     * 获取 支出金额
     */
    public java.lang.Long getPayoutAmount() {
        return this.payoutAmount;
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
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

}
