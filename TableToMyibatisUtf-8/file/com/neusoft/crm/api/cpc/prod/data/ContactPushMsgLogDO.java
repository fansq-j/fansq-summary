package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:推送消息日志，记录一条消息推送或反馈过程的详细日志。
增加是否撤单标识，用于多渠道协同推送中撤单情况标识。
 * @实体表  :CONTACT_PUSH_MSG_LOG
 */
public class ContactPushMsgLogDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_PUSH_MSG_LOG_S";

    /**
     * 消息推送日志标识
     */
    public java.lang.Long pushMsgLogId;

    /**
     * 推送消息标识
     */
    public java.lang.Long pushMsgId;

    /**
     * 日志内容
     */
    public java.lang.String log;

    /**
     * 推送时间
     */
    public java.util.Date pushTime;

    /**
     * 记录是否撤单。LOVB=PUB-C-0006
     */
    public java.lang.Integer isCancel;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 消息推送日志标识
     */
    public void setPushMsgLogId(java.lang.Long pushMsgLogId) {
        this.pushMsgLogId = pushMsgLogId;
    }

    /**
     * 获取 消息推送日志标识
     */
    public java.lang.Long getPushMsgLogId() {
        return this.pushMsgLogId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pushMsgLogId = SeqUtils.createLongId(ID_SEQ);
         return this.pushMsgLogId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 推送消息标识
     */
    public void setPushMsgId(java.lang.Long pushMsgId) {
        this.pushMsgId = pushMsgId;
    }

    /**
     * 获取 推送消息标识
     */
    public java.lang.Long getPushMsgId() {
        return this.pushMsgId;
    }

    /**
     * 设置 日志内容
     */
    public void setLog(java.lang.String log) {
        this.log = log;
    }

    /**
     * 获取 日志内容
     */
    public java.lang.String getLog() {
        return this.log;
    }

    /**
     * 设置 推送时间
     */
    public void setPushTime(java.util.Date pushTime) {
        this.pushTime = pushTime;
    }

    /**
     * 获取 推送时间
     */
    public java.util.Date getPushTime() {
        return this.pushTime;
    }

    /**
     * 设置 记录是否撤单。LOVB=PUB-C-0006
     */
    public void setIsCancel(java.lang.Integer isCancel) {
        this.isCancel = isCancel;
    }

    /**
     * 获取 记录是否撤单。LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsCancel() {
        return this.isCancel;
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
