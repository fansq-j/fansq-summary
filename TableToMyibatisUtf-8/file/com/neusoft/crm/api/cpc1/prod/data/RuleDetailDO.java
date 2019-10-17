package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则详情	
 * @实体表  :RULE_DETAIL
 */
public class RuleDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_DETAIL_S";

    /**
     * 主键
     */
    public java.lang.Long ruleDetailId;

    /**
     * 规则ID
     */
    public java.lang.Long ruleId;

    /**
     * 规则详情描述
     */
    public java.lang.String comments;

    /**
     * 设置 主键
     */
    public void setRuleDetailId(java.lang.Long ruleDetailId) {
        this.ruleDetailId = ruleDetailId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getRuleDetailId() {
        return this.ruleDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 规则ID
     */
    public void setRuleId(java.lang.Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取 规则ID
     */
    public java.lang.Long getRuleId() {
        return this.ruleId;
    }

    /**
     * 设置 规则详情描述
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 规则详情描述
     */
    public java.lang.String getComments() {
        return this.comments;
    }

}
