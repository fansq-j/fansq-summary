package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销维挽策略就是为了实现营销维挽目标，为营销维挽活动执行设定规则的集合。主要内容包括：策略名称、策略类型、营销维挽方式、
 * @实体表  :MKT_STRATEGY
 */
public class MktStrategyDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_STRATEGY_S";

    /**
     * 营销策略标识，主键
     */
    public java.lang.Long strategyId;

    /**
     * 策略名称
     */
    public java.lang.String strategyName;

    /**
     * 策略类型,策略类型,LOVB=CAM-C-0015
     */
    public java.lang.String strategyType;

    /**
     * 记录营销策略的具体内容
     */
    public java.lang.String strategyDesc;

    /**
     * 计算表达式，根据省份实现方式差异，可以用流程引擎配置实现
     */
    public java.lang.String ruleExpression;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long lanId;

    /**
     * 设置 营销策略标识，主键
     */
    public void setStrategyId(java.lang.Long strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * 获取 营销策略标识，主键
     */
    public java.lang.Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.strategyId = SeqUtils.createLongId(ID_SEQ);
         return this.strategyId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 策略名称
     */
    public void setStrategyName(java.lang.String strategyName) {
        this.strategyName = strategyName;
    }

    /**
     * 获取 策略名称
     */
    public java.lang.String getStrategyName() {
        return this.strategyName;
    }

    /**
     * 设置 策略类型,策略类型,LOVB=CAM-C-0015
     */
    public void setStrategyType(java.lang.String strategyType) {
        this.strategyType = strategyType;
    }

    /**
     * 获取 策略类型,策略类型,LOVB=CAM-C-0015
     */
    public java.lang.String getStrategyType() {
        return this.strategyType;
    }

    /**
     * 设置 记录营销策略的具体内容
     */
    public void setStrategyDesc(java.lang.String strategyDesc) {
        this.strategyDesc = strategyDesc;
    }

    /**
     * 获取 记录营销策略的具体内容
     */
    public java.lang.String getStrategyDesc() {
        return this.strategyDesc;
    }

    /**
     * 设置 计算表达式，根据省份实现方式差异，可以用流程引擎配置实现
     */
    public void setRuleExpression(java.lang.String ruleExpression) {
        this.ruleExpression = ruleExpression;
    }

    /**
     * 获取 计算表达式，根据省份实现方式差异，可以用流程引擎配置实现
     */
    public java.lang.String getRuleExpression() {
        return this.ruleExpression;
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
     * 设置 状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 记录本地网标识，数据来源于公共管理区域。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

}
