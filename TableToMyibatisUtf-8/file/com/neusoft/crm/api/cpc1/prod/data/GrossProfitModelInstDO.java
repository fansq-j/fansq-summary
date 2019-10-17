package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:毛利模型实例表。
 * @实体表  :GROSS_PROFIT_MODEL_INST
 */
public class GrossProfitModelInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GROSS_PROFIT_MODEL_INST_S";

    /**
     * 毛利模型实例表主键
     */
    public java.lang.Long grossProfitModelInstId;

    /**
     * 销售品id
     */
    public java.lang.Long offerId;

    /**
     * 毛利模型表主键
     */
    public java.lang.Long grossProfitModelId;

    /**
     * 毛利模型实例取值
     */
    public java.lang.String paramValue;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 毛利模型实例表主键
     */
    public void setGrossProfitModelInstId(java.lang.Long grossProfitModelInstId) {
        this.grossProfitModelInstId = grossProfitModelInstId;
    }

    /**
     * 获取 毛利模型实例表主键
     */
    public java.lang.Long getGrossProfitModelInstId() {
        return this.grossProfitModelInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.grossProfitModelInstId = SeqUtils.createLongId(ID_SEQ);
         return this.grossProfitModelInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品id
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品id
     */
    public java.lang.Long getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 毛利模型表主键
     */
    public void setGrossProfitModelId(java.lang.Long grossProfitModelId) {
        this.grossProfitModelId = grossProfitModelId;
    }

    /**
     * 获取 毛利模型表主键
     */
    public java.lang.Long getGrossProfitModelId() {
        return this.grossProfitModelId;
    }

    /**
     * 设置 毛利模型实例取值
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }

    /**
     * 获取 毛利模型实例取值
     */
    public java.lang.String getParamValue() {
        return this.paramValue;
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
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
