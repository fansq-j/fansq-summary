package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述银行发票的格式。
 * @实体表  :BANK_FORMAT
 */
public class BankFormatDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BANK_FORMAT_S";

    /**
     * 格式标识
            
     */
    public java.lang.Integer bankFormatId;

    /**
     * 如果是用银行付费方式，则本字段表明了是哪个银行
     */
    public java.lang.Integer bankId;

    /**
     * 格式名称
     */
    public java.lang.String formatName;

    /**
     * LOVB=ACC-C-0127
     */
    public java.lang.Integer formatType;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.bankFormatId = SeqUtils.createIntegerId(ID_SEQ);
         return this.bankFormatId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 如果是用银行付费方式，则本字段表明了是哪个银行
     */
    public void setBankId(java.lang.Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取 如果是用银行付费方式，则本字段表明了是哪个银行
     */
    public java.lang.Integer getBankId() {
        return this.bankId;
    }

    /**
     * 设置 格式名称
     */
    public void setFormatName(java.lang.String formatName) {
        this.formatName = formatName;
    }

    /**
     * 获取 格式名称
     */
    public java.lang.String getFormatName() {
        return this.formatName;
    }

    /**
     * 设置 LOVB=ACC-C-0127
     */
    public void setFormatType(java.lang.Integer formatType) {
        this.formatType = formatType;
    }

    /**
     * 获取 LOVB=ACC-C-0127
     */
    public java.lang.Integer getFormatType() {
        return this.formatType;
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
