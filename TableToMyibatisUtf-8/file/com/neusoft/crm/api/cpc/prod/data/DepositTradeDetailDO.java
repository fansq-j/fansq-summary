package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述押金收支的明细流水。
 * @实体表  :DEPOSIT_TRADE_DETAIL
 */
public class DepositTradeDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEPOSIT_TRADE_DETAIL_S";

    /**
     * 押金收支明细的标识，主键
     */
    public java.lang.Long depositSoDetailId;

    /**
     * 押金类型的标识，外键
     */
    public java.lang.Integer depositTypeId;

    /**
     * 押金帐本的标识，外键
     */
    public java.lang.Long depositBalanceId;

    /**
     * 所属通信帐户标识
     */
    public java.lang.Long acctId;

    /**
     * LOVB=ACC-C-0186
     */
    public java.lang.Integer depositOperType;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 操作的金额
     */
    public java.lang.Long amount;

    /**
     * 客户订单编码
     */
    public java.lang.String custOrderNbr;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 转为余额的时候的余额存入流水号
     */
    public java.lang.Long relOperIncomeId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 设置 押金收支明细的标识，主键
     */
    public void setDepositSoDetailId(java.lang.Long depositSoDetailId) {
        this.depositSoDetailId = depositSoDetailId;
    }

    /**
     * 获取 押金收支明细的标识，主键
     */
    public java.lang.Long getDepositSoDetailId() {
        return this.depositSoDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.depositSoDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.depositSoDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 押金类型的标识，外键
     */
    public void setDepositTypeId(java.lang.Integer depositTypeId) {
        this.depositTypeId = depositTypeId;
    }

    /**
     * 获取 押金类型的标识，外键
     */
    public java.lang.Integer getDepositTypeId() {
        return this.depositTypeId;
    }

    /**
     * 设置 押金帐本的标识，外键
     */
    public void setDepositBalanceId(java.lang.Long depositBalanceId) {
        this.depositBalanceId = depositBalanceId;
    }

    /**
     * 获取 押金帐本的标识，外键
     */
    public java.lang.Long getDepositBalanceId() {
        return this.depositBalanceId;
    }

    /**
     * 设置 所属通信帐户标识
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 所属通信帐户标识
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 LOVB=ACC-C-0186
     */
    public void setDepositOperType(java.lang.Integer depositOperType) {
        this.depositOperType = depositOperType;
    }

    /**
     * 获取 LOVB=ACC-C-0186
     */
    public java.lang.Integer getDepositOperType() {
        return this.depositOperType;
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
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 转为余额的时候的余额存入流水号
     */
    public void setRelOperIncomeId(java.lang.Long relOperIncomeId) {
        this.relOperIncomeId = relOperIncomeId;
    }

    /**
     * 获取 转为余额的时候的余额存入流水号
     */
    public java.lang.Long getRelOperIncomeId() {
        return this.relOperIncomeId;
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

}
