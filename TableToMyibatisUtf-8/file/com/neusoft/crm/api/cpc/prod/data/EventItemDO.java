package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录事件、事件类型的需要采集的信息项
事件预处理时可根据配置的事件采集项进行事件报文的标准化；事件匹配时可根
 * @实体表  :EVENT_ITEM
 */
public class EventItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVENT_ITEM_S";

    /**
     * 事件采集项主键
     */
    public java.lang.Long evtItemId;

    /**
     * 事件标识
     */
    public java.lang.Long eventId;

    /**
     * 事件类型标识
     */
    public java.lang.Long evtTypeId;

    /**
     * 记录事件采集项的名称
     */
    public java.lang.String evtItemName;

    /**
     * 记录事件采集项的编码，主要用于格式化
     */
    public java.lang.String evtItemCode;

    /**
     * 记录事件采集项值数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String valueDataType;

    /**
     * 记录事件采集项格式(正则表达式),用于事件采集项的合法性效验
     */
    public java.lang.String evtItemFormat;

    /**
     * 记录事件采集项的内容是否可空。LOVB=PUB-C-0006
     */
    public java.lang.Integer isNullable;

    /**
     * 记录事件采集项值的长度
     */
    public java.lang.Integer evtItemLength;

    /**
     * 记录事件采集项的标准化的顺序
     */
    public java.lang.Integer standardSort;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 事件采集项主键
     */
    public void setEvtItemId(java.lang.Long evtItemId) {
        this.evtItemId = evtItemId;
    }

    /**
     * 获取 事件采集项主键
     */
    public java.lang.Long getEvtItemId() {
        return this.evtItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evtItemId = SeqUtils.createLongId(ID_SEQ);
         return this.evtItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 事件标识
     */
    public void setEventId(java.lang.Long eventId) {
        this.eventId = eventId;
    }

    /**
     * 获取 事件标识
     */
    public java.lang.Long getEventId() {
        return this.eventId;
    }

    /**
     * 设置 事件类型标识
     */
    public void setEvtTypeId(java.lang.Long evtTypeId) {
        this.evtTypeId = evtTypeId;
    }

    /**
     * 获取 事件类型标识
     */
    public java.lang.Long getEvtTypeId() {
        return this.evtTypeId;
    }

    /**
     * 设置 记录事件采集项的名称
     */
    public void setEvtItemName(java.lang.String evtItemName) {
        this.evtItemName = evtItemName;
    }

    /**
     * 获取 记录事件采集项的名称
     */
    public java.lang.String getEvtItemName() {
        return this.evtItemName;
    }

    /**
     * 设置 记录事件采集项的编码，主要用于格式化
     */
    public void setEvtItemCode(java.lang.String evtItemCode) {
        this.evtItemCode = evtItemCode;
    }

    /**
     * 获取 记录事件采集项的编码，主要用于格式化
     */
    public java.lang.String getEvtItemCode() {
        return this.evtItemCode;
    }

    /**
     * 设置 记录事件采集项值数据类型，LOVB=PUB-C-0014
     */
    public void setValueDataType(java.lang.String valueDataType) {
        this.valueDataType = valueDataType;
    }

    /**
     * 获取 记录事件采集项值数据类型，LOVB=PUB-C-0014
     */
    public java.lang.String getValueDataType() {
        return this.valueDataType;
    }

    /**
     * 设置 记录事件采集项格式(正则表达式),用于事件采集项的合法性效验
     */
    public void setEvtItemFormat(java.lang.String evtItemFormat) {
        this.evtItemFormat = evtItemFormat;
    }

    /**
     * 获取 记录事件采集项格式(正则表达式),用于事件采集项的合法性效验
     */
    public java.lang.String getEvtItemFormat() {
        return this.evtItemFormat;
    }

    /**
     * 设置 记录事件采集项的内容是否可空。LOVB=PUB-C-0006
     */
    public void setIsNullable(java.lang.Integer isNullable) {
        this.isNullable = isNullable;
    }

    /**
     * 获取 记录事件采集项的内容是否可空。LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsNullable() {
        return this.isNullable;
    }

    /**
     * 设置 记录事件采集项值的长度
     */
    public void setEvtItemLength(java.lang.Integer evtItemLength) {
        this.evtItemLength = evtItemLength;
    }

    /**
     * 获取 记录事件采集项值的长度
     */
    public java.lang.Integer getEvtItemLength() {
        return this.evtItemLength;
    }

    /**
     * 设置 记录事件采集项的标准化的顺序
     */
    public void setStandardSort(java.lang.Integer standardSort) {
        this.standardSort = standardSort;
    }

    /**
     * 获取 记录事件采集项的标准化的顺序
     */
    public java.lang.Integer getStandardSort() {
        return this.standardSort;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
