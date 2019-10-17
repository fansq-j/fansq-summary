package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分兑换费用帐目的优惠记录，包括优惠金额、审批人员、审批时间、减免原因、减免金额等信息。
 * @实体表  :EXCH_ITEM_DISCOUNT_LOG
 */
public class ExchItemDiscountLogDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EXCH_ITEM_DISCOUNT_LOG_S";

    /**
     * 积分兑换费用优惠记录标识，作为主键
     */
    public java.lang.Long exchItemDiscountId;

    /**
     * 积分兑换费用帐目标识，作为外键，指向积分兑换费用帐目实体
     */
    public java.lang.Long exchAcctItemId;

    /**
     * 帐户标识，外键，指向帐户实体
     */
    public java.lang.Long acctId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 优惠金额，单位为厘
     */
    public java.lang.Long discount;

    /**
     * 记录批准人，外键，指向员工标识。
     */
    public java.lang.Long agreeStaffId;

    /**
     * 记录批准流水号
     */
    public java.lang.Long agreeSerialId;

    /**
     * 记录批准人部门，外键，指向电信组织标识。
     */
    public java.lang.Long agreeOrgId;

    /**
     * 记录调整原因描述
     */
    public java.lang.String adjustReason;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分兑换费用优惠记录标识，作为主键
     */
    public void setExchItemDiscountId(java.lang.Long exchItemDiscountId) {
        this.exchItemDiscountId = exchItemDiscountId;
    }

    /**
     * 获取 积分兑换费用优惠记录标识，作为主键
     */
    public java.lang.Long getExchItemDiscountId() {
        return this.exchItemDiscountId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.exchItemDiscountId = SeqUtils.createLongId(ID_SEQ);
         return this.exchItemDiscountId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 积分兑换费用帐目标识，作为外键，指向积分兑换费用帐目实体
     */
    public void setExchAcctItemId(java.lang.Long exchAcctItemId) {
        this.exchAcctItemId = exchAcctItemId;
    }

    /**
     * 获取 积分兑换费用帐目标识，作为外键，指向积分兑换费用帐目实体
     */
    public java.lang.Long getExchAcctItemId() {
        return this.exchAcctItemId;
    }

    /**
     * 设置 帐户标识，外键，指向帐户实体
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 帐户标识，外键，指向帐户实体
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置 产品实例标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 优惠金额，单位为厘
     */
    public void setDiscount(java.lang.Long discount) {
        this.discount = discount;
    }

    /**
     * 获取 优惠金额，单位为厘
     */
    public java.lang.Long getDiscount() {
        return this.discount;
    }

    /**
     * 设置 记录批准人，外键，指向员工标识。
     */
    public void setAgreeStaffId(java.lang.Long agreeStaffId) {
        this.agreeStaffId = agreeStaffId;
    }

    /**
     * 获取 记录批准人，外键，指向员工标识。
     */
    public java.lang.Long getAgreeStaffId() {
        return this.agreeStaffId;
    }

    /**
     * 设置 记录批准流水号
     */
    public void setAgreeSerialId(java.lang.Long agreeSerialId) {
        this.agreeSerialId = agreeSerialId;
    }

    /**
     * 获取 记录批准流水号
     */
    public java.lang.Long getAgreeSerialId() {
        return this.agreeSerialId;
    }

    /**
     * 设置 记录批准人部门，外键，指向电信组织标识。
     */
    public void setAgreeOrgId(java.lang.Long agreeOrgId) {
        this.agreeOrgId = agreeOrgId;
    }

    /**
     * 获取 记录批准人部门，外键，指向电信组织标识。
     */
    public java.lang.Long getAgreeOrgId() {
        return this.agreeOrgId;
    }

    /**
     * 设置 记录调整原因描述
     */
    public void setAdjustReason(java.lang.String adjustReason) {
        this.adjustReason = adjustReason;
    }

    /**
     * 获取 记录调整原因描述
     */
    public java.lang.String getAdjustReason() {
        return this.adjustReason;
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
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
