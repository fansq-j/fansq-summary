package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录优惠券实例的使用记录信息
 * @实体表  :COUPON_INST_USE_REC
 */
public class CouponInstUseRecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COUPON_INST_USE_REC_S";

    /**
     * 优惠券实例使用记录标识
     */
    public java.lang.Long couponInstUseId;

    /**
     * 优惠券实例标识
     */
    public java.lang.Long couponInstId;

    /**
     * 使用对象类型LOVB=RES-C-0048
            客户、用户、翼支付账户等
     */
    public java.lang.String useObjType;

    /**
     * 使用对象标识
     */
    public java.lang.String useObjId;

    /**
     * 记录能使用优惠券的系统单号
     */
    public java.lang.String useOrderId;

    /**
     * 使用记录描述
     */
    public java.lang.String useDesc;

    /**
     * 使用时间
     */
    public java.util.Date useDate;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.couponInstUseId = SeqUtils.createLongId(ID_SEQ);
         return this.couponInstUseId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 使用对象类型LOVB=RES-C-0048
            客户、用户、翼支付账户等
     */
    public void setUseObjType(java.lang.String useObjType) {
        this.useObjType = useObjType;
    }

    /**
     * 获取 使用对象类型LOVB=RES-C-0048
            客户、用户、翼支付账户等
     */
    public java.lang.String getUseObjType() {
        return this.useObjType;
    }

    /**
     * 设置 使用对象标识
     */
    public void setUseObjId(java.lang.String useObjId) {
        this.useObjId = useObjId;
    }

    /**
     * 获取 使用对象标识
     */
    public java.lang.String getUseObjId() {
        return this.useObjId;
    }

    /**
     * 设置 记录能使用优惠券的系统单号
     */
    public void setUseOrderId(java.lang.String useOrderId) {
        this.useOrderId = useOrderId;
    }

    /**
     * 获取 记录能使用优惠券的系统单号
     */
    public java.lang.String getUseOrderId() {
        return this.useOrderId;
    }

    /**
     * 设置 使用记录描述
     */
    public void setUseDesc(java.lang.String useDesc) {
        this.useDesc = useDesc;
    }

    /**
     * 获取 使用记录描述
     */
    public java.lang.String getUseDesc() {
        return this.useDesc;
    }

    /**
     * 设置 使用时间
     */
    public void setUseDate(java.util.Date useDate) {
        this.useDate = useDate;
    }

    /**
     * 获取 使用时间
     */
    public java.util.Date getUseDate() {
        return this.useDate;
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
