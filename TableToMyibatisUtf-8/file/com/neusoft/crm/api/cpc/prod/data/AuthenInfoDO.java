package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是指电信用于确认客户接入电信系统的身份和权限信息
 * @实体表  :AUTHEN_INFO
 */
public class AuthenInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AUTHEN_INFO_S";

    /**
     * 记录认证信息标识，作为主键
     */
    public java.lang.Long authenInfoId;

    /**
     * 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long custId;

    /**
     * 记录认证帐号
     */
    public java.lang.String loginAcctName;

    /**
     * 记录客户账号是否管理帐号。LOVB=PUB-C-0006。
     */
    public java.lang.Integer mainAcctFlag;

    /**
     * 记录客户密码类型分类。LOVB=CUS-C-0011。
     */
    public java.lang.String pwdType;

    /**
     * 记录密码值。
     */
    public java.lang.String password;

    /**
     * 记录密码生效时间
     */
    public java.util.Date pwdEffTime;

    /**
     * 记录密码失效时间
     */
    public java.util.Date pwdExpTime;

    /**
     * 记录客户密码状态。LOVB=CUS-C-0012。
     */
    public java.lang.String pwdStatus;

    /**
     * 记录用于接收短信的手机号码
     */
    public java.lang.String mobilePhone;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录认证信息标识，作为主键
     */
    public void setAuthenInfoId(java.lang.Long authenInfoId) {
        this.authenInfoId = authenInfoId;
    }

    /**
     * 获取 记录认证信息标识，作为主键
     */
    public java.lang.Long getAuthenInfoId() {
        return this.authenInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.authenInfoId = SeqUtils.createLongId(ID_SEQ);
         return this.authenInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户标识，作为外键，指向客户实体
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 记录认证帐号
     */
    public void setLoginAcctName(java.lang.String loginAcctName) {
        this.loginAcctName = loginAcctName;
    }

    /**
     * 获取 记录认证帐号
     */
    public java.lang.String getLoginAcctName() {
        return this.loginAcctName;
    }

    /**
     * 设置 记录客户账号是否管理帐号。LOVB=PUB-C-0006。
     */
    public void setMainAcctFlag(java.lang.Integer mainAcctFlag) {
        this.mainAcctFlag = mainAcctFlag;
    }

    /**
     * 获取 记录客户账号是否管理帐号。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getMainAcctFlag() {
        return this.mainAcctFlag;
    }

    /**
     * 设置 记录客户密码类型分类。LOVB=CUS-C-0011。
     */
    public void setPwdType(java.lang.String pwdType) {
        this.pwdType = pwdType;
    }

    /**
     * 获取 记录客户密码类型分类。LOVB=CUS-C-0011。
     */
    public java.lang.String getPwdType() {
        return this.pwdType;
    }

    /**
     * 设置 记录密码值。
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * 获取 记录密码值。
     */
    public java.lang.String getPassword() {
        return this.password;
    }

    /**
     * 设置 记录密码生效时间
     */
    public void setPwdEffTime(java.util.Date pwdEffTime) {
        this.pwdEffTime = pwdEffTime;
    }

    /**
     * 获取 记录密码生效时间
     */
    public java.util.Date getPwdEffTime() {
        return this.pwdEffTime;
    }

    /**
     * 设置 记录密码失效时间
     */
    public void setPwdExpTime(java.util.Date pwdExpTime) {
        this.pwdExpTime = pwdExpTime;
    }

    /**
     * 获取 记录密码失效时间
     */
    public java.util.Date getPwdExpTime() {
        return this.pwdExpTime;
    }

    /**
     * 设置 记录客户密码状态。LOVB=CUS-C-0012。
     */
    public void setPwdStatus(java.lang.String pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    /**
     * 获取 记录客户密码状态。LOVB=CUS-C-0012。
     */
    public java.lang.String getPwdStatus() {
        return this.pwdStatus;
    }

    /**
     * 设置 记录用于接收短信的手机号码
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取 记录用于接收短信的手机号码
     */
    public java.lang.String getMobilePhone() {
        return this.mobilePhone;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
