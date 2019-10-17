package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录标签分组信息
 * @实体表  :LABEL_GROUP
 */
public class LabelGroupDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LABEL_GROUP_S";

    /**
     * 记录标签组标识，作为主键
     */
    public java.lang.Long labelGroupId;

    /**
     * 标签组的编码
     */
    public java.lang.String labelGroupCode;

    /**
     * 标签组名称
     */
    public java.lang.String labelGroupName;

    /**
     * 对标签组建立的目的进行描述
     */
    public java.lang.String labelGroupDesc;

    /**
     * 记录标签组的类型。LOVB=CUS-0012。
     */
    public java.lang.String objType;

    /**
     * 记录上级标签组标识，作为外键，指向标签组实体
     */
    public java.lang.Long parentLabelGroupId;

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
     * 设置 记录标签组标识，作为主键
     */
    public void setLabelGroupId(java.lang.Long labelGroupId) {
        this.labelGroupId = labelGroupId;
    }

    /**
     * 获取 记录标签组标识，作为主键
     */
    public java.lang.Long getLabelGroupId() {
        return this.labelGroupId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.labelGroupId = SeqUtils.createLongId(ID_SEQ);
         return this.labelGroupId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 标签组的编码
     */
    public void setLabelGroupCode(java.lang.String labelGroupCode) {
        this.labelGroupCode = labelGroupCode;
    }

    /**
     * 获取 标签组的编码
     */
    public java.lang.String getLabelGroupCode() {
        return this.labelGroupCode;
    }

    /**
     * 设置 标签组名称
     */
    public void setLabelGroupName(java.lang.String labelGroupName) {
        this.labelGroupName = labelGroupName;
    }

    /**
     * 获取 标签组名称
     */
    public java.lang.String getLabelGroupName() {
        return this.labelGroupName;
    }

    /**
     * 设置 对标签组建立的目的进行描述
     */
    public void setLabelGroupDesc(java.lang.String labelGroupDesc) {
        this.labelGroupDesc = labelGroupDesc;
    }

    /**
     * 获取 对标签组建立的目的进行描述
     */
    public java.lang.String getLabelGroupDesc() {
        return this.labelGroupDesc;
    }

    /**
     * 设置 记录标签组的类型。LOVB=CUS-0012。
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录标签组的类型。LOVB=CUS-0012。
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录上级标签组标识，作为外键，指向标签组实体
     */
    public void setParentLabelGroupId(java.lang.Long parentLabelGroupId) {
        this.parentLabelGroupId = parentLabelGroupId;
    }

    /**
     * 获取 记录上级标签组标识，作为外键，指向标签组实体
     */
    public java.lang.Long getParentLabelGroupId() {
        return this.parentLabelGroupId;
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
