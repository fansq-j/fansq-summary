package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义PLCA事件的事件类型。如：实时信控事件、帐期末信控事件、双停提醒转双停事件、累积量提醒事件、PCC事件。
 * @实体表  :PLCA_EVENT_TYPE
 */
public class PlcaEventTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_EVENT_TYPE_S";

    /**
     * 事件类型的唯一标识。PLC-C-0041
     */
    public java.lang.Integer eventTypeId;

    /**
     * 对事件类型进行命名
     */
    public java.lang.String eventTypeName;

    /**
     * 优先级从0开始排，数值越小，优先级越高。
            按照事件优先级排序，优先处理高级别的事件。
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
     * 设置 事件类型的唯一标识。PLC-C-0041
     */
    public void setEventTypeId(java.lang.Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 获取 事件类型的唯一标识。PLC-C-0041
     */
    public java.lang.Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.eventTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.eventTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对事件类型进行命名
     */
    public void setEventTypeName(java.lang.String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * 获取 对事件类型进行命名
     */
    public java.lang.String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * 设置 优先级从0开始排，数值越小，优先级越高。
            按照事件优先级排序，优先处理高级别的事件。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 优先级从0开始排，数值越小，优先级越高。
            按照事件优先级排序，优先处理高级别的事件。
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
