package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于定义因子分类的含义
 * @实体表  :SETT_ATTR_CLASS
 */
public class SettAttrClassDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_ATTR_CLASS_S";

    /**
     * 因子分类标识，主键标识
     */
    public java.lang.Integer attrClassId;

    /**
     * 因子分类名称
     */
    public java.lang.String attrClassName;

    /**
     * 因子分类描述
     */
    public java.lang.String attrClassDesc;

    /**
     * 上级因子分类标识
     */
    public java.lang.Integer parentAttrClassId;

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
     * 设置 因子分类标识，主键标识
     */
    public void setAttrClassId(java.lang.Integer attrClassId) {
        this.attrClassId = attrClassId;
    }

    /**
     * 获取 因子分类标识，主键标识
     */
    public java.lang.Integer getAttrClassId() {
        return this.attrClassId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.attrClassId = SeqUtils.createIntegerId(ID_SEQ);
         return this.attrClassId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 因子分类名称
     */
    public void setAttrClassName(java.lang.String attrClassName) {
        this.attrClassName = attrClassName;
    }

    /**
     * 获取 因子分类名称
     */
    public java.lang.String getAttrClassName() {
        return this.attrClassName;
    }

    /**
     * 设置 因子分类描述
     */
    public void setAttrClassDesc(java.lang.String attrClassDesc) {
        this.attrClassDesc = attrClassDesc;
    }

    /**
     * 获取 因子分类描述
     */
    public java.lang.String getAttrClassDesc() {
        return this.attrClassDesc;
    }

    /**
     * 设置 上级因子分类标识
     */
    public void setParentAttrClassId(java.lang.Integer parentAttrClassId) {
        this.parentAttrClassId = parentAttrClassId;
    }

    /**
     * 获取 上级因子分类标识
     */
    public java.lang.Integer getParentAttrClassId() {
        return this.parentAttrClassId;
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
