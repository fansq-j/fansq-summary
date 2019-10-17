package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品、礼包、终端等推荐条目注智标签的实例化信息
 * @实体表  :CAM_ITEM_INJECTION_LABEL
 */
public class CamItemInjectionLabelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CAM_ITEM_INJECTION_LABEL_S";

    /**
     * 条目注智标签标识
     */
    public java.lang.Long itemLabelId;

    /**
     * 条目类型，LOVB=CAM-C-0012
     */
    public java.lang.String itemType;

    /**
     * 条目标识
     */
    public java.lang.Long itemId;

    /**
     * 注智标签标识，主键
     */
    public java.lang.Long injectionLabelId;

    /**
     * 注智标签值的主键
     */
    public java.lang.Long labelValueId;

    /**
     * 注智标签值
     */
    public java.lang.String labelValue;

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
     * 设置 条目注智标签标识
     */
    public void setItemLabelId(java.lang.Long itemLabelId) {
        this.itemLabelId = itemLabelId;
    }

    /**
     * 获取 条目注智标签标识
     */
    public java.lang.Long getItemLabelId() {
        return this.itemLabelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.itemLabelId = SeqUtils.createLongId(ID_SEQ);
         return this.itemLabelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 条目类型，LOVB=CAM-C-0012
     */
    public void setItemType(java.lang.String itemType) {
        this.itemType = itemType;
    }

    /**
     * 获取 条目类型，LOVB=CAM-C-0012
     */
    public java.lang.String getItemType() {
        return this.itemType;
    }

    /**
     * 设置 条目标识
     */
    public void setItemId(java.lang.Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取 条目标识
     */
    public java.lang.Long getItemId() {
        return this.itemId;
    }

    /**
     * 设置 注智标签标识，主键
     */
    public void setInjectionLabelId(java.lang.Long injectionLabelId) {
        this.injectionLabelId = injectionLabelId;
    }

    /**
     * 获取 注智标签标识，主键
     */
    public java.lang.Long getInjectionLabelId() {
        return this.injectionLabelId;
    }

    /**
     * 设置 注智标签值的主键
     */
    public void setLabelValueId(java.lang.Long labelValueId) {
        this.labelValueId = labelValueId;
    }

    /**
     * 获取 注智标签值的主键
     */
    public java.lang.Long getLabelValueId() {
        return this.labelValueId;
    }

    /**
     * 设置 注智标签值
     */
    public void setLabelValue(java.lang.String labelValue) {
        this.labelValue = labelValue;
    }

    /**
     * 获取 注智标签值
     */
    public java.lang.String getLabelValue() {
        return this.labelValue;
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
