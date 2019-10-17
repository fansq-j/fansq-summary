package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是中国电信与客户之间，为了办理业务所明确的关于各方权利和义务关系的具有法律效力的书面协议。协议是根据协议模板规格实例化的
 * @实体表  :AGREEMENT
 */
public class AgreementDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREEMENT_S";

    /**
     * 记录协议标识
     */
    public java.lang.Long agreeId;

    /**
     * 协议模板主键
     */
    public java.lang.Long agreementTmpId;

    /**
     * 记录协议编码
     */
    public java.lang.String agreeNbr;

    /**
     * 协议名称
     */
    public java.lang.String agreeName;

    /**
     * 签署日期
     */
    public java.util.Date signDate;

    /**
     * 记录签订员工标识
     */
    public java.lang.Long signPerson;

    /**
     * 甲方名称
     */
    public java.lang.String partyAName;

    /**
     * 记录签署地点
     */
    public java.lang.String signPlace;

    /**
     * 记录有效期(月)
     */
    public java.lang.Integer validPeriod;

    /**
     * 协议状态，LOVB=ARG-0003
     */
    public java.lang.String statusCd;

    /**
     * 记录合同总金额（元）
     */
    public java.lang.Long agreeAmount;

    /**
     * 记录合同生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录合同失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 协议类型，LOVB=ARG-0002
     */
    public java.lang.String agreeType;

    /**
     * 记录协议的对象类型，LOVB=ARG-C-0010
     */
    public java.lang.String objType;

    /**
     * 记录业务对象ID
     */
    public java.lang.Long objId;

    /**
     * 甲方联系地址
     */
    public java.lang.String partyAAddr;

    /**
     * 甲方联系人名称
     */
    public java.lang.String partyAContact;

    /**
     * 甲方联系电话
     */
    public java.lang.String partyAPhone;

    /**
     * 甲方签署人名称
     */
    public java.lang.String partyASigner;

    /**
     * 乙方名称
     */
    public java.lang.String partyZName;

    /**
     * 乙方联系地址
     */
    public java.lang.String partyZAddr;

    /**
     * 乙方联系人
     */
    public java.lang.String partyZContact;

    /**
     * 乙方联系电话
     */
    public java.lang.String partyZPhone;

    /**
     * 乙方签署人
     */
    public java.lang.String partyZSigner;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录协议的到期处理方式,LOVB=ARG-C-0011
     */
    public java.lang.String expProcMethod;

    /**
     * 状态变更原因
     */
    public java.lang.String statusChgReason;

    /**
     * 设置 记录协议标识
     */
    public void setAgreeId(java.lang.Long agreeId) {
        this.agreeId = agreeId;
    }

    /**
     * 获取 记录协议标识
     */
    public java.lang.Long getAgreeId() {
        return this.agreeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议模板主键
     */
    public void setAgreementTmpId(java.lang.Long agreementTmpId) {
        this.agreementTmpId = agreementTmpId;
    }

    /**
     * 获取 协议模板主键
     */
    public java.lang.Long getAgreementTmpId() {
        return this.agreementTmpId;
    }

    /**
     * 设置 记录协议编码
     */
    public void setAgreeNbr(java.lang.String agreeNbr) {
        this.agreeNbr = agreeNbr;
    }

    /**
     * 获取 记录协议编码
     */
    public java.lang.String getAgreeNbr() {
        return this.agreeNbr;
    }

    /**
     * 设置 协议名称
     */
    public void setAgreeName(java.lang.String agreeName) {
        this.agreeName = agreeName;
    }

    /**
     * 获取 协议名称
     */
    public java.lang.String getAgreeName() {
        return this.agreeName;
    }

    /**
     * 设置 签署日期
     */
    public void setSignDate(java.util.Date signDate) {
        this.signDate = signDate;
    }

    /**
     * 获取 签署日期
     */
    public java.util.Date getSignDate() {
        return this.signDate;
    }

    /**
     * 设置 记录签订员工标识
     */
    public void setSignPerson(java.lang.Long signPerson) {
        this.signPerson = signPerson;
    }

    /**
     * 获取 记录签订员工标识
     */
    public java.lang.Long getSignPerson() {
        return this.signPerson;
    }

    /**
     * 设置 甲方名称
     */
    public void setPartyAName(java.lang.String partyAName) {
        this.partyAName = partyAName;
    }

    /**
     * 获取 甲方名称
     */
    public java.lang.String getPartyAName() {
        return this.partyAName;
    }

    /**
     * 设置 记录签署地点
     */
    public void setSignPlace(java.lang.String signPlace) {
        this.signPlace = signPlace;
    }

    /**
     * 获取 记录签署地点
     */
    public java.lang.String getSignPlace() {
        return this.signPlace;
    }

    /**
     * 设置 记录有效期(月)
     */
    public void setValidPeriod(java.lang.Integer validPeriod) {
        this.validPeriod = validPeriod;
    }

    /**
     * 获取 记录有效期(月)
     */
    public java.lang.Integer getValidPeriod() {
        return this.validPeriod;
    }

    /**
     * 设置 协议状态，LOVB=ARG-0003
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 协议状态，LOVB=ARG-0003
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录合同总金额（元）
     */
    public void setAgreeAmount(java.lang.Long agreeAmount) {
        this.agreeAmount = agreeAmount;
    }

    /**
     * 获取 记录合同总金额（元）
     */
    public java.lang.Long getAgreeAmount() {
        return this.agreeAmount;
    }

    /**
     * 设置 记录合同生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录合同生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录合同失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录合同失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 协议类型，LOVB=ARG-0002
     */
    public void setAgreeType(java.lang.String agreeType) {
        this.agreeType = agreeType;
    }

    /**
     * 获取 协议类型，LOVB=ARG-0002
     */
    public java.lang.String getAgreeType() {
        return this.agreeType;
    }

    /**
     * 设置 记录协议的对象类型，LOVB=ARG-C-0010
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录协议的对象类型，LOVB=ARG-C-0010
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录业务对象ID
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录业务对象ID
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 甲方联系地址
     */
    public void setPartyAAddr(java.lang.String partyAAddr) {
        this.partyAAddr = partyAAddr;
    }

    /**
     * 获取 甲方联系地址
     */
    public java.lang.String getPartyAAddr() {
        return this.partyAAddr;
    }

    /**
     * 设置 甲方联系人名称
     */
    public void setPartyAContact(java.lang.String partyAContact) {
        this.partyAContact = partyAContact;
    }

    /**
     * 获取 甲方联系人名称
     */
    public java.lang.String getPartyAContact() {
        return this.partyAContact;
    }

    /**
     * 设置 甲方联系电话
     */
    public void setPartyAPhone(java.lang.String partyAPhone) {
        this.partyAPhone = partyAPhone;
    }

    /**
     * 获取 甲方联系电话
     */
    public java.lang.String getPartyAPhone() {
        return this.partyAPhone;
    }

    /**
     * 设置 甲方签署人名称
     */
    public void setPartyASigner(java.lang.String partyASigner) {
        this.partyASigner = partyASigner;
    }

    /**
     * 获取 甲方签署人名称
     */
    public java.lang.String getPartyASigner() {
        return this.partyASigner;
    }

    /**
     * 设置 乙方名称
     */
    public void setPartyZName(java.lang.String partyZName) {
        this.partyZName = partyZName;
    }

    /**
     * 获取 乙方名称
     */
    public java.lang.String getPartyZName() {
        return this.partyZName;
    }

    /**
     * 设置 乙方联系地址
     */
    public void setPartyZAddr(java.lang.String partyZAddr) {
        this.partyZAddr = partyZAddr;
    }

    /**
     * 获取 乙方联系地址
     */
    public java.lang.String getPartyZAddr() {
        return this.partyZAddr;
    }

    /**
     * 设置 乙方联系人
     */
    public void setPartyZContact(java.lang.String partyZContact) {
        this.partyZContact = partyZContact;
    }

    /**
     * 获取 乙方联系人
     */
    public java.lang.String getPartyZContact() {
        return this.partyZContact;
    }

    /**
     * 设置 乙方联系电话
     */
    public void setPartyZPhone(java.lang.String partyZPhone) {
        this.partyZPhone = partyZPhone;
    }

    /**
     * 获取 乙方联系电话
     */
    public java.lang.String getPartyZPhone() {
        return this.partyZPhone;
    }

    /**
     * 设置 乙方签署人
     */
    public void setPartyZSigner(java.lang.String partyZSigner) {
        this.partyZSigner = partyZSigner;
    }

    /**
     * 获取 乙方签署人
     */
    public java.lang.String getPartyZSigner() {
        return this.partyZSigner;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 记录协议的到期处理方式,LOVB=ARG-C-0011
     */
    public void setExpProcMethod(java.lang.String expProcMethod) {
        this.expProcMethod = expProcMethod;
    }

    /**
     * 获取 记录协议的到期处理方式,LOVB=ARG-C-0011
     */
    public java.lang.String getExpProcMethod() {
        return this.expProcMethod;
    }

    /**
     * 设置 状态变更原因
     */
    public void setStatusChgReason(java.lang.String statusChgReason) {
        this.statusChgReason = statusChgReason;
    }

    /**
     * 获取 状态变更原因
     */
    public java.lang.String getStatusChgReason() {
        return this.statusChgReason;
    }

}
