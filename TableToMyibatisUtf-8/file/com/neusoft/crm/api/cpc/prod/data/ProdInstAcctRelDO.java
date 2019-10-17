package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述每个产品实例的指定帐目组合由哪个电信帐户或其下挂的哪个子帐户支付，产品实例的付费关系和计划支付方案可以定制在电信帐户
 * @实体表  :PROD_INST_ACCT_REL
 */
public class ProdInstAcctRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_ACCT_REL_S";

    /**
     * 记录帐务关系的唯一编号。
            
     */
    public java.lang.Long prodInstAcctRelId;

    /**
     * 帐户标识，作为外键，指向帐户实体。
     */
    public java.lang.Long acctId;

    /**
     * 产品实例ID的标识
     */
    public java.lang.Long prodInstId;

    /**
     * 为每个帐目组生成的唯一编号。
     */
    public java.lang.Integer acctItemGroupId;

    /**
     * 当前帐户所定制的各付款方式的优先级
     */
    public java.lang.Integer priority;

    /**
     * 表达此条定制关系的支付额度类型如全额支付。ACC-C-0210
     */
    public java.lang.Integer paymentLimitType;

    /**
     * 指出本条定制关系的具体额度。其中作为绝对值时，以分为单位。作为百分比时，以万分之一为单位（即表示到小数点后两位）。全额支付是为空
     */
    public java.lang.Long paymentLimit;

    /**
     * 记录额度上限，-1代表不限制。
     */
    public java.lang.Long upperAmount;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 是否默认帐户，LOVB=ACC-C-0044
     */
    public java.lang.Integer ifDefaultAcctId;

    /**
     * 帐务定制关系的状态。ACC-C-0202
     */
    public java.lang.Integer statusCd;

    /**
     * 最后一条订单项标识
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 帐务定制关系状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录协议标识。
     */
    public java.lang.Long agreeId;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 设置 记录帐务关系的唯一编号。
            
     */
    public void setProdInstAcctRelId(java.lang.Long prodInstAcctRelId) {
        this.prodInstAcctRelId = prodInstAcctRelId;
    }

    /**
     * 获取 记录帐务关系的唯一编号。
            
     */
    public java.lang.Long getProdInstAcctRelId() {
        return this.prodInstAcctRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodInstAcctRelId = SeqUtils.createLongId(ID_SEQ);
         return this.prodInstAcctRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 帐户标识，作为外键，指向帐户实体。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识，作为外键，指向帐户实体。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 产品实例ID的标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例ID的标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 为每个帐目组生成的唯一编号。
     */
    public void setAcctItemGroupId(java.lang.Integer acctItemGroupId) {
        this.acctItemGroupId = acctItemGroupId;
    }

    /**
     * 获取 为每个帐目组生成的唯一编号。
     */
    public java.lang.Integer getAcctItemGroupId() {
        return this.acctItemGroupId;
    }

    /**
     * 设置 当前帐户所定制的各付款方式的优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 当前帐户所定制的各付款方式的优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 表达此条定制关系的支付额度类型如全额支付。ACC-C-0210
     */
    public void setPaymentLimitType(java.lang.Integer paymentLimitType) {
        this.paymentLimitType = paymentLimitType;
    }

    /**
     * 获取 表达此条定制关系的支付额度类型如全额支付。ACC-C-0210
     */
    public java.lang.Integer getPaymentLimitType() {
        return this.paymentLimitType;
    }

    /**
     * 设置 指出本条定制关系的具体额度。其中作为绝对值时，以分为单位。作为百分比时，以万分之一为单位（即表示到小数点后两位）。全额支付是为空
     */
    public void setPaymentLimit(java.lang.Long paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    /**
     * 获取 指出本条定制关系的具体额度。其中作为绝对值时，以分为单位。作为百分比时，以万分之一为单位（即表示到小数点后两位）。全额支付是为空
     */
    public java.lang.Long getPaymentLimit() {
        return this.paymentLimit;
    }

    /**
     * 设置 记录额度上限，-1代表不限制。
     */
    public void setUpperAmount(java.lang.Long upperAmount) {
        this.upperAmount = upperAmount;
    }

    /**
     * 获取 记录额度上限，-1代表不限制。
     */
    public java.lang.Long getUpperAmount() {
        return this.upperAmount;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 是否默认帐户，LOVB=ACC-C-0044
     */
    public void setIfDefaultAcctId(java.lang.Integer ifDefaultAcctId) {
        this.ifDefaultAcctId = ifDefaultAcctId;
    }

    /**
     * 获取 是否默认帐户，LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfDefaultAcctId() {
        return this.ifDefaultAcctId;
    }

    /**
     * 设置 帐务定制关系的状态。ACC-C-0202
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 帐务定制关系的状态。ACC-C-0202
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 最后一条订单项标识
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 最后一条订单项标识
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
    }

    /**
     * 设置 帐务定制关系状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 帐务定制关系状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录协议标识。
     */
    public void setAgreeId(java.lang.Long agreeId) {
        this.agreeId = agreeId;
    }

    /**
     * 获取 记录协议标识。
     */
    public java.lang.Long getAgreeId() {
        return this.agreeId;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
