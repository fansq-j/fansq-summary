package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于描述进行资费计算或者优惠计算所涉及的可配置的参数。这些参数的取值可以在制定产品的定价计划时进行配置，也可以在客户购买
 * @实体表  :PRICING_PARAM_DEFINE
 */
public class PricingParamDefineDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_PARAM_DEFINE_S";

    /**
     * 参数的标识
     */
    public java.lang.Integer pricingParamId;

    /**
     * 该参数的名称
     */
    public java.lang.String paramName;

    /**
     * 定价参数缺省值
     */
    public java.lang.String paramDefaultValue;

    /**
     * 状态.LOVB=PRC-C-0026.
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
     * 设置 参数的标识
     */
    public void setPricingParamId(java.lang.Integer pricingParamId) {
        this.pricingParamId = pricingParamId;
    }

    /**
     * 获取 参数的标识
     */
    public java.lang.Integer getPricingParamId() {
        return this.pricingParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingParamId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 该参数的名称
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }

    /**
     * 获取 该参数的名称
     */
    public java.lang.String getParamName() {
        return this.paramName;
    }

    /**
     * 设置 定价参数缺省值
     */
    public void setParamDefaultValue(java.lang.String paramDefaultValue) {
        this.paramDefaultValue = paramDefaultValue;
    }

    /**
     * 获取 定价参数缺省值
     */
    public java.lang.String getParamDefaultValue() {
        return this.paramDefaultValue;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
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
