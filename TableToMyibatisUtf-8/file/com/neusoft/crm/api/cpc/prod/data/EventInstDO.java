package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录事件实例的基本信息
采集的事件报文经过封装、标准化预处理、事件匹配后生成的触点事件信息保存在事件实例实体
 * @实体表  :EVENT_INST
 */
public class EventInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_INST_S";

    /**
     * 记录事件实例的主键标识
     */
    public java.lang.Long evtInstId;

    /**
     * 记录事件的流水号，流水号的生成规则为EVT+17位日期时间数+5位随机数字
     */
    public java.lang.String evtSerialNum;

    /**
     * 记录事件的主键标识
     */
    public java.lang.Long eventId;

    /**
     * 记录事件的采集时间
     */
    public java.util.Date evtCollectTime;

    /**
     * 记录事件的采集内容，通过json串表示，如采集的事件内容包含业务号码189*******，用{acc_nbr:‘189*******’,.....}
     */
    public java.lang.String evtContent;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录事件实例的主键标识
     */
    public void setEvtInstId(java.lang.Long evtInstId) {
        this.evtInstId = evtInstId;
    }

    /**
     * 获取 记录事件实例的主键标识
     */
    public java.lang.Long getEvtInstId() {
        return this.evtInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evtInstId = SeqUtils.createLongId(ID_SEQ);
         return this.evtInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录事件的流水号，流水号的生成规则为EVT+17位日期时间数+5位随机数字
     */
    public void setEvtSerialNum(java.lang.String evtSerialNum) {
        this.evtSerialNum = evtSerialNum;
    }

    /**
     * 获取 记录事件的流水号，流水号的生成规则为EVT+17位日期时间数+5位随机数字
     */
    public java.lang.String getEvtSerialNum() {
        return this.evtSerialNum;
    }

    /**
     * 设置 记录事件的主键标识
     */
    public void setEventId(java.lang.Long eventId) {
        this.eventId = eventId;
    }

    /**
     * 获取 记录事件的主键标识
     */
    public java.lang.Long getEventId() {
        return this.eventId;
    }

    /**
     * 设置 记录事件的采集时间
     */
    public void setEvtCollectTime(java.util.Date evtCollectTime) {
        this.evtCollectTime = evtCollectTime;
    }

    /**
     * 获取 记录事件的采集时间
     */
    public java.util.Date getEvtCollectTime() {
        return this.evtCollectTime;
    }

    /**
     * 设置 记录事件的采集内容，通过json串表示，如采集的事件内容包含业务号码189*******，用{acc_nbr:‘189*******’,.....}
     */
    public void setEvtContent(java.lang.String evtContent) {
        this.evtContent = evtContent;
    }

    /**
     * 获取 记录事件的采集内容，通过json串表示，如采集的事件内容包含业务号码189*******，用{acc_nbr:‘189*******’,.....}
     */
    public java.lang.String getEvtContent() {
        return this.evtContent;
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
