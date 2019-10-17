package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述集团支付滚存实例明细。
 * @实体表  :PAY_TRANS_INST_DETAIL
 */
public class PayTransInstDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_TRANS_INST_DETAIL_S";

    /**
     * 滚存明细标识。
     */
    public java.lang.Long transInstDetId;

    /**
     * 结转实例标识
     */
    public java.lang.Long payTransInstId;

    /**
     * 帐务关系标识。
     */
    public java.lang.Long servAcctRelId;

    /**
     * 上个帐务周期可滚存到本帐务周期的额度
     */
    public java.lang.Long preTransAmount;

    /**
     * 业务处理的帐期周期
     */
    public java.lang.Integer billingCycleId;

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
     * 设置 滚存明细标识。
     */
    public void setTransInstDetId(java.lang.Long transInstDetId) {
        this.transInstDetId = transInstDetId;
    }

    /**
     * 获取 滚存明细标识。
     */
    public java.lang.Long getTransInstDetId() {
        return this.transInstDetId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.transInstDetId = SeqUtils.createLongId(ID_SEQ);
         return this.transInstDetId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 结转实例标识
     */
    public void setPayTransInstId(java.lang.Long payTransInstId) {
        this.payTransInstId = payTransInstId;
    }

    /**
     * 获取 结转实例标识
     */
    public java.lang.Long getPayTransInstId() {
        return this.payTransInstId;
    }

    /**
     * 设置 帐务关系标识。
     */
    public void setServAcctRelId(java.lang.Long servAcctRelId) {
        this.servAcctRelId = servAcctRelId;
    }

    /**
     * 获取 帐务关系标识。
     */
    public java.lang.Long getServAcctRelId() {
        return this.servAcctRelId;
    }

    /**
     * 设置 上个帐务周期可滚存到本帐务周期的额度
     */
    public void setPreTransAmount(java.lang.Long preTransAmount) {
        this.preTransAmount = preTransAmount;
    }

    /**
     * 获取 上个帐务周期可滚存到本帐务周期的额度
     */
    public java.lang.Long getPreTransAmount() {
        return this.preTransAmount;
    }

    /**
     * 设置 业务处理的帐期周期
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 业务处理的帐期周期
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
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

}
