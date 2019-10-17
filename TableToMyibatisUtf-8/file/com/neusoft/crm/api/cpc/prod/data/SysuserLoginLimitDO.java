package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:系统用户登录设置。同一系统用户可以有多种登录设置信息。
 * @实体表  :SYSUSER_LOGIN_LIMIT
 */
public class SysuserLoginLimitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSUSER_LOGIN_LIMIT_S";

    /**
     * 登录设置标识,主键
     */
    public java.lang.Integer loginLimitId;

    /**
     * 系统用户标识
     */
    public java.lang.Long sysUserId;

    /**
     * 登录设置类型，LOVB=STF-C-0009。
     */
    public java.lang.String loginLimitType;

    /**
     * 登录设置IP值
     */
    public java.lang.String loginLimitIpVal;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 系统用户生效时间
     */
    public java.util.Date effDate;

    /**
     * 系统用户失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录系统用户登录设置的状态，如有效、无效等。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录系统用户登录设置创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录系统用户登录设置的创建人
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
     * 登录设置MAC值
     */
    public java.lang.String loginLimitMacVal;

    /**
     * 设置 登录设置标识,主键
     */
    public void setLoginLimitId(java.lang.Integer loginLimitId) {
        this.loginLimitId = loginLimitId;
    }

    /**
     * 获取 登录设置标识,主键
     */
    public java.lang.Integer getLoginLimitId() {
        return this.loginLimitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.loginLimitId = SeqUtils.createIntegerId(ID_SEQ);
         return this.loginLimitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
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
     * 设置 登录设置类型，LOVB=STF-C-0009。
     */
    public void setLoginLimitType(java.lang.String loginLimitType) {
        this.loginLimitType = loginLimitType;
    }

    /**
     * 获取 登录设置类型，LOVB=STF-C-0009。
     */
    public java.lang.String getLoginLimitType() {
        return this.loginLimitType;
    }

    /**
     * 设置 登录设置IP值
     */
    public void setLoginLimitIpVal(java.lang.String loginLimitIpVal) {
        this.loginLimitIpVal = loginLimitIpVal;
    }

    /**
     * 获取 登录设置IP值
     */
    public java.lang.String getLoginLimitIpVal() {
        return this.loginLimitIpVal;
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
     * 设置 记录系统用户登录设置的状态，如有效、无效等。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录系统用户登录设置的状态，如有效、无效等。
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
     * 设置 记录系统用户登录设置创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录系统用户登录设置创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录系统用户登录设置的创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录系统用户登录设置的创建人
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

    /**
     * 设置 登录设置MAC值
     */
    public void setLoginLimitMacVal(java.lang.String loginLimitMacVal) {
        this.loginLimitMacVal = loginLimitMacVal;
    }

    /**
     * 获取 登录设置MAC值
     */
    public java.lang.String getLoginLimitMacVal() {
        return this.loginLimitMacVal;
    }

}
