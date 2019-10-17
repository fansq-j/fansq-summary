package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:个人是指一个独立的自然人。
 * @实体表  :PARTY_IND
 */
public class PartyIndDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PARTY_IND_S";

    /**
     * 记录个人标识，作为主键
     */
    public java.lang.Long individualId;

    /**
     * 记录参与人标识，作为主键。
     */
    public java.lang.Long partyId;

    /**
     * 记录个人的出生日期。
     */
    public java.util.Date birthday;

    /**
     * 记录个人的婚姻状况。LOVB=PTY-0006。
     */
    public java.lang.String maritalStatus;

    /**
     * 记录个人的性别。LOVB=PTY-0008。
     */
    public java.lang.String gender;

    /**
     * 记录个人的国籍。LOVB=PTY-0005。
     */
    public java.lang.String nationality;

    /**
     * 记录个人的民族。LOVB=PTY-0009。
     */
    public java.lang.String nation;

    /**
     * 记录个人的宗教情况。LOVB=PTY-0010。
     */
    public java.lang.String religion;

    /**
     * 记录个人的教育水平。LOVB=PTY-0007。
     */
    public java.lang.String education;

    /**
     * 记录个人的职业。LOVB=PTY-0011。
     */
    public java.lang.String occupation;

    /**
     * 记录个人的工作单位。
     */
    public java.lang.String employer;

    /**
     * 记录个人的职务。
     */
    public java.lang.String position;

    /**
     * 记录个人的个人网址。
     */
    public java.lang.String website;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
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
     * 设置 记录个人标识，作为主键
     */
    public void setIndividualId(java.lang.Long individualId) {
        this.individualId = individualId;
    }

    /**
     * 获取 记录个人标识，作为主键
     */
    public java.lang.Long getIndividualId() {
        return this.individualId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.individualId = SeqUtils.createLongId(ID_SEQ);
         return this.individualId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录参与人标识，作为主键。
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人标识，作为主键。
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录个人的出生日期。
     */
    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取 记录个人的出生日期。
     */
    public java.util.Date getBirthday() {
        return this.birthday;
    }

    /**
     * 设置 记录个人的婚姻状况。LOVB=PTY-0006。
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 获取 记录个人的婚姻状况。LOVB=PTY-0006。
     */
    public java.lang.String getMaritalStatus() {
        return this.maritalStatus;
    }

    /**
     * 设置 记录个人的性别。LOVB=PTY-0008。
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }

    /**
     * 获取 记录个人的性别。LOVB=PTY-0008。
     */
    public java.lang.String getGender() {
        return this.gender;
    }

    /**
     * 设置 记录个人的国籍。LOVB=PTY-0005。
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }

    /**
     * 获取 记录个人的国籍。LOVB=PTY-0005。
     */
    public java.lang.String getNationality() {
        return this.nationality;
    }

    /**
     * 设置 记录个人的民族。LOVB=PTY-0009。
     */
    public void setNation(java.lang.String nation) {
        this.nation = nation;
    }

    /**
     * 获取 记录个人的民族。LOVB=PTY-0009。
     */
    public java.lang.String getNation() {
        return this.nation;
    }

    /**
     * 设置 记录个人的宗教情况。LOVB=PTY-0010。
     */
    public void setReligion(java.lang.String religion) {
        this.religion = religion;
    }

    /**
     * 获取 记录个人的宗教情况。LOVB=PTY-0010。
     */
    public java.lang.String getReligion() {
        return this.religion;
    }

    /**
     * 设置 记录个人的教育水平。LOVB=PTY-0007。
     */
    public void setEducation(java.lang.String education) {
        this.education = education;
    }

    /**
     * 获取 记录个人的教育水平。LOVB=PTY-0007。
     */
    public java.lang.String getEducation() {
        return this.education;
    }

    /**
     * 设置 记录个人的职业。LOVB=PTY-0011。
     */
    public void setOccupation(java.lang.String occupation) {
        this.occupation = occupation;
    }

    /**
     * 获取 记录个人的职业。LOVB=PTY-0011。
     */
    public java.lang.String getOccupation() {
        return this.occupation;
    }

    /**
     * 设置 记录个人的工作单位。
     */
    public void setEmployer(java.lang.String employer) {
        this.employer = employer;
    }

    /**
     * 获取 记录个人的工作单位。
     */
    public java.lang.String getEmployer() {
        return this.employer;
    }

    /**
     * 设置 记录个人的职务。
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }

    /**
     * 获取 记录个人的职务。
     */
    public java.lang.String getPosition() {
        return this.position;
    }

    /**
     * 设置 记录个人的个人网址。
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }

    /**
     * 获取 记录个人的个人网址。
     */
    public java.lang.String getWebsite() {
        return this.website;
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
