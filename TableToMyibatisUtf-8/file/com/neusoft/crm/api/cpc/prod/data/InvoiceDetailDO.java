package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述实开发票的明细信息。
 * @实体表  :INVOICE_DETAIL
 */
public class InvoiceDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INVOICE_DETAIL_S";

    /**
     * 普通发票明细标识
     */
    public java.lang.Long invoiceDetailId;

    /**
     * 开具项目编号
     */
    public java.lang.Integer invoiceItemId;

    /**
     * 普票实开发票明细标识
     */
    public java.lang.Long invoiceId;

    /**
     * 项目名称
     */
    public java.lang.String itemName;

    /**
     * 金额
     */
    public java.lang.Long itemValue;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 普通发票明细标识
     */
    public void setInvoiceDetailId(java.lang.Long invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    /**
     * 获取 普通发票明细标识
     */
    public java.lang.Long getInvoiceDetailId() {
        return this.invoiceDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.invoiceDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.invoiceDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 开具项目编号
     */
    public void setInvoiceItemId(java.lang.Integer invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
    }

    /**
     * 获取 开具项目编号
     */
    public java.lang.Integer getInvoiceItemId() {
        return this.invoiceItemId;
    }

    /**
     * 设置 普票实开发票明细标识
     */
    public void setInvoiceId(java.lang.Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * 获取 普票实开发票明细标识
     */
    public java.lang.Long getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * 设置 项目名称
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取 项目名称
     */
    public java.lang.String getItemName() {
        return this.itemName;
    }

    /**
     * 设置 金额
     */
    public void setItemValue(java.lang.Long itemValue) {
        this.itemValue = itemValue;
    }

    /**
     * 获取 金额
     */
    public java.lang.Long getItemValue() {
        return this.itemValue;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
