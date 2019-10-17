package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则事件
 * @实体表  :RULE_EVENT
 */
public class RuleEventDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_EVENT_S";

    /**
     * 用于唯一标识规则事件的内部编号
     */
    public java.lang.Long ruleEventId;

    /**
     * 01原子规则事件，02组合规则事件
     */
    public java.lang.String ruleEventType;

    /**
     * 规则事件名称
     */
    public java.lang.String ruleEventName;

    /**
     * 描述
     */
    public java.lang.String comments;

    /**
     * 
     */
    public java.lang.Long ppmRuleEventId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态的变更时间
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleEventId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleEventId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 01原子规则事件，02组合规则事件
     */
    public void setRuleEventType(java.lang.String ruleEventType) {
        this.ruleEventType = ruleEventType;
    }

    /**
     * 获取 01原子规则事件，02组合规则事件
     */
    public java.lang.String getRuleEventType() {
        return this.ruleEventType;
    }

    /**
     * 设置 规则事件名称
     */
    public void setRuleEventName(java.lang.String ruleEventName) {
        this.ruleEventName = ruleEventName;
    }

    /**
     * 获取 规则事件名称
     */
    public java.lang.String getRuleEventName() {
        return this.ruleEventName;
    }

    /**
     * 设置 描述
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 描述
     */
    public java.lang.String getComments() {
        return this.comments;
    }

    /**
     * 设置 
     */
    public void setPpmRuleEventId(java.lang.Long ppmRuleEventId) {
        this.ppmRuleEventId = ppmRuleEventId;
    }

    /**
     * 获取 
     */
    public java.lang.Long getPpmRuleEventId() {
        return this.ppmRuleEventId;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态的变更时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的变更时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

}
