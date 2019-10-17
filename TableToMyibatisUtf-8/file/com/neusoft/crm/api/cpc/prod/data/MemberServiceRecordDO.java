package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录会员享受会员服务的信息。
 * @实体表  :MEMBER_SERVICE_RECORD
 */
public class MemberServiceRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MEMBER_SERVICE_RECORD_S";

    /**
     * 记录会员服务记录标识。
     */
    public java.lang.Long recordId;

    /**
     * 记录会员ID。
     */
    public java.lang.Long clubMemberId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录俱乐部服务标识。
     */
    public java.lang.Long memberServiceId;

    /**
     * 记录会员服务的内容说明。
     */
    public java.lang.String serviceContent;

    /**
     * 记录会员服务类型。LOVB=CLB-0004
     */
    public java.lang.String serviceType;

    /**
     * 记录会员服务场所。
     */
    public java.lang.String servicePlace;

    /**
     * 标记会员服务是否异地服务。LOVB=PUB-C-0006
     */
    public java.lang.Integer roamFlag;

    /**
     * 记录会员服务的发起省编码。
     */
    public java.lang.String provCode;

    /**
     * 记录发生服务的时间。
     */
    public java.util.Date serviceDate;

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
     * 设置 记录会员服务记录标识。
     */
    public void setRecordId(java.lang.Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取 记录会员服务记录标识。
     */
    public java.lang.Long getRecordId() {
        return this.recordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.recordId = SeqUtils.createLongId(ID_SEQ);
         return this.recordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录会员ID。
     */
    public void setClubMemberId(java.lang.Long clubMemberId) {
        this.clubMemberId = clubMemberId;
    }

    /**
     * 获取 记录会员ID。
     */
    public java.lang.Long getClubMemberId() {
        return this.clubMemberId;
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
     * 设置 记录俱乐部服务标识。
     */
    public void setMemberServiceId(java.lang.Long memberServiceId) {
        this.memberServiceId = memberServiceId;
    }

    /**
     * 获取 记录俱乐部服务标识。
     */
    public java.lang.Long getMemberServiceId() {
        return this.memberServiceId;
    }

    /**
     * 设置 记录会员服务的内容说明。
     */
    public void setServiceContent(java.lang.String serviceContent) {
        this.serviceContent = serviceContent;
    }

    /**
     * 获取 记录会员服务的内容说明。
     */
    public java.lang.String getServiceContent() {
        return this.serviceContent;
    }

    /**
     * 设置 记录会员服务类型。LOVB=CLB-0004
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 获取 记录会员服务类型。LOVB=CLB-0004
     */
    public java.lang.String getServiceType() {
        return this.serviceType;
    }

    /**
     * 设置 记录会员服务场所。
     */
    public void setServicePlace(java.lang.String servicePlace) {
        this.servicePlace = servicePlace;
    }

    /**
     * 获取 记录会员服务场所。
     */
    public java.lang.String getServicePlace() {
        return this.servicePlace;
    }

    /**
     * 设置 标记会员服务是否异地服务。LOVB=PUB-C-0006
     */
    public void setRoamFlag(java.lang.Integer roamFlag) {
        this.roamFlag = roamFlag;
    }

    /**
     * 获取 标记会员服务是否异地服务。LOVB=PUB-C-0006
     */
    public java.lang.Integer getRoamFlag() {
        return this.roamFlag;
    }

    /**
     * 设置 记录会员服务的发起省编码。
     */
    public void setProvCode(java.lang.String provCode) {
        this.provCode = provCode;
    }

    /**
     * 获取 记录会员服务的发起省编码。
     */
    public java.lang.String getProvCode() {
        return this.provCode;
    }

    /**
     * 设置 记录发生服务的时间。
     */
    public void setServiceDate(java.util.Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    /**
     * 获取 记录发生服务的时间。
     */
    public java.util.Date getServiceDate() {
        return this.serviceDate;
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
