package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述行业类型规格，记录了行业类型主数据。
 * @实体表  :INDUSTRY_TYPE
 */
public class IndustryTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INDUSTRY_TYPE_S";

    /**
     * 记录客户行业类型标识，作为主键
     */
    public java.lang.Long industryTypeId;

    /**
     * 行业类型编码，LOVB=CUS-0005
     */
    public java.lang.String industryTypeCode;

    /**
     * 行业类型的名称
     */
    public java.lang.String industryTypeName;

    /**
     * 记录客户行业类型的等级。LOVB=CUS-C-0019。
     */
    public java.lang.String industryTypeGrade;

    /**
     * 记录上级行业类型标识，外键，指向客户行业类型实体。
     */
    public java.lang.Long parIndustryTypeId;

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
     * 设置 记录客户行业类型标识，作为主键
     */
    public void setIndustryTypeId(java.lang.Long industryTypeId) {
        this.industryTypeId = industryTypeId;
    }

    /**
     * 获取 记录客户行业类型标识，作为主键
     */
    public java.lang.Long getIndustryTypeId() {
        return this.industryTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.industryTypeId = SeqUtils.createLongId(ID_SEQ);
         return this.industryTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 行业类型编码，LOVB=CUS-0005
     */
    public void setIndustryTypeCode(java.lang.String industryTypeCode) {
        this.industryTypeCode = industryTypeCode;
    }

    /**
     * 获取 行业类型编码，LOVB=CUS-0005
     */
    public java.lang.String getIndustryTypeCode() {
        return this.industryTypeCode;
    }

    /**
     * 设置 行业类型的名称
     */
    public void setIndustryTypeName(java.lang.String industryTypeName) {
        this.industryTypeName = industryTypeName;
    }

    /**
     * 获取 行业类型的名称
     */
    public java.lang.String getIndustryTypeName() {
        return this.industryTypeName;
    }

    /**
     * 设置 记录客户行业类型的等级。LOVB=CUS-C-0019。
     */
    public void setIndustryTypeGrade(java.lang.String industryTypeGrade) {
        this.industryTypeGrade = industryTypeGrade;
    }

    /**
     * 获取 记录客户行业类型的等级。LOVB=CUS-C-0019。
     */
    public java.lang.String getIndustryTypeGrade() {
        return this.industryTypeGrade;
    }

    /**
     * 设置 记录上级行业类型标识，外键，指向客户行业类型实体。
     */
    public void setParIndustryTypeId(java.lang.Long parIndustryTypeId) {
        this.parIndustryTypeId = parIndustryTypeId;
    }

    /**
     * 获取 记录上级行业类型标识，外键，指向客户行业类型实体。
     */
    public java.lang.Long getParIndustryTypeId() {
        return this.parIndustryTypeId;
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
