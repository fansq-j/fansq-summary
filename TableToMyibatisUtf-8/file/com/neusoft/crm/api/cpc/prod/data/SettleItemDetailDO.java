package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录佣金业务订单根据佣金定价计算的佣金清单结果信息，包括业务有：新发展用户，新装套餐类，维系类，达量类，合作分成等。
 * @实体表  :SETTLE_ITEM_DETAIL
 */
public class SettleItemDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETTLE_ITEM_DETAIL_S";

    /**
     * 佣金结算清单标识，主键序列
     */
    public java.lang.Long settleDetailId;

    /**
     * 记录结算对象类型，LOVB=ACC-C-0235
            1 工号，2 网点/渠道，3 合作伙伴
     */
    public java.lang.Integer settleObjType;

    /**
     * 佣金结算对象标识，结算对象可为渠道标识、经营主体标识、员工标识
     */
    public java.lang.Long settleObjId;

    /**
     * 帐目类型标识
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 帐期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 事件定价策略标识，引用定价子域 事件定价策略实体的主键。
     */
    public java.lang.Integer eventPricingStrategyId;

    /**
     * 佣金结果金额，单位：分
     */
    public java.lang.Long charge;

    /**
     * 佣金结算事件类型标识，引用计费事件子域中 目标事件类型实体的主键。
     */
    public java.lang.Integer eventTypeId;

    /**
     * 是否为调帐记录标识 LOVB=ACC-C-0237，1.否、2.是
            
     */
    public java.lang.Integer adjustFlag;

    /**
     * 表示该资费标准向哪个付费方收取费用。PRC-C-0037
     */
    public java.lang.Integer settChargePartyId;

    /**
     * 佣金结算账单实体帐单标识主键，汇总帐单后回填佣金帐单标识
     */
    public java.lang.Long settleItemId;

    /**
     * 调账原始帐期
     */
    public java.lang.Integer orgBillingCycleId;

    /**
     * 佣金调帐时，记录所调帐的佣金清单标识
     */
    public java.lang.Long orgSettleDetailId;

    /**
     * 用户归属本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 记录生成时间。
     */
    public java.util.Date createdDate;

    /**
     * 状态(LOVB=ACC-C-0236，0-未审核；100 已审核；200 列帐；300、支付）
            审核、列帐、支付根据实际情况进行细化
     */
    public java.lang.Integer payState;

    /**
     * 记录支付状态更新时间。
     */
    public java.util.Date payStateDate;

    /**
     * 揽装工号
     */
    public java.lang.Long salesId;

    /**
     * 记录订单受理员工，引用员工子域 员工实体的主键
     */
    public java.lang.Long staffId;

    /**
     * 号码信息
     */
    public java.lang.String accNbr;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 产品标识
     */
    public java.lang.Long prodId;

    /**
     * 用于财务列帐使用，LOVB=ACC-C-0238，0 成本，如：酬金结算、1 减收，如：SP/CP分成
     */
    public java.lang.Integer costFlag;

    /**
     * 销售品标识
     */
    public java.lang.Long offerId;

    /**
     * 订单标识
     */
    public java.lang.Long orderId;

    /**
     * 订单受理时间
     */
    public java.util.Date orderDate;

    /**
     * 设置 佣金结算清单标识，主键序列
     */
    public void setSettleDetailId(java.lang.Long settleDetailId) {
        this.settleDetailId = settleDetailId;
    }

    /**
     * 获取 佣金结算清单标识，主键序列
     */
    public java.lang.Long getSettleDetailId() {
        return this.settleDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settleDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.settleDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录结算对象类型，LOVB=ACC-C-0235
            1 工号，2 网点/渠道，3 合作伙伴
     */
    public void setSettleObjType(java.lang.Integer settleObjType) {
        this.settleObjType = settleObjType;
    }

    /**
     * 获取 记录结算对象类型，LOVB=ACC-C-0235
            1 工号，2 网点/渠道，3 合作伙伴
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
     * 设置 事件定价策略标识，引用定价子域 事件定价策略实体的主键。
     */
    public void setEventPricingStrategyId(java.lang.Integer eventPricingStrategyId) {
        this.eventPricingStrategyId = eventPricingStrategyId;
    }

    /**
     * 获取 事件定价策略标识，引用定价子域 事件定价策略实体的主键。
     */
    public java.lang.Integer getEventPricingStrategyId() {
        return this.eventPricingStrategyId;
    }

    /**
     * 设置 佣金结果金额，单位：分
     */
    public void setCharge(java.lang.Long charge) {
        this.charge = charge;
    }

    /**
     * 获取 佣金结果金额，单位：分
     */
    public java.lang.Long getCharge() {
        return this.charge;
    }

    /**
     * 设置 佣金结算事件类型标识，引用计费事件子域中 目标事件类型实体的主键。
     */
    public void setEventTypeId(java.lang.Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 获取 佣金结算事件类型标识，引用计费事件子域中 目标事件类型实体的主键。
     */
    public java.lang.Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * 设置 是否为调帐记录标识 LOVB=ACC-C-0237，1.否、2.是
            
     */
    public void setAdjustFlag(java.lang.Integer adjustFlag) {
        this.adjustFlag = adjustFlag;
    }

    /**
     * 获取 是否为调帐记录标识 LOVB=ACC-C-0237，1.否、2.是
            
     */
    public java.lang.Integer getAdjustFlag() {
        return this.adjustFlag;
    }

    /**
     * 设置 表示该资费标准向哪个付费方收取费用。PRC-C-0037
     */
    public void setSettChargePartyId(java.lang.Integer settChargePartyId) {
        this.settChargePartyId = settChargePartyId;
    }

    /**
     * 获取 表示该资费标准向哪个付费方收取费用。PRC-C-0037
     */
    public java.lang.Integer getSettChargePartyId() {
        return this.settChargePartyId;
    }

    /**
     * 设置 佣金结算账单实体帐单标识主键，汇总帐单后回填佣金帐单标识
     */
    public void setSettleItemId(java.lang.Long settleItemId) {
        this.settleItemId = settleItemId;
    }

    /**
     * 获取 佣金结算账单实体帐单标识主键，汇总帐单后回填佣金帐单标识
     */
    public java.lang.Long getSettleItemId() {
        return this.settleItemId;
    }

    /**
     * 设置 调账原始帐期
     */
    public void setOrgBillingCycleId(java.lang.Integer orgBillingCycleId) {
        this.orgBillingCycleId = orgBillingCycleId;
    }

    /**
     * 获取 调账原始帐期
     */
    public java.lang.Integer getOrgBillingCycleId() {
        return this.orgBillingCycleId;
    }

    /**
     * 设置 佣金调帐时，记录所调帐的佣金清单标识
     */
    public void setOrgSettleDetailId(java.lang.Long orgSettleDetailId) {
        this.orgSettleDetailId = orgSettleDetailId;
    }

    /**
     * 获取 佣金调帐时，记录所调帐的佣金清单标识
     */
    public java.lang.Long getOrgSettleDetailId() {
        return this.orgSettleDetailId;
    }

    /**
     * 设置 用户归属本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 用户归属本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 记录生成时间。
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取 记录生成时间。
     */
    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * 设置 状态(LOVB=ACC-C-0236，0-未审核；100 已审核；200 列帐；300、支付）
            审核、列帐、支付根据实际情况进行细化
     */
    public void setPayState(java.lang.Integer payState) {
        this.payState = payState;
    }

    /**
     * 获取 状态(LOVB=ACC-C-0236，0-未审核；100 已审核；200 列帐；300、支付）
            审核、列帐、支付根据实际情况进行细化
     */
    public java.lang.Integer getPayState() {
        return this.payState;
    }

    /**
     * 设置 记录支付状态更新时间。
     */
    public void setPayStateDate(java.util.Date payStateDate) {
        this.payStateDate = payStateDate;
    }

    /**
     * 获取 记录支付状态更新时间。
     */
    public java.util.Date getPayStateDate() {
        return this.payStateDate;
    }

    /**
     * 设置 揽装工号
     */
    public void setSalesId(java.lang.Long salesId) {
        this.salesId = salesId;
    }

    /**
     * 获取 揽装工号
     */
    public java.lang.Long getSalesId() {
        return this.salesId;
    }

    /**
     * 设置 记录订单受理员工，引用员工子域 员工实体的主键
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 记录订单受理员工，引用员工子域 员工实体的主键
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 号码信息
     */
    public void setAccNbr(java.lang.String accNbr) {
        this.accNbr = accNbr;
    }

    /**
     * 获取 号码信息
     */
    public java.lang.String getAccNbr() {
        return this.accNbr;
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
     * 设置 产品标识
     */
    public void setProdId(java.lang.Long prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品标识
     */
    public java.lang.Long getProdId() {
        return this.prodId;
    }

    /**
     * 设置 用于财务列帐使用，LOVB=ACC-C-0238，0 成本，如：酬金结算、1 减收，如：SP/CP分成
     */
    public void setCostFlag(java.lang.Integer costFlag) {
        this.costFlag = costFlag;
    }

    /**
     * 获取 用于财务列帐使用，LOVB=ACC-C-0238，0 成本，如：酬金结算、1 减收，如：SP/CP分成
     */
    public java.lang.Integer getCostFlag() {
        return this.costFlag;
    }

    /**
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Long getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 订单标识
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取 订单标识
     */
    public java.lang.Long getOrderId() {
        return this.orderId;
    }

    /**
     * 设置 订单受理时间
     */
    public void setOrderDate(java.util.Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取 订单受理时间
     */
    public java.util.Date getOrderDate() {
        return this.orderDate;
    }

}
