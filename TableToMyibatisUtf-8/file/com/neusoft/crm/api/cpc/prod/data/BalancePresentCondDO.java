package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述余额预存和赠送判断的条件。
 * @实体表  :BALANCE_PRESENT_COND
 */
public class BalancePresentCondDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_PRESENT_COND_S";

    /**
     * 记录余额预存赠判断条件的唯一编号。
     */
    public java.lang.Integer balancePresentCondId;

    /**
     * 赠送规则的标识
     */
    public java.lang.Integer presentRuleId;

    /**
     * 属性的类型，可以是销售品、充值渠道、产品等各种判断条件的左值. LOVB=ACC-C-0229
     */
    public java.lang.Integer attrType;

    /**
     * 属性标识
     */
    public java.lang.Long attrId;

    /**
     * 条件运算符标识
     */
    public java.lang.Integer operatorId;

    /**
     * 属性的取值，为判断条件的右值
     */
    public java.lang.String attrValue;

    /**
     * 条件的分组，同组内为AND的关系，不同组为OR关系
     */
    public java.lang.Integer groupId;

    /**
     * 归属区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态，LOVB=ACC-C-0002
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
     * 设置 记录余额预存赠判断条件的唯一编号。
     */
    public void setBalancePresentCondId(java.lang.Integer balancePresentCondId) {
        this.balancePresentCondId = balancePresentCondId;
    }

    /**
     * 获取 记录余额预存赠判断条件的唯一编号。
     */
    public java.lang.Integer getBalancePresentCondId() {
        return this.balancePresentCondId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.balancePresentCondId = SeqUtils.createIntegerId(ID_SEQ);
         return this.balancePresentCondId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 赠送规则的标识
     */
    public void setPresentRuleId(java.lang.Integer presentRuleId) {
        this.presentRuleId = presentRuleId;
    }

    /**
     * 获取 赠送规则的标识
     */
    public java.lang.Integer getPresentRuleId() {
        return this.presentRuleId;
    }

    /**
     * 设置 属性的类型，可以是销售品、充值渠道、产品等各种判断条件的左值. LOVB=ACC-C-0229
     */
    public void setAttrType(java.lang.Integer attrType) {
        this.attrType = attrType;
    }

    /**
     * 获取 属性的类型，可以是销售品、充值渠道、产品等各种判断条件的左值. LOVB=ACC-C-0229
     */
    public java.lang.Integer getAttrType() {
        return this.attrType;
    }

    /**
     * 设置 属性标识
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 属性标识
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 条件运算符标识
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取 条件运算符标识
     */
    public java.lang.Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * 设置 属性的取值，为判断条件的右值
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 属性的取值，为判断条件的右值
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 条件的分组，同组内为AND的关系，不同组为OR关系
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 条件的分组，同组内为AND的关系，不同组为OR关系
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
    }

    /**
     * 设置 归属区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
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
