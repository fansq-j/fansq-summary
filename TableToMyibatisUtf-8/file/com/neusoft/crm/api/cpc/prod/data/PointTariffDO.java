package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分计算信息，包括积分计算规则、计算类型、积分类型、积分值等
 * @实体表  :POINT_TARIFF
 */
public class PointTariffDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_TARIFF_S";

    /**
     * 积分计算标识，作为主键
     */
    public java.lang.Long pointTariffId;

    /**
     * 积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public java.lang.Integer pointCalcRuleId;

    /**
     * 积分的计算类型，LOVB=POI-C-0018
     */
    public java.lang.String calcType;

    /**
     * 积分计算因子标识，作为外键，指向积分计算因子定义实体
     */
    public java.lang.Integer pointCalcFactorId;

    /**
     * 积分计算的权重系数
            百分比
     */
    public java.lang.Integer weightCoefficient;

    /**
     * 固定值
     */
    public java.lang.Integer fixedValue;

    /**
     * 积分类型标识，作为外键，指向积分类型实体
     */
    public java.lang.Integer pointTypeId;

    /**
     * 精度取整方式，LOVB=POI-C-0019
     */
    public java.lang.String calcPrecisionMethod;

    /**
     * 积分周期类型，LOVB=POI-C-0012
     */
    public java.lang.String pointCycleType;

    /**
     * 积分周期数
     */
    public java.lang.Integer pointCycleCount;

    /**
     * 周期终止类型，LOVB=POI-C-0013。
            指定积分到期的终止类型，取值包括：1-自然周期2-顺延周期
            如2016年2月6日产生的积分，有效期3年，则：按自然周期为2018年2月6日失效，按顺延周期为2019年1月1日失效。
     */
    public java.lang.String pointCycleEndType;

    /**
     * 积分结果封顶值。
     */
    public java.lang.Integer maxValue;

    /**
     * 生效日期
     */
    public java.util.Date effDate;

    /**
     * 失效日期
     */
    public java.util.Date expDate;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分计算标识，作为主键
     */
    public void setPointTariffId(java.lang.Long pointTariffId) {
        this.pointTariffId = pointTariffId;
    }

    /**
     * 获取 积分计算标识，作为主键
     */
    public java.lang.Long getPointTariffId() {
        return this.pointTariffId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointTariffId = SeqUtils.createLongId(ID_SEQ);
         return this.pointTariffId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public void setPointCalcRuleId(java.lang.Integer pointCalcRuleId) {
        this.pointCalcRuleId = pointCalcRuleId;
    }

    /**
     * 获取 积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public java.lang.Integer getPointCalcRuleId() {
        return this.pointCalcRuleId;
    }

    /**
     * 设置 积分的计算类型，LOVB=POI-C-0018
     */
    public void setCalcType(java.lang.String calcType) {
        this.calcType = calcType;
    }

    /**
     * 获取 积分的计算类型，LOVB=POI-C-0018
     */
    public java.lang.String getCalcType() {
        return this.calcType;
    }

    /**
     * 设置 积分计算因子标识，作为外键，指向积分计算因子定义实体
     */
    public void setPointCalcFactorId(java.lang.Integer pointCalcFactorId) {
        this.pointCalcFactorId = pointCalcFactorId;
    }

    /**
     * 获取 积分计算因子标识，作为外键，指向积分计算因子定义实体
     */
    public java.lang.Integer getPointCalcFactorId() {
        return this.pointCalcFactorId;
    }

    /**
     * 设置 积分计算的权重系数
            百分比
     */
    public void setWeightCoefficient(java.lang.Integer weightCoefficient) {
        this.weightCoefficient = weightCoefficient;
    }

    /**
     * 获取 积分计算的权重系数
            百分比
     */
    public java.lang.Integer getWeightCoefficient() {
        return this.weightCoefficient;
    }

    /**
     * 设置 固定值
     */
    public void setFixedValue(java.lang.Integer fixedValue) {
        this.fixedValue = fixedValue;
    }

    /**
     * 获取 固定值
     */
    public java.lang.Integer getFixedValue() {
        return this.fixedValue;
    }

    /**
     * 设置 积分类型标识，作为外键，指向积分类型实体
     */
    public void setPointTypeId(java.lang.Integer pointTypeId) {
        this.pointTypeId = pointTypeId;
    }

    /**
     * 获取 积分类型标识，作为外键，指向积分类型实体
     */
    public java.lang.Integer getPointTypeId() {
        return this.pointTypeId;
    }

    /**
     * 设置 精度取整方式，LOVB=POI-C-0019
     */
    public void setCalcPrecisionMethod(java.lang.String calcPrecisionMethod) {
        this.calcPrecisionMethod = calcPrecisionMethod;
    }

    /**
     * 获取 精度取整方式，LOVB=POI-C-0019
     */
    public java.lang.String getCalcPrecisionMethod() {
        return this.calcPrecisionMethod;
    }

    /**
     * 设置 积分周期类型，LOVB=POI-C-0012
     */
    public void setPointCycleType(java.lang.String pointCycleType) {
        this.pointCycleType = pointCycleType;
    }

    /**
     * 获取 积分周期类型，LOVB=POI-C-0012
     */
    public java.lang.String getPointCycleType() {
        return this.pointCycleType;
    }

    /**
     * 设置 积分周期数
     */
    public void setPointCycleCount(java.lang.Integer pointCycleCount) {
        this.pointCycleCount = pointCycleCount;
    }

    /**
     * 获取 积分周期数
     */
    public java.lang.Integer getPointCycleCount() {
        return this.pointCycleCount;
    }

    /**
     * 设置 周期终止类型，LOVB=POI-C-0013。
            指定积分到期的终止类型，取值包括：1-自然周期2-顺延周期
            如2016年2月6日产生的积分，有效期3年，则：按自然周期为2018年2月6日失效，按顺延周期为2019年1月1日失效。
     */
    public void setPointCycleEndType(java.lang.String pointCycleEndType) {
        this.pointCycleEndType = pointCycleEndType;
    }

    /**
     * 获取 周期终止类型，LOVB=POI-C-0013。
            指定积分到期的终止类型，取值包括：1-自然周期2-顺延周期
            如2016年2月6日产生的积分，有效期3年，则：按自然周期为2018年2月6日失效，按顺延周期为2019年1月1日失效。
     */
    public java.lang.String getPointCycleEndType() {
        return this.pointCycleEndType;
    }

    /**
     * 设置 积分结果封顶值。
     */
    public void setMaxValue(java.lang.Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取 积分结果封顶值。
     */
    public java.lang.Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * 设置 生效日期
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效日期
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效日期
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效日期
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录创建的员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
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

}
