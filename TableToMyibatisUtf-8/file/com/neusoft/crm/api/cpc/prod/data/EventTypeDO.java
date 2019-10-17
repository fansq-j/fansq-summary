package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录事件类型的基本信息，将事件进行分类目录管理，支持多级目录

 * @实体表  :EVENT_TYPE
 */
public class EventTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_TYPE_S";

    /**
     * 事件类型标识，主键标识
     */
    public java.lang.Long evtTypeId;

    /**
     * 记录事件类型的编码
     */
    public java.lang.String evtTypeNbr;

    /**
     * 记录事件类型的名称
     */
    public java.lang.String evtTypeName;

    /**
     * 记录父级的事件类型标识
     */
    public java.lang.Long parEvtTypeId;

    /**
     * 事件类型描述
     */
    public java.lang.String evtTypeDesc;

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
     * 设置 事件类型标识，主键标识
     */
    public void setEvtTypeId(java.lang.Long evtTypeId) {
        this.evtTypeId = evtTypeId;
    }

    /**
     * 获取 事件类型标识，主键标识
     */
    public java.lang.Long getEvtTypeId() {
        return this.evtTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evtTypeId = SeqUtils.createLongId(ID_SEQ);
         return this.evtTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录事件类型的编码
     */
    public void setEvtTypeNbr(java.lang.String evtTypeNbr) {
        this.evtTypeNbr = evtTypeNbr;
    }

    /**
     * 获取 记录事件类型的编码
     */
    public java.lang.String getEvtTypeNbr() {
        return this.evtTypeNbr;
    }

    /**
     * 设置 记录事件类型的名称
     */
    public void setEvtTypeName(java.lang.String evtTypeName) {
        this.evtTypeName = evtTypeName;
    }

    /**
     * 获取 记录事件类型的名称
     */
    public java.lang.String getEvtTypeName() {
        return this.evtTypeName;
    }

    /**
     * 设置 记录父级的事件类型标识
     */
    public void setParEvtTypeId(java.lang.Long parEvtTypeId) {
        this.parEvtTypeId = parEvtTypeId;
    }

    /**
     * 获取 记录父级的事件类型标识
     */
    public java.lang.Long getParEvtTypeId() {
        return this.parEvtTypeId;
    }

    /**
     * 设置 事件类型描述
     */
    public void setEvtTypeDesc(java.lang.String evtTypeDesc) {
        this.evtTypeDesc = evtTypeDesc;
    }

    /**
     * 获取 事件类型描述
     */
    public java.lang.String getEvtTypeDesc() {
        return this.evtTypeDesc;
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
