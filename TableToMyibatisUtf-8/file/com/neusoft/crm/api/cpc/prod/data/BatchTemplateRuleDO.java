package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:模板替换规则
 * @实体表  :BATCH_TEMPLATE_RULE
 */
public class BatchTemplateRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_TEMPLATE_RULE_S";

    /**
     * 模板替换规则标识
     */
    public java.lang.Long batchTemplateRuleId;

    /**
     * 种子订单属性标识
     */
    public java.lang.Long seedOrderAttrId;

    /**
     * 种子订单属性原值
     */
    public java.lang.String attrOldValue;

    /**
     * 记录属性取值方式，LOVB=EVT-C-0018
            
     */
    public java.lang.String attrReplaceType;

    /**
     * 种子订单属性新值
     */
    public java.lang.String attrNewValue;

    /**
     * 函数参数列表
     */
    public java.lang.String attrFuncParams;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 模板替换规则标识
     */
    public void setBatchTemplateRuleId(java.lang.Long batchTemplateRuleId) {
        this.batchTemplateRuleId = batchTemplateRuleId;
    }

    /**
     * 获取 模板替换规则标识
     */
    public java.lang.Long getBatchTemplateRuleId() {
        return this.batchTemplateRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchTemplateRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.batchTemplateRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 种子订单属性标识
     */
    public void setSeedOrderAttrId(java.lang.Long seedOrderAttrId) {
        this.seedOrderAttrId = seedOrderAttrId;
    }

    /**
     * 获取 种子订单属性标识
     */
    public java.lang.Long getSeedOrderAttrId() {
        return this.seedOrderAttrId;
    }

    /**
     * 设置 种子订单属性原值
     */
    public void setAttrOldValue(java.lang.String attrOldValue) {
        this.attrOldValue = attrOldValue;
    }

    /**
     * 获取 种子订单属性原值
     */
    public java.lang.String getAttrOldValue() {
        return this.attrOldValue;
    }

    /**
     * 设置 记录属性取值方式，LOVB=EVT-C-0018
            
     */
    public void setAttrReplaceType(java.lang.String attrReplaceType) {
        this.attrReplaceType = attrReplaceType;
    }

    /**
     * 获取 记录属性取值方式，LOVB=EVT-C-0018
            
     */
    public java.lang.String getAttrReplaceType() {
        return this.attrReplaceType;
    }

    /**
     * 设置 种子订单属性新值
     */
    public void setAttrNewValue(java.lang.String attrNewValue) {
        this.attrNewValue = attrNewValue;
    }

    /**
     * 获取 种子订单属性新值
     */
    public java.lang.String getAttrNewValue() {
        return this.attrNewValue;
    }

    /**
     * 设置 函数参数列表
     */
    public void setAttrFuncParams(java.lang.String attrFuncParams) {
        this.attrFuncParams = attrFuncParams;
    }

    /**
     * 获取 函数参数列表
     */
    public java.lang.String getAttrFuncParams() {
        return this.attrFuncParams;
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
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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

}
