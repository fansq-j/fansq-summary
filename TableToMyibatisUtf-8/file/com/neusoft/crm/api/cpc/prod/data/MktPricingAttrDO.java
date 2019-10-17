package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销资源定价属性，记录影响营销资源的属性信息，如颜色、容量等
 * @实体表  :MKT_PRICING_ATTR
 */
public class MktPricingAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_PRICING_ATTR_S";

    /**
     * 营销资源属性的标识
     */
    public java.lang.Integer pricingAttrId;

    /**
     * 营销资源定价计划的标识
     */
    public java.lang.Integer mktPricingPlanId;

    /**
     * 营销资源属性的编码，用于属性的管理
     */
    public java.lang.String mktResAttrId;

    /**
     * 营销资源属性的名称
     */
    public java.lang.String attrName;

    /**
     * 营销资源属性生效时间
     */
    public java.util.Date effDate;

    /**
     * 营销资源属性失效时间
     */
    public java.util.Date expDate;

    /**
     * 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 营销资源属性的标识
     */
    public void setPricingAttrId(java.lang.Integer pricingAttrId) {
        this.pricingAttrId = pricingAttrId;
    }

    /**
     * 获取 营销资源属性的标识
     */
    public java.lang.Integer getPricingAttrId() {
        return this.pricingAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingAttrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 营销资源定价计划的标识
     */
    public void setMktPricingPlanId(java.lang.Integer mktPricingPlanId) {
        this.mktPricingPlanId = mktPricingPlanId;
    }

    /**
     * 获取 营销资源定价计划的标识
     */
    public java.lang.Integer getMktPricingPlanId() {
        return this.mktPricingPlanId;
    }

    /**
     * 设置 营销资源属性的编码，用于属性的管理
     */
    public void setMktResAttrId(java.lang.String mktResAttrId) {
        this.mktResAttrId = mktResAttrId;
    }

    /**
     * 获取 营销资源属性的编码，用于属性的管理
     */
    public java.lang.String getMktResAttrId() {
        return this.mktResAttrId;
    }

    /**
     * 设置 营销资源属性的名称
     */
    public void setAttrName(java.lang.String attrName) {
        this.attrName = attrName;
    }

    /**
     * 获取 营销资源属性的名称
     */
    public java.lang.String getAttrName() {
        return this.attrName;
    }

    /**
     * 设置 营销资源属性生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 营销资源属性生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 营销资源属性失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 营销资源属性失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 普通记录状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
