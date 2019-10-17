package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录网格单元通信建设信息
 * @实体表  :GRID_UNIT_COMM_CONSTRUCT
 */
public class GridUnitCommConstructDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GRID_UNIT_COMM_CONSTRUCT_S";

    /**
     * 网格单元我方通信资源情况标识
     */
    public java.lang.Long gridUnitCommConstructId;

    /**
     * 网格单元标识
     */
    public java.lang.Long gridUnitId;

    /**
     * 是否有机房，LOVB=PUB-C-0006
     */
    public java.lang.Integer machineRoomFlag;

    /**
     * 机房总面积
     */
    public java.lang.String machineRoomTotalArea;

    /**
     * 机房已使用面积
     */
    public java.lang.String machineRoomUsedArea;

    /**
     * 是否综合布线，LOVB=PUB-C-0006
     */
    public java.lang.Integer cablingSystemFlag;

    /**
     * 是否上LAN，LOVB=PUB-C-0006
     */
    public java.lang.Integer lanFlag;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 网格单元我方通信资源情况标识
     */
    public void setGridUnitCommConstructId(java.lang.Long gridUnitCommConstructId) {
        this.gridUnitCommConstructId = gridUnitCommConstructId;
    }

    /**
     * 获取 网格单元我方通信资源情况标识
     */
    public java.lang.Long getGridUnitCommConstructId() {
        return this.gridUnitCommConstructId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.gridUnitCommConstructId = SeqUtils.createLongId(ID_SEQ);
         return this.gridUnitCommConstructId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 网格单元标识
     */
    public void setGridUnitId(java.lang.Long gridUnitId) {
        this.gridUnitId = gridUnitId;
    }

    /**
     * 获取 网格单元标识
     */
    public java.lang.Long getGridUnitId() {
        return this.gridUnitId;
    }

    /**
     * 设置 是否有机房，LOVB=PUB-C-0006
     */
    public void setMachineRoomFlag(java.lang.Integer machineRoomFlag) {
        this.machineRoomFlag = machineRoomFlag;
    }

    /**
     * 获取 是否有机房，LOVB=PUB-C-0006
     */
    public java.lang.Integer getMachineRoomFlag() {
        return this.machineRoomFlag;
    }

    /**
     * 设置 机房总面积
     */
    public void setMachineRoomTotalArea(java.lang.String machineRoomTotalArea) {
        this.machineRoomTotalArea = machineRoomTotalArea;
    }

    /**
     * 获取 机房总面积
     */
    public java.lang.String getMachineRoomTotalArea() {
        return this.machineRoomTotalArea;
    }

    /**
     * 设置 机房已使用面积
     */
    public void setMachineRoomUsedArea(java.lang.String machineRoomUsedArea) {
        this.machineRoomUsedArea = machineRoomUsedArea;
    }

    /**
     * 获取 机房已使用面积
     */
    public java.lang.String getMachineRoomUsedArea() {
        return this.machineRoomUsedArea;
    }

    /**
     * 设置 是否综合布线，LOVB=PUB-C-0006
     */
    public void setCablingSystemFlag(java.lang.Integer cablingSystemFlag) {
        this.cablingSystemFlag = cablingSystemFlag;
    }

    /**
     * 获取 是否综合布线，LOVB=PUB-C-0006
     */
    public java.lang.Integer getCablingSystemFlag() {
        return this.cablingSystemFlag;
    }

    /**
     * 设置 是否上LAN，LOVB=PUB-C-0006
     */
    public void setLanFlag(java.lang.Integer lanFlag) {
        this.lanFlag = lanFlag;
    }

    /**
     * 获取 是否上LAN，LOVB=PUB-C-0006
     */
    public java.lang.Integer getLanFlag() {
        return this.lanFlag;
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
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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
