package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录余额帐本的每一笔收入来源.

 * @实体表  :BALANCE_SOURCE
 */
public class BalanceSourceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_SOURCE_S";

    /**
     * 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long operIncomeId;

    /**
     * 操作流水所对应的余额帐本标识
     */
    public java.lang.Long acctBalanceId;

    /**
     * 操作类型，LOVB=ACC-C-0011
     */
    public java.lang.String operType;

    /**
     * 操作员的员工标识
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
     * AMOUNT是本次预存的金额，同PAYMENT.DEPOSIT_AMOUNT预存金额，此字段不会变化。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
     */
    public java.lang.Long amount;

    /**
     * BALANCE是充值操作后余额帐本的余额，此字段不会变化。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
     */
    public java.lang.Long balance;

    /**
     * CUR_AMOUNT在充值时同AMOUNT，每次销帐后更新为该来源的剩余金额。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
            
     */
    public java.lang.Long curAmount;

    /**
     * 余额对象帐本关系标识
     */
    public java.lang.Long balanceRelationId;

    /**
     * 来源类型标识，LOVB=ACC-C-0012
     */
    public java.lang.Integer balanceSourceTypeId;

    /**
     * 当前使用时间
     */
    public java.util.Date curStatusDate;

    /**
     * 处理状态，LOVB=ACC-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 状态发生改变的时间
     */
    public java.util.Date statusDate;

    /**
     * 和payment的付款流水号对应
     */
    public java.lang.Long paymentId;

    /**
     * 余额存入时的来源描述，用于查询、数据统计
     */
    public java.lang.String sourceDesc;

    /**
     * 赠送规则的标识
     */
    public java.lang.Integer presentRuleId;

    /**
     * 预存赠送对应的销售品实例标识，与余额预存赠送规则标识同时存在
     */
    public java.lang.Long offerInstId;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.operIncomeId = SeqUtils.createLongId(ID_SEQ);
         return this.operIncomeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 操作流水所对应的余额帐本标识
     */
    public void setAcctBalanceId(java.lang.Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    /**
     * 获取 操作流水所对应的余额帐本标识
     */
    public java.lang.Long getAcctBalanceId() {
        return this.acctBalanceId;
    }

    /**
     * 设置 操作类型，LOVB=ACC-C-0011
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，LOVB=ACC-C-0011
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 操作员的员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 操作员的员工标识
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
     * 设置 AMOUNT是本次预存的金额，同PAYMENT.DEPOSIT_AMOUNT预存金额，此字段不会变化。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 AMOUNT是本次预存的金额，同PAYMENT.DEPOSIT_AMOUNT预存金额，此字段不会变化。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 BALANCE是充值操作后余额帐本的余额，此字段不会变化。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }

    /**
     * 获取 BALANCE是充值操作后余额帐本的余额，此字段不会变化。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
     */
    public java.lang.Long getBalance() {
        return this.balance;
    }

    /**
     * 设置 CUR_AMOUNT在充值时同AMOUNT，每次销帐后更新为该来源的剩余金额。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
            
     */
    public void setCurAmount(java.lang.Long curAmount) {
        this.curAmount = curAmount;
    }

    /**
     * 获取 CUR_AMOUNT在充值时同AMOUNT，每次销帐后更新为该来源的剩余金额。例1：现有余额10元，缴费100元，'金额'填100元，'操作后余额'填110元；'剩余余额'填100元；例2：先销帐，剩余金额转预存缴费100元，销帐10元，'金额'填90元，'操作后余额'填90元；'剩余余额'填90元；例3：先充值，再做余额销帐；充值100元，'金额'填100元，'操作后余额'填100元，'剩余余额'填100元；触发余额销帐10元，'金额'不变，'操作后余额'不变；'剩余余额'填90元
            
     */
    public java.lang.Long getCurAmount() {
        return this.curAmount;
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
     * 设置 来源类型标识，LOVB=ACC-C-0012
     */
    public void setBalanceSourceTypeId(java.lang.Integer balanceSourceTypeId) {
        this.balanceSourceTypeId = balanceSourceTypeId;
    }

    /**
     * 获取 来源类型标识，LOVB=ACC-C-0012
     */
    public java.lang.Integer getBalanceSourceTypeId() {
        return this.balanceSourceTypeId;
    }

    /**
     * 设置 当前使用时间
     */
    public void setCurStatusDate(java.util.Date curStatusDate) {
        this.curStatusDate = curStatusDate;
    }

    /**
     * 获取 当前使用时间
     */
    public java.util.Date getCurStatusDate() {
        return this.curStatusDate;
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

    /**
     * 设置 和payment的付款流水号对应
     */
    public void setPaymentId(java.lang.Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取 和payment的付款流水号对应
     */
    public java.lang.Long getPaymentId() {
        return this.paymentId;
    }

    /**
     * 设置 余额存入时的来源描述，用于查询、数据统计
     */
    public void setSourceDesc(java.lang.String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    /**
     * 获取 余额存入时的来源描述，用于查询、数据统计
     */
    public java.lang.String getSourceDesc() {
        return this.sourceDesc;
    }

    /**
     * 设置 赠送规则的标识
     */
    public void setPresentRuleId(java.lang.Integer presentRuleId) {
        this.presentRuleId = presentRuleId;
    }

    /**
     * 获取 赠送规则的标识
     */
    public java.lang.Integer getPresentRuleId() {
        return this.presentRuleId;
    }

    /**
     * 设置 预存赠送对应的销售品实例标识，与余额预存赠送规则标识同时存在
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 预存赠送对应的销售品实例标识，与余额预存赠送规则标识同时存在
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

}
