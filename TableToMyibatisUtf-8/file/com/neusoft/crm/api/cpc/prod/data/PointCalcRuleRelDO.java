package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分计算规则之间的关系，包括互斥关系、依赖关系等
 * @实体表  :POINT_CALC_RULE_REL
 */
public class PointCalcRuleRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_CALC_RULE_REL_S";

    /**
     * 积分计算规则关系标识，作为主键
     */
    public java.lang.Integer pointCalcRuleRelId;

    /**
     * A端积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public java.lang.Integer aPointCalcRuleId;

    /**
     * Z端积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public java.lang.Integer zPointCalcRuleId;

    /**
     * 关系类型，LOVB=POI-C-0011
     */
    public java.lang.String relType;

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
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分计算规则关系标识，作为主键
     */
    public void setPointCalcRuleRelId(java.lang.Integer pointCalcRuleRelId) {
        this.pointCalcRuleRelId = pointCalcRuleRelId;
    }

    /**
     * 获取 积分计算规则关系标识，作为主键
     */
    public java.lang.Integer getPointCalcRuleRelId() {
        return this.pointCalcRuleRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointCalcRuleRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointCalcRuleRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 A端积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public void setAPointCalcRuleId(java.lang.Integer aPointCalcRuleId) {
        this.aPointCalcRuleId = aPointCalcRuleId;
    }

    /**
     * 获取 A端积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public java.lang.Integer getAPointCalcRuleId() {
        return this.aPointCalcRuleId;
    }

    /**
     * 设置 Z端积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public void setZPointCalcRuleId(java.lang.Integer zPointCalcRuleId) {
        this.zPointCalcRuleId = zPointCalcRuleId;
    }

    /**
     * 获取 Z端积分计算规则标识，作为外键，指向积分计算规则实体
     */
    public java.lang.Integer getZPointCalcRuleId() {
        return this.zPointCalcRuleId;
    }

    /**
     * 设置 关系类型，LOVB=POI-C-0011
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 关系类型，LOVB=POI-C-0011
     */
    public java.lang.String getRelType() {
        return this.relType;
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
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
