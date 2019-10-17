package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义段落里面的条件，同组为与、异组为或。
 * @实体表  :PLCA_CONDITION
 */
public class PlcaConditionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_CONDITION_S";

    /**
     * 条件的唯一标识
     */
    public java.lang.Integer conditionId;

    /**
     * 段落的唯一标识
     */
    public java.lang.Integer sectionId;

    /**
     * 作为运算符的第一个操作值，单目运算符、双目运算符、三目运算符都需要用到。
     */
    public java.lang.Integer refValueIdA;

    /**
     * 运算符标识
     */
    public java.lang.Integer operatorId;

    /**
     * 双目和三目的条件运算符才需要定义参考值B，0表示参考值B未定义。
     */
    public java.lang.Integer refValueIdB;

    /**
     * 只有三目的条件运算符才需要定义参考值C，0表示参考值C未定义。
     */
    public java.lang.Integer refValueIdC;

    /**
     * 同组为与，异组为或。
     */
    public java.lang.Integer groupId;

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
     * 设置 条件的唯一标识
     */
    public void setConditionId(java.lang.Integer conditionId) {
        this.conditionId = conditionId;
    }

    /**
     * 获取 条件的唯一标识
     */
    public java.lang.Integer getConditionId() {
        return this.conditionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.conditionId = SeqUtils.createIntegerId(ID_SEQ);
         return this.conditionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

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
     * 设置 作为运算符的第一个操作值，单目运算符、双目运算符、三目运算符都需要用到。
     */
    public void setRefValueIdA(java.lang.Integer refValueIdA) {
        this.refValueIdA = refValueIdA;
    }

    /**
     * 获取 作为运算符的第一个操作值，单目运算符、双目运算符、三目运算符都需要用到。
     */
    public java.lang.Integer getRefValueIdA() {
        return this.refValueIdA;
    }

    /**
     * 设置 运算符标识
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取 运算符标识
     */
    public java.lang.Integer getOperatorId() {
        return this.operatorId;
    }

    /**
     * 设置 双目和三目的条件运算符才需要定义参考值B，0表示参考值B未定义。
     */
    public void setRefValueIdB(java.lang.Integer refValueIdB) {
        this.refValueIdB = refValueIdB;
    }

    /**
     * 获取 双目和三目的条件运算符才需要定义参考值B，0表示参考值B未定义。
     */
    public java.lang.Integer getRefValueIdB() {
        return this.refValueIdB;
    }

    /**
     * 设置 只有三目的条件运算符才需要定义参考值C，0表示参考值C未定义。
     */
    public void setRefValueIdC(java.lang.Integer refValueIdC) {
        this.refValueIdC = refValueIdC;
    }

    /**
     * 获取 只有三目的条件运算符才需要定义参考值C，0表示参考值C未定义。
     */
    public java.lang.Integer getRefValueIdC() {
        return this.refValueIdC;
    }

    /**
     * 设置 同组为与，异组为或。
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 同组为与，异组为或。
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
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
