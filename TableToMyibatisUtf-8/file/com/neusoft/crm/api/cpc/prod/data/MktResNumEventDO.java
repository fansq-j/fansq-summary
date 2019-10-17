package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:1.描述对营销资源号码的操作事件。数据量太多，独立分表。按照号码、卡分别建一套表。
2.增加字段：营销资源实
 * @实体表  :MKT_RES_NUM_EVENT
 */
public class MktResNumEventDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_NUM_EVENT_S";

    /**
     * 营销资源库存变动事件标识
     */
    public java.lang.Long mktResEventId;

    /**
     * 记录营销资源库存事件名称名称。
     */
    public java.lang.String mktResEventName;

    /**
     * 营销资源库存变动事件编码
     */
    public java.lang.String mktResEventNbr;

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer mktResStoreId;

    /**
     * 目标营销资源仓库
     */
    public java.lang.Integer destStoreId;

    /**
     * 记录触发事件的资源申请单标识、订单项标识等20150325
     */
    public java.lang.Long objId;

    /**
     * 描述触发事件的对象类型：资源申请单,订单项等。LOVB=RES-C-0006
     */
    public java.lang.String objType;

    /**
     * 记录号码事件类型。LOVB=RES-C-0019
     */
    public java.lang.String eventType;

    /**
     * 记录事件描述信息
     */
    public java.lang.String eventDesc;

    /**
     * 记录预占一个号码时的号码实例标识，不用产生事件明细；在一批号码调拨时才使用事件明细。
     */
    public java.lang.Long mktResInstId;

    /**
     * 记录经办人。修改为关联参与人标识，HANDLER-->PARTY_ID
     */
    public java.lang.Long partyId;

    /**
     * 记录经办人联系标识
     */
    public java.lang.Long contactId;

    /**
     * 记录二代身份证的扫描信息。修改为关联参与人证件标识，CERT_REC_ID--》PARTY_CERT_ID，然后关联出证件类型和证件号码
     */
    public java.lang.Long partyCertId;

    /**
     * 记录受理时间。
     */
    public java.util.Date acceptDate;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=RES-C-0008
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的系统岗位标识。
     */
    public java.lang.Long createPost;

    /**
     * 记录首次创建的组织机构标识。
     */
    public java.lang.Long createOrgId;

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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 设置 营销资源库存变动事件标识
     */
    public void setMktResEventId(java.lang.Long mktResEventId) {
        this.mktResEventId = mktResEventId;
    }

    /**
     * 获取 营销资源库存变动事件标识
     */
    public java.lang.Long getMktResEventId() {
        return this.mktResEventId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResEventId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResEventId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源库存事件名称名称。
     */
    public void setMktResEventName(java.lang.String mktResEventName) {
        this.mktResEventName = mktResEventName;
    }

    /**
     * 获取 记录营销资源库存事件名称名称。
     */
    public java.lang.String getMktResEventName() {
        return this.mktResEventName;
    }

    /**
     * 设置 营销资源库存变动事件编码
     */
    public void setMktResEventNbr(java.lang.String mktResEventNbr) {
        this.mktResEventNbr = mktResEventNbr;
    }

    /**
     * 获取 营销资源库存变动事件编码
     */
    public java.lang.String getMktResEventNbr() {
        return this.mktResEventNbr;
    }

    /**
     * 设置 营销资源仓库标识
     */
    public void setMktResStoreId(java.lang.Integer mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识
     */
    public java.lang.Integer getMktResStoreId() {
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
     * 设置 记录触发事件的资源申请单标识、订单项标识等20150325
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录触发事件的资源申请单标识、订单项标识等20150325
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 描述触发事件的对象类型：资源申请单,订单项等。LOVB=RES-C-0006
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 描述触发事件的对象类型：资源申请单,订单项等。LOVB=RES-C-0006
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录号码事件类型。LOVB=RES-C-0019
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }

    /**
     * 获取 记录号码事件类型。LOVB=RES-C-0019
     */
    public java.lang.String getEventType() {
        return this.eventType;
    }

    /**
     * 设置 记录事件描述信息
     */
    public void setEventDesc(java.lang.String eventDesc) {
        this.eventDesc = eventDesc;
    }

    /**
     * 获取 记录事件描述信息
     */
    public java.lang.String getEventDesc() {
        return this.eventDesc;
    }

    /**
     * 设置 记录预占一个号码时的号码实例标识，不用产生事件明细；在一批号码调拨时才使用事件明细。
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 记录预占一个号码时的号码实例标识，不用产生事件明细；在一批号码调拨时才使用事件明细。
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
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
     * 设置 记录二代身份证的扫描信息。修改为关联参与人证件标识，CERT_REC_ID--》PARTY_CERT_ID，然后关联出证件类型和证件号码
     */
    public void setPartyCertId(java.lang.Long partyCertId) {
        this.partyCertId = partyCertId;
    }

    /**
     * 获取 记录二代身份证的扫描信息。修改为关联参与人证件标识，CERT_REC_ID--》PARTY_CERT_ID，然后关联出证件类型和证件号码
     */
    public java.lang.Long getPartyCertId() {
        return this.partyCertId;
    }

    /**
     * 设置 记录受理时间。
     */
    public void setAcceptDate(java.util.Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * 获取 记录受理时间。
     */
    public java.util.Date getAcceptDate() {
        return this.acceptDate;
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
     * 设置 记录状态。LOVB=RES-C-0008
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=RES-C-0008
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录首次创建的系统岗位标识。
     */
    public void setCreatePost(java.lang.Long createPost) {
        this.createPost = createPost;
    }

    /**
     * 获取 记录首次创建的系统岗位标识。
     */
    public java.lang.Long getCreatePost() {
        return this.createPost;
    }

    /**
     * 设置 记录首次创建的组织机构标识。
     */
    public void setCreateOrgId(java.lang.Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    /**
     * 获取 记录首次创建的组织机构标识。
     */
    public java.lang.Long getCreateOrgId() {
        return this.createOrgId;
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

}
