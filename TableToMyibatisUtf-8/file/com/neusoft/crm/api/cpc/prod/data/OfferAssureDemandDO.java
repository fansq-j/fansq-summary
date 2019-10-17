package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录了销售品担保要求。
 * @实体表  :OFFER_ASSURE_DEMAND
 */
public class OfferAssureDemandDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_ASSURE_DEMAND_S";

    /**
     * 销售品担保要求ID的标识，主键
     */
    public java.lang.Long offerAssureDmdId;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * 记录担保内容。
     */
    public java.lang.String assureDesc;

    /**
     * 记录担保值。
     */
    public java.lang.Integer assureValue;

    /**
     * 记录销售品的担保类型，LOVB=OFF-C-0002
     */
    public java.lang.String assureType;

    /**
     * 记录担保时长。
     */
    public java.lang.Long assureDur;

    /**
     * 合帐类型，如：担保对象和被担保对象是否在同一个合同号付费。LOVB=OFF-C-0059
     */
    public java.lang.String mergeType;

    /**
     * 记录担保数量。
     */
    public java.lang.Long assureNum;

    /**
     * 公共管理区域标识
     */
    public java.lang.Long regionId;

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
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品担保要求ID的标识，主键
     */
    public void setOfferAssureDmdId(java.lang.Long offerAssureDmdId) {
        this.offerAssureDmdId = offerAssureDmdId;
    }

    /**
     * 获取 销售品担保要求ID的标识，主键
     */
    public java.lang.Long getOfferAssureDmdId() {
        return this.offerAssureDmdId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerAssureDmdId = SeqUtils.createLongId(ID_SEQ);
         return this.offerAssureDmdId;
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
     * 设置 记录担保内容。
     */
    public void setAssureDesc(java.lang.String assureDesc) {
        this.assureDesc = assureDesc;
    }

    /**
     * 获取 记录担保内容。
     */
    public java.lang.String getAssureDesc() {
        return this.assureDesc;
    }

    /**
     * 设置 记录担保值。
     */
    public void setAssureValue(java.lang.Integer assureValue) {
        this.assureValue = assureValue;
    }

    /**
     * 获取 记录担保值。
     */
    public java.lang.Integer getAssureValue() {
        return this.assureValue;
    }

    /**
     * 设置 记录销售品的担保类型，LOVB=OFF-C-0002
     */
    public void setAssureType(java.lang.String assureType) {
        this.assureType = assureType;
    }

    /**
     * 获取 记录销售品的担保类型，LOVB=OFF-C-0002
     */
    public java.lang.String getAssureType() {
        return this.assureType;
    }

    /**
     * 设置 记录担保时长。
     */
    public void setAssureDur(java.lang.Long assureDur) {
        this.assureDur = assureDur;
    }

    /**
     * 获取 记录担保时长。
     */
    public java.lang.Long getAssureDur() {
        return this.assureDur;
    }

    /**
     * 设置 合帐类型，如：担保对象和被担保对象是否在同一个合同号付费。LOVB=OFF-C-0059
     */
    public void setMergeType(java.lang.String mergeType) {
        this.mergeType = mergeType;
    }

    /**
     * 获取 合帐类型，如：担保对象和被担保对象是否在同一个合同号付费。LOVB=OFF-C-0059
     */
    public java.lang.String getMergeType() {
        return this.mergeType;
    }

    /**
     * 设置 记录担保数量。
     */
    public void setAssureNum(java.lang.Long assureNum) {
        this.assureNum = assureNum;
    }

    /**
     * 获取 记录担保数量。
     */
    public java.lang.Long getAssureNum() {
        return this.assureNum;
    }

    /**
     * 设置 公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
