package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:推送列表，即本次推荐任务包含的销售品、营销活动、营销资源、服务等内容列表。
 * @实体表  :CONTACT_ITEM
 */
public class ContactItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CONTACT_ITEM_S";

    /**
     * 推送列表标识
     */
    public java.lang.Long contactItemId;

    /**
     * 接触任务标识
     */
    public java.lang.Long contactTaskId;

    /**
     * 接触任务渠道关联标识
     */
    public java.lang.Long contactTaskChlId;

    /**
     * 推荐条目类型，主数据：销售品、营销资源、礼包。LOVB=CAM-C-0012
     */
    public java.lang.String itemType;

    /**
     * 推送对象ID
     */
    public java.lang.Long itemId;

    /**
     * 推送优先级
     */
    public java.lang.Integer priority;

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
     * 设置 推送列表标识
     */
    public void setContactItemId(java.lang.Long contactItemId) {
        this.contactItemId = contactItemId;
    }

    /**
     * 获取 推送列表标识
     */
    public java.lang.Long getContactItemId() {
        return this.contactItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.contactItemId = SeqUtils.createLongId(ID_SEQ);
         return this.contactItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 接触任务标识
     */
    public void setContactTaskId(java.lang.Long contactTaskId) {
        this.contactTaskId = contactTaskId;
    }

    /**
     * 获取 接触任务标识
     */
    public java.lang.Long getContactTaskId() {
        return this.contactTaskId;
    }

    /**
     * 设置 接触任务渠道关联标识
     */
    public void setContactTaskChlId(java.lang.Long contactTaskChlId) {
        this.contactTaskChlId = contactTaskChlId;
    }

    /**
     * 获取 接触任务渠道关联标识
     */
    public java.lang.Long getContactTaskChlId() {
        return this.contactTaskChlId;
    }

    /**
     * 设置 推荐条目类型，主数据：销售品、营销资源、礼包。LOVB=CAM-C-0012
     */
    public void setItemType(java.lang.String itemType) {
        this.itemType = itemType;
    }

    /**
     * 获取 推荐条目类型，主数据：销售品、营销资源、礼包。LOVB=CAM-C-0012
     */
    public java.lang.String getItemType() {
        return this.itemType;
    }

    /**
     * 设置 推送对象ID
     */
    public void setItemId(java.lang.Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取 推送对象ID
     */
    public java.lang.Long getItemId() {
        return this.itemId;
    }

    /**
     * 设置 推送优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 推送优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
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
