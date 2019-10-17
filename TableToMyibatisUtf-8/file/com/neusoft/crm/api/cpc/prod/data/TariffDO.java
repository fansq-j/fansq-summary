package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义了对客户所使用的产品进行计费的基本费用信息，资费标准可分为一次性费用、周期性费用和使用费三种类型。
 * @实体表  :TARIFF
 */
public class TariffDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TARIFF_S";

    /**
     * 资费标准的标识
     */
    public java.lang.Integer tariffId;

    /**
     * 用于表达本资费标准为一次性费用、周期性费用和使用费中的哪些类型。PRC-C-0010
     */
    public java.lang.Integer tariffType;

    /**
     * 说明该资费标准归属的定价段落标识
     */
    public java.lang.Integer pricingSectionId;

    /**
     * 用于说明该优惠将对哪种积量类型产生影响，主要用于赠送固定值
            当量本类型组标志为1时，为量本类型组标志. 0，则为量本类型.
     */
    public java.lang.Integer accuTypeId;

    /**
     * LOVB=PRC-C-0033
     */
    public java.lang.Integer accuTypeGroupFlag;

    /**
     * 服务提供标识. 与客户交互事件子域中实体服务提供关联。
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 说明该资费对应的帐目类型，在积量类型为金钱时有效
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 资费标准依靠何种单位进行度量和计算费用，如流量M数、分钟数、秒数等
     */
    public java.lang.Integer tariffUnitId;

    /**
     * 引用资费计算方法描述实体的主键
     */
    public java.lang.Integer calcMethodId;

    /**
     * 定义一个累积周期的主键
     */
    public java.lang.Integer ratableCycleId;

    /**
     * 表示费率是按照每多少个计费单元（即前面定义的"资费单位标识"）进行计价，如每6秒收一笔钱，这个6秒就是计费单元数
     */
    public java.lang.Integer rateUnit;

    /**
     * 表示对于每次事件，固定收取的费率
     */
    public java.lang.Integer fixedRateValueId;

    /**
     * 表示按照前面定义的计算单元数，收取的每单元的费率
     */
    public java.lang.Integer scaledRateValueId;

    /**
     * 用于指明在同一个段落下，执行资费标准的优先级，优先级数额小的，将得到优先的执行
     */
    public java.lang.Integer calcPriority;

    /**
     * 说明计算归属的周期所需要的偏移量。
     */
    public java.lang.Integer belongCycleDuration;

    /**
     * 分子参考值
     */
    public java.lang.Integer numerator;

    /**
     * 表示该资费标准向哪个付费方收取费用。PRC-C-0037
     */
    public java.lang.Integer chargePartyId;

    /**
     * 分母参考值
     */
    public java.lang.Integer denominator;

    /**
     * 当累计量是群内成员共享时，属主对象类型选择群商品实例，否则选择基本商品实例。PRC-C-0004
     */
    public java.lang.Integer accuOwnerType;

    /**
     * LOVB=PRC-C-0013
     */
    public java.lang.Integer calcPrecisionMethod;

    /**
     * LOVB=PRC-C-0040
     */
    public java.lang.Integer calcResultType;

    /**
     * 资费描述
     */
    public java.lang.String tariffDesc;

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
     * 设置 说明该资费标准归属的定价段落标识
     */
    public void setPricingSectionId(java.lang.Integer pricingSectionId) {
        this.pricingSectionId = pricingSectionId;
    }

    /**
     * 获取 说明该资费标准归属的定价段落标识
     */
    public java.lang.Integer getPricingSectionId() {
        return this.pricingSectionId;
    }

    /**
     * 设置 用于说明该优惠将对哪种积量类型产生影响，主要用于赠送固定值
            当量本类型组标志为1时，为量本类型组标志. 0，则为量本类型.
     */
    public void setAccuTypeId(java.lang.Integer accuTypeId) {
        this.accuTypeId = accuTypeId;
    }

    /**
     * 获取 用于说明该优惠将对哪种积量类型产生影响，主要用于赠送固定值
            当量本类型组标志为1时，为量本类型组标志. 0，则为量本类型.
     */
    public java.lang.Integer getAccuTypeId() {
        return this.accuTypeId;
    }

    /**
     * 设置 LOVB=PRC-C-0033
     */
    public void setAccuTypeGroupFlag(java.lang.Integer accuTypeGroupFlag) {
        this.accuTypeGroupFlag = accuTypeGroupFlag;
    }

    /**
     * 获取 LOVB=PRC-C-0033
     */
    public java.lang.Integer getAccuTypeGroupFlag() {
        return this.accuTypeGroupFlag;
    }

    /**
     * 设置 服务提供标识. 与客户交互事件子域中实体服务提供关联。
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供标识. 与客户交互事件子域中实体服务提供关联。
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
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
     * 设置 资费标准依靠何种单位进行度量和计算费用，如流量M数、分钟数、秒数等
     */
    public void setTariffUnitId(java.lang.Integer tariffUnitId) {
        this.tariffUnitId = tariffUnitId;
    }

    /**
     * 获取 资费标准依靠何种单位进行度量和计算费用，如流量M数、分钟数、秒数等
     */
    public java.lang.Integer getTariffUnitId() {
        return this.tariffUnitId;
    }

    /**
     * 设置 引用资费计算方法描述实体的主键
     */
    public void setCalcMethodId(java.lang.Integer calcMethodId) {
        this.calcMethodId = calcMethodId;
    }

    /**
     * 获取 引用资费计算方法描述实体的主键
     */
    public java.lang.Integer getCalcMethodId() {
        return this.calcMethodId;
    }

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
     * 设置 表示费率是按照每多少个计费单元（即前面定义的"资费单位标识"）进行计价，如每6秒收一笔钱，这个6秒就是计费单元数
     */
    public void setRateUnit(java.lang.Integer rateUnit) {
        this.rateUnit = rateUnit;
    }

    /**
     * 获取 表示费率是按照每多少个计费单元（即前面定义的"资费单位标识"）进行计价，如每6秒收一笔钱，这个6秒就是计费单元数
     */
    public java.lang.Integer getRateUnit() {
        return this.rateUnit;
    }

    /**
     * 设置 表示对于每次事件，固定收取的费率
     */
    public void setFixedRateValueId(java.lang.Integer fixedRateValueId) {
        this.fixedRateValueId = fixedRateValueId;
    }

    /**
     * 获取 表示对于每次事件，固定收取的费率
     */
    public java.lang.Integer getFixedRateValueId() {
        return this.fixedRateValueId;
    }

    /**
     * 设置 表示按照前面定义的计算单元数，收取的每单元的费率
     */
    public void setScaledRateValueId(java.lang.Integer scaledRateValueId) {
        this.scaledRateValueId = scaledRateValueId;
    }

    /**
     * 获取 表示按照前面定义的计算单元数，收取的每单元的费率
     */
    public java.lang.Integer getScaledRateValueId() {
        return this.scaledRateValueId;
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
     * 设置 说明计算归属的周期所需要的偏移量。
     */
    public void setBelongCycleDuration(java.lang.Integer belongCycleDuration) {
        this.belongCycleDuration = belongCycleDuration;
    }

    /**
     * 获取 说明计算归属的周期所需要的偏移量。
     */
    public java.lang.Integer getBelongCycleDuration() {
        return this.belongCycleDuration;
    }

    /**
     * 设置 分子参考值
     */
    public void setNumerator(java.lang.Integer numerator) {
        this.numerator = numerator;
    }

    /**
     * 获取 分子参考值
     */
    public java.lang.Integer getNumerator() {
        return this.numerator;
    }

    /**
     * 设置 表示该资费标准向哪个付费方收取费用。PRC-C-0037
     */
    public void setChargePartyId(java.lang.Integer chargePartyId) {
        this.chargePartyId = chargePartyId;
    }

    /**
     * 获取 表示该资费标准向哪个付费方收取费用。PRC-C-0037
     */
    public java.lang.Integer getChargePartyId() {
        return this.chargePartyId;
    }

    /**
     * 设置 分母参考值
     */
    public void setDenominator(java.lang.Integer denominator) {
        this.denominator = denominator;
    }

    /**
     * 获取 分母参考值
     */
    public java.lang.Integer getDenominator() {
        return this.denominator;
    }

    /**
     * 设置 当累计量是群内成员共享时，属主对象类型选择群商品实例，否则选择基本商品实例。PRC-C-0004
     */
    public void setAccuOwnerType(java.lang.Integer accuOwnerType) {
        this.accuOwnerType = accuOwnerType;
    }

    /**
     * 获取 当累计量是群内成员共享时，属主对象类型选择群商品实例，否则选择基本商品实例。PRC-C-0004
     */
    public java.lang.Integer getAccuOwnerType() {
        return this.accuOwnerType;
    }

    /**
     * 设置 LOVB=PRC-C-0013
     */
    public void setCalcPrecisionMethod(java.lang.Integer calcPrecisionMethod) {
        this.calcPrecisionMethod = calcPrecisionMethod;
    }

    /**
     * 获取 LOVB=PRC-C-0013
     */
    public java.lang.Integer getCalcPrecisionMethod() {
        return this.calcPrecisionMethod;
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
     * 设置 资费描述
     */
    public void setTariffDesc(java.lang.String tariffDesc) {
        this.tariffDesc = tariffDesc;
    }

    /**
     * 获取 资费描述
     */
    public java.lang.String getTariffDesc() {
        return this.tariffDesc;
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
