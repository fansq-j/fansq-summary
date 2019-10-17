package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录触点渠道的基本信息
统一管理与配置跟实时营销交互的系统或渠道。
 * @实体表  :CONTACT_CHANNEL
 */
public class ContactChannelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_CHANNEL_S";

    /**
     * 触点渠道标识
     */
    public java.lang.Integer contactChlId;

    /**
     * 触点渠道编码
     */
    public java.lang.String contactChlCode;

    /**
     * 触点渠道名称
     */
    public java.lang.String contactChlName;

    /**
     * 记录渠道类型，LOVB=CHN-0017
     */
    public java.lang.String contactChlType;

    /**
     * 触点渠道描述
     */
    public java.lang.String contactChlDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
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
     * 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long regionId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 触点渠道标识
     */
    public void setContactChlId(java.lang.Integer contactChlId) {
        this.contactChlId = contactChlId;
    }

    /**
     * 获取 触点渠道标识
     */
    public java.lang.Integer getContactChlId() {
        return this.contactChlId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.contactChlId = SeqUtils.createIntegerId(ID_SEQ);
         return this.contactChlId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 触点渠道编码
     */
    public void setContactChlCode(java.lang.String contactChlCode) {
        this.contactChlCode = contactChlCode;
    }

    /**
     * 获取 触点渠道编码
     */
    public java.lang.String getContactChlCode() {
        return this.contactChlCode;
    }

    /**
     * 设置 触点渠道名称
     */
    public void setContactChlName(java.lang.String contactChlName) {
        this.contactChlName = contactChlName;
    }

    /**
     * 获取 触点渠道名称
     */
    public java.lang.String getContactChlName() {
        return this.contactChlName;
    }

    /**
     * 设置 记录渠道类型，LOVB=CHN-0017
     */
    public void setContactChlType(java.lang.String contactChlType) {
        this.contactChlType = contactChlType;
    }

    /**
     * 获取 记录渠道类型，LOVB=CHN-0017
     */
    public java.lang.String getContactChlType() {
        return this.contactChlType;
    }

    /**
     * 设置 触点渠道描述
     */
    public void setContactChlDesc(java.lang.String contactChlDesc) {
        this.contactChlDesc = contactChlDesc;
    }

    /**
     * 获取 触点渠道描述
     */
    public java.lang.String getContactChlDesc() {
        return this.contactChlDesc;
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
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
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
     * 设置 记录适用区域标识，指定公共管理区域
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
