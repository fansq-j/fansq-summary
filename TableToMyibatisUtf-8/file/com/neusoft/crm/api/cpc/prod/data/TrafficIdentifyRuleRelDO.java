package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录流量识别与流量规则的关联信息
 * @实体表  :TRAFFIC_IDENTIFY_RULE_REL
 */
public class TrafficIdentifyRuleRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TRAFFIC_IDENTIFY_RULE_REL_S";

    /**
     * 关系标识的主键。
     */
    public java.lang.Long trafficIdentifyRuleRelId;

    /**
     * 流量识别的主键。
     */
    public java.lang.Long trafficIdentifyId;

    /**
     * 流量识别规则的主键。
     */
    public java.lang.Long ruleId;

    /**
     * 记录关系的适用区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 关系标识的主键。
     */
    public void setTrafficIdentifyRuleRelId(java.lang.Long trafficIdentifyRuleRelId) {
        this.trafficIdentifyRuleRelId = trafficIdentifyRuleRelId;
    }

    /**
     * 获取 关系标识的主键。
     */
    public java.lang.Long getTrafficIdentifyRuleRelId() {
        return this.trafficIdentifyRuleRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.trafficIdentifyRuleRelId = SeqUtils.createLongId(ID_SEQ);
         return this.trafficIdentifyRuleRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 流量识别的主键。
     */
    public void setTrafficIdentifyId(java.lang.Long trafficIdentifyId) {
        this.trafficIdentifyId = trafficIdentifyId;
    }

    /**
     * 获取 流量识别的主键。
     */
    public java.lang.Long getTrafficIdentifyId() {
        return this.trafficIdentifyId;
    }

    /**
     * 设置 流量识别规则的主键。
     */
    public void setRuleId(java.lang.Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取 流量识别规则的主键。
     */
    public java.lang.Long getRuleId() {
        return this.ruleId;
    }

    /**
     * 设置 记录关系的适用区域，来源COMMON_REGION_ID。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录关系的适用区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
