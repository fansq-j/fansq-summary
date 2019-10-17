package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:维护PLCA段落下条件满足时需要执行哪些动作。
如果PLCA段落下不需要执行动作，则不配置。
如
 * @实体表  :PLCA_SECTION_ACTION_REL
 */
public class PlcaSectionActionRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_SECTION_ACTION_REL_S";

    /**
     * 段落动作标识
     */
    public java.lang.Integer sectionActionId;

    /**
     * 段落的唯一标识
     */
    public java.lang.Integer sectionId;

    /**
     * 动作的唯一标识
     */
    public java.lang.Integer actionId;

    /**
     * 默认优先级
     */
    public java.lang.Integer priority;

    /**
     * LOVB=PLC-C-0026
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
     * 设置 段落动作标识
     */
    public void setSectionActionId(java.lang.Integer sectionActionId) {
        this.sectionActionId = sectionActionId;
    }

    /**
     * 获取 段落动作标识
     */
    public java.lang.Integer getSectionActionId() {
        return this.sectionActionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.sectionActionId = SeqUtils.createIntegerId(ID_SEQ);
         return this.sectionActionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 段落的唯一标识
     */
    public void setSectionId(java.lang.Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 获取 段落的唯一标识
     */
    public java.lang.Integer getSectionId() {
        return this.sectionId;
    }

    /**
     * 设置 动作的唯一标识
     */
    public void setActionId(java.lang.Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取 动作的唯一标识
     */
    public java.lang.Integer getActionId() {
        return this.actionId;
    }

    /**
     * 设置 默认优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 默认优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
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
