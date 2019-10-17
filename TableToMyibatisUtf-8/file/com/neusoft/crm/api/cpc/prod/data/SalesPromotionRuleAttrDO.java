package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:促销规则属性值记录表
 * @实体表  :SALES_PROMOTION_RULE_ATTR
 */
public class SalesPromotionRuleAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALES_PROMOTION_RULE_ATTR_S";

    /**
     * 促销规则属性主键
     */
    public java.lang.Integer salesPromotionRuleAttrId;

    /**
     * 促销规则主键
     */
    public java.lang.Integer salesPromotionRuleId;

    /**
     * 属性值
     */
    public java.lang.String ruleAttrValue;

    /**
     * 促销规则属性标识
     */
    public java.lang.String ruleAttrId;

    /**
     * 属性值名称
     */
    public java.lang.String ruleAttrValueName;

    /**
     * 设置 促销规则属性主键
     */
    public void setSalesPromotionRuleAttrId(java.lang.Integer salesPromotionRuleAttrId) {
        this.salesPromotionRuleAttrId = salesPromotionRuleAttrId;
    }

    /**
     * 获取 促销规则属性主键
     */
    public java.lang.Integer getSalesPromotionRuleAttrId() {
        return this.salesPromotionRuleAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.salesPromotionRuleAttrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.salesPromotionRuleAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 促销规则主键
     */
    public void setSalesPromotionRuleId(java.lang.Integer salesPromotionRuleId) {
        this.salesPromotionRuleId = salesPromotionRuleId;
    }

    /**
     * 获取 促销规则主键
     */
    public java.lang.Integer getSalesPromotionRuleId() {
        return this.salesPromotionRuleId;
    }

    /**
     * 设置 属性值
     */
    public void setRuleAttrValue(java.lang.String ruleAttrValue) {
        this.ruleAttrValue = ruleAttrValue;
    }

    /**
     * 获取 属性值
     */
    public java.lang.String getRuleAttrValue() {
        return this.ruleAttrValue;
    }

    /**
     * 设置 促销规则属性标识
     */
    public void setRuleAttrId(java.lang.String ruleAttrId) {
        this.ruleAttrId = ruleAttrId;
    }

    /**
     * 获取 促销规则属性标识
     */
    public java.lang.String getRuleAttrId() {
        return this.ruleAttrId;
    }

    /**
     * 设置 属性值名称
     */
    public void setRuleAttrValueName(java.lang.String ruleAttrValueName) {
        this.ruleAttrValueName = ruleAttrValueName;
    }

    /**
     * 获取 属性值名称
     */
    public java.lang.String getRuleAttrValueName() {
        return this.ruleAttrValueName;
    }

}
