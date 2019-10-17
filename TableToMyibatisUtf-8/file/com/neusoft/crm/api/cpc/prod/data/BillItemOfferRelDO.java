package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述客户化帐单销售品与帐单项的关系。
 * @实体表  :BILL_ITEM_OFFER_REL
 */
public class BillItemOfferRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_ITEM_OFFER_REL_S";

    /**
     * 销售品帐单项关系标识
     */
    public java.lang.Integer billItemOfferRelId;

    /**
     * 套餐类型标识
     */
    public java.lang.Integer preferTypeId;

    /**
     * 帐单项标识
     */
    public java.lang.Integer custBillItemId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifLimitPreferSpecId;

    /**
     * 备注
     */
    public java.lang.String remark;

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
     * 设置 销售品帐单项关系标识
     */
    public void setBillItemOfferRelId(java.lang.Integer billItemOfferRelId) {
        this.billItemOfferRelId = billItemOfferRelId;
    }

    /**
     * 获取 销售品帐单项关系标识
     */
    public java.lang.Integer getBillItemOfferRelId() {
        return this.billItemOfferRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.billItemOfferRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.billItemOfferRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 套餐类型标识
     */
    public void setPreferTypeId(java.lang.Integer preferTypeId) {
        this.preferTypeId = preferTypeId;
    }

    /**
     * 获取 套餐类型标识
     */
    public java.lang.Integer getPreferTypeId() {
        return this.preferTypeId;
    }

    /**
     * 设置 帐单项标识
     */
    public void setCustBillItemId(java.lang.Integer custBillItemId) {
        this.custBillItemId = custBillItemId;
    }

    /**
     * 获取 帐单项标识
     */
    public java.lang.Integer getCustBillItemId() {
        return this.custBillItemId;
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
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfLimitPreferSpecId(java.lang.Integer ifLimitPreferSpecId) {
        this.ifLimitPreferSpecId = ifLimitPreferSpecId;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfLimitPreferSpecId() {
        return this.ifLimitPreferSpecId;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
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
