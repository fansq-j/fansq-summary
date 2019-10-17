package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述用户缴费的流水记录的实体。
 * @实体表  :BUSINESS_RECORD
 */
public class BusinessRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSINESS_RECORD_S";

    /**
     * 缴费业务流水标识。
     */
    public java.lang.Long businessRecId;

    /**
     * 区分不同的缴费来源类型。ACC-C-0145
     */
    public java.lang.Integer businessType;

    /**
     * 用来对应系统流水，用于系统间数据关联核对，如为第三方平台进行充值，会将第三方平台的业务流水记录于此。该字段可为空。
     */
    public java.lang.String extSerialId;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 员工电信组织标识。
     */
    public java.lang.Long orgId;

    /**
     * 付款金额。
     */
    public java.lang.Long amount;

    /**
     * 数据生成日期。
     */
    public java.util.Date createDate;

    /**
     * 设置 缴费业务流水标识。
     */
    public void setBusinessRecId(java.lang.Long businessRecId) {
        this.businessRecId = businessRecId;
    }

    /**
     * 获取 缴费业务流水标识。
     */
    public java.lang.Long getBusinessRecId() {
        return this.businessRecId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.businessRecId = SeqUtils.createLongId(ID_SEQ);
         return this.businessRecId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 区分不同的缴费来源类型。ACC-C-0145
     */
    public void setBusinessType(java.lang.Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取 区分不同的缴费来源类型。ACC-C-0145
     */
    public java.lang.Integer getBusinessType() {
        return this.businessType;
    }

    /**
     * 设置 用来对应系统流水，用于系统间数据关联核对，如为第三方平台进行充值，会将第三方平台的业务流水记录于此。该字段可为空。
     */
    public void setExtSerialId(java.lang.String extSerialId) {
        this.extSerialId = extSerialId;
    }

    /**
     * 获取 用来对应系统流水，用于系统间数据关联核对，如为第三方平台进行充值，会将第三方平台的业务流水记录于此。该字段可为空。
     */
    public java.lang.String getExtSerialId() {
        return this.extSerialId;
    }

    /**
     * 设置 员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 员工电信组织标识。
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 员工电信组织标识。
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 付款金额。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 付款金额。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 数据生成日期。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 数据生成日期。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

}
