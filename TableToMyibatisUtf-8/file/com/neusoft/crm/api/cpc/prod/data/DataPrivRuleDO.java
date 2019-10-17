package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录权限下相关联的规则，包括横向、纵向的数据维度。

 * @实体表  :DATA_PRIV_RULE
 */
public class DataPrivRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DATA_PRIV_RULE_S";

    /**
     * 权限规则标识,主键
     */
    public java.lang.Long privRuleId;

    /**
     * 权限功能关联标识,主键
     */
    public java.lang.Long privDataRelId;

    /**
     * 业务对象标识
     */
    public java.lang.Long busiObjId;

    /**
     * 业务对象属性标识
     */
    public java.lang.Long busiObjAttrId;

    /**
     * 规则组,同组之间为"与"，组与组之间为"或"
     */
    public java.lang.Integer ruleGroup;

    /**
     * 规则操作符,包含、等于、大于、大于等于、小于、小于等于
     */
    public java.lang.String ruleOperator;

    /**
     * 属性值,同一权限的同一业务对象属性标识的多个取值,可用逗号间隔
     */
    public java.lang.String attrValue;

    /**
     * 规则操作类型，操作（所有）、查看（列）、取值（行）。LOVB=STF-C-0018。
     */
    public java.lang.String operType;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 权限规则标识,主键
     */
    public void setPrivRuleId(java.lang.Long privRuleId) {
        this.privRuleId = privRuleId;
    }

    /**
     * 获取 权限规则标识,主键
     */
    public java.lang.Long getPrivRuleId() {
        return this.privRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.privRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.privRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 权限功能关联标识,主键
     */
    public void setPrivDataRelId(java.lang.Long privDataRelId) {
        this.privDataRelId = privDataRelId;
    }

    /**
     * 获取 权限功能关联标识,主键
     */
    public java.lang.Long getPrivDataRelId() {
        return this.privDataRelId;
    }

    /**
     * 设置 业务对象标识
     */
    public void setBusiObjId(java.lang.Long busiObjId) {
        this.busiObjId = busiObjId;
    }

    /**
     * 获取 业务对象标识
     */
    public java.lang.Long getBusiObjId() {
        return this.busiObjId;
    }

    /**
     * 设置 业务对象属性标识
     */
    public void setBusiObjAttrId(java.lang.Long busiObjAttrId) {
        this.busiObjAttrId = busiObjAttrId;
    }

    /**
     * 获取 业务对象属性标识
     */
    public java.lang.Long getBusiObjAttrId() {
        return this.busiObjAttrId;
    }

    /**
     * 设置 规则组,同组之间为"与"，组与组之间为"或"
     */
    public void setRuleGroup(java.lang.Integer ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    /**
     * 获取 规则组,同组之间为"与"，组与组之间为"或"
     */
    public java.lang.Integer getRuleGroup() {
        return this.ruleGroup;
    }

    /**
     * 设置 规则操作符,包含、等于、大于、大于等于、小于、小于等于
     */
    public void setRuleOperator(java.lang.String ruleOperator) {
        this.ruleOperator = ruleOperator;
    }

    /**
     * 获取 规则操作符,包含、等于、大于、大于等于、小于、小于等于
     */
    public java.lang.String getRuleOperator() {
        return this.ruleOperator;
    }

    /**
     * 设置 属性值,同一权限的同一业务对象属性标识的多个取值,可用逗号间隔
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 属性值,同一权限的同一业务对象属性标识的多个取值,可用逗号间隔
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 规则操作类型，操作（所有）、查看（列）、取值（行）。LOVB=STF-C-0018。
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 规则操作类型，操作（所有）、查看（列）、取值（行）。LOVB=STF-C-0018。
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

}
