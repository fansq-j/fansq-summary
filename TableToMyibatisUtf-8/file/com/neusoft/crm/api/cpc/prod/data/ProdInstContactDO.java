package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品实例的联系人信息，数据来源于订单采集的联系人信息。
 * @实体表  :PROD_INST_CONTACT
 */
public class ProdInstContactDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_CONTACT_S";

    /**
     * 记录产品联系人的标识，主键。
     */
    public java.lang.Long prodInstContactId;

    /**
     * 记录产品实例标识，外键。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录联系人姓名（数据可以来源于参与人联系信息，这里是副本）
     */
    public java.lang.String contactName;

    /**
     * 记录联系人号码。
     */
    public java.lang.String contactPhone;

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
     * 记录是否首选联系人。LOVB=PUB-C-0006
     */
    public java.lang.String firstChange;

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
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录产品联系人的标识，主键。
     */
    public void setProdInstContactId(java.lang.Long prodInstContactId) {
        this.prodInstContactId = prodInstContactId;
    }

    /**
     * 获取 记录产品联系人的标识，主键。
     */
    public java.lang.Long getProdInstContactId() {
        return this.prodInstContactId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodInstContactId = SeqUtils.createLongId(ID_SEQ);
         return this.prodInstContactId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录产品实例标识，外键。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识，外键。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
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
     * 设置 记录是否首选联系人。LOVB=PUB-C-0006
     */
    public void setFirstChange(java.lang.String firstChange) {
        this.firstChange = firstChange;
    }

    /**
     * 获取 记录是否首选联系人。LOVB=PUB-C-0006
     */
    public java.lang.String getFirstChange() {
        return this.firstChange;
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
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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
