package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于定义促销活动资费的判断条件，一般在条件成立时决定一种资费
 * @实体表  :PROMOTIONAL_ACT_TARIFF_RULE
 */
public class PromotionalActTariffRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROMOTIONAL_ACT_TARIFF_RULE_S";

    /**
     * 促销活动资费条件标识
     */
    public java.lang.Integer promActiRuleId;

    /**
     * 参考对象标识
     */
    public java.lang.Integer actiRefObjectId;

    /**
     * 促销活动资费标识
     */
    public java.lang.Integer promActiTariffId;

    /**
     * 条件运算符的标识
     */
    public java.lang.Integer operatorId;

    /**
     * 参考值标识。条件判断的右值。
     */
    public java.lang.Integer resultRefValue;

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
     * 设置 促销活动资费条件标识
     */
    public void setPromActiRuleId(java.lang.Integer promActiRuleId) {
        this.promActiRuleId = promActiRuleId;
    }

    /**
     * 获取 促销活动资费条件标识
     */
    public java.lang.Integer getPromActiRuleId() {
        return this.promActiRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.promActiRuleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.promActiRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 参考对象标识
     */
    public void setActiRefObjectId(java.lang.Integer actiRefObjectId) {
        this.actiRefObjectId = actiRefObjectId;
    }

    /**
     * 获取 参考对象标识
     */
    public java.lang.Integer getActiRefObjectId() {
        return this.actiRefObjectId;
    }

    /**
     * 设置 促销活动资费标识
     */
    public void setPromActiTariffId(java.lang.Integer promActiTariffId) {
        this.promActiTariffId = promActiTariffId;
    }

    /**
     * 获取 促销活动资费标识
     */
    public java.lang.Integer getPromActiTariffId() {
        return this.promActiTariffId;
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
     * 设置 参考值标识。条件判断的右值。
     */
    public void setResultRefValue(java.lang.Integer resultRefValue) {
        this.resultRefValue = resultRefValue;
    }

    /**
     * 获取 参考值标识。条件判断的右值。
     */
    public java.lang.Integer getResultRefValue() {
        return this.resultRefValue;
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
