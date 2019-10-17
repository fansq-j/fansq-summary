package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录对个人或组织证件的核查记录。例如：身份证的国政通审核记录，组织机构代码的审核记录。
 * @实体表  :PARTY_CHECK_LOG
 */
public class PartyCheckLogDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PARTY_CHECK_LOG_S";

    /**
     * 参与人核查记录标识，作为主键。
     */
    public java.lang.Long partyCheckLogId;

    /**
     * 记录参与人证件标识，作为外键，指向参与人证件实体。
     */
    public java.lang.Long partyCertId;

    /**
     * 记录参与人核查记录的核查类型。LOVB=PTY-C-0007。
     */
    public java.lang.String checkMethod;

    /**
     * 记录参与人核查记录的核查日期。
     */
    public java.util.Date checkDate;

    /**
     * 记录参与人核查记录的审核人，外键，指向员工实体。
     */
    public java.lang.Long checker;

    /**
     * 记录参与人核查记录的核查渠道。作为外键，指向系统信息实体。
     */
    public java.lang.Long checkChannel;

    /**
     * 记录参与人核查记录的核查结果。LOVB=PTY-C-0004。
     */
    public java.lang.String certCheckResult;

    /**
     * 核查参与人核查记录的核查错误信息。
     */
    public java.lang.String errorMessage;

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
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

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
     * 设置 参与人核查记录标识，作为主键。
     */
    public void setPartyCheckLogId(java.lang.Long partyCheckLogId) {
        this.partyCheckLogId = partyCheckLogId;
    }

    /**
     * 获取 参与人核查记录标识，作为主键。
     */
    public java.lang.Long getPartyCheckLogId() {
        return this.partyCheckLogId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.partyCheckLogId = SeqUtils.createLongId(ID_SEQ);
         return this.partyCheckLogId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录参与人证件标识，作为外键，指向参与人证件实体。
     */
    public void setPartyCertId(java.lang.Long partyCertId) {
        this.partyCertId = partyCertId;
    }

    /**
     * 获取 记录参与人证件标识，作为外键，指向参与人证件实体。
     */
    public java.lang.Long getPartyCertId() {
        return this.partyCertId;
    }

    /**
     * 设置 记录参与人核查记录的核查类型。LOVB=PTY-C-0007。
     */
    public void setCheckMethod(java.lang.String checkMethod) {
        this.checkMethod = checkMethod;
    }

    /**
     * 获取 记录参与人核查记录的核查类型。LOVB=PTY-C-0007。
     */
    public java.lang.String getCheckMethod() {
        return this.checkMethod;
    }

    /**
     * 设置 记录参与人核查记录的核查日期。
     */
    public void setCheckDate(java.util.Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取 记录参与人核查记录的核查日期。
     */
    public java.util.Date getCheckDate() {
        return this.checkDate;
    }

    /**
     * 设置 记录参与人核查记录的审核人，外键，指向员工实体。
     */
    public void setChecker(java.lang.Long checker) {
        this.checker = checker;
    }

    /**
     * 获取 记录参与人核查记录的审核人，外键，指向员工实体。
     */
    public java.lang.Long getChecker() {
        return this.checker;
    }

    /**
     * 设置 记录参与人核查记录的核查渠道。作为外键，指向系统信息实体。
     */
    public void setCheckChannel(java.lang.Long checkChannel) {
        this.checkChannel = checkChannel;
    }

    /**
     * 获取 记录参与人核查记录的核查渠道。作为外键，指向系统信息实体。
     */
    public java.lang.Long getCheckChannel() {
        return this.checkChannel;
    }

    /**
     * 设置 记录参与人核查记录的核查结果。LOVB=PTY-C-0004。
     */
    public void setCertCheckResult(java.lang.String certCheckResult) {
        this.certCheckResult = certCheckResult;
    }

    /**
     * 获取 记录参与人核查记录的核查结果。LOVB=PTY-C-0004。
     */
    public java.lang.String getCertCheckResult() {
        return this.certCheckResult;
    }

    /**
     * 设置 核查参与人核查记录的核查错误信息。
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 获取 核查参与人核查记录的核查错误信息。
     */
    public java.lang.String getErrorMessage() {
        return this.errorMessage;
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
