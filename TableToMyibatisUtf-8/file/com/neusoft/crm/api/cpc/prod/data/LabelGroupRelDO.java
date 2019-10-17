package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录标签和标签组关系，一个标签组可以有多个标签，一个标签可以属于多个标签组。
 * @实体表  :LABEL_GROUP_REL
 */
public class LabelGroupRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LABEL_GROUP_REL_S";

    /**
     * 记录标签关联标签组标识，作为主键
     */
    public java.lang.Long labelGroupRelId;

    /**
     * 记录标签规格标识，作为外键，指向标签规格实体
     */
    public java.lang.Long labelId;

    /**
     * 记录标签组标识，作为外键，指向标签组实体
     */
    public java.lang.Long labelGroupId;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录标签关联标签组标识，作为主键
     */
    public void setLabelGroupRelId(java.lang.Long labelGroupRelId) {
        this.labelGroupRelId = labelGroupRelId;
    }

    /**
     * 获取 记录标签关联标签组标识，作为主键
     */
    public java.lang.Long getLabelGroupRelId() {
        return this.labelGroupRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.labelGroupRelId = SeqUtils.createLongId(ID_SEQ);
         return this.labelGroupRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录标签规格标识，作为外键，指向标签规格实体
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }

    /**
     * 获取 记录标签规格标识，作为外键，指向标签规格实体
     */
    public java.lang.Long getLabelId() {
        return this.labelId;
    }

    /**
     * 设置 记录标签组标识，作为外键，指向标签组实体
     */
    public void setLabelGroupId(java.lang.Long labelGroupId) {
        this.labelGroupId = labelGroupId;
    }

    /**
     * 获取 记录标签组标识，作为外键，指向标签组实体
     */
    public java.lang.Long getLabelGroupId() {
        return this.labelGroupId;
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
