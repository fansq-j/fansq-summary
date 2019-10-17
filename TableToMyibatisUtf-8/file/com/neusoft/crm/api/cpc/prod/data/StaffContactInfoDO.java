package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录员工的联系信息
 * @实体表  :STAFF_CONTACT_INFO
 */
public class StaffContactInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "STAFF_CONTACT_INFO_S";

    /**
     * 员工联系信息标识
     */
    public java.lang.Long staffContactId;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 联系标识，关联表CONTACT_INFO的主键
     */
    public java.lang.Long contactId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 员工联系信息标识
     */
    public void setStaffContactId(java.lang.Long staffContactId) {
        this.staffContactId = staffContactId;
    }

    /**
     * 获取 员工联系信息标识
     */
    public java.lang.Long getStaffContactId() {
        return this.staffContactId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.staffContactId = SeqUtils.createLongId(ID_SEQ);
         return this.staffContactId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 联系标识，关联表CONTACT_INFO的主键
     */
    public void setContactId(java.lang.Long contactId) {
        this.contactId = contactId;
    }

    /**
     * 获取 联系标识，关联表CONTACT_INFO的主键
     */
    public java.lang.Long getContactId() {
        return this.contactId;
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
