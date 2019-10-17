package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义了对合作伙伴所订购的销售品，进行计费的基本费用信息，佣金资费标准可分为一次性费用、周期性费用和使用费三种类型。
 * @实体表  :SETT_TARIFF
 */
public class SettTariffDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_TARIFF_S";

    /**
     * 资费标准的标识
     */
    public java.lang.Integer tariffId;

    /**
     * 用于表达本资费标准为一次性费用、周期性费用和使用费中的哪些类型。PRC-C-0010
     */
    public java.lang.Integer tariffType;

    /**
     * LOVB=PRC-C-0040
     */
    public java.lang.Integer calcResultType;

    /**
     * 说明该资费对应的帐目类型，在积量类型为金钱时有效
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 参考定价域资费单位实体中的资费单位标识
     */
    public java.lang.Integer tariffUnitId;

    /**
     * 计算方法标识
     */
    public java.lang.Integer calcMethodId;

    /**
     * 表示对于每次事件，固定收取的费率，引用定价参考值定义表
     */
    public java.lang.Integer rateValueId;

    /**
     * 用于指明在同一个段落下，执行资费标准的优先级，优先级数额小的，将得到优先的执行
     */
    public java.lang.Integer calcPriority;

    /**
     * 表示该资费标准向哪个付费方收取费用。
     */
    public java.lang.Integer settChargePartyId;

    /**
     * 资费段落标识
     */
    public java.lang.Integer pricingSectionId;

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
     * 设置 资费标准的标识
     */
    public void setTariffId(java.lang.Integer tariffId) {
        this.tariffId = tariffId;
    }

    /**
     * 获取 资费标准的标识
     */
    public java.lang.Integer getTariffId() {
        return this.tariffId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.tariffId = SeqUtils.createIntegerId(ID_SEQ);
         return this.tariffId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 用于表达本资费标准为一次性费用、周期性费用和使用费中的哪些类型。PRC-C-0010
     */
    public void setTariffType(java.lang.Integer tariffType) {
        this.tariffType = tariffType;
    }

    /**
     * 获取 用于表达本资费标准为一次性费用、周期性费用和使用费中的哪些类型。PRC-C-0010
     */
    public java.lang.Integer getTariffType() {
        return this.tariffType;
    }

    /**
     * 设置 LOVB=PRC-C-0040
     */
    public void setCalcResultType(java.lang.Integer calcResultType) {
        this.calcResultType = calcResultType;
    }

    /**
     * 获取 LOVB=PRC-C-0040
     */
    public java.lang.Integer getCalcResultType() {
        return this.calcResultType;
    }

    /**
     * 设置 说明该资费对应的帐目类型，在积量类型为金钱时有效
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 说明该资费对应的帐目类型，在积量类型为金钱时有效
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 参考定价域资费单位实体中的资费单位标识
     */
    public void setTariffUnitId(java.lang.Integer tariffUnitId) {
        this.tariffUnitId = tariffUnitId;
    }

    /**
     * 获取 参考定价域资费单位实体中的资费单位标识
     */
    public java.lang.Integer getTariffUnitId() {
        return this.tariffUnitId;
    }

    /**
     * 设置 计算方法标识
     */
    public void setCalcMethodId(java.lang.Integer calcMethodId) {
        this.calcMethodId = calcMethodId;
    }

    /**
     * 获取 计算方法标识
     */
    public java.lang.Integer getCalcMethodId() {
        return this.calcMethodId;
    }

    /**
     * 设置 表示对于每次事件，固定收取的费率，引用定价参考值定义表
     */
    public void setRateValueId(java.lang.Integer rateValueId) {
        this.rateValueId = rateValueId;
    }

    /**
     * 获取 表示对于每次事件，固定收取的费率，引用定价参考值定义表
     */
    public java.lang.Integer getRateValueId() {
        return this.rateValueId;
    }

    /**
     * 设置 用于指明在同一个段落下，执行资费标准的优先级，优先级数额小的，将得到优先的执行
     */
    public void setCalcPriority(java.lang.Integer calcPriority) {
        this.calcPriority = calcPriority;
    }

    /**
     * 获取 用于指明在同一个段落下，执行资费标准的优先级，优先级数额小的，将得到优先的执行
     */
    public java.lang.Integer getCalcPriority() {
        return this.calcPriority;
    }

    /**
     * 设置 表示该资费标准向哪个付费方收取费用。
     */
    public void setSettChargePartyId(java.lang.Integer settChargePartyId) {
        this.settChargePartyId = settChargePartyId;
    }

    /**
     * 获取 表示该资费标准向哪个付费方收取费用。
     */
    public java.lang.Integer getSettChargePartyId() {
        return this.settChargePartyId;
    }

    /**
     * 设置 资费段落标识
     */
    public void setPricingSectionId(java.lang.Integer pricingSectionId) {
        this.pricingSectionId = pricingSectionId;
    }

    /**
     * 获取 资费段落标识
     */
    public java.lang.Integer getPricingSectionId() {
        return this.pricingSectionId;
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
