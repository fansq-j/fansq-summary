package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:帐目对应收入列账的财务科目、税率。
 * @实体表  :TAX_INVOICE_FEE
 */
public class TaxInvoiceFeeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TAX_INVOICE_FEE_S";

    /**
     * 对应帐目表的ORI_ACCT_ITEM_ID
     */
    public java.lang.Long acctItemId;

    /**
     * 税率
     */
    public java.lang.Double taxRate;

    /**
     * 税额
     */
    public java.lang.Long rateCharge;

    /**
     * 税后金额
     */
    public java.lang.Long afterRateCharge;

    /**
     * 税目标识
     */
    public java.lang.Integer taxItemId;

    /**
     * 设置 对应帐目表的ORI_ACCT_ITEM_ID
     */
    public void setAcctItemId(java.lang.Long acctItemId) {
        this.acctItemId = acctItemId;
    }

    /**
     * 获取 对应帐目表的ORI_ACCT_ITEM_ID
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
     * 设置 税率
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 获取 税率
     */
    public java.lang.Double getTaxRate() {
        return this.taxRate;
    }

    /**
     * 设置 税额
     */
    public void setRateCharge(java.lang.Long rateCharge) {
        this.rateCharge = rateCharge;
    }

    /**
     * 获取 税额
     */
    public java.lang.Long getRateCharge() {
        return this.rateCharge;
    }

    /**
     * 设置 税后金额
     */
    public void setAfterRateCharge(java.lang.Long afterRateCharge) {
        this.afterRateCharge = afterRateCharge;
    }

    /**
     * 获取 税后金额
     */
    public java.lang.Long getAfterRateCharge() {
        return this.afterRateCharge;
    }

    /**
     * 设置 税目标识
     */
    public void setTaxItemId(java.lang.Integer taxItemId) {
        this.taxItemId = taxItemId;
    }

    /**
     * 获取 税目标识
     */
    public java.lang.Integer getTaxItemId() {
        return this.taxItemId;
    }

}
