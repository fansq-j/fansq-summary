package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单预存定制信息。
 * @实体表  :ORDER_BALANCE
 */
public class OrderBalanceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORDER_BALANCE_S";

    /**
     * 订单预存定制信息标识
     */
    public java.lang.Long orderBalanceId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 预存或预付的对象类型，LOVB=EVT-C-0015
     */
    public java.lang.String objType;

    /**
     * 预存或预付的对象标识，产品实例标识/电信帐户标识
     */
    public java.lang.Long objId;

    /**
     * 预存金额
     */
    public java.lang.Long depositAmount;

    /**
     * 发票打印要求，受理时提供发票/使用时提供发票，LOVB=EVT-C-0006
     */
    public java.lang.String invPrtFlag;

    /**
     * 记录预存的处理状态。LOVB=EVT-C-0013
     */
    public java.lang.String operStatus;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，LOVB=EVT-C-0014
            
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
     * 设置 订单预存定制信息标识
     */
    public void setOrderBalanceId(java.lang.Long orderBalanceId) {
        this.orderBalanceId = orderBalanceId;
    }

    /**
     * 获取 订单预存定制信息标识
     */
    public java.lang.Long getOrderBalanceId() {
        return this.orderBalanceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orderBalanceId = SeqUtils.createLongId(ID_SEQ);
         return this.orderBalanceId;
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
     * 设置 预存或预付的对象类型，LOVB=EVT-C-0015
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 预存或预付的对象类型，LOVB=EVT-C-0015
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 预存或预付的对象标识，产品实例标识/电信帐户标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 预存或预付的对象标识，产品实例标识/电信帐户标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 预存金额
     */
    public void setDepositAmount(java.lang.Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * 获取 预存金额
     */
    public java.lang.Long getDepositAmount() {
        return this.depositAmount;
    }

    /**
     * 设置 发票打印要求，受理时提供发票/使用时提供发票，LOVB=EVT-C-0006
     */
    public void setInvPrtFlag(java.lang.String invPrtFlag) {
        this.invPrtFlag = invPrtFlag;
    }

    /**
     * 获取 发票打印要求，受理时提供发票/使用时提供发票，LOVB=EVT-C-0006
     */
    public java.lang.String getInvPrtFlag() {
        return this.invPrtFlag;
    }

    /**
     * 设置 记录预存的处理状态。LOVB=EVT-C-0013
     */
    public void setOperStatus(java.lang.String operStatus) {
        this.operStatus = operStatus;
    }

    /**
     * 获取 记录预存的处理状态。LOVB=EVT-C-0013
     */
    public java.lang.String getOperStatus() {
        return this.operStatus;
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
     * 设置 记录数据的状态，LOVB=EVT-C-0014
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，LOVB=EVT-C-0014
            
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
