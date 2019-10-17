package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:业务类型配置表:
 0： 批量开活卡
 1： 批量新装
 2：订购退订附属
                                     -&#
 * @实体表  :BATCH_ACTION_CFG
 */
public class BatchActionCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_ACTION_CFG_S";

    /**
     * 批量业务类型标识
     */
    public java.lang.Long batchActionId;

    /**
     * 批量业务类型编码
     */
    public java.lang.String batchActionCode;

    /**
     * 批量业务类型名称
     */
    public java.lang.String batchActionName;

    /**
     * 批量业务类型描述
     */
    public java.lang.String batchActionDesc;

    /**
     * 适用服务提供标识
     */
    public java.lang.Long serviceOfferId;

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
     * 设置 批量业务类型标识
     */
    public void setBatchActionId(java.lang.Long batchActionId) {
        this.batchActionId = batchActionId;
    }

    /**
     * 获取 批量业务类型标识
     */
    public java.lang.Long getBatchActionId() {
        return this.batchActionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchActionId = SeqUtils.createLongId(ID_SEQ);
         return this.batchActionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 批量业务类型编码
     */
    public void setBatchActionCode(java.lang.String batchActionCode) {
        this.batchActionCode = batchActionCode;
    }

    /**
     * 获取 批量业务类型编码
     */
    public java.lang.String getBatchActionCode() {
        return this.batchActionCode;
    }

    /**
     * 设置 批量业务类型名称
     */
    public void setBatchActionName(java.lang.String batchActionName) {
        this.batchActionName = batchActionName;
    }

    /**
     * 获取 批量业务类型名称
     */
    public java.lang.String getBatchActionName() {
        return this.batchActionName;
    }

    /**
     * 设置 批量业务类型描述
     */
    public void setBatchActionDesc(java.lang.String batchActionDesc) {
        this.batchActionDesc = batchActionDesc;
    }

    /**
     * 获取 批量业务类型描述
     */
    public java.lang.String getBatchActionDesc() {
        return this.batchActionDesc;
    }

    /**
     * 设置 适用服务提供标识
     */
    public void setServiceOfferId(java.lang.Long serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 适用服务提供标识
     */
    public java.lang.Long getServiceOfferId() {
        return this.serviceOfferId;
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
