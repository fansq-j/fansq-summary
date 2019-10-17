package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录用户缴费后生成的帐务单据的相关信息。
 * @实体表  :BILL
 */
public class BillDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_S";

    /**
     * 改变付款记录状态的日期。
     */
    public java.lang.Long billId;

    /**
     * 改变付款记录状态的日期。
     */
    public java.lang.Long paymentId;

    /**
     * 为每种付款方式定义的唯一代码。OTC-0001
     */
    public java.lang.Integer paymentMethod;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long acctId;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 区分产品实例记录的唯一标识。
     */
    public java.lang.Long prodInstId;

    /**
     * 该帐目对应的费用。
     */
    public java.lang.Long amount;

    /**
     * 该销帐记录对应的帐目的总违约金
     */
    public java.lang.Long lateFee;

    /**
     * 该销帐记录对应的帐目的总减免滞纳金。
     */
    public java.lang.Long derateLateFee;

    /**
     * 使用的余额。
     */
    public java.lang.Long balance;

    /**
     * 该销帐记录对应的帐目使用的总上次零头。
     */
    public java.lang.Long lastChange;

    /**
     * 该销帐记录对应的帐目本次产生的领头。
     */
    public java.lang.Long curChange;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 交易的总额。
     */
    public java.util.Date paymentDate;

    /**
     * 业务号码
     */
    public java.lang.String accNum;

    /**
     * 用于记录“返销记录”与“被返销记录”之间的关系，当返销时记录被返销记录的对应的bill_id
     */
    public java.lang.Long operatedBillId;

    /**
     * 销帐记录的状态。ACC-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 销帐记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 设置 改变付款记录状态的日期。
     */
    public void setBillId(java.lang.Long billId) {
        this.billId = billId;
    }

    /**
     * 获取 改变付款记录状态的日期。
     */
    public java.lang.Long getBillId() {
        return this.billId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.billId = SeqUtils.createLongId(ID_SEQ);
         return this.billId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 改变付款记录状态的日期。
     */
    public void setPaymentId(java.lang.Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取 改变付款记录状态的日期。
     */
    public java.lang.Long getPaymentId() {
        return this.paymentId;
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
     * 设置 区分产品实例记录的唯一标识。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 区分产品实例记录的唯一标识。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 该帐目对应的费用。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 该帐目对应的费用。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 该销帐记录对应的帐目的总违约金
     */
    public void setLateFee(java.lang.Long lateFee) {
        this.lateFee = lateFee;
    }

    /**
     * 获取 该销帐记录对应的帐目的总违约金
     */
    public java.lang.Long getLateFee() {
        return this.lateFee;
    }

    /**
     * 设置 该销帐记录对应的帐目的总减免滞纳金。
     */
    public void setDerateLateFee(java.lang.Long derateLateFee) {
        this.derateLateFee = derateLateFee;
    }

    /**
     * 获取 该销帐记录对应的帐目的总减免滞纳金。
     */
    public java.lang.Long getDerateLateFee() {
        return this.derateLateFee;
    }

    /**
     * 设置 使用的余额。
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }

    /**
     * 获取 使用的余额。
     */
    public java.lang.Long getBalance() {
        return this.balance;
    }

    /**
     * 设置 该销帐记录对应的帐目使用的总上次零头。
     */
    public void setLastChange(java.lang.Long lastChange) {
        this.lastChange = lastChange;
    }

    /**
     * 获取 该销帐记录对应的帐目使用的总上次零头。
     */
    public java.lang.Long getLastChange() {
        return this.lastChange;
    }

    /**
     * 设置 该销帐记录对应的帐目本次产生的领头。
     */
    public void setCurChange(java.lang.Long curChange) {
        this.curChange = curChange;
    }

    /**
     * 获取 该销帐记录对应的帐目本次产生的领头。
     */
    public java.lang.Long getCurChange() {
        return this.curChange;
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
     * 设置 交易的总额。
     */
    public void setPaymentDate(java.util.Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 获取 交易的总额。
     */
    public java.util.Date getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * 设置 业务号码
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }

    /**
     * 获取 业务号码
     */
    public java.lang.String getAccNum() {
        return this.accNum;
    }

    /**
     * 设置 用于记录“返销记录”与“被返销记录”之间的关系，当返销时记录被返销记录的对应的bill_id
     */
    public void setOperatedBillId(java.lang.Long operatedBillId) {
        this.operatedBillId = operatedBillId;
    }

    /**
     * 获取 用于记录“返销记录”与“被返销记录”之间的关系，当返销时记录被返销记录的对应的bill_id
     */
    public java.lang.Long getOperatedBillId() {
        return this.operatedBillId;
    }

    /**
     * 设置 销帐记录的状态。ACC-C-0005
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 销帐记录的状态。ACC-C-0005
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 销帐记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 销帐记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
