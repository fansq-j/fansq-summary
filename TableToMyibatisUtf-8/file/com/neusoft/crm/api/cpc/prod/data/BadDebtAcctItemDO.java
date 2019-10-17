package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述用户呆坏帐帐目信息，便于用户呆坏帐回收和处理。
 * @实体表  :BAD_DEBT_ACCT_ITEM
 */
public class BadDebtAcctItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BAD_DEBT_ACCT_ITEM_S";

    /**
     * 为不同呆坏帐帐目生成的唯一编号。
     */
    public java.lang.Long badDebtAcctItemId;

    /**
     * 为不同帐目生成的唯一编号。
     */
    public java.lang.Long acctItemId;

    /**
     * 电信产品服务费用中的其中一种费用类型。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 区分同一帐目类型的帐目的不同来源的唯一编号。
     */
    public java.lang.Integer itemSourceId;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

    /**
     * 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long acctId;

    /**
     * 为每个产品实例生成的唯一编号。
     */
    public java.lang.Long prodInstId;

    /**
     * 金额
     */
    public java.lang.Long amount;

    /**
     * 数据创建时间
     */
    public java.util.Date createDate;

    /**
     * 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public java.lang.Integer feeCycleId;

    /**
     * 费用可以开始收取的帐期周期
     */
    public java.lang.Integer payCycleId;

    /**
     * 帐目的状态。ACC-C-0015
     */
    public java.lang.Integer acctItemState;

    /**
     * 帐目建立时间
     */
    public java.util.Date acctItemCreatedDate;

    /**
     * 产品规格标识
     */
    public java.lang.Long prodSpecId;

    /**
     * 为每种付款方式定义的唯一代码
     */
    public java.lang.Integer paymentMethod;

    /**
     * 销帐流水号
     */
    public java.lang.Long billId;

    /**
     * 记录原帐目的帐目标识。
     */
    public java.lang.Long oriAcctItemId;

    /**
     * 客户的名称
     */
    public java.lang.String custName;

    /**
     * 业务号码
     */
    public java.lang.String accNum;

    /**
     * 设备外部编号。
     */
    public java.lang.String certNum;

    /**
     * LOVB=PTY-0004
     */
    public java.lang.Integer certificateType;

    /**
     * 分局标识
     */
    public java.lang.Integer bureauId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 流水号
     */
    public java.lang.String serialNo;

    /**
     * 客户类型标识
     */
    public java.lang.Integer custTypeId;

    /**
     * LOVB=ACC-C-0106
     */
    public java.lang.Integer oweDismountType;

    /**
     * 坏帐处理任务标识
     */
    public java.lang.Long taskId;

    /**
     * 设置 为不同呆坏帐帐目生成的唯一编号。
     */
    public void setBadDebtAcctItemId(java.lang.Long badDebtAcctItemId) {
        this.badDebtAcctItemId = badDebtAcctItemId;
    }

    /**
     * 获取 为不同呆坏帐帐目生成的唯一编号。
     */
    public java.lang.Long getBadDebtAcctItemId() {
        return this.badDebtAcctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.badDebtAcctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.badDebtAcctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 为不同帐目生成的唯一编号。
     */
    public void setAcctItemId(java.lang.Long acctItemId) {
        this.acctItemId = acctItemId;
    }

    /**
     * 获取 为不同帐目生成的唯一编号。
     */
    public java.lang.Long getAcctItemId() {
        return this.acctItemId;
    }

    /**
     * 设置 电信产品服务费用中的其中一种费用类型。
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 电信产品服务费用中的其中一种费用类型。
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 区分同一帐目类型的帐目的不同来源的唯一编号。
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 区分同一帐目类型的帐目的不同来源的唯一编号。
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
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
     * 设置 为每个产品实例生成的唯一编号。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 为每个产品实例生成的唯一编号。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
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
     * 设置 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public void setFeeCycleId(java.lang.Integer feeCycleId) {
        this.feeCycleId = feeCycleId;
    }

    /**
     * 获取 发生费用的帐务周期。指的是用户实际使用电信产品产生的费用当时所在的帐务周期。
     */
    public java.lang.Integer getFeeCycleId() {
        return this.feeCycleId;
    }

    /**
     * 设置 费用可以开始收取的帐期周期
     */
    public void setPayCycleId(java.lang.Integer payCycleId) {
        this.payCycleId = payCycleId;
    }

    /**
     * 获取 费用可以开始收取的帐期周期
     */
    public java.lang.Integer getPayCycleId() {
        return this.payCycleId;
    }

    /**
     * 设置 帐目的状态。ACC-C-0015
     */
    public void setAcctItemState(java.lang.Integer acctItemState) {
        this.acctItemState = acctItemState;
    }

    /**
     * 获取 帐目的状态。ACC-C-0015
     */
    public java.lang.Integer getAcctItemState() {
        return this.acctItemState;
    }

    /**
     * 设置 帐目建立时间
     */
    public void setAcctItemCreatedDate(java.util.Date acctItemCreatedDate) {
        this.acctItemCreatedDate = acctItemCreatedDate;
    }

    /**
     * 获取 帐目建立时间
     */
    public java.util.Date getAcctItemCreatedDate() {
        return this.acctItemCreatedDate;
    }

    /**
     * 设置 产品规格标识
     */
    public void setProdSpecId(java.lang.Long prodSpecId) {
        this.prodSpecId = prodSpecId;
    }

    /**
     * 获取 产品规格标识
     */
    public java.lang.Long getProdSpecId() {
        return this.prodSpecId;
    }

    /**
     * 设置 为每种付款方式定义的唯一代码
     */
    public void setPaymentMethod(java.lang.Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取 为每种付款方式定义的唯一代码
     */
    public java.lang.Integer getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * 设置 销帐流水号
     */
    public void setBillId(java.lang.Long billId) {
        this.billId = billId;
    }

    /**
     * 获取 销帐流水号
     */
    public java.lang.Long getBillId() {
        return this.billId;
    }

    /**
     * 设置 记录原帐目的帐目标识。
     */
    public void setOriAcctItemId(java.lang.Long oriAcctItemId) {
        this.oriAcctItemId = oriAcctItemId;
    }

    /**
     * 获取 记录原帐目的帐目标识。
     */
    public java.lang.Long getOriAcctItemId() {
        return this.oriAcctItemId;
    }

    /**
     * 设置 客户的名称
     */
    public void setCustName(java.lang.String custName) {
        this.custName = custName;
    }

    /**
     * 获取 客户的名称
     */
    public java.lang.String getCustName() {
        return this.custName;
    }

    /**
     * 设置 业务号码
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }

    /**
     * 获取 业务号码
     */
    public java.lang.String getAccNum() {
        return this.accNum;
    }

    /**
     * 设置 设备外部编号。
     */
    public void setCertNum(java.lang.String certNum) {
        this.certNum = certNum;
    }

    /**
     * 获取 设备外部编号。
     */
    public java.lang.String getCertNum() {
        return this.certNum;
    }

    /**
     * 设置 LOVB=PTY-0004
     */
    public void setCertificateType(java.lang.Integer certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * 获取 LOVB=PTY-0004
     */
    public java.lang.Integer getCertificateType() {
        return this.certificateType;
    }

    /**
     * 设置 分局标识
     */
    public void setBureauId(java.lang.Integer bureauId) {
        this.bureauId = bureauId;
    }

    /**
     * 获取 分局标识
     */
    public java.lang.Integer getBureauId() {
        return this.bureauId;
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
     * 设置 流水号
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * 获取 流水号
     */
    public java.lang.String getSerialNo() {
        return this.serialNo;
    }

    /**
     * 设置 客户类型标识
     */
    public void setCustTypeId(java.lang.Integer custTypeId) {
        this.custTypeId = custTypeId;
    }

    /**
     * 获取 客户类型标识
     */
    public java.lang.Integer getCustTypeId() {
        return this.custTypeId;
    }

    /**
     * 设置 LOVB=ACC-C-0106
     */
    public void setOweDismountType(java.lang.Integer oweDismountType) {
        this.oweDismountType = oweDismountType;
    }

    /**
     * 获取 LOVB=ACC-C-0106
     */
    public java.lang.Integer getOweDismountType() {
        return this.oweDismountType;
    }

    /**
     * 设置 坏帐处理任务标识
     */
    public void setTaskId(java.lang.Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取 坏帐处理任务标识
     */
    public java.lang.Long getTaskId() {
        return this.taskId;
    }

}
