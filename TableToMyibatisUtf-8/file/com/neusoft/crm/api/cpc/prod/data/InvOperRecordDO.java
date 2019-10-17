package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述本次打印选择的发票拆分方式（按帐期、按设备、按金额）、打印员工、发票类型（专票、普票）、打印时间等信息
 * @实体表  :INV_OPER_RECORD
 */
public class InvOperRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INV_OPER_RECORD_S";

    /**
     * 发票操作记录标识
     */
    public java.lang.Long operId;

    /**
     * 操作员的员工标识
     */
    public java.lang.Long staffId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 营业点标识
     */
    public java.lang.Integer siteId;

    /**
     * 对应数据编码为ACC-C-0228
     */
    public java.lang.Integer operType;

    /**
     * 发票类型
     */
    public java.lang.Integer invoiceTypeId;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 发票打印时间
     */
    public java.util.Date prnDate;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifSepNbrFlag;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifSepCycleFlag;

    /**
     * 简化打印号码{用户打印时受理的简化打印发票号码}
     */
    public java.lang.String printAccNbr;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifSepAmount;

    /**
     * 原发票操作记录标识
     */
    public java.lang.Long expOperId;

    /**
     * 发票通常按照帐户合同号打印，标识发票对应的合同号
     */
    public java.lang.Long acctId;

    /**
     * 本次操作打印发票/凭证的总金额
     */
    public java.lang.Long amount;

    /**
     * 记录状态。LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.operId = SeqUtils.createLongId(ID_SEQ);
         return this.operId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 操作员的员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 操作员的员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 营业点标识
     */
    public void setSiteId(java.lang.Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * 获取 营业点标识
     */
    public java.lang.Integer getSiteId() {
        return this.siteId;
    }

    /**
     * 设置 对应数据编码为ACC-C-0228
     */
    public void setOperType(java.lang.Integer operType) {
        this.operType = operType;
    }

    /**
     * 获取 对应数据编码为ACC-C-0228
     */
    public java.lang.Integer getOperType() {
        return this.operType;
    }

    /**
     * 设置 发票类型
     */
    public void setInvoiceTypeId(java.lang.Integer invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    /**
     * 获取 发票类型
     */
    public java.lang.Integer getInvoiceTypeId() {
        return this.invoiceTypeId;
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
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfSepNbrFlag(java.lang.Integer ifSepNbrFlag) {
        this.ifSepNbrFlag = ifSepNbrFlag;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfSepNbrFlag() {
        return this.ifSepNbrFlag;
    }

    /**
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfSepCycleFlag(java.lang.Integer ifSepCycleFlag) {
        this.ifSepCycleFlag = ifSepCycleFlag;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfSepCycleFlag() {
        return this.ifSepCycleFlag;
    }

    /**
     * 设置 简化打印号码{用户打印时受理的简化打印发票号码}
     */
    public void setPrintAccNbr(java.lang.String printAccNbr) {
        this.printAccNbr = printAccNbr;
    }

    /**
     * 获取 简化打印号码{用户打印时受理的简化打印发票号码}
     */
    public java.lang.String getPrintAccNbr() {
        return this.printAccNbr;
    }

    /**
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfSepAmount(java.lang.Integer ifSepAmount) {
        this.ifSepAmount = ifSepAmount;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfSepAmount() {
        return this.ifSepAmount;
    }

    /**
     * 设置 原发票操作记录标识
     */
    public void setExpOperId(java.lang.Long expOperId) {
        this.expOperId = expOperId;
    }

    /**
     * 获取 原发票操作记录标识
     */
    public java.lang.Long getExpOperId() {
        return this.expOperId;
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
     * 设置 本次操作打印发票/凭证的总金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 本次操作打印发票/凭证的总金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
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

}
