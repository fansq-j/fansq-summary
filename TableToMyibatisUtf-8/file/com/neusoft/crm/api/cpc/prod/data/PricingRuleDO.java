package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定价域中用于定义执行某种定价规则中所包含的条件。在定价段落中，引用定价判断条件来确定如何搜索资费标准或优惠计算。
                                 -&
 * @实体表  :PRICING_RULE
 */
public class PricingRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_RULE_S";

    /**
     * 定价判断条件的标识
     */
    public java.lang.Integer pricingRuleId;

    /**
     * LOVB=PRC-C-0035
            
     */
    public java.lang.String objType;

    /**
     * 对象标识
     */
    public java.lang.Integer objId;

    /**
     * 条件运算符的标识
     */
    public java.lang.Integer operatorId;

    /**
     * 定价段落的标识
     */
    public java.lang.Integer pricingSectionId;

    /**
     * 参考值标识。条件判断的右值。
     */
    public java.lang.Integer resultRefValueId;

    /**
     * 用于实现与、或操作（同组为与，异组为或）
     */
    public java.lang.Integer groupId;

    /**
     * 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 定价判断条件的标识
     */
    public void setPricingRuleId(java.lang.Integer pricingRuleId) {
        this.pricingRuleId = pricingRuleId;
    }

    /**
     * 获取 定价判断条件的标识
     */
    public java.lang.Integer getPricingRuleId() {
        return this.pricingRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingRuleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 LOVB=PRC-C-0035
            
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 LOVB=PRC-C-0035
            
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象标识
     */
    public void setObjId(java.lang.Integer objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识
     */
    public java.lang.Integer getObjId() {
        return this.objId;
    }

    /**
     * 设置 条件运算符的标识
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取 条件运算符的标识
     */
    public java.lang.Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * 设置 定价段落的标识
     */
    public void setPricingSectionId(java.lang.Integer pricingSectionId) {
        this.pricingSectionId = pricingSectionId;
    }

    /**
     * 获取 定价段落的标识
     */
    public java.lang.Integer getPricingSectionId() {
        return this.pricingSectionId;
    }

    /**
     * 设置 参考值标识。条件判断的右值。
     */
    public void setResultRefValueId(java.lang.Integer resultRefValueId) {
        this.resultRefValueId = resultRefValueId;
    }

    /**
     * 获取 参考值标识。条件判断的右值。
     */
    public java.lang.Integer getResultRefValueId() {
        return this.resultRefValueId;
    }

    /**
     * 设置 用于实现与、或操作（同组为与，异组为或）
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 用于实现与、或操作（同组为与，异组为或）
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
