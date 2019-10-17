package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录号码属性的可选值
 * @实体表  :ACC_NUM_TYPE_ATTR_VALUE
 */
public class AccNumTypeAttrValueDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACC_NUM_TYPE_ATTR_VALUE_S";

    /**
     * 号码属性选用值主键。
     */
    public java.lang.Long accNumTypeAttrValueId;

    /**
     * 号码属性规格主键。
     */
    public java.lang.Long accNumAttrId;

    /**
     * 属性值标识
     */
    public java.lang.Long attrValueId;

    /**
     * 记录约束类型，LOVB=PRD-C-0007
     */
    public java.lang.String rstrType;

    /**
     * 属性值本地网化别名
     */
    public java.lang.String valueAliasName;

    /**
     * 记录号码选用值适用的区域范围，来源COMMON_REGION_ID。
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
     * 设置 号码属性选用值主键。
     */
    public void setAccNumTypeAttrValueId(java.lang.Long accNumTypeAttrValueId) {
        this.accNumTypeAttrValueId = accNumTypeAttrValueId;
    }

    /**
     * 获取 号码属性选用值主键。
     */
    public java.lang.Long getAccNumTypeAttrValueId() {
        return this.accNumTypeAttrValueId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accNumTypeAttrValueId = SeqUtils.createLongId(ID_SEQ);
         return this.accNumTypeAttrValueId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 号码属性规格主键。
     */
    public void setAccNumAttrId(java.lang.Long accNumAttrId) {
        this.accNumAttrId = accNumAttrId;
    }

    /**
     * 获取 号码属性规格主键。
     */
    public java.lang.Long getAccNumAttrId() {
        return this.accNumAttrId;
    }

    /**
     * 设置 属性值标识
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值标识
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 记录约束类型，LOVB=PRD-C-0007
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 记录约束类型，LOVB=PRD-C-0007
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 属性值本地网化别名
     */
    public void setValueAliasName(java.lang.String valueAliasName) {
        this.valueAliasName = valueAliasName;
    }

    /**
     * 获取 属性值本地网化别名
     */
    public java.lang.String getValueAliasName() {
        return this.valueAliasName;
    }

    /**
     * 设置 记录号码选用值适用的区域范围，来源COMMON_REGION_ID。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录号码选用值适用的区域范围，来源COMMON_REGION_ID。
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
