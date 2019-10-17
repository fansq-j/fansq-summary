package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:有些需求需要支持套餐费要把多个产品的租费加起来，多个产品的租费在这个地方定义。
 * @实体表  :FAIR_OFFER_PRODUCT_RENT
 */
public class FairOfferProductRentDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_OFFER_PRODUCT_RENT_S";

    /**
     * 套餐产品租费标识
     */
    public java.lang.Integer productRentId;

    /**
     * 定位标识
     */
    public java.lang.Integer fairOfferId;

    /**
     * 产品标识
     */
    public java.lang.Integer productId;

    /**
     * 角色
     */
    public java.lang.Long roleId;

    /**
     * 月租费
     */
    public java.lang.Long rentValue;

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
     * 设置 套餐产品租费标识
     */
    public void setProductRentId(java.lang.Integer productRentId) {
        this.productRentId = productRentId;
    }

    /**
     * 获取 套餐产品租费标识
     */
    public java.lang.Integer getProductRentId() {
        return this.productRentId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.productRentId = SeqUtils.createIntegerId(ID_SEQ);
         return this.productRentId;
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
     * 设置 产品标识
     */
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取 产品标识
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
     * 设置 月租费
     */
    public void setRentValue(java.lang.Long rentValue) {
        this.rentValue = rentValue;
    }

    /**
     * 获取 月租费
     */
    public java.lang.Long getRentValue() {
        return this.rentValue;
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
