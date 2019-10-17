package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对帐户的零头、预付费余额、预存款余额、专项预存费用等的来源、去向、使用记录等进行管理的实体。
 * @实体表  :ACCT_BALANCE
 */
public class AcctBalanceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_BALANCE_S";

    /**
     * 为每个余额帐本生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long acctBalanceId;

    /**
     * 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long acctId;

    /**
     * 余额帐本所属的余额类型。ACC-C-0009
     */
    public java.lang.Integer balanceTypeId;

    /**
     * 余额帐本余额
     */
    public java.lang.Long balance;

    /**
     * 预留余额
     */
    public java.lang.Long reserveBalance;

    /**
     * 限额类型，LOVB=ACC-C-0010
     */
    public java.lang.Integer cycleType;

    /**
     * 余额帐本每个帐期可以使用的金额封顶
     */
    public java.lang.Long cycleUpper;

    /**
     * 单个帐期应扣费的最低额。
     */
    public java.lang.Long cycleLower;

    /**
     * 是否帐户共享帐本，LOVB=ACC-C-0044
     */
    public java.lang.Integer shareRuleFlag;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 余额帐本的状态。ACC-C-0240
     */
    public java.lang.Integer statusCd;

    /**
     * 余额帐本状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 备注
     */
    public java.lang.String remark;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.acctBalanceId = SeqUtils.createLongId(ID_SEQ);
         return this.acctBalanceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 余额帐本所属的余额类型。ACC-C-0009
     */
    public void setBalanceTypeId(java.lang.Integer balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
    }

    /**
     * 获取 余额帐本所属的余额类型。ACC-C-0009
     */
    public java.lang.Integer getBalanceTypeId() {
        return this.balanceTypeId;
    }

    /**
     * 设置 余额帐本余额
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }

    /**
     * 获取 余额帐本余额
     */
    public java.lang.Long getBalance() {
        return this.balance;
    }

    /**
     * 设置 预留余额
     */
    public void setReserveBalance(java.lang.Long reserveBalance) {
        this.reserveBalance = reserveBalance;
    }

    /**
     * 获取 预留余额
     */
    public java.lang.Long getReserveBalance() {
        return this.reserveBalance;
    }

    /**
     * 设置 限额类型，LOVB=ACC-C-0010
     */
    public void setCycleType(java.lang.Integer cycleType) {
        this.cycleType = cycleType;
    }

    /**
     * 获取 限额类型，LOVB=ACC-C-0010
     */
    public java.lang.Integer getCycleType() {
        return this.cycleType;
    }

    /**
     * 设置 余额帐本每个帐期可以使用的金额封顶
     */
    public void setCycleUpper(java.lang.Long cycleUpper) {
        this.cycleUpper = cycleUpper;
    }

    /**
     * 获取 余额帐本每个帐期可以使用的金额封顶
     */
    public java.lang.Long getCycleUpper() {
        return this.cycleUpper;
    }

    /**
     * 设置 单个帐期应扣费的最低额。
     */
    public void setCycleLower(java.lang.Long cycleLower) {
        this.cycleLower = cycleLower;
    }

    /**
     * 获取 单个帐期应扣费的最低额。
     */
    public java.lang.Long getCycleLower() {
        return this.cycleLower;
    }

    /**
     * 设置 是否帐户共享帐本，LOVB=ACC-C-0044
     */
    public void setShareRuleFlag(java.lang.Integer shareRuleFlag) {
        this.shareRuleFlag = shareRuleFlag;
    }

    /**
     * 获取 是否帐户共享帐本，LOVB=ACC-C-0044
     */
    public java.lang.Integer getShareRuleFlag() {
        return this.shareRuleFlag;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 余额帐本的状态。ACC-C-0240
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 余额帐本的状态。ACC-C-0240
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 余额帐本状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 余额帐本状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
