package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义定价组合的几种具体关系。
 * @实体表  :PRICING_COMBINE_REL
 */
public class PricingCombineRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_COMBINE_REL_S";

    /**
     * 定价组合关系标识
     */
    public java.lang.Integer pricingCombineRelId;

    /**
     * A端定价组合的标识
     */
    public java.lang.Integer aPricingCombineId;

    /**
     * Z端定价组合标识
     */
    public java.lang.Integer zPricingCombineId;

    /**
     * 定价组合之间的关系。LOVB=PRC-C-0009
            
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
     * 设置 定价组合关系标识
     */
    public void setPricingCombineRelId(java.lang.Integer pricingCombineRelId) {
        this.pricingCombineRelId = pricingCombineRelId;
    }

    /**
     * 获取 定价组合关系标识
     */
    public java.lang.Integer getPricingCombineRelId() {
        return this.pricingCombineRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingCombineRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingCombineRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 A端定价组合的标识
     */
    public void setAPricingCombineId(java.lang.Integer aPricingCombineId) {
        this.aPricingCombineId = aPricingCombineId;
    }

    /**
     * 获取 A端定价组合的标识
     */
    public java.lang.Integer getAPricingCombineId() {
        return this.aPricingCombineId;
    }

    /**
     * 设置 Z端定价组合标识
     */
    public void setZPricingCombineId(java.lang.Integer zPricingCombineId) {
        this.zPricingCombineId = zPricingCombineId;
    }

    /**
     * 获取 Z端定价组合标识
     */
    public java.lang.Integer getZPricingCombineId() {
        return this.zPricingCombineId;
    }

    /**
     * 设置 定价组合之间的关系。LOVB=PRC-C-0009
            
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 定价组合之间的关系。LOVB=PRC-C-0009
            
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

}
