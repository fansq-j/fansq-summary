package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表达酬金方案与结算对象的对应关系，对象类型可以是代理商、网点、工号等，一个合作伙伴可以有一到多个酬金方案
 * @实体表  :SETT_OFFER_INSTANCE
 */
public class SettOfferInstanceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_OFFER_INSTANCE_S";

    /**
     * 合作伙伴佣金方案实例标识
     */
    public java.lang.Long settOfferInstId;

    /**
     * 结算对象类型,LOVB=ACC-C-0235
            1		员工
            2		网点/渠道
            3		代理商
            4		供应商
            
     */
    public java.lang.Integer objType;

    /**
     * 结算对象标识
     */
    public java.lang.Integer objId;

    /**
     * 合作伙伴方案标识
     */
    public java.lang.Long settOfferId;

    /**
     * 高额计划标识
     */
    public java.lang.Long highfeePlanId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 归属本地网
     */
    public java.lang.Integer lanId;

    /**
     * LOVB=PRC-C-0026
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
     * 设置 合作伙伴佣金方案实例标识
     */
    public void setSettOfferInstId(java.lang.Long settOfferInstId) {
        this.settOfferInstId = settOfferInstId;
    }

    /**
     * 获取 合作伙伴佣金方案实例标识
     */
    public java.lang.Long getSettOfferInstId() {
        return this.settOfferInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settOfferInstId = SeqUtils.createLongId(ID_SEQ);
         return this.settOfferInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 结算对象类型,LOVB=ACC-C-0235
            1		员工
            2		网点/渠道
            3		代理商
            4		供应商
            
     */
    public void setObjType(java.lang.Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取 结算对象类型,LOVB=ACC-C-0235
            1		员工
            2		网点/渠道
            3		代理商
            4		供应商
            
     */
    public java.lang.Integer getObjType() {
        return this.objType;
    }

    /**
     * 设置 结算对象标识
     */
    public void setObjId(java.lang.Integer objId) {
        this.objId = objId;
    }

    /**
     * 获取 结算对象标识
     */
    public java.lang.Integer getObjId() {
        return this.objId;
    }

    /**
     * 设置 合作伙伴方案标识
     */
    public void setSettOfferId(java.lang.Long settOfferId) {
        this.settOfferId = settOfferId;
    }

    /**
     * 获取 合作伙伴方案标识
     */
    public java.lang.Long getSettOfferId() {
        return this.settOfferId;
    }

    /**
     * 设置 高额计划标识
     */
    public void setHighfeePlanId(java.lang.Long highfeePlanId) {
        this.highfeePlanId = highfeePlanId;
    }

    /**
     * 获取 高额计划标识
     */
    public java.lang.Long getHighfeePlanId() {
        return this.highfeePlanId;
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
     * 设置 归属本地网
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 归属本地网
     */
    public java.lang.Integer getLanId() {
        return this.lanId;
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
