package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:评估指标指监控评估时的分析方法。评估指标分为用户级指标和分析指标两类。
 * @实体表  :EVAL_INDEX
 */
public class EvalIndexDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVAL_INDEX_S";

    /**
     * 记录评估指标主键标识
     */
    public java.lang.Long evalIndexId;

    /**
     * 记录评估指标的名称
     */
    public java.lang.String evalIndexName;

    /**
     * 记录评估指标的描述说明
     */
    public java.lang.String evalIndexDesc;

    /**
     * 记录评估指标的类型，包括分为用户级指标和分析指标,LOVB=CAM-C-0026
     */
    public java.lang.String evalIndexType;

    /**
     * 记录评估指标的计算公式
     */
    public java.lang.String calExpression;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录评估指标主键标识
     */
    public void setEvalIndexId(java.lang.Long evalIndexId) {
        this.evalIndexId = evalIndexId;
    }

    /**
     * 获取 记录评估指标主键标识
     */
    public java.lang.Long getEvalIndexId() {
        return this.evalIndexId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evalIndexId = SeqUtils.createLongId(ID_SEQ);
         return this.evalIndexId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录评估指标的名称
     */
    public void setEvalIndexName(java.lang.String evalIndexName) {
        this.evalIndexName = evalIndexName;
    }

    /**
     * 获取 记录评估指标的名称
     */
    public java.lang.String getEvalIndexName() {
        return this.evalIndexName;
    }

    /**
     * 设置 记录评估指标的描述说明
     */
    public void setEvalIndexDesc(java.lang.String evalIndexDesc) {
        this.evalIndexDesc = evalIndexDesc;
    }

    /**
     * 获取 记录评估指标的描述说明
     */
    public java.lang.String getEvalIndexDesc() {
        return this.evalIndexDesc;
    }

    /**
     * 设置 记录评估指标的类型，包括分为用户级指标和分析指标,LOVB=CAM-C-0026
     */
    public void setEvalIndexType(java.lang.String evalIndexType) {
        this.evalIndexType = evalIndexType;
    }

    /**
     * 获取 记录评估指标的类型，包括分为用户级指标和分析指标,LOVB=CAM-C-0026
     */
    public java.lang.String getEvalIndexType() {
        return this.evalIndexType;
    }

    /**
     * 设置 记录评估指标的计算公式
     */
    public void setCalExpression(java.lang.String calExpression) {
        this.calExpression = calExpression;
    }

    /**
     * 获取 记录评估指标的计算公式
     */
    public java.lang.String getCalExpression() {
        return this.calExpression;
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
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
