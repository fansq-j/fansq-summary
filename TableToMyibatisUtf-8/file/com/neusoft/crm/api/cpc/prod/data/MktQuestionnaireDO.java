package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:调研问卷是用于针对特定目进行调查研究的一组问题及其答案。
 * @实体表  :MKT_QUESTIONNAIRE
 */
public class MktQuestionnaireDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_QUESTIONNAIRE_S";

    /**
     * 问卷标识，主键
     */
    public java.lang.Long naireId;

    /**
     * 问卷名称
     */
    public java.lang.String naireName;

    /**
     * 问卷类型,LOVB=CAM-C-0031
     */
    public java.lang.String naireType;

    /**
     * 评分方式,LOVB=CAM-C-0030
     */
    public java.lang.String markType;

    /**
     * 问卷总分
     */
    public java.lang.Integer nairePoints;

    /**
     * 问卷描述
     */
    public java.lang.String naireDesc;

    /**
     * 开始提示语
     */
    public java.lang.String startTip;

    /**
     * 结束提示语
     */
    public java.lang.String endTip;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.naireId = SeqUtils.createLongId(ID_SEQ);
         return this.naireId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 问卷名称
     */
    public void setNaireName(java.lang.String naireName) {
        this.naireName = naireName;
    }

    /**
     * 获取 问卷名称
     */
    public java.lang.String getNaireName() {
        return this.naireName;
    }

    /**
     * 设置 问卷类型,LOVB=CAM-C-0031
     */
    public void setNaireType(java.lang.String naireType) {
        this.naireType = naireType;
    }

    /**
     * 获取 问卷类型,LOVB=CAM-C-0031
     */
    public java.lang.String getNaireType() {
        return this.naireType;
    }

    /**
     * 设置 评分方式,LOVB=CAM-C-0030
     */
    public void setMarkType(java.lang.String markType) {
        this.markType = markType;
    }

    /**
     * 获取 评分方式,LOVB=CAM-C-0030
     */
    public java.lang.String getMarkType() {
        return this.markType;
    }

    /**
     * 设置 问卷总分
     */
    public void setNairePoints(java.lang.Integer nairePoints) {
        this.nairePoints = nairePoints;
    }

    /**
     * 获取 问卷总分
     */
    public java.lang.Integer getNairePoints() {
        return this.nairePoints;
    }

    /**
     * 设置 问卷描述
     */
    public void setNaireDesc(java.lang.String naireDesc) {
        this.naireDesc = naireDesc;
    }

    /**
     * 获取 问卷描述
     */
    public java.lang.String getNaireDesc() {
        return this.naireDesc;
    }

    /**
     * 设置 开始提示语
     */
    public void setStartTip(java.lang.String startTip) {
        this.startTip = startTip;
    }

    /**
     * 获取 开始提示语
     */
    public java.lang.String getStartTip() {
        return this.startTip;
    }

    /**
     * 设置 结束提示语
     */
    public void setEndTip(java.lang.String endTip) {
        this.endTip = endTip;
    }

    /**
     * 获取 结束提示语
     */
    public java.lang.String getEndTip() {
        return this.endTip;
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
