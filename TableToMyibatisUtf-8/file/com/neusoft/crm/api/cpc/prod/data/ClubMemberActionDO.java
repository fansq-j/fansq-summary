package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录俱乐部的会员活动
 * @实体表  :CLUB_MEMBER_ACTION
 */
public class ClubMemberActionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CLUB_MEMBER_ACTION_S";

    /**
     * 记录俱乐部活动标识
     */
    public java.lang.Long actionId;

    /**
     * 记录俱乐部标识
     */
    public java.lang.Integer clubId;

    /**
     * 记录俱乐部活动名称
     */
    public java.lang.String actionName;

    /**
     * 记录俱乐部活动在系统内的编码
     */
    public java.lang.String actionCode;

    /**
     * 记录俱乐部活动的活动内容
     */
    public java.lang.String actionContent;

    /**
     * 记录关于俱乐部活动的说明
     */
    public java.lang.String actionDesc;

    /**
     * 记录活动开始日期
     */
    public java.util.Date beginDate;

    /**
     * 记录活动结束日期
     */
    public java.util.Date endDate;

    /**
     * 记录活动地点
     */
    public java.lang.String actionPlace;

    /**
     * 记录活动联系人
     */
    public java.lang.String contactPerson;

    /**
     * 记录活动联系人电话
     */
    public java.lang.String contactPhone;

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
     * 设置 记录俱乐部活动标识
     */
    public void setActionId(java.lang.Long actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取 记录俱乐部活动标识
     */
    public java.lang.Long getActionId() {
        return this.actionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.actionId = SeqUtils.createLongId(ID_SEQ);
         return this.actionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录俱乐部标识
     */
    public void setClubId(java.lang.Integer clubId) {
        this.clubId = clubId;
    }

    /**
     * 获取 记录俱乐部标识
     */
    public java.lang.Integer getClubId() {
        return this.clubId;
    }

    /**
     * 设置 记录俱乐部活动名称
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }

    /**
     * 获取 记录俱乐部活动名称
     */
    public java.lang.String getActionName() {
        return this.actionName;
    }

    /**
     * 设置 记录俱乐部活动在系统内的编码
     */
    public void setActionCode(java.lang.String actionCode) {
        this.actionCode = actionCode;
    }

    /**
     * 获取 记录俱乐部活动在系统内的编码
     */
    public java.lang.String getActionCode() {
        return this.actionCode;
    }

    /**
     * 设置 记录俱乐部活动的活动内容
     */
    public void setActionContent(java.lang.String actionContent) {
        this.actionContent = actionContent;
    }

    /**
     * 获取 记录俱乐部活动的活动内容
     */
    public java.lang.String getActionContent() {
        return this.actionContent;
    }

    /**
     * 设置 记录关于俱乐部活动的说明
     */
    public void setActionDesc(java.lang.String actionDesc) {
        this.actionDesc = actionDesc;
    }

    /**
     * 获取 记录关于俱乐部活动的说明
     */
    public java.lang.String getActionDesc() {
        return this.actionDesc;
    }

    /**
     * 设置 记录活动开始日期
     */
    public void setBeginDate(java.util.Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取 记录活动开始日期
     */
    public java.util.Date getBeginDate() {
        return this.beginDate;
    }

    /**
     * 设置 记录活动结束日期
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取 记录活动结束日期
     */
    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * 设置 记录活动地点
     */
    public void setActionPlace(java.lang.String actionPlace) {
        this.actionPlace = actionPlace;
    }

    /**
     * 获取 记录活动地点
     */
    public java.lang.String getActionPlace() {
        return this.actionPlace;
    }

    /**
     * 设置 记录活动联系人
     */
    public void setContactPerson(java.lang.String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * 获取 记录活动联系人
     */
    public java.lang.String getContactPerson() {
        return this.contactPerson;
    }

    /**
     * 设置 记录活动联系人电话
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取 记录活动联系人电话
     */
    public java.lang.String getContactPhone() {
        return this.contactPhone;
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
