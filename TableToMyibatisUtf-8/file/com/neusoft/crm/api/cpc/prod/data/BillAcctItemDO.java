package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述一个帐单项由哪些帐目组成。
 * @实体表  :BILL_ACCT_ITEM
 */
public class BillAcctItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_ACCT_ITEM_S";

    /**
     * 记录帐单项帐目的唯一编号。
     */
    public java.lang.Long billAcctItemId;

    /**
     * 为每个帐单项生成的唯一编号。------------
     */
    public java.lang.Integer billItemTypeId;

    /**
     * 区分不同类型的帐目的唯一编号。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 帐目来源标识
     */
    public java.lang.Integer itemSourceId;

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
     * 设置 记录帐单项帐目的唯一编号。
     */
    public void setBillAcctItemId(java.lang.Long billAcctItemId) {
        this.billAcctItemId = billAcctItemId;
    }

    /**
     * 获取 记录帐单项帐目的唯一编号。
     */
    public java.lang.Long getBillAcctItemId() {
        return this.billAcctItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.billAcctItemId = SeqUtils.createLongId(ID_SEQ);
         return this.billAcctItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 区分不同类型的帐目的唯一编号。
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 区分不同类型的帐目的唯一编号。
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 帐目来源标识
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 帐目来源标识
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
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
