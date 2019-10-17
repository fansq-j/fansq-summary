package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营业厅员工的排班信息，既营业厅员工、台席及班次的关系
 * @实体表  :ORG_STAFF_SCHDL
 */
public class OrgStaffSchdlDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_STAFF_SCHDL_S";

    /**
     * 主键
     */
    public java.lang.Long staffSchdlId;

    /**
     * 营业厅标识
     */
    public java.lang.Long orgId;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 台席标识
     */
    public java.lang.Long seatId;

    /**
     * 班次标识
     */
    public java.lang.Long timeSchdlId;

    /**
     * 值班日期
     */
    public java.util.Date dutyDate;

    /**
     * 记录状态，LOVB=PUB-C-0001
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
    public void setStaffSchdlId(java.lang.Long staffSchdlId) {
        this.staffSchdlId = staffSchdlId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getStaffSchdlId() {
        return this.staffSchdlId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.staffSchdlId = SeqUtils.createLongId(ID_SEQ);
         return this.staffSchdlId;
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
     * 设置 员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 台席标识
     */
    public void setSeatId(java.lang.Long seatId) {
        this.seatId = seatId;
    }

    /**
     * 获取 台席标识
     */
    public java.lang.Long getSeatId() {
        return this.seatId;
    }

    /**
     * 设置 班次标识
     */
    public void setTimeSchdlId(java.lang.Long timeSchdlId) {
        this.timeSchdlId = timeSchdlId;
    }

    /**
     * 获取 班次标识
     */
    public java.lang.Long getTimeSchdlId() {
        return this.timeSchdlId;
    }

    /**
     * 设置 值班日期
     */
    public void setDutyDate(java.util.Date dutyDate) {
        this.dutyDate = dutyDate;
    }

    /**
     * 获取 值班日期
     */
    public java.util.Date getDutyDate() {
        return this.dutyDate;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001
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
