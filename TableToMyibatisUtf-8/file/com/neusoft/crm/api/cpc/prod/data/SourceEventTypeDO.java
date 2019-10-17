package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述了源事件的分类信息。源事件从总体上划分为客户交互事件、使用事件、内部业务事件三个大类。对使用事件，按照产生事件的设备
 * @实体表  :SOURCE_EVENT_TYPE
 */
public class SourceEventTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SOURCE_EVENT_TYPE_S";

    /**
     * 唯一标识一种源事件类型，如语音市话跳表事件、语音计时事件、互联网使用事件、互联星空使用事件等。
     */
    public java.lang.Integer sourceEventType;

    /**
     * 标识源事件类型的归类信息。EVT-C-3019
     */
    public java.lang.Integer sourceEventTypeSum;

    /**
     * 源事件类型的名称
     */
    public java.lang.String name;

    /**
     * 源事件类型的生效时间
     */
    public java.util.Date effDate;

    /**
     * 源事件类型的失效时间
     */
    public java.util.Date expDate;

    /**
     * LOVB=EVT-C-3001
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
     * 设置 唯一标识一种源事件类型，如语音市话跳表事件、语音计时事件、互联网使用事件、互联星空使用事件等。
     */
    public void setSourceEventType(java.lang.Integer sourceEventType) {
        this.sourceEventType = sourceEventType;
    }

    /**
     * 获取 唯一标识一种源事件类型，如语音市话跳表事件、语音计时事件、互联网使用事件、互联星空使用事件等。
     */
    public java.lang.Integer getSourceEventType() {
        return this.sourceEventType;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.sourceEventType = SeqUtils.createIntegerId(ID_SEQ);
         return this.sourceEventType;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 标识源事件类型的归类信息。EVT-C-3019
     */
    public void setSourceEventTypeSum(java.lang.Integer sourceEventTypeSum) {
        this.sourceEventTypeSum = sourceEventTypeSum;
    }

    /**
     * 获取 标识源事件类型的归类信息。EVT-C-3019
     */
    public java.lang.Integer getSourceEventTypeSum() {
        return this.sourceEventTypeSum;
    }

    /**
     * 设置 源事件类型的名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 源事件类型的名称
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * 设置 源事件类型的生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 源事件类型的生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 源事件类型的失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 源事件类型的失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 LOVB=EVT-C-3001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=EVT-C-3001
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
