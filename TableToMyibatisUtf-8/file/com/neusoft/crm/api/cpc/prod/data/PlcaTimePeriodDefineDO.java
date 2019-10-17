package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对时段信息具体的描述，如：周末、节假日、闲时、忙时等。时段信息的具体内容按需扩展。
如果这个时段参考值包含多
 * @实体表  :PLCA_TIME_PERIOD_DEFINE
 */
public class PlcaTimePeriodDefineDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_TIME_PERIOD_DEFINE_S";

    /**
     * 时段定义的唯一标识
     */
    public java.lang.Integer timePeriodDefineId;

    /**
     * 参考值标识
     */
    public java.lang.Integer refValueId;

    /**
     * LOVB=PLC-C-0009
     */
    public java.lang.Integer timeLimitType;

    /**
     * 起始日期
     */
    public java.lang.String statrDate;

    /**
     * 限制条件的具体文字描述
     */
    public java.lang.String endDate;

    /**
     * 起始时间
     */
    public java.lang.String startTime;

    /**
     * 结束时间
     */
    public java.lang.String endTime;

    /**
     * 限制条件的描述信息
     */
    public java.lang.String timeLimitDesc;

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
     * 设置 时段定义的唯一标识
     */
    public void setTimePeriodDefineId(java.lang.Integer timePeriodDefineId) {
        this.timePeriodDefineId = timePeriodDefineId;
    }

    /**
     * 获取 时段定义的唯一标识
     */
    public java.lang.Integer getTimePeriodDefineId() {
        return this.timePeriodDefineId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.timePeriodDefineId = SeqUtils.createIntegerId(ID_SEQ);
         return this.timePeriodDefineId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 参考值标识
     */
    public void setRefValueId(java.lang.Integer refValueId) {
        this.refValueId = refValueId;
    }

    /**
     * 获取 参考值标识
     */
    public java.lang.Integer getRefValueId() {
        return this.refValueId;
    }

    /**
     * 设置 LOVB=PLC-C-0009
     */
    public void setTimeLimitType(java.lang.Integer timeLimitType) {
        this.timeLimitType = timeLimitType;
    }

    /**
     * 获取 LOVB=PLC-C-0009
     */
    public java.lang.Integer getTimeLimitType() {
        return this.timeLimitType;
    }

    /**
     * 设置 起始日期
     */
    public void setStatrDate(java.lang.String statrDate) {
        this.statrDate = statrDate;
    }

    /**
     * 获取 起始日期
     */
    public java.lang.String getStatrDate() {
        return this.statrDate;
    }

    /**
     * 设置 限制条件的具体文字描述
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取 限制条件的具体文字描述
     */
    public java.lang.String getEndDate() {
        return this.endDate;
    }

    /**
     * 设置 起始时间
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取 起始时间
     */
    public java.lang.String getStartTime() {
        return this.startTime;
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
     * 设置 限制条件的描述信息
     */
    public void setTimeLimitDesc(java.lang.String timeLimitDesc) {
        this.timeLimitDesc = timeLimitDesc;
    }

    /**
     * 获取 限制条件的描述信息
     */
    public java.lang.String getTimeLimitDesc() {
        return this.timeLimitDesc;
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
