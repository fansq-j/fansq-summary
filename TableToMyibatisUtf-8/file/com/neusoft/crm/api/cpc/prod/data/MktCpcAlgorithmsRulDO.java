package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:需在算法中执行的CPC算法规则定义，通过该算法规则的运算，能够得出Customer-Product-Channel的运算
 * @实体表  :MKT_CPC_ALGORITHMS_RUL
 */
public class MktCpcAlgorithmsRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_CPC_ALGORITHMS_RUL_S";

    /**
     * 算法规则标识
     */
    public java.lang.Long algorithmsRulId;

    /**
     * 算法规则名称
     */
    public java.lang.String algorithmsRulName;

    /**
     * 规则描述
     */
    public java.lang.String ruleDesc;

    /**
     * 计算表达式
     */
    public java.lang.String ruleExpression;

    /**
     * 状态,LOVB=PUB-C-0001
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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 算法规则标识
     */
    public void setAlgorithmsRulId(java.lang.Long algorithmsRulId) {
        this.algorithmsRulId = algorithmsRulId;
    }

    /**
     * 获取 算法规则标识
     */
    public java.lang.Long getAlgorithmsRulId() {
        return this.algorithmsRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.algorithmsRulId = SeqUtils.createLongId(ID_SEQ);
         return this.algorithmsRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 算法规则名称
     */
    public void setAlgorithmsRulName(java.lang.String algorithmsRulName) {
        this.algorithmsRulName = algorithmsRulName;
    }

    /**
     * 获取 算法规则名称
     */
    public java.lang.String getAlgorithmsRulName() {
        return this.algorithmsRulName;
    }

    /**
     * 设置 规则描述
     */
    public void setRuleDesc(java.lang.String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    /**
     * 获取 规则描述
     */
    public java.lang.String getRuleDesc() {
        return this.ruleDesc;
    }

    /**
     * 设置 计算表达式
     */
    public void setRuleExpression(java.lang.String ruleExpression) {
        this.ruleExpression = ruleExpression;
    }

    /**
     * 获取 计算表达式
     */
    public java.lang.String getRuleExpression() {
        return this.ruleExpression;
    }

    /**
     * 设置 状态,LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态,LOVB=PUB-C-0001
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

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
