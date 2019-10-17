package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述支付的使用者，如网厅系统、前台营业系统、自助终端系统等
 * @实体表  :PAY_USER
 */
public class PayUserDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_USER_S";

    /**
     * 支付使用系统标识主键
     */
    public java.lang.Integer payUserId;

    /**
     * 对应加密方法主键
     */
    public java.lang.Integer signTypeId;

    /**
     * 电信组织标识主键
     */
    public java.lang.Long orgId;

    /**
     * 支付使用系统名称
     */
    public java.lang.String payUserName;

    /**
     * 加密TOKEN
     */
    public java.lang.String token;

    /**
     * 私钥
     */
    public java.lang.String privateKey;

    /**
     * 公钥
     */
    public java.lang.String publicKey;

    /**
     * 
     */
    public java.lang.String pageTransitions;

    /**
     * 
     */
    public java.lang.String callBackInfo;

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
     * 设置 支付使用系统标识主键
     */
    public void setPayUserId(java.lang.Integer payUserId) {
        this.payUserId = payUserId;
    }

    /**
     * 获取 支付使用系统标识主键
     */
    public java.lang.Integer getPayUserId() {
        return this.payUserId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.payUserId = SeqUtils.createIntegerId(ID_SEQ);
         return this.payUserId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对应加密方法主键
     */
    public void setSignTypeId(java.lang.Integer signTypeId) {
        this.signTypeId = signTypeId;
    }

    /**
     * 获取 对应加密方法主键
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
     * 设置 支付使用系统名称
     */
    public void setPayUserName(java.lang.String payUserName) {
        this.payUserName = payUserName;
    }

    /**
     * 获取 支付使用系统名称
     */
    public java.lang.String getPayUserName() {
        return this.payUserName;
    }

    /**
     * 设置 加密TOKEN
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    /**
     * 获取 加密TOKEN
     */
    public java.lang.String getToken() {
        return this.token;
    }

    /**
     * 设置 私钥
     */
    public void setPrivateKey(java.lang.String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * 获取 私钥
     */
    public java.lang.String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * 设置 公钥
     */
    public void setPublicKey(java.lang.String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * 获取 公钥
     */
    public java.lang.String getPublicKey() {
        return this.publicKey;
    }

    /**
     * 设置 
     */
    public void setPageTransitions(java.lang.String pageTransitions) {
        this.pageTransitions = pageTransitions;
    }

    /**
     * 获取 
     */
    public java.lang.String getPageTransitions() {
        return this.pageTransitions;
    }

    /**
     * 设置 
     */
    public void setCallBackInfo(java.lang.String callBackInfo) {
        this.callBackInfo = callBackInfo;
    }

    /**
     * 获取 
     */
    public java.lang.String getCallBackInfo() {
        return this.callBackInfo;
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
