package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:中国电信客户俱乐部是为品牌客户和中高端客户提供差异化积分回馈服务的平台和载体。
 * @实体表  :CLUB
 */
public class ClubDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CLUB_S";

    /**
     * 记录俱乐部标识
     */
    public java.lang.Integer clubId;

    /**
     * 记录俱乐部名称
     */
    public java.lang.String clubName;

    /**
     * 记录俱乐部编码
     */
    public java.lang.String clubCode;

    /**
     * 记录俱乐部描述
     */
    public java.lang.String clubDesc;

    /**
     * 记录俱乐部类型信息，如实体俱乐部、虚拟俱乐部。LOVB=CLB-0005
     */
    public java.lang.String clubType;

    /**
     * 记录状态编码。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 记录俱乐部标识
     */
    public void setClubId(java.lang.Integer clubId) {
        this.clubId = clubId;
    }

    /**
     * 获取 记录俱乐部标识
     */
    public java.lang.Integer getClubId() {
        return this.clubId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.clubId = SeqUtils.createIntegerId(ID_SEQ);
         return this.clubId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录俱乐部名称
     */
    public void setClubName(java.lang.String clubName) {
        this.clubName = clubName;
    }

    /**
     * 获取 记录俱乐部名称
     */
    public java.lang.String getClubName() {
        return this.clubName;
    }

    /**
     * 设置 记录俱乐部编码
     */
    public void setClubCode(java.lang.String clubCode) {
        this.clubCode = clubCode;
    }

    /**
     * 获取 记录俱乐部编码
     */
    public java.lang.String getClubCode() {
        return this.clubCode;
    }

    /**
     * 设置 记录俱乐部描述
     */
    public void setClubDesc(java.lang.String clubDesc) {
        this.clubDesc = clubDesc;
    }

    /**
     * 获取 记录俱乐部描述
     */
    public java.lang.String getClubDesc() {
        return this.clubDesc;
    }

    /**
     * 设置 记录俱乐部类型信息，如实体俱乐部、虚拟俱乐部。LOVB=CLB-0005
     */
    public void setClubType(java.lang.String clubType) {
        this.clubType = clubType;
    }

    /**
     * 获取 记录俱乐部类型信息，如实体俱乐部、虚拟俱乐部。LOVB=CLB-0005
     */
    public java.lang.String getClubType() {
        return this.clubType;
    }

    /**
     * 设置 记录状态编码。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态编码。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工。
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
     * 设置 记录修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工。
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
