package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述每个帐目类型的违约金比例。
 * @实体表  :LATE_FEE_RATE
 */
public class LateFeeRateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LATE_FEE_RATE_S";

    /**
     * 记录违约金计算比例配置的唯一编号
     */
    public java.lang.Integer lateFeeRateId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 产品标识
     */
    public java.lang.Integer prodId;

    /**
     * 帐目类型标识
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 违约金帐目标识
     */
    public java.lang.Integer lateFeeItemId;

    /**
     * 比例（万份之）
     */
    public java.lang.Integer rateValue;

    /**
     * 记录状态 。 LOVB=ACC-C-0002
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
     * 设置 记录违约金计算比例配置的唯一编号
     */
    public void setLateFeeRateId(java.lang.Integer lateFeeRateId) {
        this.lateFeeRateId = lateFeeRateId;
    }

    /**
     * 获取 记录违约金计算比例配置的唯一编号
     */
    public java.lang.Integer getLateFeeRateId() {
        return this.lateFeeRateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.lateFeeRateId = SeqUtils.createIntegerId(ID_SEQ);
         return this.lateFeeRateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 产品标识
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品标识
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 帐目类型标识
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 帐目类型标识
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 违约金帐目标识
     */
    public void setLateFeeItemId(java.lang.Integer lateFeeItemId) {
        this.lateFeeItemId = lateFeeItemId;
    }

    /**
     * 获取 违约金帐目标识
     */
    public java.lang.Integer getLateFeeItemId() {
        return this.lateFeeItemId;
    }

    /**
     * 设置 比例（万份之）
     */
    public void setRateValue(java.lang.Integer rateValue) {
        this.rateValue = rateValue;
    }

    /**
     * 获取 比例（万份之）
     */
    public java.lang.Integer getRateValue() {
        return this.rateValue;
    }

    /**
     * 设置 记录状态 。 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态 。 LOVB=ACC-C-0002
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
