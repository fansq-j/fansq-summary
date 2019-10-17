package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述一次性费用的计算结果信息
 * @实体表  :ONE_ITEM_CALC
 */
public class OneItemCalcDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ONE_ITEM_CALC_S";

    /**
     * 帐目标识
     */
    public java.lang.Long oneAcctItemId;

    /**
     * 记录客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 记录订单项唯一编号。
     */
    public java.lang.Long orderItemId;

    /**
     * 区分一次费费用来源类型，一次性费用费用补收补退，优惠用原订单标识。通过来源类型、客户订单标识、订单项标识 、帐目类型关联获取。
            
            LOVB=ACC-C-0220
     */
    public java.lang.Integer sourceType;

    /**
     * 对每一帐目类型的唯一编号。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 计算结果为3，余额型的时候填写。
     */
    public java.lang.Integer balanceTypeId;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 帐户标识{为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个生成之后，在整个服务提供有效期内保持不变。}
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识{为每个产品实例生成的唯一编号。}
     */
    public java.lang.Long prodInstId;

    /**
     * 应收用户金额
     */
    public java.lang.Long shouldAmount;

    /**
     * LOVB=PRC-C-0040
     */
    public java.lang.Integer resultItemType;

    /**
     * 数据创建时间
     */
    public java.util.Date createDate;

    /**
     * LOVB=ACC-C-0190
     */
    public java.lang.Integer chargeMethod;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * LOVB=ACC-C-0191
     */
    public java.lang.Integer statusCd;

    /**
     * 状态时间{帐目状态变更的时间。}
     */
    public java.util.Date statusDate;

    /**
     * 设置 帐目标识
     */
    public void setOneAcctItemId(java.lang.Long oneAcctItemId) {
        this.oneAcctItemId = oneAcctItemId;
    }

    /**
     * 获取 帐目标识
     */
    public java.lang.Long getOneAcctItemId() {
        return this.oneAcctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.oneAcctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.oneAcctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户订单标识
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 记录客户订单标识
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 记录订单项唯一编号。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项唯一编号。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 区分一次费费用来源类型，一次性费用费用补收补退，优惠用原订单标识。通过来源类型、客户订单标识、订单项标识 、帐目类型关联获取。
            
            LOVB=ACC-C-0220
     */
    public void setSourceType(java.lang.Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取 区分一次费费用来源类型，一次性费用费用补收补退，优惠用原订单标识。通过来源类型、客户订单标识、订单项标识 、帐目类型关联获取。
            
            LOVB=ACC-C-0220
     */
    public java.lang.Integer getSourceType() {
        return this.sourceType;
    }

    /**
     * 设置 对每一帐目类型的唯一编号。
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 对每一帐目类型的唯一编号。
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 计算结果为3，余额型的时候填写。
     */
    public void setBalanceTypeId(java.lang.Integer balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
    }

    /**
     * 获取 计算结果为3，余额型的时候填写。
     */
    public java.lang.Integer getBalanceTypeId() {
        return this.balanceTypeId;
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
     * 设置 帐户标识{为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个生成之后，在整个服务提供有效期内保持不变。}
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识{为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个生成之后，在整个服务提供有效期内保持不变。}
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 产品实例标识{为每个产品实例生成的唯一编号。}
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识{为每个产品实例生成的唯一编号。}
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 应收用户金额
     */
    public void setShouldAmount(java.lang.Long shouldAmount) {
        this.shouldAmount = shouldAmount;
    }

    /**
     * 获取 应收用户金额
     */
    public java.lang.Long getShouldAmount() {
        return this.shouldAmount;
    }

    /**
     * 设置 LOVB=PRC-C-0040
     */
    public void setResultItemType(java.lang.Integer resultItemType) {
        this.resultItemType = resultItemType;
    }

    /**
     * 获取 LOVB=PRC-C-0040
     */
    public java.lang.Integer getResultItemType() {
        return this.resultItemType;
    }

    /**
     * 设置 数据创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 数据创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 LOVB=ACC-C-0190
     */
    public void setChargeMethod(java.lang.Integer chargeMethod) {
        this.chargeMethod = chargeMethod;
    }

    /**
     * 获取 LOVB=ACC-C-0190
     */
    public java.lang.Integer getChargeMethod() {
        return this.chargeMethod;
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
     * 设置 LOVB=ACC-C-0191
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0191
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态时间{帐目状态变更的时间。}
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间{帐目状态变更的时间。}
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
