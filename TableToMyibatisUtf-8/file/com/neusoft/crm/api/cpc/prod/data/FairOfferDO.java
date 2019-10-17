package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:公允价值套餐定位
 * @实体表  :FAIR_OFFER
 */
public class FairOfferDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_OFFER_S";

    /**
     * 定位标识
     */
    public java.lang.Integer fairOfferId;

    /**
     * 套餐标识
     */
    public java.lang.Integer offerId;

    /**
     * 仅用于多个套餐共用一个OFFER_ID的情况（个别省份），用这个字段区别实际的多个套餐
     */
    public java.lang.Integer offerSeq;

    /**
     * LOVB=FAIR-C-0001
            0-直接配置套餐费
            1-取属性
            2-把产品租费加起来
            可扩展取值用于套餐费的不同取值方法
     */
    public java.lang.Integer valueFlag;

    /**
     * 如果“套餐费取值方法标识”字段VALUE_FLAG为0-直接配置套餐费，本字段填写套餐费的值。
            如果VALUE_FLAG为1-取属性，本字段填写offer_attr_id
     */
    public java.lang.Long fairPrice;

    /**
     * 套餐处理优先级
     */
    public java.lang.Integer priorityValue;

    /**
     * LOVB=PLC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 定位标识
     */
    public void setFairOfferId(java.lang.Integer fairOfferId) {
        this.fairOfferId = fairOfferId;
    }

    /**
     * 获取 定位标识
     */
    public java.lang.Integer getFairOfferId() {
        return this.fairOfferId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.fairOfferId = SeqUtils.createIntegerId(ID_SEQ);
         return this.fairOfferId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 套餐标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 套餐标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 仅用于多个套餐共用一个OFFER_ID的情况（个别省份），用这个字段区别实际的多个套餐
     */
    public void setOfferSeq(java.lang.Integer offerSeq) {
        this.offerSeq = offerSeq;
    }

    /**
     * 获取 仅用于多个套餐共用一个OFFER_ID的情况（个别省份），用这个字段区别实际的多个套餐
     */
    public java.lang.Integer getOfferSeq() {
        return this.offerSeq;
    }

    /**
     * 设置 LOVB=FAIR-C-0001
            0-直接配置套餐费
            1-取属性
            2-把产品租费加起来
            可扩展取值用于套餐费的不同取值方法
     */
    public void setValueFlag(java.lang.Integer valueFlag) {
        this.valueFlag = valueFlag;
    }

    /**
     * 获取 LOVB=FAIR-C-0001
            0-直接配置套餐费
            1-取属性
            2-把产品租费加起来
            可扩展取值用于套餐费的不同取值方法
     */
    public java.lang.Integer getValueFlag() {
        return this.valueFlag;
    }

    /**
     * 设置 如果“套餐费取值方法标识”字段VALUE_FLAG为0-直接配置套餐费，本字段填写套餐费的值。
            如果VALUE_FLAG为1-取属性，本字段填写offer_attr_id
     */
    public void setFairPrice(java.lang.Long fairPrice) {
        this.fairPrice = fairPrice;
    }

    /**
     * 获取 如果“套餐费取值方法标识”字段VALUE_FLAG为0-直接配置套餐费，本字段填写套餐费的值。
            如果VALUE_FLAG为1-取属性，本字段填写offer_attr_id
     */
    public java.lang.Long getFairPrice() {
        return this.fairPrice;
    }

    /**
     * 设置 套餐处理优先级
     */
    public void setPriorityValue(java.lang.Integer priorityValue) {
        this.priorityValue = priorityValue;
    }

    /**
     * 获取 套餐处理优先级
     */
    public java.lang.Integer getPriorityValue() {
        return this.priorityValue;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
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
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
