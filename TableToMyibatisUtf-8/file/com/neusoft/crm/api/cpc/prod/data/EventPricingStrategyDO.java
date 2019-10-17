package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:事件定价策略就是定义针对一个特定计费帐务事件进行费用计算的方法，对资费和优惠的描述和表达均适用。

                                           -&#
 * @实体表  :EVENT_PRICING_STRATEGY
 */
public class EventPricingStrategyDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_PRICING_STRATEGY_S";

    /**
     * 事件定价策略的标识
     */
    public java.lang.Integer eventPricingStrategyId;

    /**
     * 计费帐务事件类型的唯一标识。
            如果event_type_flag=1时填目标事件类型标识，为2时填事件类型组标识
     */
    public java.lang.Integer eventTypeId;

    /**
     * PRC-C-0022
            
     */
    public java.lang.Integer eventTypeFlag;

    /**
     * 事件定价策略名称，用于标识
     */
    public java.lang.String eventPricingStrategyName;

    /**
     * 详细描述事件定价策略，使用户可以更好地复用事件定价策略
     */
    public java.lang.String eventPricingStrategyDesc;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * LOVB=PRC-C-0034
     */
    public java.lang.Integer eventPricingStrategyType;

    /**
     * 区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 状态.LOVB=PRC-C-0026
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
     * 设置 事件定价策略的标识
     */
    public void setEventPricingStrategyId(java.lang.Integer eventPricingStrategyId) {
        this.eventPricingStrategyId = eventPricingStrategyId;
    }

    /**
     * 获取 事件定价策略的标识
     */
    public java.lang.Integer getEventPricingStrategyId() {
        return this.eventPricingStrategyId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.eventPricingStrategyId = SeqUtils.createIntegerId(ID_SEQ);
         return this.eventPricingStrategyId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 计费帐务事件类型的唯一标识。
            如果event_type_flag=1时填目标事件类型标识，为2时填事件类型组标识
     */
    public void setEventTypeId(java.lang.Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 获取 计费帐务事件类型的唯一标识。
            如果event_type_flag=1时填目标事件类型标识，为2时填事件类型组标识
     */
    public java.lang.Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * 设置 PRC-C-0022
            
     */
    public void setEventTypeFlag(java.lang.Integer eventTypeFlag) {
        this.eventTypeFlag = eventTypeFlag;
    }

    /**
     * 获取 PRC-C-0022
            
     */
    public java.lang.Integer getEventTypeFlag() {
        return this.eventTypeFlag;
    }

    /**
     * 设置 事件定价策略名称，用于标识
     */
    public void setEventPricingStrategyName(java.lang.String eventPricingStrategyName) {
        this.eventPricingStrategyName = eventPricingStrategyName;
    }

    /**
     * 获取 事件定价策略名称，用于标识
     */
    public java.lang.String getEventPricingStrategyName() {
        return this.eventPricingStrategyName;
    }

    /**
     * 设置 详细描述事件定价策略，使用户可以更好地复用事件定价策略
     */
    public void setEventPricingStrategyDesc(java.lang.String eventPricingStrategyDesc) {
        this.eventPricingStrategyDesc = eventPricingStrategyDesc;
    }

    /**
     * 获取 详细描述事件定价策略，使用户可以更好地复用事件定价策略
     */
    public java.lang.String getEventPricingStrategyDesc() {
        return this.eventPricingStrategyDesc;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 LOVB=PRC-C-0034
     */
    public void setEventPricingStrategyType(java.lang.Integer eventPricingStrategyType) {
        this.eventPricingStrategyType = eventPricingStrategyType;
    }

    /**
     * 获取 LOVB=PRC-C-0034
     */
    public java.lang.Integer getEventPricingStrategyType() {
        return this.eventPricingStrategyType;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026
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
