package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分帐本中每一笔积分的来源明细，包括：积分帐本、积分计算、积分来源、积分值等
 * @实体表  :POINT_BALANCE_SOURCE
 */
public class PointBalanceSourceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_BALANCE_SOURCE_S";

    /**
     * 积分来源明细标识，作为主键
     */
    public java.lang.Long pointBalanceSourceId;

    /**
     * 积分帐本标识，作为外键，指向积分帐本实体
     */
    public java.lang.Long pointAcctBalanceId;

    /**
     * 积分计算标识，作为外键，指向积分计算实体
     */
    public java.lang.Long pointTariffId;

    /**
     * 积分来源类型，LOVB=POI-C-0006
     */
    public java.lang.String pointSourceType;

    /**
     * 记录产生该积分的对象类型，包括：产品实例、销售品实例或者外部平台（用于赠送奖励积分的或集团集约积分赠送的场景）LOVB=POI-C-0009
     */
    public java.lang.String objType;

    /**
     * 来源对象标识
     */
    public java.lang.Long objId;

    /**
     * 帐务周期标识
     */
    public java.lang.Long billingCycleId;

    /**
     * 积分操作的数额
     */
    public java.lang.Integer amount;

    /**
     * 应用于倍增积分回馈场景中，记录产生该笔倍增积分的基础消费积分
     */
    public java.lang.Integer basePointValue;

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
     * 状态，LOVB=PUB-C-0001
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
     * 设置 积分来源明细标识，作为主键
     */
    public void setPointBalanceSourceId(java.lang.Long pointBalanceSourceId) {
        this.pointBalanceSourceId = pointBalanceSourceId;
    }

    /**
     * 获取 积分来源明细标识，作为主键
     */
    public java.lang.Long getPointBalanceSourceId() {
        return this.pointBalanceSourceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointBalanceSourceId = SeqUtils.createLongId(ID_SEQ);
         return this.pointBalanceSourceId;
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
     * 设置 积分计算标识，作为外键，指向积分计算实体
     */
    public void setPointTariffId(java.lang.Long pointTariffId) {
        this.pointTariffId = pointTariffId;
    }

    /**
     * 获取 积分计算标识，作为外键，指向积分计算实体
     */
    public java.lang.Long getPointTariffId() {
        return this.pointTariffId;
    }

    /**
     * 设置 积分来源类型，LOVB=POI-C-0006
     */
    public void setPointSourceType(java.lang.String pointSourceType) {
        this.pointSourceType = pointSourceType;
    }

    /**
     * 获取 积分来源类型，LOVB=POI-C-0006
     */
    public java.lang.String getPointSourceType() {
        return this.pointSourceType;
    }

    /**
     * 设置 记录产生该积分的对象类型，包括：产品实例、销售品实例或者外部平台（用于赠送奖励积分的或集团集约积分赠送的场景）LOVB=POI-C-0009
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录产生该积分的对象类型，包括：产品实例、销售品实例或者外部平台（用于赠送奖励积分的或集团集约积分赠送的场景）LOVB=POI-C-0009
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 来源对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 来源对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
     * 设置 应用于倍增积分回馈场景中，记录产生该笔倍增积分的基础消费积分
     */
    public void setBasePointValue(java.lang.Integer basePointValue) {
        this.basePointValue = basePointValue;
    }

    /**
     * 获取 应用于倍增积分回馈场景中，记录产生该笔倍增积分的基础消费积分
     */
    public java.lang.Integer getBasePointValue() {
        return this.basePointValue;
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
