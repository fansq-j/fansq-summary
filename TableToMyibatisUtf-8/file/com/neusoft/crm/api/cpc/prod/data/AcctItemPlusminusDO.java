package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述每个业务号码的补收补退信息。
 * @实体表  :ACCT_ITEM_PLUSMINUS
 */
public class AcctItemPlusminusDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_PLUSMINUS_S";

    /**
     * 为每条补收补退记录生成的唯一标识。
     */
    public java.lang.Long plusSeqNbr;

    /**
     * 业务号码
     */
    public java.lang.String accNum;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 电信产品服务费用中的其中一种费用类型。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 要补收补退的金额。
     */
    public java.lang.Long amount;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer mergeFlag;

    /**
     * 合帐完后还剩余的金额。
     */
    public java.lang.Long mergeBalance;

    /**
     * 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public java.lang.Integer feeCycleId;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 员工电信组织标识。
     */
    public java.lang.Long orgId;

    /**
     * LOVB=ACC-C-0219
     */
    public java.lang.Integer plusType;

    /**
     * 帐户标识。
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 补收补退原因。
     */
    public java.lang.String reason;

    /**
     * 记录创建时间。
     */
    public java.util.Date createDate;

    /**
     * 补收补退状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态 。 LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 设置 为每条补收补退记录生成的唯一标识。
     */
    public void setPlusSeqNbr(java.lang.Long plusSeqNbr) {
        this.plusSeqNbr = plusSeqNbr;
    }

    /**
     * 获取 为每条补收补退记录生成的唯一标识。
     */
    public java.lang.Long getPlusSeqNbr() {
        return this.plusSeqNbr;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.plusSeqNbr = SeqUtils.createLongId(ID_SEQ);
         return this.plusSeqNbr;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 要补收补退的金额。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 要补收补退的金额。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 LOVB=ACC-C-0044
     */
    public void setMergeFlag(java.lang.Integer mergeFlag) {
        this.mergeFlag = mergeFlag;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getMergeFlag() {
        return this.mergeFlag;
    }

    /**
     * 设置 合帐完后还剩余的金额。
     */
    public void setMergeBalance(java.lang.Long mergeBalance) {
        this.mergeBalance = mergeBalance;
    }

    /**
     * 获取 合帐完后还剩余的金额。
     */
    public java.lang.Long getMergeBalance() {
        return this.mergeBalance;
    }

    /**
     * 设置 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public void setFeeCycleId(java.lang.Integer feeCycleId) {
        this.feeCycleId = feeCycleId;
    }

    /**
     * 获取 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public java.lang.Integer getFeeCycleId() {
        return this.feeCycleId;
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
     * 设置 员工电信组织标识。
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 员工电信组织标识。
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 LOVB=ACC-C-0219
     */
    public void setPlusType(java.lang.Integer plusType) {
        this.plusType = plusType;
    }

    /**
     * 获取 LOVB=ACC-C-0219
     */
    public java.lang.Integer getPlusType() {
        return this.plusType;
    }

    /**
     * 设置 帐户标识。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
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
     * 设置 补收补退原因。
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    /**
     * 获取 补收补退原因。
     */
    public java.lang.String getReason() {
        return this.reason;
    }

    /**
     * 设置 记录创建时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 补收补退状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 补收补退状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录状态 。 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态 。 LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

}
