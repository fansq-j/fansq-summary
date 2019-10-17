package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述余额可适用的产品和帐目范围，如某类余额只能支付固网市话费。
 * @实体表  :BALANCE_SPECIAL_PAYMENT
 */
public class BalanceSpecialPaymentDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_SPECIAL_PAYMENT_S";

    /**
     * 专款专用详情标识主键
     */
    public java.lang.Integer spePaymentDetId;

    /**
     * 为每种专款专用生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Integer spePaymentId;

    /**
     * 专款专用的运营商范围，0表示不限定运营商
     */
    public java.lang.Integer partnerId;

    /**
     * 记录产品的标识。
     */
    public java.lang.Integer prodId;

    /**
     * 专款专用应用的帐目组
     */
    public java.lang.Integer acctItemGroupId;

    /**
     * 帐目组使用方式，LOVB=ACC-C-0206
     */
    public java.lang.Integer acctItemPaymentType;

    /**
     * 归属区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态，LOVB=ACC-C-0002
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
     * 设置 专款专用详情标识主键
     */
    public void setSpePaymentDetId(java.lang.Integer spePaymentDetId) {
        this.spePaymentDetId = spePaymentDetId;
    }

    /**
     * 获取 专款专用详情标识主键
     */
    public java.lang.Integer getSpePaymentDetId() {
        return this.spePaymentDetId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.spePaymentDetId = SeqUtils.createIntegerId(ID_SEQ);
         return this.spePaymentDetId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 为每种专款专用生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public void setSpePaymentId(java.lang.Integer spePaymentId) {
        this.spePaymentId = spePaymentId;
    }

    /**
     * 获取 为每种专款专用生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Integer getSpePaymentId() {
        return this.spePaymentId;
    }

    /**
     * 设置 专款专用的运营商范围，0表示不限定运营商
     */
    public void setPartnerId(java.lang.Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取 专款专用的运营商范围，0表示不限定运营商
     */
    public java.lang.Integer getPartnerId() {
        return this.partnerId;
    }

    /**
     * 设置 记录产品的标识。
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 记录产品的标识。
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 专款专用应用的帐目组
     */
    public void setAcctItemGroupId(java.lang.Integer acctItemGroupId) {
        this.acctItemGroupId = acctItemGroupId;
    }

    /**
     * 获取 专款专用应用的帐目组
     */
    public java.lang.Integer getAcctItemGroupId() {
        return this.acctItemGroupId;
    }

    /**
     * 设置 帐目组使用方式，LOVB=ACC-C-0206
     */
    public void setAcctItemPaymentType(java.lang.Integer acctItemPaymentType) {
        this.acctItemPaymentType = acctItemPaymentType;
    }

    /**
     * 获取 帐目组使用方式，LOVB=ACC-C-0206
     */
    public java.lang.Integer getAcctItemPaymentType() {
        return this.acctItemPaymentType;
    }

    /**
     * 设置 归属区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
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
