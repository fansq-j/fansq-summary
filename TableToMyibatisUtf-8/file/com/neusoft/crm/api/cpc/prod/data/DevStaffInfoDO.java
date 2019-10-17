package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单实例、销售品实例、产品实例、终端实例、属性等关联的发展人信息。
 * @实体表  :DEV_STAFF_INFO
 */
public class DevStaffInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEV_STAFF_INFO_S";

    /**
     * 记录发展人信息标识，主键。
     */
    public java.lang.Long devStaffInfoId;

    /**
     * 记录作用对象类型：订单实例、销售品实例、产品实例、终端实例、属性标识。LOVB=PRI-C-0015
     */
    public java.lang.String objType;

    /**
     * 记录作用对象标识。
     */
    public java.lang.Long objId;

    /**
     * 记录发展员工标识。
     */
    public java.lang.Long devStaffId;

    /**
     * 记录发展人角色类型，LOVB=PRI-C-0016
     */
    public java.lang.String devStaffType;

    /**
     * 记录发展团队标识。
     */
    public java.lang.Long devOrgId;

    /**
     * 客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录属性标识。
     */
    public java.lang.Long attrId;

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
     * 设置 记录发展人信息标识，主键。
     */
    public void setDevStaffInfoId(java.lang.Long devStaffInfoId) {
        this.devStaffInfoId = devStaffInfoId;
    }

    /**
     * 获取 记录发展人信息标识，主键。
     */
    public java.lang.Long getDevStaffInfoId() {
        return this.devStaffInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.devStaffInfoId = SeqUtils.createLongId(ID_SEQ);
         return this.devStaffInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录作用对象类型：订单实例、销售品实例、产品实例、终端实例、属性标识。LOVB=PRI-C-0015
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录作用对象类型：订单实例、销售品实例、产品实例、终端实例、属性标识。LOVB=PRI-C-0015
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录作用对象标识。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录作用对象标识。
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录发展员工标识。
     */
    public void setDevStaffId(java.lang.Long devStaffId) {
        this.devStaffId = devStaffId;
    }

    /**
     * 获取 记录发展员工标识。
     */
    public java.lang.Long getDevStaffId() {
        return this.devStaffId;
    }

    /**
     * 设置 记录发展人角色类型，LOVB=PRI-C-0016
     */
    public void setDevStaffType(java.lang.String devStaffType) {
        this.devStaffType = devStaffType;
    }

    /**
     * 获取 记录发展人角色类型，LOVB=PRI-C-0016
     */
    public java.lang.String getDevStaffType() {
        return this.devStaffType;
    }

    /**
     * 设置 记录发展团队标识。
     */
    public void setDevOrgId(java.lang.Long devOrgId) {
        this.devOrgId = devOrgId;
    }

    /**
     * 获取 记录发展团队标识。
     */
    public java.lang.Long getDevOrgId() {
        return this.devOrgId;
    }

    /**
     * 设置 客户订单标识
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 客户订单标识
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录属性标识。
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录属性标识。
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
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
