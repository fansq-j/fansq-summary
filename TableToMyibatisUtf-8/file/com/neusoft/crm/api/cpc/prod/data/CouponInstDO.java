package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录每一个优惠券实例信息
 * @实体表  :COUPON_INST
 */
public class CouponInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COUPON_INST_S";

    /**
     * 优惠券实例标识
     */
    public java.lang.Long couponInstId;

    /**
     * 优惠券实例编码
     */
    public java.lang.String couponInstNbr;

    /**
     * 优惠券标识
     */
    public java.lang.Integer mktResId;

    /**
     * 记录优惠券使用后最终的优惠额度信息
     */
    public java.lang.Double couponAmount;

    /**
     * 优惠券赠送的客户统一账号
     */
    public java.lang.Long custAcctId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 状态LOVB=RES-C-0046
            未使用、已使用、已过期
     */
    public java.lang.String statusCd;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态变更的时间。
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
     * 设置 优惠券实例标识
     */
    public void setCouponInstId(java.lang.Long couponInstId) {
        this.couponInstId = couponInstId;
    }

    /**
     * 获取 优惠券实例标识
     */
    public java.lang.Long getCouponInstId() {
        return this.couponInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.couponInstId = SeqUtils.createLongId(ID_SEQ);
         return this.couponInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 优惠券实例编码
     */
    public void setCouponInstNbr(java.lang.String couponInstNbr) {
        this.couponInstNbr = couponInstNbr;
    }

    /**
     * 获取 优惠券实例编码
     */
    public java.lang.String getCouponInstNbr() {
        return this.couponInstNbr;
    }

    /**
     * 设置 优惠券标识
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 优惠券标识
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 记录优惠券使用后最终的优惠额度信息
     */
    public void setCouponAmount(java.lang.Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取 记录优惠券使用后最终的优惠额度信息
     */
    public java.lang.Double getCouponAmount() {
        return this.couponAmount;
    }

    /**
     * 设置 优惠券赠送的客户统一账号
     */
    public void setCustAcctId(java.lang.Long custAcctId) {
        this.custAcctId = custAcctId;
    }

    /**
     * 获取 优惠券赠送的客户统一账号
     */
    public java.lang.Long getCustAcctId() {
        return this.custAcctId;
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
     * 设置 状态LOVB=RES-C-0046
            未使用、已使用、已过期
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态LOVB=RES-C-0046
            未使用、已使用、已过期
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
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

}
