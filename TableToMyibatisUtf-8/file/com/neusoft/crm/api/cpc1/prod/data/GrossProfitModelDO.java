package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:毛利模型表。
 * @实体表  :GROSS_PROFIT_MODEL
 */
public class GrossProfitModelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GROSS_PROFIT_MODEL_S";

    /**
     * 毛利模型主键
     */
    public java.lang.Long grossProfitModelId;

    /**
     * 上级id
     */
    public java.lang.Long parGrossProfitModelId;

    /**
     * 参数名称
     */
    public java.lang.String paramName;

    /**
     * 参数类型1000下拉框2000输入框3000企信测算4000计算得到
     */
    public java.lang.String paramType;

    /**
     * 模板类型
     */
    public java.lang.String modelType;

    /**
     * 模板id
     */
    public java.lang.String modelId;

    /**
     * 是否显示
     */
    public java.lang.String isShow;

    /**
     * 数据来源
     */
    public java.lang.String dataResourse;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 毛利模型主键
     */
    public void setGrossProfitModelId(java.lang.Long grossProfitModelId) {
        this.grossProfitModelId = grossProfitModelId;
    }

    /**
     * 获取 毛利模型主键
     */
    public java.lang.Long getGrossProfitModelId() {
        return this.grossProfitModelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.grossProfitModelId = SeqUtils.createLongId(ID_SEQ);
         return this.grossProfitModelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 上级id
     */
    public void setParGrossProfitModelId(java.lang.Long parGrossProfitModelId) {
        this.parGrossProfitModelId = parGrossProfitModelId;
    }

    /**
     * 获取 上级id
     */
    public java.lang.Long getParGrossProfitModelId() {
        return this.parGrossProfitModelId;
    }

    /**
     * 设置 参数名称
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }

    /**
     * 获取 参数名称
     */
    public java.lang.String getParamName() {
        return this.paramName;
    }

    /**
     * 设置 参数类型1000下拉框2000输入框3000企信测算4000计算得到
     */
    public void setParamType(java.lang.String paramType) {
        this.paramType = paramType;
    }

    /**
     * 获取 参数类型1000下拉框2000输入框3000企信测算4000计算得到
     */
    public java.lang.String getParamType() {
        return this.paramType;
    }

    /**
     * 设置 模板类型
     */
    public void setModelType(java.lang.String modelType) {
        this.modelType = modelType;
    }

    /**
     * 获取 模板类型
     */
    public java.lang.String getModelType() {
        return this.modelType;
    }

    /**
     * 设置 模板id
     */
    public void setModelId(java.lang.String modelId) {
        this.modelId = modelId;
    }

    /**
     * 获取 模板id
     */
    public java.lang.String getModelId() {
        return this.modelId;
    }

    /**
     * 设置 是否显示
     */
    public void setIsShow(java.lang.String isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取 是否显示
     */
    public java.lang.String getIsShow() {
        return this.isShow;
    }

    /**
     * 设置 数据来源
     */
    public void setDataResourse(java.lang.String dataResourse) {
        this.dataResourse = dataResourse;
    }

    /**
     * 获取 数据来源
     */
    public java.lang.String getDataResourse() {
        return this.dataResourse;
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
