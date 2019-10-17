package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录商户在各个支付渠道的帐号信息
 * @实体表  :COMMERCIAL_TENANT_ACCOUNT
 */
public class CommercialTenantAccountDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COMMERCIAL_TENANT_ACCOUNT_S";

    /**
     * 商户帐号标识主键
     */
    public java.lang.Integer tenantAccountId;

    /**
     * 支付渠道标识
     */
    public java.lang.Integer payChannelId;

    /**
     * 加密方法标识
     */
    public java.lang.Integer signTypeId;

    /**
     * 电信组织标识主键
     */
    public java.lang.Long orgId;

    /**
     * 在支付渠道的帐号信息
     */
    public java.lang.String account;

    /**
     * 支付渠道appid
     */
    public java.lang.String channelAppid;

    /**
     * 在支付渠道的子帐号信息
     */
    public java.lang.String subAccount;

    /**
     * 在支付渠道的子appid
     */
    public java.lang.String channelSubAppid;

    /**
     * 支付渠道私钥
     */
    public java.lang.String channelPrivateKey;

    /**
     * 支付渠道公钥
     */
    public java.lang.String channelPubliceKey;

    /**
     * HTTPS证书路径
     */
    public java.lang.String sslcertPath;

    /**
     * HTTPS证书密码
     */
    public java.lang.String sslcertPassword;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.tenantAccountId = SeqUtils.createIntegerId(ID_SEQ);
         return this.tenantAccountId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 支付渠道标识
     */
    public void setPayChannelId(java.lang.Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * 获取 支付渠道标识
     */
    public java.lang.Integer getPayChannelId() {
        return this.payChannelId;
    }

    /**
     * 设置 加密方法标识
     */
    public void setSignTypeId(java.lang.Integer signTypeId) {
        this.signTypeId = signTypeId;
    }

    /**
     * 获取 加密方法标识
     */
    public java.lang.Integer getSignTypeId() {
        return this.signTypeId;
    }

    /**
     * 设置 电信组织标识主键
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 电信组织标识主键
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 在支付渠道的帐号信息
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }

    /**
     * 获取 在支付渠道的帐号信息
     */
    public java.lang.String getAccount() {
        return this.account;
    }

    /**
     * 设置 支付渠道appid
     */
    public void setChannelAppid(java.lang.String channelAppid) {
        this.channelAppid = channelAppid;
    }

    /**
     * 获取 支付渠道appid
     */
    public java.lang.String getChannelAppid() {
        return this.channelAppid;
    }

    /**
     * 设置 在支付渠道的子帐号信息
     */
    public void setSubAccount(java.lang.String subAccount) {
        this.subAccount = subAccount;
    }

    /**
     * 获取 在支付渠道的子帐号信息
     */
    public java.lang.String getSubAccount() {
        return this.subAccount;
    }

    /**
     * 设置 在支付渠道的子appid
     */
    public void setChannelSubAppid(java.lang.String channelSubAppid) {
        this.channelSubAppid = channelSubAppid;
    }

    /**
     * 获取 在支付渠道的子appid
     */
    public java.lang.String getChannelSubAppid() {
        return this.channelSubAppid;
    }

    /**
     * 设置 支付渠道私钥
     */
    public void setChannelPrivateKey(java.lang.String channelPrivateKey) {
        this.channelPrivateKey = channelPrivateKey;
    }

    /**
     * 获取 支付渠道私钥
     */
    public java.lang.String getChannelPrivateKey() {
        return this.channelPrivateKey;
    }

    /**
     * 设置 支付渠道公钥
     */
    public void setChannelPubliceKey(java.lang.String channelPubliceKey) {
        this.channelPubliceKey = channelPubliceKey;
    }

    /**
     * 获取 支付渠道公钥
     */
    public java.lang.String getChannelPubliceKey() {
        return this.channelPubliceKey;
    }

    /**
     * 设置 HTTPS证书路径
     */
    public void setSslcertPath(java.lang.String sslcertPath) {
        this.sslcertPath = sslcertPath;
    }

    /**
     * 获取 HTTPS证书路径
     */
    public java.lang.String getSslcertPath() {
        return this.sslcertPath;
    }

    /**
     * 设置 HTTPS证书密码
     */
    public void setSslcertPassword(java.lang.String sslcertPassword) {
        this.sslcertPassword = sslcertPassword;
    }

    /**
     * 获取 HTTPS证书密码
     */
    public java.lang.String getSslcertPassword() {
        return this.sslcertPassword;
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
