package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:支持用户自助定制套餐要求，管理同一个用户的套餐使用量可以转换，或者不同用户的使用量转赠。
 * @实体表  :PLCA_ACCUM_TRANSFORM_RULE
 */
public class PlcaAccumTransformRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_ACCUM_TRANSFORM_RULE_S";

    /**
     * 转换标识
     */
    public java.lang.Integer ruleId;

    /**
     * LOVB=PLC-C-0010
     */
    public java.lang.Integer ruleType;

    /**
     * LOVB=PLC-C-0011
     */
    public java.lang.Integer srcObjectType;

    /**
     * 源对象标识，当源对象类型为产品时，填写产品规格标识；当源对象类型为销售品时，填写销售品规格标识。
     */
    public java.lang.Integer srcObjectId;

    /**
     * 源量本类型标识
     */
    public java.lang.Integer srcAccumTypeId;

    /**
     * LOVB=PLC-C-0011
     */
    public java.lang.Integer destObjectType;

    /**
     * 目标对象标识，当目标对象类型为产品时，填写产品规格标识；当目标对象类型为销售品时，填写销售品规格标识。
     */
    public java.lang.Integer destObjectId;

    /**
     * 目标量本类型标识
     */
    public java.lang.Integer destAccumTypeId;

    /**
     * 目标定价计划标识，用于定义转换转赠后目标对象使用量本时的定价计划
     */
    public java.lang.Integer destPricingPlanId;

    /**
     * 转赠转换表达式标识
     */
    public java.lang.Integer accumExpressId;

    /**
     * 动作的唯一标识
     */
    public java.lang.Integer actionId;

    /**
     * 主数据PLC-C-0012
     */
    public java.lang.Integer firstEffDateType;

    /**
     * 累积周期标识
     */
    public java.lang.Integer ratableCycleId;

    /**
     * 优先级
     */
    public java.lang.Integer priority;

    /**
     * 规则名称
     */
    public java.lang.String ruleName;

    /**
     * 规则描述
     */
    public java.lang.String ruleDesc;

    /**
     * LOVB=PLC-C-0026
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
     * 设置 转换标识
     */
    public void setRuleId(java.lang.Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取 转换标识
     */
    public java.lang.Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.ruleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.ruleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 LOVB=PLC-C-0010
     */
    public void setRuleType(java.lang.Integer ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * 获取 LOVB=PLC-C-0010
     */
    public java.lang.Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * 设置 LOVB=PLC-C-0011
     */
    public void setSrcObjectType(java.lang.Integer srcObjectType) {
        this.srcObjectType = srcObjectType;
    }

    /**
     * 获取 LOVB=PLC-C-0011
     */
    public java.lang.Integer getSrcObjectType() {
        return this.srcObjectType;
    }

    /**
     * 设置 源对象标识，当源对象类型为产品时，填写产品规格标识；当源对象类型为销售品时，填写销售品规格标识。
     */
    public void setSrcObjectId(java.lang.Integer srcObjectId) {
        this.srcObjectId = srcObjectId;
    }

    /**
     * 获取 源对象标识，当源对象类型为产品时，填写产品规格标识；当源对象类型为销售品时，填写销售品规格标识。
     */
    public java.lang.Integer getSrcObjectId() {
        return this.srcObjectId;
    }

    /**
     * 设置 源量本类型标识
     */
    public void setSrcAccumTypeId(java.lang.Integer srcAccumTypeId) {
        this.srcAccumTypeId = srcAccumTypeId;
    }

    /**
     * 获取 源量本类型标识
     */
    public java.lang.Integer getSrcAccumTypeId() {
        return this.srcAccumTypeId;
    }

    /**
     * 设置 LOVB=PLC-C-0011
     */
    public void setDestObjectType(java.lang.Integer destObjectType) {
        this.destObjectType = destObjectType;
    }

    /**
     * 获取 LOVB=PLC-C-0011
     */
    public java.lang.Integer getDestObjectType() {
        return this.destObjectType;
    }

    /**
     * 设置 目标对象标识，当目标对象类型为产品时，填写产品规格标识；当目标对象类型为销售品时，填写销售品规格标识。
     */
    public void setDestObjectId(java.lang.Integer destObjectId) {
        this.destObjectId = destObjectId;
    }

    /**
     * 获取 目标对象标识，当目标对象类型为产品时，填写产品规格标识；当目标对象类型为销售品时，填写销售品规格标识。
     */
    public java.lang.Integer getDestObjectId() {
        return this.destObjectId;
    }

    /**
     * 设置 目标量本类型标识
     */
    public void setDestAccumTypeId(java.lang.Integer destAccumTypeId) {
        this.destAccumTypeId = destAccumTypeId;
    }

    /**
     * 获取 目标量本类型标识
     */
    public java.lang.Integer getDestAccumTypeId() {
        return this.destAccumTypeId;
    }

    /**
     * 设置 目标定价计划标识，用于定义转换转赠后目标对象使用量本时的定价计划
     */
    public void setDestPricingPlanId(java.lang.Integer destPricingPlanId) {
        this.destPricingPlanId = destPricingPlanId;
    }

    /**
     * 获取 目标定价计划标识，用于定义转换转赠后目标对象使用量本时的定价计划
     */
    public java.lang.Integer getDestPricingPlanId() {
        return this.destPricingPlanId;
    }

    /**
     * 设置 转赠转换表达式标识
     */
    public void setAccumExpressId(java.lang.Integer accumExpressId) {
        this.accumExpressId = accumExpressId;
    }

    /**
     * 获取 转赠转换表达式标识
     */
    public java.lang.Integer getAccumExpressId() {
        return this.accumExpressId;
    }

    /**
     * 设置 动作的唯一标识
     */
    public void setActionId(java.lang.Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取 动作的唯一标识
     */
    public java.lang.Integer getActionId() {
        return this.actionId;
    }

    /**
     * 设置 主数据PLC-C-0012
     */
    public void setFirstEffDateType(java.lang.Integer firstEffDateType) {
        this.firstEffDateType = firstEffDateType;
    }

    /**
     * 获取 主数据PLC-C-0012
     */
    public java.lang.Integer getFirstEffDateType() {
        return this.firstEffDateType;
    }

    /**
     * 设置 累积周期标识
     */
    public void setRatableCycleId(java.lang.Integer ratableCycleId) {
        this.ratableCycleId = ratableCycleId;
    }

    /**
     * 获取 累积周期标识
     */
    public java.lang.Integer getRatableCycleId() {
        return this.ratableCycleId;
    }

    /**
     * 设置 优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 规则名称
     */
    public void setRuleName(java.lang.String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 获取 规则名称
     */
    public java.lang.String getRuleName() {
        return this.ruleName;
    }

    /**
     * 设置 规则描述
     */
    public void setRuleDesc(java.lang.String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    /**
     * 获取 规则描述
     */
    public java.lang.String getRuleDesc() {
        return this.ruleDesc;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
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
