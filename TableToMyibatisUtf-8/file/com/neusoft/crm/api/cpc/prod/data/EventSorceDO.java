package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录事件源的基本信息
统一管理与配置事件采集源
 * @实体表  :EVENT_SORCE
 */
public class EventSorceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_SORCE_S";

    /**
     * 事件源标识
     */
    public java.lang.Integer evtSrcId;

    /**
     * 事件源编码
     */
    public java.lang.String evtSrcCode;

    /**
     * 事件源名称
     */
    public java.lang.String evtSrcName;

    /**
     * 事件源描述
     */
    public java.lang.String evtSrcDesc;

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
     * 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long regionId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 事件源标识
     */
    public void setEvtSrcId(java.lang.Integer evtSrcId) {
        this.evtSrcId = evtSrcId;
    }

    /**
     * 获取 事件源标识
     */
    public java.lang.Integer getEvtSrcId() {
        return this.evtSrcId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.evtSrcId = SeqUtils.createIntegerId(ID_SEQ);
         return this.evtSrcId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 事件源编码
     */
    public void setEvtSrcCode(java.lang.String evtSrcCode) {
        this.evtSrcCode = evtSrcCode;
    }

    /**
     * 获取 事件源编码
     */
    public java.lang.String getEvtSrcCode() {
        return this.evtSrcCode;
    }

    /**
     * 设置 事件源名称
     */
    public void setEvtSrcName(java.lang.String evtSrcName) {
        this.evtSrcName = evtSrcName;
    }

    /**
     * 获取 事件源名称
     */
    public java.lang.String getEvtSrcName() {
        return this.evtSrcName;
    }

    /**
     * 设置 事件源描述
     */
    public void setEvtSrcDesc(java.lang.String evtSrcDesc) {
        this.evtSrcDesc = evtSrcDesc;
    }

    /**
     * 获取 事件源描述
     */
    public java.lang.String getEvtSrcDesc() {
        return this.evtSrcDesc;
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
     * 设置 记录适用区域标识，指定公共管理区域
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
