package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销资源定价矩阵，定义营销资源的在不同属性取值下的最终价格

 * @实体表  :MKT_PRICING_ARRAY
 */
public class MktPricingArrayDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_PRICING_ARRAY_S";

    /**
     * 营销资源定价矩阵的标识，主键
     */
    public java.lang.Integer mktPricingArrayId;

    /**
     * 营销资源定价计划的标识
     */
    public java.lang.Integer mktPricingPlanId;

    /**
     * 定价属性的取值列表，采用字符串方式表达，
            可按如下方式：
            属性ID1，取值A1，属性ID2，取值B2.。。。
            
            逗号作为分割符
     */
    public java.lang.String attrValueList;

    /**
     * 营销资源的标准价格
     */
    public java.lang.Long pricing;

    /**
     * 营销资源的VIP价格
     */
    public java.lang.Long vipPricing;

    /**
     * 税率配置标识
     */
    public java.lang.Integer mktTaxRateConfigId;

    /**
     * 记录的生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录的失效时间
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
     * 设置 营销资源定价矩阵的标识，主键
     */
    public void setMktPricingArrayId(java.lang.Integer mktPricingArrayId) {
        this.mktPricingArrayId = mktPricingArrayId;
    }

    /**
     * 获取 营销资源定价矩阵的标识，主键
     */
    public java.lang.Integer getMktPricingArrayId() {
        return this.mktPricingArrayId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.mktPricingArrayId = SeqUtils.createIntegerId(ID_SEQ);
         return this.mktPricingArrayId;
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
     * 设置 定价属性的取值列表，采用字符串方式表达，
            可按如下方式：
            属性ID1，取值A1，属性ID2，取值B2.。。。
            
            逗号作为分割符
     */
    public void setAttrValueList(java.lang.String attrValueList) {
        this.attrValueList = attrValueList;
    }

    /**
     * 获取 定价属性的取值列表，采用字符串方式表达，
            可按如下方式：
            属性ID1，取值A1，属性ID2，取值B2.。。。
            
            逗号作为分割符
     */
    public java.lang.String getAttrValueList() {
        return this.attrValueList;
    }

    /**
     * 设置 营销资源的标准价格
     */
    public void setPricing(java.lang.Long pricing) {
        this.pricing = pricing;
    }

    /**
     * 获取 营销资源的标准价格
     */
    public java.lang.Long getPricing() {
        return this.pricing;
    }

    /**
     * 设置 营销资源的VIP价格
     */
    public void setVipPricing(java.lang.Long vipPricing) {
        this.vipPricing = vipPricing;
    }

    /**
     * 获取 营销资源的VIP价格
     */
    public java.lang.Long getVipPricing() {
        return this.vipPricing;
    }

    /**
     * 设置 税率配置标识
     */
    public void setMktTaxRateConfigId(java.lang.Integer mktTaxRateConfigId) {
        this.mktTaxRateConfigId = mktTaxRateConfigId;
    }

    /**
     * 获取 税率配置标识
     */
    public java.lang.Integer getMktTaxRateConfigId() {
        return this.mktTaxRateConfigId;
    }

    /**
     * 设置 记录的生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录的生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录的失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录的失效时间
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
