package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义累积周期的具体周期信息
 * @实体表  :RATABLE_CYCLE
 */
public class RatableCycleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RATABLE_CYCLE_S";

    /**
     * 定义一个累积周期的主键
     */
    public java.lang.Integer ratableCycleId;

    /**
     * 累积周期名称
     */
    public java.lang.String ratableCycleName;

    /**
     * LOVB=PLC-C-0016
     */
    public java.lang.Integer ratableCycleTypeId;

    /**
     * 累积周期数。
     */
    public java.lang.Integer ratableCycleCount;

    /**
     * 结合累积周期确定量本类型每次初始化时赠送量有效时间范围，如当前累积帐期内有效，则当前累积帐期结束后，要将其清零或使其失效.。PLC-C-0015
     */
    public java.lang.Integer ratableCycleDurativeType;

    /**
     * 累积周期偏移量
     */
    public java.lang.Integer ratableCycleOffset;

    /**
     * LOVB=PLC-C-0026
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
     * 设置 定义一个累积周期的主键
     */
    public void setRatableCycleId(java.lang.Integer ratableCycleId) {
        this.ratableCycleId = ratableCycleId;
    }

    /**
     * 获取 定义一个累积周期的主键
     */
    public java.lang.Integer getRatableCycleId() {
        return this.ratableCycleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.ratableCycleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.ratableCycleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 累积周期名称
     */
    public void setRatableCycleName(java.lang.String ratableCycleName) {
        this.ratableCycleName = ratableCycleName;
    }

    /**
     * 获取 累积周期名称
     */
    public java.lang.String getRatableCycleName() {
        return this.ratableCycleName;
    }

    /**
     * 设置 LOVB=PLC-C-0016
     */
    public void setRatableCycleTypeId(java.lang.Integer ratableCycleTypeId) {
        this.ratableCycleTypeId = ratableCycleTypeId;
    }

    /**
     * 获取 LOVB=PLC-C-0016
     */
    public java.lang.Integer getRatableCycleTypeId() {
        return this.ratableCycleTypeId;
    }

    /**
     * 设置 累积周期数。
     */
    public void setRatableCycleCount(java.lang.Integer ratableCycleCount) {
        this.ratableCycleCount = ratableCycleCount;
    }

    /**
     * 获取 累积周期数。
     */
    public java.lang.Integer getRatableCycleCount() {
        return this.ratableCycleCount;
    }

    /**
     * 设置 结合累积周期确定量本类型每次初始化时赠送量有效时间范围，如当前累积帐期内有效，则当前累积帐期结束后，要将其清零或使其失效.。PLC-C-0015
     */
    public void setRatableCycleDurativeType(java.lang.Integer ratableCycleDurativeType) {
        this.ratableCycleDurativeType = ratableCycleDurativeType;
    }

    /**
     * 获取 结合累积周期确定量本类型每次初始化时赠送量有效时间范围，如当前累积帐期内有效，则当前累积帐期结束后，要将其清零或使其失效.。PLC-C-0015
     */
    public java.lang.Integer getRatableCycleDurativeType() {
        return this.ratableCycleDurativeType;
    }

    /**
     * 设置 累积周期偏移量
     */
    public void setRatableCycleOffset(java.lang.Integer ratableCycleOffset) {
        this.ratableCycleOffset = ratableCycleOffset;
    }

    /**
     * 获取 累积周期偏移量
     */
    public java.lang.Integer getRatableCycleOffset() {
        return this.ratableCycleOffset;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
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
