package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录被访者或调研执行人填写问卷中问题的答案或结果。
 * @实体表  :MKT_QUESTION_RESULT
 */
public class MktQuestionResultDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_QUESTION_RESULT_S";

    /**
     * 问卷问题结果标识，主键
     */
    public java.lang.Long questionResultId;

    /**
     * 问卷标识，主键
     */
    public java.lang.Long naireId;

    /**
     * 接触调度单标识
     */
    public java.lang.Long contactOrderId;

    /**
     * 填写结果
     */
    public java.lang.String answer;

    /**
     * 问卷填写人
     */
    public java.lang.String answerPerson;

    /**
     * 问卷填写时间
     */
    public java.util.Date answerDate;

    /**
     * 问卷填写地点
     */
    public java.lang.String answerPlace;

    /**
     * 填写人摘要信息
     */
    public java.lang.String answerPersonInfo;

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
     * 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long lanId;

    /**
     * 设置 问卷问题结果标识，主键
     */
    public void setQuestionResultId(java.lang.Long questionResultId) {
        this.questionResultId = questionResultId;
    }

    /**
     * 获取 问卷问题结果标识，主键
     */
    public java.lang.Long getQuestionResultId() {
        return this.questionResultId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.questionResultId = SeqUtils.createLongId(ID_SEQ);
         return this.questionResultId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 问卷标识，主键
     */
    public void setNaireId(java.lang.Long naireId) {
        this.naireId = naireId;
    }

    /**
     * 获取 问卷标识，主键
     */
    public java.lang.Long getNaireId() {
        return this.naireId;
    }

    /**
     * 设置 接触调度单标识
     */
    public void setContactOrderId(java.lang.Long contactOrderId) {
        this.contactOrderId = contactOrderId;
    }

    /**
     * 获取 接触调度单标识
     */
    public java.lang.Long getContactOrderId() {
        return this.contactOrderId;
    }

    /**
     * 设置 填写结果
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    /**
     * 获取 填写结果
     */
    public java.lang.String getAnswer() {
        return this.answer;
    }

    /**
     * 设置 问卷填写人
     */
    public void setAnswerPerson(java.lang.String answerPerson) {
        this.answerPerson = answerPerson;
    }

    /**
     * 获取 问卷填写人
     */
    public java.lang.String getAnswerPerson() {
        return this.answerPerson;
    }

    /**
     * 设置 问卷填写时间
     */
    public void setAnswerDate(java.util.Date answerDate) {
        this.answerDate = answerDate;
    }

    /**
     * 获取 问卷填写时间
     */
    public java.util.Date getAnswerDate() {
        return this.answerDate;
    }

    /**
     * 设置 问卷填写地点
     */
    public void setAnswerPlace(java.lang.String answerPlace) {
        this.answerPlace = answerPlace;
    }

    /**
     * 获取 问卷填写地点
     */
    public java.lang.String getAnswerPlace() {
        return this.answerPlace;
    }

    /**
     * 设置 填写人摘要信息
     */
    public void setAnswerPersonInfo(java.lang.String answerPersonInfo) {
        this.answerPersonInfo = answerPersonInfo;
    }

    /**
     * 获取 填写人摘要信息
     */
    public java.lang.String getAnswerPersonInfo() {
        return this.answerPersonInfo;
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

    /**
     * 设置 记录本地网标识，数据来源于公共管理区域。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

}
