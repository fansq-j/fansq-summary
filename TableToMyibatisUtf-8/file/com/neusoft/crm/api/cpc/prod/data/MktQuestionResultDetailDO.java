package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录每道题的调查结果
 * @实体表  :MKT_QUESTION_RESULT_DETAIL
 */
public class MktQuestionResultDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_QUESTION_RESULT_DETAIL_S";

    /**
     * 问卷结果明细标识,主键
     */
    public java.lang.Long resultDetailId;

    /**
     * 问卷问题结果标识
     */
    public java.lang.Long questionResultId;

    /**
     * 问题标识
     */
    public java.lang.Long questionId;

    /**
     * 题库明细标识
     */
    public java.lang.Long qstDetailId;

    /**
     * 记录输入填写的结果
     */
    public java.lang.String answer;

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
     * 设置 问卷结果明细标识,主键
     */
    public void setResultDetailId(java.lang.Long resultDetailId) {
        this.resultDetailId = resultDetailId;
    }

    /**
     * 获取 问卷结果明细标识,主键
     */
    public java.lang.Long getResultDetailId() {
        return this.resultDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.resultDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.resultDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 问卷问题结果标识
     */
    public void setQuestionResultId(java.lang.Long questionResultId) {
        this.questionResultId = questionResultId;
    }

    /**
     * 获取 问卷问题结果标识
     */
    public java.lang.Long getQuestionResultId() {
        return this.questionResultId;
    }

    /**
     * 设置 问题标识
     */
    public void setQuestionId(java.lang.Long questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取 问题标识
     */
    public java.lang.Long getQuestionId() {
        return this.questionId;
    }

    /**
     * 设置 题库明细标识
     */
    public void setQstDetailId(java.lang.Long qstDetailId) {
        this.qstDetailId = qstDetailId;
    }

    /**
     * 获取 题库明细标识
     */
    public java.lang.Long getQstDetailId() {
        return this.qstDetailId;
    }

    /**
     * 设置 记录输入填写的结果
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    /**
     * 获取 记录输入填写的结果
     */
    public java.lang.String getAnswer() {
        return this.answer;
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
