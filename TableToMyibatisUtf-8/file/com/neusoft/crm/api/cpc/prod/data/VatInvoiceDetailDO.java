package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:预先生成的专票明细，包含货物名称及其对应的税费、税率、单价
 * @实体表  :VAT_INVOICE_DETAIL
 */
public class VatInvoiceDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VAT_INVOICE_DETAIL_S";

    /**
     * 专票生成明细标识
     */
    public java.lang.Long vatInvoiceDtlId;

    /**
     * 专票生成记录唯一流水号
     */
    public java.lang.Long vatInvoiceId;

    /**
     * LOVB=ACC-C-0208
     */
    public java.lang.String rowFlag;

    /**
     * 税目标识
     */
    public java.lang.Integer taxItemId;

    /**
     * 税目名称
     */
    public java.lang.String taxItemName;

    /**
     * 发票的规格，LOVB=ACC-C-0217
     */
    public java.lang.String specification;

    /**
     * 计量单位
     */
    public java.lang.String unit;

    /**
     * 数量
     */
    public java.lang.Long quantity;

    /**
     * LOVB=ACC-C-0113
     */
    public java.lang.String priceMode;

    /**
     * 税率
     */
    public java.lang.Double taxRate;

    /**
     * 税费
     */
    public java.lang.Long tax;

    /**
     * 不含税价格
     */
    public java.lang.Long price;

    /**
     * 设置 专票生成明细标识
     */
    public void setVatInvoiceDtlId(java.lang.Long vatInvoiceDtlId) {
        this.vatInvoiceDtlId = vatInvoiceDtlId;
    }

    /**
     * 获取 专票生成明细标识
     */
    public java.lang.Long getVatInvoiceDtlId() {
        return this.vatInvoiceDtlId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vatInvoiceDtlId = SeqUtils.createLongId(ID_SEQ);
         return this.vatInvoiceDtlId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 专票生成记录唯一流水号
     */
    public void setVatInvoiceId(java.lang.Long vatInvoiceId) {
        this.vatInvoiceId = vatInvoiceId;
    }

    /**
     * 获取 专票生成记录唯一流水号
     */
    public java.lang.Long getVatInvoiceId() {
        return this.vatInvoiceId;
    }

    /**
     * 设置 LOVB=ACC-C-0208
     */
    public void setRowFlag(java.lang.String rowFlag) {
        this.rowFlag = rowFlag;
    }

    /**
     * 获取 LOVB=ACC-C-0208
     */
    public java.lang.String getRowFlag() {
        return this.rowFlag;
    }

    /**
     * 设置 税目标识
     */
    public void setTaxItemId(java.lang.Integer taxItemId) {
        this.taxItemId = taxItemId;
    }

    /**
     * 获取 税目标识
     */
    public java.lang.Integer getTaxItemId() {
        return this.taxItemId;
    }

    /**
     * 设置 税目名称
     */
    public void setTaxItemName(java.lang.String taxItemName) {
        this.taxItemName = taxItemName;
    }

    /**
     * 获取 税目名称
     */
    public java.lang.String getTaxItemName() {
        return this.taxItemName;
    }

    /**
     * 设置 发票的规格，LOVB=ACC-C-0217
     */
    public void setSpecification(java.lang.String specification) {
        this.specification = specification;
    }

    /**
     * 获取 发票的规格，LOVB=ACC-C-0217
     */
    public java.lang.String getSpecification() {
        return this.specification;
    }

    /**
     * 设置 计量单位
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    /**
     * 获取 计量单位
     */
    public java.lang.String getUnit() {
        return this.unit;
    }

    /**
     * 设置 数量
     */
    public void setQuantity(java.lang.Long quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取 数量
     */
    public java.lang.Long getQuantity() {
        return this.quantity;
    }

    /**
     * 设置 LOVB=ACC-C-0113
     */
    public void setPriceMode(java.lang.String priceMode) {
        this.priceMode = priceMode;
    }

    /**
     * 获取 LOVB=ACC-C-0113
     */
    public java.lang.String getPriceMode() {
        return this.priceMode;
    }

    /**
     * 设置 税率
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 获取 税率
     */
    public java.lang.Double getTaxRate() {
        return this.taxRate;
    }

    /**
     * 设置 税费
     */
    public void setTax(java.lang.Long tax) {
        this.tax = tax;
    }

    /**
     * 获取 税费
     */
    public java.lang.Long getTax() {
        return this.tax;
    }

    /**
     * 设置 不含税价格
     */
    public void setPrice(java.lang.Long price) {
        this.price = price;
    }

    /**
     * 获取 不含税价格
     */
    public java.lang.Long getPrice() {
        return this.price;
    }

}
