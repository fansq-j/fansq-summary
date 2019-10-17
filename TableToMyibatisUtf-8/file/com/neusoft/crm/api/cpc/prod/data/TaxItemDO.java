package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述税目、税率的配置。
 * @实体表  :TAX_ITEM
 */
public class TaxItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TAX_ITEM_S";

    /**
     * 税目标识
     */
    public java.lang.Integer taxItemId;

    /**
     * 税目名称
     */
    public java.lang.String taxItemName;

    /**
     * 税目编码
     */
    public java.lang.String taxItemCode;

    /**
     * 税率
     */
    public java.lang.Double taxRate;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录科目的详细信息.
     */
    public java.lang.String remark;

    /**
     * 记录状态 。 LOVB=ACC-C-0002
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
     * 设置 税目标识
     */
    public void setTaxItemId(java.lang.Integer taxItemId) {
        this.taxItemId = taxItemId;
    }

    /**
     * 获取 税目标识
     */
    public java.lang.Integer getTaxItemId() {
        return this.taxItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.taxItemId = SeqUtils.createIntegerId(ID_SEQ);
         return this.taxItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 税目名称
     */
    public void setTaxItemName(java.lang.String taxItemName) {
        this.taxItemName = taxItemName;
    }

    /**
     * 获取 税目名称
     */
    public java.lang.String getTaxItemName() {
        return this.taxItemName;
    }

    /**
     * 设置 税目编码
     */
    public void setTaxItemCode(java.lang.String taxItemCode) {
        this.taxItemCode = taxItemCode;
    }

    /**
     * 获取 税目编码
     */
    public java.lang.String getTaxItemCode() {
        return this.taxItemCode;
    }

    /**
     * 设置 税率
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 获取 税率
     */
    public java.lang.Double getTaxRate() {
        return this.taxRate;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录科目的详细信息.
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录科目的详细信息.
     */
    public java.lang.String getRemark() {
        return this.remark;
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
