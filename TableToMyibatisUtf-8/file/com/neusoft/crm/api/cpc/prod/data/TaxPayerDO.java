package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录企业客户的纳税人信息，主要为企业客户提供打印和递送发票的服务时使用。
 * @实体表  :TAX_PAYER
 */
public class TaxPayerDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TAX_PAYER_S";

    /**
     * 记录纳税人标识，作为主键
     */
    public java.lang.Long taxPayerId;

    /**
     * 记录客户标识，作为主键
     */
    public java.lang.Long custId;

    /**
     * 记录纳税人的税务登记号。
     */
    public java.lang.String taxId;

    /**
     * 记录纳税人在税务所登记的名称
     */
    public java.lang.String taxName;

    /**
     * 税务登记号所属省份。按照营改增的业务规范，“税务省份编码”是“税务登记号”的前三位，
     */
    public java.lang.String taxProvinceCode;

    /**
     * 税务登记证上的税务登记联系电话
     */
    public java.lang.String taxRelaTel;

    /**
     * 税务登记证上的税务登记联系地址
     */
    public java.lang.String taxRelaAddr;

    /**
     * 记录纳税人的税务登记证上的税务登记银行名称
     */
    public java.lang.String taxBankName;

    /**
     * 记录纳税人的银行开户许可证上的开户银行账号
     */
    public java.lang.String taxBankAcct;

    /**
     * 变更为一般纳税人的时间，按照业务规则为变更竣工时间的次月1号，该值只在变更为一般纳税人的时候填写，后续变更纳税人的其他信息不修改该字段
     */
    public java.util.Date startDate;

    /**
     * 记录纳税人的税务登记号的终止时间。
     */
    public java.util.Date taxEndDate;

    /**
     * 记录是否一般纳税人。LOVB=PUB-C-0006。
     */
    public java.lang.Integer generalTaxpayerFlag;

    /**
     * 记录纳税人的是否开具增值税专用发票标志。LOVB=PUB-C-0006。
     */
    public java.lang.Integer vatInvoicesFlag;

    /**
     * 记录发票投递方式。LOVB=ACC-C-0199，复用帐单投递方式的主数据
     */
    public java.lang.String billDeliverWay;

    /**
     * 记录发票投递地址。
     */
    public java.lang.String billDeliverAddr;

    /**
     * 邮政编码
     */
    public java.lang.String postcode;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录审批通过时间
     */
    public java.util.Date approvalTime;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录纳税人标识，作为主键
     */
    public void setTaxPayerId(java.lang.Long taxPayerId) {
        this.taxPayerId = taxPayerId;
    }

    /**
     * 获取 记录纳税人标识，作为主键
     */
    public java.lang.Long getTaxPayerId() {
        return this.taxPayerId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.taxPayerId = SeqUtils.createLongId(ID_SEQ);
         return this.taxPayerId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户标识，作为主键
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 记录客户标识，作为主键
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 记录纳税人的税务登记号。
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }

    /**
     * 获取 记录纳税人的税务登记号。
     */
    public java.lang.String getTaxId() {
        return this.taxId;
    }

    /**
     * 设置 记录纳税人在税务所登记的名称
     */
    public void setTaxName(java.lang.String taxName) {
        this.taxName = taxName;
    }

    /**
     * 获取 记录纳税人在税务所登记的名称
     */
    public java.lang.String getTaxName() {
        return this.taxName;
    }

    /**
     * 设置 税务登记号所属省份。按照营改增的业务规范，“税务省份编码”是“税务登记号”的前三位，
     */
    public void setTaxProvinceCode(java.lang.String taxProvinceCode) {
        this.taxProvinceCode = taxProvinceCode;
    }

    /**
     * 获取 税务登记号所属省份。按照营改增的业务规范，“税务省份编码”是“税务登记号”的前三位，
     */
    public java.lang.String getTaxProvinceCode() {
        return this.taxProvinceCode;
    }

    /**
     * 设置 税务登记证上的税务登记联系电话
     */
    public void setTaxRelaTel(java.lang.String taxRelaTel) {
        this.taxRelaTel = taxRelaTel;
    }

    /**
     * 获取 税务登记证上的税务登记联系电话
     */
    public java.lang.String getTaxRelaTel() {
        return this.taxRelaTel;
    }

    /**
     * 设置 税务登记证上的税务登记联系地址
     */
    public void setTaxRelaAddr(java.lang.String taxRelaAddr) {
        this.taxRelaAddr = taxRelaAddr;
    }

    /**
     * 获取 税务登记证上的税务登记联系地址
     */
    public java.lang.String getTaxRelaAddr() {
        return this.taxRelaAddr;
    }

    /**
     * 设置 记录纳税人的税务登记证上的税务登记银行名称
     */
    public void setTaxBankName(java.lang.String taxBankName) {
        this.taxBankName = taxBankName;
    }

    /**
     * 获取 记录纳税人的税务登记证上的税务登记银行名称
     */
    public java.lang.String getTaxBankName() {
        return this.taxBankName;
    }

    /**
     * 设置 记录纳税人的银行开户许可证上的开户银行账号
     */
    public void setTaxBankAcct(java.lang.String taxBankAcct) {
        this.taxBankAcct = taxBankAcct;
    }

    /**
     * 获取 记录纳税人的银行开户许可证上的开户银行账号
     */
    public java.lang.String getTaxBankAcct() {
        return this.taxBankAcct;
    }

    /**
     * 设置 变更为一般纳税人的时间，按照业务规则为变更竣工时间的次月1号，该值只在变更为一般纳税人的时候填写，后续变更纳税人的其他信息不修改该字段
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取 变更为一般纳税人的时间，按照业务规则为变更竣工时间的次月1号，该值只在变更为一般纳税人的时候填写，后续变更纳税人的其他信息不修改该字段
     */
    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * 设置 记录纳税人的税务登记号的终止时间。
     */
    public void setTaxEndDate(java.util.Date taxEndDate) {
        this.taxEndDate = taxEndDate;
    }

    /**
     * 获取 记录纳税人的税务登记号的终止时间。
     */
    public java.util.Date getTaxEndDate() {
        return this.taxEndDate;
    }

    /**
     * 设置 记录是否一般纳税人。LOVB=PUB-C-0006。
     */
    public void setGeneralTaxpayerFlag(java.lang.Integer generalTaxpayerFlag) {
        this.generalTaxpayerFlag = generalTaxpayerFlag;
    }

    /**
     * 获取 记录是否一般纳税人。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getGeneralTaxpayerFlag() {
        return this.generalTaxpayerFlag;
    }

    /**
     * 设置 记录纳税人的是否开具增值税专用发票标志。LOVB=PUB-C-0006。
     */
    public void setVatInvoicesFlag(java.lang.Integer vatInvoicesFlag) {
        this.vatInvoicesFlag = vatInvoicesFlag;
    }

    /**
     * 获取 记录纳税人的是否开具增值税专用发票标志。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getVatInvoicesFlag() {
        return this.vatInvoicesFlag;
    }

    /**
     * 设置 记录发票投递方式。LOVB=ACC-C-0199，复用帐单投递方式的主数据
     */
    public void setBillDeliverWay(java.lang.String billDeliverWay) {
        this.billDeliverWay = billDeliverWay;
    }

    /**
     * 获取 记录发票投递方式。LOVB=ACC-C-0199，复用帐单投递方式的主数据
     */
    public java.lang.String getBillDeliverWay() {
        return this.billDeliverWay;
    }

    /**
     * 设置 记录发票投递地址。
     */
    public void setBillDeliverAddr(java.lang.String billDeliverAddr) {
        this.billDeliverAddr = billDeliverAddr;
    }

    /**
     * 获取 记录发票投递地址。
     */
    public java.lang.String getBillDeliverAddr() {
        return this.billDeliverAddr;
    }

    /**
     * 设置 邮政编码
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取 邮政编码
     */
    public java.lang.String getPostcode() {
        return this.postcode;
    }

    /**
     * 设置 记录生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录审批通过时间
     */
    public void setApprovalTime(java.util.Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * 获取 记录审批通过时间
     */
    public java.util.Date getApprovalTime() {
        return this.approvalTime;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
