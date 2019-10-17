package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营业厅提供办理各类服务的坐席信息
 * @实体表  :ORG_SEAT
 */
public class OrgSeatDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_SEAT_S";

    /**
     * 坐席标识
     */
    public java.lang.Long seatId;

    /**
     * 营业厅坐席编号
     */
    public java.lang.String deskNbr;

    /**
     * 营业厅标识
     */
    public java.lang.Long orgId;

    /**
     * 坐席状态，主数据：服务中、暂停中、已关闭.LOVB=STF-C-0024
     */
    public java.lang.String statusCd;

    /**
     * 坐席固有分类，LOVB=STF-C-0023
     */
    public java.lang.String seatType;

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
     * 设置 坐席标识
     */
    public void setSeatId(java.lang.Long seatId) {
        this.seatId = seatId;
    }

    /**
     * 获取 坐席标识
     */
    public java.lang.Long getSeatId() {
        return this.seatId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.seatId = SeqUtils.createLongId(ID_SEQ);
         return this.seatId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营业厅坐席编号
     */
    public void setDeskNbr(java.lang.String deskNbr) {
        this.deskNbr = deskNbr;
    }

    /**
     * 获取 营业厅坐席编号
     */
    public java.lang.String getDeskNbr() {
        return this.deskNbr;
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
     * 设置 坐席状态，主数据：服务中、暂停中、已关闭.LOVB=STF-C-0024
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 坐席状态，主数据：服务中、暂停中、已关闭.LOVB=STF-C-0024
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 坐席固有分类，LOVB=STF-C-0023
     */
    public void setSeatType(java.lang.String seatType) {
        this.seatType = seatType;
    }

    /**
     * 获取 坐席固有分类，LOVB=STF-C-0023
     */
    public java.lang.String getSeatType() {
        return this.seatType;
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
