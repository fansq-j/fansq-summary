package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:网点级帐单的下一层。汇总了一个代理商/一个网点/一个合同/一个帐期/一个费用项下所有费用之和。
 * @实体表  :SETTLE_ITEM
 */
public class SettleItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETTLE_ITEM_S";

    /**
     * 佣金帐单标识，主键序列
     */
    public java.lang.Long settleItemId;

    /**
     * 帐期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 记录结算对象类型，LOVB=ACC-C-0235
            1 工号，2 网点，3 合作伙伴
     */
    public java.lang.Integer settleObjType;

    /**
     * 结算对象实体标识
     */
    public java.lang.Long settleObjId;

    /**
     * 表示该资费标准向哪个付费方收取费用。PRC-C-0037
     */
    public java.lang.Integer settChargePartyId;

    /**
     * 佣金帐单金额，单位／分
     */
    public java.lang.Long amount;

    /**
     * 佣金支付状态(LOVB=ACC-C-0236，0-未审核；100 已审核；200 列帐；300、支付）
            审核、列帐、支付根据实际情况进行细化
     */
    public java.lang.Integer payState;

    /**
     * 记录佣金帐单支付状态更新时间
     */
    public java.util.Date payStateDate;

    /**
     * 是否为调帐记录标识 LOVB=ACC-C-0237
            1.否
            2.是
     */
    public java.lang.Integer adjustFlag;

    /**
     * 调账原始帐期
     */
    public java.lang.Integer orgBillingCycleId;

    /**
     * 记录本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 用于财务列帐使用 LOVB=ACC-C-0238
            0 成本，如：酬金结算
            1 减收，如：SP/CP分成
            
     */
    public java.lang.Integer costFlag;

    /**
     * 设置 佣金帐单标识，主键序列
     */
    public void setSettleItemId(java.lang.Long settleItemId) {
        this.settleItemId = settleItemId;
    }

    /**
     * 获取 佣金帐单标识，主键序列
     */
    public java.lang.Long getSettleItemId() {
        return this.settleItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settleItemId = SeqUtils.createLongId(ID_SEQ);
         return this.settleItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 记录结算对象类型，LOVB=ACC-C-0235
            1 工号，2 网点，3 合作伙伴
     */
    public void setSettleObjType(java.lang.Integer settleObjType) {
        this.settleObjType = settleObjType;
    }

    /**
     * 获取 记录结算对象类型，LOVB=ACC-C-0235
            1 工号，2 网点，3 合作伙伴
     */
    public java.lang.Integer getSettleObjType() {
        return this.settleObjType;
    }

    /**
     * 设置 结算对象实体标识
     */
    public void setSettleObjId(java.lang.Long settleObjId) {
        this.settleObjId = settleObjId;
    }

    /**
     * 获取 结算对象实体标识
     */
    public java.lang.Long getSettleObjId() {
        return this.settleObjId;
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
     * 设置 佣金帐单金额，单位／分
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 佣金帐单金额，单位／分
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 佣金支付状态(LOVB=ACC-C-0236，0-未审核；100 已审核；200 列帐；300、支付）
            审核、列帐、支付根据实际情况进行细化
     */
    public void setPayState(java.lang.Integer payState) {
        this.payState = payState;
    }

    /**
     * 获取 佣金支付状态(LOVB=ACC-C-0236，0-未审核；100 已审核；200 列帐；300、支付）
            审核、列帐、支付根据实际情况进行细化
     */
    public java.lang.Integer getPayState() {
        return this.payState;
    }

    /**
     * 设置 记录佣金帐单支付状态更新时间
     */
    public void setPayStateDate(java.util.Date payStateDate) {
        this.payStateDate = payStateDate;
    }

    /**
     * 获取 记录佣金帐单支付状态更新时间
     */
    public java.util.Date getPayStateDate() {
        return this.payStateDate;
    }

    /**
     * 设置 是否为调帐记录标识 LOVB=ACC-C-0237
            1.否
            2.是
     */
    public void setAdjustFlag(java.lang.Integer adjustFlag) {
        this.adjustFlag = adjustFlag;
    }

    /**
     * 获取 是否为调帐记录标识 LOVB=ACC-C-0237
            1.否
            2.是
     */
    public java.lang.Integer getAdjustFlag() {
        return this.adjustFlag;
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
     * 设置 记录本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 用于财务列帐使用 LOVB=ACC-C-0238
            0 成本，如：酬金结算
            1 减收，如：SP/CP分成
            
     */
    public void setCostFlag(java.lang.Integer costFlag) {
        this.costFlag = costFlag;
    }

    /**
     * 获取 用于财务列帐使用 LOVB=ACC-C-0238
            0 成本，如：酬金结算
            1 减收，如：SP/CP分成
            
     */
    public java.lang.Integer getCostFlag() {
        return this.costFlag;
    }

}
