package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的个人。
 * @实体表  :ORD_PARTY_IND
 */
public class OrdPartyIndDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_PARTY_IND_S";

    /**
     * 个人标识
     */
    public java.lang.Long individualId;

    /**
     * 参与人标识
     */
    public java.lang.Long partyId;

    /**
     * 记录个人的出生日期。
     */
    public java.util.Date birthday;

    /**
     * 描述个人的婚姻状况。LOVB=PTY-0006。
     */
    public java.lang.String maritalStatus;

    /**
     * 记录个人的性别。LOVB=PTY-0008。
     */
    public java.lang.String gender;

    /**
     * 记录个人所属的国籍。LOVB=PTY-0005。
     */
    public java.lang.String nationality;

    /**
     * 记录个人的民族类别。LOVB=PTY-0009。
     */
    public java.lang.String nation;

    /**
     * 描述个人的宗教情况。LOVB=PTY-0010。
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
     * 记录个人所属的工作单位。
     */
    public java.lang.String employer;

    /**
     * 记录个人的职务。
     */
    public java.lang.String position;

    /**
     * 记录个人的网址
     */
    public java.lang.String website;

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
     * 设置 个人标识
     */
    public void setIndividualId(java.lang.Long individualId) {
        this.individualId = individualId;
    }

    /**
     * 获取 个人标识
     */
    public java.lang.Long getIndividualId() {
        return this.individualId;
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
     * 设置 描述个人的婚姻状况。LOVB=PTY-0006。
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 获取 描述个人的婚姻状况。LOVB=PTY-0006。
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
     * 设置 记录个人所属的国籍。LOVB=PTY-0005。
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }

    /**
     * 获取 记录个人所属的国籍。LOVB=PTY-0005。
     */
    public java.lang.String getNationality() {
        return this.nationality;
    }

    /**
     * 设置 记录个人的民族类别。LOVB=PTY-0009。
     */
    public void setNation(java.lang.String nation) {
        this.nation = nation;
    }

    /**
     * 获取 记录个人的民族类别。LOVB=PTY-0009。
     */
    public java.lang.String getNation() {
        return this.nation;
    }

    /**
     * 设置 描述个人的宗教情况。LOVB=PTY-0010。
     */
    public void setReligion(java.lang.String religion) {
        this.religion = religion;
    }

    /**
     * 获取 描述个人的宗教情况。LOVB=PTY-0010。
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
     * 设置 记录个人所属的工作单位。
     */
    public void setEmployer(java.lang.String employer) {
        this.employer = employer;
    }

    /**
     * 获取 记录个人所属的工作单位。
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
     * 设置 记录个人的网址
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }

    /**
     * 获取 记录个人的网址
     */
    public java.lang.String getWebsite() {
        return this.website;
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
