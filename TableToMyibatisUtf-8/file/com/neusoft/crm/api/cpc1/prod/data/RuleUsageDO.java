package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则适用
 * @实体表  :RULE_USAGE
 */
public class RuleUsageDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_USAGE_S";

    /**
     * 主键
     */
    public java.lang.Long ruleUsageId;

    /**
     * 用于唯一标识规则的内部编号
     */
    public java.lang.Long ruleId;

    /**
     * 1 适用,2 不适用
     */
    public java.lang.Integer usageType;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 区域代码
     */
    public java.lang.String areaId;

    /**
     * 产品大类
     */
    public java.lang.Integer serviceKind;

    /**
     * 产品id
     */
    public java.lang.Integer productId;

    /**
     * 服务提供
     */
    public java.lang.Long serviceOfferId;

    /**
     * 设置 主键
     */
    public void setRuleUsageId(java.lang.Long ruleUsageId) {
        this.ruleUsageId = ruleUsageId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getRuleUsageId() {
        return this.ruleUsageId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleUsageId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleUsageId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 用于唯一标识规则的内部编号
     */
    public void setRuleId(java.lang.Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取 用于唯一标识规则的内部编号
     */
    public java.lang.Long getRuleId() {
        return this.ruleId;
    }

    /**
     * 设置 1 适用,2 不适用
     */
    public void setUsageType(java.lang.Integer usageType) {
        this.usageType = usageType;
    }

    /**
     * 获取 1 适用,2 不适用
     */
    public java.lang.Integer getUsageType() {
        return this.usageType;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 区域代码
     */
    public void setAreaId(java.lang.String areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取 区域代码
     */
    public java.lang.String getAreaId() {
        return this.areaId;
    }

    /**
     * 设置 产品大类
     */
    public void setServiceKind(java.lang.Integer serviceKind) {
        this.serviceKind = serviceKind;
    }

    /**
     * 获取 产品大类
     */
    public java.lang.Integer getServiceKind() {
        return this.serviceKind;
    }

    /**
     * 设置 产品id
     */
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取 产品id
     */
    public java.lang.Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置 服务提供
     */
    public void setServiceOfferId(java.lang.Long serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供
     */
    public java.lang.Long getServiceOfferId() {
        return this.serviceOfferId;
    }

}
