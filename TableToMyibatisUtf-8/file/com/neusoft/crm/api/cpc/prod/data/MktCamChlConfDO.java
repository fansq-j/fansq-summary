package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销执行渠道推送规则,定义营销活动的执行渠道推送
 * @实体表  :MKT_CAM_CHL_CONF
 */
public class MktCamChlConfDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_CAM_CHL_CONF_S";

    /**
     * 事件推送策略标识
     */
    public java.lang.Long evtContactConfId;

    /**
     * 事件推送策略名称
     */
    public java.lang.String evtContactConfName;

    /**
     * 营销活动标识
     */
    public java.lang.Long mktCampaignId;

    /**
     * 推送渠道
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
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 事件推送策略标识
     */
    public void setEvtContactConfId(java.lang.Long evtContactConfId) {
        this.evtContactConfId = evtContactConfId;
    }

    /**
     * 获取 事件推送策略标识
     */
    public java.lang.Long getEvtContactConfId() {
        return this.evtContactConfId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evtContactConfId = SeqUtils.createLongId(ID_SEQ);
         return this.evtContactConfId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 事件推送策略名称
     */
    public void setEvtContactConfName(java.lang.String evtContactConfName) {
        this.evtContactConfName = evtContactConfName;
    }

    /**
     * 获取 事件推送策略名称
     */
    public java.lang.String getEvtContactConfName() {
        return this.evtContactConfName;
    }

    /**
     * 设置 营销活动标识
     */
    public void setMktCampaignId(java.lang.Long mktCampaignId) {
        this.mktCampaignId = mktCampaignId;
    }

    /**
     * 获取 营销活动标识
     */
    public java.lang.Long getMktCampaignId() {
        return this.mktCampaignId;
    }

    /**
     * 设置 推送渠道
     */
    public void setContactChlId(java.lang.Long contactChlId) {
        this.contactChlId = contactChlId;
    }

    /**
     * 获取 推送渠道
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
