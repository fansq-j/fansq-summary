package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:退款的发票明细
 * @实体表  :REFUND_DETAIL
 */
public class RefundDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "REFUND_DETAIL_S";

    /**
     * 退款标识。
     */
    public java.lang.Long refundId;

    /**
     * 发票记录号。
     */
    public java.lang.Long invoiceId;

    /**
     * 记录帐户标识。
     */
    public java.lang.Long acctId;

    /**
     * 发票上的业务号码，取自invoice表。
     */
    public java.lang.String accNum;

    /**
     * 产品实例标识。
     */
    public java.lang.Long prodInstId;

    /**
     * LOVB=ACC-C-0176
     */
    public java.lang.Integer method;

    /**
     * 退费方式为转余额帐本、下月补退时有用
            。ACC-C-0175
     */
    public java.lang.Integer operType;

    /**
     * 退费成功后写入
            退费方式为转余额时，为余额来源操作流水
            退费方式为下月补退时，为补收补退操作流水
            退费方式为退银行时，为退费退银行流水
     */
    public java.lang.Long operId;

    /**
     * 退费方式为退银行时有用
            退银行的银行标识
     */
    public java.lang.Integer bankId;

    /**
     * 退费方式为退银行时有用
            退银行的银行账号
     */
    public java.lang.String bankAcct;

    /**
     * 退费方式为退银行时有用
            退银行的客户银行账号名称
     */
    public java.lang.String bankAcctName;

    /**
     * 金额
     */
    public java.lang.Long amount;

    /**
     * LOVB=ACC-C-0026
     */
    public java.lang.Integer statusCd;

    /**
     * 状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 设置 退款标识。
     */
    public void setRefundId(java.lang.Long refundId) {
        this.refundId = refundId;
    }

    /**
     * 获取 退款标识。
     */
    public java.lang.Long getRefundId() {
        return this.refundId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.refundId = SeqUtils.createLongId(ID_SEQ);
         return this.refundId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 发票记录号。
     */
    public void setInvoiceId(java.lang.Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * 获取 发票记录号。
     */
    public java.lang.Long getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * 设置 记录帐户标识。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 记录帐户标识。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 发票上的业务号码，取自invoice表。
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }

    /**
     * 获取 发票上的业务号码，取自invoice表。
     */
    public java.lang.String getAccNum() {
        return this.accNum;
    }

    /**
     * 设置 产品实例标识。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 LOVB=ACC-C-0176
     */
    public void setMethod(java.lang.Integer method) {
        this.method = method;
    }

    /**
     * 获取 LOVB=ACC-C-0176
     */
    public java.lang.Integer getMethod() {
        return this.method;
    }

    /**
     * 设置 退费方式为转余额帐本、下月补退时有用
            。ACC-C-0175
     */
    public void setOperType(java.lang.Integer operType) {
        this.operType = operType;
    }

    /**
     * 获取 退费方式为转余额帐本、下月补退时有用
            。ACC-C-0175
     */
    public java.lang.Integer getOperType() {
        return this.operType;
    }

    /**
     * 设置 退费成功后写入
            退费方式为转余额时，为余额来源操作流水
            退费方式为下月补退时，为补收补退操作流水
            退费方式为退银行时，为退费退银行流水
     */
    public void setOperId(java.lang.Long operId) {
        this.operId = operId;
    }

    /**
     * 获取 退费成功后写入
            退费方式为转余额时，为余额来源操作流水
            退费方式为下月补退时，为补收补退操作流水
            退费方式为退银行时，为退费退银行流水
     */
    public java.lang.Long getOperId() {
        return this.operId;
    }

    /**
     * 设置 退费方式为退银行时有用
            退银行的银行标识
     */
    public void setBankId(java.lang.Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取 退费方式为退银行时有用
            退银行的银行标识
     */
    public java.lang.Integer getBankId() {
        return this.bankId;
    }

    /**
     * 设置 退费方式为退银行时有用
            退银行的银行账号
     */
    public void setBankAcct(java.lang.String bankAcct) {
        this.bankAcct = bankAcct;
    }

    /**
     * 获取 退费方式为退银行时有用
            退银行的银行账号
     */
    public java.lang.String getBankAcct() {
        return this.bankAcct;
    }

    /**
     * 设置 退费方式为退银行时有用
            退银行的客户银行账号名称
     */
    public void setBankAcctName(java.lang.String bankAcctName) {
        this.bankAcctName = bankAcctName;
    }

    /**
     * 获取 退费方式为退银行时有用
            退银行的客户银行账号名称
     */
    public java.lang.String getBankAcctName() {
        return this.bankAcctName;
    }

    /**
     * 设置 金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 LOVB=ACC-C-0026
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0026
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
