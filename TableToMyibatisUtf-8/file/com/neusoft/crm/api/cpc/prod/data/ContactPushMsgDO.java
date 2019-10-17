package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录具体需要向用户推送的内容。一条推送消息包括了，通过什么方式，向哪个渠道，哪个账号推送哪些内容(把推荐任务带下来的推荐
 * @实体表  :CONTACT_PUSH_MSG
 */
public class ContactPushMsgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_PUSH_MSG_S";

    /**
     * 推送消息标识
     */
    public java.lang.Long pushMsgId;

    /**
     * 接触调度单标识
     */
    public java.lang.Long contactOrderId;

    /**
     * 接触渠道
     */
    public java.lang.Long contactChlId;

    /**
     * 推送方式,LOVB=CAM-C-0007
     */
    public java.lang.String pushType;

    /**
     * 描述具体每条推送消息推送的目标触点渠道详细信息，用于寻址等
     */
    public java.lang.String pushAccount;

    /**
     * 推送消息内容
     */
    public java.lang.String msgContent;

    /**
     * 计划推送时间
     */
    public java.util.Date planDate;

    /**
     * 实际推送时间
     */
    public java.util.Date pushDate;

    /**
     * 重复发送次数
     */
    public java.lang.Integer pushCount;

    /**
     * 优先级
     */
    public java.lang.Integer priority;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pushMsgId = SeqUtils.createLongId(ID_SEQ);
         return this.pushMsgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 接触调度单标识
     */
    public void setContactOrderId(java.lang.Long contactOrderId) {
        this.contactOrderId = contactOrderId;
    }

    /**
     * 获取 接触调度单标识
     */
    public java.lang.Long getContactOrderId() {
        return this.contactOrderId;
    }

    /**
     * 设置 接触渠道
     */
    public void setContactChlId(java.lang.Long contactChlId) {
        this.contactChlId = contactChlId;
    }

    /**
     * 获取 接触渠道
     */
    public java.lang.Long getContactChlId() {
        return this.contactChlId;
    }

    /**
     * 设置 推送方式,LOVB=CAM-C-0007
     */
    public void setPushType(java.lang.String pushType) {
        this.pushType = pushType;
    }

    /**
     * 获取 推送方式,LOVB=CAM-C-0007
     */
    public java.lang.String getPushType() {
        return this.pushType;
    }

    /**
     * 设置 描述具体每条推送消息推送的目标触点渠道详细信息，用于寻址等
     */
    public void setPushAccount(java.lang.String pushAccount) {
        this.pushAccount = pushAccount;
    }

    /**
     * 获取 描述具体每条推送消息推送的目标触点渠道详细信息，用于寻址等
     */
    public java.lang.String getPushAccount() {
        return this.pushAccount;
    }

    /**
     * 设置 推送消息内容
     */
    public void setMsgContent(java.lang.String msgContent) {
        this.msgContent = msgContent;
    }

    /**
     * 获取 推送消息内容
     */
    public java.lang.String getMsgContent() {
        return this.msgContent;
    }

    /**
     * 设置 计划推送时间
     */
    public void setPlanDate(java.util.Date planDate) {
        this.planDate = planDate;
    }

    /**
     * 获取 计划推送时间
     */
    public java.util.Date getPlanDate() {
        return this.planDate;
    }

    /**
     * 设置 实际推送时间
     */
    public void setPushDate(java.util.Date pushDate) {
        this.pushDate = pushDate;
    }

    /**
     * 获取 实际推送时间
     */
    public java.util.Date getPushDate() {
        return this.pushDate;
    }

    /**
     * 设置 重复发送次数
     */
    public void setPushCount(java.lang.Integer pushCount) {
        this.pushCount = pushCount;
    }

    /**
     * 获取 重复发送次数
     */
    public java.lang.Integer getPushCount() {
        return this.pushCount;
    }

    /**
     * 设置 优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
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
