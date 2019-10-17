package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:资费的一种，对营销资源的价格进行打折
 * @实体表  :REBATE
 */
public class RebateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "REBATE_S";

    /**
     * 折扣费率标识
     */
    public java.lang.Integer rebateId;

    /**
     * 促销活动资费标识
     */
    public java.lang.Integer promActiTariffId;

    /**
     * 指定折扣率的取值，主要用于折扣计算时确定具体的折扣率
     */
    public java.lang.Double discountRateValueId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 折扣费率标识
     */
    public void setRebateId(java.lang.Integer rebateId) {
        this.rebateId = rebateId;
    }

    /**
     * 获取 折扣费率标识
     */
    public java.lang.Integer getRebateId() {
        return this.rebateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.rebateId = SeqUtils.createIntegerId(ID_SEQ);
         return this.rebateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 促销活动资费标识
     */
    public void setPromActiTariffId(java.lang.Integer promActiTariffId) {
        this.promActiTariffId = promActiTariffId;
    }

    /**
     * 获取 促销活动资费标识
     */
    public java.lang.Integer getPromActiTariffId() {
        return this.promActiTariffId;
    }

    /**
     * 设置 指定折扣率的取值，主要用于折扣计算时确定具体的折扣率
     */
    public void setDiscountRateValueId(java.lang.Double discountRateValueId) {
        this.discountRateValueId = discountRateValueId;
    }

    /**
     * 获取 指定折扣率的取值，主要用于折扣计算时确定具体的折扣率
     */
    public java.lang.Double getDiscountRateValueId() {
        return this.discountRateValueId;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 普通记录状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
