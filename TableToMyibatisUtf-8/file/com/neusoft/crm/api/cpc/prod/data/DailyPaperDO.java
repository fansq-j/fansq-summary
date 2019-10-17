package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :DAILY_PAPER
 */
public class DailyPaperDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DAILY_PAPER_S";

    /**
     * 
     */
    public java.util.Date date;

    /**
     * 
     */
    public java.lang.String name;

    /**
     * 
     */
    public java.lang.String projectName;

    /**
     * 
     */
    public java.lang.String taskDesc;

    /**
     * 
     */
    public java.util.Date plannedDate;

    /**
     * 
     */
    public java.lang.String manHour;

    /**
     * 
     */
    public java.lang.String complateRate;

    /**
     * 
     */
    public java.lang.String delayReason;

    /**
     * 设置 
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * 获取 
     */
    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * 设置 
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * 设置 
     */
    public void setProjectName(java.lang.String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取 
     */
    public java.lang.String getProjectName() {
        return this.projectName;
    }

    /**
     * 设置 
     */
    public void setTaskDesc(java.lang.String taskDesc) {
        this.taskDesc = taskDesc;
    }

    /**
     * 获取 
     */
    public java.lang.String getTaskDesc() {
        return this.taskDesc;
    }

    /**
     * 设置 
     */
    public void setPlannedDate(java.util.Date plannedDate) {
        this.plannedDate = plannedDate;
    }

    /**
     * 获取 
     */
    public java.util.Date getPlannedDate() {
        return this.plannedDate;
    }

    /**
     * 设置 
     */
    public void setManHour(java.lang.String manHour) {
        this.manHour = manHour;
    }

    /**
     * 获取 
     */
    public java.lang.String getManHour() {
        return this.manHour;
    }

    /**
     * 设置 
     */
    public void setComplateRate(java.lang.String complateRate) {
        this.complateRate = complateRate;
    }

    /**
     * 获取 
     */
    public java.lang.String getComplateRate() {
        return this.complateRate;
    }

    /**
     * 设置 
     */
    public void setDelayReason(java.lang.String delayReason) {
        this.delayReason = delayReason;
    }

    /**
     * 获取 
     */
    public java.lang.String getDelayReason() {
        return this.delayReason;
    }

}
