package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品构成的产品成员属性的必选，主要用于后端的属性约束校验。
 * @实体表  :PROD_ATTR_VALUE_RESTRICT
 */
public class ProdAttrValueRestrictDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_ATTR_VALUE_RESTRICT_S";

    /**
     * 属性限制主键
     */
    public java.lang.Long restrictId;

    /**
     * 销售品产品关联标识
     */
    public java.lang.Long offerProdRelId;

    /**
     * 业务对象属性规格业务编码
     */
    public java.lang.Long attrId;

    /**
     * 产品ID的标识，主键
     */
    public java.lang.Integer prodId;

    /**
     * 记录最小值。
     */
    public java.lang.String minValue;

    /**
     * 记录最大值。
     */
    public java.lang.String maxValue;

    /**
     * 记录属性值触发的方式，用于自动派生相应的变更或订购订单，如果是非自动触发的，不满足条件时则只是校验报错
            LOVB=OFF-C-0060
            
     */
    public java.lang.String autoTrigger;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 属性限制主键
     */
    public void setRestrictId(java.lang.Long restrictId) {
        this.restrictId = restrictId;
    }

    /**
     * 获取 属性限制主键
     */
    public java.lang.Long getRestrictId() {
        return this.restrictId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.restrictId = SeqUtils.createLongId(ID_SEQ);
         return this.restrictId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品产品关联标识
     */
    public void setOfferProdRelId(java.lang.Long offerProdRelId) {
        this.offerProdRelId = offerProdRelId;
    }

    /**
     * 获取 销售品产品关联标识
     */
    public java.lang.Long getOfferProdRelId() {
        return this.offerProdRelId;
    }

    /**
     * 设置 业务对象属性规格业务编码
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 业务对象属性规格业务编码
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 产品ID的标识，主键
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品ID的标识，主键
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 记录最小值。
     */
    public void setMinValue(java.lang.String minValue) {
        this.minValue = minValue;
    }

    /**
     * 获取 记录最小值。
     */
    public java.lang.String getMinValue() {
        return this.minValue;
    }

    /**
     * 设置 记录最大值。
     */
    public void setMaxValue(java.lang.String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取 记录最大值。
     */
    public java.lang.String getMaxValue() {
        return this.maxValue;
    }

    /**
     * 设置 记录属性值触发的方式，用于自动派生相应的变更或订购订单，如果是非自动触发的，不满足条件时则只是校验报错
            LOVB=OFF-C-0060
            
     */
    public void setAutoTrigger(java.lang.String autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    /**
     * 获取 记录属性值触发的方式，用于自动派生相应的变更或订购订单，如果是非自动触发的，不满足条件时则只是校验报错
            LOVB=OFF-C-0060
            
     */
    public java.lang.String getAutoTrigger() {
        return this.autoTrigger;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
