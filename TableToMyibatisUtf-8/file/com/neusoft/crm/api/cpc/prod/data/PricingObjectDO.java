package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义定价计划中所引用的各种数据对象，可用是产品、产品包、商品、客户、帐户等。
 * @实体表  :PRICING_OBJECT
 */
public class PricingObjectDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_OBJECT_S";

    /**
     * 包含对象的标识
     */
    public java.lang.Integer pricingObjectId;

    /**
     * 包含对象描述
     */
    public java.lang.String pricingObjectDesc;

    /**
     * 包含对象名称
     */
    public java.lang.String pricingObjectName;

    /**
     * 定价计划的标识
     */
    public java.lang.Integer pricingPlanId;

    /**
     * LOVB=PRC-C-0004
     */
    public java.lang.String objType;

    /**
     * 当对象类型为本产品实例时，该字段为产品规格标识. 
     */
    public java.lang.Integer objId;

    /**
     * 对象角色类型. 与CRM保持一致. 如主副卡,取副卡角色.
     */
    public java.lang.Integer objectRoleId;

    /**
     * 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String statusCd;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 包含对象的标识
     */
    public void setPricingObjectId(java.lang.Integer pricingObjectId) {
        this.pricingObjectId = pricingObjectId;
    }

    /**
     * 获取 包含对象的标识
     */
    public java.lang.Integer getPricingObjectId() {
        return this.pricingObjectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingObjectId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingObjectId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 包含对象描述
     */
    public void setPricingObjectDesc(java.lang.String pricingObjectDesc) {
        this.pricingObjectDesc = pricingObjectDesc;
    }

    /**
     * 获取 包含对象描述
     */
    public java.lang.String getPricingObjectDesc() {
        return this.pricingObjectDesc;
    }

    /**
     * 设置 包含对象名称
     */
    public void setPricingObjectName(java.lang.String pricingObjectName) {
        this.pricingObjectName = pricingObjectName;
    }

    /**
     * 获取 包含对象名称
     */
    public java.lang.String getPricingObjectName() {
        return this.pricingObjectName;
    }

    /**
     * 设置 定价计划的标识
     */
    public void setPricingPlanId(java.lang.Integer pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    /**
     * 获取 定价计划的标识
     */
    public java.lang.Integer getPricingPlanId() {
        return this.pricingPlanId;
    }

    /**
     * 设置 LOVB=PRC-C-0004
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 LOVB=PRC-C-0004
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 当对象类型为本产品实例时，该字段为产品规格标识. 
     */
    public void setObjId(java.lang.Integer objId) {
        this.objId = objId;
    }

    /**
     * 获取 当对象类型为本产品实例时，该字段为产品规格标识. 
     */
    public java.lang.Integer getObjId() {
        return this.objId;
    }

    /**
     * 设置 对象角色类型. 与CRM保持一致. 如主副卡,取副卡角色.
     */
    public void setObjectRoleId(java.lang.Integer objectRoleId) {
        this.objectRoleId = objectRoleId;
    }

    /**
     * 获取 对象角色类型. 与CRM保持一致. 如主副卡,取副卡角色.
     */
    public java.lang.Integer getObjectRoleId() {
        return this.objectRoleId;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
