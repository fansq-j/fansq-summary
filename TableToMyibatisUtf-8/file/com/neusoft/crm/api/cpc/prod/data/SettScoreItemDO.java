package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录佣金积分的合帐结果
 * @实体表  :SETT_SCORE_ITEM
 */
public class SettScoreItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_SCORE_ITEM_S";

    /**
     * 渠道佣金积分标识，主键序列
     */
    public java.lang.Long settScoreItemId;

    /**
     * 记录结算对象类型，LOVB=ACC-C-0235
            1 工号，2 网点，3 合作伙伴
     */
    public java.lang.Integer settleObjType;

    /**
     * 佣金结算对象标识，结算对象可为渠道标识、经营主体标识、员工标识
     */
    public java.lang.Long settleObjId;

    /**
     * 帐期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 引用佣金计算子域佣金积分类型实体主键
     */
    public java.lang.Integer settScoreTypeId;

    /**
     * 渠道佣金汇总计算积分值
     */
    public java.lang.Long settScoreValue;

    /**
     * 是否为调帐记录标识 LOVB=ACC-C-0237，1.否、2.是
            
     */
    public java.lang.Integer adjustFlag;

    /**
     * 原始帐期标识
     */
    public java.lang.Integer orgBillingCycleId;

    /**
     * 记录状态编码。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录记录生成时间。
     */
    public java.util.Date createDate;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 设置 渠道佣金积分标识，主键序列
     */
    public void setSettScoreItemId(java.lang.Long settScoreItemId) {
        this.settScoreItemId = settScoreItemId;
    }

    /**
     * 获取 渠道佣金积分标识，主键序列
     */
    public java.lang.Long getSettScoreItemId() {
        return this.settScoreItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settScoreItemId = SeqUtils.createLongId(ID_SEQ);
         return this.settScoreItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 引用佣金计算子域佣金积分类型实体主键
     */
    public void setSettScoreTypeId(java.lang.Integer settScoreTypeId) {
        this.settScoreTypeId = settScoreTypeId;
    }

    /**
     * 获取 引用佣金计算子域佣金积分类型实体主键
     */
    public java.lang.Integer getSettScoreTypeId() {
        return this.settScoreTypeId;
    }

    /**
     * 设置 渠道佣金汇总计算积分值
     */
    public void setSettScoreValue(java.lang.Long settScoreValue) {
        this.settScoreValue = settScoreValue;
    }

    /**
     * 获取 渠道佣金汇总计算积分值
     */
    public java.lang.Long getSettScoreValue() {
        return this.settScoreValue;
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
     * 设置 原始帐期标识
     */
    public void setOrgBillingCycleId(java.lang.Integer orgBillingCycleId) {
        this.orgBillingCycleId = orgBillingCycleId;
    }

    /**
     * 获取 原始帐期标识
     */
    public java.lang.Integer getOrgBillingCycleId() {
        return this.orgBillingCycleId;
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
     * 设置 记录记录生成时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录记录生成时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
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

}
