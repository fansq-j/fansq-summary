package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录呆坏帐处理任务
 * @实体表  :BAD_DEBT_PROC_TASK
 */
public class BadDebtProcTaskDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BAD_DEBT_PROC_TASK_S";

    /**
     * 记录呆坏帐处理任务的唯一编号。
     */
    public java.lang.Long taskId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * LOVB=ACC-C-0111
     */
    public java.lang.Integer statusCd;

    /**
     * 待审批总金额
     */
    public java.lang.Long generateCharge;

    /**
     * 待审批总户数
     */
    public java.lang.Integer generateCount;

    /**
     * 审批金额
     */
    public java.lang.Long approveCharge;

    /**
     * 审批总户数
     */
    public java.lang.Integer approveCount;

    /**
     * 执行成功金额
     */
    public java.lang.Long processCharge;

    /**
     * 执行总户数
     */
    public java.lang.Integer processCount;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * LOVB=ACC-C-0110
     */
    public java.lang.Integer taskType;

    /**
     * LOVB=ACC-C-0109
     */
    public java.lang.Integer dealType;

    /**
     * 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public java.lang.Integer feeCycleId;

    /**
     * 设置 记录呆坏帐处理任务的唯一编号。
     */
    public void setTaskId(java.lang.Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取 记录呆坏帐处理任务的唯一编号。
     */
    public java.lang.Long getTaskId() {
        return this.taskId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.taskId = SeqUtils.createLongId(ID_SEQ);
         return this.taskId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 LOVB=ACC-C-0111
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0111
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 待审批总金额
     */
    public void setGenerateCharge(java.lang.Long generateCharge) {
        this.generateCharge = generateCharge;
    }

    /**
     * 获取 待审批总金额
     */
    public java.lang.Long getGenerateCharge() {
        return this.generateCharge;
    }

    /**
     * 设置 待审批总户数
     */
    public void setGenerateCount(java.lang.Integer generateCount) {
        this.generateCount = generateCount;
    }

    /**
     * 获取 待审批总户数
     */
    public java.lang.Integer getGenerateCount() {
        return this.generateCount;
    }

    /**
     * 设置 审批金额
     */
    public void setApproveCharge(java.lang.Long approveCharge) {
        this.approveCharge = approveCharge;
    }

    /**
     * 获取 审批金额
     */
    public java.lang.Long getApproveCharge() {
        return this.approveCharge;
    }

    /**
     * 设置 审批总户数
     */
    public void setApproveCount(java.lang.Integer approveCount) {
        this.approveCount = approveCount;
    }

    /**
     * 获取 审批总户数
     */
    public java.lang.Integer getApproveCount() {
        return this.approveCount;
    }

    /**
     * 设置 执行成功金额
     */
    public void setProcessCharge(java.lang.Long processCharge) {
        this.processCharge = processCharge;
    }

    /**
     * 获取 执行成功金额
     */
    public java.lang.Long getProcessCharge() {
        return this.processCharge;
    }

    /**
     * 设置 执行总户数
     */
    public void setProcessCount(java.lang.Integer processCount) {
        this.processCount = processCount;
    }

    /**
     * 获取 执行总户数
     */
    public java.lang.Integer getProcessCount() {
        return this.processCount;
    }

    /**
     * 设置 业务处理的帐期周期
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 业务处理的帐期周期
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 LOVB=ACC-C-0110
     */
    public void setTaskType(java.lang.Integer taskType) {
        this.taskType = taskType;
    }

    /**
     * 获取 LOVB=ACC-C-0110
     */
    public java.lang.Integer getTaskType() {
        return this.taskType;
    }

    /**
     * 设置 LOVB=ACC-C-0109
     */
    public void setDealType(java.lang.Integer dealType) {
        this.dealType = dealType;
    }

    /**
     * 获取 LOVB=ACC-C-0109
     */
    public java.lang.Integer getDealType() {
        return this.dealType;
    }

    /**
     * 设置 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public void setFeeCycleId(java.lang.Integer feeCycleId) {
        this.feeCycleId = feeCycleId;
    }

    /**
     * 获取 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public java.lang.Integer getFeeCycleId() {
        return this.feeCycleId;
    }

}
