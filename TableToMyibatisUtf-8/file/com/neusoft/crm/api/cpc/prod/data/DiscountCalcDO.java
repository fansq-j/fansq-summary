package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:构成定价过程中费用调整方案的具体实现方法，每个定价过程可包含一个或多个优惠计算。优惠计算方式包括折扣、赠送、减免、封顶保
 * @实体表  :DISCOUNT_CALC
 */
public class DiscountCalcDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DISCOUNT_CALC_S";

    /**
     * 优惠计算的标识
     */
    public java.lang.Integer discountExpressId;

    /**
     * LOVB=PRC-C-0039
     */
    public java.lang.Integer calcMethodId;

    /**
     * 服务提供标识. 与客户交互事件子域中实体服务提供关联。
     */
    public java.lang.Integer serviceOfferId;

    /**
     * LOVB=PRC-C-0040
     */
    public java.lang.Integer calcResultType;

    /**
     * 定价段落的标识
     */
    public java.lang.Integer pricingSectionId;

    /**
     * 指定折扣率的取值，主要用于折扣计算时确定具体的折扣率
     */
    public java.lang.Integer discountRateValueId;

    /**
     * 赠送的固定额取值，主要用于赠送计算时确定具体赠送的数额
     */
    public java.lang.Integer fixedValueId;

    /**
     * 上限值（封顶）
     */
    public java.lang.Integer startRefValueId;

    /**
     * 下限值（保底）
     */
    public java.lang.Integer endRefValueId;

    /**
     * 用于指明在同一个段落下，执行资费标准的优先级，优先级数额小的，将得到优先的执行
     */
    public java.lang.Integer calcPriority;

    /**
     * 优惠描述
     */
    public java.lang.String discountDesc;

    /**
     * LOVB=PRC-C-0027
     */
    public java.lang.Integer firstMonthCalc;

    /**
     * 主数据PLC-C-0012
     */
    public java.lang.Integer firstEffDateType;

    /**
     * 累计周期标识
     */
    public java.lang.Integer ratableCycleId;

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
     * 设置 优惠计算的标识
     */
    public void setDiscountExpressId(java.lang.Integer discountExpressId) {
        this.discountExpressId = discountExpressId;
    }

    /**
     * 获取 优惠计算的标识
     */
    public java.lang.Integer getDiscountExpressId() {
        return this.discountExpressId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.discountExpressId = SeqUtils.createIntegerId(ID_SEQ);
         return this.discountExpressId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 LOVB=PRC-C-0039
     */
    public void setCalcMethodId(java.lang.Integer calcMethodId) {
        this.calcMethodId = calcMethodId;
    }

    /**
     * 获取 LOVB=PRC-C-0039
     */
    public java.lang.Integer getCalcMethodId() {
        return this.calcMethodId;
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
     * 设置 定价段落的标识
     */
    public void setPricingSectionId(java.lang.Integer pricingSectionId) {
        this.pricingSectionId = pricingSectionId;
    }

    /**
     * 获取 定价段落的标识
     */
    public java.lang.Integer getPricingSectionId() {
        return this.pricingSectionId;
    }

    /**
     * 设置 指定折扣率的取值，主要用于折扣计算时确定具体的折扣率
     */
    public void setDiscountRateValueId(java.lang.Integer discountRateValueId) {
        this.discountRateValueId = discountRateValueId;
    }

    /**
     * 获取 指定折扣率的取值，主要用于折扣计算时确定具体的折扣率
     */
    public java.lang.Integer getDiscountRateValueId() {
        return this.discountRateValueId;
    }

    /**
     * 设置 赠送的固定额取值，主要用于赠送计算时确定具体赠送的数额
     */
    public void setFixedValueId(java.lang.Integer fixedValueId) {
        this.fixedValueId = fixedValueId;
    }

    /**
     * 获取 赠送的固定额取值，主要用于赠送计算时确定具体赠送的数额
     */
    public java.lang.Integer getFixedValueId() {
        return this.fixedValueId;
    }

    /**
     * 设置 上限值（封顶）
     */
    public void setStartRefValueId(java.lang.Integer startRefValueId) {
        this.startRefValueId = startRefValueId;
    }

    /**
     * 获取 上限值（封顶）
     */
    public java.lang.Integer getStartRefValueId() {
        return this.startRefValueId;
    }

    /**
     * 设置 下限值（保底）
     */
    public void setEndRefValueId(java.lang.Integer endRefValueId) {
        this.endRefValueId = endRefValueId;
    }

    /**
     * 获取 下限值（保底）
     */
    public java.lang.Integer getEndRefValueId() {
        return this.endRefValueId;
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
     * 设置 优惠描述
     */
    public void setDiscountDesc(java.lang.String discountDesc) {
        this.discountDesc = discountDesc;
    }

    /**
     * 获取 优惠描述
     */
    public java.lang.String getDiscountDesc() {
        return this.discountDesc;
    }

    /**
     * 设置 LOVB=PRC-C-0027
     */
    public void setFirstMonthCalc(java.lang.Integer firstMonthCalc) {
        this.firstMonthCalc = firstMonthCalc;
    }

    /**
     * 获取 LOVB=PRC-C-0027
     */
    public java.lang.Integer getFirstMonthCalc() {
        return this.firstMonthCalc;
    }

    /**
     * 设置 主数据PLC-C-0012
     */
    public void setFirstEffDateType(java.lang.Integer firstEffDateType) {
        this.firstEffDateType = firstEffDateType;
    }

    /**
     * 获取 主数据PLC-C-0012
     */
    public java.lang.Integer getFirstEffDateType() {
        return this.firstEffDateType;
    }

    /**
     * 设置 累计周期标识
     */
    public void setRatableCycleId(java.lang.Integer ratableCycleId) {
        this.ratableCycleId = ratableCycleId;
    }

    /**
     * 获取 累计周期标识
     */
    public java.lang.Integer getRatableCycleId() {
        return this.ratableCycleId;
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
