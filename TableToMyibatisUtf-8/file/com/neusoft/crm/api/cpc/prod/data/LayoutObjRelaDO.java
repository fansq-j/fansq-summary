package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:布局适用对象
 * @实体表  :LAYOUT_OBJ_RELA
 */
public class LayoutObjRelaDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LAYOUT_OBJ_RELA_S";

    /**
     * 模板布局标识
     */
    public java.lang.Long templateLayoutId;

    /**
     * 布局适用对象标识
     */
    public java.lang.Long layoutObjRelaId;

    /**
     * 适用对象类型
     */
    public java.lang.String objType;

    /**
     * 适用对象标识
     */
    public java.lang.Long objId;

    /**
     * 状态，LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 模板布局标识
     */
    public void setTemplateLayoutId(java.lang.Long templateLayoutId) {
        this.templateLayoutId = templateLayoutId;
    }

    /**
     * 获取 模板布局标识
     */
    public java.lang.Long getTemplateLayoutId() {
        return this.templateLayoutId;
    }

    /**
     * 设置 布局适用对象标识
     */
    public void setLayoutObjRelaId(java.lang.Long layoutObjRelaId) {
        this.layoutObjRelaId = layoutObjRelaId;
    }

    /**
     * 获取 布局适用对象标识
     */
    public java.lang.Long getLayoutObjRelaId() {
        return this.layoutObjRelaId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.layoutObjRelaId = SeqUtils.createLongId(ID_SEQ);
         return this.layoutObjRelaId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 适用对象类型
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 适用对象类型
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 适用对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 适用对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
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
