package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义结算调帐接口表，用于清单调帐和帐单调帐使用，当帐单调帐时使用不到的字段可为空
 * @实体表  :SETTLE_ADJUST
 */
public class SettleAdjustDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETTLE_ADJUST_S";

    /**
     * 佣金调帐唯一标识，主键序列
     */
    public java.lang.Long settleAdjustId;

    /**
     * 调帐记录录入员工
     */
    public java.lang.Long inStaffId;

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
     * 是针对清单或帐单调帐，LOVB=ACC-C-0239，1 清单，2 帐单
     */
    public java.lang.Integer adjustObjType;

    /**
     * 调帐对象的唯一标识，佣金清单标识＼佣金帐单标识
     */
    public java.lang.Long adjustObjId;

    /**
     * 原始帐期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 调帐金额，单位/分
     */
    public java.lang.Long charge;

    /**
     * 用户号码
     */
    public java.lang.String accNbr;

    /**
     * 产品实例标识，引用产品实例子域 产品实例的主键
     */
    public java.lang.Long prodInstId;

    /**
     * 帐目类型标识，引用销账子域 帐目类型的主键
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 用于财务列帐使用，LOVB=ACC-C-0238，0 成本，如：酬金结算、1 减收，如：SP/CP分成
     */
    public java.lang.Integer costFlag;

    /**
     * 记录调帐审核状态，LOVB=ACC-C-0026
            1　未处理，2　已处理，3　作废，4	处理失败
            
     */
    public java.lang.Integer adjustState;

    /**
     * 记录状态更新时间
     */
    public java.util.Date adjustStateDate;

    /**
     * 记录调帐原因描述
     */
    public java.lang.String adjustDesc;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 设置 佣金调帐唯一标识，主键序列
     */
    public void setSettleAdjustId(java.lang.Long settleAdjustId) {
        this.settleAdjustId = settleAdjustId;
    }

    /**
     * 获取 佣金调帐唯一标识，主键序列
     */
    public java.lang.Long getSettleAdjustId() {
        return this.settleAdjustId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settleAdjustId = SeqUtils.createLongId(ID_SEQ);
         return this.settleAdjustId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 是针对清单或帐单调帐，LOVB=ACC-C-0239，1 清单，2 帐单
     */
    public void setAdjustObjType(java.lang.Integer adjustObjType) {
        this.adjustObjType = adjustObjType;
    }

    /**
     * 获取 是针对清单或帐单调帐，LOVB=ACC-C-0239，1 清单，2 帐单
     */
    public java.lang.Integer getAdjustObjType() {
        return this.adjustObjType;
    }

    /**
     * 设置 调帐对象的唯一标识，佣金清单标识＼佣金帐单标识
     */
    public void setAdjustObjId(java.lang.Long adjustObjId) {
        this.adjustObjId = adjustObjId;
    }

    /**
     * 获取 调帐对象的唯一标识，佣金清单标识＼佣金帐单标识
     */
    public java.lang.Long getAdjustObjId() {
        return this.adjustObjId;
    }

    /**
     * 设置 原始帐期标识
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 原始帐期标识
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 调帐金额，单位/分
     */
    public void setCharge(java.lang.Long charge) {
        this.charge = charge;
    }

    /**
     * 获取 调帐金额，单位/分
     */
    public java.lang.Long getCharge() {
        return this.charge;
    }

    /**
     * 设置 用户号码
     */
    public void setAccNbr(java.lang.String accNbr) {
        this.accNbr = accNbr;
    }

    /**
     * 获取 用户号码
     */
    public java.lang.String getAccNbr() {
        return this.accNbr;
    }

    /**
     * 设置 产品实例标识，引用产品实例子域 产品实例的主键
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识，引用产品实例子域 产品实例的主键
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 帐目类型标识，引用销账子域 帐目类型的主键
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 帐目类型标识，引用销账子域 帐目类型的主键
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
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
     * 设置 记录调帐审核状态，LOVB=ACC-C-0026
            1　未处理，2　已处理，3　作废，4	处理失败
            
     */
    public void setAdjustState(java.lang.Integer adjustState) {
        this.adjustState = adjustState;
    }

    /**
     * 获取 记录调帐审核状态，LOVB=ACC-C-0026
            1　未处理，2　已处理，3　作废，4	处理失败
            
     */
    public java.lang.Integer getAdjustState() {
        return this.adjustState;
    }

    /**
     * 设置 记录状态更新时间
     */
    public void setAdjustStateDate(java.util.Date adjustStateDate) {
        this.adjustStateDate = adjustStateDate;
    }

    /**
     * 获取 记录状态更新时间
     */
    public java.util.Date getAdjustStateDate() {
        return this.adjustStateDate;
    }

    /**
     * 设置 记录调帐原因描述
     */
    public void setAdjustDesc(java.lang.String adjustDesc) {
        this.adjustDesc = adjustDesc;
    }

    /**
     * 获取 记录调帐原因描述
     */
    public java.lang.String getAdjustDesc() {
        return this.adjustDesc;
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

}
