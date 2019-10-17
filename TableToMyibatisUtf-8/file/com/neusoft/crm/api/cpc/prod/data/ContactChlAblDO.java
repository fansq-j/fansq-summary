package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录触点渠道具有哪些接触方式向客户发送推荐信息。
一个触点渠道具备一种或者多种触点渠道能力。一个触点渠道通过
 * @实体表  :CONTACT_CHL_ABL
 */
public class ContactChlAblDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_CHL_ABL_S";

    /**
     * 触点渠道能力标识
     */
    public java.lang.Long contacChlAblId;

    /**
     * 协议适配转换配置标识
     */
    public java.lang.Long contactChlConvertCfgId;

    /**
     * 触点渠道标识
     */
    public java.lang.Long contactChlId;

    /**
     * 推送方式,LOVB=CAM-C-0007
     */
    public java.lang.String pushType;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 触点渠道能力标识
     */
    public void setContacChlAblId(java.lang.Long contacChlAblId) {
        this.contacChlAblId = contacChlAblId;
    }

    /**
     * 获取 触点渠道能力标识
     */
    public java.lang.Long getContacChlAblId() {
        return this.contacChlAblId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contacChlAblId = SeqUtils.createLongId(ID_SEQ);
         return this.contacChlAblId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议适配转换配置标识
     */
    public void setContactChlConvertCfgId(java.lang.Long contactChlConvertCfgId) {
        this.contactChlConvertCfgId = contactChlConvertCfgId;
    }

    /**
     * 获取 协议适配转换配置标识
     */
    public java.lang.Long getContactChlConvertCfgId() {
        return this.contactChlConvertCfgId;
    }

    /**
     * 设置 触点渠道标识
     */
    public void setContactChlId(java.lang.Long contactChlId) {
        this.contactChlId = contactChlId;
    }

    /**
     * 获取 触点渠道标识
     */
    public java.lang.Long getContactChlId() {
        return this.contactChlId;
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
