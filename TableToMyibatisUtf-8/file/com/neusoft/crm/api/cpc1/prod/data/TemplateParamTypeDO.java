package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:模板参数类型
 * @实体表  :TEMPLATE_PARAM_TYPE
 */
public class TemplateParamTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_PARAM_TYPE_S";

    /**
     * 模板参数类型标识
     */
    public java.lang.Integer templateParamTypeId;

    /**
     * 参数类型名称
     */
    public java.lang.String typeName;

    /**
     * 
     */
    public java.lang.String typeDesc;

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
     * 设置 模板参数类型标识
     */
    public void setTemplateParamTypeId(java.lang.Integer templateParamTypeId) {
        this.templateParamTypeId = templateParamTypeId;
    }

    /**
     * 获取 模板参数类型标识
     */
    public java.lang.Integer getTemplateParamTypeId() {
        return this.templateParamTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.templateParamTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.templateParamTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 参数类型名称
     */
    public void setTypeName(java.lang.String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取 参数类型名称
     */
    public java.lang.String getTypeName() {
        return this.typeName;
    }

    /**
     * 设置 
     */
    public void setTypeDesc(java.lang.String typeDesc) {
        this.typeDesc = typeDesc;
    }

    /**
     * 获取 
     */
    public java.lang.String getTypeDesc() {
        return this.typeDesc;
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
