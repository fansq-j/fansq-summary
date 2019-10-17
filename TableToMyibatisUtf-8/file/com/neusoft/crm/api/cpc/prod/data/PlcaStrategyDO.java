package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义PLCA策略的基本信息。如：停复机策略、流量限停策略、电子钱包代扣策略、流量阀值提醒策略、超量降速策略。
 * @实体表  :PLCA_STRATEGY
 */
public class PlcaStrategyDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_STRATEGY_S";

    /**
     * 策略的唯一标识
     */
    public java.lang.Integer strategyId;

    /**
     * 对策略进行命名
     */
    public java.lang.String strategyName;

    /**
     * 事件类型标识LOVB=PLC-C-0041
     */
    public java.lang.Integer eventTypeId;

    /**
     * PRC-C-0022
     */
    public java.lang.Integer eventTypeFlag;

    /**
     * 策略组的唯一标识
     */
    public java.lang.Integer strategyGroupId;

    /**
     * 定义同一个事件类型不同策略之间的执行顺序，从小到大执行。
     */
    public java.lang.Integer priority;

    /**
     * 对策略进行分类。PLC-C-0002
     */
    public java.lang.Integer strategyType;

    /**
     * 区域标识
     */
    public java.lang.Integer regionId;

    /**
     * LOVB=PLC-C-0026
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
     * 设置 策略的唯一标识
     */
    public void setStrategyId(java.lang.Integer strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * 获取 策略的唯一标识
     */
    public java.lang.Integer getStrategyId() {
        return this.strategyId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.strategyId = SeqUtils.createIntegerId(ID_SEQ);
         return this.strategyId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对策略进行命名
     */
    public void setStrategyName(java.lang.String strategyName) {
        this.strategyName = strategyName;
    }

    /**
     * 获取 对策略进行命名
     */
    public java.lang.String getStrategyName() {
        return this.strategyName;
    }

    /**
     * 设置 事件类型标识LOVB=PLC-C-0041
     */
    public void setEventTypeId(java.lang.Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 获取 事件类型标识LOVB=PLC-C-0041
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
     * 设置 策略组的唯一标识
     */
    public void setStrategyGroupId(java.lang.Integer strategyGroupId) {
        this.strategyGroupId = strategyGroupId;
    }

    /**
     * 获取 策略组的唯一标识
     */
    public java.lang.Integer getStrategyGroupId() {
        return this.strategyGroupId;
    }

    /**
     * 设置 定义同一个事件类型不同策略之间的执行顺序，从小到大执行。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 定义同一个事件类型不同策略之间的执行顺序，从小到大执行。
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 对策略进行分类。PLC-C-0002
     */
    public void setStrategyType(java.lang.Integer strategyType) {
        this.strategyType = strategyType;
    }

    /**
     * 获取 对策略进行分类。PLC-C-0002
     */
    public java.lang.Integer getStrategyType() {
        return this.strategyType;
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
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
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
