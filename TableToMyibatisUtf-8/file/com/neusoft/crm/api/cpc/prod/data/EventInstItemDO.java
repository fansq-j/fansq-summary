package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录触点事件实例的采集项信息
根据触点事件采集项信息实例化，方便实时计算、实时推送、推送反馈模块根据事件流水
 * @实体表  :EVENT_INST_ITEM
 */
public class EventInstItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_INST_ITEM_S";

    /**
     * 记录事件实例采集项的主键标识
     */
    public java.lang.Long evtInstItemId;

    /**
     * 记录事件的主键标识
     */
    public java.lang.Long evtInstId;

    /**
     * 事件采集项主键
     */
    public java.lang.Long evtItemId;

    /**
     * 记录事件采集项的编码，主要用于格式化
     */
    public java.lang.String evtItemCode;

    /**
     * 记录事件采集项值
     */
    public java.lang.String evtItemValue;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录事件实例采集项的主键标识
     */
    public void setEvtInstItemId(java.lang.Long evtInstItemId) {
        this.evtInstItemId = evtInstItemId;
    }

    /**
     * 获取 记录事件实例采集项的主键标识
     */
    public java.lang.Long getEvtInstItemId() {
        return this.evtInstItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evtInstItemId = SeqUtils.createLongId(ID_SEQ);
         return this.evtInstItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录事件的主键标识
     */
    public void setEvtInstId(java.lang.Long evtInstId) {
        this.evtInstId = evtInstId;
    }

    /**
     * 获取 记录事件的主键标识
     */
    public java.lang.Long getEvtInstId() {
        return this.evtInstId;
    }

    /**
     * 设置 事件采集项主键
     */
    public void setEvtItemId(java.lang.Long evtItemId) {
        this.evtItemId = evtItemId;
    }

    /**
     * 获取 事件采集项主键
     */
    public java.lang.Long getEvtItemId() {
        return this.evtItemId;
    }

    /**
     * 设置 记录事件采集项的编码，主要用于格式化
     */
    public void setEvtItemCode(java.lang.String evtItemCode) {
        this.evtItemCode = evtItemCode;
    }

    /**
     * 获取 记录事件采集项的编码，主要用于格式化
     */
    public java.lang.String getEvtItemCode() {
        return this.evtItemCode;
    }

    /**
     * 设置 记录事件采集项值
     */
    public void setEvtItemValue(java.lang.String evtItemValue) {
        this.evtItemValue = evtItemValue;
    }

    /**
     * 获取 记录事件采集项值
     */
    public java.lang.String getEvtItemValue() {
        return this.evtItemValue;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
