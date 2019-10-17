package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:参与人涉及的联系信息都归集与联系信息实体（参与人子域）中。该实体描述联系信息实体中哪些联系信息是与哪个客户相关的，并标注
 * @实体表  :CUST_CONTACT_INFO_REL
 */
public class CustContactInfoRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_CONTACT_INFO_REL_S";

    /**
     * 客户联系信息标识，作为主键
     */
    public java.lang.Long custConnectId;

    /**
     * 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long custId;

    /**
     * 记录联系信息标识，作为外键，指向联系信息实体
     */
    public java.lang.Long contactId;

    /**
     * 记录客户的首选联系信息。每类对象都有一个首选联系信息，是该对象的第一联系信息。LOVB=PUB-C-0006。
     */
    public java.lang.Integer headFlag;

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
     * 设置 客户联系信息标识，作为主键
     */
    public void setCustConnectId(java.lang.Long custConnectId) {
        this.custConnectId = custConnectId;
    }

    /**
     * 获取 客户联系信息标识，作为主键
     */
    public java.lang.Long getCustConnectId() {
        return this.custConnectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custConnectId = SeqUtils.createLongId(ID_SEQ);
         return this.custConnectId;
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
     * 设置 记录联系信息标识，作为外键，指向联系信息实体
     */
    public void setContactId(java.lang.Long contactId) {
        this.contactId = contactId;
    }

    /**
     * 获取 记录联系信息标识，作为外键，指向联系信息实体
     */
    public java.lang.Long getContactId() {
        return this.contactId;
    }

    /**
     * 设置 记录客户的首选联系信息。每类对象都有一个首选联系信息，是该对象的第一联系信息。LOVB=PUB-C-0006。
     */
    public void setHeadFlag(java.lang.Integer headFlag) {
        this.headFlag = headFlag;
    }

    /**
     * 获取 记录客户的首选联系信息。每类对象都有一个首选联系信息，是该对象的第一联系信息。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getHeadFlag() {
        return this.headFlag;
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
