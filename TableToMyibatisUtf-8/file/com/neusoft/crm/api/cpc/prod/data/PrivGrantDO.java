package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述将权限授权给不同的对象，包括系统用户、系统岗位、角色；
一个系统用户也可以拥有多个私有的权限，一个权限可
 * @实体表  :PRIV_GRANT
 */
public class PrivGrantDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRIV_GRANT_S";

    /**
     * 授权标识，主键
     */
    public java.lang.Long privGrantId;

    /**
     * 权限标识
     */
    public java.lang.Long privId;

    /**
     * 授权管理分类，分为：管理权限、使用权限；‘管理权限’包含了‘使用权限’；LOVB=STF-C-0015。
     */
    public java.lang.String manageClass;

    /**
     * 授权对象类型。LOVB=STF-C-0016。
     */
    public java.lang.String grantObjType;

    /**
     * 授权对象标识，根据授权对象类型，区分是系统用户ID、系统岗位ID、角色ID
     */
    public java.lang.Long grantObjId;

    /**
     * 授权操作类型，LOVB=STF-C-0017。
     */
    public java.lang.String operType;

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
     * 记录授予的数据权限所关联的功能权限标识
     */
    public java.lang.Long parPrivId;

    /**
     * 设置 授权标识，主键
     */
    public void setPrivGrantId(java.lang.Long privGrantId) {
        this.privGrantId = privGrantId;
    }

    /**
     * 获取 授权标识，主键
     */
    public java.lang.Long getPrivGrantId() {
        return this.privGrantId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.privGrantId = SeqUtils.createLongId(ID_SEQ);
         return this.privGrantId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 权限标识
     */
    public void setPrivId(java.lang.Long privId) {
        this.privId = privId;
    }

    /**
     * 获取 权限标识
     */
    public java.lang.Long getPrivId() {
        return this.privId;
    }

    /**
     * 设置 授权管理分类，分为：管理权限、使用权限；‘管理权限’包含了‘使用权限’；LOVB=STF-C-0015。
     */
    public void setManageClass(java.lang.String manageClass) {
        this.manageClass = manageClass;
    }

    /**
     * 获取 授权管理分类，分为：管理权限、使用权限；‘管理权限’包含了‘使用权限’；LOVB=STF-C-0015。
     */
    public java.lang.String getManageClass() {
        return this.manageClass;
    }

    /**
     * 设置 授权对象类型。LOVB=STF-C-0016。
     */
    public void setGrantObjType(java.lang.String grantObjType) {
        this.grantObjType = grantObjType;
    }

    /**
     * 获取 授权对象类型。LOVB=STF-C-0016。
     */
    public java.lang.String getGrantObjType() {
        return this.grantObjType;
    }

    /**
     * 设置 授权对象标识，根据授权对象类型，区分是系统用户ID、系统岗位ID、角色ID
     */
    public void setGrantObjId(java.lang.Long grantObjId) {
        this.grantObjId = grantObjId;
    }

    /**
     * 获取 授权对象标识，根据授权对象类型，区分是系统用户ID、系统岗位ID、角色ID
     */
    public java.lang.Long getGrantObjId() {
        return this.grantObjId;
    }

    /**
     * 设置 授权操作类型，LOVB=STF-C-0017。
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 授权操作类型，LOVB=STF-C-0017。
     */
    public java.lang.String getOperType() {
        return this.operType;
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

    /**
     * 设置 记录授予的数据权限所关联的功能权限标识
     */
    public void setParPrivId(java.lang.Long parPrivId) {
        this.parPrivId = parPrivId;
    }

    /**
     * 获取 记录授予的数据权限所关联的功能权限标识
     */
    public java.lang.Long getParPrivId() {
        return this.parPrivId;
    }

}
