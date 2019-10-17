package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述银行帐目类型对应实体。
 * @实体表  :BANK_ITEM_TYPE_REL
 */
public class BankItemTypeRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BANK_ITEM_TYPE_REL_S";

    /**
     * 银行帐目类型对应标识
     */
    public java.lang.Integer bankItemTypeRelId;

    /**
     * 银行帐目类型标识
     */
    public java.lang.Integer bankItemTypeLatnId;

    /**
     * 帐目类型分类
     */
    public java.lang.Integer acctItemClass;

    /**
     * LOVB=ACC-C-0002
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
     * 设置 银行帐目类型对应标识
     */
    public void setBankItemTypeRelId(java.lang.Integer bankItemTypeRelId) {
        this.bankItemTypeRelId = bankItemTypeRelId;
    }

    /**
     * 获取 银行帐目类型对应标识
     */
    public java.lang.Integer getBankItemTypeRelId() {
        return this.bankItemTypeRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.bankItemTypeRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.bankItemTypeRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 银行帐目类型标识
     */
    public void setBankItemTypeLatnId(java.lang.Integer bankItemTypeLatnId) {
        this.bankItemTypeLatnId = bankItemTypeLatnId;
    }

    /**
     * 获取 银行帐目类型标识
     */
    public java.lang.Integer getBankItemTypeLatnId() {
        return this.bankItemTypeLatnId;
    }

    /**
     * 设置 帐目类型分类
     */
    public void setAcctItemClass(java.lang.Integer acctItemClass) {
        this.acctItemClass = acctItemClass;
    }

    /**
     * 获取 帐目类型分类
     */
    public java.lang.Integer getAcctItemClass() {
        return this.acctItemClass;
    }

    /**
     * 设置 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=ACC-C-0002
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
