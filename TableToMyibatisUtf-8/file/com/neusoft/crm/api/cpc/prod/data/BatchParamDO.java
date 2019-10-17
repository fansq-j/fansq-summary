package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:批量业务参数定义
 * @实体表  :BATCH_PARAM
 */
public class BatchParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_PARAM_S";

    /**
     * 批量业务参数标识
     */
    public java.lang.Long batchParamId;

    /**
     * 参数编码
     */
    public java.lang.String paramCode;

    /**
     * 参数名称
     */
    public java.lang.String paramName;

    /**
     * 参数描述
     */
    public java.lang.String paramDesc;

    /**
     * 数据类型。LOVB=PUB-C-0014。
     */
    public java.lang.String valueType;

    /**
     * 正则校验规则
     */
    public java.lang.String validRule;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchParamId = SeqUtils.createLongId(ID_SEQ);
         return this.batchParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 参数编码
     */
    public void setParamCode(java.lang.String paramCode) {
        this.paramCode = paramCode;
    }

    /**
     * 获取 参数编码
     */
    public java.lang.String getParamCode() {
        return this.paramCode;
    }

    /**
     * 设置 参数名称
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }

    /**
     * 获取 参数名称
     */
    public java.lang.String getParamName() {
        return this.paramName;
    }

    /**
     * 设置 参数描述
     */
    public void setParamDesc(java.lang.String paramDesc) {
        this.paramDesc = paramDesc;
    }

    /**
     * 获取 参数描述
     */
    public java.lang.String getParamDesc() {
        return this.paramDesc;
    }

    /**
     * 设置 数据类型。LOVB=PUB-C-0014。
     */
    public void setValueType(java.lang.String valueType) {
        this.valueType = valueType;
    }

    /**
     * 获取 数据类型。LOVB=PUB-C-0014。
     */
    public java.lang.String getValueType() {
        return this.valueType;
    }

    /**
     * 设置 正则校验规则
     */
    public void setValidRule(java.lang.String validRule) {
        this.validRule = validRule;
    }

    /**
     * 获取 正则校验规则
     */
    public java.lang.String getValidRule() {
        return this.validRule;
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
