package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:问卷关联的问题
 * @实体表  :MKT_QST_QUEST_REL
 */
public class MktQstQuestRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_QST_QUEST_REL_S";

    /**
     * 问卷问题标识，主键
     */
    public java.lang.Long relId;

    /**
     * 问卷标识，主键
     */
    public java.lang.Long naireId;

    /**
     * 问题标识,主键
     */
    public java.lang.Long questionId;

    /**
     * 在该问卷中，问题的显示顺序
     */
    public java.lang.Integer questionOrder;

    /**
     * 记录在问卷中该问题权重
     */
    public java.lang.Integer questionWeight;

    /**
     * 记录是否参与评分，LOVB=PUB-C-0006
     */
    public java.lang.Integer isMark;

    /**
     * 记录题目是否必答，LOVB=PUB-C-0006
     */
    public java.lang.Integer isMust;

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
     * 设置 问卷问题标识，主键
     */
    public void setRelId(java.lang.Long relId) {
        this.relId = relId;
    }

    /**
     * 获取 问卷问题标识，主键
     */
    public java.lang.Long getRelId() {
        return this.relId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.relId = SeqUtils.createLongId(ID_SEQ);
         return this.relId;
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
    public void setQuestionOrder(java.lang.Integer questionOrder) {
        this.questionOrder = questionOrder;
    }

    /**
     * 获取 在该问卷中，问题的显示顺序
     */
    public java.lang.Integer getQuestionOrder() {
        return this.questionOrder;
    }

    /**
     * 设置 记录在问卷中该问题权重
     */
    public void setQuestionWeight(java.lang.Integer questionWeight) {
        this.questionWeight = questionWeight;
    }

    /**
     * 获取 记录在问卷中该问题权重
     */
    public java.lang.Integer getQuestionWeight() {
        return this.questionWeight;
    }

    /**
     * 设置 记录是否参与评分，LOVB=PUB-C-0006
     */
    public void setIsMark(java.lang.Integer isMark) {
        this.isMark = isMark;
    }

    /**
     * 获取 记录是否参与评分，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsMark() {
        return this.isMark;
    }

    /**
     * 设置 记录题目是否必答，LOVB=PUB-C-0006
     */
    public void setIsMust(java.lang.Integer isMust) {
        this.isMust = isMust;
    }

    /**
     * 获取 记录题目是否必答，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsMust() {
        return this.isMust;
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
