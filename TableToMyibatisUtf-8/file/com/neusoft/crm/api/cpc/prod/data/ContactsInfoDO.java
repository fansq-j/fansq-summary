package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录参与人的各种联系信息
 * @实体表  :CONTACTS_INFO
 */
public class ContactsInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACTS_INFO_S";

    /**
     * 记录联系信息标识，作为主键
     */
    public java.lang.Long contactId;

    /**
     * 记录参与人标识，作为外键，指向参与人实体。
     */
    public java.lang.Long partyId;

    /**
     * 记录联系信息的类型。LOVB=PTY-0001。
     */
    public java.lang.String contactType;

    /**
     * 记录参与人的联系人名称。
     */
    public java.lang.String contactName;

    /**
     * 记录参与人联系人的性别。LOVB=PTY-0008。
     */
    public java.lang.String contactGender;

    /**
     * 记录联系信息的联系地址。
     */
    public java.lang.String contactAddr;

    /**
     * 记录联系信息的联系单位。
     */
    public java.lang.String contactEmployer;

    /**
     * 记录参与人的家庭联系电话。
     */
    public java.lang.String homePhone;

    /**
     * 记录联系信息的办公电话号码。
     */
    public java.lang.String officePhone;

    /**
     * 记录联系信息的移动电话号码。
     */
    public java.lang.String mobilePhone;

    /**
     * 记录联系信息的详细描述。
     */
    public java.lang.String contactDesc;

    /**
     * 记录联系信息的eMail地址。
     */
    public java.lang.String eMail;

    /**
     * 记录联系信息的联系地址的邮政编码。
     */
    public java.lang.String postcode;

    /**
     * 记录联系信息的邮寄地址
     */
    public java.lang.String postAddr;

    /**
     * 记录联系信息的传真号码。
     */
    public java.lang.String fax;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
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
     * QQ号
     */
    public java.lang.String qqCode;

    /**
     * 微信号
     */
    public java.lang.String wxCode;

    /**
     * 易信号
     */
    public java.lang.String yxCode;

    /**
     * 不宜访问时间
     */
    public java.lang.String unsuitableContactTime;

    /**
     * 设置 记录联系信息标识，作为主键
     */
    public void setContactId(java.lang.Long contactId) {
        this.contactId = contactId;
    }

    /**
     * 获取 记录联系信息标识，作为主键
     */
    public java.lang.Long getContactId() {
        return this.contactId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contactId = SeqUtils.createLongId(ID_SEQ);
         return this.contactId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录参与人标识，作为外键，指向参与人实体。
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人标识，作为外键，指向参与人实体。
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录联系信息的类型。LOVB=PTY-0001。
     */
    public void setContactType(java.lang.String contactType) {
        this.contactType = contactType;
    }

    /**
     * 获取 记录联系信息的类型。LOVB=PTY-0001。
     */
    public java.lang.String getContactType() {
        return this.contactType;
    }

    /**
     * 设置 记录参与人的联系人名称。
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取 记录参与人的联系人名称。
     */
    public java.lang.String getContactName() {
        return this.contactName;
    }

    /**
     * 设置 记录参与人联系人的性别。LOVB=PTY-0008。
     */
    public void setContactGender(java.lang.String contactGender) {
        this.contactGender = contactGender;
    }

    /**
     * 获取 记录参与人联系人的性别。LOVB=PTY-0008。
     */
    public java.lang.String getContactGender() {
        return this.contactGender;
    }

    /**
     * 设置 记录联系信息的联系地址。
     */
    public void setContactAddr(java.lang.String contactAddr) {
        this.contactAddr = contactAddr;
    }

    /**
     * 获取 记录联系信息的联系地址。
     */
    public java.lang.String getContactAddr() {
        return this.contactAddr;
    }

    /**
     * 设置 记录联系信息的联系单位。
     */
    public void setContactEmployer(java.lang.String contactEmployer) {
        this.contactEmployer = contactEmployer;
    }

    /**
     * 获取 记录联系信息的联系单位。
     */
    public java.lang.String getContactEmployer() {
        return this.contactEmployer;
    }

    /**
     * 设置 记录参与人的家庭联系电话。
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * 获取 记录参与人的家庭联系电话。
     */
    public java.lang.String getHomePhone() {
        return this.homePhone;
    }

    /**
     * 设置 记录联系信息的办公电话号码。
     */
    public void setOfficePhone(java.lang.String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * 获取 记录联系信息的办公电话号码。
     */
    public java.lang.String getOfficePhone() {
        return this.officePhone;
    }

    /**
     * 设置 记录联系信息的移动电话号码。
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取 记录联系信息的移动电话号码。
     */
    public java.lang.String getMobilePhone() {
        return this.mobilePhone;
    }

    /**
     * 设置 记录联系信息的详细描述。
     */
    public void setContactDesc(java.lang.String contactDesc) {
        this.contactDesc = contactDesc;
    }

    /**
     * 获取 记录联系信息的详细描述。
     */
    public java.lang.String getContactDesc() {
        return this.contactDesc;
    }

    /**
     * 设置 记录联系信息的eMail地址。
     */
    public void setEMail(java.lang.String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取 记录联系信息的eMail地址。
     */
    public java.lang.String getEMail() {
        return this.eMail;
    }

    /**
     * 设置 记录联系信息的联系地址的邮政编码。
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取 记录联系信息的联系地址的邮政编码。
     */
    public java.lang.String getPostcode() {
        return this.postcode;
    }

    /**
     * 设置 记录联系信息的邮寄地址
     */
    public void setPostAddr(java.lang.String postAddr) {
        this.postAddr = postAddr;
    }

    /**
     * 获取 记录联系信息的邮寄地址
     */
    public java.lang.String getPostAddr() {
        return this.postAddr;
    }

    /**
     * 设置 记录联系信息的传真号码。
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }

    /**
     * 获取 记录联系信息的传真号码。
     */
    public java.lang.String getFax() {
        return this.fax;
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
     * 设置 记录状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
            
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

    /**
     * 设置 QQ号
     */
    public void setQqCode(java.lang.String qqCode) {
        this.qqCode = qqCode;
    }

    /**
     * 获取 QQ号
     */
    public java.lang.String getQqCode() {
        return this.qqCode;
    }

    /**
     * 设置 微信号
     */
    public void setWxCode(java.lang.String wxCode) {
        this.wxCode = wxCode;
    }

    /**
     * 获取 微信号
     */
    public java.lang.String getWxCode() {
        return this.wxCode;
    }

    /**
     * 设置 易信号
     */
    public void setYxCode(java.lang.String yxCode) {
        this.yxCode = yxCode;
    }

    /**
     * 获取 易信号
     */
    public java.lang.String getYxCode() {
        return this.yxCode;
    }

    /**
     * 设置 不宜访问时间
     */
    public void setUnsuitableContactTime(java.lang.String unsuitableContactTime) {
        this.unsuitableContactTime = unsuitableContactTime;
    }

    /**
     * 获取 不宜访问时间
     */
    public java.lang.String getUnsuitableContactTime() {
        return this.unsuitableContactTime;
    }

}
