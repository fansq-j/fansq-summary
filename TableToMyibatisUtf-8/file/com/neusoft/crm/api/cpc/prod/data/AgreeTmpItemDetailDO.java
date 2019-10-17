package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:协议模板关联条款属性要求
 * @实体表  :AGREE_TMP_ITEM_DETAIL
 */
public class AgreeTmpItemDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_TMP_ITEM_DETAIL_S";

    /**
     * 协议模板关联条款属性要求标识
     */
    public java.lang.Long agreeTmpItemDetailId;

    /**
     * 协议条款关联标识
     */
    public java.lang.Long agreeTmpItemRelId;

    /**
     * 条款属性标识
     */
    public java.lang.Integer itemAttrId;

    /**
     * 默认值
     */
    public java.lang.String defaultValue;

    /**
     * 用证则表达式的形式描述属性的取值范围
     */
    public java.lang.String valueRange;

    /**
     * 最小值
     */
    public java.lang.String minValue;

    /**
     * 最大值
     */
    public java.lang.String maxValue;

    /**
     * 可以选择的值用，逗号分割，请特别注意不要  中文逗号
     */
    public java.lang.String optionValue;

    /**
     * 是否可选，LOVB=PUB-C-0006
     */
    public java.lang.String ifOption;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 协议模板关联条款属性要求标识
     */
    public void setAgreeTmpItemDetailId(java.lang.Long agreeTmpItemDetailId) {
        this.agreeTmpItemDetailId = agreeTmpItemDetailId;
    }

    /**
     * 获取 协议模板关联条款属性要求标识
     */
    public java.lang.Long getAgreeTmpItemDetailId() {
        return this.agreeTmpItemDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeTmpItemDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeTmpItemDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议条款关联标识
     */
    public void setAgreeTmpItemRelId(java.lang.Long agreeTmpItemRelId) {
        this.agreeTmpItemRelId = agreeTmpItemRelId;
    }

    /**
     * 获取 协议条款关联标识
     */
    public java.lang.Long getAgreeTmpItemRelId() {
        return this.agreeTmpItemRelId;
    }

    /**
     * 设置 条款属性标识
     */
    public void setItemAttrId(java.lang.Integer itemAttrId) {
        this.itemAttrId = itemAttrId;
    }

    /**
     * 获取 条款属性标识
     */
    public java.lang.Integer getItemAttrId() {
        return this.itemAttrId;
    }

    /**
     * 设置 默认值
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 默认值
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 用证则表达式的形式描述属性的取值范围
     */
    public void setValueRange(java.lang.String valueRange) {
        this.valueRange = valueRange;
    }

    /**
     * 获取 用证则表达式的形式描述属性的取值范围
     */
    public java.lang.String getValueRange() {
        return this.valueRange;
    }

    /**
     * 设置 最小值
     */
    public void setMinValue(java.lang.String minValue) {
        this.minValue = minValue;
    }

    /**
     * 获取 最小值
     */
    public java.lang.String getMinValue() {
        return this.minValue;
    }

    /**
     * 设置 最大值
     */
    public void setMaxValue(java.lang.String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取 最大值
     */
    public java.lang.String getMaxValue() {
        return this.maxValue;
    }

    /**
     * 设置 可以选择的值用，逗号分割，请特别注意不要  中文逗号
     */
    public void setOptionValue(java.lang.String optionValue) {
        this.optionValue = optionValue;
    }

    /**
     * 获取 可以选择的值用，逗号分割，请特别注意不要  中文逗号
     */
    public java.lang.String getOptionValue() {
        return this.optionValue;
    }

    /**
     * 设置 是否可选，LOVB=PUB-C-0006
     */
    public void setIfOption(java.lang.String ifOption) {
        this.ifOption = ifOption;
    }

    /**
     * 获取 是否可选，LOVB=PUB-C-0006
     */
    public java.lang.String getIfOption() {
        return this.ifOption;
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
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
