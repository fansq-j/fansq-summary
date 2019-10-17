package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:标签是为了统计等需要对销售品、产品、客户等对象进行标注的实体。
 * @实体表  :LABEL
 */
public class LabelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LABEL_S";

    /**
     * 记录标签规格标识，作为主键
     */
    public java.lang.Long labelId;

    /**
     * 标签的编码
     */
    public java.lang.String labelCode;

    /**
     * 标签规格名称
     */
    public java.lang.String labelName;

    /**
     * 标签规格描述
     */
    public java.lang.String labelDesc;

    /**
     * 记录标签的类型。LOVB=CUS-C-0020。
     */
    public java.lang.String labelType;

    /**
     * 区分标签值的类型LOVB=PUB-C-0007
     */
    public java.lang.String labelValueType;

    /**
     * 记录标签值的数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String labelDataType;

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
     * 设置 记录标签规格标识，作为主键
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }

    /**
     * 获取 记录标签规格标识，作为主键
     */
    public java.lang.Long getLabelId() {
        return this.labelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.labelId = SeqUtils.createLongId(ID_SEQ);
         return this.labelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 标签的编码
     */
    public void setLabelCode(java.lang.String labelCode) {
        this.labelCode = labelCode;
    }

    /**
     * 获取 标签的编码
     */
    public java.lang.String getLabelCode() {
        return this.labelCode;
    }

    /**
     * 设置 标签规格名称
     */
    public void setLabelName(java.lang.String labelName) {
        this.labelName = labelName;
    }

    /**
     * 获取 标签规格名称
     */
    public java.lang.String getLabelName() {
        return this.labelName;
    }

    /**
     * 设置 标签规格描述
     */
    public void setLabelDesc(java.lang.String labelDesc) {
        this.labelDesc = labelDesc;
    }

    /**
     * 获取 标签规格描述
     */
    public java.lang.String getLabelDesc() {
        return this.labelDesc;
    }

    /**
     * 设置 记录标签的类型。LOVB=CUS-C-0020。
     */
    public void setLabelType(java.lang.String labelType) {
        this.labelType = labelType;
    }

    /**
     * 获取 记录标签的类型。LOVB=CUS-C-0020。
     */
    public java.lang.String getLabelType() {
        return this.labelType;
    }

    /**
     * 设置 区分标签值的类型LOVB=PUB-C-0007
     */
    public void setLabelValueType(java.lang.String labelValueType) {
        this.labelValueType = labelValueType;
    }

    /**
     * 获取 区分标签值的类型LOVB=PUB-C-0007
     */
    public java.lang.String getLabelValueType() {
        return this.labelValueType;
    }

    /**
     * 设置 记录标签值的数据类型，LOVB=PUB-C-0014
     */
    public void setLabelDataType(java.lang.String labelDataType) {
        this.labelDataType = labelDataType;
    }

    /**
     * 获取 记录标签值的数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String getLabelDataType() {
        return this.labelDataType;
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
