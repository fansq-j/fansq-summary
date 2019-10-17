package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述违约金调整的明细。
 * @实体表  :LATE_FEE_ADJUST
 */
public class LateFeeAdjustDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LATE_FEE_ADJUST_S";

    /**
     * 减免标识，主键
     */
    public java.lang.Long lateFeeAdjustId;

    /**
     * 电信帐户标识，外键
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 记录帐务周期标识。
     */
    public java.lang.Integer billingCycleId;

    /**
     * 减免方式，按0帐户减免、1按用户减免
     */
    public java.lang.Integer adjustFlag;

    /**
     * LOVB=ACC-C-0181
     */
    public java.lang.Integer adjustType;

    /**
     * 减免的数值
     */
    public java.lang.Integer adjustValue;

    /**
     * 计算违约金的结果值
     */
    public java.lang.Integer rowValue;

    /**
     * 关连的销帐流水号
     */
    public java.lang.Long billId;

    /**
     * LOVB=ACC-C-0182
     */
    public java.lang.Integer statusCd;

    /**
     * 状态时间.
     */
    public java.util.Date statusDate;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 减免原因
     */
    public java.lang.String adjustReason;

    /**
     * 设置 减免标识，主键
     */
    public void setLateFeeAdjustId(java.lang.Long lateFeeAdjustId) {
        this.lateFeeAdjustId = lateFeeAdjustId;
    }

    /**
     * 获取 减免标识，主键
     */
    public java.lang.Long getLateFeeAdjustId() {
        return this.lateFeeAdjustId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.lateFeeAdjustId = SeqUtils.createLongId(ID_SEQ);
         return this.lateFeeAdjustId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 电信帐户标识，外键
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 电信帐户标识，外键
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
     * 设置 记录帐务周期标识。
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 记录帐务周期标识。
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 减免方式，按0帐户减免、1按用户减免
     */
    public void setAdjustFlag(java.lang.Integer adjustFlag) {
        this.adjustFlag = adjustFlag;
    }

    /**
     * 获取 减免方式，按0帐户减免、1按用户减免
     */
    public java.lang.Integer getAdjustFlag() {
        return this.adjustFlag;
    }

    /**
     * 设置 LOVB=ACC-C-0181
     */
    public void setAdjustType(java.lang.Integer adjustType) {
        this.adjustType = adjustType;
    }

    /**
     * 获取 LOVB=ACC-C-0181
     */
    public java.lang.Integer getAdjustType() {
        return this.adjustType;
    }

    /**
     * 设置 减免的数值
     */
    public void setAdjustValue(java.lang.Integer adjustValue) {
        this.adjustValue = adjustValue;
    }

    /**
     * 获取 减免的数值
     */
    public java.lang.Integer getAdjustValue() {
        return this.adjustValue;
    }

    /**
     * 设置 计算违约金的结果值
     */
    public void setRowValue(java.lang.Integer rowValue) {
        this.rowValue = rowValue;
    }

    /**
     * 获取 计算违约金的结果值
     */
    public java.lang.Integer getRowValue() {
        return this.rowValue;
    }

    /**
     * 设置 关连的销帐流水号
     */
    public void setBillId(java.lang.Long billId) {
        this.billId = billId;
    }

    /**
     * 获取 关连的销帐流水号
     */
    public java.lang.Long getBillId() {
        return this.billId;
    }

    /**
     * 设置 LOVB=ACC-C-0182
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0182
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态时间.
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间.
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 减免原因
     */
    public void setAdjustReason(java.lang.String adjustReason) {
        this.adjustReason = adjustReason;
    }

    /**
     * 获取 减免原因
     */
    public java.lang.String getAdjustReason() {
        return this.adjustReason;
    }

}
