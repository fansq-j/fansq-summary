package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义定价计划的几种具体关系。
 * @实体表  :PRICING_PLAN_REL
 */
public class PricingPlanRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_PLAN_REL_S";

    /**
     * 定价计划关系标识
     */
    public java.lang.Integer pricingPlanRelId;

    /**
     * 定价计划的标识. 
     */
    public java.lang.Integer aPricingPlanId;

    /**
     * Z端定价计划标识
     */
    public java.lang.Integer zPricingPlanId;

    /**
     * 1-构成   2-互斥
            当为构成关系时，A端为定价包，Z端为定价计划。 当为互斥关系时，A,Z端均为定价计划
            LOVB=PRC-C-0020.
     */
    public java.lang.String relType;

    /**
     * 状态.LOVB=PRC-C-0026.
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
     * 
     */
    public java.util.Date effDate;

    /**
     * 
     */
    public java.util.Date expDate;

    /**
     * 设置 定价计划关系标识
     */
    public void setPricingPlanRelId(java.lang.Integer pricingPlanRelId) {
        this.pricingPlanRelId = pricingPlanRelId;
    }

    /**
     * 获取 定价计划关系标识
     */
    public java.lang.Integer getPricingPlanRelId() {
        return this.pricingPlanRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingPlanRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingPlanRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 定价计划的标识. 
     */
    public void setAPricingPlanId(java.lang.Integer aPricingPlanId) {
        this.aPricingPlanId = aPricingPlanId;
    }

    /**
     * 获取 定价计划的标识. 
     */
    public java.lang.Integer getAPricingPlanId() {
        return this.aPricingPlanId;
    }

    /**
     * 设置 Z端定价计划标识
     */
    public void setZPricingPlanId(java.lang.Integer zPricingPlanId) {
        this.zPricingPlanId = zPricingPlanId;
    }

    /**
     * 获取 Z端定价计划标识
     */
    public java.lang.Integer getZPricingPlanId() {
        return this.zPricingPlanId;
    }

    /**
     * 设置 1-构成   2-互斥
            当为构成关系时，A端为定价包，Z端为定价计划。 当为互斥关系时，A,Z端均为定价计划
            LOVB=PRC-C-0020.
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 1-构成   2-互斥
            当为构成关系时，A端为定价包，Z端为定价计划。 当为互斥关系时，A,Z端均为定价计划
            LOVB=PRC-C-0020.
     */
    public java.lang.String getRelType() {
        return this.relType;
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

    /**
     * 设置 
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

}
