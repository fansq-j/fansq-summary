package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述集团支付限额。
 * @实体表  :GROUP_PAY_LIMIT
 */
public class GroupPayLimitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GROUP_PAY_LIMIT_S";

    /**
     * 集团支付限额标识
     */
    public java.lang.Long groupPayLimitId;

    /**
     * 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long acctId;

    /**
     * 为每个帐目分类方法形成的帐目组生成的唯一编号。
            -1为所有账目
     */
    public java.lang.Integer acctItemGroupId;

    /**
     * 表达此条定制关系的支付额度类型。如全额支付，按绝对额度支付，按相对额度支付等。LOVB=ACC-C-0210
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
     * 剩余支付额度是否滚存。LOVB=ACC-C-0044
     */
    public java.lang.Integer ifSaveback;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 说明
     */
    public java.lang.String comments;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

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
     * 设置 集团支付限额标识
     */
    public void setGroupPayLimitId(java.lang.Long groupPayLimitId) {
        this.groupPayLimitId = groupPayLimitId;
    }

    /**
     * 获取 集团支付限额标识
     */
    public java.lang.Long getGroupPayLimitId() {
        return this.groupPayLimitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.groupPayLimitId = SeqUtils.createLongId(ID_SEQ);
         return this.groupPayLimitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 为每个帐目分类方法形成的帐目组生成的唯一编号。
            -1为所有账目
     */
    public void setAcctItemGroupId(java.lang.Integer acctItemGroupId) {
        this.acctItemGroupId = acctItemGroupId;
    }

    /**
     * 获取 为每个帐目分类方法形成的帐目组生成的唯一编号。
            -1为所有账目
     */
    public java.lang.Integer getAcctItemGroupId() {
        return this.acctItemGroupId;
    }

    /**
     * 设置 表达此条定制关系的支付额度类型。如全额支付，按绝对额度支付，按相对额度支付等。LOVB=ACC-C-0210
     */
    public void setPaymentLimitType(java.lang.Integer paymentLimitType) {
        this.paymentLimitType = paymentLimitType;
    }

    /**
     * 获取 表达此条定制关系的支付额度类型。如全额支付，按绝对额度支付，按相对额度支付等。LOVB=ACC-C-0210
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
     * 设置 剩余支付额度是否滚存。LOVB=ACC-C-0044
     */
    public void setIfSaveback(java.lang.Integer ifSaveback) {
        this.ifSaveback = ifSaveback;
    }

    /**
     * 获取 剩余支付额度是否滚存。LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfSaveback() {
        return this.ifSaveback;
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
     * 设置 说明
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 说明
     */
    public java.lang.String getComments() {
        return this.comments;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
