package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述订单变更支付方案。
 * @实体表  :ORD_PAYMENT_PLAN
 */
public class OrdPaymentPlanDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_PAYMENT_PLAN_S";

    /**
     * 支付方案标识
     */
    public java.lang.Long paymentPlanId;

    /**
     * 支付帐户的所属类型
            。ACC-C-0006
     */
    public java.lang.Integer payAcctType;

    /**
     * 支付帐户标识
     */
    public java.lang.Long payAcctId;

    /**
     * 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long acctId;

    /**
     * 为每种付款方式定义的唯一代码
            
            。OTC-0001
     */
    public java.lang.Integer paymentMethod;

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
     * 是否在线支付。ACC-C-0044
     */
    public java.lang.Integer ifOnlinePay;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

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
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 支付方案标识
     */
    public void setPaymentPlanId(java.lang.Long paymentPlanId) {
        this.paymentPlanId = paymentPlanId;
    }

    /**
     * 获取 支付方案标识
     */
    public java.lang.Long getPaymentPlanId() {
        return this.paymentPlanId;
    }

    /**
     * 设置 支付帐户的所属类型
            。ACC-C-0006
     */
    public void setPayAcctType(java.lang.Integer payAcctType) {
        this.payAcctType = payAcctType;
    }

    /**
     * 获取 支付帐户的所属类型
            。ACC-C-0006
     */
    public java.lang.Integer getPayAcctType() {
        return this.payAcctType;
    }

    /**
     * 设置 支付帐户标识
     */
    public void setPayAcctId(java.lang.Long payAcctId) {
        this.payAcctId = payAcctId;
    }

    /**
     * 获取 支付帐户标识
     */
    public java.lang.Long getPayAcctId() {
        return this.payAcctId;
    }

    /**
     * 设置 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 为每种付款方式定义的唯一代码
            
            。OTC-0001
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取 为每种付款方式定义的唯一代码
            
            。OTC-0001
     */
    public java.lang.Integer getPaymentMethod() {
        return this.paymentMethod;
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
     * 设置 是否在线支付。ACC-C-0044
     */
    public void setIfOnlinePay(java.lang.Integer ifOnlinePay) {
        this.ifOnlinePay = ifOnlinePay;
    }

    /**
     * 获取 是否在线支付。ACC-C-0044
     */
    public java.lang.Integer getIfOnlinePay() {
        return this.ifOnlinePay;
    }

    /**
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
