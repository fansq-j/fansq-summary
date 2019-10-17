package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义标签类型
 * @实体表  :LABEL_TYPE
 */
public class LabelTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LABEL_TYPE_S";

    /**
     * 标签类别标识
     */
    public java.lang.Integer labelTypeId;

    /**
     * 类别名称
     */
    public java.lang.String labelTypeName;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date stateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 标签类别标识
     */
    public void setLabelTypeId(java.lang.Integer labelTypeId) {
        this.labelTypeId = labelTypeId;
    }

    /**
     * 获取 标签类别标识
     */
    public java.lang.Integer getLabelTypeId() {
        return this.labelTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.labelTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.labelTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 类别名称
     */
    public void setLabelTypeName(java.lang.String labelTypeName) {
        this.labelTypeName = labelTypeName;
    }

    /**
     * 获取 类别名称
     */
    public java.lang.String getLabelTypeName() {
        return this.labelTypeName;
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
     * 设置 修改时间
     */
    public void setStateDate(java.util.Date stateDate) {
        this.stateDate = stateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getStateDate() {
        return this.stateDate;
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
