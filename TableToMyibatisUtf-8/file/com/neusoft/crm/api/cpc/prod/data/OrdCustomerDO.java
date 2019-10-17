package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的客户。
 * @实体表  :ORD_CUSTOMER
 */
public class OrdCustomerDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_CUSTOMER_S";

    /**
     * 客户标识
     */
    public java.lang.Long custId;

    /**
     * 纳税人标识
     */
    public java.lang.Long taxPayerId;

    /**
     * 参与人标识
     */
    public java.lang.Long partyId;

    /**
     * 记录客户名称。
     */
    public java.lang.String custName;

    /**
     * 记录客户编码。LOVB=CUS-0010。
     */
    public java.lang.String custNumber;

    /**
     * 记录客户地址。
     */
    public java.lang.String custAddr;

    /**
     * 记录公共管理区域标识。
     */
    public java.lang.Long regionId;

    /**
     * 记录客户战略分群，如：政企、家庭、个人。LOVB=CUS-0001。
     */
    public java.lang.String custType;

    /**
     * 记录客户战略下属分群。LOVB=CUS-0002。
     */
    public java.lang.String custSubType;

    /**
     * 渠道标识。
     */
    public java.lang.Long custSourceId;

    /**
     * 记录客户归属区域级别，包括集团客户、跨省客户、省内客户。LOVB=CUS-0004。
     */
    public java.lang.String custAreaGrade;

    /**
     * 记录入网时间。
     */
    public java.util.Date enterDate;

    /**
     * 外部客户标识，记录集团客户标识。
     */
    public java.lang.String extCustId;

    /**
     * 集团下发的转售业务的合作商标识。
     */
    public java.lang.Long distributorId;

    /**
     * 记录客户的保密等级，比如：部分重要客户对于普通营业员不开放。LOVB=CUS-C-0001。
     */
    public java.lang.String secrecyLevel;

    /**
     * 记录最新修改客户资料关联的客户订单号，提供送计费接口时按单号获取。
     */
    public java.lang.Long custOrderId;

    /**
     * 增加主数据；分局、区局、市级、集团级。LOVB=CUS-C-0017。
     */
    public java.lang.String custControlLevel;

    /**
     * 部分客户有特殊要求需本人持证件才可办理；增加主数据；已办理电话委托授权。LOVB=PUB-C-0006
            
     */
    public java.lang.Integer isInstead;

    /**
     * 实名认证标识，记录该客户是否已经实名认证通过。实名认证的规则由应用实现。LOVB=PUB-C-0006。
     */
    public java.lang.Integer isRealname;

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
     * 记录客户状态，LOVB=CUS-0003。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录行业类型标识，作为外键，指向行业类型实体。
     */
    public java.lang.Long industryTypeId;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 集团政企CRM客户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String ext1CustId;

    /**
     * 物联网客户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String ext2CustId;

    /**
     * 转售客户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String ext3CustId;

    /**
     * 集团客户库标识，根据省公司反馈建议增加，非空，-1标识没有集团客户库标识。
     */
    public java.lang.String groupCustId;

    /**
     * 设置 客户标识
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 客户标识
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 纳税人标识
     */
    public void setTaxPayerId(java.lang.Long taxPayerId) {
        this.taxPayerId = taxPayerId;
    }

    /**
     * 获取 纳税人标识
     */
    public java.lang.Long getTaxPayerId() {
        return this.taxPayerId;
    }

    /**
     * 设置 参与人标识
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 参与人标识
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录客户名称。
     */
    public void setCustName(java.lang.String custName) {
        this.custName = custName;
    }

    /**
     * 获取 记录客户名称。
     */
    public java.lang.String getCustName() {
        return this.custName;
    }

    /**
     * 设置 记录客户编码。LOVB=CUS-0010。
     */
    public void setCustNumber(java.lang.String custNumber) {
        this.custNumber = custNumber;
    }

    /**
     * 获取 记录客户编码。LOVB=CUS-0010。
     */
    public java.lang.String getCustNumber() {
        return this.custNumber;
    }

    /**
     * 设置 记录客户地址。
     */
    public void setCustAddr(java.lang.String custAddr) {
        this.custAddr = custAddr;
    }

    /**
     * 获取 记录客户地址。
     */
    public java.lang.String getCustAddr() {
        return this.custAddr;
    }

    /**
     * 设置 记录公共管理区域标识。
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录公共管理区域标识。
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录客户战略分群，如：政企、家庭、个人。LOVB=CUS-0001。
     */
    public void setCustType(java.lang.String custType) {
        this.custType = custType;
    }

    /**
     * 获取 记录客户战略分群，如：政企、家庭、个人。LOVB=CUS-0001。
     */
    public java.lang.String getCustType() {
        return this.custType;
    }

    /**
     * 设置 记录客户战略下属分群。LOVB=CUS-0002。
     */
    public void setCustSubType(java.lang.String custSubType) {
        this.custSubType = custSubType;
    }

    /**
     * 获取 记录客户战略下属分群。LOVB=CUS-0002。
     */
    public java.lang.String getCustSubType() {
        return this.custSubType;
    }

    /**
     * 设置 渠道标识。
     */
    public void setCustSourceId(java.lang.Long custSourceId) {
        this.custSourceId = custSourceId;
    }

    /**
     * 获取 渠道标识。
     */
    public java.lang.Long getCustSourceId() {
        return this.custSourceId;
    }

    /**
     * 设置 记录客户归属区域级别，包括集团客户、跨省客户、省内客户。LOVB=CUS-0004。
     */
    public void setCustAreaGrade(java.lang.String custAreaGrade) {
        this.custAreaGrade = custAreaGrade;
    }

    /**
     * 获取 记录客户归属区域级别，包括集团客户、跨省客户、省内客户。LOVB=CUS-0004。
     */
    public java.lang.String getCustAreaGrade() {
        return this.custAreaGrade;
    }

    /**
     * 设置 记录入网时间。
     */
    public void setEnterDate(java.util.Date enterDate) {
        this.enterDate = enterDate;
    }

    /**
     * 获取 记录入网时间。
     */
    public java.util.Date getEnterDate() {
        return this.enterDate;
    }

    /**
     * 设置 外部客户标识，记录集团客户标识。
     */
    public void setExtCustId(java.lang.String extCustId) {
        this.extCustId = extCustId;
    }

    /**
     * 获取 外部客户标识，记录集团客户标识。
     */
    public java.lang.String getExtCustId() {
        return this.extCustId;
    }

    /**
     * 设置 集团下发的转售业务的合作商标识。
     */
    public void setDistributorId(java.lang.Long distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * 获取 集团下发的转售业务的合作商标识。
     */
    public java.lang.Long getDistributorId() {
        return this.distributorId;
    }

    /**
     * 设置 记录客户的保密等级，比如：部分重要客户对于普通营业员不开放。LOVB=CUS-C-0001。
     */
    public void setSecrecyLevel(java.lang.String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
    }

    /**
     * 获取 记录客户的保密等级，比如：部分重要客户对于普通营业员不开放。LOVB=CUS-C-0001。
     */
    public java.lang.String getSecrecyLevel() {
        return this.secrecyLevel;
    }

    /**
     * 设置 记录最新修改客户资料关联的客户订单号，提供送计费接口时按单号获取。
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 记录最新修改客户资料关联的客户订单号，提供送计费接口时按单号获取。
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 增加主数据；分局、区局、市级、集团级。LOVB=CUS-C-0017。
     */
    public void setCustControlLevel(java.lang.String custControlLevel) {
        this.custControlLevel = custControlLevel;
    }

    /**
     * 获取 增加主数据；分局、区局、市级、集团级。LOVB=CUS-C-0017。
     */
    public java.lang.String getCustControlLevel() {
        return this.custControlLevel;
    }

    /**
     * 设置 部分客户有特殊要求需本人持证件才可办理；增加主数据；已办理电话委托授权。LOVB=PUB-C-0006
            
     */
    public void setIsInstead(java.lang.Integer isInstead) {
        this.isInstead = isInstead;
    }

    /**
     * 获取 部分客户有特殊要求需本人持证件才可办理；增加主数据；已办理电话委托授权。LOVB=PUB-C-0006
            
     */
    public java.lang.Integer getIsInstead() {
        return this.isInstead;
    }

    /**
     * 设置 实名认证标识，记录该客户是否已经实名认证通过。实名认证的规则由应用实现。LOVB=PUB-C-0006。
     */
    public void setIsRealname(java.lang.Integer isRealname) {
        this.isRealname = isRealname;
    }

    /**
     * 获取 实名认证标识，记录该客户是否已经实名认证通过。实名认证的规则由应用实现。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getIsRealname() {
        return this.isRealname;
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
     * 设置 记录客户状态，LOVB=CUS-0003。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录客户状态，LOVB=CUS-0003。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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
     * 设置 记录行业类型标识，作为外键，指向行业类型实体。
     */
    public void setIndustryTypeId(java.lang.Long industryTypeId) {
        this.industryTypeId = industryTypeId;
    }

    /**
     * 获取 记录行业类型标识，作为外键，指向行业类型实体。
     */
    public java.lang.Long getIndustryTypeId() {
        return this.industryTypeId;
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

    /**
     * 设置 集团政企CRM客户标识，根据省公司反馈建议增加，可空
     */
    public void setExt1CustId(java.lang.String ext1CustId) {
        this.ext1CustId = ext1CustId;
    }

    /**
     * 获取 集团政企CRM客户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String getExt1CustId() {
        return this.ext1CustId;
    }

    /**
     * 设置 物联网客户标识，根据省公司反馈建议增加，可空
     */
    public void setExt2CustId(java.lang.String ext2CustId) {
        this.ext2CustId = ext2CustId;
    }

    /**
     * 获取 物联网客户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String getExt2CustId() {
        return this.ext2CustId;
    }

    /**
     * 设置 转售客户标识，根据省公司反馈建议增加，可空
     */
    public void setExt3CustId(java.lang.String ext3CustId) {
        this.ext3CustId = ext3CustId;
    }

    /**
     * 获取 转售客户标识，根据省公司反馈建议增加，可空
     */
    public java.lang.String getExt3CustId() {
        return this.ext3CustId;
    }

    /**
     * 设置 集团客户库标识，根据省公司反馈建议增加，非空，-1标识没有集团客户库标识。
     */
    public void setGroupCustId(java.lang.String groupCustId) {
        this.groupCustId = groupCustId;
    }

    /**
     * 获取 集团客户库标识，根据省公司反馈建议增加，非空，-1标识没有集团客户库标识。
     */
    public java.lang.String getGroupCustId() {
        return this.groupCustId;
    }

}
