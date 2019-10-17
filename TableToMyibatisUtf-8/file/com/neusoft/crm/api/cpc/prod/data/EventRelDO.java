package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :EVENT_REL
 */
public class EventRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_REL_S";

    /**
     * 事件主键标识
     */
    public java.lang.Long complexEvtRelaId;

    /**
     * 记录事件的编码信息；
            A端可能是简单事件或者复杂事件；
     */
    public java.lang.Long aEvtId;

    /**
     * 记录事件的标识
            Z端记录的是复杂事件的标识；
     */
    public java.lang.Long zEvtId;

    /**
     * 记录事件的映射匹配IP地址，事件识别可通过匹配IP地址进行匹配触点事件，如果多个的话，用逗号分隔
     */
    public java.lang.Integer sort;

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
     * 设置 事件主键标识
     */
    public void setComplexEvtRelaId(java.lang.Long complexEvtRelaId) {
        this.complexEvtRelaId = complexEvtRelaId;
    }

    /**
     * 获取 事件主键标识
     */
    public java.lang.Long getComplexEvtRelaId() {
        return this.complexEvtRelaId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.complexEvtRelaId = SeqUtils.createLongId(ID_SEQ);
         return this.complexEvtRelaId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录事件的编码信息；
            A端可能是简单事件或者复杂事件；
     */
    public void setAEvtId(java.lang.Long aEvtId) {
        this.aEvtId = aEvtId;
    }

    /**
     * 获取 记录事件的编码信息；
            A端可能是简单事件或者复杂事件；
     */
    public java.lang.Long getAEvtId() {
        return this.aEvtId;
    }

    /**
     * 设置 记录事件的标识
            Z端记录的是复杂事件的标识；
     */
    public void setZEvtId(java.lang.Long zEvtId) {
        this.zEvtId = zEvtId;
    }

    /**
     * 获取 记录事件的标识
            Z端记录的是复杂事件的标识；
     */
    public java.lang.Long getZEvtId() {
        return this.zEvtId;
    }

    /**
     * 设置 记录事件的映射匹配IP地址，事件识别可通过匹配IP地址进行匹配触点事件，如果多个的话，用逗号分隔
     */
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取 记录事件的映射匹配IP地址，事件识别可通过匹配IP地址进行匹配触点事件，如果多个的话，用逗号分隔
     */
    public java.lang.Integer getSort() {
        return this.sort;
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
