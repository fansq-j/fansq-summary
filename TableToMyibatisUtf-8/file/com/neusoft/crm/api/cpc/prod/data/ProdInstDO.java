package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:一个能独立提供通信功能的产品实例或一个信息、服务、实物产品的实例。
 * @实体表  :PROD_INST
 */
public class ProdInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_S";

    /**
     * 记录产品实例标识的主键
     */
    public java.lang.Long prodInstId;

    /**
     * 记录产品的标识，外键
     */
    public java.lang.Integer prodId;

    /**
     * 记录功能产品实例对应的接入产品实例ID
     */
    public java.lang.Long accProdInstId;

    /**
     * 记录产品使用类型。LOVB=PRI-C-0019
     */
    public java.lang.String prodUseType;

    /**
     * 记录产品实例的业务号码。
     */
    public java.lang.String accNum;

    /**
     * 记录宽带的帐号，如：XXX@adsl。
     */
    public java.lang.String account;

    /**
     * 记录产品的付费模式，LOVB=PRI-0001
     */
    public java.lang.String paymentModeCd;

    /**
     * 记录地址描述信息
     */
    public java.lang.String addressDesc;

    /**
     * 记录产品产权客户的标识。
     */
    public java.lang.Long ownerCustId;

    /**
     * 记录产品鉴权的密码。
     */
    public java.lang.String prodInstPwd;

    /**
     * 记录OSS返回的局向标识。
     */
    public java.lang.Integer exchId;

    /**
     * 记录OSS返回的地址标识
     */
    public java.lang.String addressId;

    /**
     * 地域中的公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long lanId;

    /**
     * 记录后端首次发起激活的请求的接口时间。(仅首次更新，通常用于套卡激活或准实时预付费的产品)
     */
    public java.util.Date actDate;

    /**
     * 记录起租时间。(由客户或协议决定发起的时间。)
     */
    public java.util.Date beginRentDate;

    /**
     * 记录停租时间。(由客户或协议决定发起的时间。)
     */
    public java.util.Date stopRentDate;

    /**
     * 记录产品实例状态。LOVB=PRI-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录实例创建的组织标识，员工选择的任职所对应的组织。
     */
    public java.lang.Long createOrgId;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录实例信息创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次产品状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录任何变动时，物理修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录首次订单竣工时间。（仅记录产品首次开通的时间，优先以开通返回的竣工时间为准。）
     */
    public java.util.Date firstFinishDate;

    /**
     * 记录产品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。
     */
    public java.util.Date busiModDate;

    /**
     * 记录产品使用客户的标识。
     */
    public java.lang.Long useCustId;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录积分归属使用客户标识
     */
    public java.lang.Long pointOwnerId;

    /**
     * 记录外部产品实例标识
     */
    public java.lang.String extProdInstId;

    /**
     * 设置 记录产品实例标识的主键
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识的主键
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodInstId = SeqUtils.createLongId(ID_SEQ);
         return this.prodInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录产品的标识，外键
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 记录产品的标识，外键
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 记录功能产品实例对应的接入产品实例ID
     */
    public void setAccProdInstId(java.lang.Long accProdInstId) {
        this.accProdInstId = accProdInstId;
    }

    /**
     * 获取 记录功能产品实例对应的接入产品实例ID
     */
    public java.lang.Long getAccProdInstId() {
        return this.accProdInstId;
    }

    /**
     * 设置 记录产品使用类型。LOVB=PRI-C-0019
     */
    public void setProdUseType(java.lang.String prodUseType) {
        this.prodUseType = prodUseType;
    }

    /**
     * 获取 记录产品使用类型。LOVB=PRI-C-0019
     */
    public java.lang.String getProdUseType() {
        return this.prodUseType;
    }

    /**
     * 设置 记录产品实例的业务号码。
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }

    /**
     * 获取 记录产品实例的业务号码。
     */
    public java.lang.String getAccNum() {
        return this.accNum;
    }

    /**
     * 设置 记录宽带的帐号，如：XXX@adsl。
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }

    /**
     * 获取 记录宽带的帐号，如：XXX@adsl。
     */
    public java.lang.String getAccount() {
        return this.account;
    }

    /**
     * 设置 记录产品的付费模式，LOVB=PRI-0001
     */
    public void setPaymentModeCd(java.lang.String paymentModeCd) {
        this.paymentModeCd = paymentModeCd;
    }

    /**
     * 获取 记录产品的付费模式，LOVB=PRI-0001
     */
    public java.lang.String getPaymentModeCd() {
        return this.paymentModeCd;
    }

    /**
     * 设置 记录地址描述信息
     */
    public void setAddressDesc(java.lang.String addressDesc) {
        this.addressDesc = addressDesc;
    }

    /**
     * 获取 记录地址描述信息
     */
    public java.lang.String getAddressDesc() {
        return this.addressDesc;
    }

    /**
     * 设置 记录产品产权客户的标识。
     */
    public void setOwnerCustId(java.lang.Long ownerCustId) {
        this.ownerCustId = ownerCustId;
    }

    /**
     * 获取 记录产品产权客户的标识。
     */
    public java.lang.Long getOwnerCustId() {
        return this.ownerCustId;
    }

    /**
     * 设置 记录产品鉴权的密码。
     */
    public void setProdInstPwd(java.lang.String prodInstPwd) {
        this.prodInstPwd = prodInstPwd;
    }

    /**
     * 获取 记录产品鉴权的密码。
     */
    public java.lang.String getProdInstPwd() {
        return this.prodInstPwd;
    }

    /**
     * 设置 记录OSS返回的局向标识。
     */
    public void setExchId(java.lang.Integer exchId) {
        this.exchId = exchId;
    }

    /**
     * 获取 记录OSS返回的局向标识。
     */
    public java.lang.Integer getExchId() {
        return this.exchId;
    }

    /**
     * 设置 记录OSS返回的地址标识
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取 记录OSS返回的地址标识
     */
    public java.lang.String getAddressId() {
        return this.addressId;
    }

    /**
     * 设置 地域中的公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 地域中的公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录本地网标识，数据来源于公共管理区域。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 记录后端首次发起激活的请求的接口时间。(仅首次更新，通常用于套卡激活或准实时预付费的产品)
     */
    public void setActDate(java.util.Date actDate) {
        this.actDate = actDate;
    }

    /**
     * 获取 记录后端首次发起激活的请求的接口时间。(仅首次更新，通常用于套卡激活或准实时预付费的产品)
     */
    public java.util.Date getActDate() {
        return this.actDate;
    }

    /**
     * 设置 记录起租时间。(由客户或协议决定发起的时间。)
     */
    public void setBeginRentDate(java.util.Date beginRentDate) {
        this.beginRentDate = beginRentDate;
    }

    /**
     * 获取 记录起租时间。(由客户或协议决定发起的时间。)
     */
    public java.util.Date getBeginRentDate() {
        return this.beginRentDate;
    }

    /**
     * 设置 记录停租时间。(由客户或协议决定发起的时间。)
     */
    public void setStopRentDate(java.util.Date stopRentDate) {
        this.stopRentDate = stopRentDate;
    }

    /**
     * 获取 记录停租时间。(由客户或协议决定发起的时间。)
     */
    public java.util.Date getStopRentDate() {
        return this.stopRentDate;
    }

    /**
     * 设置 记录产品实例状态。LOVB=PRI-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录产品实例状态。LOVB=PRI-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录实例创建的组织标识，员工选择的任职所对应的组织。
     */
    public void setCreateOrgId(java.lang.Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    /**
     * 获取 记录实例创建的组织标识，员工选择的任职所对应的组织。
     */
    public java.lang.Long getCreateOrgId() {
        return this.createOrgId;
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
     * 设置 记录实例信息创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录实例信息创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次产品状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录每次产品状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录任何变动时，物理修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录任何变动时，物理修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录首次订单竣工时间。（仅记录产品首次开通的时间，优先以开通返回的竣工时间为准。）
     */
    public void setFirstFinishDate(java.util.Date firstFinishDate) {
        this.firstFinishDate = firstFinishDate;
    }

    /**
     * 获取 记录首次订单竣工时间。（仅记录产品首次开通的时间，优先以开通返回的竣工时间为准。）
     */
    public java.util.Date getFirstFinishDate() {
        return this.firstFinishDate;
    }

    /**
     * 设置 记录产品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。
     */
    public void setBusiModDate(java.util.Date busiModDate) {
        this.busiModDate = busiModDate;
    }

    /**
     * 获取 记录产品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。
     */
    public java.util.Date getBusiModDate() {
        return this.busiModDate;
    }

    /**
     * 设置 记录产品使用客户的标识。
     */
    public void setUseCustId(java.lang.Long useCustId) {
        this.useCustId = useCustId;
    }

    /**
     * 获取 记录产品使用客户的标识。
     */
    public java.lang.Long getUseCustId() {
        return this.useCustId;
    }

    /**
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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
     * 设置 记录积分归属使用客户标识
     */
    public void setPointOwnerId(java.lang.Long pointOwnerId) {
        this.pointOwnerId = pointOwnerId;
    }

    /**
     * 获取 记录积分归属使用客户标识
     */
    public java.lang.Long getPointOwnerId() {
        return this.pointOwnerId;
    }

    /**
     * 设置 记录外部产品实例标识
     */
    public void setExtProdInstId(java.lang.String extProdInstId) {
        this.extProdInstId = extProdInstId;
    }

    /**
     * 获取 记录外部产品实例标识
     */
    public java.lang.String getExtProdInstId() {
        return this.extProdInstId;
    }

}
