package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录销售品实例与营销类资源实例的关系（只针对实物资源建立关系，UIM卡不用建立关系）。
 * @实体表  :OFFER_RES_INST_REL
 */
public class OfferResInstRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_RES_INST_REL_S";

    /**
     * 记录销售品实例营销资源实例关系标识，主键。
     */
    public java.lang.Long offerResInstRelId;

    /**
     * 记录销售品实例标识，外键。
     */
    public java.lang.Long offerInstId;

    /**
     * 记录营销资源实例标识，外键。根据营销资源标识，指向不同的营销资源实例实体。
     */
    public java.lang.Long mktResInstId;

    /**
     * 记录营销资源标识。
     */
    public java.lang.Integer mktResId;

    /**
     * 记录该资源的使用产品实例，例如终端的的使用产品实例。
     */
    public java.lang.Long useProdInstId;

    /**
     * 记录关系类型，表达销售品同营销资源的关联方式，LOVB=PRI-C-0023
     */
    public java.lang.String relType;

    /**
     * 记录资源数量。
     */
    public java.lang.Integer mktResNum;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录销售品实例营销资源实例关系标识，主键。
     */
    public void setOfferResInstRelId(java.lang.Long offerResInstRelId) {
        this.offerResInstRelId = offerResInstRelId;
    }

    /**
     * 获取 记录销售品实例营销资源实例关系标识，主键。
     */
    public java.lang.Long getOfferResInstRelId() {
        return this.offerResInstRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerResInstRelId = SeqUtils.createLongId(ID_SEQ);
         return this.offerResInstRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录销售品实例标识，外键。
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 记录销售品实例标识，外键。
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 记录营销资源实例标识，外键。根据营销资源标识，指向不同的营销资源实例实体。
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 记录营销资源实例标识，外键。根据营销资源标识，指向不同的营销资源实例实体。
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 记录营销资源标识。
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 记录营销资源标识。
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 记录该资源的使用产品实例，例如终端的的使用产品实例。
     */
    public void setUseProdInstId(java.lang.Long useProdInstId) {
        this.useProdInstId = useProdInstId;
    }

    /**
     * 获取 记录该资源的使用产品实例，例如终端的的使用产品实例。
     */
    public java.lang.Long getUseProdInstId() {
        return this.useProdInstId;
    }

    /**
     * 设置 记录关系类型，表达销售品同营销资源的关联方式，LOVB=PRI-C-0023
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录关系类型，表达销售品同营销资源的关联方式，LOVB=PRI-C-0023
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录资源数量。
     */
    public void setMktResNum(java.lang.Integer mktResNum) {
        this.mktResNum = mktResNum;
    }

    /**
     * 获取 记录资源数量。
     */
    public java.lang.Integer getMktResNum() {
        return this.mktResNum;
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
     * 设置 记录创建的员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态修改的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
