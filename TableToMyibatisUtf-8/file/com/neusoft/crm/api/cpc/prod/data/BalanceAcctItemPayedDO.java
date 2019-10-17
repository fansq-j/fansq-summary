package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:如果是扣款销帐，记录扣款时使用余额的详细帐目。
 * @实体表  :BALANCE_ACCT_ITEM_PAYED
 */
public class BalanceAcctItemPayedDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_ACCT_ITEM_PAYED_S";

    /**
     * 为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long operPayoutId;

    /**
     * 余额支出对应的帐目标识
     */
    public java.lang.Long acctItemId;

    /**
     * 操作后余额帐本的余额
     */
    public java.lang.Long balance;

    /**
     * LOVB=ACC-C-0005
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
     * 设置 余额支出对应的帐目标识
     */
    public void setAcctItemId(java.lang.Long acctItemId) {
        this.acctItemId = acctItemId;
    }

    /**
     * 获取 余额支出对应的帐目标识
     */
    public java.lang.Long getAcctItemId() {
        return this.acctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.acctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.acctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 LOVB=ACC-C-0005
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0005
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
