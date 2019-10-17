package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:事件场景。事件场景是指在特定时间、地点下触发的事件及对应的服务执行。事件库是事件场景以一定目录形式进行管理的集合
 * @实体表  :EVENT_SCENE
 */
public class EventSceneDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_SCENE_S";

    /**
     * 事件场景标识
     */
    public java.lang.Long eventSceneId;

    /**
     * 事件场景编码
     */
    public java.lang.String eventSceneNbr;

    /**
     * 事件场景名称
     */
    public java.lang.String eventSceneName;

    /**
     * 事件标识
     */
    public java.lang.Long eventId;

    /**
     * 外部事件场景标识
     */
    public java.lang.Long extEventSceneId;

    /**
     * 事件场景描述
     */
    public java.lang.String eventSceneDesc;

    /**
     * 状态
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
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 事件场景标识
     */
    public void setEventSceneId(java.lang.Long eventSceneId) {
        this.eventSceneId = eventSceneId;
    }

    /**
     * 获取 事件场景标识
     */
    public java.lang.Long getEventSceneId() {
        return this.eventSceneId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.eventSceneId = SeqUtils.createLongId(ID_SEQ);
         return this.eventSceneId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 事件场景编码
     */
    public void setEventSceneNbr(java.lang.String eventSceneNbr) {
        this.eventSceneNbr = eventSceneNbr;
    }

    /**
     * 获取 事件场景编码
     */
    public java.lang.String getEventSceneNbr() {
        return this.eventSceneNbr;
    }

    /**
     * 设置 事件场景名称
     */
    public void setEventSceneName(java.lang.String eventSceneName) {
        this.eventSceneName = eventSceneName;
    }

    /**
     * 获取 事件场景名称
     */
    public java.lang.String getEventSceneName() {
        return this.eventSceneName;
    }

    /**
     * 设置 事件标识
     */
    public void setEventId(java.lang.Long eventId) {
        this.eventId = eventId;
    }

    /**
     * 获取 事件标识
     */
    public java.lang.Long getEventId() {
        return this.eventId;
    }

    /**
     * 设置 外部事件场景标识
     */
    public void setExtEventSceneId(java.lang.Long extEventSceneId) {
        this.extEventSceneId = extEventSceneId;
    }

    /**
     * 获取 外部事件场景标识
     */
    public java.lang.Long getExtEventSceneId() {
        return this.extEventSceneId;
    }

    /**
     * 设置 事件场景描述
     */
    public void setEventSceneDesc(java.lang.String eventSceneDesc) {
        this.eventSceneDesc = eventSceneDesc;
    }

    /**
     * 获取 事件场景描述
     */
    public java.lang.String getEventSceneDesc() {
        return this.eventSceneDesc;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
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
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
