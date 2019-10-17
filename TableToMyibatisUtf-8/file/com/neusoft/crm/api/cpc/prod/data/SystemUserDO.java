package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录员工登录系统使用的系统帐户，不同的系统可有不同的系统用户。
 * @实体表  :SYSTEM_USER
 */
public class SystemUserDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_USER_S";

    /**
     * 记录系统用户的主键。
     */
    public java.lang.Long sysUserId;

    /**
     * 取员工表中的员工标识为外键。
     */
    public java.lang.Long staffId;

    /**
     * 员工的系统用户账号。
     */
    public java.lang.String sysUserCode;

    /**
     * 密码
     */
    public java.lang.String password;

    /**
     * 记录用户登录系统时输入秘密错误的次数，超过一定次数时锁定用户
     */
    public java.lang.Integer pwdErrCnt;

    /**
     * 记录系统登录用户的短信通知手机号码，用于员工的系统安全验证、短信登录等功能
     */
    public java.lang.Long pwdSmsTel;

    /**
     * 密码状态,LOVB=STF-C-0006。
     */
    public java.lang.String pwdStatus;

    /**
     * 新密码生成时间
     */
    public java.util.Date pwdNewtime;

    /**
     * 密码有效天数,单位为天
     */
    public java.lang.Integer pwdEffectDays;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 系统用户归属的系统信息标识
     */
    public java.lang.Long systemInfoId;

    /**
     * 登录次数限制
     */
    public java.lang.Integer limitCount;

    /**
     * 当前登录次数
     */
    public java.lang.Integer loginedNum;

    /**
     * 系统用户描述
     */
    public java.lang.String sysUserDesc;

    /**
     * 系统用户生效时间
     */
    public java.util.Date effDate;

    /**
     * 系统用户失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录系统用户状态。LOVB=STF-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录系统用户创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录系统用户创建人
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
     * 设置 记录系统用户的主键。
     */
    public void setSysUserId(java.lang.Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * 获取 记录系统用户的主键。
     */
    public java.lang.Long getSysUserId() {
        return this.sysUserId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.sysUserId = SeqUtils.createLongId(ID_SEQ);
         return this.sysUserId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 取员工表中的员工标识为外键。
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 取员工表中的员工标识为外键。
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 员工的系统用户账号。
     */
    public void setSysUserCode(java.lang.String sysUserCode) {
        this.sysUserCode = sysUserCode;
    }

    /**
     * 获取 员工的系统用户账号。
     */
    public java.lang.String getSysUserCode() {
        return this.sysUserCode;
    }

    /**
     * 设置 密码
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * 获取 密码
     */
    public java.lang.String getPassword() {
        return this.password;
    }

    /**
     * 设置 记录用户登录系统时输入秘密错误的次数，超过一定次数时锁定用户
     */
    public void setPwdErrCnt(java.lang.Integer pwdErrCnt) {
        this.pwdErrCnt = pwdErrCnt;
    }

    /**
     * 获取 记录用户登录系统时输入秘密错误的次数，超过一定次数时锁定用户
     */
    public java.lang.Integer getPwdErrCnt() {
        return this.pwdErrCnt;
    }

    /**
     * 设置 记录系统登录用户的短信通知手机号码，用于员工的系统安全验证、短信登录等功能
     */
    public void setPwdSmsTel(java.lang.Long pwdSmsTel) {
        this.pwdSmsTel = pwdSmsTel;
    }

    /**
     * 获取 记录系统登录用户的短信通知手机号码，用于员工的系统安全验证、短信登录等功能
     */
    public java.lang.Long getPwdSmsTel() {
        return this.pwdSmsTel;
    }

    /**
     * 设置 密码状态,LOVB=STF-C-0006。
     */
    public void setPwdStatus(java.lang.String pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    /**
     * 获取 密码状态,LOVB=STF-C-0006。
     */
    public java.lang.String getPwdStatus() {
        return this.pwdStatus;
    }

    /**
     * 设置 新密码生成时间
     */
    public void setPwdNewtime(java.util.Date pwdNewtime) {
        this.pwdNewtime = pwdNewtime;
    }

    /**
     * 获取 新密码生成时间
     */
    public java.util.Date getPwdNewtime() {
        return this.pwdNewtime;
    }

    /**
     * 设置 密码有效天数,单位为天
     */
    public void setPwdEffectDays(java.lang.Integer pwdEffectDays) {
        this.pwdEffectDays = pwdEffectDays;
    }

    /**
     * 获取 密码有效天数,单位为天
     */
    public java.lang.Integer getPwdEffectDays() {
        return this.pwdEffectDays;
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
     * 设置 系统用户归属的系统信息标识
     */
    public void setSystemInfoId(java.lang.Long systemInfoId) {
        this.systemInfoId = systemInfoId;
    }

    /**
     * 获取 系统用户归属的系统信息标识
     */
    public java.lang.Long getSystemInfoId() {
        return this.systemInfoId;
    }

    /**
     * 设置 登录次数限制
     */
    public void setLimitCount(java.lang.Integer limitCount) {
        this.limitCount = limitCount;
    }

    /**
     * 获取 登录次数限制
     */
    public java.lang.Integer getLimitCount() {
        return this.limitCount;
    }

    /**
     * 设置 当前登录次数
     */
    public void setLoginedNum(java.lang.Integer loginedNum) {
        this.loginedNum = loginedNum;
    }

    /**
     * 获取 当前登录次数
     */
    public java.lang.Integer getLoginedNum() {
        return this.loginedNum;
    }

    /**
     * 设置 系统用户描述
     */
    public void setSysUserDesc(java.lang.String sysUserDesc) {
        this.sysUserDesc = sysUserDesc;
    }

    /**
     * 获取 系统用户描述
     */
    public java.lang.String getSysUserDesc() {
        return this.sysUserDesc;
    }

    /**
     * 设置 系统用户生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 系统用户生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 系统用户失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 系统用户失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录系统用户状态。LOVB=STF-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录系统用户状态。LOVB=STF-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录系统用户创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录系统用户创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录系统用户创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录系统用户创建人
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
