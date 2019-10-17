package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录认证信息适用系统的变更信息。
 * @实体表  :ORD_SYSTEM_AUTHEN_INFO_REL
 */
public class OrdSystemAuthenInfoRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_SYSTEM_AUTHEN_INFO_REL_S";

    /**
     * 主键。
     */
    public java.lang.Long systemAuthenInfoRelId;

    /**
     * 认证信息标识。
     */
    public java.lang.Long authenInfoId;

    /**
     * 记录系统标识。
     */
    public java.lang.Long systemId;

    /**
     * LOVB。普通认证、短信认证、U棒认证、证书认证。LOVB=CUS-C-0015。
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
     * 记录状态。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 主键。
     */
    public void setSystemAuthenInfoRelId(java.lang.Long systemAuthenInfoRelId) {
        this.systemAuthenInfoRelId = systemAuthenInfoRelId;
    }

    /**
     * 获取 主键。
     */
    public java.lang.Long getSystemAuthenInfoRelId() {
        return this.systemAuthenInfoRelId;
    }

    /**
     * 设置 认证信息标识。
     */
    public void setAuthenInfoId(java.lang.Long authenInfoId) {
        this.authenInfoId = authenInfoId;
    }

    /**
     * 获取 认证信息标识。
     */
    public java.lang.Long getAuthenInfoId() {
        return this.authenInfoId;
    }

    /**
     * 设置 记录系统标识。
     */
    public void setSystemId(java.lang.Long systemId) {
        this.systemId = systemId;
    }

    /**
     * 获取 记录系统标识。
     */
    public java.lang.Long getSystemId() {
        return this.systemId;
    }

    /**
     * 设置 LOVB。普通认证、短信认证、U棒认证、证书认证。LOVB=CUS-C-0015。
     */
    public void setAuthenType(java.lang.String authenType) {
        this.authenType = authenType;
    }

    /**
     * 获取 LOVB。普通认证、短信认证、U棒认证、证书认证。LOVB=CUS-C-0015。
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
     * 设置 记录状态。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。
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
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
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

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
