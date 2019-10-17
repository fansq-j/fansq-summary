package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于一些特殊需求：套餐内业务分摊前需要先按产品分摊
 * @实体表  :FAIR_OFFER_PRODUCT_RATE
 */
public class FairOfferProductRateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_OFFER_PRODUCT_RATE_S";

    /**
     * 明细标识
     */
    public java.lang.Integer offerProductRateId;

    /**
     * 定位标识
     */
    public java.lang.Integer fairOfferId;

    /**
     * 产品
     */
    public java.lang.Integer productId;

    /**
     * 角色
     */
    public java.lang.Long roleId;

    /**
     * 比例
     */
    public java.lang.Double rate;

    /**
     * LOVB=PLC-C-0026
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
     * 设置 明细标识
     */
    public void setOfferProductRateId(java.lang.Integer offerProductRateId) {
        this.offerProductRateId = offerProductRateId;
    }

    /**
     * 获取 明细标识
     */
    public java.lang.Integer getOfferProductRateId() {
        return this.offerProductRateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.offerProductRateId = SeqUtils.createIntegerId(ID_SEQ);
         return this.offerProductRateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 定位标识
     */
    public void setFairOfferId(java.lang.Integer fairOfferId) {
        this.fairOfferId = fairOfferId;
    }

    /**
     * 获取 定位标识
     */
    public java.lang.Integer getFairOfferId() {
        return this.fairOfferId;
    }

    /**
     * 设置 产品
     */
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取 产品
     */
    public java.lang.Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置 角色
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 比例
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }

    /**
     * 获取 比例
     */
    public java.lang.Double getRate() {
        return this.rate;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
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
