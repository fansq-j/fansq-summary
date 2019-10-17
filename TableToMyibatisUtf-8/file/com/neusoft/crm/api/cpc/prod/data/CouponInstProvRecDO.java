package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录优惠券实例的发放记录信息
 * @实体表  :COUPON_INST_PROV_REC
 */
public class CouponInstProvRecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COUPON_INST_PROV_REC_S";

    /**
     * 发放记录标识
     */
    public java.lang.Long provRecId;

    /**
     * 优惠券实例标识
     */
    public java.lang.Long couponInstId;

    /**
     * 发放渠道类型LOVB=RES-C-0047
            网厅、微信、短信
     */
    public java.lang.String provChannelType;

    /**
     * 记录发放订单标识，对应外部单号
     */
    public java.lang.String provOrderId;

    /**
     * 发放对象类型LOVB=RES-C-0048
            客户、用户、翼支付账户等
     */
    public java.lang.String provObjType;

    /**
     * 发放对象标识
     */
    public java.lang.String provObjId;

    /**
     * 发放记录描述
     */
    public java.lang.String provDesc;

    /**
     * 发放时间
     */
    public java.util.Date provDate;

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
     * 设置 发放记录标识
     */
    public void setProvRecId(java.lang.Long provRecId) {
        this.provRecId = provRecId;
    }

    /**
     * 获取 发放记录标识
     */
    public java.lang.Long getProvRecId() {
        return this.provRecId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.provRecId = SeqUtils.createLongId(ID_SEQ);
         return this.provRecId;
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
     * 设置 发放渠道类型LOVB=RES-C-0047
            网厅、微信、短信
     */
    public void setProvChannelType(java.lang.String provChannelType) {
        this.provChannelType = provChannelType;
    }

    /**
     * 获取 发放渠道类型LOVB=RES-C-0047
            网厅、微信、短信
     */
    public java.lang.String getProvChannelType() {
        return this.provChannelType;
    }

    /**
     * 设置 记录发放订单标识，对应外部单号
     */
    public void setProvOrderId(java.lang.String provOrderId) {
        this.provOrderId = provOrderId;
    }

    /**
     * 获取 记录发放订单标识，对应外部单号
     */
    public java.lang.String getProvOrderId() {
        return this.provOrderId;
    }

    /**
     * 设置 发放对象类型LOVB=RES-C-0048
            客户、用户、翼支付账户等
     */
    public void setProvObjType(java.lang.String provObjType) {
        this.provObjType = provObjType;
    }

    /**
     * 获取 发放对象类型LOVB=RES-C-0048
            客户、用户、翼支付账户等
     */
    public java.lang.String getProvObjType() {
        return this.provObjType;
    }

    /**
     * 设置 发放对象标识
     */
    public void setProvObjId(java.lang.String provObjId) {
        this.provObjId = provObjId;
    }

    /**
     * 获取 发放对象标识
     */
    public java.lang.String getProvObjId() {
        return this.provObjId;
    }

    /**
     * 设置 发放记录描述
     */
    public void setProvDesc(java.lang.String provDesc) {
        this.provDesc = provDesc;
    }

    /**
     * 获取 发放记录描述
     */
    public java.lang.String getProvDesc() {
        return this.provDesc;
    }

    /**
     * 设置 发放时间
     */
    public void setProvDate(java.util.Date provDate) {
        this.provDate = provDate;
    }

    /**
     * 获取 发放时间
     */
    public java.util.Date getProvDate() {
        return this.provDate;
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
