package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:控制策略包括，优先级、推送周期、禁止推送日期等，控制策略可以作用在触点渠道上，也可以作用于事件和事件类型等。也可以同时作
 * @实体表  :PUSH_CTRL_RUL
 */
public class PushCtrlRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PUSH_CTRL_RUL_S";

    /**
     * 控制策略规则ID
     */
    public java.lang.Long pushCtrlRulId;

    /**
     * 触点渠道标识
     */
    public java.lang.Long contactChlId;

    /**
     * 优先级ID
     */
    public java.lang.Integer priority;

    /**
     * 可接触用户数
     */
    public java.lang.Integer custCount;

    /**
     * 禁止推送日期
     */
    public java.lang.String noPustDate;

    /**
     * 周期类型,LOVB=CAM-C-0014
     */
    public java.lang.Integer periodType;

    /**
     * 记录接触控制标志，LOVB=PUB-C-0006
     */
    public java.lang.Integer ctrlMark;

    /**
     * 触发时间设置
     */
    public java.lang.String timeSet;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 控制策略规则ID
     */
    public void setPushCtrlRulId(java.lang.Long pushCtrlRulId) {
        this.pushCtrlRulId = pushCtrlRulId;
    }

    /**
     * 获取 控制策略规则ID
     */
    public java.lang.Long getPushCtrlRulId() {
        return this.pushCtrlRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pushCtrlRulId = SeqUtils.createLongId(ID_SEQ);
         return this.pushCtrlRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 触点渠道标识
     */
    public void setContactChlId(java.lang.Long contactChlId) {
        this.contactChlId = contactChlId;
    }

    /**
     * 获取 触点渠道标识
     */
    public java.lang.Long getContactChlId() {
        return this.contactChlId;
    }

    /**
     * 设置 优先级ID
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 优先级ID
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 可接触用户数
     */
    public void setCustCount(java.lang.Integer custCount) {
        this.custCount = custCount;
    }

    /**
     * 获取 可接触用户数
     */
    public java.lang.Integer getCustCount() {
        return this.custCount;
    }

    /**
     * 设置 禁止推送日期
     */
    public void setNoPustDate(java.lang.String noPustDate) {
        this.noPustDate = noPustDate;
    }

    /**
     * 获取 禁止推送日期
     */
    public java.lang.String getNoPustDate() {
        return this.noPustDate;
    }

    /**
     * 设置 周期类型,LOVB=CAM-C-0014
     */
    public void setPeriodType(java.lang.Integer periodType) {
        this.periodType = periodType;
    }

    /**
     * 获取 周期类型,LOVB=CAM-C-0014
     */
    public java.lang.Integer getPeriodType() {
        return this.periodType;
    }

    /**
     * 设置 记录接触控制标志，LOVB=PUB-C-0006
     */
    public void setCtrlMark(java.lang.Integer ctrlMark) {
        this.ctrlMark = ctrlMark;
    }

    /**
     * 获取 记录接触控制标志，LOVB=PUB-C-0006
     */
    public java.lang.Integer getCtrlMark() {
        return this.ctrlMark;
    }

    /**
     * 设置 触发时间设置
     */
    public void setTimeSet(java.lang.String timeSet) {
        this.timeSet = timeSet;
    }

    /**
     * 获取 触发时间设置
     */
    public java.lang.String getTimeSet() {
        return this.timeSet;
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
