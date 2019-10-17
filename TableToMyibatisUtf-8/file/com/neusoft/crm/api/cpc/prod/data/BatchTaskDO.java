package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:批量任务表，任务可通过文件上传至服务器
 * @实体表  :BATCH_TASK
 */
public class BatchTaskDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_TASK_S";

    /**
     * 文件队列标识
     */
    public java.lang.Long batchTaskId;

    /**
     * 文件路径
     */
    public java.lang.String filePath;

    /**
     * 批量模板标识
     */
    public java.lang.Long batchTemplateId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 预约时间
     */
    public java.util.Date reserveDate;

    /**
     * 状态。LOVB=EVT-C-0016
            
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
     * 设置 文件队列标识
     */
    public void setBatchTaskId(java.lang.Long batchTaskId) {
        this.batchTaskId = batchTaskId;
    }

    /**
     * 获取 文件队列标识
     */
    public java.lang.Long getBatchTaskId() {
        return this.batchTaskId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchTaskId = SeqUtils.createLongId(ID_SEQ);
         return this.batchTaskId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 文件路径
     */
    public void setFilePath(java.lang.String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取 文件路径
     */
    public java.lang.String getFilePath() {
        return this.filePath;
    }

    /**
     * 设置 批量模板标识
     */
    public void setBatchTemplateId(java.lang.Long batchTemplateId) {
        this.batchTemplateId = batchTemplateId;
    }

    /**
     * 获取 批量模板标识
     */
    public java.lang.Long getBatchTemplateId() {
        return this.batchTemplateId;
    }

    /**
     * 设置 组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
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
     * 设置 预约时间
     */
    public void setReserveDate(java.util.Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    /**
     * 获取 预约时间
     */
    public java.util.Date getReserveDate() {
        return this.reserveDate;
    }

    /**
     * 设置 状态。LOVB=EVT-C-0016
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=EVT-C-0016
            
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
