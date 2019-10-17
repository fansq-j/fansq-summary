package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则表达式
 * @实体表  :RULE_EXPRESS
 */
public class RuleExpressDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_EXPRESS_S";

    /**
     * 主键
     */
    public java.lang.Long ruleExpressId;

    /**
     * 用于唯一标识规则的内部编号
     */
    public java.lang.Long ruleId;

    /**
     * 用于唯一标识表达式的内部编号
     */
    public java.lang.Long expressId;

    /**
     * 表达式角色：0条件，1动作
     */
    public java.lang.String roleType;

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
     * 设置 主键
     */
    public void setRuleExpressId(java.lang.Long ruleExpressId) {
        this.ruleExpressId = ruleExpressId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getRuleExpressId() {
        return this.ruleExpressId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleExpressId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleExpressId;
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
     * 设置 用于唯一标识表达式的内部编号
     */
    public void setExpressId(java.lang.Long expressId) {
        this.expressId = expressId;
    }

    /**
     * 获取 用于唯一标识表达式的内部编号
     */
    public java.lang.Long getExpressId() {
        return this.expressId;
    }

    /**
     * 设置 表达式角色：0条件，1动作
     */
    public void setRoleType(java.lang.String roleType) {
        this.roleType = roleType;
    }

    /**
     * 获取 表达式角色：0条件，1动作
     */
    public java.lang.String getRoleType() {
        return this.roleType;
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
