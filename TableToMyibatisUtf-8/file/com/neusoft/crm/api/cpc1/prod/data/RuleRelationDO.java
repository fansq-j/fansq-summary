package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则关系	
 * @实体表  :RULE_RELATION
 */
public class RuleRelationDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_RELATION_S";

    /**
     * 主键
     */
    public java.lang.Long ruleRelationId;

    /**
     * 用于唯一标识规则的内部编号
     */
    public java.lang.Long aRuleId;

    /**
     * 用于唯一标识规则的内部编号
     */
    public java.lang.Long zRuleId;

    /**
     * 关系类型：01包含
     */
    public java.lang.String relationType;

    /**
     * 设置 主键
     */
    public void setRuleRelationId(java.lang.Long ruleRelationId) {
        this.ruleRelationId = ruleRelationId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getRuleRelationId() {
        return this.ruleRelationId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleRelationId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleRelationId;
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
    public void setARuleId(java.lang.Long aRuleId) {
        this.aRuleId = aRuleId;
    }

    /**
     * 获取 用于唯一标识规则的内部编号
     */
    public java.lang.Long getARuleId() {
        return this.aRuleId;
    }

    /**
     * 设置 用于唯一标识规则的内部编号
     */
    public void setZRuleId(java.lang.Long zRuleId) {
        this.zRuleId = zRuleId;
    }

    /**
     * 获取 用于唯一标识规则的内部编号
     */
    public java.lang.Long getZRuleId() {
        return this.zRuleId;
    }

    /**
     * 设置 关系类型：01包含
     */
    public void setRelationType(java.lang.String relationType) {
        this.relationType = relationType;
    }

    /**
     * 获取 关系类型：01包含
     */
    public java.lang.String getRelationType() {
        return this.relationType;
    }

}
