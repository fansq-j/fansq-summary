package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录使用现金进行积分兑换的现金费用帐目
 * @实体表  :POINT_EXCH_ACCT_ITEM
 */
public class PointExchAcctItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_ACCT_ITEM_S";

    /**
     * 积分兑换费用帐目标识，作为主键
     */
    public java.lang.Long exchAcctItemId;

    /**
     * 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public java.lang.Long pointExchRecordId;

    /**
     * 记录销帐流水号，外键，指向销帐记录实体
     */
    public java.lang.Long billId;

    /**
     * 记录付款流水号，作为外键，指向付款记录实体
     */
    public java.lang.Long paymentId;

    /**
     * 帐目类型标识，外键，指向帐目类型实体
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 帐务周期标识
     */
    public java.lang.Long billingCycleId;

    /**
     * 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer itemSourceId;

    /**
     * 帐户标识，外键，指向帐户实体
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 应收金额，单位为厘
     */
    public java.lang.Long realAmount;

    /**
     * 税率配置标识
     */
    public java.lang.Integer taxRateConfigId;

    /**
     * 税率
     */
    public java.lang.Double taxRate;

    /**
     * 税费，单位为厘
     */
    public java.lang.Long tax;

    /**
     * 不含税价格，单位为厘
     */
    public java.lang.Long price;

    /**
     * 收费方式，LOVB=ACC-C-0190
     */
    public java.lang.String chargeMethod;

    /**
     * 记录源帐目标识，用于记录拆分的源帐目标识。
     */
    public java.lang.Long oriAcctItemId;

    /**
     * 是否已出帐，LOVB=PUB-C-0006
     */
    public java.lang.Integer ifChargeOff;

    /**
     * 合帐时间
     */
    public java.util.Date mergeAcctDealTime;

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
     * 积分兑换费用帐目状态，LOVB=ACC-C-0015，使用帐务子域主数据
     */
    public java.lang.Integer statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 创建组织标识
     */
    public java.lang.Long createOrgId;

    /**
     * 设置 积分兑换费用帐目标识，作为主键
     */
    public void setExchAcctItemId(java.lang.Long exchAcctItemId) {
        this.exchAcctItemId = exchAcctItemId;
    }

    /**
     * 获取 积分兑换费用帐目标识，作为主键
     */
    public java.lang.Long getExchAcctItemId() {
        return this.exchAcctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.exchAcctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.exchAcctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public void setPointExchRecordId(java.lang.Long pointExchRecordId) {
        this.pointExchRecordId = pointExchRecordId;
    }

    /**
     * 获取 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public java.lang.Long getPointExchRecordId() {
        return this.pointExchRecordId;
    }

    /**
     * 设置 记录销帐流水号，外键，指向销帐记录实体
     */
    public void setBillId(java.lang.Long billId) {
        this.billId = billId;
    }

    /**
     * 获取 记录销帐流水号，外键，指向销帐记录实体
     */
    public java.lang.Long getBillId() {
        return this.billId;
    }

    /**
     * 设置 记录付款流水号，作为外键，指向付款记录实体
     */
    public void setPaymentId(java.lang.Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取 记录付款流水号，作为外键，指向付款记录实体
     */
    public java.lang.Long getPaymentId() {
        return this.paymentId;
    }

    /**
     * 设置 帐目类型标识，外键，指向帐目类型实体
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 帐目类型标识，外键，指向帐目类型实体
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 帐务周期标识
     */
    public void setBillingCycleId(java.lang.Long billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 帐务周期标识
     */
    public java.lang.Long getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
    }

    /**
     * 设置 帐户标识，外键，指向帐户实体
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识，外键，指向帐户实体
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
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
     * 设置 应收金额，单位为厘
     */
    public void setRealAmount(java.lang.Long realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取 应收金额，单位为厘
     */
    public java.lang.Long getRealAmount() {
        return this.realAmount;
    }

    /**
     * 设置 税率配置标识
     */
    public void setTaxRateConfigId(java.lang.Integer taxRateConfigId) {
        this.taxRateConfigId = taxRateConfigId;
    }

    /**
     * 获取 税率配置标识
     */
    public java.lang.Integer getTaxRateConfigId() {
        return this.taxRateConfigId;
    }

    /**
     * 设置 税率
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 获取 税率
     */
    public java.lang.Double getTaxRate() {
        return this.taxRate;
    }

    /**
     * 设置 税费，单位为厘
     */
    public void setTax(java.lang.Long tax) {
        this.tax = tax;
    }

    /**
     * 获取 税费，单位为厘
     */
    public java.lang.Long getTax() {
        return this.tax;
    }

    /**
     * 设置 不含税价格，单位为厘
     */
    public void setPrice(java.lang.Long price) {
        this.price = price;
    }

    /**
     * 获取 不含税价格，单位为厘
     */
    public java.lang.Long getPrice() {
        return this.price;
    }

    /**
     * 设置 收费方式，LOVB=ACC-C-0190
     */
    public void setChargeMethod(java.lang.String chargeMethod) {
        this.chargeMethod = chargeMethod;
    }

    /**
     * 获取 收费方式，LOVB=ACC-C-0190
     */
    public java.lang.String getChargeMethod() {
        return this.chargeMethod;
    }

    /**
     * 设置 记录源帐目标识，用于记录拆分的源帐目标识。
     */
    public void setOriAcctItemId(java.lang.Long oriAcctItemId) {
        this.oriAcctItemId = oriAcctItemId;
    }

    /**
     * 获取 记录源帐目标识，用于记录拆分的源帐目标识。
     */
    public java.lang.Long getOriAcctItemId() {
        return this.oriAcctItemId;
    }

    /**
     * 设置 是否已出帐，LOVB=PUB-C-0006
     */
    public void setIfChargeOff(java.lang.Integer ifChargeOff) {
        this.ifChargeOff = ifChargeOff;
    }

    /**
     * 获取 是否已出帐，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIfChargeOff() {
        return this.ifChargeOff;
    }

    /**
     * 设置 合帐时间
     */
    public void setMergeAcctDealTime(java.util.Date mergeAcctDealTime) {
        this.mergeAcctDealTime = mergeAcctDealTime;
    }

    /**
     * 获取 合帐时间
     */
    public java.util.Date getMergeAcctDealTime() {
        return this.mergeAcctDealTime;
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
     * 设置 积分兑换费用帐目状态，LOVB=ACC-C-0015，使用帐务子域主数据
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 积分兑换费用帐目状态，LOVB=ACC-C-0015，使用帐务子域主数据
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 创建组织标识
     */
    public void setCreateOrgId(java.lang.Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    /**
     * 获取 创建组织标识
     */
    public java.lang.Long getCreateOrgId() {
        return this.createOrgId;
    }

}
