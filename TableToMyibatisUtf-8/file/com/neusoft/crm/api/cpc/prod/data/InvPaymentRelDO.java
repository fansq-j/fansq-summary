package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述本次发票操作涉及哪些付款流水
 * @实体表  :INV_PAYMENT_REL
 */
public class InvPaymentRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INV_PAYMENT_REL_S";

    /**
     * 发票打印流水号
     */
    public java.lang.Long relId;

    /**
     * 发票操作记录标识
     */
    public java.lang.Long operId;

    /**
     * 区分用户付款记录的唯一标识。
     */
    public java.lang.Long paymentId;

    /**
     * 打印金额
     */
    public java.lang.Long amount;

    /**
     * 发票打印时间
     */
    public java.util.Date prnDate;

    /**
     * 记录状态。LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 发票打印流水号
     */
    public void setRelId(java.lang.Long relId) {
        this.relId = relId;
    }

    /**
     * 获取 发票打印流水号
     */
    public java.lang.Long getRelId() {
        return this.relId;
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
     * 设置 区分用户付款记录的唯一标识。
     */
    public void setPaymentId(java.lang.Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取 区分用户付款记录的唯一标识。
     */
    public java.lang.Long getPaymentId() {
        return this.paymentId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.paymentId = SeqUtils.createLongId(ID_SEQ);
         return this.paymentId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 打印金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 打印金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
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

}
