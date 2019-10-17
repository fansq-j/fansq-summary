package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于确定进行资费计算或者优惠计算所涉及的具体参考值，它既可以是预先设定的固定值、参数，也可以是定价参考对象的取值。
                                      -
 * @实体表  :PRICING_REF_VALUE
 */
public class PricingRefValueDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_REF_VALUE_S";

    /**
     * 参考值定义的标识
     */
    public java.lang.Integer refValueId;

    /**
     * 参数值名称
     */
    public java.lang.String refValueName;

    /**
     * 参考值类型: 常量,引用定价参考对象,引用参数,引用定价参考值等。LOVB=PRC-C-0012
            
     */
    public java.lang.Integer refValueType;

    /**
     * 若参考值类型是常量，该项有效，表示被引用的数值串
     */
    public java.lang.String valueString;

    /**
     * 当参考值类型为"引用参数"时，该字段填“定价参数定义”实体的主键
     */
    public java.lang.Integer pricingParamId;

    /**
     * 当“参考值类型“为”引用定价参考值“时，填被引用的源定价参考值标识
     */
    public java.lang.Integer sourceRefValueId;

    /**
     * 当“参考值类型”为“引用定价参考对象”时，填定价参考对象实体的主键
            
     */
    public java.lang.Integer pricingRefObjectId;

    /**
     * LOVB=PRC-C-0011
     */
    public java.lang.Integer valueType;

    /**
     * 费率单位的精度. 精确到小数点后的位数.
     */
    public java.lang.Integer ratePrecision;

    /**
     * 最终计算结果的精度. 精确到小数点后的位数.
     */
    public java.lang.Integer calcPrecision;

    /**
     * LOVB=PRC-C-0038
     */
    public java.lang.Integer adjustMethod;

    /**
     * 调整参考值标识
     */
    public java.lang.Integer adjustRefValueId;

    /**
     * 取整方式.LOVB=PRC-C-0013
     */
    public java.lang.Integer calcPrecisionMethod;

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
     * 设置 参考值定义的标识
     */
    public void setRefValueId(java.lang.Integer refValueId) {
        this.refValueId = refValueId;
    }

    /**
     * 获取 参考值定义的标识
     */
    public java.lang.Integer getRefValueId() {
        return this.refValueId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.refValueId = SeqUtils.createIntegerId(ID_SEQ);
         return this.refValueId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 参数值名称
     */
    public void setRefValueName(java.lang.String refValueName) {
        this.refValueName = refValueName;
    }

    /**
     * 获取 参数值名称
     */
    public java.lang.String getRefValueName() {
        return this.refValueName;
    }

    /**
     * 设置 参考值类型: 常量,引用定价参考对象,引用参数,引用定价参考值等。LOVB=PRC-C-0012
            
     */
    public void setRefValueType(java.lang.Integer refValueType) {
        this.refValueType = refValueType;
    }

    /**
     * 获取 参考值类型: 常量,引用定价参考对象,引用参数,引用定价参考值等。LOVB=PRC-C-0012
            
     */
    public java.lang.Integer getRefValueType() {
        return this.refValueType;
    }

    /**
     * 设置 若参考值类型是常量，该项有效，表示被引用的数值串
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }

    /**
     * 获取 若参考值类型是常量，该项有效，表示被引用的数值串
     */
    public java.lang.String getValueString() {
        return this.valueString;
    }

    /**
     * 设置 当参考值类型为"引用参数"时，该字段填“定价参数定义”实体的主键
     */
    public void setPricingParamId(java.lang.Integer pricingParamId) {
        this.pricingParamId = pricingParamId;
    }

    /**
     * 获取 当参考值类型为"引用参数"时，该字段填“定价参数定义”实体的主键
     */
    public java.lang.Integer getPricingParamId() {
        return this.pricingParamId;
    }

    /**
     * 设置 当“参考值类型“为”引用定价参考值“时，填被引用的源定价参考值标识
     */
    public void setSourceRefValueId(java.lang.Integer sourceRefValueId) {
        this.sourceRefValueId = sourceRefValueId;
    }

    /**
     * 获取 当“参考值类型“为”引用定价参考值“时，填被引用的源定价参考值标识
     */
    public java.lang.Integer getSourceRefValueId() {
        return this.sourceRefValueId;
    }

    /**
     * 设置 当“参考值类型”为“引用定价参考对象”时，填定价参考对象实体的主键
            
     */
    public void setPricingRefObjectId(java.lang.Integer pricingRefObjectId) {
        this.pricingRefObjectId = pricingRefObjectId;
    }

    /**
     * 获取 当“参考值类型”为“引用定价参考对象”时，填定价参考对象实体的主键
            
     */
    public java.lang.Integer getPricingRefObjectId() {
        return this.pricingRefObjectId;
    }

    /**
     * 设置 LOVB=PRC-C-0011
     */
    public void setValueType(java.lang.Integer valueType) {
        this.valueType = valueType;
    }

    /**
     * 获取 LOVB=PRC-C-0011
     */
    public java.lang.Integer getValueType() {
        return this.valueType;
    }

    /**
     * 设置 费率单位的精度. 精确到小数点后的位数.
     */
    public void setRatePrecision(java.lang.Integer ratePrecision) {
        this.ratePrecision = ratePrecision;
    }

    /**
     * 获取 费率单位的精度. 精确到小数点后的位数.
     */
    public java.lang.Integer getRatePrecision() {
        return this.ratePrecision;
    }

    /**
     * 设置 最终计算结果的精度. 精确到小数点后的位数.
     */
    public void setCalcPrecision(java.lang.Integer calcPrecision) {
        this.calcPrecision = calcPrecision;
    }

    /**
     * 获取 最终计算结果的精度. 精确到小数点后的位数.
     */
    public java.lang.Integer getCalcPrecision() {
        return this.calcPrecision;
    }

    /**
     * 设置 LOVB=PRC-C-0038
     */
    public void setAdjustMethod(java.lang.Integer adjustMethod) {
        this.adjustMethod = adjustMethod;
    }

    /**
     * 获取 LOVB=PRC-C-0038
     */
    public java.lang.Integer getAdjustMethod() {
        return this.adjustMethod;
    }

    /**
     * 设置 调整参考值标识
     */
    public void setAdjustRefValueId(java.lang.Integer adjustRefValueId) {
        this.adjustRefValueId = adjustRefValueId;
    }

    /**
     * 获取 调整参考值标识
     */
    public java.lang.Integer getAdjustRefValueId() {
        return this.adjustRefValueId;
    }

    /**
     * 设置 取整方式.LOVB=PRC-C-0013
     */
    public void setCalcPrecisionMethod(java.lang.Integer calcPrecisionMethod) {
        this.calcPrecisionMethod = calcPrecisionMethod;
    }

    /**
     * 获取 取整方式.LOVB=PRC-C-0013
     */
    public java.lang.Integer getCalcPrecisionMethod() {
        return this.calcPrecisionMethod;
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
