package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述了增值产品的特征信息。
 * @实体表  :VA_PROD_ATTR
 */
public class VaProdAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VA_PROD_ATTR_S";

    /**
     * 增值产品属性标识，主键。
     */
    public java.lang.Long vaProdAttrId;

    /**
     * 增值产品的标识，主键
     */
    public java.lang.Long vaProdId;

    /**
     * 业务对象属性规格业务编码
     */
    public java.lang.Long attrId;

    /**
     * 产品属性的默认值
     */
    public java.lang.String defaultValue;

    /**
     * 对产品属性的描述说明
     */
    public java.lang.String comments;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
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
     * 设置 增值产品属性标识，主键。
     */
    public void setVaProdAttrId(java.lang.Long vaProdAttrId) {
        this.vaProdAttrId = vaProdAttrId;
    }

    /**
     * 获取 增值产品属性标识，主键。
     */
    public java.lang.Long getVaProdAttrId() {
        return this.vaProdAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vaProdAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.vaProdAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 增值产品的标识，主键
     */
    public void setVaProdId(java.lang.Long vaProdId) {
        this.vaProdId = vaProdId;
    }

    /**
     * 获取 增值产品的标识，主键
     */
    public java.lang.Long getVaProdId() {
        return this.vaProdId;
    }

    /**
     * 设置 业务对象属性规格业务编码
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 业务对象属性规格业务编码
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 产品属性的默认值
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 产品属性的默认值
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 对产品属性的描述说明
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 对产品属性的描述说明
     */
    public java.lang.String getComments() {
        return this.comments;
    }

    /**
     * 设置 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用的区域范围，来源COMMON_REGION_ID。
            
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
