package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录系统用户在特定任职组织下分配的系统岗位，一个系统用户可以分配多个系统岗位。
 * @实体表  :SYSTEM_USER_POST
 */
public class SystemUserPostDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_USER_POST_S";

    /**
     * 系统用户任职岗位标识，主键
     */
    public java.lang.Long sysUserPostId;

    /**
     * 系统用户标识
     */
    public java.lang.Long sysUserId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 系统岗位标识
     */
    public java.lang.Long sysPostId;

    /**
     * 是否默认登录系统岗位，LOVB=PUB-C-0006。
     */
    public java.lang.Integer defaultFlag;

    /**
     * 是否主岗位，便于酬金结算
     */
    public java.lang.Integer hostFlag;

    /**
     * 系统用户任职组织生效时间
     */
    public java.util.Date effDate;

    /**
     * 系统用户任职组织失效时间
     */
    public java.util.Date expDate;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 系统用户任职岗位标识，主键
     */
    public void setSysUserPostId(java.lang.Long sysUserPostId) {
        this.sysUserPostId = sysUserPostId;
    }

    /**
     * 获取 系统用户任职岗位标识，主键
     */
    public java.lang.Long getSysUserPostId() {
        return this.sysUserPostId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.sysUserPostId = SeqUtils.createLongId(ID_SEQ);
         return this.sysUserPostId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 系统用户标识
     */
    public void setSysUserId(java.lang.Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * 获取 系统用户标识
     */
    public java.lang.Long getSysUserId() {
        return this.sysUserId;
    }

    /**
     * 设置 组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 系统岗位标识
     */
    public void setSysPostId(java.lang.Long sysPostId) {
        this.sysPostId = sysPostId;
    }

    /**
     * 获取 系统岗位标识
     */
    public java.lang.Long getSysPostId() {
        return this.sysPostId;
    }

    /**
     * 设置 是否默认登录系统岗位，LOVB=PUB-C-0006。
     */
    public void setDefaultFlag(java.lang.Integer defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    /**
     * 获取 是否默认登录系统岗位，LOVB=PUB-C-0006。
     */
    public java.lang.Integer getDefaultFlag() {
        return this.defaultFlag;
    }

    /**
     * 设置 是否主岗位，便于酬金结算
     */
    public void setHostFlag(java.lang.Integer hostFlag) {
        this.hostFlag = hostFlag;
    }

    /**
     * 获取 是否主岗位，便于酬金结算
     */
    public java.lang.Integer getHostFlag() {
        return this.hostFlag;
    }

    /**
     * 设置 系统用户任职组织生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 系统用户任职组织生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 系统用户任职组织失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 系统用户任职组织失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
