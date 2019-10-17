package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的发展人信息。
 * @实体表  :ORD_DEV_STAFF_INFO
 */
public class OrdDevStaffInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_DEV_STAFF_INFO_S";

    /**
     * 发展人信息主键
     */
    public java.lang.Long devStaffInfoId;

    /**
     * 作用对象类型：订单实例、销售品实例、产品实例、终端实例
     */
    public java.lang.String objType;

    /**
     * 作用对象标识
     */
    public java.lang.Long objId;

    /**
     * 发展员工标识
     */
    public java.lang.Long devStaffId;

    /**
     * 主数据：第一发展人、第二发展人等
     */
    public java.lang.String devStaffType;

    /**
     * 发展团队标识
     */
    public java.lang.Long devOrgId;

    /**
     * 客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 记录属性标识。
     */
    public java.lang.Long attrId;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，分为有效/无效/历史。
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
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 发展人信息主键
     */
    public void setDevStaffInfoId(java.lang.Long devStaffInfoId) {
        this.devStaffInfoId = devStaffInfoId;
    }

    /**
     * 获取 发展人信息主键
     */
    public java.lang.Long getDevStaffInfoId() {
        return this.devStaffInfoId;
    }

    /**
     * 设置 作用对象类型：订单实例、销售品实例、产品实例、终端实例
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 作用对象类型：订单实例、销售品实例、产品实例、终端实例
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 作用对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 作用对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 发展员工标识
     */
    public void setDevStaffId(java.lang.Long devStaffId) {
        this.devStaffId = devStaffId;
    }

    /**
     * 获取 发展员工标识
     */
    public java.lang.Long getDevStaffId() {
        return this.devStaffId;
    }

    /**
     * 设置 主数据：第一发展人、第二发展人等
     */
    public void setDevStaffType(java.lang.String devStaffType) {
        this.devStaffType = devStaffType;
    }

    /**
     * 获取 主数据：第一发展人、第二发展人等
     */
    public java.lang.String getDevStaffType() {
        return this.devStaffType;
    }

    /**
     * 设置 发展团队标识
     */
    public void setDevOrgId(java.lang.Long devOrgId) {
        this.devOrgId = devOrgId;
    }

    /**
     * 获取 发展团队标识
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
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
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

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
