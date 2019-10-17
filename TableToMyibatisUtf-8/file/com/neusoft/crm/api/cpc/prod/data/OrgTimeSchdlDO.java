package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营业厅固定营业时间段以及临时加班等时间安排信息
 * @实体表  :ORG_TIME_SCHDL
 */
public class OrgTimeSchdlDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_TIME_SCHDL_S";

    /**
     * 主键
     */
    public java.lang.Long timeSchdlId;

    /**
     * 营业厅标识
     */
    public java.lang.Long orgId;

    /**
     * 班次类型，主数据：固定，临时.LOVB=STF-C-0025
     */
    public java.lang.String schdlType;

    /**
     * 开始时间
     */
    public java.lang.String startItme;

    /**
     * 结束时间
     */
    public java.lang.String endTime;

    /**
     * 时长
     */
    public java.lang.Integer duration;

    /**
     * 时长单位，主数据：天，小时，分等.LOVB=STF-C-0026
     */
    public java.lang.String durationUnit;

    /**
     * 记录状态，LOVB=PUB-C-0001。
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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 主键
     */
    public void setTimeSchdlId(java.lang.Long timeSchdlId) {
        this.timeSchdlId = timeSchdlId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getTimeSchdlId() {
        return this.timeSchdlId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.timeSchdlId = SeqUtils.createLongId(ID_SEQ);
         return this.timeSchdlId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营业厅标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 营业厅标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 班次类型，主数据：固定，临时.LOVB=STF-C-0025
     */
    public void setSchdlType(java.lang.String schdlType) {
        this.schdlType = schdlType;
    }

    /**
     * 获取 班次类型，主数据：固定，临时.LOVB=STF-C-0025
     */
    public java.lang.String getSchdlType() {
        return this.schdlType;
    }

    /**
     * 设置 开始时间
     */
    public void setStartItme(java.lang.String startItme) {
        this.startItme = startItme;
    }

    /**
     * 获取 开始时间
     */
    public java.lang.String getStartItme() {
        return this.startItme;
    }

    /**
     * 设置 结束时间
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 结束时间
     */
    public java.lang.String getEndTime() {
        return this.endTime;
    }

    /**
     * 设置 时长
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }

    /**
     * 获取 时长
     */
    public java.lang.Integer getDuration() {
        return this.duration;
    }

    /**
     * 设置 时长单位，主数据：天，小时，分等.LOVB=STF-C-0026
     */
    public void setDurationUnit(java.lang.String durationUnit) {
        this.durationUnit = durationUnit;
    }

    /**
     * 获取 时长单位，主数据：天，小时，分等.LOVB=STF-C-0026
     */
    public java.lang.String getDurationUnit() {
        return this.durationUnit;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
