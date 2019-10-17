package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述调帐产生的帐目数据。
 * @实体表  :ACCT_ITEM_ADJUST
 */
public class AcctItemAdjustDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_ADJUST_S";

    /**
     * 调帐标识
     */
    public java.lang.Long adjustItemId;

    /**
     * 被调帐帐目的标识。
     */
    public java.lang.Long adjustAcctItemId;

    /**
     * 帐户标识。
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 帐务周期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 帐目类型标识
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 帐目来源标识。
     */
    public java.lang.Integer itemSourceId;

    /**
     * LOVB=ACC-C-0025
     */
    public java.lang.Integer adjustType;

    /**
     * 费用项时，为金额值
            非费用项时，为非费用项的值
     */
    public java.lang.Long amount;

    /**
     * LOVB=ACC-C-0026
     */
    public java.lang.Integer statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 调帐标识
     */
    public void setAdjustItemId(java.lang.Long adjustItemId) {
        this.adjustItemId = adjustItemId;
    }

    /**
     * 获取 调帐标识
     */
    public java.lang.Long getAdjustItemId() {
        return this.adjustItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.adjustItemId = SeqUtils.createLongId(ID_SEQ);
         return this.adjustItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 被调帐帐目的标识。
     */
    public void setAdjustAcctItemId(java.lang.Long adjustAcctItemId) {
        this.adjustAcctItemId = adjustAcctItemId;
    }

    /**
     * 获取 被调帐帐目的标识。
     */
    public java.lang.Long getAdjustAcctItemId() {
        return this.adjustAcctItemId;
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
     * 设置 帐务周期标识
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 帐务周期标识
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 帐目类型标识
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 帐目类型标识
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 帐目来源标识。
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 帐目来源标识。
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
    }

    /**
     * 设置 LOVB=ACC-C-0025
     */
    public void setAdjustType(java.lang.Integer adjustType) {
        this.adjustType = adjustType;
    }

    /**
     * 获取 LOVB=ACC-C-0025
     */
    public java.lang.Integer getAdjustType() {
        return this.adjustType;
    }

    /**
     * 设置 费用项时，为金额值
            非费用项时，为非费用项的值
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 费用项时，为金额值
            非费用项时，为非费用项的值
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 LOVB=ACC-C-0026
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0026
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

}
