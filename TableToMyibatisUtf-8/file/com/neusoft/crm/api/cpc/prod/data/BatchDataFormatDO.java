package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:批量数据格式定义
 * @实体表  :BATCH_DATA_FORMAT
 */
public class BatchDataFormatDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_DATA_FORMAT_S";

    /**
     * 批量数据格式定义标识
     */
    public java.lang.Long batchColId;

    /**
     * 模板标识
     */
    public java.lang.Long batchTemplateId;

    /**
     * 列序号
     */
    public java.lang.Integer colSeq;

    /**
     * 列名称
     */
    public java.lang.String colName;

    /**
     * 批量业务参数标识
     */
    public java.lang.Long batchParamId;

    /**
     * 格式说明
     */
    public java.lang.String colDesc;

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
     * 设置 批量数据格式定义标识
     */
    public void setBatchColId(java.lang.Long batchColId) {
        this.batchColId = batchColId;
    }

    /**
     * 获取 批量数据格式定义标识
     */
    public java.lang.Long getBatchColId() {
        return this.batchColId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchColId = SeqUtils.createLongId(ID_SEQ);
         return this.batchColId;
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
     * 设置 列序号
     */
    public void setColSeq(java.lang.Integer colSeq) {
        this.colSeq = colSeq;
    }

    /**
     * 获取 列序号
     */
    public java.lang.Integer getColSeq() {
        return this.colSeq;
    }

    /**
     * 设置 列名称
     */
    public void setColName(java.lang.String colName) {
        this.colName = colName;
    }

    /**
     * 获取 列名称
     */
    public java.lang.String getColName() {
        return this.colName;
    }

    /**
     * 设置 批量业务参数标识
     */
    public void setBatchParamId(java.lang.Long batchParamId) {
        this.batchParamId = batchParamId;
    }

    /**
     * 获取 批量业务参数标识
     */
    public java.lang.Long getBatchParamId() {
        return this.batchParamId;
    }

    /**
     * 设置 格式说明
     */
    public void setColDesc(java.lang.String colDesc) {
        this.colDesc = colDesc;
    }

    /**
     * 获取 格式说明
     */
    public java.lang.String getColDesc() {
        return this.colDesc;
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
