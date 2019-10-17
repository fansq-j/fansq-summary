package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:客户打印发票时，记录每张发票的关键信息，包括帐目、金额、打印次数等。
 * @实体表  :INVOICE
 */
public class InvoiceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INVOICE_S";

    /**
     * 为每张发票记录生成的唯一标识。
     */
    public java.lang.Long invoiceId;

    /**
     * 专票生成记录唯一流水号
     */
    public java.lang.Long vatInvoiceId;

    /**
     * 发票操作记录标识
     */
    public java.lang.Long operId;

    /**
     * 发票号码。推送电子发票、专票时，发票号码不在BSS系统生成，该字段为空。由发票管理系统回调BSS接口后回填。
     */
    public java.lang.String invoiceNum;

    /**
     * 发票代码。推送电子发票、专票时，发票代码不在BSS系统生成，该字段为空。由发票管理系统回调BSS接口后回填。
     */
    public java.lang.String invoiceCode;

    /**
     * 主数据，LOVB=ACC-C-0227
     */
    public java.lang.Integer invoiceAmountType;

    /**
     * 实收金额。实收金额和应收金额不能同时为空；打印实收发票时，该字段为非空。
     */
    public java.lang.Long amount;

    /**
     * 发票包含的设备数量。
     */
    public java.lang.Integer count;

    /**
     * 发票打印的张数。
     */
    public java.lang.Integer printCount;

    /**
     * 发票定制标识，如果客户选择现场领取发票，该字段为空
     */
    public java.lang.Long invFormatCustomizeId;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 发票对应的产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 发票通常按照帐户合同号打印，标识发票对应的合同号
     */
    public java.lang.Long acctId;

    /**
     * 发票打印时间
     */
    public java.util.Date prnDate;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态。LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 销售订单流水号。记录营业受理收取一次性费用的订单号。
     */
    public java.lang.String saleOrderNbr;

    /**
     * 订单项标识
     */
    public java.lang.Long orderItemId;

    /**
     * LOVB=ACC-C-0125
     */
    public java.lang.String feeType;

    /**
     * 电子发票url
     */
    public java.lang.String pdfUrl;

    /**
     * 销货单位编码
     */
    public java.lang.String saleCompanyId;

    /**
     * 客户标识
     */
    public java.lang.Long custId;

    /**
     * 设置 为每张发票记录生成的唯一标识。
     */
    public void setInvoiceId(java.lang.Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * 获取 为每张发票记录生成的唯一标识。
     */
    public java.lang.Long getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.invoiceId = SeqUtils.createLongId(ID_SEQ);
         return this.invoiceId;
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
     * 设置 发票操作记录标识
     */
    public void setOperId(java.lang.Long operId) {
        this.operId = operId;
    }

    /**
     * 获取 发票操作记录标识
     */
    public java.lang.Long getOperId() {
        return this.operId;
    }

    /**
     * 设置 发票号码。推送电子发票、专票时，发票号码不在BSS系统生成，该字段为空。由发票管理系统回调BSS接口后回填。
     */
    public void setInvoiceNum(java.lang.String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    /**
     * 获取 发票号码。推送电子发票、专票时，发票号码不在BSS系统生成，该字段为空。由发票管理系统回调BSS接口后回填。
     */
    public java.lang.String getInvoiceNum() {
        return this.invoiceNum;
    }

    /**
     * 设置 发票代码。推送电子发票、专票时，发票代码不在BSS系统生成，该字段为空。由发票管理系统回调BSS接口后回填。
     */
    public void setInvoiceCode(java.lang.String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    /**
     * 获取 发票代码。推送电子发票、专票时，发票代码不在BSS系统生成，该字段为空。由发票管理系统回调BSS接口后回填。
     */
    public java.lang.String getInvoiceCode() {
        return this.invoiceCode;
    }

    /**
     * 设置 主数据，LOVB=ACC-C-0227
     */
    public void setInvoiceAmountType(java.lang.Integer invoiceAmountType) {
        this.invoiceAmountType = invoiceAmountType;
    }

    /**
     * 获取 主数据，LOVB=ACC-C-0227
     */
    public java.lang.Integer getInvoiceAmountType() {
        return this.invoiceAmountType;
    }

    /**
     * 设置 实收金额。实收金额和应收金额不能同时为空；打印实收发票时，该字段为非空。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 实收金额。实收金额和应收金额不能同时为空；打印实收发票时，该字段为非空。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 发票包含的设备数量。
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }

    /**
     * 获取 发票包含的设备数量。
     */
    public java.lang.Integer getCount() {
        return this.count;
    }

    /**
     * 设置 发票打印的张数。
     */
    public void setPrintCount(java.lang.Integer printCount) {
        this.printCount = printCount;
    }

    /**
     * 获取 发票打印的张数。
     */
    public java.lang.Integer getPrintCount() {
        return this.printCount;
    }

    /**
     * 设置 发票定制标识，如果客户选择现场领取发票，该字段为空
     */
    public void setInvFormatCustomizeId(java.lang.Long invFormatCustomizeId) {
        this.invFormatCustomizeId = invFormatCustomizeId;
    }

    /**
     * 获取 发票定制标识，如果客户选择现场领取发票，该字段为空
     */
    public java.lang.Long getInvFormatCustomizeId() {
        return this.invFormatCustomizeId;
    }

    /**
     * 设置 业务处理的帐期周期
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 业务处理的帐期周期
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 发票对应的产品实例标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 发票对应的产品实例标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 发票通常按照帐户合同号打印，标识发票对应的合同号
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 发票通常按照帐户合同号打印，标识发票对应的合同号
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 发票打印时间
     */
    public void setPrnDate(java.util.Date prnDate) {
        this.prnDate = prnDate;
    }

    /**
     * 获取 发票打印时间
     */
    public java.util.Date getPrnDate() {
        return this.prnDate;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
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
     * 设置 销售订单流水号。记录营业受理收取一次性费用的订单号。
     */
    public void setSaleOrderNbr(java.lang.String saleOrderNbr) {
        this.saleOrderNbr = saleOrderNbr;
    }

    /**
     * 获取 销售订单流水号。记录营业受理收取一次性费用的订单号。
     */
    public java.lang.String getSaleOrderNbr() {
        return this.saleOrderNbr;
    }

    /**
     * 设置 订单项标识
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 订单项标识
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 LOVB=ACC-C-0125
     */
    public void setFeeType(java.lang.String feeType) {
        this.feeType = feeType;
    }

    /**
     * 获取 LOVB=ACC-C-0125
     */
    public java.lang.String getFeeType() {
        return this.feeType;
    }

    /**
     * 设置 电子发票url
     */
    public void setPdfUrl(java.lang.String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    /**
     * 获取 电子发票url
     */
    public java.lang.String getPdfUrl() {
        return this.pdfUrl;
    }

    /**
     * 设置 销货单位编码
     */
    public void setSaleCompanyId(java.lang.String saleCompanyId) {
        this.saleCompanyId = saleCompanyId;
    }

    /**
     * 获取 销货单位编码
     */
    public java.lang.String getSaleCompanyId() {
        return this.saleCompanyId;
    }

    /**
     * 设置 客户标识
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 客户标识
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

}
