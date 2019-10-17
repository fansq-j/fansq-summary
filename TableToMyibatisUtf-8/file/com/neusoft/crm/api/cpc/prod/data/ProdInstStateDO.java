package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:主要记录产品实例停机状态的最新变化情况，包括报停、欠费停机、违规停机等。
 * @实体表  :PROD_INST_STATE
 */
public class ProdInstStateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_STATE_S";

    /**
     * 记录停机记录标识，主键。
     */
    public java.lang.Long prodInstStateId;

    /**
     * 记录产品实例标识，外键。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录产品实例的停机类型。LOVB=PRI-0018
     */
    public java.lang.String stopType;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录停机方向。LOVB=PRI-C-0027
     */
    public java.lang.String stopDirection;

    /**
     * 记录产品实例停机的原因，融合模型不进行数据编码。
     */
    public java.lang.String stopReason;

    /**
     * 事件触发时间
     */
    public java.util.Date eventDate;

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
     * 状态修改的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录停机记录标识，主键。
     */
    public void setProdInstStateId(java.lang.Long prodInstStateId) {
        this.prodInstStateId = prodInstStateId;
    }

    /**
     * 获取 记录停机记录标识，主键。
     */
    public java.lang.Long getProdInstStateId() {
        return this.prodInstStateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodInstStateId = SeqUtils.createLongId(ID_SEQ);
         return this.prodInstStateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录产品实例标识，外键。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识，外键。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录产品实例的停机类型。LOVB=PRI-0018
     */
    public void setStopType(java.lang.String stopType) {
        this.stopType = stopType;
    }

    /**
     * 获取 记录产品实例的停机类型。LOVB=PRI-0018
     */
    public java.lang.String getStopType() {
        return this.stopType;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录停机方向。LOVB=PRI-C-0027
     */
    public void setStopDirection(java.lang.String stopDirection) {
        this.stopDirection = stopDirection;
    }

    /**
     * 获取 记录停机方向。LOVB=PRI-C-0027
     */
    public java.lang.String getStopDirection() {
        return this.stopDirection;
    }

    /**
     * 设置 记录产品实例停机的原因，融合模型不进行数据编码。
     */
    public void setStopReason(java.lang.String stopReason) {
        this.stopReason = stopReason;
    }

    /**
     * 获取 记录产品实例停机的原因，融合模型不进行数据编码。
     */
    public java.lang.String getStopReason() {
        return this.stopReason;
    }

    /**
     * 设置 事件触发时间
     */
    public void setEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * 获取 事件触发时间
     */
    public java.util.Date getEventDate() {
        return this.eventDate;
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
     * 设置 状态修改的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间。
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
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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
