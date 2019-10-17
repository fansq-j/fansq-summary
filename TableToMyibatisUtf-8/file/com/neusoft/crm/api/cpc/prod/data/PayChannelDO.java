package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:支付渠道，记录微信、翼支付、支付宝、帐户余额、积分等支付源信息
 * @实体表  :PAY_CHANNEL
 */
public class PayChannelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_CHANNEL_S";

    /**
     * 支付渠道标识主键
     */
    public java.lang.Integer payChannelId;

    /**
     * 支付渠道名称
     */
    public java.lang.String payChannelName;

    /**
     * 联系人
     */
    public java.lang.String contact;

    /**
     * 联系方式
     */
    public java.lang.String contactNumber;

    /**
     * 记录状态。PAY-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 创建日期
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 支付渠道标识主键
     */
    public void setPayChannelId(java.lang.Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * 获取 支付渠道标识主键
     */
    public java.lang.Integer getPayChannelId() {
        return this.payChannelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.payChannelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.payChannelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 支付渠道名称
     */
    public void setPayChannelName(java.lang.String payChannelName) {
        this.payChannelName = payChannelName;
    }

    /**
     * 获取 支付渠道名称
     */
    public java.lang.String getPayChannelName() {
        return this.payChannelName;
    }

    /**
     * 设置 联系人
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }

    /**
     * 获取 联系人
     */
    public java.lang.String getContact() {
        return this.contact;
    }

    /**
     * 设置 联系方式
     */
    public void setContactNumber(java.lang.String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * 获取 联系方式
     */
    public java.lang.String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * 设置 记录状态。PAY-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。PAY-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建日期
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建日期
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
