package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于定义目标事件类型与因子和属主的关系信息
 * @实体表  :EVENT_TYPE_ATTR_RELA
 */
public class EventTypeAttrRelaDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_TYPE_ATTR_RELA_S";

    /**
     * 事件类型因子关系标识
     */
    public java.lang.Long eventAttrRelaId;

    /**
     * 佣金属主标识
     */
    public java.lang.Integer settOwnerId;

    /**
     * 引用属主属性标识
     */
    public java.lang.Integer settOwnerAttrId;

    /**
     * 目的事件类型标识
     */
    public java.lang.Integer eventTypeId;

    /**
     * LOVB=PRC-C-0057
            0 默认，非必选
            1 必选
     */
    public java.lang.Integer requiredFlag;

    /**
     * LOVB=PRC-C-0026
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
     * 设置 事件类型因子关系标识
     */
    public void setEventAttrRelaId(java.lang.Long eventAttrRelaId) {
        this.eventAttrRelaId = eventAttrRelaId;
    }

    /**
     * 获取 事件类型因子关系标识
     */
    public java.lang.Long getEventAttrRelaId() {
        return this.eventAttrRelaId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.eventAttrRelaId = SeqUtils.createLongId(ID_SEQ);
         return this.eventAttrRelaId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 佣金属主标识
     */
    public void setSettOwnerId(java.lang.Integer settOwnerId) {
        this.settOwnerId = settOwnerId;
    }

    /**
     * 获取 佣金属主标识
     */
    public java.lang.Integer getSettOwnerId() {
        return this.settOwnerId;
    }

    /**
     * 设置 引用属主属性标识
     */
    public void setSettOwnerAttrId(java.lang.Integer settOwnerAttrId) {
        this.settOwnerAttrId = settOwnerAttrId;
    }

    /**
     * 获取 引用属主属性标识
     */
    public java.lang.Integer getSettOwnerAttrId() {
        return this.settOwnerAttrId;
    }

    /**
     * 设置 目的事件类型标识
     */
    public void setEventTypeId(java.lang.Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * 获取 目的事件类型标识
     */
    public java.lang.Integer getEventTypeId() {
        return this.eventTypeId;
    }

    /**
     * 设置 LOVB=PRC-C-0057
            0 默认，非必选
            1 必选
     */
    public void setRequiredFlag(java.lang.Integer requiredFlag) {
        this.requiredFlag = requiredFlag;
    }

    /**
     * 获取 LOVB=PRC-C-0057
            0 默认，非必选
            1 必选
     */
    public java.lang.Integer getRequiredFlag() {
        return this.requiredFlag;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
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

}
