package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:量本对象实例. 流量卡和量本转换转赠时要维护。批价时，通过该表找到对应的定价计划，并执行该定价计划下的量本扣减策略。
 * @实体表  :ACCU_OBJECT_INST
 */
public class AccuObjectInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCU_OBJECT_INST_S";

    /**
     * 量本对象实例标识
     */
    public java.lang.Long accuObjectInstId;

    /**
     * LOVB=PRC-C-0004
     */
    public java.lang.String objType;

    /**
     * 对象标识
     */
    public java.lang.String objId;

    /**
     * 量本类型标识
     */
    public java.lang.Integer accuTypeId;

    /**
     * 定价计划标识，用于定义转换转赠后目标对象使用量本时的定价计划
     */
    public java.lang.Integer pricingPlanId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 量本对象实例标识
     */
    public void setAccuObjectInstId(java.lang.Long accuObjectInstId) {
        this.accuObjectInstId = accuObjectInstId;
    }

    /**
     * 获取 量本对象实例标识
     */
    public java.lang.Long getAccuObjectInstId() {
        return this.accuObjectInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accuObjectInstId = SeqUtils.createLongId(ID_SEQ);
         return this.accuObjectInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 对象标识
     */
    public void setObjId(java.lang.String objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识
     */
    public java.lang.String getObjId() {
        return this.objId;
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
     * 设置 定价计划标识，用于定义转换转赠后目标对象使用量本时的定价计划
     */
    public void setPricingPlanId(java.lang.Integer pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    /**
     * 获取 定价计划标识，用于定义转换转赠后目标对象使用量本时的定价计划
     */
    public java.lang.Integer getPricingPlanId() {
        return this.pricingPlanId;
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
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
