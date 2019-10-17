package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品实例或销售品实例下各种量本类型的当前值。
 * @实体表  :ACCUMULATION
 */
public class AccumulationDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCUMULATION_S";

    /**
     * 量本标识
     */
    public java.lang.Long accuId;

    /**
     * 销售品实例标识
     */
    public java.lang.Long offerInstId;

    /**
     * 量本类型标识
     */
    public java.lang.Integer accuTypeId;

    /**
     * LOVB=PRC-C-0004
     */
    public java.lang.String objType;

    /**
     * 属主标识
     */
    public java.lang.Long objId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 这个包括转赠，转化，优惠赠送。
     */
    public java.lang.Long otherSourceVal;

    /**
     * 只包括套餐的赠送额。
     */
    public java.lang.Long initVal;

    /**
     * 量本剩余值
     */
    public java.lang.Long accuVal;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

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
     * 设置 量本标识
     */
    public void setAccuId(java.lang.Long accuId) {
        this.accuId = accuId;
    }

    /**
     * 获取 量本标识
     */
    public java.lang.Long getAccuId() {
        return this.accuId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accuId = SeqUtils.createLongId(ID_SEQ);
         return this.accuId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品实例标识
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 销售品实例标识
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 量本类型标识
     */
    public void setAccuTypeId(java.lang.Integer accuTypeId) {
        this.accuTypeId = accuTypeId;
    }

    /**
     * 获取 量本类型标识
     */
    public java.lang.Integer getAccuTypeId() {
        return this.accuTypeId;
    }

    /**
     * 设置 LOVB=PRC-C-0004
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 LOVB=PRC-C-0004
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 属主标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 属主标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
     * 设置 这个包括转赠，转化，优惠赠送。
     */
    public void setOtherSourceVal(java.lang.Long otherSourceVal) {
        this.otherSourceVal = otherSourceVal;
    }

    /**
     * 获取 这个包括转赠，转化，优惠赠送。
     */
    public java.lang.Long getOtherSourceVal() {
        return this.otherSourceVal;
    }

    /**
     * 设置 只包括套餐的赠送额。
     */
    public void setInitVal(java.lang.Long initVal) {
        this.initVal = initVal;
    }

    /**
     * 获取 只包括套餐的赠送额。
     */
    public java.lang.Long getInitVal() {
        return this.initVal;
    }

    /**
     * 设置 量本剩余值
     */
    public void setAccuVal(java.lang.Long accuVal) {
        this.accuVal = accuVal;
    }

    /**
     * 获取 量本剩余值
     */
    public java.lang.Long getAccuVal() {
        return this.accuVal;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
