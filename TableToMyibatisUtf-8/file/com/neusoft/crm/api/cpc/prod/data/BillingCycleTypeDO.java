package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述帐务周期的类型。
 * @实体表  :BILLING_CYCLE_TYPE
 */
public class BillingCycleTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILLING_CYCLE_TYPE_S";

    /**
     * 帐务周期类别的标识。
     */
    public java.lang.Integer billingCycleTypeId;

    /**
     * 帐务周期类型的名称。
     */
    public java.lang.String billingCycleTypeName;

    /**
     * 帐务周期类型对应的周期单位。ACC-C-0008
     */
    public java.lang.Integer cycleUnit;

    /**
     * 记录单位间隔数。
     */
    public java.lang.Integer unitCount;

    /**
     * 根据单位间隔设定的偏移量，即帐务周期从哪个单位开始。
     */
    public java.lang.Integer cycleDuration;

    /**
     * 偏移天数，即帐务周期的开始日期。
     */
    public java.lang.Integer cycleDurationDays;

    /**
     * LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 帐务周期类别的标识。
     */
    public void setBillingCycleTypeId(java.lang.Integer billingCycleTypeId) {
        this.billingCycleTypeId = billingCycleTypeId;
    }

    /**
     * 获取 帐务周期类别的标识。
     */
    public java.lang.Integer getBillingCycleTypeId() {
        return this.billingCycleTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.billingCycleTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.billingCycleTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 帐务周期类型的名称。
     */
    public void setBillingCycleTypeName(java.lang.String billingCycleTypeName) {
        this.billingCycleTypeName = billingCycleTypeName;
    }

    /**
     * 获取 帐务周期类型的名称。
     */
    public java.lang.String getBillingCycleTypeName() {
        return this.billingCycleTypeName;
    }

    /**
     * 设置 帐务周期类型对应的周期单位。ACC-C-0008
     */
    public void setCycleUnit(java.lang.Integer cycleUnit) {
        this.cycleUnit = cycleUnit;
    }

    /**
     * 获取 帐务周期类型对应的周期单位。ACC-C-0008
     */
    public java.lang.Integer getCycleUnit() {
        return this.cycleUnit;
    }

    /**
     * 设置 记录单位间隔数。
     */
    public void setUnitCount(java.lang.Integer unitCount) {
        this.unitCount = unitCount;
    }

    /**
     * 获取 记录单位间隔数。
     */
    public java.lang.Integer getUnitCount() {
        return this.unitCount;
    }

    /**
     * 设置 根据单位间隔设定的偏移量，即帐务周期从哪个单位开始。
     */
    public void setCycleDuration(java.lang.Integer cycleDuration) {
        this.cycleDuration = cycleDuration;
    }

    /**
     * 获取 根据单位间隔设定的偏移量，即帐务周期从哪个单位开始。
     */
    public java.lang.Integer getCycleDuration() {
        return this.cycleDuration;
    }

    /**
     * 设置 偏移天数，即帐务周期的开始日期。
     */
    public void setCycleDurationDays(java.lang.Integer cycleDurationDays) {
        this.cycleDurationDays = cycleDurationDays;
    }

    /**
     * 获取 偏移天数，即帐务周期的开始日期。
     */
    public java.lang.Integer getCycleDurationDays() {
        return this.cycleDurationDays;
    }

    /**
     * 设置 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
