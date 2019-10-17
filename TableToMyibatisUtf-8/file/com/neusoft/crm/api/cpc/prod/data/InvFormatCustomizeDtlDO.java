package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录每组发票定制关系的实例产品
 * @实体表  :INV_FORMAT_CUSTOMIZE_DTL
 */
public class InvFormatCustomizeDtlDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "INV_FORMAT_CUSTOMIZE_DTL_S";

    /**
     * 帐单发票定制关系明细标识
     */
    public java.lang.Long invFormatCustDtlId;

    /**
     * 帐单定制标识
     */
    public java.lang.Long invFormatCustomizeId;

    /**
     * 记录产品实例的唯一编号。
     */
    public java.lang.Long prodInstId;

    /**
     * 客户订单编码
     */
    public java.lang.String custOrderNbr;

    /**
     * 记录状态。LOVB=ACC-C-0002
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
     * 设置 帐单发票定制关系明细标识
     */
    public void setInvFormatCustDtlId(java.lang.Long invFormatCustDtlId) {
        this.invFormatCustDtlId = invFormatCustDtlId;
    }

    /**
     * 获取 帐单发票定制关系明细标识
     */
    public java.lang.Long getInvFormatCustDtlId() {
        return this.invFormatCustDtlId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.invFormatCustDtlId = SeqUtils.createLongId(ID_SEQ);
         return this.invFormatCustDtlId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 帐单定制标识
     */
    public void setInvFormatCustomizeId(java.lang.Long invFormatCustomizeId) {
        this.invFormatCustomizeId = invFormatCustomizeId;
    }

    /**
     * 获取 帐单定制标识
     */
    public java.lang.Long getInvFormatCustomizeId() {
        return this.invFormatCustomizeId;
    }

    /**
     * 设置 记录产品实例的唯一编号。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例的唯一编号。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 客户订单编码
     */
    public void setCustOrderNbr(java.lang.String custOrderNbr) {
        this.custOrderNbr = custOrderNbr;
    }

    /**
     * 获取 客户订单编码
     */
    public java.lang.String getCustOrderNbr() {
        return this.custOrderNbr;
    }

    /**
     * 设置 记录状态。LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=ACC-C-0002
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
