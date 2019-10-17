package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录申请单的经办人信息、时间要求。通过流程审批。
 * @实体表  :MKT_RES_REQUEST
 */
public class MktResRequestDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_REQUEST_S";

    /**
     * 记录营销资源申请单标识
     */
    public java.lang.Long mktResReqId;

    /**
     * 申请单编码
     */
    public java.lang.String reqCode;

    /**
     * 申请单名称
     */
    public java.lang.String reqName;

    /**
     * 申请单类型.LOVB=RES-C-0051
     */
    public java.lang.String reqType;

    /**
     * 申请单内容描述
     */
    public java.lang.String content;

    /**
     * 目标营销资源仓库标识
     */
    public java.lang.Long mktResStoreId;

    /**
     * 目标营销资源仓库
     */
    public java.lang.Integer destStoreId;

    /**
     * 记录要求完成时间
     */
    public java.util.Date completeDate;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 记录经办人。修改为关联参与人标识，HANDLER-->PARTY_ID
     */
    public java.lang.Long partyId;

    /**
     * 记录经办人联系标识
     */
    public java.lang.Long contactId;

    /**
     * 记录二代身份证的扫描信息。修改为关联参与人证件标识，CERT_TYPE_ID---》PARTY_CERT_ID，然后关联出证件类型和证件号码
     */
    public java.lang.Long partyCertId;

    /**
     * 记录状态。LOVB=RES-C-0010
     */
    public java.lang.String statusCd;

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
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 记录营销资源申请单标识
     */
    public void setMktResReqId(java.lang.Long mktResReqId) {
        this.mktResReqId = mktResReqId;
    }

    /**
     * 获取 记录营销资源申请单标识
     */
    public java.lang.Long getMktResReqId() {
        return this.mktResReqId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResReqId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResReqId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 申请单编码
     */
    public void setReqCode(java.lang.String reqCode) {
        this.reqCode = reqCode;
    }

    /**
     * 获取 申请单编码
     */
    public java.lang.String getReqCode() {
        return this.reqCode;
    }

    /**
     * 设置 申请单名称
     */
    public void setReqName(java.lang.String reqName) {
        this.reqName = reqName;
    }

    /**
     * 获取 申请单名称
     */
    public java.lang.String getReqName() {
        return this.reqName;
    }

    /**
     * 设置 申请单类型.LOVB=RES-C-0051
     */
    public void setReqType(java.lang.String reqType) {
        this.reqType = reqType;
    }

    /**
     * 获取 申请单类型.LOVB=RES-C-0051
     */
    public java.lang.String getReqType() {
        return this.reqType;
    }

    /**
     * 设置 申请单内容描述
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    /**
     * 获取 申请单内容描述
     */
    public java.lang.String getContent() {
        return this.content;
    }

    /**
     * 设置 目标营销资源仓库标识
     */
    public void setMktResStoreId(java.lang.Long mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    /**
     * 获取 目标营销资源仓库标识
     */
    public java.lang.Long getMktResStoreId() {
        return this.mktResStoreId;
    }

    /**
     * 设置 目标营销资源仓库
     */
    public void setDestStoreId(java.lang.Integer destStoreId) {
        this.destStoreId = destStoreId;
    }

    /**
     * 获取 目标营销资源仓库
     */
    public java.lang.Integer getDestStoreId() {
        return this.destStoreId;
    }

    /**
     * 设置 记录要求完成时间
     */
    public void setCompleteDate(java.util.Date completeDate) {
        this.completeDate = completeDate;
    }

    /**
     * 获取 记录要求完成时间
     */
    public java.util.Date getCompleteDate() {
        return this.completeDate;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录经办人。修改为关联参与人标识，HANDLER-->PARTY_ID
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录经办人。修改为关联参与人标识，HANDLER-->PARTY_ID
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录经办人联系标识
     */
    public void setContactId(java.lang.Long contactId) {
        this.contactId = contactId;
    }

    /**
     * 获取 记录经办人联系标识
     */
    public java.lang.Long getContactId() {
        return this.contactId;
    }

    /**
     * 设置 记录二代身份证的扫描信息。修改为关联参与人证件标识，CERT_TYPE_ID---》PARTY_CERT_ID，然后关联出证件类型和证件号码
     */
    public void setPartyCertId(java.lang.Long partyCertId) {
        this.partyCertId = partyCertId;
    }

    /**
     * 获取 记录二代身份证的扫描信息。修改为关联参与人证件标识，CERT_TYPE_ID---》PARTY_CERT_ID，然后关联出证件类型和证件号码
     */
    public java.lang.Long getPartyCertId() {
        return this.partyCertId;
    }

    /**
     * 设置 记录状态。LOVB=RES-C-0010
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=RES-C-0010
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
