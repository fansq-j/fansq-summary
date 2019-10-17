package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义回执模板
 * @实体表  :RECEIPT_TEMPLATE
 */
public class ReceiptTemplateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RECEIPT_TEMPLATE_S";

    /**
     * 回执模板ID
     */
    public java.lang.Long receiptTemplateId;

    /**
     * 回执模板名称
     */
    public java.lang.String name;

    /**
     * 回执模板编码
     */
    public java.lang.String code;

    /**
     * 使用区域
     */
    public java.lang.Integer applyRegion;

    /**
     * 模板类型，LOVB=EVT-C-0021
     */
    public java.lang.String templateType;

    /**
     * 状态，LOVB=PUB-C-0001。
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
     * 设置 回执模板ID
     */
    public void setReceiptTemplateId(java.lang.Long receiptTemplateId) {
        this.receiptTemplateId = receiptTemplateId;
    }

    /**
     * 获取 回执模板ID
     */
    public java.lang.Long getReceiptTemplateId() {
        return this.receiptTemplateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.receiptTemplateId = SeqUtils.createLongId(ID_SEQ);
         return this.receiptTemplateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 回执模板名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 回执模板名称
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * 设置 回执模板编码
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    /**
     * 获取 回执模板编码
     */
    public java.lang.String getCode() {
        return this.code;
    }

    /**
     * 设置 使用区域
     */
    public void setApplyRegion(java.lang.Integer applyRegion) {
        this.applyRegion = applyRegion;
    }

    /**
     * 获取 使用区域
     */
    public java.lang.Integer getApplyRegion() {
        return this.applyRegion;
    }

    /**
     * 设置 模板类型，LOVB=EVT-C-0021
     */
    public void setTemplateType(java.lang.String templateType) {
        this.templateType = templateType;
    }

    /**
     * 获取 模板类型，LOVB=EVT-C-0021
     */
    public java.lang.String getTemplateType() {
        return this.templateType;
    }

    /**
     * 设置 状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001。
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
