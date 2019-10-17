package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于定义执行一个优惠计算所需要参考的定价参考对象，这些对象的使用方式由优惠计算方法来决定。
 * @实体表  :DISCOUNT_CALC_OBJECT
 */
public class DiscountCalcObjectDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DISCOUNT_CALC_OBJECT_S";

    /**
     * 优惠计算对象标识
     */
    public java.lang.Integer discountCalcObjectId;

    /**
     * 优惠计算的标识
     */
    public java.lang.Integer discountExpressId;

    /**
     * 定价参考对象标识
     */
    public java.lang.Integer pricingRefObjectId;

    /**
     * LOVB=PRC-C-0026
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
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 优惠计算对象标识
     */
    public void setDiscountCalcObjectId(java.lang.Integer discountCalcObjectId) {
        this.discountCalcObjectId = discountCalcObjectId;
    }

    /**
     * 获取 优惠计算对象标识
     */
    public java.lang.Integer getDiscountCalcObjectId() {
        return this.discountCalcObjectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.discountCalcObjectId = SeqUtils.createIntegerId(ID_SEQ);
         return this.discountCalcObjectId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 优惠计算的标识
     */
    public void setDiscountExpressId(java.lang.Integer discountExpressId) {
        this.discountExpressId = discountExpressId;
    }

    /**
     * 获取 优惠计算的标识
     */
    public java.lang.Integer getDiscountExpressId() {
        return this.discountExpressId;
    }

    /**
     * 设置 定价参考对象标识
     */
    public void setPricingRefObjectId(java.lang.Integer pricingRefObjectId) {
        this.pricingRefObjectId = pricingRefObjectId;
    }

    /**
     * 获取 定价参考对象标识
     */
    public java.lang.Integer getPricingRefObjectId() {
        return this.pricingRefObjectId;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
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

}
