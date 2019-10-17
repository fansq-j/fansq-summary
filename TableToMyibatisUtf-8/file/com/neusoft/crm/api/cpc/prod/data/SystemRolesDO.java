package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述员工的系统权限集合，是用以定义系统使用人员操作权限的实体。
 * @实体表  :SYSTEM_ROLES
 */
public class SystemRolesDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_ROLES_S";

    /**
     * 角色标识
     */
    public java.lang.Long sysRoleId;

    /**
     * 角色名称
     */
    public java.lang.String sysRoleName;

    /**
     * 角色编码
     */
    public java.lang.String sysRoleCode;

    /**
     * 角色类型,LOVB=STF-C-0012。
     */
    public java.lang.String sysRoleType;

    /**
     * 角色描述
     */
    public java.lang.String sysRoleDesc;

    /**
     * 是否系统初始数据
     */
    public java.lang.Integer initFlag;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 系统用户的归属系统
     */
    public java.lang.Long systemInfoId;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.sysRoleId = SeqUtils.createLongId(ID_SEQ);
         return this.sysRoleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 角色名称
     */
    public void setSysRoleName(java.lang.String sysRoleName) {
        this.sysRoleName = sysRoleName;
    }

    /**
     * 获取 角色名称
     */
    public java.lang.String getSysRoleName() {
        return this.sysRoleName;
    }

    /**
     * 设置 角色编码
     */
    public void setSysRoleCode(java.lang.String sysRoleCode) {
        this.sysRoleCode = sysRoleCode;
    }

    /**
     * 获取 角色编码
     */
    public java.lang.String getSysRoleCode() {
        return this.sysRoleCode;
    }

    /**
     * 设置 角色类型,LOVB=STF-C-0012。
     */
    public void setSysRoleType(java.lang.String sysRoleType) {
        this.sysRoleType = sysRoleType;
    }

    /**
     * 获取 角色类型,LOVB=STF-C-0012。
     */
    public java.lang.String getSysRoleType() {
        return this.sysRoleType;
    }

    /**
     * 设置 角色描述
     */
    public void setSysRoleDesc(java.lang.String sysRoleDesc) {
        this.sysRoleDesc = sysRoleDesc;
    }

    /**
     * 获取 角色描述
     */
    public java.lang.String getSysRoleDesc() {
        return this.sysRoleDesc;
    }

    /**
     * 设置 是否系统初始数据
     */
    public void setInitFlag(java.lang.Integer initFlag) {
        this.initFlag = initFlag;
    }

    /**
     * 获取 是否系统初始数据
     */
    public java.lang.Integer getInitFlag() {
        return this.initFlag;
    }

    /**
     * 设置 公用管理区域标识,记录区域唯一标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 系统用户的归属系统
     */
    public void setSystemInfoId(java.lang.Long systemInfoId) {
        this.systemInfoId = systemInfoId;
    }

    /**
     * 获取 系统用户的归属系统
     */
    public java.lang.Long getSystemInfoId() {
        return this.systemInfoId;
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
