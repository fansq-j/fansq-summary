package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述系统用户与角色之间的对应关系，是多对多关系。一个系统用户除了拥有系统岗位所带的角色和权限，也可以拥有多个私有的角色，
 * @实体表  :SYSTEM_USER_ROLE
 */
public class SystemUserRoleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_USER_ROLE_S";

    /**
     * 系统用户角色标识，主键
     */
    public java.lang.Long sysUserRoleId;

    /**
     * 角色标识
     */
    public java.lang.Long sysRoleId;

    /**
     * 系统用户标识
     */
    public java.lang.Long sysUserId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
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
     * 设置 系统用户角色标识，主键
     */
    public void setSysUserRoleId(java.lang.Long sysUserRoleId) {
        this.sysUserRoleId = sysUserRoleId;
    }

    /**
     * 获取 系统用户角色标识，主键
     */
    public java.lang.Long getSysUserRoleId() {
        return this.sysUserRoleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.sysUserRoleId = SeqUtils.createLongId(ID_SEQ);
         return this.sysUserRoleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 角色标识
     */
    public void setSysRoleId(java.lang.Long sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    /**
     * 获取 角色标识
     */
    public java.lang.Long getSysRoleId() {
        return this.sysRoleId;
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
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
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
