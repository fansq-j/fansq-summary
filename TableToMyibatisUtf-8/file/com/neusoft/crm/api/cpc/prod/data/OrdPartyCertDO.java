package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的参与人证件。
 * @实体表  :ORD_PARTY_CERT
 */
public class OrdPartyCertDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_PARTY_CERT_S";

    /**
     * 记录参与人证件的唯一标识，作为主键。
     */
    public java.lang.Long partyCertId;

    /**
     * 记录参与人的唯一标识，作为外键。
     */
    public java.lang.Long partyId;

    /**
     * 记录参与人证件的是否为实名认证使用的证件 。LOVB=PTY-C-0008
     */
    public java.lang.String isRealnameCert;

    /**
     * 描述参与人证件的类型。LOVB=PTY-0004。
     */
    public java.lang.String certType;

    /**
     * 记录证件的发证机关。
     */
    public java.lang.String certOrg;

    /**
     * 记录参与人的证件上的详细地址。
     */
    public java.lang.String certAddr;

    /**
     * 记录参与人的证件号码。
     */
    public java.lang.String certNum;

    /**
     * 记录证件审核人。
     */
    public java.lang.Long checker;

    /**
     * 记录证件核查时间。
     */
    public java.util.Date checkTime;

    /**
     * 记录参与人证件的核查结果。LOVB=PTY-C-0004。
     */
    public java.lang.String certCheckResult;

    /**
     * 记录参与人标识信息的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录参与人标识的失效时间。
     */
    public java.util.Date expDate;

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
     * 记录数据的状态，分为有效/无效/历史。
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
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 记录参与人证件的唯一标识，作为主键。
     */
    public void setPartyCertId(java.lang.Long partyCertId) {
        this.partyCertId = partyCertId;
    }

    /**
     * 获取 记录参与人证件的唯一标识，作为主键。
     */
    public java.lang.Long getPartyCertId() {
        return this.partyCertId;
    }

    /**
     * 设置 记录参与人的唯一标识，作为外键。
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人的唯一标识，作为外键。
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录参与人证件的是否为实名认证使用的证件 。LOVB=PTY-C-0008
     */
    public void setIsRealnameCert(java.lang.String isRealnameCert) {
        this.isRealnameCert = isRealnameCert;
    }

    /**
     * 获取 记录参与人证件的是否为实名认证使用的证件 。LOVB=PTY-C-0008
     */
    public java.lang.String getIsRealnameCert() {
        return this.isRealnameCert;
    }

    /**
     * 设置 描述参与人证件的类型。LOVB=PTY-0004。
     */
    public void setCertType(java.lang.String certType) {
        this.certType = certType;
    }

    /**
     * 获取 描述参与人证件的类型。LOVB=PTY-0004。
     */
    public java.lang.String getCertType() {
        return this.certType;
    }

    /**
     * 设置 记录证件的发证机关。
     */
    public void setCertOrg(java.lang.String certOrg) {
        this.certOrg = certOrg;
    }

    /**
     * 获取 记录证件的发证机关。
     */
    public java.lang.String getCertOrg() {
        return this.certOrg;
    }

    /**
     * 设置 记录参与人的证件上的详细地址。
     */
    public void setCertAddr(java.lang.String certAddr) {
        this.certAddr = certAddr;
    }

    /**
     * 获取 记录参与人的证件上的详细地址。
     */
    public java.lang.String getCertAddr() {
        return this.certAddr;
    }

    /**
     * 设置 记录参与人的证件号码。
     */
    public void setCertNum(java.lang.String certNum) {
        this.certNum = certNum;
    }

    /**
     * 获取 记录参与人的证件号码。
     */
    public java.lang.String getCertNum() {
        return this.certNum;
    }

    /**
     * 设置 记录证件审核人。
     */
    public void setChecker(java.lang.Long checker) {
        this.checker = checker;
    }

    /**
     * 获取 记录证件审核人。
     */
    public java.lang.Long getChecker() {
        return this.checker;
    }

    /**
     * 设置 记录证件核查时间。
     */
    public void setCheckTime(java.util.Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取 记录证件核查时间。
     */
    public java.util.Date getCheckTime() {
        return this.checkTime;
    }

    /**
     * 设置 记录参与人证件的核查结果。LOVB=PTY-C-0004。
     */
    public void setCertCheckResult(java.lang.String certCheckResult) {
        this.certCheckResult = certCheckResult;
    }

    /**
     * 获取 记录参与人证件的核查结果。LOVB=PTY-C-0004。
     */
    public java.lang.String getCertCheckResult() {
        return this.certCheckResult;
    }

    /**
     * 设置 记录参与人标识信息的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录参与人标识信息的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录参与人标识的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录参与人标识的失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
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
