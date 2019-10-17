package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:批量任务消息接口
 * @实体表  :BATCH_TASK_MQ
 */
public class BatchTaskMqDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_TASK_MQ_S";

    /**
     * 批量任务消息接口标识
     */
    public java.lang.Long batchTaskMqId;

    /**
     * 文件队列标识
     */
    public java.lang.Long batchTaskId;

    /**
     * 适用对象类型
     */
    public java.lang.String objType;

    /**
     * 适用对象标识
     */
    public java.lang.Long objId;

    /**
     * 消息类型
     */
    public java.lang.String mqType;

    /**
     * 消息报文标识
     */
    public java.lang.Long mqContentId;

    /**
     * 状态次数
     */
    public java.lang.Integer statusNum;

    /**
     * 设置 批量任务消息接口标识
     */
    public void setBatchTaskMqId(java.lang.Long batchTaskMqId) {
        this.batchTaskMqId = batchTaskMqId;
    }

    /**
     * 获取 批量任务消息接口标识
     */
    public java.lang.Long getBatchTaskMqId() {
        return this.batchTaskMqId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchTaskMqId = SeqUtils.createLongId(ID_SEQ);
         return this.batchTaskMqId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 文件队列标识
     */
    public void setBatchTaskId(java.lang.Long batchTaskId) {
        this.batchTaskId = batchTaskId;
    }

    /**
     * 获取 文件队列标识
     */
    public java.lang.Long getBatchTaskId() {
        return this.batchTaskId;
    }

    /**
     * 设置 适用对象类型
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 适用对象类型
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 适用对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 适用对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 消息类型
     */
    public void setMqType(java.lang.String mqType) {
        this.mqType = mqType;
    }

    /**
     * 获取 消息类型
     */
    public java.lang.String getMqType() {
        return this.mqType;
    }

    /**
     * 设置 消息报文标识
     */
    public void setMqContentId(java.lang.Long mqContentId) {
        this.mqContentId = mqContentId;
    }

    /**
     * 获取 消息报文标识
     */
    public java.lang.Long getMqContentId() {
        return this.mqContentId;
    }

    /**
     * 设置 状态次数
     */
    public void setStatusNum(java.lang.Integer statusNum) {
        this.statusNum = statusNum;
    }

    /**
     * 获取 状态次数
     */
    public java.lang.Integer getStatusNum() {
        return this.statusNum;
    }

}
