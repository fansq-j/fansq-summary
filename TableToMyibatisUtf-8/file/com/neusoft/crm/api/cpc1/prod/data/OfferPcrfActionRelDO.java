package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品与定向流量关系表。
 * @实体表  :OFFER_PCRF_ACTION_REL
 */
public class OfferPcrfActionRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_PCRF_ACTION_REL_S";

    /**
     * 主键
     */
    public java.lang.Integer offerPcrfActionRelId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 定向流量动作指令
     */
    public java.lang.String pcrfAction;

    /**
     * 销售品对应的属性
     */
    public java.lang.Integer offerAttrId;

    /**
     * 销售品对应的属性的值
     */
    public java.lang.String offerAttrValue;

    /**
     * 产品标识
     */
    public java.lang.Integer prodId;

    /**
     * 产品对应的属性
     */
    public java.lang.Integer prodAttrId;

    /**
     * 产品对应的属性的值
     */
    public java.lang.String prodAttrValue;

    /**
     * 其他条件
     */
    public java.lang.String otherCondition;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 主键
     */
    public void setOfferPcrfActionRelId(java.lang.Integer offerPcrfActionRelId) {
        this.offerPcrfActionRelId = offerPcrfActionRelId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Integer getOfferPcrfActionRelId() {
        return this.offerPcrfActionRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.offerPcrfActionRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.offerPcrfActionRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 定向流量动作指令
     */
    public void setPcrfAction(java.lang.String pcrfAction) {
        this.pcrfAction = pcrfAction;
    }

    /**
     * 获取 定向流量动作指令
     */
    public java.lang.String getPcrfAction() {
        return this.pcrfAction;
    }

    /**
     * 设置 销售品对应的属性
     */
    public void setOfferAttrId(java.lang.Integer offerAttrId) {
        this.offerAttrId = offerAttrId;
    }

    /**
     * 获取 销售品对应的属性
     */
    public java.lang.Integer getOfferAttrId() {
        return this.offerAttrId;
    }

    /**
     * 设置 销售品对应的属性的值
     */
    public void setOfferAttrValue(java.lang.String offerAttrValue) {
        this.offerAttrValue = offerAttrValue;
    }

    /**
     * 获取 销售品对应的属性的值
     */
    public java.lang.String getOfferAttrValue() {
        return this.offerAttrValue;
    }

    /**
     * 设置 产品标识
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品标识
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 产品对应的属性
     */
    public void setProdAttrId(java.lang.Integer prodAttrId) {
        this.prodAttrId = prodAttrId;
    }

    /**
     * 获取 产品对应的属性
     */
    public java.lang.Integer getProdAttrId() {
        return this.prodAttrId;
    }

    /**
     * 设置 产品对应的属性的值
     */
    public void setProdAttrValue(java.lang.String prodAttrValue) {
        this.prodAttrValue = prodAttrValue;
    }

    /**
     * 获取 产品对应的属性的值
     */
    public java.lang.String getProdAttrValue() {
        return this.prodAttrValue;
    }

    /**
     * 设置 其他条件
     */
    public void setOtherCondition(java.lang.String otherCondition) {
        this.otherCondition = otherCondition;
    }

    /**
     * 获取 其他条件
     */
    public java.lang.String getOtherCondition() {
        return this.otherCondition;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
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
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
