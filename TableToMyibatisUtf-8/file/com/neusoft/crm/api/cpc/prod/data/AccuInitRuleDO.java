package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:只适用于套餐类。流量卡类的直接扫描充值记录，更新量本及量本来源记录即可。定义套餐类量本每个周期如何进行初始化。对于转赠，
 * @实体表  :ACCU_INIT_RULE
 */
public class AccuInitRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCU_INIT_RULE_S";

    /**
     * 量本周期初始化规则标识，唯一标识一条初始化规则。
     */
    public java.lang.Integer accuInitId;

    /**
     * 量本类型标识
     */
    public java.lang.Integer accuTypeId;

    /**
     * 每期赠送额。 与参考值关联，取自销售品实例或产品实例的参数。
     */
    public java.lang.Integer cycleAmountRefValueId;

    /**
     * LOVB=PLC-C-0012
     */
    public java.lang.Integer firstEffDateType;

    /**
     * LOVB=PLC-C-0013
     */
    public java.lang.Integer firstCalcType;

    /**
     * LOVB=PLC-C-0008
     */
    public java.lang.Integer calcPrecisionMethod;

    /**
     * LOVB=PLC-C-0007
     */
    public java.lang.String objType;

    /**
     * LOVB=PLC-C-0014
     */
    public java.lang.Integer cycleType;

    /**
     * 周期间隔数
     */
    public java.lang.Integer spanCount;

    /**
     * 周期起始偏移量. 定义量本初始化的开始周期(相对初始生效日期的周期偏移量)。
            周期起始偏移量和周期终止偏移量采用闭区间的判断方式。
     */
    public java.lang.Integer cycleBeginOffset;

    /**
     * 定义何时终止该量本初始化。
            周期起始偏移量和周期终止偏移量采用闭区间的判断方式。
     */
    public java.lang.Integer cycleEndOffset;

    /**
     * PLCA动作的唯一标识
     */
    public java.lang.Integer actionId;

    /**
     * 定义一个累积周期的主键
     */
    public java.lang.Integer ratableCycleId;

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
     * 设置 量本周期初始化规则标识，唯一标识一条初始化规则。
     */
    public void setAccuInitId(java.lang.Integer accuInitId) {
        this.accuInitId = accuInitId;
    }

    /**
     * 获取 量本周期初始化规则标识，唯一标识一条初始化规则。
     */
    public java.lang.Integer getAccuInitId() {
        return this.accuInitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.accuInitId = SeqUtils.createIntegerId(ID_SEQ);
         return this.accuInitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 量本类型标识
     */
    public void setAccuTypeId(java.lang.Integer accuTypeId) {
        this.accuTypeId = accuTypeId;
    }

    /**
     * 获取 量本类型标识
     */
    public java.lang.Integer getAccuTypeId() {
        return this.accuTypeId;
    }

    /**
     * 设置 每期赠送额。 与参考值关联，取自销售品实例或产品实例的参数。
     */
    public void setCycleAmountRefValueId(java.lang.Integer cycleAmountRefValueId) {
        this.cycleAmountRefValueId = cycleAmountRefValueId;
    }

    /**
     * 获取 每期赠送额。 与参考值关联，取自销售品实例或产品实例的参数。
     */
    public java.lang.Integer getCycleAmountRefValueId() {
        return this.cycleAmountRefValueId;
    }

    /**
     * 设置 LOVB=PLC-C-0012
     */
    public void setFirstEffDateType(java.lang.Integer firstEffDateType) {
        this.firstEffDateType = firstEffDateType;
    }

    /**
     * 获取 LOVB=PLC-C-0012
     */
    public java.lang.Integer getFirstEffDateType() {
        return this.firstEffDateType;
    }

    /**
     * 设置 LOVB=PLC-C-0013
     */
    public void setFirstCalcType(java.lang.Integer firstCalcType) {
        this.firstCalcType = firstCalcType;
    }

    /**
     * 获取 LOVB=PLC-C-0013
     */
    public java.lang.Integer getFirstCalcType() {
        return this.firstCalcType;
    }

    /**
     * 设置 LOVB=PLC-C-0008
     */
    public void setCalcPrecisionMethod(java.lang.Integer calcPrecisionMethod) {
        this.calcPrecisionMethod = calcPrecisionMethod;
    }

    /**
     * 获取 LOVB=PLC-C-0008
     */
    public java.lang.Integer getCalcPrecisionMethod() {
        return this.calcPrecisionMethod;
    }

    /**
     * 设置 LOVB=PLC-C-0007
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 LOVB=PLC-C-0007
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 LOVB=PLC-C-0014
     */
    public void setCycleType(java.lang.Integer cycleType) {
        this.cycleType = cycleType;
    }

    /**
     * 获取 LOVB=PLC-C-0014
     */
    public java.lang.Integer getCycleType() {
        return this.cycleType;
    }

    /**
     * 设置 周期间隔数
     */
    public void setSpanCount(java.lang.Integer spanCount) {
        this.spanCount = spanCount;
    }

    /**
     * 获取 周期间隔数
     */
    public java.lang.Integer getSpanCount() {
        return this.spanCount;
    }

    /**
     * 设置 周期起始偏移量. 定义量本初始化的开始周期(相对初始生效日期的周期偏移量)。
            周期起始偏移量和周期终止偏移量采用闭区间的判断方式。
     */
    public void setCycleBeginOffset(java.lang.Integer cycleBeginOffset) {
        this.cycleBeginOffset = cycleBeginOffset;
    }

    /**
     * 获取 周期起始偏移量. 定义量本初始化的开始周期(相对初始生效日期的周期偏移量)。
            周期起始偏移量和周期终止偏移量采用闭区间的判断方式。
     */
    public java.lang.Integer getCycleBeginOffset() {
        return this.cycleBeginOffset;
    }

    /**
     * 设置 定义何时终止该量本初始化。
            周期起始偏移量和周期终止偏移量采用闭区间的判断方式。
     */
    public void setCycleEndOffset(java.lang.Integer cycleEndOffset) {
        this.cycleEndOffset = cycleEndOffset;
    }

    /**
     * 获取 定义何时终止该量本初始化。
            周期起始偏移量和周期终止偏移量采用闭区间的判断方式。
     */
    public java.lang.Integer getCycleEndOffset() {
        return this.cycleEndOffset;
    }

    /**
     * 设置 PLCA动作的唯一标识
     */
    public void setActionId(java.lang.Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取 PLCA动作的唯一标识
     */
    public java.lang.Integer getActionId() {
        return this.actionId;
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
