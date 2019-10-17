package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述事件的触发规则信息
通过事件触发规则配置的规则表达式及处理类，控制事件的触发次数，针对不同的事件类型、触
 * @实体表  :EVT_TRIG_CAM_RUL
 */
public class EvtTrigCamRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVT_TRIG_CAM_RUL_S";

    /**
     * 记录事件触发活动规则标识主键
     */
    public java.lang.Long evtTrigCamRulId;

    /**
     * 事件主键标识
     */
    public java.lang.Long eventId;

    /**
     * 营销活动标识，主键
     */
    public java.lang.Long mktCampaignId;

    /**
     * 记录事件规则的名称
     */
    public java.lang.String evtRulName;

    /**
     * 记录事件规则的描述说明
     */
    public java.lang.String evtRulDesc;

    /**
     * 记录事件规则的代码实现类名
     */
    public java.lang.String evtRulHandleClass;

    /**
     * 记录事件规则表达式
     */
    public java.lang.String evtRulExpression;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录事件触发活动规则标识主键
     */
    public void setEvtTrigCamRulId(java.lang.Long evtTrigCamRulId) {
        this.evtTrigCamRulId = evtTrigCamRulId;
    }

    /**
     * 获取 记录事件触发活动规则标识主键
     */
    public java.lang.Long getEvtTrigCamRulId() {
        return this.evtTrigCamRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evtTrigCamRulId = SeqUtils.createLongId(ID_SEQ);
         return this.evtTrigCamRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 事件主键标识
     */
    public void setEventId(java.lang.Long eventId) {
        this.eventId = eventId;
    }

    /**
     * 获取 事件主键标识
     */
    public java.lang.Long getEventId() {
        return this.eventId;
    }

    /**
     * 设置 营销活动标识，主键
     */
    public void setMktCampaignId(java.lang.Long mktCampaignId) {
        this.mktCampaignId = mktCampaignId;
    }

    /**
     * 获取 营销活动标识，主键
     */
    public java.lang.Long getMktCampaignId() {
        return this.mktCampaignId;
    }

    /**
     * 设置 记录事件规则的名称
     */
    public void setEvtRulName(java.lang.String evtRulName) {
        this.evtRulName = evtRulName;
    }

    /**
     * 获取 记录事件规则的名称
     */
    public java.lang.String getEvtRulName() {
        return this.evtRulName;
    }

    /**
     * 设置 记录事件规则的描述说明
     */
    public void setEvtRulDesc(java.lang.String evtRulDesc) {
        this.evtRulDesc = evtRulDesc;
    }

    /**
     * 获取 记录事件规则的描述说明
     */
    public java.lang.String getEvtRulDesc() {
        return this.evtRulDesc;
    }

    /**
     * 设置 记录事件规则的代码实现类名
     */
    public void setEvtRulHandleClass(java.lang.String evtRulHandleClass) {
        this.evtRulHandleClass = evtRulHandleClass;
    }

    /**
     * 获取 记录事件规则的代码实现类名
     */
    public java.lang.String getEvtRulHandleClass() {
        return this.evtRulHandleClass;
    }

    /**
     * 设置 记录事件规则表达式
     */
    public void setEvtRulExpression(java.lang.String evtRulExpression) {
        this.evtRulExpression = evtRulExpression;
    }

    /**
     * 获取 记录事件规则表达式
     */
    public java.lang.String getEvtRulExpression() {
        return this.evtRulExpression;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
