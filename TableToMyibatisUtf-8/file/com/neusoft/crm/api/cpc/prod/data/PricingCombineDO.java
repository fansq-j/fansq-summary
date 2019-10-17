package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:一个定价计划可由一个或多个事件定价策略组合而成，一个事件定价策略又可由一个或多个定价计划所引用，此实体描述了定价计划和定
 * @实体表  :PRICING_COMBINE
 */
public class PricingCombineDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_COMBINE_S";

    /**
     * 定价组合的标识
     */
    public java.lang.Integer pricingCombineId;

    /**
     * 定价计划的标识
     */
    public java.lang.Integer pricingPlanId;

    /**
     * 生命周期的标识
     */
    public java.lang.Integer lifeCycleId;

    /**
     * 事件定价策略的标识
     */
    public java.lang.Integer eventPricingStrategyId;

    /**
     * 包含对象标识
     */
    public java.lang.Integer offerObjectId;

    /**
     * 用于与定价组合关系配合，表达不同定价组合之间的计算顺序
     */
    public java.lang.Integer calcPriority;

    /**
     * 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 定价组合的标识
     */
    public void setPricingCombineId(java.lang.Integer pricingCombineId) {
        this.pricingCombineId = pricingCombineId;
    }

    /**
     * 获取 定价组合的标识
     */
    public java.lang.Integer getPricingCombineId() {
        return this.pricingCombineId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingCombineId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingCombineId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 定价计划的标识
     */
    public void setPricingPlanId(java.lang.Integer pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    /**
     * 获取 定价计划的标识
     */
    public java.lang.Integer getPricingPlanId() {
        return this.pricingPlanId;
    }

    /**
     * 设置 生命周期的标识
     */
    public void setLifeCycleId(java.lang.Integer lifeCycleId) {
        this.lifeCycleId = lifeCycleId;
    }

    /**
     * 获取 生命周期的标识
     */
    public java.lang.Integer getLifeCycleId() {
        return this.lifeCycleId;
    }

    /**
     * 设置 事件定价策略的标识
     */
    public void setEventPricingStrategyId(java.lang.Integer eventPricingStrategyId) {
        this.eventPricingStrategyId = eventPricingStrategyId;
    }

    /**
     * 获取 事件定价策略的标识
     */
    public java.lang.Integer getEventPricingStrategyId() {
        return this.eventPricingStrategyId;
    }

    /**
     * 设置 包含对象标识
     */
    public void setOfferObjectId(java.lang.Integer offerObjectId) {
        this.offerObjectId = offerObjectId;
    }

    /**
     * 获取 包含对象标识
     */
    public java.lang.Integer getOfferObjectId() {
        return this.offerObjectId;
    }

    /**
     * 设置 用于与定价组合关系配合，表达不同定价组合之间的计算顺序
     */
    public void setCalcPriority(java.lang.Integer calcPriority) {
        this.calcPriority = calcPriority;
    }

    /**
     * 获取 用于与定价组合关系配合，表达不同定价组合之间的计算顺序
     */
    public java.lang.Integer getCalcPriority() {
        return this.calcPriority;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
