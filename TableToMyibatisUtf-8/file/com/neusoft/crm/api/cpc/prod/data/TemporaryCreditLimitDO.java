package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:为满足客户个性化服务要求，可对会员和用户在节假日出游等情况，在原信用额度的基础上，可临时授予额外的信用额度。每个月ODS
 * @实体表  :TEMPORARY_CREDIT_LIMIT
 */
public class TemporaryCreditLimitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPORARY_CREDIT_LIMIT_S";

    /**
     * 记录临时信用额度标识，作为主键
     */
    public java.lang.Long temporaryCreditLimitId;

    /**
     * 记录信用额度标识，作为外键，指向信用额度实体
     */
    public java.lang.Long creditLimitId;

    /**
     * 记录客户临时调整的信用额度
     */
    public java.lang.Long creditLimitFee;

    /**
     * 记录产生欠费后对临时信用额度扣减后剩余的临时信用额度
     */
    public java.lang.Long availableCreditLimitFee;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录调整原因
     */
    public java.lang.String adjustReason;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录临时信用额度标识，作为主键
     */
    public void setTemporaryCreditLimitId(java.lang.Long temporaryCreditLimitId) {
        this.temporaryCreditLimitId = temporaryCreditLimitId;
    }

    /**
     * 获取 记录临时信用额度标识，作为主键
     */
    public java.lang.Long getTemporaryCreditLimitId() {
        return this.temporaryCreditLimitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.temporaryCreditLimitId = SeqUtils.createLongId(ID_SEQ);
         return this.temporaryCreditLimitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录信用额度标识，作为外键，指向信用额度实体
     */
    public void setCreditLimitId(java.lang.Long creditLimitId) {
        this.creditLimitId = creditLimitId;
    }

    /**
     * 获取 记录信用额度标识，作为外键，指向信用额度实体
     */
    public java.lang.Long getCreditLimitId() {
        return this.creditLimitId;
    }

    /**
     * 设置 记录客户临时调整的信用额度
     */
    public void setCreditLimitFee(java.lang.Long creditLimitFee) {
        this.creditLimitFee = creditLimitFee;
    }

    /**
     * 获取 记录客户临时调整的信用额度
     */
    public java.lang.Long getCreditLimitFee() {
        return this.creditLimitFee;
    }

    /**
     * 设置 记录产生欠费后对临时信用额度扣减后剩余的临时信用额度
     */
    public void setAvailableCreditLimitFee(java.lang.Long availableCreditLimitFee) {
        this.availableCreditLimitFee = availableCreditLimitFee;
    }

    /**
     * 获取 记录产生欠费后对临时信用额度扣减后剩余的临时信用额度
     */
    public java.lang.Long getAvailableCreditLimitFee() {
        return this.availableCreditLimitFee;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录调整原因
     */
    public void setAdjustReason(java.lang.String adjustReason) {
        this.adjustReason = adjustReason;
    }

    /**
     * 获取 记录调整原因
     */
    public java.lang.String getAdjustReason() {
        return this.adjustReason;
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
