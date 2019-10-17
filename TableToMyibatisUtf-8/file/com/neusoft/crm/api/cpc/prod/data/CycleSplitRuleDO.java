package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:佣金结算周期拆分规则
 * @实体表  :CYCLE_SPLIT_RULE
 */
public class CycleSplitRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CYCLE_SPLIT_RULE_S";

    /**
     * 佣金积分类型标识
     */
    public java.lang.Long cycleSplitRuleId;

    /**
     * 佣金积分类型名称
     */
    public java.lang.String cycleSplitRuleName;

    /**
     * LOVB=PRC-C-0055
            1：等间隔偏移N个周期
            2：非等间隔偏移
     */
    public java.lang.Integer offsetCycleType;

    /**
     * 结算周期单位：
            LOVB=PRC-C-0061
            1.天
            2.周
            3.旬
            4.月
            5.季
            6.年
     */
    public java.lang.Integer offsetCycleUnit;

    /**
     * 当偏移周期类型为1时，该字段填写偏移周期的间隔数
     */
    public java.lang.Integer offsetSpan;

    /**
     * 当偏移周期类型为1时，该字段填写偏移的总次数
     */
    public java.lang.Integer offsetNum;

    /**
     * 当偏移周期类型为2时，该字段填写具体的偏移周期字符串
     */
    public java.lang.String offsetCycleStr;

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
     * 设置 佣金积分类型标识
     */
    public void setCycleSplitRuleId(java.lang.Long cycleSplitRuleId) {
        this.cycleSplitRuleId = cycleSplitRuleId;
    }

    /**
     * 获取 佣金积分类型标识
     */
    public java.lang.Long getCycleSplitRuleId() {
        return this.cycleSplitRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.cycleSplitRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.cycleSplitRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 佣金积分类型名称
     */
    public void setCycleSplitRuleName(java.lang.String cycleSplitRuleName) {
        this.cycleSplitRuleName = cycleSplitRuleName;
    }

    /**
     * 获取 佣金积分类型名称
     */
    public java.lang.String getCycleSplitRuleName() {
        return this.cycleSplitRuleName;
    }

    /**
     * 设置 LOVB=PRC-C-0055
            1：等间隔偏移N个周期
            2：非等间隔偏移
     */
    public void setOffsetCycleType(java.lang.Integer offsetCycleType) {
        this.offsetCycleType = offsetCycleType;
    }

    /**
     * 获取 LOVB=PRC-C-0055
            1：等间隔偏移N个周期
            2：非等间隔偏移
     */
    public java.lang.Integer getOffsetCycleType() {
        return this.offsetCycleType;
    }

    /**
     * 设置 结算周期单位：
            LOVB=PRC-C-0061
            1.天
            2.周
            3.旬
            4.月
            5.季
            6.年
     */
    public void setOffsetCycleUnit(java.lang.Integer offsetCycleUnit) {
        this.offsetCycleUnit = offsetCycleUnit;
    }

    /**
     * 获取 结算周期单位：
            LOVB=PRC-C-0061
            1.天
            2.周
            3.旬
            4.月
            5.季
            6.年
     */
    public java.lang.Integer getOffsetCycleUnit() {
        return this.offsetCycleUnit;
    }

    /**
     * 设置 当偏移周期类型为1时，该字段填写偏移周期的间隔数
     */
    public void setOffsetSpan(java.lang.Integer offsetSpan) {
        this.offsetSpan = offsetSpan;
    }

    /**
     * 获取 当偏移周期类型为1时，该字段填写偏移周期的间隔数
     */
    public java.lang.Integer getOffsetSpan() {
        return this.offsetSpan;
    }

    /**
     * 设置 当偏移周期类型为1时，该字段填写偏移的总次数
     */
    public void setOffsetNum(java.lang.Integer offsetNum) {
        this.offsetNum = offsetNum;
    }

    /**
     * 获取 当偏移周期类型为1时，该字段填写偏移的总次数
     */
    public java.lang.Integer getOffsetNum() {
        return this.offsetNum;
    }

    /**
     * 设置 当偏移周期类型为2时，该字段填写具体的偏移周期字符串
     */
    public void setOffsetCycleStr(java.lang.String offsetCycleStr) {
        this.offsetCycleStr = offsetCycleStr;
    }

    /**
     * 获取 当偏移周期类型为2时，该字段填写具体的偏移周期字符串
     */
    public java.lang.String getOffsetCycleStr() {
        return this.offsetCycleStr;
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
