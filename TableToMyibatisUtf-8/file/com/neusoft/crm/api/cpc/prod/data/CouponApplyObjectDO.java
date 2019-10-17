package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录优惠券与能优惠的对象，如商品、销售品、产品、积分等。
 * @实体表  :COUPON_APPLY_OBJECT
 */
public class CouponApplyObjectDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COUPON_APPLY_OBJECT_S";

    /**
     * 优惠券适用对象标识
     */
    public java.lang.Long applyObjectId;

    /**
     * 优惠券标识
     */
    public java.lang.Integer mktResId;

    /**
     * 适用对象类型LOVB=RES-C-0044
            商品、销售品、积分等
     */
    public java.lang.Long objType;

    /**
     * 适用对象标识
            
            兑换关系：记录A端营销资源能够兑换的Z端营销资源，如优惠券适用兑换的商品。
     */
    public java.lang.Long objId;

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
     * 设置 优惠券适用对象标识
     */
    public void setApplyObjectId(java.lang.Long applyObjectId) {
        this.applyObjectId = applyObjectId;
    }

    /**
     * 获取 优惠券适用对象标识
     */
    public java.lang.Long getApplyObjectId() {
        return this.applyObjectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.applyObjectId = SeqUtils.createLongId(ID_SEQ);
         return this.applyObjectId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 适用对象类型LOVB=RES-C-0044
            商品、销售品、积分等
     */
    public void setObjType(java.lang.Long objType) {
        this.objType = objType;
    }

    /**
     * 获取 适用对象类型LOVB=RES-C-0044
            商品、销售品、积分等
     */
    public java.lang.Long getObjType() {
        return this.objType;
    }

    /**
     * 设置 适用对象标识
            
            兑换关系：记录A端营销资源能够兑换的Z端营销资源，如优惠券适用兑换的商品。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 适用对象标识
            
            兑换关系：记录A端营销资源能够兑换的Z端营销资源，如优惠券适用兑换的商品。
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
