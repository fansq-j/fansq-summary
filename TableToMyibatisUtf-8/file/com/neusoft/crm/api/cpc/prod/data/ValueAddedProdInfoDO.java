package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录增值产品的扩展信息
 * @实体表  :VALUE_ADDED_PROD_INFO
 */
public class ValueAddedProdInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VALUE_ADDED_PROD_INFO_S";

    /**
     * 增值产品信息的主键。
     */
    public java.lang.Long vaProdInfoId;

    /**
     * 增值产品标识，主键
     */
    public java.lang.Long vaProdId;

    /**
     * 所属系统编码
     */
    public java.lang.String sysCode;

    /**
     * 计费类型。LOVB=PRD-C-0013
     */
    public java.lang.String billingType;

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
     * 设置 增值产品信息的主键。
     */
    public void setVaProdInfoId(java.lang.Long vaProdInfoId) {
        this.vaProdInfoId = vaProdInfoId;
    }

    /**
     * 获取 增值产品信息的主键。
     */
    public java.lang.Long getVaProdInfoId() {
        return this.vaProdInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vaProdInfoId = SeqUtils.createLongId(ID_SEQ);
         return this.vaProdInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 增值产品标识，主键
     */
    public void setVaProdId(java.lang.Long vaProdId) {
        this.vaProdId = vaProdId;
    }

    /**
     * 获取 增值产品标识，主键
     */
    public java.lang.Long getVaProdId() {
        return this.vaProdId;
    }

    /**
     * 设置 所属系统编码
     */
    public void setSysCode(java.lang.String sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * 获取 所属系统编码
     */
    public java.lang.String getSysCode() {
        return this.sysCode;
    }

    /**
     * 设置 计费类型。LOVB=PRD-C-0013
     */
    public void setBillingType(java.lang.String billingType) {
        this.billingType = billingType;
    }

    /**
     * 获取 计费类型。LOVB=PRD-C-0013
     */
    public java.lang.String getBillingType() {
        return this.billingType;
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
