package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营业厅可进行线上预约的时间段及业务服务
 * @实体表  :ORG_SERV_BOOK_TIME
 */
public class OrgServBookTimeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_SERV_BOOK_TIME_S";

    /**
     * 主键，预约时段标识
     */
    public java.lang.Long bookTimeId;

    /**
     * 营业厅标识
     */
    public java.lang.Long orgId;

    /**
     * 营业厅服务关系标识
     */
    public java.lang.Long orgServRelId;

    /**
     * 预约时段的开始时间
     */
    public java.lang.String startTime;

    /**
     * 预约时段的结束时间
     */
    public java.lang.String endTime;

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
     * 设置 主键，预约时段标识
     */
    public void setBookTimeId(java.lang.Long bookTimeId) {
        this.bookTimeId = bookTimeId;
    }

    /**
     * 获取 主键，预约时段标识
     */
    public java.lang.Long getBookTimeId() {
        return this.bookTimeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.bookTimeId = SeqUtils.createLongId(ID_SEQ);
         return this.bookTimeId;
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
     * 设置 营业厅服务关系标识
     */
    public void setOrgServRelId(java.lang.Long orgServRelId) {
        this.orgServRelId = orgServRelId;
    }

    /**
     * 获取 营业厅服务关系标识
     */
    public java.lang.Long getOrgServRelId() {
        return this.orgServRelId;
    }

    /**
     * 设置 预约时段的开始时间
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取 预约时段的开始时间
     */
    public java.lang.String getStartTime() {
        return this.startTime;
    }

    /**
     * 设置 预约时段的结束时间
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 预约时段的结束时间
     */
    public java.lang.String getEndTime() {
        return this.endTime;
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
