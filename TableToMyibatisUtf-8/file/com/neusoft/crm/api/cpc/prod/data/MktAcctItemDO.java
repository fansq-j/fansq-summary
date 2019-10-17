package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销资源的帐目实例记录，记录订单的营销资源的支付信息
 * @实体表  :MKT_ACCT_ITEM
 */
public class MktAcctItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_ACCT_ITEM_S";

    /**
     * 营销资源帐目标识，主建
     */
    public java.lang.Long mktAcctItemId;

    /**
     * 营销资源实例的标识
     */
    public java.lang.Long mktResInstId;

    /**
     * 营销资源定价矩阵的标识
     */
    public java.lang.Integer mktPricingArrayId;

    /**
     * 帐户标识
     */
    public java.lang.Long acctId;

    /**
     * 购买营销资源的客户订单号
     */
    public java.lang.Long custOrderId;

    /**
     * 购买营销资源的定单号
     */
    public java.lang.String ordersBillId;

    /**
     * 金额
     */
    public java.lang.Long amount;

    /**
     * 税费
     */
    public java.lang.Long tax;

    /**
     * 优惠的金额
     */
    public java.lang.Long discount;

    /**
     * LOVB=PRC-C-0046
     */
    public java.lang.String payStatus;

    /**
     * 备注信息
     */
    public java.lang.String remark;

    /**
     * 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 营销资源帐目标识，主建
     */
    public void setMktAcctItemId(java.lang.Long mktAcctItemId) {
        this.mktAcctItemId = mktAcctItemId;
    }

    /**
     * 获取 营销资源帐目标识，主建
     */
    public java.lang.Long getMktAcctItemId() {
        return this.mktAcctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktAcctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.mktAcctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源实例的标识
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 营销资源实例的标识
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 营销资源定价矩阵的标识
     */
    public void setMktPricingArrayId(java.lang.Integer mktPricingArrayId) {
        this.mktPricingArrayId = mktPricingArrayId;
    }

    /**
     * 获取 营销资源定价矩阵的标识
     */
    public java.lang.Integer getMktPricingArrayId() {
        return this.mktPricingArrayId;
    }

    /**
     * 设置 帐户标识
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 购买营销资源的客户订单号
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 购买营销资源的客户订单号
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 购买营销资源的定单号
     */
    public void setOrdersBillId(java.lang.String ordersBillId) {
        this.ordersBillId = ordersBillId;
    }

    /**
     * 获取 购买营销资源的定单号
     */
    public java.lang.String getOrdersBillId() {
        return this.ordersBillId;
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
     * 设置 优惠的金额
     */
    public void setDiscount(java.lang.Long discount) {
        this.discount = discount;
    }

    /**
     * 获取 优惠的金额
     */
    public java.lang.Long getDiscount() {
        return this.discount;
    }

    /**
     * 设置 LOVB=PRC-C-0046
     */
    public void setPayStatus(java.lang.String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取 LOVB=PRC-C-0046
     */
    public java.lang.String getPayStatus() {
        return this.payStatus;
    }

    /**
     * 设置 备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 普通记录状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
