package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:关键人
 * @实体表  :KEY_PERSON
 */
public class KeyPersonDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "KEY_PERSON_S";

    /**
     * 记录关键人标识，作为主键
     */
    public java.lang.Long keyPersonId;

    /**
     * 记录参与人唯一标识，作为主键。
     */
    public java.lang.Long partyId;

    /**
     * 记录关键人类型。LOVB=CUS-C-0016。
     */
    public java.lang.String keyPersonType;

    /**
     * 关键人名称
     */
    public java.lang.String keyPersonName;

    /**
     * 记录关键人联系电话
     */
    public java.lang.String contactPhone;

    /**
     * 记录关键人联系邮箱
     */
    public java.lang.String contactEmail;

    /**
     * 记录关键人详细信息
     */
    public java.lang.String keyPersonDesc;

    /**
     * 记录关键人的部门
     */
    public java.lang.String dept;

    /**
     * 记录关键人的职务
     */
    public java.lang.String position;

    /**
     * 记录关键人的影响力
     */
    public java.lang.String decisionAffect;

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
     * 状态变更的时间。
            
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
     * 设置 记录关键人标识，作为主键
     */
    public void setKeyPersonId(java.lang.Long keyPersonId) {
        this.keyPersonId = keyPersonId;
    }

    /**
     * 获取 记录关键人标识，作为主键
     */
    public java.lang.Long getKeyPersonId() {
        return this.keyPersonId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.keyPersonId = SeqUtils.createLongId(ID_SEQ);
         return this.keyPersonId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录参与人唯一标识，作为主键。
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人唯一标识，作为主键。
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录关键人类型。LOVB=CUS-C-0016。
     */
    public void setKeyPersonType(java.lang.String keyPersonType) {
        this.keyPersonType = keyPersonType;
    }

    /**
     * 获取 记录关键人类型。LOVB=CUS-C-0016。
     */
    public java.lang.String getKeyPersonType() {
        return this.keyPersonType;
    }

    /**
     * 设置 关键人名称
     */
    public void setKeyPersonName(java.lang.String keyPersonName) {
        this.keyPersonName = keyPersonName;
    }

    /**
     * 获取 关键人名称
     */
    public java.lang.String getKeyPersonName() {
        return this.keyPersonName;
    }

    /**
     * 设置 记录关键人联系电话
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取 记录关键人联系电话
     */
    public java.lang.String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * 设置 记录关键人联系邮箱
     */
    public void setContactEmail(java.lang.String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * 获取 记录关键人联系邮箱
     */
    public java.lang.String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * 设置 记录关键人详细信息
     */
    public void setKeyPersonDesc(java.lang.String keyPersonDesc) {
        this.keyPersonDesc = keyPersonDesc;
    }

    /**
     * 获取 记录关键人详细信息
     */
    public java.lang.String getKeyPersonDesc() {
        return this.keyPersonDesc;
    }

    /**
     * 设置 记录关键人的部门
     */
    public void setDept(java.lang.String dept) {
        this.dept = dept;
    }

    /**
     * 获取 记录关键人的部门
     */
    public java.lang.String getDept() {
        return this.dept;
    }

    /**
     * 设置 记录关键人的职务
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }

    /**
     * 获取 记录关键人的职务
     */
    public java.lang.String getPosition() {
        return this.position;
    }

    /**
     * 设置 记录关键人的影响力
     */
    public void setDecisionAffect(java.lang.String decisionAffect) {
        this.decisionAffect = decisionAffect;
    }

    /**
     * 获取 记录关键人的影响力
     */
    public java.lang.String getDecisionAffect() {
        return this.decisionAffect;
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
