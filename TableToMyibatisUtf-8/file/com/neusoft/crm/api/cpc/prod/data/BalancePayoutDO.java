package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录余额帐本的每一次支出操作信息。
 * @实体表  :BALANCE_PAYOUT
 */
public class BalancePayoutDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_PAYOUT_S";

    /**
     * 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long operPayoutId;

    /**
     * 如果是扣费销帐，记录操作对应的帐单号
     */
    public java.lang.Long billId;

    /**
     * 区分用户付款记录的唯一标识。余额提取时必填。
     */
    public java.lang.Long paymentId;

    /**
     * 操作类型，LOVB=ACC-C-0014
     */
    public java.lang.String operType;

    /**
     * 为每个余额帐本生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long acctBalanceId;

    /**
     * 操作的金额
     */
    public java.lang.Long amount;

    /**
     * 操作后余额帐本的余额
     */
    public java.lang.Long balance;

    /**
     * 记录对应来源终端携带的流水号
     */
    public java.lang.String extSerialId;

    /**
     * 操作的员工标识
     */
    public java.lang.Long staffId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 操作发生的时间
     */
    public java.util.Date operDate;

    /**
     * 该操作被打印的次数
     */
    public java.lang.Integer prnCount;

    /**
     * 余额对象帐本关系标识
     */
    public java.lang.Long balanceRelationId;

    /**
     * 余额支出的具体描述信息，便于查询展示及统计
     */
    public java.lang.String payoutDesc;

    /**
     * 处理状态，LOVB=ACC-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 状态发生改变的时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public void setOperPayoutId(java.lang.Long operPayoutId) {
        this.operPayoutId = operPayoutId;
    }

    /**
     * 获取 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long getOperPayoutId() {
        return this.operPayoutId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.operPayoutId = SeqUtils.createLongId(ID_SEQ);
         return this.operPayoutId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 如果是扣费销帐，记录操作对应的帐单号
     */
    public void setBillId(java.lang.Long billId) {
        this.billId = billId;
    }

    /**
     * 获取 如果是扣费销帐，记录操作对应的帐单号
     */
    public java.lang.Long getBillId() {
        return this.billId;
    }

    /**
     * 设置 区分用户付款记录的唯一标识。余额提取时必填。
     */
    public void setPaymentId(java.lang.Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取 区分用户付款记录的唯一标识。余额提取时必填。
     */
    public java.lang.Long getPaymentId() {
        return this.paymentId;
    }

    /**
     * 设置 操作类型，LOVB=ACC-C-0014
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，LOVB=ACC-C-0014
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 为每个余额帐本生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public void setAcctBalanceId(java.lang.Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    /**
     * 获取 为每个余额帐本生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long getAcctBalanceId() {
        return this.acctBalanceId;
    }

    /**
     * 设置 操作的金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 操作的金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 操作后余额帐本的余额
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }

    /**
     * 获取 操作后余额帐本的余额
     */
    public java.lang.Long getBalance() {
        return this.balance;
    }

    /**
     * 设置 记录对应来源终端携带的流水号
     */
    public void setExtSerialId(java.lang.String extSerialId) {
        this.extSerialId = extSerialId;
    }

    /**
     * 获取 记录对应来源终端携带的流水号
     */
    public java.lang.String getExtSerialId() {
        return this.extSerialId;
    }

    /**
     * 设置 操作的员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 操作的员工标识
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
     * 设置 操作发生的时间
     */
    public void setOperDate(java.util.Date operDate) {
        this.operDate = operDate;
    }

    /**
     * 获取 操作发生的时间
     */
    public java.util.Date getOperDate() {
        return this.operDate;
    }

    /**
     * 设置 该操作被打印的次数
     */
    public void setPrnCount(java.lang.Integer prnCount) {
        this.prnCount = prnCount;
    }

    /**
     * 获取 该操作被打印的次数
     */
    public java.lang.Integer getPrnCount() {
        return this.prnCount;
    }

    /**
     * 设置 余额对象帐本关系标识
     */
    public void setBalanceRelationId(java.lang.Long balanceRelationId) {
        this.balanceRelationId = balanceRelationId;
    }

    /**
     * 获取 余额对象帐本关系标识
     */
    public java.lang.Long getBalanceRelationId() {
        return this.balanceRelationId;
    }

    /**
     * 设置 余额支出的具体描述信息，便于查询展示及统计
     */
    public void setPayoutDesc(java.lang.String payoutDesc) {
        this.payoutDesc = payoutDesc;
    }

    /**
     * 获取 余额支出的具体描述信息，便于查询展示及统计
     */
    public java.lang.String getPayoutDesc() {
        return this.payoutDesc;
    }

    /**
     * 设置 处理状态，LOVB=ACC-C-0005
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 处理状态，LOVB=ACC-C-0005
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态发生改变的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态发生改变的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
