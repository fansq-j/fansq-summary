package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述余额预存、赠送的规则，包括预存的余额类型，赠送的余额类型，赠送的规则等；预存赠送分两大类：1、适用于特定产品或客户的
 * @实体表  :BALANCE_PRESENT_RULE
 */
public class BalancePresentRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_PRESENT_RULE_S";

    /**
     * 赠送规则的标识
     */
    public java.lang.Integer presentRuleId;

    /**
     * 余额帐本所属的余额类型
     */
    public java.lang.Integer balBalanceTypeId;

    /**
     * 余额对象类型，LOVB=ACC-C-0036
     */
    public java.lang.Integer objType;

    /**
     * 记录余额对象标识。
     */
    public java.lang.Long objId;

    /**
     * LOVB=ACC-C-0137
     */
    public java.lang.Integer baseValueType;

    /**
     * 预存金额比较的条件上限
     */
    public java.lang.Integer refCeil;

    /**
     * 预存金额比较的条件下限，当预存金额在上下限之间，表示符合规则条件
     */
    public java.lang.Integer refFloor;

    /**
     * 当赠送基值类型为属性值时，赠送基值为销售品属性ID，通过销售品属性ID获取销售品实例属性作为计算公式的基础值；当赠送基值类型为固定值时，赠送基值计算公式的基础值
     */
    public java.lang.Integer baseValue;

    /**
     * 计算公式的计算方法。ACC-C-0138
     */
    public java.lang.Integer calcMethod;

    /**
     * 计算方法对应的计算值
     */
    public java.lang.Integer calcValue;

    /**
     * 计算公式中的比例
     */
    public java.lang.Integer calcRate;

    /**
     * 最终计算结果的精度
     */
    public java.lang.Integer calcPrecision;

    /**
     * 限制一次赠送余额的最大值
     */
    public java.lang.Integer maxValue;

    /**
     * 赠送余额开始生效的时间偏移单位。ACC-C-0008
     */
    public java.lang.Integer effOffsetUnit;

    /**
     * 赠送余额开始生效的偏移值
     */
    public java.lang.Integer effOffsetValue;

    /**
     * 引用帐务周期的类型标识
     */
    public java.lang.Integer billingCycleTypeId;

    /**
     * 预存赠送的期数
     */
    public java.lang.Integer cycleCount;

    /**
     * LOVB=ACC-C-0195
     */
    public java.lang.Integer presentType;

    /**
     * 规则类型，LOVB=ACC-C-0131
     */
    public java.lang.Integer ruleType;

    /**
     * 规则的具体信息描述
     */
    public java.lang.String ruleDesc;

    /**
     * 归属区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 规则生效时间
     */
    public java.util.Date effDate;

    /**
     * 规则失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

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
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 当一个营销策略有多条赠送规则时，多条规则的RULE_GROUP_ID填同一个值。
     */
    public java.lang.Integer ruleGroupId;

    /**
     * 设置 赠送规则的标识
     */
    public void setPresentRuleId(java.lang.Integer presentRuleId) {
        this.presentRuleId = presentRuleId;
    }

    /**
     * 获取 赠送规则的标识
     */
    public java.lang.Integer getPresentRuleId() {
        return this.presentRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.presentRuleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.presentRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 余额帐本所属的余额类型
     */
    public void setBalBalanceTypeId(java.lang.Integer balBalanceTypeId) {
        this.balBalanceTypeId = balBalanceTypeId;
    }

    /**
     * 获取 余额帐本所属的余额类型
     */
    public java.lang.Integer getBalBalanceTypeId() {
        return this.balBalanceTypeId;
    }

    /**
     * 设置 余额对象类型，LOVB=ACC-C-0036
     */
    public void setObjType(java.lang.Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取 余额对象类型，LOVB=ACC-C-0036
     */
    public java.lang.Integer getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录余额对象标识。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录余额对象标识。
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 LOVB=ACC-C-0137
     */
    public void setBaseValueType(java.lang.Integer baseValueType) {
        this.baseValueType = baseValueType;
    }

    /**
     * 获取 LOVB=ACC-C-0137
     */
    public java.lang.Integer getBaseValueType() {
        return this.baseValueType;
    }

    /**
     * 设置 预存金额比较的条件上限
     */
    public void setRefCeil(java.lang.Integer refCeil) {
        this.refCeil = refCeil;
    }

    /**
     * 获取 预存金额比较的条件上限
     */
    public java.lang.Integer getRefCeil() {
        return this.refCeil;
    }

    /**
     * 设置 预存金额比较的条件下限，当预存金额在上下限之间，表示符合规则条件
     */
    public void setRefFloor(java.lang.Integer refFloor) {
        this.refFloor = refFloor;
    }

    /**
     * 获取 预存金额比较的条件下限，当预存金额在上下限之间，表示符合规则条件
     */
    public java.lang.Integer getRefFloor() {
        return this.refFloor;
    }

    /**
     * 设置 当赠送基值类型为属性值时，赠送基值为销售品属性ID，通过销售品属性ID获取销售品实例属性作为计算公式的基础值；当赠送基值类型为固定值时，赠送基值计算公式的基础值
     */
    public void setBaseValue(java.lang.Integer baseValue) {
        this.baseValue = baseValue;
    }

    /**
     * 获取 当赠送基值类型为属性值时，赠送基值为销售品属性ID，通过销售品属性ID获取销售品实例属性作为计算公式的基础值；当赠送基值类型为固定值时，赠送基值计算公式的基础值
     */
    public java.lang.Integer getBaseValue() {
        return this.baseValue;
    }

    /**
     * 设置 计算公式的计算方法。ACC-C-0138
     */
    public void setCalcMethod(java.lang.Integer calcMethod) {
        this.calcMethod = calcMethod;
    }

    /**
     * 获取 计算公式的计算方法。ACC-C-0138
     */
    public java.lang.Integer getCalcMethod() {
        return this.calcMethod;
    }

    /**
     * 设置 计算方法对应的计算值
     */
    public void setCalcValue(java.lang.Integer calcValue) {
        this.calcValue = calcValue;
    }

    /**
     * 获取 计算方法对应的计算值
     */
    public java.lang.Integer getCalcValue() {
        return this.calcValue;
    }

    /**
     * 设置 计算公式中的比例
     */
    public void setCalcRate(java.lang.Integer calcRate) {
        this.calcRate = calcRate;
    }

    /**
     * 获取 计算公式中的比例
     */
    public java.lang.Integer getCalcRate() {
        return this.calcRate;
    }

    /**
     * 设置 最终计算结果的精度
     */
    public void setCalcPrecision(java.lang.Integer calcPrecision) {
        this.calcPrecision = calcPrecision;
    }

    /**
     * 获取 最终计算结果的精度
     */
    public java.lang.Integer getCalcPrecision() {
        return this.calcPrecision;
    }

    /**
     * 设置 限制一次赠送余额的最大值
     */
    public void setMaxValue(java.lang.Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取 限制一次赠送余额的最大值
     */
    public java.lang.Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * 设置 赠送余额开始生效的时间偏移单位。ACC-C-0008
     */
    public void setEffOffsetUnit(java.lang.Integer effOffsetUnit) {
        this.effOffsetUnit = effOffsetUnit;
    }

    /**
     * 获取 赠送余额开始生效的时间偏移单位。ACC-C-0008
     */
    public java.lang.Integer getEffOffsetUnit() {
        return this.effOffsetUnit;
    }

    /**
     * 设置 赠送余额开始生效的偏移值
     */
    public void setEffOffsetValue(java.lang.Integer effOffsetValue) {
        this.effOffsetValue = effOffsetValue;
    }

    /**
     * 获取 赠送余额开始生效的偏移值
     */
    public java.lang.Integer getEffOffsetValue() {
        return this.effOffsetValue;
    }

    /**
     * 设置 引用帐务周期的类型标识
     */
    public void setBillingCycleTypeId(java.lang.Integer billingCycleTypeId) {
        this.billingCycleTypeId = billingCycleTypeId;
    }

    /**
     * 获取 引用帐务周期的类型标识
     */
    public java.lang.Integer getBillingCycleTypeId() {
        return this.billingCycleTypeId;
    }

    /**
     * 设置 预存赠送的期数
     */
    public void setCycleCount(java.lang.Integer cycleCount) {
        this.cycleCount = cycleCount;
    }

    /**
     * 获取 预存赠送的期数
     */
    public java.lang.Integer getCycleCount() {
        return this.cycleCount;
    }

    /**
     * 设置 LOVB=ACC-C-0195
     */
    public void setPresentType(java.lang.Integer presentType) {
        this.presentType = presentType;
    }

    /**
     * 获取 LOVB=ACC-C-0195
     */
    public java.lang.Integer getPresentType() {
        return this.presentType;
    }

    /**
     * 设置 规则类型，LOVB=ACC-C-0131
     */
    public void setRuleType(java.lang.Integer ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * 获取 规则类型，LOVB=ACC-C-0131
     */
    public java.lang.Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * 设置 规则的具体信息描述
     */
    public void setRuleDesc(java.lang.String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    /**
     * 获取 规则的具体信息描述
     */
    public java.lang.String getRuleDesc() {
        return this.ruleDesc;
    }

    /**
     * 设置 归属区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 规则生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 规则生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 规则失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 规则失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

    /**
     * 设置 当一个营销策略有多条赠送规则时，多条规则的RULE_GROUP_ID填同一个值。
     */
    public void setRuleGroupId(java.lang.Integer ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * 获取 当一个营销策略有多条赠送规则时，多条规则的RULE_GROUP_ID填同一个值。
     */
    public java.lang.Integer getRuleGroupId() {
        return this.ruleGroupId;
    }

}
