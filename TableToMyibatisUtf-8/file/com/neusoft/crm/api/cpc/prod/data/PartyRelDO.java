package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录参与人与参与人之间的关系信息
 * @实体表  :PARTY_REL
 */
public class PartyRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PARTY_REL_S";

    /**
     * 记录参与人关系标识，作为主键
     */
    public java.lang.Long partyRelId;

    /**
     * 记录参与人关系的A端参与人标识，作为外键，指向参与人实体。
     */
    public java.lang.Long partyAId;

    /**
     * 记录参与人关系的Z端参与人标识，作为外键，指向参与人实体。
     */
    public java.lang.Long partyZId;

    /**
     * 记录参与人关系的关系类型。LOVB=PTY-C-0005。
     */
    public java.lang.String partyRelType;

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
     * 设置 记录参与人关系标识，作为主键
     */
    public void setPartyRelId(java.lang.Long partyRelId) {
        this.partyRelId = partyRelId;
    }

    /**
     * 获取 记录参与人关系标识，作为主键
     */
    public java.lang.Long getPartyRelId() {
        return this.partyRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.partyRelId = SeqUtils.createLongId(ID_SEQ);
         return this.partyRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录参与人关系的A端参与人标识，作为外键，指向参与人实体。
     */
    public void setPartyAId(java.lang.Long partyAId) {
        this.partyAId = partyAId;
    }

    /**
     * 获取 记录参与人关系的A端参与人标识，作为外键，指向参与人实体。
     */
    public java.lang.Long getPartyAId() {
        return this.partyAId;
    }

    /**
     * 设置 记录参与人关系的Z端参与人标识，作为外键，指向参与人实体。
     */
    public void setPartyZId(java.lang.Long partyZId) {
        this.partyZId = partyZId;
    }

    /**
     * 获取 记录参与人关系的Z端参与人标识，作为外键，指向参与人实体。
     */
    public java.lang.Long getPartyZId() {
        return this.partyZId;
    }

    /**
     * 设置 记录参与人关系的关系类型。LOVB=PTY-C-0005。
     */
    public void setPartyRelType(java.lang.String partyRelType) {
        this.partyRelType = partyRelType;
    }

    /**
     * 获取 记录参与人关系的关系类型。LOVB=PTY-C-0005。
     */
    public java.lang.String getPartyRelType() {
        return this.partyRelType;
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
