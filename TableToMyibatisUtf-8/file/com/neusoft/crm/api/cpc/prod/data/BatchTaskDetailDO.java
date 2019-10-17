package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录批量任务处理明细信息，对于通过excel导入的文件，还要记录EXCEL中每一行记录的控制信息，如客户订单ID、批次号
 * @实体表  :BATCH_TASK_DETAIL
 */
public class BatchTaskDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_TASK_DETAIL_S";

    /**
     * 队列ID
     */
    public java.lang.Long batchTaskDetailId;

    /**
     * 批量任务标识
     */
    public java.lang.Long batchTaskId;

    /**
     * 生成的客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 完成时间
     */
    public java.util.Date finishDate;

    /**
     * 记录在批量文件中的行号
     */
    public java.lang.Integer fileRowId;

    /**
     * 通过批次号标识区分是否要将多行组合生成了一张客户订单
     */
    public java.lang.Long groupId;

    /**
     * 记录优先级。
     */
    public java.lang.Integer priority;

    /**
     * 记录文件行内容
     */
    public java.lang.String rowContent;

    /**
     * 替换JSON源数据
     */
    public java.lang.String orderJsonSource;

    /**
     * 替换JSON目标数据
     */
    public java.lang.String orderJsonDest;

    /**
     * 处理结果描述
     */
    public java.lang.String statusReason;

    /**
     * 处理状态。LOVB=EVT-C-0017
            
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
     * 设置 队列ID
     */
    public void setBatchTaskDetailId(java.lang.Long batchTaskDetailId) {
        this.batchTaskDetailId = batchTaskDetailId;
    }

    /**
     * 获取 队列ID
     */
    public java.lang.Long getBatchTaskDetailId() {
        return this.batchTaskDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchTaskDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.batchTaskDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 批量任务标识
     */
    public void setBatchTaskId(java.lang.Long batchTaskId) {
        this.batchTaskId = batchTaskId;
    }

    /**
     * 获取 批量任务标识
     */
    public java.lang.Long getBatchTaskId() {
        return this.batchTaskId;
    }

    /**
     * 设置 生成的客户订单标识
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 生成的客户订单标识
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 完成时间
     */
    public void setFinishDate(java.util.Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * 获取 完成时间
     */
    public java.util.Date getFinishDate() {
        return this.finishDate;
    }

    /**
     * 设置 记录在批量文件中的行号
     */
    public void setFileRowId(java.lang.Integer fileRowId) {
        this.fileRowId = fileRowId;
    }

    /**
     * 获取 记录在批量文件中的行号
     */
    public java.lang.Integer getFileRowId() {
        return this.fileRowId;
    }

    /**
     * 设置 通过批次号标识区分是否要将多行组合生成了一张客户订单
     */
    public void setGroupId(java.lang.Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 通过批次号标识区分是否要将多行组合生成了一张客户订单
     */
    public java.lang.Long getGroupId() {
        return this.groupId;
    }

    /**
     * 设置 记录优先级。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 记录优先级。
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 记录文件行内容
     */
    public void setRowContent(java.lang.String rowContent) {
        this.rowContent = rowContent;
    }

    /**
     * 获取 记录文件行内容
     */
    public java.lang.String getRowContent() {
        return this.rowContent;
    }

    /**
     * 设置 替换JSON源数据
     */
    public void setOrderJsonSource(java.lang.String orderJsonSource) {
        this.orderJsonSource = orderJsonSource;
    }

    /**
     * 获取 替换JSON源数据
     */
    public java.lang.String getOrderJsonSource() {
        return this.orderJsonSource;
    }

    /**
     * 设置 替换JSON目标数据
     */
    public void setOrderJsonDest(java.lang.String orderJsonDest) {
        this.orderJsonDest = orderJsonDest;
    }

    /**
     * 获取 替换JSON目标数据
     */
    public java.lang.String getOrderJsonDest() {
        return this.orderJsonDest;
    }

    /**
     * 设置 处理结果描述
     */
    public void setStatusReason(java.lang.String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * 获取 处理结果描述
     */
    public java.lang.String getStatusReason() {
        return this.statusReason;
    }

    /**
     * 设置 处理状态。LOVB=EVT-C-0017
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 处理状态。LOVB=EVT-C-0017
            
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
