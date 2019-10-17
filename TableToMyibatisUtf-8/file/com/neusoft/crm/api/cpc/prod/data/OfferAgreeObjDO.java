package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:特指销售品协议项适用或作用的对象，包括客户、帐户、产品实例、银行帐号等信息。
 * @实体表  :OFFER_AGREE_OBJ
 */
public class OfferAgreeObjDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_AGREE_OBJ_S";

    /**
     * 销售品协议项使用对象标识
     */
    public java.lang.Long offerAgreeObjId;

    /**
     * 销售品协议项标识
     */
    public java.lang.Long offerAgreeId;

    /**
     * 协议项适用对象类型，LOVB=ARG-C-0016
     */
    public java.lang.String objType;

    /**
     * 业务对象标识
     */
    public java.lang.Long busiObjId;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 销售品协议项使用对象标识
     */
    public void setOfferAgreeObjId(java.lang.Long offerAgreeObjId) {
        this.offerAgreeObjId = offerAgreeObjId;
    }

    /**
     * 获取 销售品协议项使用对象标识
     */
    public java.lang.Long getOfferAgreeObjId() {
        return this.offerAgreeObjId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerAgreeObjId = SeqUtils.createLongId(ID_SEQ);
         return this.offerAgreeObjId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品协议项标识
     */
    public void setOfferAgreeId(java.lang.Long offerAgreeId) {
        this.offerAgreeId = offerAgreeId;
    }

    /**
     * 获取 销售品协议项标识
     */
    public java.lang.Long getOfferAgreeId() {
        return this.offerAgreeId;
    }

    /**
     * 设置 协议项适用对象类型，LOVB=ARG-C-0016
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 协议项适用对象类型，LOVB=ARG-C-0016
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 业务对象标识
     */
    public void setBusiObjId(java.lang.Long busiObjId) {
        this.busiObjId = busiObjId;
    }

    /**
     * 获取 业务对象标识
     */
    public java.lang.Long getBusiObjId() {
        return this.busiObjId;
    }

    /**
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
