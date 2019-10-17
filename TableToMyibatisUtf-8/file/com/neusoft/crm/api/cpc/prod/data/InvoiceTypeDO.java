package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述发票类型。
 * @实体表  :INVOICE_TYPE
 */
public class InvoiceTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INVOICE_TYPE_S";

    /**
     * 发票类型标识。
     */
    public java.lang.Integer invoiceTypeId;

    /**
     * 发票类型名称。
     */
    public java.lang.String invoiceTypeName;

    /**
     * 发票的规格，LOVB=ACC-C-0217
     */
    public java.lang.Integer specification;

    /**
     * 记录发票的额度。
     */
    public java.lang.Long limitAmount;

    /**
     * 记录状态。LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 发票类型标识。
     */
    public void setInvoiceTypeId(java.lang.Integer invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    /**
     * 获取 发票类型标识。
     */
    public java.lang.Integer getInvoiceTypeId() {
        return this.invoiceTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.invoiceTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.invoiceTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 发票类型名称。
     */
    public void setInvoiceTypeName(java.lang.String invoiceTypeName) {
        this.invoiceTypeName = invoiceTypeName;
    }

    /**
     * 获取 发票类型名称。
     */
    public java.lang.String getInvoiceTypeName() {
        return this.invoiceTypeName;
    }

    /**
     * 设置 发票的规格，LOVB=ACC-C-0217
     */
    public void setSpecification(java.lang.Integer specification) {
        this.specification = specification;
    }

    /**
     * 获取 发票的规格，LOVB=ACC-C-0217
     */
    public java.lang.Integer getSpecification() {
        return this.specification;
    }

    /**
     * 设置 记录发票的额度。
     */
    public void setLimitAmount(java.lang.Long limitAmount) {
        this.limitAmount = limitAmount;
    }

    /**
     * 获取 记录发票的额度。
     */
    public java.lang.Long getLimitAmount() {
        return this.limitAmount;
    }

    /**
     * 设置 记录状态。LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
