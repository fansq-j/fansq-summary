package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表达了一个资费标准依靠何  单位进行度量和计算费用。该表用于记录模型所支持的各种资费单位。如分钟数,流量M数,秒数等。
 * @实体表  :TARIFF_UNIT
 */
public class TariffUnitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TARIFF_UNIT_S";

    /**
     * 资费单位的标识
     */
    public java.lang.Integer tariffUnitId;

    /**
     * 名称，具体说明该资费单位含义
     */
    public java.lang.String tariffUnitName;

    /**
     * 指从度量方法的标准单位换算到本单位的比率，比如度量方法为时长，标准单位为秒。如果本单位为分钟，则换算比率为60。
     */
    public java.lang.Double standardConversionRate;

    /**
     * 度量方法标识
     */
    public java.lang.Integer measureMethodId;

    /**
     * LOVB=PRC-C-0026
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
     * 设置 资费单位的标识
     */
    public void setTariffUnitId(java.lang.Integer tariffUnitId) {
        this.tariffUnitId = tariffUnitId;
    }

    /**
     * 获取 资费单位的标识
     */
    public java.lang.Integer getTariffUnitId() {
        return this.tariffUnitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.tariffUnitId = SeqUtils.createIntegerId(ID_SEQ);
         return this.tariffUnitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 名称，具体说明该资费单位含义
     */
    public void setTariffUnitName(java.lang.String tariffUnitName) {
        this.tariffUnitName = tariffUnitName;
    }

    /**
     * 获取 名称，具体说明该资费单位含义
     */
    public java.lang.String getTariffUnitName() {
        return this.tariffUnitName;
    }

    /**
     * 设置 指从度量方法的标准单位换算到本单位的比率，比如度量方法为时长，标准单位为秒。如果本单位为分钟，则换算比率为60。
     */
    public void setStandardConversionRate(java.lang.Double standardConversionRate) {
        this.standardConversionRate = standardConversionRate;
    }

    /**
     * 获取 指从度量方法的标准单位换算到本单位的比率，比如度量方法为时长，标准单位为秒。如果本单位为分钟，则换算比率为60。
     */
    public java.lang.Double getStandardConversionRate() {
        return this.standardConversionRate;
    }

    /**
     * 设置 度量方法标识
     */
    public void setMeasureMethodId(java.lang.Integer measureMethodId) {
        this.measureMethodId = measureMethodId;
    }

    /**
     * 获取 度量方法标识
     */
    public java.lang.Integer getMeasureMethodId() {
        return this.measureMethodId;
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
