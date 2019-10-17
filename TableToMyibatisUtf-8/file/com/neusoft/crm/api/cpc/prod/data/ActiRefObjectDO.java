package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于定义执行一个优惠计算所需要参考的定价参考对象，这些对象的使用方式由优惠计算方法来决定。
 * @实体表  :ACTI_REF_OBJECT
 */
public class ActiRefObjectDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACTI_REF_OBJECT_S";

    /**
     * 活动参考对象标识
     */
    public java.lang.Integer actiRefObjectId;

    /**
     * 参考对象名称
     */
    public java.lang.String refObjectName;

    /**
     * 参考对象类型，参考对象类型有很多，需要应用上的支持。PRC-C-0051
     */
    public java.lang.String refObjectType;

    /**
     * 参考对象的标识
     */
    public java.lang.Long objId;

    /**
     * 引用程序固化的函数
     */
    public java.lang.Integer ruleId;

    /**
     * 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 活动参考对象标识
     */
    public void setActiRefObjectId(java.lang.Integer actiRefObjectId) {
        this.actiRefObjectId = actiRefObjectId;
    }

    /**
     * 获取 活动参考对象标识
     */
    public java.lang.Integer getActiRefObjectId() {
        return this.actiRefObjectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.actiRefObjectId = SeqUtils.createIntegerId(ID_SEQ);
         return this.actiRefObjectId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 参考对象名称
     */
    public void setRefObjectName(java.lang.String refObjectName) {
        this.refObjectName = refObjectName;
    }

    /**
     * 获取 参考对象名称
     */
    public java.lang.String getRefObjectName() {
        return this.refObjectName;
    }

    /**
     * 设置 参考对象类型，参考对象类型有很多，需要应用上的支持。PRC-C-0051
     */
    public void setRefObjectType(java.lang.String refObjectType) {
        this.refObjectType = refObjectType;
    }

    /**
     * 获取 参考对象类型，参考对象类型有很多，需要应用上的支持。PRC-C-0051
     */
    public java.lang.String getRefObjectType() {
        return this.refObjectType;
    }

    /**
     * 设置 参考对象的标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 参考对象的标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 引用程序固化的函数
     */
    public void setRuleId(java.lang.Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取 引用程序固化的函数
     */
    public java.lang.Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * 设置 普通记录状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
