package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录优惠券实例使用时的优惠物品清单
 * @实体表  :COUPON_INST_DCT_ITEM
 */
public class CouponInstDctItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COUPON_INST_DCT_ITEM_S";

    /**
     * 优惠优惠项目标识
     */
    public java.lang.Long dctItemId;

    /**
     * 优惠券实例使用记录标识
     */
    public java.lang.Long couponInstUseId;

    /**
     * 优惠券实例标识
     */
    public java.lang.Long couponInstId;

    /**
     * 使用对象类型LOVB=RES-C-0044
            客户、用户、翼支付账户等
     */
    public java.lang.String objType;

    /**
     * 使用对象标识
     */
    public java.lang.String objId;

    /**
     * 记录项目的优惠额度信息
     */
    public java.lang.Double couponAmount;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 优惠优惠项目标识
     */
    public void setDctItemId(java.lang.Long dctItemId) {
        this.dctItemId = dctItemId;
    }

    /**
     * 获取 优惠优惠项目标识
     */
    public java.lang.Long getDctItemId() {
        return this.dctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.dctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.dctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 优惠券实例使用记录标识
     */
    public void setCouponInstUseId(java.lang.Long couponInstUseId) {
        this.couponInstUseId = couponInstUseId;
    }

    /**
     * 获取 优惠券实例使用记录标识
     */
    public java.lang.Long getCouponInstUseId() {
        return this.couponInstUseId;
    }

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
     * 设置 使用对象类型LOVB=RES-C-0044
            客户、用户、翼支付账户等
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 使用对象类型LOVB=RES-C-0044
            客户、用户、翼支付账户等
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 使用对象标识
     */
    public void setObjId(java.lang.String objId) {
        this.objId = objId;
    }

    /**
     * 获取 使用对象标识
     */
    public java.lang.String getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录项目的优惠额度信息
     */
    public void setCouponAmount(java.lang.Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取 记录项目的优惠额度信息
     */
    public java.lang.Double getCouponAmount() {
        return this.couponAmount;
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

}
