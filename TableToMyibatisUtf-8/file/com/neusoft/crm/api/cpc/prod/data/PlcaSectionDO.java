package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:PLCA段落数定义，每个段落下可以挂条件和动作。
 * @实体表  :PLCA_SECTION
 */
public class PlcaSectionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_SECTION_S";

    /**
     * 段落的唯一标识
     */
    public java.lang.Integer sectionId;

    /**
     * 对段落进行命名
     */
    public java.lang.String sectionName;

    /**
     * 段落可以嵌套，使条件的判断可以嵌套。
            父段落标识为0的段落为根段落，作为被PLCA策略引用的入口，根段落上不定义条件。
     */
    public java.lang.Integer parentSectionId;

    /**
     * 策略的唯一标识
     */
    public java.lang.Integer strategyId;

    /**
     * 用作段落判断时的排序，同一级的段落（也就是同个父段落的段落），优先级不能相同，按从小到大的顺序执行，实现if … else if…else的条件判断顺序。
            当前段落条件满足的情况下，只能往子段落中走，当前段落不满足才能继续判断其他的兄弟段落。
     */
    public java.lang.Integer priority;

    /**
     * 段落内的条件判断结束后，会返回true/false，这个结果需要和JUDGE_RESULT配置的值再进行比较，返回比较后的结果作为段落的返回值目的是有些条件用反向配置会简单一些
            根段落仍然需要配置这个字段，整棵段落树的返回值仍然需要和这个字段进行比较。PLC-C-0036
     */
    public java.lang.Integer judgeResult;

    /**
     * 段落类型，用于区分根段落和其它非根段落。PLC-C-0003
     */
    public java.lang.Integer sectionType;

    /**
     * LOVB=PLC-C-0036
     */
    public java.lang.Integer subSectionRel;

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
     * 设置 段落的唯一标识
     */
    public void setSectionId(java.lang.Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 获取 段落的唯一标识
     */
    public java.lang.Integer getSectionId() {
        return this.sectionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.sectionId = SeqUtils.createIntegerId(ID_SEQ);
         return this.sectionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对段落进行命名
     */
    public void setSectionName(java.lang.String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * 获取 对段落进行命名
     */
    public java.lang.String getSectionName() {
        return this.sectionName;
    }

    /**
     * 设置 段落可以嵌套，使条件的判断可以嵌套。
            父段落标识为0的段落为根段落，作为被PLCA策略引用的入口，根段落上不定义条件。
     */
    public void setParentSectionId(java.lang.Integer parentSectionId) {
        this.parentSectionId = parentSectionId;
    }

    /**
     * 获取 段落可以嵌套，使条件的判断可以嵌套。
            父段落标识为0的段落为根段落，作为被PLCA策略引用的入口，根段落上不定义条件。
     */
    public java.lang.Integer getParentSectionId() {
        return this.parentSectionId;
    }

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
     * 设置 用作段落判断时的排序，同一级的段落（也就是同个父段落的段落），优先级不能相同，按从小到大的顺序执行，实现if … else if…else的条件判断顺序。
            当前段落条件满足的情况下，只能往子段落中走，当前段落不满足才能继续判断其他的兄弟段落。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 用作段落判断时的排序，同一级的段落（也就是同个父段落的段落），优先级不能相同，按从小到大的顺序执行，实现if … else if…else的条件判断顺序。
            当前段落条件满足的情况下，只能往子段落中走，当前段落不满足才能继续判断其他的兄弟段落。
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 段落内的条件判断结束后，会返回true/false，这个结果需要和JUDGE_RESULT配置的值再进行比较，返回比较后的结果作为段落的返回值目的是有些条件用反向配置会简单一些
            根段落仍然需要配置这个字段，整棵段落树的返回值仍然需要和这个字段进行比较。PLC-C-0036
     */
    public void setJudgeResult(java.lang.Integer judgeResult) {
        this.judgeResult = judgeResult;
    }

    /**
     * 获取 段落内的条件判断结束后，会返回true/false，这个结果需要和JUDGE_RESULT配置的值再进行比较，返回比较后的结果作为段落的返回值目的是有些条件用反向配置会简单一些
            根段落仍然需要配置这个字段，整棵段落树的返回值仍然需要和这个字段进行比较。PLC-C-0036
     */
    public java.lang.Integer getJudgeResult() {
        return this.judgeResult;
    }

    /**
     * 设置 段落类型，用于区分根段落和其它非根段落。PLC-C-0003
     */
    public void setSectionType(java.lang.Integer sectionType) {
        this.sectionType = sectionType;
    }

    /**
     * 获取 段落类型，用于区分根段落和其它非根段落。PLC-C-0003
     */
    public java.lang.Integer getSectionType() {
        return this.sectionType;
    }

    /**
     * 设置 LOVB=PLC-C-0036
     */
    public void setSubSectionRel(java.lang.Integer subSectionRel) {
        this.subSectionRel = subSectionRel;
    }

    /**
     * 获取 LOVB=PLC-C-0036
     */
    public java.lang.Integer getSubSectionRel() {
        return this.subSectionRel;
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
