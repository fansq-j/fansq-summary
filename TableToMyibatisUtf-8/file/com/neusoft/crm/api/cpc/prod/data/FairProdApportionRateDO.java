package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:如果套餐中有多个语音的公允价值需要分摊，则在这里指明语音费用中各个产品的语音价值分摊比例。
 * @实体表  :FAIR_PROD_APPORTION_RATE
 */
public class FairProdApportionRateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_PROD_APPORTION_RATE_S";

    /**
     * 共享业务单产品分摊比例标识
     */
    public java.lang.Integer prodApportionRateId;

    /**
     * 单产品分摊比例标识
     */
    public java.lang.Integer productApportionId;

    /**
     * 分摊项目
     */
    public java.lang.Integer apportionObjectId;

    /**
     * 分摊比例
     */
    public java.lang.Double apportionRate;

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
     * 设置 共享业务单产品分摊比例标识
     */
    public void setProdApportionRateId(java.lang.Integer prodApportionRateId) {
        this.prodApportionRateId = prodApportionRateId;
    }

    /**
     * 获取 共享业务单产品分摊比例标识
     */
    public java.lang.Integer getProdApportionRateId() {
        return this.prodApportionRateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.prodApportionRateId = SeqUtils.createIntegerId(ID_SEQ);
         return this.prodApportionRateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
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
     * 设置 分摊项目
     */
    public void setApportionObjectId(java.lang.Integer apportionObjectId) {
        this.apportionObjectId = apportionObjectId;
    }

    /**
     * 获取 分摊项目
     */
    public java.lang.Integer getApportionObjectId() {
        return this.apportionObjectId;
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
