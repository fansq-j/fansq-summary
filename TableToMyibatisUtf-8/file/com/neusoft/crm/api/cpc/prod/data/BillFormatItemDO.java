package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述一个帐单格式由哪些帐单项组成。
 * @实体表  :BILL_FORMAT_ITEM
 */
public class BillFormatItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_FORMAT_ITEM_S";

    /**
     * 帐单格式帐单项标识
     */
    public java.lang.Integer billFormatItemId;

    /**
     * 为每个帐单项生成的唯一编号。
     */
    public java.lang.Integer billItemTypeId;

    /**
     * 帐单项打印名称
     */
    public java.lang.String billItemTypeCaption;

    /**
     * 为每种帐单格式生成的唯一编号。------------
     */
    public java.lang.Integer billFormatId;

    /**
     * 每个帐单项在帐单/发票上打印的顺序。
     */
    public java.lang.Integer printOrder;

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
     * 设置 帐单格式帐单项标识
     */
    public void setBillFormatItemId(java.lang.Integer billFormatItemId) {
        this.billFormatItemId = billFormatItemId;
    }

    /**
     * 获取 帐单格式帐单项标识
     */
    public java.lang.Integer getBillFormatItemId() {
        return this.billFormatItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.billFormatItemId = SeqUtils.createIntegerId(ID_SEQ);
         return this.billFormatItemId;
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
    public void setBillItemTypeId(java.lang.Integer billItemTypeId) {
        this.billItemTypeId = billItemTypeId;
    }

    /**
     * 获取 为每个帐单项生成的唯一编号。
     */
    public java.lang.Integer getBillItemTypeId() {
        return this.billItemTypeId;
    }

    /**
     * 设置 帐单项打印名称
     */
    public void setBillItemTypeCaption(java.lang.String billItemTypeCaption) {
        this.billItemTypeCaption = billItemTypeCaption;
    }

    /**
     * 获取 帐单项打印名称
     */
    public java.lang.String getBillItemTypeCaption() {
        return this.billItemTypeCaption;
    }

    /**
     * 设置 为每种帐单格式生成的唯一编号。------------
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }

    /**
     * 获取 为每种帐单格式生成的唯一编号。------------
     */
    public java.lang.Integer getBillFormatId() {
        return this.billFormatId;
    }

    /**
     * 设置 每个帐单项在帐单/发票上打印的顺序。
     */
    public void setPrintOrder(java.lang.Integer printOrder) {
        this.printOrder = printOrder;
    }

    /**
     * 获取 每个帐单项在帐单/发票上打印的顺序。
     */
    public java.lang.Integer getPrintOrder() {
        return this.printOrder;
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
