package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分兑换支付规则与积分兑换条件之间的兑换规则关系。
 * @实体表  :POINT_EXCH_TARIFF_COND_REL
 */
public class PointExchTariffCondRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_TARIFF_COND_REL_S";

    /**
     * 积分兑换对象与兑换条件关系标识，作为主键
     */
    public java.lang.Integer pointExchTariffCondRelId;

    /**
     * 积分兑换支付规则标识，作为主键
     */
    public java.lang.Integer pointExchTariffId;

    /**
     * 积分兑换条件标识，作为外键，指向积分兑换条件实体
     */
    public java.lang.Integer pointExchCondId;

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
     * 设置 积分兑换对象与兑换条件关系标识，作为主键
     */
    public void setPointExchTariffCondRelId(java.lang.Integer pointExchTariffCondRelId) {
        this.pointExchTariffCondRelId = pointExchTariffCondRelId;
    }

    /**
     * 获取 积分兑换对象与兑换条件关系标识，作为主键
     */
    public java.lang.Integer getPointExchTariffCondRelId() {
        return this.pointExchTariffCondRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointExchTariffCondRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointExchTariffCondRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分兑换支付规则标识，作为主键
     */
    public void setPointExchTariffId(java.lang.Integer pointExchTariffId) {
        this.pointExchTariffId = pointExchTariffId;
    }

    /**
     * 获取 积分兑换支付规则标识，作为主键
     */
    public java.lang.Integer getPointExchTariffId() {
        return this.pointExchTariffId;
    }

    /**
     * 设置 积分兑换条件标识，作为外键，指向积分兑换条件实体
     */
    public void setPointExchCondId(java.lang.Integer pointExchCondId) {
        this.pointExchCondId = pointExchCondId;
    }

    /**
     * 获取 积分兑换条件标识，作为外键，指向积分兑换条件实体
     */
    public java.lang.Integer getPointExchCondId() {
        return this.pointExchCondId;
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
