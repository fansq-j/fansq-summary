package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录会员参加俱乐部活动的信息。
 * @实体表  :MEMBER_ACTION_RECORD
 */
public class MemberActionRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MEMBER_ACTION_RECORD_S";

    /**
     * 记录会员活动记录标识。
     */
    public java.lang.Long recordId;

    /**
     * 记录俱乐部活动标识。
     */
    public java.lang.Long actionId;

    /**
     * 俱乐部会员标识，主键
     */
    public java.lang.Long clubMemberId;

    /**
     * 记录会员参加活动的日期。
     */
    public java.util.Date actionDate;

    /**
     * 记录会员参加活动的地点。
     */
    public java.lang.String actionPlace;

    /**
     * 记录会员活动详细内容。
     */
    public java.lang.String actionContent;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 记录会员活动记录标识。
     */
    public void setRecordId(java.lang.Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取 记录会员活动记录标识。
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
     * 设置 记录俱乐部活动标识。
     */
    public void setActionId(java.lang.Long actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取 记录俱乐部活动标识。
     */
    public java.lang.Long getActionId() {
        return this.actionId;
    }

    /**
     * 设置 俱乐部会员标识，主键
     */
    public void setClubMemberId(java.lang.Long clubMemberId) {
        this.clubMemberId = clubMemberId;
    }

    /**
     * 获取 俱乐部会员标识，主键
     */
    public java.lang.Long getClubMemberId() {
        return this.clubMemberId;
    }

    /**
     * 设置 记录会员参加活动的日期。
     */
    public void setActionDate(java.util.Date actionDate) {
        this.actionDate = actionDate;
    }

    /**
     * 获取 记录会员参加活动的日期。
     */
    public java.util.Date getActionDate() {
        return this.actionDate;
    }

    /**
     * 设置 记录会员参加活动的地点。
     */
    public void setActionPlace(java.lang.String actionPlace) {
        this.actionPlace = actionPlace;
    }

    /**
     * 获取 记录会员参加活动的地点。
     */
    public java.lang.String getActionPlace() {
        return this.actionPlace;
    }

    /**
     * 设置 记录会员活动详细内容。
     */
    public void setActionContent(java.lang.String actionContent) {
        this.actionContent = actionContent;
    }

    /**
     * 获取 记录会员活动详细内容。
     */
    public java.lang.String getActionContent() {
        return this.actionContent;
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
