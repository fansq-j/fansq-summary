package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则事件规则
 * @实体表  :RULE_EVENT_RULE
 */
public class RuleEventRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_EVENT_RULE_S";

    /**
     * 主键
     */
    public java.lang.Long ruleEventRuleId;

    /**
     * 用于唯一标识规则事件的内部编号
     */
    public java.lang.Long ruleEventId;

    /**
     * 用于唯一标识规则的内部编号
     */
    public java.lang.Long ruleId;

    /**
     * 设置 主键
     */
    public void setRuleEventRuleId(java.lang.Long ruleEventRuleId) {
        this.ruleEventRuleId = ruleEventRuleId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getRuleEventRuleId() {
        return this.ruleEventRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleEventRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleEventRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 用于唯一标识规则事件的内部编号
     */
    public void setRuleEventId(java.lang.Long ruleEventId) {
        this.ruleEventId = ruleEventId;
    }

    /**
     * 获取 用于唯一标识规则事件的内部编号
     */
    public java.lang.Long getRuleEventId() {
        return this.ruleEventId;
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

}
