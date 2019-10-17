package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:题库明细，记录问题的可选答案明细
 * @实体表  :MKT_QUESTION_DETAIL
 */
public class MktQuestionDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_QUESTION_DETAIL_S";

    /**
     * 题库明细标识，主键
     */
    public java.lang.Long qstDetailId;

    /**
     * 问题标识,主键
     */
    public java.lang.Long questionId;

    /**
     * 在该问卷中，问题的显示顺序
     */
    public java.lang.Integer qstDetailOrder;

    /**
     * 记录该题库明细的具体答案
     */
    public java.lang.String qstDetailValue;

    /**
     * 题库明细输入类型，LOVB=CAM-C-0029
     */
    public java.lang.String qstDetailInputType;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 题库明细标识，主键
     */
    public void setQstDetailId(java.lang.Long qstDetailId) {
        this.qstDetailId = qstDetailId;
    }

    /**
     * 获取 题库明细标识，主键
     */
    public java.lang.Long getQstDetailId() {
        return this.qstDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.qstDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.qstDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 问题标识,主键
     */
    public void setQuestionId(java.lang.Long questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取 问题标识,主键
     */
    public java.lang.Long getQuestionId() {
        return this.questionId;
    }

    /**
     * 设置 在该问卷中，问题的显示顺序
     */
    public void setQstDetailOrder(java.lang.Integer qstDetailOrder) {
        this.qstDetailOrder = qstDetailOrder;
    }

    /**
     * 获取 在该问卷中，问题的显示顺序
     */
    public java.lang.Integer getQstDetailOrder() {
        return this.qstDetailOrder;
    }

    /**
     * 设置 记录该题库明细的具体答案
     */
    public void setQstDetailValue(java.lang.String qstDetailValue) {
        this.qstDetailValue = qstDetailValue;
    }

    /**
     * 获取 记录该题库明细的具体答案
     */
    public java.lang.String getQstDetailValue() {
        return this.qstDetailValue;
    }

    /**
     * 设置 题库明细输入类型，LOVB=CAM-C-0029
     */
    public void setQstDetailInputType(java.lang.String qstDetailInputType) {
        this.qstDetailInputType = qstDetailInputType;
    }

    /**
     * 获取 题库明细输入类型，LOVB=CAM-C-0029
     */
    public java.lang.String getQstDetailInputType() {
        return this.qstDetailInputType;
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
