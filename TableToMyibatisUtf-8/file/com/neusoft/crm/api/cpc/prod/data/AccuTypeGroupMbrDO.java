package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:量本类型组成员. 定义一个量本类型组下一到多个量本类型。
 * @实体表  :ACCU_TYPE_GROUP_MBR
 */
public class AccuTypeGroupMbrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCU_TYPE_GROUP_MBR_S";

    /**
     * 量本类型组成员标识
     */
    public java.lang.Integer accuTypeGroupMemId;

    /**
     * 量本类型组标识
     */
    public java.lang.Integer accuTypeGroupId;

    /**
     * 量本类型标识
     */
    public java.lang.Integer accuTypeId;

    /**
     * 优先级
     */
    public java.lang.Integer priority;

    /**
     * 状态.LOVB=PRC-C-0026.
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
     * 设置 量本类型组成员标识
     */
    public void setAccuTypeGroupMemId(java.lang.Integer accuTypeGroupMemId) {
        this.accuTypeGroupMemId = accuTypeGroupMemId;
    }

    /**
     * 获取 量本类型组成员标识
     */
    public java.lang.Integer getAccuTypeGroupMemId() {
        return this.accuTypeGroupMemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.accuTypeGroupMemId = SeqUtils.createIntegerId(ID_SEQ);
         return this.accuTypeGroupMemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 量本类型组标识
     */
    public void setAccuTypeGroupId(java.lang.Integer accuTypeGroupId) {
        this.accuTypeGroupId = accuTypeGroupId;
    }

    /**
     * 获取 量本类型组标识
     */
    public java.lang.Integer getAccuTypeGroupId() {
        return this.accuTypeGroupId;
    }

    /**
     * 设置 量本类型标识
     */
    public void setAccuTypeId(java.lang.Integer accuTypeId) {
        this.accuTypeId = accuTypeId;
    }

    /**
     * 获取 量本类型标识
     */
    public java.lang.Integer getAccuTypeId() {
        return this.accuTypeId;
    }

    /**
     * 设置 优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
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
