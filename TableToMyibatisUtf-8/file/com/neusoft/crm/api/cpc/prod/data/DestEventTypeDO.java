package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:目标事件类型（dest event type）是目标事件的分类信息，如：本地语音计费事件、长途语音计费事件、固网短信计费
 * @实体表  :DEST_EVENT_TYPE
 */
public class DestEventTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEST_EVENT_TYPE_S";

    /**
     * 目标帐务事件类型的唯一标识。
     */
    public java.lang.Integer eventTypeId;

    /**
     * 目标事件类型的名称。
     */
    public java.lang.String name;

    /**
     * 目标帐务事件类型所属的上层类别。EVT-C-3019
     */
    public java.lang.Integer sumEventType;

    /**
     * 目标事件类型的外部标准编码。
     */
    public java.lang.String eventTypeCode;

    /**
     * 目标事件类型的生效时间
     */
    public java.util.Date effDate;

    /**
     * 目标事件类型的失效时间
     */
    public java.util.Date expDate;

    /**
     * 源事件类型标识
     */
    public java.lang.Integer sourceEventType;

    /**
     * LOVB=EVT-C-3001
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
     * 设置 目标帐务事件类型的唯一标识。
     */
    public void setEventTypeId(java.lang.Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 获取 目标帐务事件类型的唯一标识。
     */
    public java.lang.Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.eventTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.eventTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 目标事件类型的名称。
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 目标事件类型的名称。
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * 设置 目标帐务事件类型所属的上层类别。EVT-C-3019
     */
    public void setSumEventType(java.lang.Integer sumEventType) {
        this.sumEventType = sumEventType;
    }

    /**
     * 获取 目标帐务事件类型所属的上层类别。EVT-C-3019
     */
    public java.lang.Integer getSumEventType() {
        return this.sumEventType;
    }

    /**
     * 设置 目标事件类型的外部标准编码。
     */
    public void setEventTypeCode(java.lang.String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    /**
     * 获取 目标事件类型的外部标准编码。
     */
    public java.lang.String getEventTypeCode() {
        return this.eventTypeCode;
    }

    /**
     * 设置 目标事件类型的生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 目标事件类型的生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 目标事件类型的失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 目标事件类型的失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 源事件类型标识
     */
    public void setSourceEventType(java.lang.Integer sourceEventType) {
        this.sourceEventType = sourceEventType;
    }

    /**
     * 获取 源事件类型标识
     */
    public java.lang.Integer getSourceEventType() {
        return this.sourceEventType;
    }

    /**
     * 设置 LOVB=EVT-C-3001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=EVT-C-3001
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
