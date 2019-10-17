package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述销售品失效方式、失效方式、体验期的配置。如分24个月返回的促销，首月立即生效，月末失效的要求，可通过配置生效方式是立
 * @实体表  :OFFER_EFF_EXP_CONFIG
 */
public class OfferEffExpConfigDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_EFF_EXP_CONFIG_S";

    /**
     * 销售品生失效配置主键
     */
    public java.lang.Long offerEffExpConfigId;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * 服务提供
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 产品存在方式。LOVB=OFF-C-0027
     */
    public java.lang.String prodExistType;

    /**
     * 生效基准时间类型。LOVB=OFF-C-0033
     */
    public java.lang.String effBaseType;

    /**
     * 生效方式。LOVB=OFF-C-0007
     */
    public java.lang.String effType;

    /**
     * 有效期类型。LOVB=OFF-C-0034
     */
    public java.lang.String periodTimeType;

    /**
     * 指定生效时间
     */
    public java.util.Date effDate;

    /**
     * 指定失效时间
     */
    public java.util.Date expDate;

    /**
     * 有效期时间单位。LOVB=OFF-C-0036
     */
    public java.lang.String periodUnit;

    /**
     * 有效期时长
     */
    public java.lang.Integer periodTime;

    /**
     * 有效期修正方式。LOVB=OFF-C-0035
     */
    public java.lang.String adjustType;

    /**
     * 体验期类型，LOVB=OFF-C-0041
     */
    public java.lang.Integer trialType;

    /**
     * 体验期时间单位，LOVB=OFF-C-0042
     */
    public java.lang.String trialPeriodUnit;

    /**
     * 体验期时长
     */
    public java.lang.Integer trialPeriodTime;

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
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 是否默认
     */
    public java.lang.Integer isDefault;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品生失效配置主键
     */
    public void setOfferEffExpConfigId(java.lang.Long offerEffExpConfigId) {
        this.offerEffExpConfigId = offerEffExpConfigId;
    }

    /**
     * 获取 销售品生失效配置主键
     */
    public java.lang.Long getOfferEffExpConfigId() {
        return this.offerEffExpConfigId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerEffExpConfigId = SeqUtils.createLongId(ID_SEQ);
         return this.offerEffExpConfigId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 服务提供
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 产品存在方式。LOVB=OFF-C-0027
     */
    public void setProdExistType(java.lang.String prodExistType) {
        this.prodExistType = prodExistType;
    }

    /**
     * 获取 产品存在方式。LOVB=OFF-C-0027
     */
    public java.lang.String getProdExistType() {
        return this.prodExistType;
    }

    /**
     * 设置 生效基准时间类型。LOVB=OFF-C-0033
     */
    public void setEffBaseType(java.lang.String effBaseType) {
        this.effBaseType = effBaseType;
    }

    /**
     * 获取 生效基准时间类型。LOVB=OFF-C-0033
     */
    public java.lang.String getEffBaseType() {
        return this.effBaseType;
    }

    /**
     * 设置 生效方式。LOVB=OFF-C-0007
     */
    public void setEffType(java.lang.String effType) {
        this.effType = effType;
    }

    /**
     * 获取 生效方式。LOVB=OFF-C-0007
     */
    public java.lang.String getEffType() {
        return this.effType;
    }

    /**
     * 设置 有效期类型。LOVB=OFF-C-0034
     */
    public void setPeriodTimeType(java.lang.String periodTimeType) {
        this.periodTimeType = periodTimeType;
    }

    /**
     * 获取 有效期类型。LOVB=OFF-C-0034
     */
    public java.lang.String getPeriodTimeType() {
        return this.periodTimeType;
    }

    /**
     * 设置 指定生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 指定生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 指定失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 指定失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 有效期时间单位。LOVB=OFF-C-0036
     */
    public void setPeriodUnit(java.lang.String periodUnit) {
        this.periodUnit = periodUnit;
    }

    /**
     * 获取 有效期时间单位。LOVB=OFF-C-0036
     */
    public java.lang.String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * 设置 有效期时长
     */
    public void setPeriodTime(java.lang.Integer periodTime) {
        this.periodTime = periodTime;
    }

    /**
     * 获取 有效期时长
     */
    public java.lang.Integer getPeriodTime() {
        return this.periodTime;
    }

    /**
     * 设置 有效期修正方式。LOVB=OFF-C-0035
     */
    public void setAdjustType(java.lang.String adjustType) {
        this.adjustType = adjustType;
    }

    /**
     * 获取 有效期修正方式。LOVB=OFF-C-0035
     */
    public java.lang.String getAdjustType() {
        return this.adjustType;
    }

    /**
     * 设置 体验期类型，LOVB=OFF-C-0041
     */
    public void setTrialType(java.lang.Integer trialType) {
        this.trialType = trialType;
    }

    /**
     * 获取 体验期类型，LOVB=OFF-C-0041
     */
    public java.lang.Integer getTrialType() {
        return this.trialType;
    }

    /**
     * 设置 体验期时间单位，LOVB=OFF-C-0042
     */
    public void setTrialPeriodUnit(java.lang.String trialPeriodUnit) {
        this.trialPeriodUnit = trialPeriodUnit;
    }

    /**
     * 获取 体验期时间单位，LOVB=OFF-C-0042
     */
    public java.lang.String getTrialPeriodUnit() {
        return this.trialPeriodUnit;
    }

    /**
     * 设置 体验期时长
     */
    public void setTrialPeriodTime(java.lang.Integer trialPeriodTime) {
        this.trialPeriodTime = trialPeriodTime;
    }

    /**
     * 获取 体验期时长
     */
    public java.lang.Integer getTrialPeriodTime() {
        return this.trialPeriodTime;
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
     * 设置 是否默认
     */
    public void setIsDefault(java.lang.Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取 是否默认
     */
    public java.lang.Integer getIsDefault() {
        return this.isDefault;
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
