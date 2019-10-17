package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述行业类型与关键字的对应关系，根据该对应关系，可以根据客户名称上的关键字计算出其所在的行业类型。
 * @实体表  :INDUSTRY_TYPE_KEY_WORD
 */
public class IndustryTypeKeyWordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INDUSTRY_TYPE_KEY_WORD_S";

    /**
     * 行业类型关键字标识，作为主键
     */
    public java.lang.Long industryTypeKeyWordId;

    /**
     * 行业类型标识，外键，指向行业类型实体
     */
    public java.lang.Long industryTypeId;

    /**
     * 用于计算行业编码的关键字
     */
    public java.lang.String keyWord;

    /**
     * 根据关键字计算出的行业类型的编码。
     */
    public java.lang.String industryTypeCode;

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
     * 设置 行业类型关键字标识，作为主键
     */
    public void setIndustryTypeKeyWordId(java.lang.Long industryTypeKeyWordId) {
        this.industryTypeKeyWordId = industryTypeKeyWordId;
    }

    /**
     * 获取 行业类型关键字标识，作为主键
     */
    public java.lang.Long getIndustryTypeKeyWordId() {
        return this.industryTypeKeyWordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.industryTypeKeyWordId = SeqUtils.createLongId(ID_SEQ);
         return this.industryTypeKeyWordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 行业类型标识，外键，指向行业类型实体
     */
    public void setIndustryTypeId(java.lang.Long industryTypeId) {
        this.industryTypeId = industryTypeId;
    }

    /**
     * 获取 行业类型标识，外键，指向行业类型实体
     */
    public java.lang.Long getIndustryTypeId() {
        return this.industryTypeId;
    }

    /**
     * 设置 用于计算行业编码的关键字
     */
    public void setKeyWord(java.lang.String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * 获取 用于计算行业编码的关键字
     */
    public java.lang.String getKeyWord() {
        return this.keyWord;
    }

    /**
     * 设置 根据关键字计算出的行业类型的编码。
     */
    public void setIndustryTypeCode(java.lang.String industryTypeCode) {
        this.industryTypeCode = industryTypeCode;
    }

    /**
     * 获取 根据关键字计算出的行业类型的编码。
     */
    public java.lang.String getIndustryTypeCode() {
        return this.industryTypeCode;
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
