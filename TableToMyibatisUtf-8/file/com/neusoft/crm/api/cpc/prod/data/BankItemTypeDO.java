package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述银行的帐目类型。
 * @实体表  :BANK_ITEM_TYPE
 */
public class BankItemTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BANK_ITEM_TYPE_S";

    /**
     * 银行帐目类型标识
     */
    public java.lang.Integer bankItemTypeLatnId;

    /**
     * 银行帐目类型
     */
    public java.lang.Integer bankItemTypeId;

    /**
     * 银行帐目类型名称
     */
    public java.lang.String bankItemTypeName;

    /**
     * 格式标识
            
     */
    public java.lang.Integer bankFormatId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.bankItemTypeLatnId = SeqUtils.createIntegerId(ID_SEQ);
         return this.bankItemTypeLatnId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 银行帐目类型
     */
    public void setBankItemTypeId(java.lang.Integer bankItemTypeId) {
        this.bankItemTypeId = bankItemTypeId;
    }

    /**
     * 获取 银行帐目类型
     */
    public java.lang.Integer getBankItemTypeId() {
        return this.bankItemTypeId;
    }

    /**
     * 设置 银行帐目类型名称
     */
    public void setBankItemTypeName(java.lang.String bankItemTypeName) {
        this.bankItemTypeName = bankItemTypeName;
    }

    /**
     * 获取 银行帐目类型名称
     */
    public java.lang.String getBankItemTypeName() {
        return this.bankItemTypeName;
    }

    /**
     * 设置 格式标识
            
     */
    public void setBankFormatId(java.lang.Integer bankFormatId) {
        this.bankFormatId = bankFormatId;
    }

    /**
     * 获取 格式标识
            
     */
    public java.lang.Integer getBankFormatId() {
        return this.bankFormatId;
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
