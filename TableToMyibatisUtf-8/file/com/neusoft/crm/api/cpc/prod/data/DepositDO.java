package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述用户的押金的明细。
 * @实体表  :DEPOSIT
 */
public class DepositDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEPOSIT_S";

    /**
     * 记录押金帐本的唯一编号。
     */
    public java.lang.Long depositBalanceId;

    /**
     * 押金类型
     */
    public java.lang.Integer depositTypeId;

    /**
     * 所属的通信帐户标识。
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 原始存入的金额
     */
    public java.lang.Long oriAmount;

    /**
     * 现有的金额
     */
    public java.lang.Long amount;

    /**
     * 数据创建时间
     */
    public java.util.Date createDate;

    /**
     * 允许提现的日期
     */
    public java.util.Date allowPaeyDate;

    /**
     * 分局标识
     */
    public java.lang.Integer bureauId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * LOVB=ACC-C-0189
     */
    public java.lang.Integer statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 设置 记录押金帐本的唯一编号。
     */
    public void setDepositBalanceId(java.lang.Long depositBalanceId) {
        this.depositBalanceId = depositBalanceId;
    }

    /**
     * 获取 记录押金帐本的唯一编号。
     */
    public java.lang.Long getDepositBalanceId() {
        return this.depositBalanceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.depositBalanceId = SeqUtils.createLongId(ID_SEQ);
         return this.depositBalanceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 押金类型
     */
    public void setDepositTypeId(java.lang.Integer depositTypeId) {
        this.depositTypeId = depositTypeId;
    }

    /**
     * 获取 押金类型
     */
    public java.lang.Integer getDepositTypeId() {
        return this.depositTypeId;
    }

    /**
     * 设置 所属的通信帐户标识。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 所属的通信帐户标识。
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
     * 设置 原始存入的金额
     */
    public void setOriAmount(java.lang.Long oriAmount) {
        this.oriAmount = oriAmount;
    }

    /**
     * 获取 原始存入的金额
     */
    public java.lang.Long getOriAmount() {
        return this.oriAmount;
    }

    /**
     * 设置 现有的金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 现有的金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 数据创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 数据创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 允许提现的日期
     */
    public void setAllowPaeyDate(java.util.Date allowPaeyDate) {
        this.allowPaeyDate = allowPaeyDate;
    }

    /**
     * 获取 允许提现的日期
     */
    public java.util.Date getAllowPaeyDate() {
        return this.allowPaeyDate;
    }

    /**
     * 设置 分局标识
     */
    public void setBureauId(java.lang.Integer bureauId) {
        this.bureauId = bureauId;
    }

    /**
     * 获取 分局标识
     */
    public java.lang.Integer getBureauId() {
        return this.bureauId;
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
     * 设置 LOVB=ACC-C-0189
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0189
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

}
