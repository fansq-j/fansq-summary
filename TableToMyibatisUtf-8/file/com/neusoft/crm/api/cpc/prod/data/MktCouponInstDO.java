package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:优惠券实例，为客户领取后产生
 * @实体表  :MKT_COUPON_INST
 */
public class MktCouponInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_COUPON_INST_S";

    /**
     * 优惠券实例标识
     */
    public java.lang.Integer couponInstId;

    /**
     * 优惠券规格标识
     */
    public java.lang.Integer couponId;

    /**
     * 帐户标识
     */
    public java.lang.Long acctId;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 设置 优惠券实例标识
     */
    public void setCouponInstId(java.lang.Integer couponInstId) {
        this.couponInstId = couponInstId;
    }

    /**
     * 获取 优惠券实例标识
     */
    public java.lang.Integer getCouponInstId() {
        return this.couponInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.couponInstId = SeqUtils.createIntegerId(ID_SEQ);
         return this.couponInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

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
     * 设置 帐户标识
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
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
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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

}
