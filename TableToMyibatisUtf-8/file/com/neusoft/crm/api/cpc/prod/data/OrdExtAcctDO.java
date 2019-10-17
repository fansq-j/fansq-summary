package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的外部支付帐号
 * @实体表  :ORD_EXT_ACCT
 */
public class OrdExtAcctDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_EXT_ACCT_S";

    /**
     * 外部帐户标识，主键
     */
    public java.lang.Long extAcctId;

    /**
     * LOVB=ACC-C-0214
     */
    public java.lang.Integer payChannel;

    /**
     * 存放外部帐户的帐号信息，如银行卡号，支付宝帐户名称等
     */
    public java.lang.String payAcctCode;

    /**
     * 外部帐户开户名称：姓名，公司名等。
     */
    public java.lang.String payAcctName;

    /**
     * 开户公司，如银行、腾讯、阿里等
            可作为主数据
     */
    public java.lang.Integer acctOwnerOrg;

    /**
     * 开户组织的分支机构，如银行的分行等
     */
    public java.lang.Integer acctOwnerOrgBranch;

    /**
     * LOVB=ACC-C-0044
     */
    public java.lang.Integer ifContractQuickPay;

    /**
     * 记录参与人唯一标识，作为外键，帐户原来挂在客户下，现改挂参与人下。
     */
    public java.lang.Long custId;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

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
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 外部帐户标识，主键
     */
    public void setExtAcctId(java.lang.Long extAcctId) {
        this.extAcctId = extAcctId;
    }

    /**
     * 获取 外部帐户标识，主键
     */
    public java.lang.Long getExtAcctId() {
        return this.extAcctId;
    }

    /**
     * 设置 LOVB=ACC-C-0214
     */
    public void setPayChannel(java.lang.Integer payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * 获取 LOVB=ACC-C-0214
     */
    public java.lang.Integer getPayChannel() {
        return this.payChannel;
    }

    /**
     * 设置 存放外部帐户的帐号信息，如银行卡号，支付宝帐户名称等
     */
    public void setPayAcctCode(java.lang.String payAcctCode) {
        this.payAcctCode = payAcctCode;
    }

    /**
     * 获取 存放外部帐户的帐号信息，如银行卡号，支付宝帐户名称等
     */
    public java.lang.String getPayAcctCode() {
        return this.payAcctCode;
    }

    /**
     * 设置 外部帐户开户名称：姓名，公司名等。
     */
    public void setPayAcctName(java.lang.String payAcctName) {
        this.payAcctName = payAcctName;
    }

    /**
     * 获取 外部帐户开户名称：姓名，公司名等。
     */
    public java.lang.String getPayAcctName() {
        return this.payAcctName;
    }

    /**
     * 设置 开户公司，如银行、腾讯、阿里等
            可作为主数据
     */
    public void setAcctOwnerOrg(java.lang.Integer acctOwnerOrg) {
        this.acctOwnerOrg = acctOwnerOrg;
    }

    /**
     * 获取 开户公司，如银行、腾讯、阿里等
            可作为主数据
     */
    public java.lang.Integer getAcctOwnerOrg() {
        return this.acctOwnerOrg;
    }

    /**
     * 设置 开户组织的分支机构，如银行的分行等
     */
    public void setAcctOwnerOrgBranch(java.lang.Integer acctOwnerOrgBranch) {
        this.acctOwnerOrgBranch = acctOwnerOrgBranch;
    }

    /**
     * 获取 开户组织的分支机构，如银行的分行等
     */
    public java.lang.Integer getAcctOwnerOrgBranch() {
        return this.acctOwnerOrgBranch;
    }

    /**
     * 设置 LOVB=ACC-C-0044
     */
    public void setIfContractQuickPay(java.lang.Integer ifContractQuickPay) {
        this.ifContractQuickPay = ifContractQuickPay;
    }

    /**
     * 获取 LOVB=ACC-C-0044
     */
    public java.lang.Integer getIfContractQuickPay() {
        return this.ifContractQuickPay;
    }

    /**
     * 设置 记录参与人唯一标识，作为外键，帐户原来挂在客户下，现改挂参与人下。
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 记录参与人唯一标识，作为外键，帐户原来挂在客户下，现改挂参与人下。
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
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
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
