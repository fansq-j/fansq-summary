package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述支付渠道开放的接口信息
 * @实体表  :PAY_CHANNEL_INTERFACE_LIST
 */
public class PayChannelInterfaceListDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_CHANNEL_INTERFACE_LIST_S";

    /**
     * 支付渠道接口标识主键
     */
    public java.lang.Integer payChannelIntfId;

    /**
     * 支付方式
     */
    public java.lang.Integer payMethodId;

    /**
     * 支付渠道接口名称
     */
    public java.lang.String payChannelIntfName;

    /**
     * 支付渠道接口描述
     */
    public java.lang.String payChannelIntfDesc;

    /**
     * 支付渠道接口调用地址
     */
    public java.lang.String payIntfUrl;

    /**
     * 接口回调地址
     */
    public java.lang.String payIntfBackUrl;

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
     * 设置 支付渠道接口标识主键
     */
    public void setPayChannelIntfId(java.lang.Integer payChannelIntfId) {
        this.payChannelIntfId = payChannelIntfId;
    }

    /**
     * 获取 支付渠道接口标识主键
     */
    public java.lang.Integer getPayChannelIntfId() {
        return this.payChannelIntfId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.payChannelIntfId = SeqUtils.createIntegerId(ID_SEQ);
         return this.payChannelIntfId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 支付方式
     */
    public void setPayMethodId(java.lang.Integer payMethodId) {
        this.payMethodId = payMethodId;
    }

    /**
     * 获取 支付方式
     */
    public java.lang.Integer getPayMethodId() {
        return this.payMethodId;
    }

    /**
     * 设置 支付渠道接口名称
     */
    public void setPayChannelIntfName(java.lang.String payChannelIntfName) {
        this.payChannelIntfName = payChannelIntfName;
    }

    /**
     * 获取 支付渠道接口名称
     */
    public java.lang.String getPayChannelIntfName() {
        return this.payChannelIntfName;
    }

    /**
     * 设置 支付渠道接口描述
     */
    public void setPayChannelIntfDesc(java.lang.String payChannelIntfDesc) {
        this.payChannelIntfDesc = payChannelIntfDesc;
    }

    /**
     * 获取 支付渠道接口描述
     */
    public java.lang.String getPayChannelIntfDesc() {
        return this.payChannelIntfDesc;
    }

    /**
     * 设置 支付渠道接口调用地址
     */
    public void setPayIntfUrl(java.lang.String payIntfUrl) {
        this.payIntfUrl = payIntfUrl;
    }

    /**
     * 获取 支付渠道接口调用地址
     */
    public java.lang.String getPayIntfUrl() {
        return this.payIntfUrl;
    }

    /**
     * 设置 接口回调地址
     */
    public void setPayIntfBackUrl(java.lang.String payIntfBackUrl) {
        this.payIntfBackUrl = payIntfBackUrl;
    }

    /**
     * 获取 接口回调地址
     */
    public java.lang.String getPayIntfBackUrl() {
        return this.payIntfBackUrl;
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
