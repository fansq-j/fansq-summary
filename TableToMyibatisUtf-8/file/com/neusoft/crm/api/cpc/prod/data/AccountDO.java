package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用来支付产品实例费用的实体
 * @实体表  :ACCOUNT
 */
public class AccountDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCOUNT_S";

    /**
     * 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long acctId;

    /**
     * 帐户注册的名称
     */
    public java.lang.String acctName;

    /**
     * 合同号信息
     */
    public java.lang.String acctCd;

    /**
     * 记录参与人唯一标识，作为外键，帐户原来挂在客户下，现改挂参与人下。
     */
    public java.lang.Long custId;

    /**
     * 电信大帐户的登录名称，作为客户登录电信大帐户的唯一入口。
     */
    public java.lang.String acctLoginName;

    /**
     * 电信大帐户的登录密码
     */
    public java.lang.String loginPassword;

    /**
     * 帐户计费类型，LOVB=ACC-C-0017
     */
    public java.lang.Integer acctBillingType;

    /**
     * 帐户代表号码的实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 帐户的状态 当前帐户记录的状态。ACC-C-0203
     */
    public java.lang.Integer statusCd;

    /**
     * 帐户状态变更的时间。
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
     * 外部帐户标识，记录集团帐户标识。集团4G帐户标识。
     */
    public java.lang.String extAcctId;

    /**
     * 集团政企CRM帐户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String ext1AcctId;

    /**
     * 物联网帐户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String ext2AcctId;

    /**
     * 转售帐户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String ext3AcctId;

    /**
     * 集团帐户库标识，根据省公司反馈建议增加，非空，-1标识没有集团客户库标识。
     */
    public java.lang.String groupAcctId;

    /**
     * 设置 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取 为每个帐户生成的唯一编号，只具有逻辑上的含义，没有物理意义。每个帐户标识生成之后，帐户标识在整个服务提供有效期内保持不变。
     */
    public java.lang.Long getAcctId() {
        return this.acctId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.acctId = SeqUtils.createLongId(ID_SEQ);
         return this.acctId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 帐户注册的名称
     */
    public void setAcctName(java.lang.String acctName) {
        this.acctName = acctName;
    }

    /**
     * 获取 帐户注册的名称
     */
    public java.lang.String getAcctName() {
        return this.acctName;
    }

    /**
     * 设置 合同号信息
     */
    public void setAcctCd(java.lang.String acctCd) {
        this.acctCd = acctCd;
    }

    /**
     * 获取 合同号信息
     */
    public java.lang.String getAcctCd() {
        return this.acctCd;
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
     * 设置 电信大帐户的登录名称，作为客户登录电信大帐户的唯一入口。
     */
    public void setAcctLoginName(java.lang.String acctLoginName) {
        this.acctLoginName = acctLoginName;
    }

    /**
     * 获取 电信大帐户的登录名称，作为客户登录电信大帐户的唯一入口。
     */
    public java.lang.String getAcctLoginName() {
        return this.acctLoginName;
    }

    /**
     * 设置 电信大帐户的登录密码
     */
    public void setLoginPassword(java.lang.String loginPassword) {
        this.loginPassword = loginPassword;
    }

    /**
     * 获取 电信大帐户的登录密码
     */
    public java.lang.String getLoginPassword() {
        return this.loginPassword;
    }

    /**
     * 设置 帐户计费类型，LOVB=ACC-C-0017
     */
    public void setAcctBillingType(java.lang.Integer acctBillingType) {
        this.acctBillingType = acctBillingType;
    }

    /**
     * 获取 帐户计费类型，LOVB=ACC-C-0017
     */
    public java.lang.Integer getAcctBillingType() {
        return this.acctBillingType;
    }

    /**
     * 设置 帐户代表号码的实例标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 帐户代表号码的实例标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 帐户的状态 当前帐户记录的状态。ACC-C-0203
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 帐户的状态 当前帐户记录的状态。ACC-C-0203
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 帐户状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 帐户状态变更的时间。
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

    /**
     * 设置 外部帐户标识，记录集团帐户标识。集团4G帐户标识。
     */
    public void setExtAcctId(java.lang.String extAcctId) {
        this.extAcctId = extAcctId;
    }

    /**
     * 获取 外部帐户标识，记录集团帐户标识。集团4G帐户标识。
     */
    public java.lang.String getExtAcctId() {
        return this.extAcctId;
    }

    /**
     * 设置 集团政企CRM帐户标识，根据省公司反馈建议增加，可空
     */
    public void setExt1AcctId(java.lang.String ext1AcctId) {
        this.ext1AcctId = ext1AcctId;
    }

    /**
     * 获取 集团政企CRM帐户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String getExt1AcctId() {
        return this.ext1AcctId;
    }

    /**
     * 设置 物联网帐户标识，根据省公司反馈建议增加，可空
     */
    public void setExt2AcctId(java.lang.String ext2AcctId) {
        this.ext2AcctId = ext2AcctId;
    }

    /**
     * 获取 物联网帐户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String getExt2AcctId() {
        return this.ext2AcctId;
    }

    /**
     * 设置 转售帐户标识，根据省公司反馈建议增加，可空
     */
    public void setExt3AcctId(java.lang.String ext3AcctId) {
        this.ext3AcctId = ext3AcctId;
    }

    /**
     * 获取 转售帐户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String getExt3AcctId() {
        return this.ext3AcctId;
    }

    /**
     * 设置 集团帐户库标识，根据省公司反馈建议增加，非空，-1标识没有集团客户库标识。
     */
    public void setGroupAcctId(java.lang.String groupAcctId) {
        this.groupAcctId = groupAcctId;
    }

    /**
     * 获取 集团帐户库标识，根据省公司反馈建议增加，非空，-1标识没有集团客户库标识。
     */
    public java.lang.String getGroupAcctId() {
        return this.groupAcctId;
    }

}
