package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对标签取值范围的定义

 * @实体表  :LABEL_VALUE
 */
public class LabelValueDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LABEL_VALUE_S";

    /**
     * 标签值的主键
     */
    public java.lang.Long labelValueId;

    /**
     * 标签标识
     */
    public java.lang.Long labelId;

    /**
     * 标签值
     */
    public java.lang.String labelValue;

    /**
     * 记录标签值名称
     */
    public java.lang.String valueName;

    /**
     * 标签的详细描述信息
     */
    public java.lang.String valueDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 标签值的主键
     */
    public void setLabelValueId(java.lang.Long labelValueId) {
        this.labelValueId = labelValueId;
    }

    /**
     * 获取 标签值的主键
     */
    public java.lang.Long getLabelValueId() {
        return this.labelValueId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.labelValueId = SeqUtils.createLongId(ID_SEQ);
         return this.labelValueId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 标签标识
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }

    /**
     * 获取 标签标识
     */
    public java.lang.Long getLabelId() {
        return this.labelId;
    }

    /**
     * 设置 标签值
     */
    public void setLabelValue(java.lang.String labelValue) {
        this.labelValue = labelValue;
    }

    /**
     * 获取 标签值
     */
    public java.lang.String getLabelValue() {
        return this.labelValue;
    }

    /**
     * 设置 记录标签值名称
     */
    public void setValueName(java.lang.String valueName) {
        this.valueName = valueName;
    }

    /**
     * 获取 记录标签值名称
     */
    public java.lang.String getValueName() {
        return this.valueName;
    }

    /**
     * 设置 标签的详细描述信息
     */
    public void setValueDesc(java.lang.String valueDesc) {
        this.valueDesc = valueDesc;
    }

    /**
     * 获取 标签的详细描述信息
     */
    public java.lang.String getValueDesc() {
        return this.valueDesc;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
