package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:毛利模型参数取值表。
 * @实体表  :GROSS_PROFIT_MODEL_DATA
 */
public class GrossProfitModelDataDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GROSS_PROFIT_MODEL_DATA_S";

    /**
     * 毛利模型参数取值表主键
     */
    public java.lang.Long grossProfitModelDataId;

    /**
     * 毛利模型主键
     */
    public java.lang.Long grossProfitModelId;

    /**
     * 参数名称
     */
    public java.lang.String grossProfitParamName;

    /**
     * 参数对应取值 政企：1；公众：0；合约：1；非合约：0
     */
    public java.lang.String grossProfitParamValue;

    /**
     * 区域id
     */
    public java.lang.String commonRegionId;

    /**
     * 区域对应取值
     */
    public java.lang.String commonRegionValue;

    /**
     * 模型类型 融合套餐（4G）评估模型：100；4G单产品毛利估模型：101；融合套餐（非4G）评估模型：102；非4G单产品毛利评估模型：103；语音包：104；流量包：105；
     */
    public java.lang.String modelType;

    /**
     * 状态
     */
    public java.lang.String status;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 毛利模型参数取值表主键
     */
    public void setGrossProfitModelDataId(java.lang.Long grossProfitModelDataId) {
        this.grossProfitModelDataId = grossProfitModelDataId;
    }

    /**
     * 获取 毛利模型参数取值表主键
     */
    public java.lang.Long getGrossProfitModelDataId() {
        return this.grossProfitModelDataId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.grossProfitModelDataId = SeqUtils.createLongId(ID_SEQ);
         return this.grossProfitModelDataId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 参数名称
     */
    public void setGrossProfitParamName(java.lang.String grossProfitParamName) {
        this.grossProfitParamName = grossProfitParamName;
    }

    /**
     * 获取 参数名称
     */
    public java.lang.String getGrossProfitParamName() {
        return this.grossProfitParamName;
    }

    /**
     * 设置 参数对应取值 政企：1；公众：0；合约：1；非合约：0
     */
    public void setGrossProfitParamValue(java.lang.String grossProfitParamValue) {
        this.grossProfitParamValue = grossProfitParamValue;
    }

    /**
     * 获取 参数对应取值 政企：1；公众：0；合约：1；非合约：0
     */
    public java.lang.String getGrossProfitParamValue() {
        return this.grossProfitParamValue;
    }

    /**
     * 设置 区域id
     */
    public void setCommonRegionId(java.lang.String commonRegionId) {
        this.commonRegionId = commonRegionId;
    }

    /**
     * 获取 区域id
     */
    public java.lang.String getCommonRegionId() {
        return this.commonRegionId;
    }

    /**
     * 设置 区域对应取值
     */
    public void setCommonRegionValue(java.lang.String commonRegionValue) {
        this.commonRegionValue = commonRegionValue;
    }

    /**
     * 获取 区域对应取值
     */
    public java.lang.String getCommonRegionValue() {
        return this.commonRegionValue;
    }

    /**
     * 设置 模型类型 融合套餐（4G）评估模型：100；4G单产品毛利估模型：101；融合套餐（非4G）评估模型：102；非4G单产品毛利评估模型：103；语音包：104；流量包：105；
     */
    public void setModelType(java.lang.String modelType) {
        this.modelType = modelType;
    }

    /**
     * 获取 模型类型 融合套餐（4G）评估模型：100；4G单产品毛利估模型：101；融合套餐（非4G）评估模型：102；非4G单产品毛利评估模型：103；语音包：104；流量包：105；
     */
    public java.lang.String getModelType() {
        return this.modelType;
    }

    /**
     * 设置 状态
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    /**
     * 获取 状态
     */
    public java.lang.String getStatus() {
        return this.status;
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
