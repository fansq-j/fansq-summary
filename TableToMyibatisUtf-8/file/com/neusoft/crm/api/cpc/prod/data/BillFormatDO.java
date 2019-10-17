package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:由电信统一定制或根据客户要求定制的帐单的具体格式。包括广告、备注等。
 * @实体表  :BILL_FORMAT
 */
public class BillFormatDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_FORMAT_S";

    /**
     * 为每种帐单格式生成的唯一编号。
     */
    public java.lang.Integer billFormatId;

    /**
     * 为每个帐单项生成的唯一编号。
     */
    public java.lang.Integer billRemarkId;

    /**
     * 帐单格式的名称。
     */
    public java.lang.String formatName;

    /**
     * 区域标识
     */
    public java.lang.Integer regionId;

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
     * 设置 为每种帐单格式生成的唯一编号。
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }

    /**
     * 获取 为每种帐单格式生成的唯一编号。
     */
    public java.lang.Integer getBillFormatId() {
        return this.billFormatId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.billFormatId = SeqUtils.createIntegerId(ID_SEQ);
         return this.billFormatId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 为每个帐单项生成的唯一编号。
     */
    public void setBillRemarkId(java.lang.Integer billRemarkId) {
        this.billRemarkId = billRemarkId;
    }

    /**
     * 获取 为每个帐单项生成的唯一编号。
     */
    public java.lang.Integer getBillRemarkId() {
        return this.billRemarkId;
    }

    /**
     * 设置 帐单格式的名称。
     */
    public void setFormatName(java.lang.String formatName) {
        this.formatName = formatName;
    }

    /**
     * 获取 帐单格式的名称。
     */
    public java.lang.String getFormatName() {
        return this.formatName;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
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
