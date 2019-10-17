package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :PARTY
 */
public class PartyDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PARTY_S";

    /**
     * 记录参与人标识，作为主键。
     */
    public java.lang.Double partyId;

    /**
     * 记录参与人的参与人名称。
     */
    public java.lang.String partyName;

    /**
     * 记录参与人的名称简拼。
     */
    public java.lang.String partyAbbrname;

    /**
     * 记录参与人的英文名称
     */
    public java.lang.String englishName;

    /**
     * 记录参与人的类型。LOVB=PTY-0001。
     */
    public java.lang.String partyType;

    /**
     * 记录外部参与人标识，比如记录集团下发的参与人标识。
     */
    public java.lang.String extPartyId;

    /**
     * 记录状态。LOVB=PTY-0002。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Double createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Double updateStaff;

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
     * 设置 记录参与人标识，作为主键。
     */
    public void setPartyId(java.lang.Double partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人标识，作为主键。
     */
    public java.lang.Double getPartyId() {
        return this.partyId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Double doCreateId(){
         this.partyId = null;
         return this.partyId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Double createId(){
    	  return null;
    }

    /**
     * 设置 记录参与人的参与人名称。
     */
    public void setPartyName(java.lang.String partyName) {
        this.partyName = partyName;
    }

    /**
     * 获取 记录参与人的参与人名称。
     */
    public java.lang.String getPartyName() {
        return this.partyName;
    }

    /**
     * 设置 记录参与人的名称简拼。
     */
    public void setPartyAbbrname(java.lang.String partyAbbrname) {
        this.partyAbbrname = partyAbbrname;
    }

    /**
     * 获取 记录参与人的名称简拼。
     */
    public java.lang.String getPartyAbbrname() {
        return this.partyAbbrname;
    }

    /**
     * 设置 记录参与人的英文名称
     */
    public void setEnglishName(java.lang.String englishName) {
        this.englishName = englishName;
    }

    /**
     * 获取 记录参与人的英文名称
     */
    public java.lang.String getEnglishName() {
        return this.englishName;
    }

    /**
     * 设置 记录参与人的类型。LOVB=PTY-0001。
     */
    public void setPartyType(java.lang.String partyType) {
        this.partyType = partyType;
    }

    /**
     * 获取 记录参与人的类型。LOVB=PTY-0001。
     */
    public java.lang.String getPartyType() {
        return this.partyType;
    }

    /**
     * 设置 记录外部参与人标识，比如记录集团下发的参与人标识。
     */
    public void setExtPartyId(java.lang.String extPartyId) {
        this.extPartyId = extPartyId;
    }

    /**
     * 获取 记录外部参与人标识，比如记录集团下发的参与人标识。
     */
    public java.lang.String getExtPartyId() {
        return this.extPartyId;
    }

    /**
     * 设置 记录状态。LOVB=PTY-0002。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PTY-0002。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
     */
    public void setCreateStaff(java.lang.Double createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
     */
    public java.lang.Double getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
     */
    public void setUpdateStaff(java.lang.Double updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
     */
    public java.lang.Double getUpdateStaff() {
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
