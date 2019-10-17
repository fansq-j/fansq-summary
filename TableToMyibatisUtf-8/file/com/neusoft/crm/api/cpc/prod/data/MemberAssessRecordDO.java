package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录俱乐部会员等级评定历史信息。
 * @实体表  :MEMBER_ASSESS_RECORD
 */
public class MemberAssessRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MEMBER_ASSESS_RECORD_S";

    /**
     * 记录会员等级评定记录标识
     */
    public java.lang.Long recordId;

    /**
     * 记录会员标识
     */
    public java.lang.Long clubMemberId;

    /**
     * 记录会员等级评定的结果.LOVB=CLB-0002
     */
    public java.lang.String assessLevel;

    /**
     * 记录关于会员等级评定的补充说明。
     */
    public java.lang.String assessDesc;

    /**
     * 记录评定日期。
     */
    public java.util.Date assessDate;

    /**
     * 记录会员等级评定的操作人工号。
     */
    public java.lang.Long assessStaff;

    /**
     * 记录人工调整时间。
     */
    public java.util.Date adjustDate;

    /**
     * 记录人工调整评定结果的工号。
     */
    public java.lang.Long adjustStaff;

    /**
     * 记录状态编码。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 记录会员等级评定记录标识
     */
    public void setRecordId(java.lang.Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取 记录会员等级评定记录标识
     */
    public java.lang.Long getRecordId() {
        return this.recordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.recordId = SeqUtils.createLongId(ID_SEQ);
         return this.recordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录会员标识
     */
    public void setClubMemberId(java.lang.Long clubMemberId) {
        this.clubMemberId = clubMemberId;
    }

    /**
     * 获取 记录会员标识
     */
    public java.lang.Long getClubMemberId() {
        return this.clubMemberId;
    }

    /**
     * 设置 记录会员等级评定的结果.LOVB=CLB-0002
     */
    public void setAssessLevel(java.lang.String assessLevel) {
        this.assessLevel = assessLevel;
    }

    /**
     * 获取 记录会员等级评定的结果.LOVB=CLB-0002
     */
    public java.lang.String getAssessLevel() {
        return this.assessLevel;
    }

    /**
     * 设置 记录关于会员等级评定的补充说明。
     */
    public void setAssessDesc(java.lang.String assessDesc) {
        this.assessDesc = assessDesc;
    }

    /**
     * 获取 记录关于会员等级评定的补充说明。
     */
    public java.lang.String getAssessDesc() {
        return this.assessDesc;
    }

    /**
     * 设置 记录评定日期。
     */
    public void setAssessDate(java.util.Date assessDate) {
        this.assessDate = assessDate;
    }

    /**
     * 获取 记录评定日期。
     */
    public java.util.Date getAssessDate() {
        return this.assessDate;
    }

    /**
     * 设置 记录会员等级评定的操作人工号。
     */
    public void setAssessStaff(java.lang.Long assessStaff) {
        this.assessStaff = assessStaff;
    }

    /**
     * 获取 记录会员等级评定的操作人工号。
     */
    public java.lang.Long getAssessStaff() {
        return this.assessStaff;
    }

    /**
     * 设置 记录人工调整时间。
     */
    public void setAdjustDate(java.util.Date adjustDate) {
        this.adjustDate = adjustDate;
    }

    /**
     * 获取 记录人工调整时间。
     */
    public java.util.Date getAdjustDate() {
        return this.adjustDate;
    }

    /**
     * 设置 记录人工调整评定结果的工号。
     */
    public void setAdjustStaff(java.lang.Long adjustStaff) {
        this.adjustStaff = adjustStaff;
    }

    /**
     * 获取 记录人工调整评定结果的工号。
     */
    public java.lang.Long getAdjustStaff() {
        return this.adjustStaff;
    }

    /**
     * 设置 记录状态编码。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态编码。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工。
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
     * 设置 记录修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工。
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
