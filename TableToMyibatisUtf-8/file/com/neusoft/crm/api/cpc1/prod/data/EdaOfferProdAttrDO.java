package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品、产品的属性可选值选择数量（日），每天8点之前提供最近30天的数量
 * @实体表  :EDA_OFFER_PROD_ATTR
 */
public class EdaOfferProdAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EDA_OFFER_PROD_ATTR_S";

    /**
     * 序列值，主键
     */
    public java.lang.Long edaOfferProdAttrId;

    /**
     * 产销品类型（1产品；2销售品）。
     */
    public java.lang.String prodOfferType;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 产品标识
     */
    public java.lang.Integer prodId;

    /**
     * 属性id
     */
    public java.lang.Integer attrId;

    /**
     * 属性值id
     */
    public java.lang.Integer attrValueId;

    /**
     * 属性值
     */
    public java.lang.Integer attrValue;

    /**
     * 数量
     */
    public java.lang.Integer amount;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 排序
     */
    public java.lang.Integer sort;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 扩展字段1。
     */
    public java.lang.String exp1;

    /**
     * 扩展字段2。
     */
    public java.lang.String exp2;

    /**
     * 备注。
     */
    public java.lang.String remark;

    /**
     * 设置 序列值，主键
     */
    public void setEdaOfferProdAttrId(java.lang.Long edaOfferProdAttrId) {
        this.edaOfferProdAttrId = edaOfferProdAttrId;
    }

    /**
     * 获取 序列值，主键
     */
    public java.lang.Long getEdaOfferProdAttrId() {
        return this.edaOfferProdAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.edaOfferProdAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.edaOfferProdAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 产销品类型（1产品；2销售品）。
     */
    public void setProdOfferType(java.lang.String prodOfferType) {
        this.prodOfferType = prodOfferType;
    }

    /**
     * 获取 产销品类型（1产品；2销售品）。
     */
    public java.lang.String getProdOfferType() {
        return this.prodOfferType;
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
     * 设置 属性id
     */
    public void setAttrId(java.lang.Integer attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 属性id
     */
    public java.lang.Integer getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 属性值id
     */
    public void setAttrValueId(java.lang.Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值id
     */
    public java.lang.Integer getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 属性值
     */
    public void setAttrValue(java.lang.Integer attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 属性值
     */
    public java.lang.Integer getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 数量
     */
    public void setAmount(java.lang.Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取 数量
     */
    public java.lang.Integer getAmount() {
        return this.amount;
    }

    /**
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 排序
     */
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取 排序
     */
    public java.lang.Integer getSort() {
        return this.sort;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 扩展字段1。
     */
    public void setExp1(java.lang.String exp1) {
        this.exp1 = exp1;
    }

    /**
     * 获取 扩展字段1。
     */
    public java.lang.String getExp1() {
        return this.exp1;
    }

    /**
     * 设置 扩展字段2。
     */
    public void setExp2(java.lang.String exp2) {
        this.exp2 = exp2;
    }

    /**
     * 获取 扩展字段2。
     */
    public java.lang.String getExp2() {
        return this.exp2;
    }

    /**
     * 设置 备注。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
