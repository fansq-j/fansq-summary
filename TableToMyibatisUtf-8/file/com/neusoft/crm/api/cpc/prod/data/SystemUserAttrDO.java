package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指根据不同的系统所具有的不同的扩展属性。记录系统用户属性规格的实例化信息。
 * @实体表  :SYSTEM_USER_ATTR
 */
public class SystemUserAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_USER_ATTR_S";

    /**
     * 系统用户属性标识
     */
    public java.lang.Long sysUserAttrId;

    /**
     * 系统用户标识
     */
    public java.lang.Long sysUserId;

    /**
     * 属性标识
     */
    public java.lang.Long attrId;

    /**
     * 属性值标识，选填
     */
    public java.lang.Long attrValueId;

    /**
     * 属性值
     */
    public java.lang.String attrValue;

    /**
     * 系统用户属性状态
     */
    public java.lang.String statusCd;

    /**
     * 系统用户属性状态修改时间
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
     * 设置 系统用户属性标识
     */
    public void setSysUserAttrId(java.lang.Long sysUserAttrId) {
        this.sysUserAttrId = sysUserAttrId;
    }

    /**
     * 获取 系统用户属性标识
     */
    public java.lang.Long getSysUserAttrId() {
        return this.sysUserAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.sysUserAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.sysUserAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 属性标识
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 属性标识
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 属性值标识，选填
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值标识，选填
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 属性值
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 属性值
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 系统用户属性状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 系统用户属性状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 系统用户属性状态修改时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 系统用户属性状态修改时间
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
