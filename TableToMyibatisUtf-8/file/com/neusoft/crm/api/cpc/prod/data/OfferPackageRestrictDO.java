package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录了礼包的限制条件，限制域类型属性体现礼包的不同类型的限制条件，如地域，渠道等等。
 * @实体表  :OFFER_PACKAGE_RESTRICT
 */
public class OfferPackageRestrictDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_PACKAGE_RESTRICT_S";

    /**
     * 销售品限制主键
     */
    public java.lang.Long offerPackageRestrictId;

    /**
     * 记录礼包标志
     */
    public java.lang.Long offerPackageId;

    /**
     * 限制类型：客户、渠道等等。LOVB=OFF-C-0061
     */
    public java.lang.String rstrObjType;

    /**
     * 限制对象标识
     */
    public java.lang.Long rstrObjId;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品限制主键
     */
    public void setOfferPackageRestrictId(java.lang.Long offerPackageRestrictId) {
        this.offerPackageRestrictId = offerPackageRestrictId;
    }

    /**
     * 获取 销售品限制主键
     */
    public java.lang.Long getOfferPackageRestrictId() {
        return this.offerPackageRestrictId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerPackageRestrictId = SeqUtils.createLongId(ID_SEQ);
         return this.offerPackageRestrictId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录礼包标志
     */
    public void setOfferPackageId(java.lang.Long offerPackageId) {
        this.offerPackageId = offerPackageId;
    }

    /**
     * 获取 记录礼包标志
     */
    public java.lang.Long getOfferPackageId() {
        return this.offerPackageId;
    }

    /**
     * 设置 限制类型：客户、渠道等等。LOVB=OFF-C-0061
     */
    public void setRstrObjType(java.lang.String rstrObjType) {
        this.rstrObjType = rstrObjType;
    }

    /**
     * 获取 限制类型：客户、渠道等等。LOVB=OFF-C-0061
     */
    public java.lang.String getRstrObjType() {
        return this.rstrObjType;
    }

    /**
     * 设置 限制对象标识
     */
    public void setRstrObjId(java.lang.Long rstrObjId) {
        this.rstrObjId = rstrObjId;
    }

    /**
     * 获取 限制对象标识
     */
    public java.lang.Long getRstrObjId() {
        return this.rstrObjId;
    }

    /**
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
