package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义积分调帐接口表，用于积分清单调帐和积分帐单调帐使用，当积分帐单调帐时使用不到的字段可为空
 * @实体表  :SETTLE_SCORE_ADJUST
 */
public class SettleScoreAdjustDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETTLE_SCORE_ADJUST_S";

    /**
     * 渠道佣金手工积分标识，主键序列
            针对原有的积分清单记录进行调帐，需要插入一条负的调帐记录
     */
    public java.lang.Long settleScoreAdjustId;

    /**
     * 记录结算对象类型，LOVB=ACC-C-0230
            1 工号，2 网点，3 合作伙伴
     */
    public java.lang.Integer settleObjType;

    /**
     * 佣金结算对象标识，结算对象可为渠道标识、经营主体标识、员工标识
     */
    public java.lang.Long settleObjId;

    /**
     * 引用定价子域中事件定价策略主键标识
     */
    public java.lang.Integer eventPricingStrategyId;

    /**
     * 佣金积分类型标识，引用佣金积分类型实体主键
     */
    public java.lang.Integer settScoreTypeId;

    /**
     * 渠道佣金调账积分值
     */
    public java.lang.Integer settScoreValue;

    /**
     * 帐期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

    /**
     * 调账说明
     */
    public java.lang.String remark;

    /**
     * 记录状态编码。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 调帐记录录入员工
     */
    public java.lang.Long inStaffId;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录记录最新状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 渠道佣金手工积分标识，主键序列
            针对原有的积分清单记录进行调帐，需要插入一条负的调帐记录
     */
    public void setSettleScoreAdjustId(java.lang.Long settleScoreAdjustId) {
        this.settleScoreAdjustId = settleScoreAdjustId;
    }

    /**
     * 获取 渠道佣金手工积分标识，主键序列
            针对原有的积分清单记录进行调帐，需要插入一条负的调帐记录
     */
    public java.lang.Long getSettleScoreAdjustId() {
        return this.settleScoreAdjustId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settleScoreAdjustId = SeqUtils.createLongId(ID_SEQ);
         return this.settleScoreAdjustId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录结算对象类型，LOVB=ACC-C-0230
            1 工号，2 网点，3 合作伙伴
     */
    public void setSettleObjType(java.lang.Integer settleObjType) {
        this.settleObjType = settleObjType;
    }

    /**
     * 获取 记录结算对象类型，LOVB=ACC-C-0230
            1 工号，2 网点，3 合作伙伴
     */
    public java.lang.Integer getSettleObjType() {
        return this.settleObjType;
    }

    /**
     * 设置 佣金结算对象标识，结算对象可为渠道标识、经营主体标识、员工标识
     */
    public void setSettleObjId(java.lang.Long settleObjId) {
        this.settleObjId = settleObjId;
    }

    /**
     * 获取 佣金结算对象标识，结算对象可为渠道标识、经营主体标识、员工标识
     */
    public java.lang.Long getSettleObjId() {
        return this.settleObjId;
    }

    /**
     * 设置 引用定价子域中事件定价策略主键标识
     */
    public void setEventPricingStrategyId(java.lang.Integer eventPricingStrategyId) {
        this.eventPricingStrategyId = eventPricingStrategyId;
    }

    /**
     * 获取 引用定价子域中事件定价策略主键标识
     */
    public java.lang.Integer getEventPricingStrategyId() {
        return this.eventPricingStrategyId;
    }

    /**
     * 设置 佣金积分类型标识，引用佣金积分类型实体主键
     */
    public void setSettScoreTypeId(java.lang.Integer settScoreTypeId) {
        this.settScoreTypeId = settScoreTypeId;
    }

    /**
     * 获取 佣金积分类型标识，引用佣金积分类型实体主键
     */
    public java.lang.Integer getSettScoreTypeId() {
        return this.settScoreTypeId;
    }

    /**
     * 设置 渠道佣金调账积分值
     */
    public void setSettScoreValue(java.lang.Integer settScoreValue) {
        this.settScoreValue = settScoreValue;
    }

    /**
     * 获取 渠道佣金调账积分值
     */
    public java.lang.Integer getSettScoreValue() {
        return this.settScoreValue;
    }

    /**
     * 设置 帐期标识
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 帐期标识
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 记录生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 调账说明
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 调账说明
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 记录状态编码。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态编码。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 调帐记录录入员工
     */
    public void setInStaffId(java.lang.Long inStaffId) {
        this.inStaffId = inStaffId;
    }

    /**
     * 获取 调帐记录录入员工
     */
    public java.lang.Long getInStaffId() {
        return this.inStaffId;
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
     * 设置 记录记录最新状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录记录最新状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
