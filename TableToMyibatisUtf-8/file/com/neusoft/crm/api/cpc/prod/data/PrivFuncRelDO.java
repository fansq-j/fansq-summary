package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义权限关联的功能菜单、功能组件，一个权限可包含多个功能菜单或功能组件。
 * @实体表  :PRIV_FUNC_REL
 */
public class PrivFuncRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRIV_FUNC_REL_S";

    /**
     * 权限功能关联标识,主键
     */
    public java.lang.Long privFuncRelId;

    /**
     * 权限标识，外键
     */
    public java.lang.Long privId;

    /**
     * 权限对象类型，LOVB=STF-C-0021；
     */
    public java.lang.String privRefType;

    /**
     * 根据权限对象类型，如果为"业务对象",则填写业务对象ID;
     */
    public java.lang.String privRefId;

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
     * 设置 权限功能关联标识,主键
     */
    public void setPrivFuncRelId(java.lang.Long privFuncRelId) {
        this.privFuncRelId = privFuncRelId;
    }

    /**
     * 获取 权限功能关联标识,主键
     */
    public java.lang.Long getPrivFuncRelId() {
        return this.privFuncRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.privFuncRelId = SeqUtils.createLongId(ID_SEQ);
         return this.privFuncRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 权限标识，外键
     */
    public void setPrivId(java.lang.Long privId) {
        this.privId = privId;
    }

    /**
     * 获取 权限标识，外键
     */
    public java.lang.Long getPrivId() {
        return this.privId;
    }

    /**
     * 设置 权限对象类型，LOVB=STF-C-0021；
     */
    public void setPrivRefType(java.lang.String privRefType) {
        this.privRefType = privRefType;
    }

    /**
     * 获取 权限对象类型，LOVB=STF-C-0021；
     */
    public java.lang.String getPrivRefType() {
        return this.privRefType;
    }

    /**
     * 设置 根据权限对象类型，如果为"业务对象",则填写业务对象ID;
     */
    public void setPrivRefId(java.lang.String privRefId) {
        this.privRefId = privRefId;
    }

    /**
     * 获取 根据权限对象类型，如果为"业务对象",则填写业务对象ID;
     */
    public java.lang.String getPrivRefId() {
        return this.privRefId;
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
