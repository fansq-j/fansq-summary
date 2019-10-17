package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则事件成员	
 * @实体表  :RULE_EVENT_MEMBER
 */
public class RuleEventMemberDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_EVENT_MEMBER_S";

    /**
     * 主键
     */
    public java.lang.Long ruleEventMemberId;

    /**
     * 用于唯一标识规则事件的内部编号
     */
    public java.lang.Long ruleEventId;

    /**
     * 成员规则ID
     */
    public java.lang.Long subRuleEventId;

    /**
     * 设置 主键
     */
    public void setRuleEventMemberId(java.lang.Long ruleEventMemberId) {
        this.ruleEventMemberId = ruleEventMemberId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getRuleEventMemberId() {
        return this.ruleEventMemberId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleEventMemberId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleEventMemberId;
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
     * 设置 成员规则ID
     */
    public void setSubRuleEventId(java.lang.Long subRuleEventId) {
        this.subRuleEventId = subRuleEventId;
    }

    /**
     * 获取 成员规则ID
     */
    public java.lang.Long getSubRuleEventId() {
        return this.subRuleEventId;
    }

}
