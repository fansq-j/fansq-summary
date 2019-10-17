package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述帐户付款过程的相关信息，包括付费的方式（比如现金、余额付费等）、付款的金额、付款的时间等。
 * @实体表  :PAYMENT
 */
public class PaymentDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAYMENT_S";

    /**
     * 区分用户付款记录的唯一标识。
     */
    public java.lang.Long paymentId;

    /**
     * 为每种付款方式定义的唯一代码。OTC-0001
     */
    public java.lang.Integer paymentMethod;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 员工电信组织标识。
     */
    public java.lang.Long orgId;

    /**
     * 生成付款记录操作类别。ACC-C-0004
     */
    public java.lang.Integer operationType;

    /**
     * 原付款流水号，冲正等操作时使用。
     */
    public java.lang.Long operatedPaymentSerialNbr;

    /**
     * 付款金额。
     */
    public java.lang.Long amount;

    /**
     * 记录付款的时间。
     */
    public java.util.Date paymentDate;

    /**
     * 预存金额，用于满足销帐且预存的场景。例如用户前台缴纳100元现金，其中90元用于销账，10元用于余额存入，则10元就记录在该字段中
     */
    public java.lang.Long depositAmount;

    /**
     * 如营业厅、网厅、10000、工行、翼支付等
     */
    public java.lang.Integer paymentChannelId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 记录查询、缴费的业务号码
     */
    public java.lang.String accNum;

    /**
     * 电信帐户的标识
     */
    public java.lang.Long acctId;

    /**
     * 业务流水标识
     */
    public java.lang.Long businessRecId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 提供发票标识，LOVB=ACC-C-0044
     */
    public java.lang.Integer invOffer;

    /**
     * 付款记录的状态。ACC-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 付款记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

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
     * 设置 为每种付款方式定义的唯一代码。OTC-0001
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取 为每种付款方式定义的唯一代码。OTC-0001
     */
    public java.lang.Integer getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * 设置 员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 员工电信组织标识。
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 员工电信组织标识。
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 生成付款记录操作类别。ACC-C-0004
     */
    public void setOperationType(java.lang.Integer operationType) {
        this.operationType = operationType;
    }

    /**
     * 获取 生成付款记录操作类别。ACC-C-0004
     */
    public java.lang.Integer getOperationType() {
        return this.operationType;
    }

    /**
     * 设置 原付款流水号，冲正等操作时使用。
     */
    public void setOperatedPaymentSerialNbr(java.lang.Long operatedPaymentSerialNbr) {
        this.operatedPaymentSerialNbr = operatedPaymentSerialNbr;
    }

    /**
     * 获取 原付款流水号，冲正等操作时使用。
     */
    public java.lang.Long getOperatedPaymentSerialNbr() {
        return this.operatedPaymentSerialNbr;
    }

    /**
     * 设置 付款金额。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 付款金额。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 记录付款的时间。
     */
    public void setPaymentDate(java.util.Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 获取 记录付款的时间。
     */
    public java.util.Date getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * 设置 预存金额，用于满足销帐且预存的场景。例如用户前台缴纳100元现金，其中90元用于销账，10元用于余额存入，则10元就记录在该字段中
     */
    public void setDepositAmount(java.lang.Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * 获取 预存金额，用于满足销帐且预存的场景。例如用户前台缴纳100元现金，其中90元用于销账，10元用于余额存入，则10元就记录在该字段中
     */
    public java.lang.Long getDepositAmount() {
        return this.depositAmount;
    }

    /**
     * 设置 如营业厅、网厅、10000、工行、翼支付等
     */
    public void setPaymentChannelId(java.lang.Integer paymentChannelId) {
        this.paymentChannelId = paymentChannelId;
    }

    /**
     * 获取 如营业厅、网厅、10000、工行、翼支付等
     */
    public java.lang.Integer getPaymentChannelId() {
        return this.paymentChannelId;
    }

    /**
     * 设置 产品实例标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录查询、缴费的业务号码
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }

    /**
     * 获取 记录查询、缴费的业务号码
     */
    public java.lang.String getAccNum() {
        return this.accNum;
    }

    /**
     * 设置 电信帐户的标识
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 电信帐户的标识
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 业务流水标识
     */
    public void setBusinessRecId(java.lang.Long businessRecId) {
        this.businessRecId = businessRecId;
    }

    /**
     * 获取 业务流水标识
     */
    public java.lang.Long getBusinessRecId() {
        return this.businessRecId;
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
     * 设置 提供发票标识，LOVB=ACC-C-0044
     */
    public void setInvOffer(java.lang.Integer invOffer) {
        this.invOffer = invOffer;
    }

    /**
     * 获取 提供发票标识，LOVB=ACC-C-0044
     */
    public java.lang.Integer getInvOffer() {
        return this.invOffer;
    }

    /**
     * 设置 付款记录的状态。ACC-C-0005
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 付款记录的状态。ACC-C-0005
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 付款记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 付款记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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

}
