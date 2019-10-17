package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录参与人的证件信息
 * @实体表  :PARTY_CERT
 */
public class PartyCertDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PARTY_CERT_S";

    /**
     * 记录参与人证件标识，作为主键。
     */
    public java.lang.Long partyCertId;

    /**
     * 记录参与人标识，作为外键，指向参与人实体。
     */
    public java.lang.Long partyId;

    /**
     * 记录参与人证件的是否为实名认证使用的证件 。LOVB=PTY-C-0008
     */
    public java.lang.String isRealnameCert;

    /**
     * 描述参与人证件的证件类型。LOVB=PTY-0004。
     */
    public java.lang.String certType;

    /**
     * 记录参与人证件的发证机关。
     */
    public java.lang.String certOrg;

    /**
     * 记录参与人证件的证件地址。
     */
    public java.lang.String certAddr;

    /**
     * 记录参与人证件的证件号码。
     */
    public java.lang.String certNum;

    /**
     * 记录参与人证件的审核人，外键，指向员工实体。
     */
    public java.lang.Long checker;

    /**
     * 记录参与人证件的核查时间。
     */
    public java.util.Date checkTime;

    /**
     * 记录参与人证件的核查结果。LOVB=PTY-C-0004。
     */
    public java.lang.String certCheckResult;

    /**
     * 记录参与人证件的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录参与人证件的失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录参与人证件标识，作为主键。
     */
    public void setPartyCertId(java.lang.Long partyCertId) {
        this.partyCertId = partyCertId;
    }

    /**
     * 获取 记录参与人证件标识，作为主键。
     */
    public java.lang.Long getPartyCertId() {
        return this.partyCertId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.partyCertId = SeqUtils.createLongId(ID_SEQ);
         return this.partyCertId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录参与人标识，作为外键，指向参与人实体。
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人标识，作为外键，指向参与人实体。
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
     * 设置 描述参与人证件的证件类型。LOVB=PTY-0004。
     */
    public void setCertType(java.lang.String certType) {
        this.certType = certType;
    }

    /**
     * 获取 描述参与人证件的证件类型。LOVB=PTY-0004。
     */
    public java.lang.String getCertType() {
        return this.certType;
    }

    /**
     * 设置 记录参与人证件的发证机关。
     */
    public void setCertOrg(java.lang.String certOrg) {
        this.certOrg = certOrg;
    }

    /**
     * 获取 记录参与人证件的发证机关。
     */
    public java.lang.String getCertOrg() {
        return this.certOrg;
    }

    /**
     * 设置 记录参与人证件的证件地址。
     */
    public void setCertAddr(java.lang.String certAddr) {
        this.certAddr = certAddr;
    }

    /**
     * 获取 记录参与人证件的证件地址。
     */
    public java.lang.String getCertAddr() {
        return this.certAddr;
    }

    /**
     * 设置 记录参与人证件的证件号码。
     */
    public void setCertNum(java.lang.String certNum) {
        this.certNum = certNum;
    }

    /**
     * 获取 记录参与人证件的证件号码。
     */
    public java.lang.String getCertNum() {
        return this.certNum;
    }

    /**
     * 设置 记录参与人证件的审核人，外键，指向员工实体。
     */
    public void setChecker(java.lang.Long checker) {
        this.checker = checker;
    }

    /**
     * 获取 记录参与人证件的审核人，外键，指向员工实体。
     */
    public java.lang.Long getChecker() {
        return this.checker;
    }

    /**
     * 设置 记录参与人证件的核查时间。
     */
    public void setCheckTime(java.util.Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取 记录参与人证件的核查时间。
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
     * 设置 记录参与人证件的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录参与人证件的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录参与人证件的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录参与人证件的失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 记录状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
