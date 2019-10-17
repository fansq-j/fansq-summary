package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录俱乐部与服务的关系
 * @实体表  :CLUB_SERVICE_REL
 */
public class ClubServiceRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CLUB_SERVICE_REL_S";

    /**
     * 记录俱乐部服务关系标识。
     */
    public java.lang.Long clubServiceRelId;

    /**
     * 记录服务标识。
     */
    public java.lang.Long serviceId;

    /**
     * 记录俱乐部会员服务标识。
     */
    public java.lang.Long memberServiceId;

    /**
     * 记录关系类型。LOVB=CLB-C-0002
     */
    public java.lang.String relType;

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
     * 设置 记录俱乐部服务关系标识。
     */
    public void setClubServiceRelId(java.lang.Long clubServiceRelId) {
        this.clubServiceRelId = clubServiceRelId;
    }

    /**
     * 获取 记录俱乐部服务关系标识。
     */
    public java.lang.Long getClubServiceRelId() {
        return this.clubServiceRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.clubServiceRelId = SeqUtils.createLongId(ID_SEQ);
         return this.clubServiceRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录服务标识。
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 获取 记录服务标识。
     */
    public java.lang.Long getServiceId() {
        return this.serviceId;
    }

    /**
     * 设置 记录俱乐部会员服务标识。
     */
    public void setMemberServiceId(java.lang.Long memberServiceId) {
        this.memberServiceId = memberServiceId;
    }

    /**
     * 获取 记录俱乐部会员服务标识。
     */
    public java.lang.Long getMemberServiceId() {
        return this.memberServiceId;
    }

    /**
     * 设置 记录关系类型。LOVB=CLB-C-0002
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录关系类型。LOVB=CLB-C-0002
     */
    public java.lang.String getRelType() {
        return this.relType;
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
