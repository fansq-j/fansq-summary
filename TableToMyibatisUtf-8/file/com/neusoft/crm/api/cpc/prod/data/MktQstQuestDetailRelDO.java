package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:问卷问题明细的关联配置
 * @实体表  :MKT_QST_QUEST_DETAIL_REL
 */
public class MktQstQuestDetailRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_QST_QUEST_DETAIL_REL_S";

    /**
     * 明细关联配置，主键
     */
    public java.lang.Long relConfId;

    /**
     * 问卷标识，主键
     */
    public java.lang.Long aNaireId;

    /**
     * 问题标识,主键
     */
    public java.lang.Long aQuestionId;

    /**
     * 题库明细标识，主键
     */
    public java.lang.Long aQstDetailId;

    /**
     * 约束类型,LOVB=CAM-C-0032
     */
    public java.lang.String rstrType;

    /**
     * 问卷标识，主键
     */
    public java.lang.Long zNaireId;

    /**
     * 问题标识,主键
     */
    public java.lang.Long zQuestionId;

    /**
     * 题库明细标识，主键
     */
    public java.lang.Long zQstDetailId;

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
     * 设置 明细关联配置，主键
     */
    public void setRelConfId(java.lang.Long relConfId) {
        this.relConfId = relConfId;
    }

    /**
     * 获取 明细关联配置，主键
     */
    public java.lang.Long getRelConfId() {
        return this.relConfId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.relConfId = SeqUtils.createLongId(ID_SEQ);
         return this.relConfId;
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
    public void setANaireId(java.lang.Long aNaireId) {
        this.aNaireId = aNaireId;
    }

    /**
     * 获取 问卷标识，主键
     */
    public java.lang.Long getANaireId() {
        return this.aNaireId;
    }

    /**
     * 设置 问题标识,主键
     */
    public void setAQuestionId(java.lang.Long aQuestionId) {
        this.aQuestionId = aQuestionId;
    }

    /**
     * 获取 问题标识,主键
     */
    public java.lang.Long getAQuestionId() {
        return this.aQuestionId;
    }

    /**
     * 设置 题库明细标识，主键
     */
    public void setAQstDetailId(java.lang.Long aQstDetailId) {
        this.aQstDetailId = aQstDetailId;
    }

    /**
     * 获取 题库明细标识，主键
     */
    public java.lang.Long getAQstDetailId() {
        return this.aQstDetailId;
    }

    /**
     * 设置 约束类型,LOVB=CAM-C-0032
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 约束类型,LOVB=CAM-C-0032
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 问卷标识，主键
     */
    public void setZNaireId(java.lang.Long zNaireId) {
        this.zNaireId = zNaireId;
    }

    /**
     * 获取 问卷标识，主键
     */
    public java.lang.Long getZNaireId() {
        return this.zNaireId;
    }

    /**
     * 设置 问题标识,主键
     */
    public void setZQuestionId(java.lang.Long zQuestionId) {
        this.zQuestionId = zQuestionId;
    }

    /**
     * 获取 问题标识,主键
     */
    public java.lang.Long getZQuestionId() {
        return this.zQuestionId;
    }

    /**
     * 设置 题库明细标识，主键
     */
    public void setZQstDetailId(java.lang.Long zQstDetailId) {
        this.zQstDetailId = zQstDetailId;
    }

    /**
     * 获取 题库明细标识，主键
     */
    public java.lang.Long getZQstDetailId() {
        return this.zQstDetailId;
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
