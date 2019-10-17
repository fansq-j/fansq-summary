package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述系统涉及银行分支机构的实体。
 * @实体表  :BANK_BRANCH
 */
public class BankBranchDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BANK_BRANCH_S";

    /**
     * 银行分行的唯一标识。
     */
    public java.lang.Integer bankBranchId;

    /**
     * 银行分行的唯一标识。
     */
    public java.lang.Integer parBranchId;

    /**
     * 如果是用银行付费方式，则本字段表明了是哪个银行
     */
    public java.lang.Integer bankId;

    /**
     * 银行开户分行的完整名称
     */
    public java.lang.String bankBranchName;

    /**
     * 电信在该分行的托收银行帐号。
     */
    public java.lang.String bankAcct;

    /**
     * 电信在该分行的托收户名称。
     */
    public java.lang.String bankAcctName;

    /**
     * 记录地区编码。
     */
    public java.lang.Integer lanId;

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
     * 设置 银行分行的唯一标识。
     */
    public void setBankBranchId(java.lang.Integer bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    /**
     * 获取 银行分行的唯一标识。
     */
    public java.lang.Integer getBankBranchId() {
        return this.bankBranchId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.bankBranchId = SeqUtils.createIntegerId(ID_SEQ);
         return this.bankBranchId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 银行分行的唯一标识。
     */
    public void setParBranchId(java.lang.Integer parBranchId) {
        this.parBranchId = parBranchId;
    }

    /**
     * 获取 银行分行的唯一标识。
     */
    public java.lang.Integer getParBranchId() {
        return this.parBranchId;
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
     * 设置 银行开户分行的完整名称
     */
    public void setBankBranchName(java.lang.String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    /**
     * 获取 银行开户分行的完整名称
     */
    public java.lang.String getBankBranchName() {
        return this.bankBranchName;
    }

    /**
     * 设置 电信在该分行的托收银行帐号。
     */
    public void setBankAcct(java.lang.String bankAcct) {
        this.bankAcct = bankAcct;
    }

    /**
     * 获取 电信在该分行的托收银行帐号。
     */
    public java.lang.String getBankAcct() {
        return this.bankAcct;
    }

    /**
     * 设置 电信在该分行的托收户名称。
     */
    public void setBankAcctName(java.lang.String bankAcctName) {
        this.bankAcctName = bankAcctName;
    }

    /**
     * 获取 电信在该分行的托收户名称。
     */
    public java.lang.String getBankAcctName() {
        return this.bankAcctName;
    }

    /**
     * 设置 记录地区编码。
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录地区编码。
     */
    public java.lang.Integer getLanId() {
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
