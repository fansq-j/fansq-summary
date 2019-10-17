package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售任务单是商机执行的协同工作单，包括：执行时间、目的、沟通方式、交流内容、问题及需求、下一步计划等。
 * @实体表  :SALE_TASK_ORDER
 */
public class SaleTaskOrderDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALE_TASK_ORDER_S";

    /**
     * 任务标识，主键
     */
    public java.lang.Long orderId;

    /**
     * 商机标识。
     */
    public java.lang.Long saleOppId;

    /**
     * 记录执行时间。
     */
    public java.util.Date execDate;

    /**
     * 任务单类型.LOVB=SAL-C-0005
     */
    public java.lang.String orderType;

    /**
     * 记录销售活动的目的。
     */
    public java.lang.String execPurpose;

    /**
     * 描述沟通方式。
     */
    public java.lang.String communicateMode;

    /**
     * 记录销售活动执行中的交流内容。
     */
    public java.lang.String communicateInfo;

    /**
     * 描述销售活动的问题及需求。
     */
    public java.lang.String questionReq;

    /**
     * 描述销售活动执行的下一步计划。
     */
    public java.lang.String nextPlan;

    /**
     * 记录工单执行的结果信息，是否达到预期目的。
     */
    public java.lang.String execResult;

    /**
     * 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 生成时间
     */
    public java.util.Date createDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

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
     * 设置 任务标识，主键
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取 任务标识，主键
     */
    public java.lang.Long getOrderId() {
        return this.orderId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orderId = SeqUtils.createLongId(ID_SEQ);
         return this.orderId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 商机标识。
     */
    public void setSaleOppId(java.lang.Long saleOppId) {
        this.saleOppId = saleOppId;
    }

    /**
     * 获取 商机标识。
     */
    public java.lang.Long getSaleOppId() {
        return this.saleOppId;
    }

    /**
     * 设置 记录执行时间。
     */
    public void setExecDate(java.util.Date execDate) {
        this.execDate = execDate;
    }

    /**
     * 获取 记录执行时间。
     */
    public java.util.Date getExecDate() {
        return this.execDate;
    }

    /**
     * 设置 任务单类型.LOVB=SAL-C-0005
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取 任务单类型.LOVB=SAL-C-0005
     */
    public java.lang.String getOrderType() {
        return this.orderType;
    }

    /**
     * 设置 记录销售活动的目的。
     */
    public void setExecPurpose(java.lang.String execPurpose) {
        this.execPurpose = execPurpose;
    }

    /**
     * 获取 记录销售活动的目的。
     */
    public java.lang.String getExecPurpose() {
        return this.execPurpose;
    }

    /**
     * 设置 描述沟通方式。
     */
    public void setCommunicateMode(java.lang.String communicateMode) {
        this.communicateMode = communicateMode;
    }

    /**
     * 获取 描述沟通方式。
     */
    public java.lang.String getCommunicateMode() {
        return this.communicateMode;
    }

    /**
     * 设置 记录销售活动执行中的交流内容。
     */
    public void setCommunicateInfo(java.lang.String communicateInfo) {
        this.communicateInfo = communicateInfo;
    }

    /**
     * 获取 记录销售活动执行中的交流内容。
     */
    public java.lang.String getCommunicateInfo() {
        return this.communicateInfo;
    }

    /**
     * 设置 描述销售活动的问题及需求。
     */
    public void setQuestionReq(java.lang.String questionReq) {
        this.questionReq = questionReq;
    }

    /**
     * 获取 描述销售活动的问题及需求。
     */
    public java.lang.String getQuestionReq() {
        return this.questionReq;
    }

    /**
     * 设置 描述销售活动执行的下一步计划。
     */
    public void setNextPlan(java.lang.String nextPlan) {
        this.nextPlan = nextPlan;
    }

    /**
     * 获取 描述销售活动执行的下一步计划。
     */
    public java.lang.String getNextPlan() {
        return this.nextPlan;
    }

    /**
     * 设置 记录工单执行的结果信息，是否达到预期目的。
     */
    public void setExecResult(java.lang.String execResult) {
        this.execResult = execResult;
    }

    /**
     * 获取 记录工单执行的结果信息，是否达到预期目的。
     */
    public java.lang.String getExecResult() {
        return this.execResult;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 生成时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 生成时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
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
