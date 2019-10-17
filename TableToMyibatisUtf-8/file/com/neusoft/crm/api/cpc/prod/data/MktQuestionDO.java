package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:题库
 * @实体表  :MKT_QUESTION
 */
public class MktQuestionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_QUESTION_S";

    /**
     * 问题标识,主键
     */
    public java.lang.Long questionId;

    /**
     * 问题名称
     */
    public java.lang.String questionName;

    /**
     * 问题类型,LOVB=CAM-C-0028
     */
    public java.lang.String questionType;

    /**
     * 问题描述
     */
    public java.lang.String questionDesc;

    /**
     * 问题显示类型,LOVB=CAM-C-0027
     */
    public java.lang.String answerType;

    /**
     * 记录问题的默认答案
     */
    public java.lang.String defaultAnswer;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.questionId = SeqUtils.createLongId(ID_SEQ);
         return this.questionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 问题名称
     */
    public void setQuestionName(java.lang.String questionName) {
        this.questionName = questionName;
    }

    /**
     * 获取 问题名称
     */
    public java.lang.String getQuestionName() {
        return this.questionName;
    }

    /**
     * 设置 问题类型,LOVB=CAM-C-0028
     */
    public void setQuestionType(java.lang.String questionType) {
        this.questionType = questionType;
    }

    /**
     * 获取 问题类型,LOVB=CAM-C-0028
     */
    public java.lang.String getQuestionType() {
        return this.questionType;
    }

    /**
     * 设置 问题描述
     */
    public void setQuestionDesc(java.lang.String questionDesc) {
        this.questionDesc = questionDesc;
    }

    /**
     * 获取 问题描述
     */
    public java.lang.String getQuestionDesc() {
        return this.questionDesc;
    }

    /**
     * 设置 问题显示类型,LOVB=CAM-C-0027
     */
    public void setAnswerType(java.lang.String answerType) {
        this.answerType = answerType;
    }

    /**
     * 获取 问题显示类型,LOVB=CAM-C-0027
     */
    public java.lang.String getAnswerType() {
        return this.answerType;
    }

    /**
     * 设置 记录问题的默认答案
     */
    public void setDefaultAnswer(java.lang.String defaultAnswer) {
        this.defaultAnswer = defaultAnswer;
    }

    /**
     * 获取 记录问题的默认答案
     */
    public java.lang.String getDefaultAnswer() {
        return this.defaultAnswer;
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
