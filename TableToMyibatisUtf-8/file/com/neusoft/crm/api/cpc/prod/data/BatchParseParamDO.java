package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:解析方法引用参数
 * @实体表  :BATCH_PARSE_PARAM
 */
public class BatchParseParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_PARSE_PARAM_S";

    /**
     * 解析方法引用参数
     */
    public java.lang.Long batchParseParam;

    /**
     * 解析方法标识
     */
    public java.lang.Long batchParseId;

    /**
     * 参数序号
     */
    public java.lang.Integer batchParseSeq;

    /**
     * 批量业务参数标识
     */
    public java.lang.Long batchParamId;

    /**
     * 参数说明
     */
    public java.lang.String paramDesc;

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
     * 设置 解析方法引用参数
     */
    public void setBatchParseParam(java.lang.Long batchParseParam) {
        this.batchParseParam = batchParseParam;
    }

    /**
     * 获取 解析方法引用参数
     */
    public java.lang.Long getBatchParseParam() {
        return this.batchParseParam;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchParseParam = SeqUtils.createLongId(ID_SEQ);
         return this.batchParseParam;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 解析方法标识
     */
    public void setBatchParseId(java.lang.Long batchParseId) {
        this.batchParseId = batchParseId;
    }

    /**
     * 获取 解析方法标识
     */
    public java.lang.Long getBatchParseId() {
        return this.batchParseId;
    }

    /**
     * 设置 参数序号
     */
    public void setBatchParseSeq(java.lang.Integer batchParseSeq) {
        this.batchParseSeq = batchParseSeq;
    }

    /**
     * 获取 参数序号
     */
    public java.lang.Integer getBatchParseSeq() {
        return this.batchParseSeq;
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
     * 设置 参数说明
     */
    public void setParamDesc(java.lang.String paramDesc) {
        this.paramDesc = paramDesc;
    }

    /**
     * 获取 参数说明
     */
    public java.lang.String getParamDesc() {
        return this.paramDesc;
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
