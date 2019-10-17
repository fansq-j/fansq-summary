package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录流量识别规则属性可选值
 * @实体表  :TRAFFIC_IDENTIFY_RULE_ATTR_VAL
 */
public class TrafficIdentifyRuleAttrValDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TRAFFIC_IDENTIFY_RULE_ATTR_VAL_S";

    /**
     * 流量识别规则属性标识
     */
    public java.lang.Long trafIdentifyRuleAttrValId;

    /**
     * 流量识别规则属性的主键
     */
    public java.lang.Long trafficIdentifyRuleAttrId;

    /**
     * 属性值的主键
     */
    public java.lang.Long attrValueId;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 状态。LOVB=PUB-C-0001
            
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
     * 设置 流量识别规则属性标识
     */
    public void setTrafIdentifyRuleAttrValId(java.lang.Long trafIdentifyRuleAttrValId) {
        this.trafIdentifyRuleAttrValId = trafIdentifyRuleAttrValId;
    }

    /**
     * 获取 流量识别规则属性标识
     */
    public java.lang.Long getTrafIdentifyRuleAttrValId() {
        return this.trafIdentifyRuleAttrValId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.trafIdentifyRuleAttrValId = SeqUtils.createLongId(ID_SEQ);
         return this.trafIdentifyRuleAttrValId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 流量识别规则属性的主键
     */
    public void setTrafficIdentifyRuleAttrId(java.lang.Long trafficIdentifyRuleAttrId) {
        this.trafficIdentifyRuleAttrId = trafficIdentifyRuleAttrId;
    }

    /**
     * 获取 流量识别规则属性的主键
     */
    public java.lang.Long getTrafficIdentifyRuleAttrId() {
        return this.trafficIdentifyRuleAttrId;
    }

    /**
     * 设置 属性值的主键
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值的主键
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 状态。LOVB=PUB-C-0001
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001
            
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
