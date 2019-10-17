package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:积分计算规则的积分计算判断条件，包括积分计算规则、积分计算因子定义、条件运算。
 * @实体表  :POINT_CONDITION
 */
public class PointConditionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_CONDITION_S";

    /**
     * 积分计算判断条件标识，作为主键
     */
    public java.lang.Integer pointConditionId;

    /**
     * 积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public java.lang.Integer pointCalcRuleId;

    /**
     * 积分计算因子标识，作为外键，指向积分计算因子实体
     */
    public java.lang.Integer pointCalcFactorId;

    /**
     * 条件运算符标识，LOVB=POI-C-0021
     */
    public java.lang.Integer operatorId;

    /**
     * 数值类型，LOVB=POI-C-0020
     */
    public java.lang.String valueType;

    /**
     * 第一个判断条件比较值
     */
    public java.lang.String judgeValue1;

    /**
     * 第二个判断条件比较值
     */
    public java.lang.String judgeValue2;

    /**
     * 生效日期
     */
    public java.util.Date effDate;

    /**
     * 失效日期
     */
    public java.util.Date expDate;

    /**
     * 定义分组情况；同组，分组标识相同；异组，分组标识不同；规则：同组与、异组或
     */
    public java.lang.Integer groupId;

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
     * 设置 积分计算判断条件标识，作为主键
     */
    public void setPointConditionId(java.lang.Integer pointConditionId) {
        this.pointConditionId = pointConditionId;
    }

    /**
     * 获取 积分计算判断条件标识，作为主键
     */
    public java.lang.Integer getPointConditionId() {
        return this.pointConditionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointConditionId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointConditionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
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
     * 设置 积分计算因子标识，作为外键，指向积分计算因子实体
     */
    public void setPointCalcFactorId(java.lang.Integer pointCalcFactorId) {
        this.pointCalcFactorId = pointCalcFactorId;
    }

    /**
     * 获取 积分计算因子标识，作为外键，指向积分计算因子实体
     */
    public java.lang.Integer getPointCalcFactorId() {
        return this.pointCalcFactorId;
    }

    /**
     * 设置 条件运算符标识，LOVB=POI-C-0021
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取 条件运算符标识，LOVB=POI-C-0021
     */
    public java.lang.Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * 设置 数值类型，LOVB=POI-C-0020
     */
    public void setValueType(java.lang.String valueType) {
        this.valueType = valueType;
    }

    /**
     * 获取 数值类型，LOVB=POI-C-0020
     */
    public java.lang.String getValueType() {
        return this.valueType;
    }

    /**
     * 设置 第一个判断条件比较值
     */
    public void setJudgeValue1(java.lang.String judgeValue1) {
        this.judgeValue1 = judgeValue1;
    }

    /**
     * 获取 第一个判断条件比较值
     */
    public java.lang.String getJudgeValue1() {
        return this.judgeValue1;
    }

    /**
     * 设置 第二个判断条件比较值
     */
    public void setJudgeValue2(java.lang.String judgeValue2) {
        this.judgeValue2 = judgeValue2;
    }

    /**
     * 获取 第二个判断条件比较值
     */
    public java.lang.String getJudgeValue2() {
        return this.judgeValue2;
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
     * 设置 定义分组情况；同组，分组标识相同；异组，分组标识不同；规则：同组与、异组或
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 定义分组情况；同组，分组标识相同；异组，分组标识不同；规则：同组与、异组或
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
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
