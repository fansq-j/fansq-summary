package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分帐本中每一笔积分支出的明细信息，包括积分帐本、兑换记录、积分支出金额、剩余积分金额等。
 * @实体表  :POINT_BALANCE_PAYOUT
 */
public class PointBalancePayoutDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_BALANCE_PAYOUT_S";

    /**
     * 积分支出明细标识，作为主键
     */
    public java.lang.Long pointBalancePayoutId;

    /**
     * 积分帐本标识，作为外键，指向积分帐本实体
     */
    public java.lang.Long pointAcctBalanceId;

    /**
     * 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public java.lang.Long pointExchRecordId;

    /**
     * 积分支出类型，LOVB=POI-C-0007
     */
    public java.lang.String pointPayoutType;

    /**
     * 帐务周期标识
     */
    public java.lang.Long billingCycleId;

    /**
     * 积分操作的数额
     */
    public java.lang.Integer amount;

    /**
     * 操作后积分的余额
     */
    public java.lang.Integer pointBalance;

    /**
     * 外系统标识
     */
    public java.lang.String extSysId;

    /**
     * 外系统流水
     */
    public java.lang.String extSerialId;

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
     * 积分支出明细状态，LOVB=POI-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 创建组织标识
     */
    public java.lang.Long createOrgId;

    /**
     * 设置 积分支出明细标识，作为主键
     */
    public void setPointBalancePayoutId(java.lang.Long pointBalancePayoutId) {
        this.pointBalancePayoutId = pointBalancePayoutId;
    }

    /**
     * 获取 积分支出明细标识，作为主键
     */
    public java.lang.Long getPointBalancePayoutId() {
        return this.pointBalancePayoutId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointBalancePayoutId = SeqUtils.createLongId(ID_SEQ);
         return this.pointBalancePayoutId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 积分帐本标识，作为外键，指向积分帐本实体
     */
    public void setPointAcctBalanceId(java.lang.Long pointAcctBalanceId) {
        this.pointAcctBalanceId = pointAcctBalanceId;
    }

    /**
     * 获取 积分帐本标识，作为外键，指向积分帐本实体
     */
    public java.lang.Long getPointAcctBalanceId() {
        return this.pointAcctBalanceId;
    }

    /**
     * 设置 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public void setPointExchRecordId(java.lang.Long pointExchRecordId) {
        this.pointExchRecordId = pointExchRecordId;
    }

    /**
     * 获取 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public java.lang.Long getPointExchRecordId() {
        return this.pointExchRecordId;
    }

    /**
     * 设置 积分支出类型，LOVB=POI-C-0007
     */
    public void setPointPayoutType(java.lang.String pointPayoutType) {
        this.pointPayoutType = pointPayoutType;
    }

    /**
     * 获取 积分支出类型，LOVB=POI-C-0007
     */
    public java.lang.String getPointPayoutType() {
        return this.pointPayoutType;
    }

    /**
     * 设置 帐务周期标识
     */
    public void setBillingCycleId(java.lang.Long billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 帐务周期标识
     */
    public java.lang.Long getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 积分操作的数额
     */
    public void setAmount(java.lang.Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取 积分操作的数额
     */
    public java.lang.Integer getAmount() {
        return this.amount;
    }

    /**
     * 设置 操作后积分的余额
     */
    public void setPointBalance(java.lang.Integer pointBalance) {
        this.pointBalance = pointBalance;
    }

    /**
     * 获取 操作后积分的余额
     */
    public java.lang.Integer getPointBalance() {
        return this.pointBalance;
    }

    /**
     * 设置 外系统标识
     */
    public void setExtSysId(java.lang.String extSysId) {
        this.extSysId = extSysId;
    }

    /**
     * 获取 外系统标识
     */
    public java.lang.String getExtSysId() {
        return this.extSysId;
    }

    /**
     * 设置 外系统流水
     */
    public void setExtSerialId(java.lang.String extSerialId) {
        this.extSerialId = extSerialId;
    }

    /**
     * 获取 外系统流水
     */
    public java.lang.String getExtSerialId() {
        return this.extSerialId;
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
     * 设置 积分支出明细状态，LOVB=POI-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 积分支出明细状态，LOVB=POI-C-0001
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

    /**
     * 设置 创建组织标识
     */
    public void setCreateOrgId(java.lang.Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    /**
     * 获取 创建组织标识
     */
    public java.lang.Long getCreateOrgId() {
        return this.createOrgId;
    }

}
