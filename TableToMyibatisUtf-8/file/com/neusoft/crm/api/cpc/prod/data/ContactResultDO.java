package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对客户接收消息后的反馈行为进行记录，包括是否营销成功记录以及在触点渠道的点击、办理等环节的记录。这些信息可作为后续频次控
 * @实体表  :CONTACT_RESULT
 */
public class ContactResultDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_RESULT_S";

    /**
     * 接触反馈结果标识
     */
    public java.lang.Long contactResultId;

    /**
     * 接触调度单标识
     */
    public java.lang.Long contactOrderId;

    /**
     * 触点渠道ID
     */
    public java.lang.Long contactChlId;

    /**
     * 接触人
     */
    public java.lang.Long contactStaff;

    /**
     * 接触时间
     */
    public java.util.Date contactDate;

    /**
     * 推送方式,LOVB=CAM-C-0007
     */
    public java.lang.String pushType;

    /**
     * 目标对象类型,LOVB=CAM-C-0005
     */
    public java.lang.String targetObjType;

    /**
     * 目标对象标识
     */
    public java.lang.String targetObjNbr;

    /**
     * 接触反馈结果，LOVB=CAM-C-0011
     */
    public java.lang.Integer resultNbr;

    /**
     * 反馈结果描述
     */
    public java.lang.String resultDes;

    /**
     * 是否记录为接触，LOVB=PUB-C-0006
     */
    public java.lang.Integer isContact;

    /**
     * 记录营销结果,LOVB=CAM-C-0006
     */
    public java.lang.Integer mktResult;

    /**
     * 状态,LOVB=PUB-C-0001
            
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 接触反馈结果标识
     */
    public void setContactResultId(java.lang.Long contactResultId) {
        this.contactResultId = contactResultId;
    }

    /**
     * 获取 接触反馈结果标识
     */
    public java.lang.Long getContactResultId() {
        return this.contactResultId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contactResultId = SeqUtils.createLongId(ID_SEQ);
         return this.contactResultId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 接触调度单标识
     */
    public void setContactOrderId(java.lang.Long contactOrderId) {
        this.contactOrderId = contactOrderId;
    }

    /**
     * 获取 接触调度单标识
     */
    public java.lang.Long getContactOrderId() {
        return this.contactOrderId;
    }

    /**
     * 设置 触点渠道ID
     */
    public void setContactChlId(java.lang.Long contactChlId) {
        this.contactChlId = contactChlId;
    }

    /**
     * 获取 触点渠道ID
     */
    public java.lang.Long getContactChlId() {
        return this.contactChlId;
    }

    /**
     * 设置 接触人
     */
    public void setContactStaff(java.lang.Long contactStaff) {
        this.contactStaff = contactStaff;
    }

    /**
     * 获取 接触人
     */
    public java.lang.Long getContactStaff() {
        return this.contactStaff;
    }

    /**
     * 设置 接触时间
     */
    public void setContactDate(java.util.Date contactDate) {
        this.contactDate = contactDate;
    }

    /**
     * 获取 接触时间
     */
    public java.util.Date getContactDate() {
        return this.contactDate;
    }

    /**
     * 设置 推送方式,LOVB=CAM-C-0007
     */
    public void setPushType(java.lang.String pushType) {
        this.pushType = pushType;
    }

    /**
     * 获取 推送方式,LOVB=CAM-C-0007
     */
    public java.lang.String getPushType() {
        return this.pushType;
    }

    /**
     * 设置 目标对象类型,LOVB=CAM-C-0005
     */
    public void setTargetObjType(java.lang.String targetObjType) {
        this.targetObjType = targetObjType;
    }

    /**
     * 获取 目标对象类型,LOVB=CAM-C-0005
     */
    public java.lang.String getTargetObjType() {
        return this.targetObjType;
    }

    /**
     * 设置 目标对象标识
     */
    public void setTargetObjNbr(java.lang.String targetObjNbr) {
        this.targetObjNbr = targetObjNbr;
    }

    /**
     * 获取 目标对象标识
     */
    public java.lang.String getTargetObjNbr() {
        return this.targetObjNbr;
    }

    /**
     * 设置 接触反馈结果，LOVB=CAM-C-0011
     */
    public void setResultNbr(java.lang.Integer resultNbr) {
        this.resultNbr = resultNbr;
    }

    /**
     * 获取 接触反馈结果，LOVB=CAM-C-0011
     */
    public java.lang.Integer getResultNbr() {
        return this.resultNbr;
    }

    /**
     * 设置 反馈结果描述
     */
    public void setResultDes(java.lang.String resultDes) {
        this.resultDes = resultDes;
    }

    /**
     * 获取 反馈结果描述
     */
    public java.lang.String getResultDes() {
        return this.resultDes;
    }

    /**
     * 设置 是否记录为接触，LOVB=PUB-C-0006
     */
    public void setIsContact(java.lang.Integer isContact) {
        this.isContact = isContact;
    }

    /**
     * 获取 是否记录为接触，LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsContact() {
        return this.isContact;
    }

    /**
     * 设置 记录营销结果,LOVB=CAM-C-0006
     */
    public void setMktResult(java.lang.Integer mktResult) {
        this.mktResult = mktResult;
    }

    /**
     * 获取 记录营销结果,LOVB=CAM-C-0006
     */
    public java.lang.Integer getMktResult() {
        return this.mktResult;
    }

    /**
     * 设置 状态,LOVB=PUB-C-0001
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态,LOVB=PUB-C-0001
            
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
