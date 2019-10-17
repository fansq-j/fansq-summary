package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录商机的联系人信息。
 * @实体表  :SALE_OPP_CONTACT
 */
public class SaleOppContactDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALE_OPP_CONTACT_S";

    /**
     * 记录商机联系人的标识，主键。
     */
    public java.lang.Long saleOppContactId;

    /**
     * 记录商机标识，外键。
     */
    public java.lang.Long saleOppId;

    /**
     * 记录联系人姓名（数据可以来源于参与人联系信息，这里是副本）
     */
    public java.lang.String contactName;

    /**
     * 记录联系人号码。
     */
    public java.lang.String contactPhone;

    /**
     * 记录是否首选联系人。LOVB=PUB-C-0006
     */
    public java.lang.String fisrtChange;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建人。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改人。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录商机联系人的标识，主键。
     */
    public void setSaleOppContactId(java.lang.Long saleOppContactId) {
        this.saleOppContactId = saleOppContactId;
    }

    /**
     * 获取 记录商机联系人的标识，主键。
     */
    public java.lang.Long getSaleOppContactId() {
        return this.saleOppContactId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.saleOppContactId = SeqUtils.createLongId(ID_SEQ);
         return this.saleOppContactId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录商机标识，外键。
     */
    public void setSaleOppId(java.lang.Long saleOppId) {
        this.saleOppId = saleOppId;
    }

    /**
     * 获取 记录商机标识，外键。
     */
    public java.lang.Long getSaleOppId() {
        return this.saleOppId;
    }

    /**
     * 设置 记录联系人姓名（数据可以来源于参与人联系信息，这里是副本）
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取 记录联系人姓名（数据可以来源于参与人联系信息，这里是副本）
     */
    public java.lang.String getContactName() {
        return this.contactName;
    }

    /**
     * 设置 记录联系人号码。
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取 记录联系人号码。
     */
    public java.lang.String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * 设置 记录是否首选联系人。LOVB=PUB-C-0006
     */
    public void setFisrtChange(java.lang.String fisrtChange) {
        this.fisrtChange = fisrtChange;
    }

    /**
     * 获取 记录是否首选联系人。LOVB=PUB-C-0006
     */
    public java.lang.String getFisrtChange() {
        return this.fisrtChange;
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
     * 设置 记录创建人。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建人。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改人。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改人。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
