package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:积分计算的计算规则定义，包括计算规则名称、积分事件类型、优先级等
 * @实体表  :POINT_CALC_RULE
 */
public class PointCalcRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_CALC_RULE_S";

    /**
     * 积分计算规则标识，作为主键
     */
    public java.lang.Integer pointCalcRuleId;

    /**
     * 计算规则名称
     */
    public java.lang.String calcRuleName;

    /**
     * 积分事件类型标识，作为外键，指向积分事件类型实体
     */
    public java.lang.Integer pointEventTypeId;

    /**
     * 定义积分计算规则的顺序，从小到大执行。
     */
    public java.lang.Integer priority;

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
     * 设置 积分计算规则标识，作为主键
     */
    public void setPointCalcRuleId(java.lang.Integer pointCalcRuleId) {
        this.pointCalcRuleId = pointCalcRuleId;
    }

    /**
     * 获取 积分计算规则标识，作为主键
     */
    public java.lang.Integer getPointCalcRuleId() {
        return this.pointCalcRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointCalcRuleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointCalcRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 计算规则名称
     */
    public void setCalcRuleName(java.lang.String calcRuleName) {
        this.calcRuleName = calcRuleName;
    }

    /**
     * 获取 计算规则名称
     */
    public java.lang.String getCalcRuleName() {
        return this.calcRuleName;
    }

    /**
     * 设置 积分事件类型标识，作为外键，指向积分事件类型实体
     */
    public void setPointEventTypeId(java.lang.Integer pointEventTypeId) {
        this.pointEventTypeId = pointEventTypeId;
    }

    /**
     * 获取 积分事件类型标识，作为外键，指向积分事件类型实体
     */
    public java.lang.Integer getPointEventTypeId() {
        return this.pointEventTypeId;
    }

    /**
     * 设置 定义积分计算规则的顺序，从小到大执行。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 定义积分计算规则的顺序，从小到大执行。
     */
    public java.lang.Integer getPriority() {
        return this.priority;
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
