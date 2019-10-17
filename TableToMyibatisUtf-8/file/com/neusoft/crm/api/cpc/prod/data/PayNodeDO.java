package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述商户的某个使用者开通哪些支付渠道
 * @实体表  :PAY_NODE
 */
public class PayNodeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_NODE_S";

    /**
     * 支付节点标识主键
     */
    public java.lang.Integer payNodeId;

    /**
     * 对应支付使用系统标识主键
     */
    public java.lang.Integer payUserId;

    /**
     * 对应支付渠道标识主键
     */
    public java.lang.Integer payChannelId;

    /**
     * 商户帐号标识主键
     */
    public java.lang.Integer tenantAccountId;

    /**
     * 支付节点名称
     */
    public java.lang.String payNodeName;

    /**
     * 归属的区域
     */
    public java.lang.Integer regionId;

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
     * 设置 支付节点标识主键
     */
    public void setPayNodeId(java.lang.Integer payNodeId) {
        this.payNodeId = payNodeId;
    }

    /**
     * 获取 支付节点标识主键
     */
    public java.lang.Integer getPayNodeId() {
        return this.payNodeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.payNodeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.payNodeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对应支付使用系统标识主键
     */
    public void setPayUserId(java.lang.Integer payUserId) {
        this.payUserId = payUserId;
    }

    /**
     * 获取 对应支付使用系统标识主键
     */
    public java.lang.Integer getPayUserId() {
        return this.payUserId;
    }

    /**
     * 设置 对应支付渠道标识主键
     */
    public void setPayChannelId(java.lang.Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * 获取 对应支付渠道标识主键
     */
    public java.lang.Integer getPayChannelId() {
        return this.payChannelId;
    }

    /**
     * 设置 商户帐号标识主键
     */
    public void setTenantAccountId(java.lang.Integer tenantAccountId) {
        this.tenantAccountId = tenantAccountId;
    }

    /**
     * 获取 商户帐号标识主键
     */
    public java.lang.Integer getTenantAccountId() {
        return this.tenantAccountId;
    }

    /**
     * 设置 支付节点名称
     */
    public void setPayNodeName(java.lang.String payNodeName) {
        this.payNodeName = payNodeName;
    }

    /**
     * 获取 支付节点名称
     */
    public java.lang.String getPayNodeName() {
        return this.payNodeName;
    }

    /**
     * 设置 归属的区域
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属的区域
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
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
