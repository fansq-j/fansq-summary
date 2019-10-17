package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述违约金计算的规则。
 * @实体表  :LATE_FEE_COMPUTE_RULE
 */
public class LateFeeComputeRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LATE_FEE_COMPUTE_RULE_S";

    /**
     * 记录违约金计算规则的唯一编号。
     */
    public java.lang.Integer lateFeeRuleId;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 产品标识，产品标识为-1代表不分产品
     */
    public java.lang.Integer prodId;

    /**
     * LOVB=PRI-0001
     */
    public java.lang.String paymentModeCd;

    /**
     * 收费周期偏移量（帐期）
     */
    public java.lang.Integer offset;

    /**
     * 调整偏移量（天）
     */
    public java.lang.Integer adjustDays;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态 。 LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 记录违约金计算规则的唯一编号。
     */
    public void setLateFeeRuleId(java.lang.Integer lateFeeRuleId) {
        this.lateFeeRuleId = lateFeeRuleId;
    }

    /**
     * 获取 记录违约金计算规则的唯一编号。
     */
    public java.lang.Integer getLateFeeRuleId() {
        return this.lateFeeRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.lateFeeRuleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.lateFeeRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
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
     * 设置 产品标识，产品标识为-1代表不分产品
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品标识，产品标识为-1代表不分产品
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 LOVB=PRI-0001
     */
    public void setPaymentModeCd(java.lang.String paymentModeCd) {
        this.paymentModeCd = paymentModeCd;
    }

    /**
     * 获取 LOVB=PRI-0001
     */
    public java.lang.String getPaymentModeCd() {
        return this.paymentModeCd;
    }

    /**
     * 设置 收费周期偏移量（帐期）
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }

    /**
     * 获取 收费周期偏移量（帐期）
     */
    public java.lang.Integer getOffset() {
        return this.offset;
    }

    /**
     * 设置 调整偏移量（天）
     */
    public void setAdjustDays(java.lang.Integer adjustDays) {
        this.adjustDays = adjustDays;
    }

    /**
     * 获取 调整偏移量（天）
     */
    public java.lang.Integer getAdjustDays() {
        return this.adjustDays;
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

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
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
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
