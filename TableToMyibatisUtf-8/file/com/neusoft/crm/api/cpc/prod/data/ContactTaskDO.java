package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:接触任务，CPC计算的结果，以接触任务的方式输出，接触任务包含了接触目标、接触渠道、推送条目、接触脚本、接触问卷等。
 * @实体表  :CONTACT_TASK
 */
public class ContactTaskDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_TASK_S";

    /**
     * 接触任务标识
     */
    public java.lang.Long contactTaskId;

    /**
     * 接触任务标题
     */
    public java.lang.String contactTaskTitle;

    /**
     * 营销活动标识
     */
    public java.lang.Long mktCampaignId;

    /**
     * 记录事件实例的主键标识
     */
    public java.lang.Long evtInstId;

    /**
     * 目标对象类型,LOVB=CAM-C-0005
     */
    public java.lang.String targetObjType;

    /**
     * 目标对象标识
     */
    public java.lang.String targetObjNbr;

    /**
     * 营销策略标识
     */
    public java.lang.Long strategyId;

    /**
     * 表示推送任务的营销结果，LOVB=CAM-C-0006。
     */
    public java.lang.String mktingResult;

    /**
     * 记录接触任务传送给客户交互事件子域中的引流单标识
     */
    public java.lang.Long drainageOrderId;

    /**
     * 记录营销推荐办理的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 接触任务状态,LOVB=CAM-C-0004
            
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
     * 备注
     */
    public java.lang.String remark;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contactTaskId = SeqUtils.createLongId(ID_SEQ);
         return this.contactTaskId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 接触任务标题
     */
    public void setContactTaskTitle(java.lang.String contactTaskTitle) {
        this.contactTaskTitle = contactTaskTitle;
    }

    /**
     * 获取 接触任务标题
     */
    public java.lang.String getContactTaskTitle() {
        return this.contactTaskTitle;
    }

    /**
     * 设置 营销活动标识
     */
    public void setMktCampaignId(java.lang.Long mktCampaignId) {
        this.mktCampaignId = mktCampaignId;
    }

    /**
     * 获取 营销活动标识
     */
    public java.lang.Long getMktCampaignId() {
        return this.mktCampaignId;
    }

    /**
     * 设置 记录事件实例的主键标识
     */
    public void setEvtInstId(java.lang.Long evtInstId) {
        this.evtInstId = evtInstId;
    }

    /**
     * 获取 记录事件实例的主键标识
     */
    public java.lang.Long getEvtInstId() {
        return this.evtInstId;
    }

    /**
     * 设置 目标对象类型,LOVB=CAM-C-0005
     */
    public void setTargetObjType(java.lang.String targetObjType) {
        this.targetObjType = targetObjType;
    }

    /**
     * 获取 目标对象类型,LOVB=CAM-C-0005
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
     * 设置 营销策略标识
     */
    public void setStrategyId(java.lang.Long strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * 获取 营销策略标识
     */
    public java.lang.Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * 设置 表示推送任务的营销结果，LOVB=CAM-C-0006。
     */
    public void setMktingResult(java.lang.String mktingResult) {
        this.mktingResult = mktingResult;
    }

    /**
     * 获取 表示推送任务的营销结果，LOVB=CAM-C-0006。
     */
    public java.lang.String getMktingResult() {
        return this.mktingResult;
    }

    /**
     * 设置 记录接触任务传送给客户交互事件子域中的引流单标识
     */
    public void setDrainageOrderId(java.lang.Long drainageOrderId) {
        this.drainageOrderId = drainageOrderId;
    }

    /**
     * 获取 记录接触任务传送给客户交互事件子域中的引流单标识
     */
    public java.lang.Long getDrainageOrderId() {
        return this.drainageOrderId;
    }

    /**
     * 设置 记录营销推荐办理的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录营销推荐办理的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
    }

    /**
     * 设置 接触任务状态,LOVB=CAM-C-0004
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 接触任务状态,LOVB=CAM-C-0004
            
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
