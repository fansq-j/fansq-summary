package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:优先级配置表

目前只针对不同的批量业务配置对应优先级顺序

考虑到地市
 * @实体表  :BATCH_SCHEDULE_RULE
 */
public class BatchScheduleRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_SCHEDULE_RULE_S";

    /**
     * 批量业务调度策略标识
     */
    public java.lang.Long batchScheduleRuleId;

    /**
     * 模板标识
     */
    public java.lang.Long batchTemplateId;

    /**
     * 优先级
     */
    public java.lang.Integer priority;

    /**
     * 建议线程数
     */
    public java.lang.Integer threadNum;

    /**
     * 预约执行时间
     */
    public java.util.Date planTime;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 批量业务调度策略标识
     */
    public void setBatchScheduleRuleId(java.lang.Long batchScheduleRuleId) {
        this.batchScheduleRuleId = batchScheduleRuleId;
    }

    /**
     * 获取 批量业务调度策略标识
     */
    public java.lang.Long getBatchScheduleRuleId() {
        return this.batchScheduleRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchScheduleRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.batchScheduleRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 模板标识
     */
    public void setBatchTemplateId(java.lang.Long batchTemplateId) {
        this.batchTemplateId = batchTemplateId;
    }

    /**
     * 获取 模板标识
     */
    public java.lang.Long getBatchTemplateId() {
        return this.batchTemplateId;
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
     * 设置 建议线程数
     */
    public void setThreadNum(java.lang.Integer threadNum) {
        this.threadNum = threadNum;
    }

    /**
     * 获取 建议线程数
     */
    public java.lang.Integer getThreadNum() {
        return this.threadNum;
    }

    /**
     * 设置 预约执行时间
     */
    public void setPlanTime(java.util.Date planTime) {
        this.planTime = planTime;
    }

    /**
     * 获取 预约执行时间
     */
    public java.util.Date getPlanTime() {
        return this.planTime;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
