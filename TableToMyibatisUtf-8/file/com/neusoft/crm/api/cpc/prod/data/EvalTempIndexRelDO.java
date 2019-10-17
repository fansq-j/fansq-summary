package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录评估模板和评估指标的关联关系
用于描述评估模版与评估指标的多对多关系
 * @实体表  :EVAL_TEMP_INDEX_REL
 */
public class EvalTempIndexRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVAL_TEMP_INDEX_REL_S";

    /**
     * 记录评估模板和评估指标关联表主键标识
     */
    public java.lang.Long evalTempIndexRelaId;

    /**
     * 记录评估模板的主键标识
     */
    public java.lang.Long evalTemplateId;

    /**
     * 记录评估指标主键标识
     */
    public java.lang.Long evalIndexId;

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
     * 设置 记录评估模板和评估指标关联表主键标识
     */
    public void setEvalTempIndexRelaId(java.lang.Long evalTempIndexRelaId) {
        this.evalTempIndexRelaId = evalTempIndexRelaId;
    }

    /**
     * 获取 记录评估模板和评估指标关联表主键标识
     */
    public java.lang.Long getEvalTempIndexRelaId() {
        return this.evalTempIndexRelaId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evalTempIndexRelaId = SeqUtils.createLongId(ID_SEQ);
         return this.evalTempIndexRelaId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录评估模板的主键标识
     */
    public void setEvalTemplateId(java.lang.Long evalTemplateId) {
        this.evalTemplateId = evalTemplateId;
    }

    /**
     * 获取 记录评估模板的主键标识
     */
    public java.lang.Long getEvalTemplateId() {
        return this.evalTemplateId;
    }

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
