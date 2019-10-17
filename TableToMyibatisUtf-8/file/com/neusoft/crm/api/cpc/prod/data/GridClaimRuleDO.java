package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录网格划配规则，不同的网格类型具有的网格划配规则，同一网格类型之间的多条网格划配规则存在优先级。
 * @实体表  :GRID_CLAIM_RULE
 */
public class GridClaimRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GRID_CLAIM_RULE_S";

    /**
     * 网格划配规则标识
     */
    public java.lang.Long gridClaimRuleId;

    /**
     * 网格划配规则名称
     */
    public java.lang.String gridClaimRuleName;

    /**
     * 网格划配规则描述
     */
    public java.lang.String gridClaimRuleDesc;

    /**
     * 记录优先级
     */
    public java.lang.Integer priority;

    /**
     * 网格划配规则编码
     */
    public java.lang.String gridClaimRuleCode;

    /**
     * 网格类型。LOVB=CHN-C-0002。
            
     */
    public java.lang.String gridType;

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
     * 设置 网格划配规则标识
     */
    public void setGridClaimRuleId(java.lang.Long gridClaimRuleId) {
        this.gridClaimRuleId = gridClaimRuleId;
    }

    /**
     * 获取 网格划配规则标识
     */
    public java.lang.Long getGridClaimRuleId() {
        return this.gridClaimRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.gridClaimRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.gridClaimRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 网格划配规则名称
     */
    public void setGridClaimRuleName(java.lang.String gridClaimRuleName) {
        this.gridClaimRuleName = gridClaimRuleName;
    }

    /**
     * 获取 网格划配规则名称
     */
    public java.lang.String getGridClaimRuleName() {
        return this.gridClaimRuleName;
    }

    /**
     * 设置 网格划配规则描述
     */
    public void setGridClaimRuleDesc(java.lang.String gridClaimRuleDesc) {
        this.gridClaimRuleDesc = gridClaimRuleDesc;
    }

    /**
     * 获取 网格划配规则描述
     */
    public java.lang.String getGridClaimRuleDesc() {
        return this.gridClaimRuleDesc;
    }

    /**
     * 设置 记录优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 记录优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 网格划配规则编码
     */
    public void setGridClaimRuleCode(java.lang.String gridClaimRuleCode) {
        this.gridClaimRuleCode = gridClaimRuleCode;
    }

    /**
     * 获取 网格划配规则编码
     */
    public java.lang.String getGridClaimRuleCode() {
        return this.gridClaimRuleCode;
    }

    /**
     * 设置 网格类型。LOVB=CHN-C-0002。
            
     */
    public void setGridType(java.lang.String gridType) {
        this.gridType = gridType;
    }

    /**
     * 获取 网格类型。LOVB=CHN-C-0002。
            
     */
    public java.lang.String getGridType() {
        return this.gridType;
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
