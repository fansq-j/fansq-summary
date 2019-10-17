package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述客户能够访问的系统以及用什么账号、密码、以什么方式访问什么系统。
 * @实体表  :SYSTEM_AUTHEN_INFO_REL
 */
public class SystemAuthenInfoRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_AUTHEN_INFO_REL_S";

    /**
     * 记录认证信息适用系统标识，作为主键
     */
    public java.lang.Long systemAuthenInfoRelId;

    /**
     * 记录认证信息标识，作为外键，指向认证信息实体
     */
    public java.lang.Long authenInfoId;

    /**
     * 记录系统标识，作为外键，指向系统信息实体。
     */
    public java.lang.Long systemId;

    /**
     * 记录客户信息在对应系统的认证方式。LOVB=CUS-C-0015。
     */
    public java.lang.String authenType;

    /**
     * 记录每天认证次数限制
     */
    public java.lang.Integer limitLoginCount;

    /**
     * 记录密码有效期。LOVB=CUS-C-0013。
     */
    public java.lang.String pwdValidType;

    /**
     * 记录限制登录的渠道。
     */
    public java.lang.String limitLoginChannel;

    /**
     * 记录限制的原因。
     */
    public java.lang.String limitReason;

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
     * 设置 记录认证信息适用系统标识，作为主键
     */
    public void setSystemAuthenInfoRelId(java.lang.Long systemAuthenInfoRelId) {
        this.systemAuthenInfoRelId = systemAuthenInfoRelId;
    }

    /**
     * 获取 记录认证信息适用系统标识，作为主键
     */
    public java.lang.Long getSystemAuthenInfoRelId() {
        return this.systemAuthenInfoRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.systemAuthenInfoRelId = SeqUtils.createLongId(ID_SEQ);
         return this.systemAuthenInfoRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录认证信息标识，作为外键，指向认证信息实体
     */
    public void setAuthenInfoId(java.lang.Long authenInfoId) {
        this.authenInfoId = authenInfoId;
    }

    /**
     * 获取 记录认证信息标识，作为外键，指向认证信息实体
     */
    public java.lang.Long getAuthenInfoId() {
        return this.authenInfoId;
    }

    /**
     * 设置 记录系统标识，作为外键，指向系统信息实体。
     */
    public void setSystemId(java.lang.Long systemId) {
        this.systemId = systemId;
    }

    /**
     * 获取 记录系统标识，作为外键，指向系统信息实体。
     */
    public java.lang.Long getSystemId() {
        return this.systemId;
    }

    /**
     * 设置 记录客户信息在对应系统的认证方式。LOVB=CUS-C-0015。
     */
    public void setAuthenType(java.lang.String authenType) {
        this.authenType = authenType;
    }

    /**
     * 获取 记录客户信息在对应系统的认证方式。LOVB=CUS-C-0015。
     */
    public java.lang.String getAuthenType() {
        return this.authenType;
    }

    /**
     * 设置 记录每天认证次数限制
     */
    public void setLimitLoginCount(java.lang.Integer limitLoginCount) {
        this.limitLoginCount = limitLoginCount;
    }

    /**
     * 获取 记录每天认证次数限制
     */
    public java.lang.Integer getLimitLoginCount() {
        return this.limitLoginCount;
    }

    /**
     * 设置 记录密码有效期。LOVB=CUS-C-0013。
     */
    public void setPwdValidType(java.lang.String pwdValidType) {
        this.pwdValidType = pwdValidType;
    }

    /**
     * 获取 记录密码有效期。LOVB=CUS-C-0013。
     */
    public java.lang.String getPwdValidType() {
        return this.pwdValidType;
    }

    /**
     * 设置 记录限制登录的渠道。
     */
    public void setLimitLoginChannel(java.lang.String limitLoginChannel) {
        this.limitLoginChannel = limitLoginChannel;
    }

    /**
     * 获取 记录限制登录的渠道。
     */
    public java.lang.String getLimitLoginChannel() {
        return this.limitLoginChannel;
    }

    /**
     * 设置 记录限制的原因。
     */
    public void setLimitReason(java.lang.String limitReason) {
        this.limitReason = limitReason;
    }

    /**
     * 获取 记录限制的原因。
     */
    public java.lang.String getLimitReason() {
        return this.limitReason;
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
