package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:在电信企业制定市场营销计划和运营支撑过程，确定一个特定计费帐务事件的定价因素很多，在定价域模型中通过定义一棵以定价过程为
 * @实体表  :PRICING_SECTION
 */
public class PricingSectionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_SECTION_S";

    /**
     * 定价段落的标识
     */
    public java.lang.Integer pricingSectionId;

    /**
     * 说明如何进行分段。LOVB=PRC-C-0003.
     */
    public java.lang.Integer sectionCalcType;

    /**
     * 定价段落名称，一般不用。特殊情况下，用于说明本段落的判断意图
     */
    public java.lang.String pricingSectionName;

    /**
     * 当定价段落为循环段时，指明循环段的起始值的参考值标识。
     */
    public java.lang.Integer cycleSectionBeginId;

    /**
     * 当定价段落为循环段时，指明循环段的终止值的参考值标识。
     */
    public java.lang.Integer cycleSectionEndId;

    /**
     * 当定价段落为循环段时，指明循环段的间隔的参考值标识。
     */
    public java.lang.Integer cycleSectionDurationId;

    /**
     * 进行段落比较时，用于指明段落取值的起始值。
     */
    public java.lang.Integer startRefValueId;

    /**
     * 进行段落比较时，用于指明段落取值的结束值。
     */
    public java.lang.Integer endRefValueId;

    /**
     * 子段落是否互斥.LOVB=PRC-C-0036.
     */
    public java.lang.Integer subSectionRel;

    /**
     * LOVB=PRC-C-0036
     */
    public java.lang.Integer judgeResult;

    /**
     * 定价段落类型的唯一标识。LOVB=PRC-C-0001
     */
    public java.lang.Integer sectionTypeId;

    /**
     * 区表节点的标识
     */
    public java.lang.Integer zoneItemId;

    /**
     * 用于指明在同一个段落下，执行资费标准的优先级，优先级数额小的，将得到优先的执行
     */
    public java.lang.Integer calcPriority;

    /**
     * 父定价段落标识
     */
    public java.lang.Integer parentSectionId;

    /**
     * 事件定价策略的标识
     */
    public java.lang.Integer eventPricingStrategyId;

    /**
     * 定价参考对象标识
     */
    public java.lang.Integer pricingRefObjectId;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingSectionId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingSectionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 说明如何进行分段。LOVB=PRC-C-0003.
     */
    public void setSectionCalcType(java.lang.Integer sectionCalcType) {
        this.sectionCalcType = sectionCalcType;
    }

    /**
     * 获取 说明如何进行分段。LOVB=PRC-C-0003.
     */
    public java.lang.Integer getSectionCalcType() {
        return this.sectionCalcType;
    }

    /**
     * 设置 定价段落名称，一般不用。特殊情况下，用于说明本段落的判断意图
     */
    public void setPricingSectionName(java.lang.String pricingSectionName) {
        this.pricingSectionName = pricingSectionName;
    }

    /**
     * 获取 定价段落名称，一般不用。特殊情况下，用于说明本段落的判断意图
     */
    public java.lang.String getPricingSectionName() {
        return this.pricingSectionName;
    }

    /**
     * 设置 当定价段落为循环段时，指明循环段的起始值的参考值标识。
     */
    public void setCycleSectionBeginId(java.lang.Integer cycleSectionBeginId) {
        this.cycleSectionBeginId = cycleSectionBeginId;
    }

    /**
     * 获取 当定价段落为循环段时，指明循环段的起始值的参考值标识。
     */
    public java.lang.Integer getCycleSectionBeginId() {
        return this.cycleSectionBeginId;
    }

    /**
     * 设置 当定价段落为循环段时，指明循环段的终止值的参考值标识。
     */
    public void setCycleSectionEndId(java.lang.Integer cycleSectionEndId) {
        this.cycleSectionEndId = cycleSectionEndId;
    }

    /**
     * 获取 当定价段落为循环段时，指明循环段的终止值的参考值标识。
     */
    public java.lang.Integer getCycleSectionEndId() {
        return this.cycleSectionEndId;
    }

    /**
     * 设置 当定价段落为循环段时，指明循环段的间隔的参考值标识。
     */
    public void setCycleSectionDurationId(java.lang.Integer cycleSectionDurationId) {
        this.cycleSectionDurationId = cycleSectionDurationId;
    }

    /**
     * 获取 当定价段落为循环段时，指明循环段的间隔的参考值标识。
     */
    public java.lang.Integer getCycleSectionDurationId() {
        return this.cycleSectionDurationId;
    }

    /**
     * 设置 进行段落比较时，用于指明段落取值的起始值。
     */
    public void setStartRefValueId(java.lang.Integer startRefValueId) {
        this.startRefValueId = startRefValueId;
    }

    /**
     * 获取 进行段落比较时，用于指明段落取值的起始值。
     */
    public java.lang.Integer getStartRefValueId() {
        return this.startRefValueId;
    }

    /**
     * 设置 进行段落比较时，用于指明段落取值的结束值。
     */
    public void setEndRefValueId(java.lang.Integer endRefValueId) {
        this.endRefValueId = endRefValueId;
    }

    /**
     * 获取 进行段落比较时，用于指明段落取值的结束值。
     */
    public java.lang.Integer getEndRefValueId() {
        return this.endRefValueId;
    }

    /**
     * 设置 子段落是否互斥.LOVB=PRC-C-0036.
     */
    public void setSubSectionRel(java.lang.Integer subSectionRel) {
        this.subSectionRel = subSectionRel;
    }

    /**
     * 获取 子段落是否互斥.LOVB=PRC-C-0036.
     */
    public java.lang.Integer getSubSectionRel() {
        return this.subSectionRel;
    }

    /**
     * 设置 LOVB=PRC-C-0036
     */
    public void setJudgeResult(java.lang.Integer judgeResult) {
        this.judgeResult = judgeResult;
    }

    /**
     * 获取 LOVB=PRC-C-0036
     */
    public java.lang.Integer getJudgeResult() {
        return this.judgeResult;
    }

    /**
     * 设置 定价段落类型的唯一标识。LOVB=PRC-C-0001
     */
    public void setSectionTypeId(java.lang.Integer sectionTypeId) {
        this.sectionTypeId = sectionTypeId;
    }

    /**
     * 获取 定价段落类型的唯一标识。LOVB=PRC-C-0001
     */
    public java.lang.Integer getSectionTypeId() {
        return this.sectionTypeId;
    }

    /**
     * 设置 区表节点的标识
     */
    public void setZoneItemId(java.lang.Integer zoneItemId) {
        this.zoneItemId = zoneItemId;
    }

    /**
     * 获取 区表节点的标识
     */
    public java.lang.Integer getZoneItemId() {
        return this.zoneItemId;
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
     * 设置 父定价段落标识
     */
    public void setParentSectionId(java.lang.Integer parentSectionId) {
        this.parentSectionId = parentSectionId;
    }

    /**
     * 获取 父定价段落标识
     */
    public java.lang.Integer getParentSectionId() {
        return this.parentSectionId;
    }

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
     * 设置 定价参考对象标识
     */
    public void setPricingRefObjectId(java.lang.Integer pricingRefObjectId) {
        this.pricingRefObjectId = pricingRefObjectId;
    }

    /**
     * 获取 定价参考对象标识
     */
    public java.lang.Integer getPricingRefObjectId() {
        return this.pricingRefObjectId;
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
