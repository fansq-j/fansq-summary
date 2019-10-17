package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的销售品实例费用信息。
 * @实体表  :ORD_OFFER_INST_FEE_INFO
 */
public class OrdOfferInstFeeInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_OFFER_INST_FEE_INFO_S";

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
     * 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录销售品实例费用标识，主键。
     */
    public java.lang.Long offerInstFeeInfoId;

    /**
     * 记录销售品实例标识，外键。
     */
    public java.lang.Long offerInstId;

    /**
     * 记录销售品标识，外键。
     */
    public java.lang.Integer offerId;

    /**
     * 记录产品实例标识，外键。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录帐目类型标识，外键。
     */
    public java.lang.Long acctItemTypeId;

    /**
     * 记录币种。
     */
    public java.lang.String currency;

    /**
     * 记录优惠比例。
     */
    public java.lang.Integer ratio;

    /**
     * 记录金额。
     */
    public java.lang.Long amount;

    /**
     * 记录优惠方式（直降多少、降至多少、折扣比），主数据
     */
    public java.lang.String ratioMethod;

    /**
     * 记录是否一口价。LOVB=PUB-C-0006
     */
    public java.lang.String isFixedPrice;

    /**
     * 记录应收金额。
     */
    public java.lang.Long realAmount;

    /**
     * 记录收款单位。
     */
    public java.lang.Long chargeOrg;

    /**
     * 记录委托收款单位。
     */
    public java.lang.Long commChargeOrg;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

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
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
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
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 记录销售品实例费用标识，主键。
     */
    public void setOfferInstFeeInfoId(java.lang.Long offerInstFeeInfoId) {
        this.offerInstFeeInfoId = offerInstFeeInfoId;
    }

    /**
     * 获取 记录销售品实例费用标识，主键。
     */
    public java.lang.Long getOfferInstFeeInfoId() {
        return this.offerInstFeeInfoId;
    }

    /**
     * 设置 记录销售品实例标识，外键。
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 记录销售品实例标识，外键。
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 记录销售品标识，外键。
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录销售品标识，外键。
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 记录产品实例标识，外键。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识，外键。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录帐目类型标识，外键。
     */
    public void setAcctItemTypeId(java.lang.Long acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 记录帐目类型标识，外键。
     */
    public java.lang.Long getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 记录币种。
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    /**
     * 获取 记录币种。
     */
    public java.lang.String getCurrency() {
        return this.currency;
    }

    /**
     * 设置 记录优惠比例。
     */
    public void setRatio(java.lang.Integer ratio) {
        this.ratio = ratio;
    }

    /**
     * 获取 记录优惠比例。
     */
    public java.lang.Integer getRatio() {
        return this.ratio;
    }

    /**
     * 设置 记录金额。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 记录金额。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 记录优惠方式（直降多少、降至多少、折扣比），主数据
     */
    public void setRatioMethod(java.lang.String ratioMethod) {
        this.ratioMethod = ratioMethod;
    }

    /**
     * 获取 记录优惠方式（直降多少、降至多少、折扣比），主数据
     */
    public java.lang.String getRatioMethod() {
        return this.ratioMethod;
    }

    /**
     * 设置 记录是否一口价。LOVB=PUB-C-0006
     */
    public void setIsFixedPrice(java.lang.String isFixedPrice) {
        this.isFixedPrice = isFixedPrice;
    }

    /**
     * 获取 记录是否一口价。LOVB=PUB-C-0006
     */
    public java.lang.String getIsFixedPrice() {
        return this.isFixedPrice;
    }

    /**
     * 设置 记录应收金额。
     */
    public void setRealAmount(java.lang.Long realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取 记录应收金额。
     */
    public java.lang.Long getRealAmount() {
        return this.realAmount;
    }

    /**
     * 设置 记录收款单位。
     */
    public void setChargeOrg(java.lang.Long chargeOrg) {
        this.chargeOrg = chargeOrg;
    }

    /**
     * 获取 记录收款单位。
     */
    public java.lang.Long getChargeOrg() {
        return this.chargeOrg;
    }

    /**
     * 设置 记录委托收款单位。
     */
    public void setCommChargeOrg(java.lang.Long commChargeOrg) {
        this.commChargeOrg = commChargeOrg;
    }

    /**
     * 获取 记录委托收款单位。
     */
    public java.lang.Long getCommChargeOrg() {
        return this.commChargeOrg;
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
