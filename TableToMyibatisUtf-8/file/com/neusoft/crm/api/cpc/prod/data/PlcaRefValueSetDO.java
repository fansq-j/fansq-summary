package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:如果参考值定义的是整型数组/字符串数组这种数组类型的参考值，需要在这张表定义该数组集合的元素。
 * @实体表  :PLCA_REF_VALUE_SET
 */
public class PlcaRefValueSetDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_REF_VALUE_SET_S";

    /**
     * 集合参考值元素的唯一标识
     */
    public java.lang.Integer refValueSetId;

    /**
     * 参考值的唯一标识
     */
    public java.lang.Integer refValueId;

    /**
     * 元素的值
     */
    public java.lang.String valueString;

    /**
     * 元素值的解释，如果元素是产品标识，这个字段填产品名称，方便配置。
     */
    public java.lang.String valueName;

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
     * 设置 集合参考值元素的唯一标识
     */
    public void setRefValueSetId(java.lang.Integer refValueSetId) {
        this.refValueSetId = refValueSetId;
    }

    /**
     * 获取 集合参考值元素的唯一标识
     */
    public java.lang.Integer getRefValueSetId() {
        return this.refValueSetId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.refValueSetId = SeqUtils.createIntegerId(ID_SEQ);
         return this.refValueSetId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 参考值的唯一标识
     */
    public void setRefValueId(java.lang.Integer refValueId) {
        this.refValueId = refValueId;
    }

    /**
     * 获取 参考值的唯一标识
     */
    public java.lang.Integer getRefValueId() {
        return this.refValueId;
    }

    /**
     * 设置 元素的值
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }

    /**
     * 获取 元素的值
     */
    public java.lang.String getValueString() {
        return this.valueString;
    }

    /**
     * 设置 元素值的解释，如果元素是产品标识，这个字段填产品名称，方便配置。
     */
    public void setValueName(java.lang.String valueName) {
        this.valueName = valueName;
    }

    /**
     * 获取 元素值的解释，如果元素是产品标识，这个字段填产品名称，方便配置。
     */
    public java.lang.String getValueName() {
        return this.valueName;
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
