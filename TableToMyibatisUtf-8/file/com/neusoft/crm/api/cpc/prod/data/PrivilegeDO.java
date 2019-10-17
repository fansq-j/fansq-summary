package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:权限规格表，记录权限的配置
 * @实体表  :PRIVILEGE
 */
public class PrivilegeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRIVILEGE_S";

    /**
     * 权限标识，主键
     */
    public java.lang.Long privId;

    /**
     * 权限编码
     */
    public java.lang.String privCode;

    /**
     * 权限名称
     */
    public java.lang.String privName;

    /**
     * 权限类型,LOVB=STF-0002。
     */
    public java.lang.String privType;

    /**
     * 权限描述
     */
    public java.lang.String privDesc;

    /**
     * 权限管控类别，区分是普通权限、管控权限，对于高危权限能够有一定的提醒，并且可以有不同的授权流程。LOVB=STF-C-0020。
     */
    public java.lang.String privManageClass;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 权限的归属系统
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
     * 设置 权限标识，主键
     */
    public void setPrivId(java.lang.Long privId) {
        this.privId = privId;
    }

    /**
     * 获取 权限标识，主键
     */
    public java.lang.Long getPrivId() {
        return this.privId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.privId = SeqUtils.createLongId(ID_SEQ);
         return this.privId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 权限编码
     */
    public void setPrivCode(java.lang.String privCode) {
        this.privCode = privCode;
    }

    /**
     * 获取 权限编码
     */
    public java.lang.String getPrivCode() {
        return this.privCode;
    }

    /**
     * 设置 权限名称
     */
    public void setPrivName(java.lang.String privName) {
        this.privName = privName;
    }

    /**
     * 获取 权限名称
     */
    public java.lang.String getPrivName() {
        return this.privName;
    }

    /**
     * 设置 权限类型,LOVB=STF-0002。
     */
    public void setPrivType(java.lang.String privType) {
        this.privType = privType;
    }

    /**
     * 获取 权限类型,LOVB=STF-0002。
     */
    public java.lang.String getPrivType() {
        return this.privType;
    }

    /**
     * 设置 权限描述
     */
    public void setPrivDesc(java.lang.String privDesc) {
        this.privDesc = privDesc;
    }

    /**
     * 获取 权限描述
     */
    public java.lang.String getPrivDesc() {
        return this.privDesc;
    }

    /**
     * 设置 权限管控类别，区分是普通权限、管控权限，对于高危权限能够有一定的提醒，并且可以有不同的授权流程。LOVB=STF-C-0020。
     */
    public void setPrivManageClass(java.lang.String privManageClass) {
        this.privManageClass = privManageClass;
    }

    /**
     * 获取 权限管控类别，区分是普通权限、管控权限，对于高危权限能够有一定的提醒，并且可以有不同的授权流程。LOVB=STF-C-0020。
     */
    public java.lang.String getPrivManageClass() {
        return this.privManageClass;
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
     * 设置 权限的归属系统
     */
    public void setSystemInfoId(java.lang.Long systemInfoId) {
        this.systemInfoId = systemInfoId;
    }

    /**
     * 获取 权限的归属系统
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
