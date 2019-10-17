package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:解析方法
 * @实体表  :BATCH_PARSE
 */
public class BatchParseDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_PARSE_S";

    /**
     * 解析方法标识
     */
    public java.lang.Long batchParseId;

    /**
     * 解析方法名称
     */
    public java.lang.String parseName;

    /**
     * 解析方法说明
     */
    public java.lang.String parseDesc;

    /**
     * 解析方法参数说明
     */
    public java.lang.String parseParamDesc;

    /**
     * 具体解析类方法
     */
    public java.lang.String parseClassMethod;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchParseId = SeqUtils.createLongId(ID_SEQ);
         return this.batchParseId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 解析方法名称
     */
    public void setParseName(java.lang.String parseName) {
        this.parseName = parseName;
    }

    /**
     * 获取 解析方法名称
     */
    public java.lang.String getParseName() {
        return this.parseName;
    }

    /**
     * 设置 解析方法说明
     */
    public void setParseDesc(java.lang.String parseDesc) {
        this.parseDesc = parseDesc;
    }

    /**
     * 获取 解析方法说明
     */
    public java.lang.String getParseDesc() {
        return this.parseDesc;
    }

    /**
     * 设置 解析方法参数说明
     */
    public void setParseParamDesc(java.lang.String parseParamDesc) {
        this.parseParamDesc = parseParamDesc;
    }

    /**
     * 获取 解析方法参数说明
     */
    public java.lang.String getParseParamDesc() {
        return this.parseParamDesc;
    }

    /**
     * 设置 具体解析类方法
     */
    public void setParseClassMethod(java.lang.String parseClassMethod) {
        this.parseClassMethod = parseClassMethod;
    }

    /**
     * 获取 具体解析类方法
     */
    public java.lang.String getParseClassMethod() {
        return this.parseClassMethod;
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
