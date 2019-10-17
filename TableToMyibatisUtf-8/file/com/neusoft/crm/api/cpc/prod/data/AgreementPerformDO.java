package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:协议履行情况记录协议/合同在签订后的履行管理中的情况和状态
 * @实体表  :AGREEMENT_PERFORM
 */
public class AgreementPerformDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREEMENT_PERFORM_S";

    /**
     * 记录协议履行信息唯一标识
     */
    public java.lang.Long performId;

    /**
     * 记录协议标识
     */
    public java.lang.Long agreeId;

    /**
     * 履行情况记录周期：按月、按季、按半年、按年等等，LOVB=ARG-C-0013
     */
    public java.lang.String recordCycle;

    /**
     * 履行情况分类，LOVB=ARG-C-0014
     */
    public java.lang.String performType;

    /**
     * 记录履行情况简要说明
     */
    public java.lang.String performDesc;

    /**
     * 记录履行情况的填写时间
     */
    public java.util.Date recordDate;

    /**
     * 记录履行情况的填写人
     */
    public java.lang.String recordPerson;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 记录协议履行信息唯一标识
     */
    public void setPerformId(java.lang.Long performId) {
        this.performId = performId;
    }

    /**
     * 获取 记录协议履行信息唯一标识
     */
    public java.lang.Long getPerformId() {
        return this.performId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.performId = SeqUtils.createLongId(ID_SEQ);
         return this.performId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录协议标识
     */
    public void setAgreeId(java.lang.Long agreeId) {
        this.agreeId = agreeId;
    }

    /**
     * 获取 记录协议标识
     */
    public java.lang.Long getAgreeId() {
        return this.agreeId;
    }

    /**
     * 设置 履行情况记录周期：按月、按季、按半年、按年等等，LOVB=ARG-C-0013
     */
    public void setRecordCycle(java.lang.String recordCycle) {
        this.recordCycle = recordCycle;
    }

    /**
     * 获取 履行情况记录周期：按月、按季、按半年、按年等等，LOVB=ARG-C-0013
     */
    public java.lang.String getRecordCycle() {
        return this.recordCycle;
    }

    /**
     * 设置 履行情况分类，LOVB=ARG-C-0014
     */
    public void setPerformType(java.lang.String performType) {
        this.performType = performType;
    }

    /**
     * 获取 履行情况分类，LOVB=ARG-C-0014
     */
    public java.lang.String getPerformType() {
        return this.performType;
    }

    /**
     * 设置 记录履行情况简要说明
     */
    public void setPerformDesc(java.lang.String performDesc) {
        this.performDesc = performDesc;
    }

    /**
     * 获取 记录履行情况简要说明
     */
    public java.lang.String getPerformDesc() {
        return this.performDesc;
    }

    /**
     * 设置 记录履行情况的填写时间
     */
    public void setRecordDate(java.util.Date recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * 获取 记录履行情况的填写时间
     */
    public java.util.Date getRecordDate() {
        return this.recordDate;
    }

    /**
     * 设置 记录履行情况的填写人
     */
    public void setRecordPerson(java.lang.String recordPerson) {
        this.recordPerson = recordPerson;
    }

    /**
     * 获取 记录履行情况的填写人
     */
    public java.lang.String getRecordPerson() {
        return this.recordPerson;
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
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
