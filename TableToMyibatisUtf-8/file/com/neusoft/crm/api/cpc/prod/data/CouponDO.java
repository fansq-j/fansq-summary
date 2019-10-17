package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:优惠券为电信企业发放给客户的一种优惠信息，优惠券需要先领后用，形成实例。此实体定义了优惠券的规格
 * @实体表  :COUPON
 */
public class CouponDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COUPON_S";

    /**
     * 优惠券规格标识
     */
    public java.lang.Integer couponId;

    /**
     * 优惠金额
     */
    public java.lang.Long discount;

    /**
     * 使用金额下限
     */
    public java.lang.Long usageChargeLow;

    /**
     * 有效天数
     */
    public java.lang.Integer effDay;

    /**
     * 普通记录状态.LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 优惠券规格标识
     */
    public void setCouponId(java.lang.Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取 优惠券规格标识
     */
    public java.lang.Integer getCouponId() {
        return this.couponId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.couponId = SeqUtils.createIntegerId(ID_SEQ);
         return this.couponId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 优惠金额
     */
    public void setDiscount(java.lang.Long discount) {
        this.discount = discount;
    }

    /**
     * 获取 优惠金额
     */
    public java.lang.Long getDiscount() {
        return this.discount;
    }

    /**
     * 设置 使用金额下限
     */
    public void setUsageChargeLow(java.lang.Long usageChargeLow) {
        this.usageChargeLow = usageChargeLow;
    }

    /**
     * 获取 使用金额下限
     */
    public java.lang.Long getUsageChargeLow() {
        return this.usageChargeLow;
    }

    /**
     * 设置 有效天数
     */
    public void setEffDay(java.lang.Integer effDay) {
        this.effDay = effDay;
    }

    /**
     * 获取 有效天数
     */
    public java.lang.Integer getEffDay() {
        return this.effDay;
    }

    /**
     * 设置 普通记录状态.LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
