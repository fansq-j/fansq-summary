package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:帐目按一定的规则组织起来形成帐单项，体现为帐单上的条目。分非费用帐单项和费用帐单项。帐单项分层次，即帐单项也可以由帐单项
 * @实体表  :BILL_ITEM
 */
public class BillItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_ITEM_S";

    /**
     * 为每个帐单项生成的唯一编号。------------
     */
    public java.lang.Integer billItemTypeId;

    /**
     * 每个帐单项在帐单/发票上打印的顺序。ACC-C-0201
     */
    public java.lang.Integer classify;

    /**
     * 上级帐单项的唯一标识，用于表示层次关系。
     */
    public java.lang.Integer billParentId;

    /**
     * 为每个帐单项生成的唯一编号。
     */
    public java.lang.Integer billRemarkId;

    /**
     * 销售品标识，用于特殊套餐打印指定的帐单项
     */
    public java.lang.Integer offerId;

    /**
     * 每个帐单项在帐单/发票上打印的顺序。
     */
    public java.lang.Integer printOrder;

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
     * 设置 为每个帐单项生成的唯一编号。------------
     */
    public void setBillItemTypeId(java.lang.Integer billItemTypeId) {
        this.billItemTypeId = billItemTypeId;
    }

    /**
     * 获取 为每个帐单项生成的唯一编号。------------
     */
    public java.lang.Integer getBillItemTypeId() {
        return this.billItemTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.billItemTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.billItemTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 每个帐单项在帐单/发票上打印的顺序。ACC-C-0201
     */
    public void setClassify(java.lang.Integer classify) {
        this.classify = classify;
    }

    /**
     * 获取 每个帐单项在帐单/发票上打印的顺序。ACC-C-0201
     */
    public java.lang.Integer getClassify() {
        return this.classify;
    }

    /**
     * 设置 上级帐单项的唯一标识，用于表示层次关系。
     */
    public void setBillParentId(java.lang.Integer billParentId) {
        this.billParentId = billParentId;
    }

    /**
     * 获取 上级帐单项的唯一标识，用于表示层次关系。
     */
    public java.lang.Integer getBillParentId() {
        return this.billParentId;
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
     * 设置 销售品标识，用于特殊套餐打印指定的帐单项
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识，用于特殊套餐打印指定的帐单项
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
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
