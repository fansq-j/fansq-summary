package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录优惠券的使用规则信息
 * @实体表  :COUPON_DISCOUNT_RULE
 */
public class CouponDiscountRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COUPON_DISCOUNT_RULE_S";

    /**
     * 抵扣规则标识
     */
    public java.lang.Long discountRuleId;

    /**
     * 优惠券标识
     */
    public java.lang.Integer mktResId;

    /**
     * 记录抵扣的固定金额或折扣
     */
    public java.lang.Integer discountValue;

    /**
     * 记录抵扣的上限
     */
    public java.lang.Integer maxValue;

    /**
     * 记录抵扣的下限
     */
    public java.lang.Integer minValue;

    /**
     * 记录使用优惠券需要满足的条件
     */
    public java.lang.Integer ruleAmount;

    /**
     * 记录优惠券的使用类型LOVB=RES-C-0045
            
            商品、商铺内、总额
     */
    public java.lang.String useType;

    /**
     * 标志同一个优惠券的多个优惠券实例是否可叠加使用。LOVB=PUB-C-0006
     */
    public java.lang.String reuseFlag;

    /**
     * 标志不同优惠券的多个实例是否可混合使用。LOVB=PUB-C-0006
     */
    public java.lang.String mixUseFlag;

    /**
     * 抵扣规则描述
     */
    public java.lang.String discountRuleDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 抵扣规则标识
     */
    public void setDiscountRuleId(java.lang.Long discountRuleId) {
        this.discountRuleId = discountRuleId;
    }

    /**
     * 获取 抵扣规则标识
     */
    public java.lang.Long getDiscountRuleId() {
        return this.discountRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.discountRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.discountRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 优惠券标识
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 优惠券标识
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 记录抵扣的固定金额或折扣
     */
    public void setDiscountValue(java.lang.Integer discountValue) {
        this.discountValue = discountValue;
    }

    /**
     * 获取 记录抵扣的固定金额或折扣
     */
    public java.lang.Integer getDiscountValue() {
        return this.discountValue;
    }

    /**
     * 设置 记录抵扣的上限
     */
    public void setMaxValue(java.lang.Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取 记录抵扣的上限
     */
    public java.lang.Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * 设置 记录抵扣的下限
     */
    public void setMinValue(java.lang.Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * 获取 记录抵扣的下限
     */
    public java.lang.Integer getMinValue() {
        return this.minValue;
    }

    /**
     * 设置 记录使用优惠券需要满足的条件
     */
    public void setRuleAmount(java.lang.Integer ruleAmount) {
        this.ruleAmount = ruleAmount;
    }

    /**
     * 获取 记录使用优惠券需要满足的条件
     */
    public java.lang.Integer getRuleAmount() {
        return this.ruleAmount;
    }

    /**
     * 设置 记录优惠券的使用类型LOVB=RES-C-0045
            
            商品、商铺内、总额
     */
    public void setUseType(java.lang.String useType) {
        this.useType = useType;
    }

    /**
     * 获取 记录优惠券的使用类型LOVB=RES-C-0045
            
            商品、商铺内、总额
     */
    public java.lang.String getUseType() {
        return this.useType;
    }

    /**
     * 设置 标志同一个优惠券的多个优惠券实例是否可叠加使用。LOVB=PUB-C-0006
     */
    public void setReuseFlag(java.lang.String reuseFlag) {
        this.reuseFlag = reuseFlag;
    }

    /**
     * 获取 标志同一个优惠券的多个优惠券实例是否可叠加使用。LOVB=PUB-C-0006
     */
    public java.lang.String getReuseFlag() {
        return this.reuseFlag;
    }

    /**
     * 设置 标志不同优惠券的多个实例是否可混合使用。LOVB=PUB-C-0006
     */
    public void setMixUseFlag(java.lang.String mixUseFlag) {
        this.mixUseFlag = mixUseFlag;
    }

    /**
     * 获取 标志不同优惠券的多个实例是否可混合使用。LOVB=PUB-C-0006
     */
    public java.lang.String getMixUseFlag() {
        return this.mixUseFlag;
    }

    /**
     * 设置 抵扣规则描述
     */
    public void setDiscountRuleDesc(java.lang.String discountRuleDesc) {
        this.discountRuleDesc = discountRuleDesc;
    }

    /**
     * 获取 抵扣规则描述
     */
    public java.lang.String getDiscountRuleDesc() {
        return this.discountRuleDesc;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
