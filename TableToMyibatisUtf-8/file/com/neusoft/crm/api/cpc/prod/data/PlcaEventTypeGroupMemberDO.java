package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:事件类型组成员
 * @实体表  :PLCA_EVENT_TYPE_GROUP_MEMBER
 */
public class PlcaEventTypeGroupMemberDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_EVENT_TYPE_GROUP_MEMBER_S";

    /**
     * 事件类型组成员标识
     */
    public java.lang.Integer eventTypeGroupMemberId;

    /**
     * 事件类型组标识
     */
    public java.lang.Integer eventTypeGroupId;

    /**
     * 目标帐务事件类型的唯一标识。LOVB=PLC-C-0041
     */
    public java.lang.Integer eventTypeId;

    /**
     * LOVB=PLC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 事件类型组成员标识
     */
    public void setEventTypeGroupMemberId(java.lang.Integer eventTypeGroupMemberId) {
        this.eventTypeGroupMemberId = eventTypeGroupMemberId;
    }

    /**
     * 获取 事件类型组成员标识
     */
    public java.lang.Integer getEventTypeGroupMemberId() {
        return this.eventTypeGroupMemberId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.eventTypeGroupMemberId = SeqUtils.createIntegerId(ID_SEQ);
         return this.eventTypeGroupMemberId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 事件类型组标识
     */
    public void setEventTypeGroupId(java.lang.Integer eventTypeGroupId) {
        this.eventTypeGroupId = eventTypeGroupId;
    }

    /**
     * 获取 事件类型组标识
     */
    public java.lang.Integer getEventTypeGroupId() {
        return this.eventTypeGroupId;
    }

    /**
     * 设置 目标帐务事件类型的唯一标识。LOVB=PLC-C-0041
     */
    public void setEventTypeId(java.lang.Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 获取 目标帐务事件类型的唯一标识。LOVB=PLC-C-0041
     */
    public java.lang.Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
