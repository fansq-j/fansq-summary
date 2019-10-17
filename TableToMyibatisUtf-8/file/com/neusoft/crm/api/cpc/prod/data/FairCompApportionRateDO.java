package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:共享业务分摊比例表
 * @实体表  :FAIR_COMP_APPORTION_RATE
 */
public class FairCompApportionRateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_COMP_APPORTION_RATE_S";

    /**
     * 共享业务分摊比例标识
     */
    public java.lang.Integer compApportionRateId;

    /**
     * 共享业务分摊标识
     */
    public java.lang.Integer apportionId;

    /**
     * 产品标识
     */
    public java.lang.Integer productId;

    /**
     * 角色
     */
    public java.lang.Long roleId;

    /**
     * 分摊比例
     */
    public java.lang.Double apportionRate;

    /**
     * 单产品分摊比例标识
     */
    public java.lang.Integer productApportionId;

    /**
     * LOVB=PLC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 共享业务分摊比例标识
     */
    public void setCompApportionRateId(java.lang.Integer compApportionRateId) {
        this.compApportionRateId = compApportionRateId;
    }

    /**
     * 获取 共享业务分摊比例标识
     */
    public java.lang.Integer getCompApportionRateId() {
        return this.compApportionRateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.compApportionRateId = SeqUtils.createIntegerId(ID_SEQ);
         return this.compApportionRateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 共享业务分摊标识
     */
    public void setApportionId(java.lang.Integer apportionId) {
        this.apportionId = apportionId;
    }

    /**
     * 获取 共享业务分摊标识
     */
    public java.lang.Integer getApportionId() {
        return this.apportionId;
    }

    /**
     * 设置 产品标识
     */
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取 产品标识
     */
    public java.lang.Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置 角色
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 分摊比例
     */
    public void setApportionRate(java.lang.Double apportionRate) {
        this.apportionRate = apportionRate;
    }

    /**
     * 获取 分摊比例
     */
    public java.lang.Double getApportionRate() {
        return this.apportionRate;
    }

    /**
     * 设置 单产品分摊比例标识
     */
    public void setProductApportionId(java.lang.Integer productApportionId) {
        this.productApportionId = productApportionId;
    }

    /**
     * 获取 单产品分摊比例标识
     */
    public java.lang.Integer getProductApportionId() {
        return this.productApportionId;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
