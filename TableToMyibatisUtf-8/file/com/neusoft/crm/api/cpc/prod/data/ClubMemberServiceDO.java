package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录俱乐部提供给会员的差异化的特色服务。
 * @实体表  :CLUB_MEMBER_SERVICE
 */
public class ClubMemberServiceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CLUB_MEMBER_SERVICE_S";

    /**
     * 记录俱乐部会员服务标识。
     */
    public java.lang.Long memberServiceId;

    /**
     * 俱乐部标识
     */
    public java.lang.Integer clubId;

    /**
     * 记录俱乐部服务的名称。
     */
    public java.lang.String serviceName;

    /**
     * 记录俱乐部服务的内容描述。
     */
    public java.lang.String serviceContent;

    /**
     * 记录俱乐部服务的形式分类。LOVB=CLB-0001
     */
    public java.lang.String serviceStyle;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.memberServiceId = SeqUtils.createLongId(ID_SEQ);
         return this.memberServiceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 俱乐部标识
     */
    public void setClubId(java.lang.Integer clubId) {
        this.clubId = clubId;
    }

    /**
     * 获取 俱乐部标识
     */
    public java.lang.Integer getClubId() {
        return this.clubId;
    }

    /**
     * 设置 记录俱乐部服务的名称。
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取 记录俱乐部服务的名称。
     */
    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    /**
     * 设置 记录俱乐部服务的内容描述。
     */
    public void setServiceContent(java.lang.String serviceContent) {
        this.serviceContent = serviceContent;
    }

    /**
     * 获取 记录俱乐部服务的内容描述。
     */
    public java.lang.String getServiceContent() {
        return this.serviceContent;
    }

    /**
     * 设置 记录俱乐部服务的形式分类。LOVB=CLB-0001
     */
    public void setServiceStyle(java.lang.String serviceStyle) {
        this.serviceStyle = serviceStyle;
    }

    /**
     * 获取 记录俱乐部服务的形式分类。LOVB=CLB-0001
     */
    public java.lang.String getServiceStyle() {
        return this.serviceStyle;
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
