package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:PLCA动作定义，如催缴、单停、双停提醒、双停、流量阀值提醒、超量降速。
 * @实体表  :PLCA_ACTION
 */
public class PlcaActionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_ACTION_S";

    /**
     * 动作的唯一标识
     */
    public java.lang.Integer actionId;

    /**
     * 对动作进行命名
     */
    public java.lang.String actionName;

    /**
     * LOVB=PLC-C-0017
     */
    public java.lang.Integer actionType;

    /**
     * 用作策略内部各动作的排序，升序，从小到大执行
     */
    public java.lang.Integer priority;

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
     * 设置 动作的唯一标识
     */
    public void setActionId(java.lang.Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取 动作的唯一标识
     */
    public java.lang.Integer getActionId() {
        return this.actionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.actionId = SeqUtils.createIntegerId(ID_SEQ);
         return this.actionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对动作进行命名
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }

    /**
     * 获取 对动作进行命名
     */
    public java.lang.String getActionName() {
        return this.actionName;
    }

    /**
     * 设置 LOVB=PLC-C-0017
     */
    public void setActionType(java.lang.Integer actionType) {
        this.actionType = actionType;
    }

    /**
     * 获取 LOVB=PLC-C-0017
     */
    public java.lang.Integer getActionType() {
        return this.actionType;
    }

    /**
     * 设置 用作策略内部各动作的排序，升序，从小到大执行
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 用作策略内部各动作的排序，升序，从小到大执行
     */
    public java.lang.Integer getPriority() {
        return this.priority;
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
