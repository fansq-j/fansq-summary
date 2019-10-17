package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:模板参数值规格,模板参数类型定义为枚举型或范围型时,采用此表记录模板参数定义的可选参数值或取值范围。
 * @实体表  :TEMPLATE_PARAM_VALUE_SPEC
 */
public class TemplateParamValueSpecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_PARAM_VALUE_SPEC_S";

    /**
     * 模板参数值规格标识。
     */
    public java.lang.Integer templateParamValueSpecId;

    /**
     * 模板参数标识。
     */
    public java.lang.Integer templateParamId;

    /**
     * 模板参数值规格名称。
     */
    public java.lang.String templateParamValueSpecName;

    /**
     * 模板参数值规格描述。
     */
    public java.lang.String templateParamValueSpecDesc;

    /**
     * 模板参数类型标识。
     */
    public java.lang.Integer templateParamTypeId;

    /**
     * 当模板参数类型为枚举型时，填写枚举取值，参数类型为范围型时，该字段为空
     */
    public java.lang.String templateParamEnumValue;

    /**
     * 当模板参数类型为范围型时，填写上限值
     */
    public java.lang.String paramValueRangeMax;

    /**
     * 当模板参数类型为范围型时，填写下限值
     */
    public java.lang.String paramValueRangeMin;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 是否显示
     */
    public java.lang.Integer ifDisplay;

    /**
     * 设置 模板参数值规格标识。
     */
    public void setTemplateParamValueSpecId(java.lang.Integer templateParamValueSpecId) {
        this.templateParamValueSpecId = templateParamValueSpecId;
    }

    /**
     * 获取 模板参数值规格标识。
     */
    public java.lang.Integer getTemplateParamValueSpecId() {
        return this.templateParamValueSpecId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.templateParamValueSpecId = SeqUtils.createIntegerId(ID_SEQ);
         return this.templateParamValueSpecId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 模板参数标识。
     */
    public void setTemplateParamId(java.lang.Integer templateParamId) {
        this.templateParamId = templateParamId;
    }

    /**
     * 获取 模板参数标识。
     */
    public java.lang.Integer getTemplateParamId() {
        return this.templateParamId;
    }

    /**
     * 设置 模板参数值规格名称。
     */
    public void setTemplateParamValueSpecName(java.lang.String templateParamValueSpecName) {
        this.templateParamValueSpecName = templateParamValueSpecName;
    }

    /**
     * 获取 模板参数值规格名称。
     */
    public java.lang.String getTemplateParamValueSpecName() {
        return this.templateParamValueSpecName;
    }

    /**
     * 设置 模板参数值规格描述。
     */
    public void setTemplateParamValueSpecDesc(java.lang.String templateParamValueSpecDesc) {
        this.templateParamValueSpecDesc = templateParamValueSpecDesc;
    }

    /**
     * 获取 模板参数值规格描述。
     */
    public java.lang.String getTemplateParamValueSpecDesc() {
        return this.templateParamValueSpecDesc;
    }

    /**
     * 设置 模板参数类型标识。
     */
    public void setTemplateParamTypeId(java.lang.Integer templateParamTypeId) {
        this.templateParamTypeId = templateParamTypeId;
    }

    /**
     * 获取 模板参数类型标识。
     */
    public java.lang.Integer getTemplateParamTypeId() {
        return this.templateParamTypeId;
    }

    /**
     * 设置 当模板参数类型为枚举型时，填写枚举取值，参数类型为范围型时，该字段为空
     */
    public void setTemplateParamEnumValue(java.lang.String templateParamEnumValue) {
        this.templateParamEnumValue = templateParamEnumValue;
    }

    /**
     * 获取 当模板参数类型为枚举型时，填写枚举取值，参数类型为范围型时，该字段为空
     */
    public java.lang.String getTemplateParamEnumValue() {
        return this.templateParamEnumValue;
    }

    /**
     * 设置 当模板参数类型为范围型时，填写上限值
     */
    public void setParamValueRangeMax(java.lang.String paramValueRangeMax) {
        this.paramValueRangeMax = paramValueRangeMax;
    }

    /**
     * 获取 当模板参数类型为范围型时，填写上限值
     */
    public java.lang.String getParamValueRangeMax() {
        return this.paramValueRangeMax;
    }

    /**
     * 设置 当模板参数类型为范围型时，填写下限值
     */
    public void setParamValueRangeMin(java.lang.String paramValueRangeMin) {
        this.paramValueRangeMin = paramValueRangeMin;
    }

    /**
     * 获取 当模板参数类型为范围型时，填写下限值
     */
    public java.lang.String getParamValueRangeMin() {
        return this.paramValueRangeMin;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 是否显示
     */
    public void setIfDisplay(java.lang.Integer ifDisplay) {
        this.ifDisplay = ifDisplay;
    }

    /**
     * 获取 是否显示
     */
    public java.lang.Integer getIfDisplay() {
        return this.ifDisplay;
    }

}
