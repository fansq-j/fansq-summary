package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录由接触任务按目标对象和接触渠道维度生成接触调度单。	根据推送渠道结合渠道的协同控制策略，为每一个接触任务生成一条或者
 * @实体表  :CONTACT_ORDER
 */
public class ContactOrderDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_ORDER_S";

    /**
     * 接触调度单标识
     */
    public java.lang.Long contactOrderId;

    /**
     * 接触任务标识
     */
    public java.lang.Long contactTaskId;

    /**
     * 记录目标对象类型，LOVB=CAM-C-0005
     */
    public java.lang.String targetObjType;

    /**
     * 目标对象标识
     */
    public java.lang.String targetObjNbr;

    /**
     * 事件实例标识
     */
    public java.lang.Long evtInstId;

    /**
     * 接触渠道
     */
    public java.lang.Long contactChlId;

    /**
     * 接触人
     */
    public java.lang.Long contactStaff;

    /**
     * 接触调度单状态，LOVB=CAM-C-0008
            
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
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 接触调度单标识
     */
    public void setContactOrderId(java.lang.Long contactOrderId) {
        this.contactOrderId = contactOrderId;
    }

    /**
     * 获取 接触调度单标识
     */
    public java.lang.Long getContactOrderId() {
        return this.contactOrderId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contactOrderId = SeqUtils.createLongId(ID_SEQ);
         return this.contactOrderId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 接触任务标识
     */
    public void setContactTaskId(java.lang.Long contactTaskId) {
        this.contactTaskId = contactTaskId;
    }

    /**
     * 获取 接触任务标识
     */
    public java.lang.Long getContactTaskId() {
        return this.contactTaskId;
    }

    /**
     * 设置 记录目标对象类型，LOVB=CAM-C-0005
     */
    public void setTargetObjType(java.lang.String targetObjType) {
        this.targetObjType = targetObjType;
    }

    /**
     * 获取 记录目标对象类型，LOVB=CAM-C-0005
     */
    public java.lang.String getTargetObjType() {
        return this.targetObjType;
    }

    /**
     * 设置 目标对象标识
     */
    public void setTargetObjNbr(java.lang.String targetObjNbr) {
        this.targetObjNbr = targetObjNbr;
    }

    /**
     * 获取 目标对象标识
     */
    public java.lang.String getTargetObjNbr() {
        return this.targetObjNbr;
    }

    /**
     * 设置 事件实例标识
     */
    public void setEvtInstId(java.lang.Long evtInstId) {
        this.evtInstId = evtInstId;
    }

    /**
     * 获取 事件实例标识
     */
    public java.lang.Long getEvtInstId() {
        return this.evtInstId;
    }

    /**
     * 设置 接触渠道
     */
    public void setContactChlId(java.lang.Long contactChlId) {
        this.contactChlId = contactChlId;
    }

    /**
     * 获取 接触渠道
     */
    public java.lang.Long getContactChlId() {
        return this.contactChlId;
    }

    /**
     * 设置 接触人
     */
    public void setContactStaff(java.lang.Long contactStaff) {
        this.contactStaff = contactStaff;
    }

    /**
     * 获取 接触人
     */
    public java.lang.Long getContactStaff() {
        return this.contactStaff;
    }

    /**
     * 设置 接触调度单状态，LOVB=CAM-C-0008
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 接触调度单状态，LOVB=CAM-C-0008
            
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
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
