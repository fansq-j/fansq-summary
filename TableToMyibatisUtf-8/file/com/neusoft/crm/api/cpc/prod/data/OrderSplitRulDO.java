package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录操作业务对象及其属性应用的服务提供规则，例如更改了产品的速率属性，使用“改速率”。
 * @实体表  :ORDER_SPLIT_RUL
 */
public class OrderSplitRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORDER_SPLIT_RUL_S";

    /**
     * 记录订单分解规则标识，主键。
     */
    public java.lang.Long orderSplitRulId;

    /**
     * 记录业务对象类型，来源于元数据。LOVB=RUL-C-0005
     */
    public java.lang.String objType;

    /**
     * 记录业务对象操作方式，LOVB=RUL-C-0006。
     */
    public java.lang.String objOperType;

    /**
     * 记录业务对象类型为产品，则记录产品标识。
     */
    public java.lang.Long objSpecId;

    /**
     * 记录业务对象的属性标识。
     */
    public java.lang.Long attrId;

    /**
     * 记录业务对象属性操作方式。LOVB=RUL-C-0007
     */
    public java.lang.Long attrOperType;

    /**
     * 记录服务提供标识。
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 记录优先级，值越大优先级越高。
     */
    public java.lang.Integer priority;

    /**
     * 记录适用区域标识。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录订单分解规则标识，主键。
     */
    public void setOrderSplitRulId(java.lang.Long orderSplitRulId) {
        this.orderSplitRulId = orderSplitRulId;
    }

    /**
     * 获取 记录订单分解规则标识，主键。
     */
    public java.lang.Long getOrderSplitRulId() {
        return this.orderSplitRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orderSplitRulId = SeqUtils.createLongId(ID_SEQ);
         return this.orderSplitRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录业务对象类型，来源于元数据。LOVB=RUL-C-0005
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录业务对象类型，来源于元数据。LOVB=RUL-C-0005
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录业务对象操作方式，LOVB=RUL-C-0006。
     */
    public void setObjOperType(java.lang.String objOperType) {
        this.objOperType = objOperType;
    }

    /**
     * 获取 记录业务对象操作方式，LOVB=RUL-C-0006。
     */
    public java.lang.String getObjOperType() {
        return this.objOperType;
    }

    /**
     * 设置 记录业务对象类型为产品，则记录产品标识。
     */
    public void setObjSpecId(java.lang.Long objSpecId) {
        this.objSpecId = objSpecId;
    }

    /**
     * 获取 记录业务对象类型为产品，则记录产品标识。
     */
    public java.lang.Long getObjSpecId() {
        return this.objSpecId;
    }

    /**
     * 设置 记录业务对象的属性标识。
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录业务对象的属性标识。
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 记录业务对象属性操作方式。LOVB=RUL-C-0007
     */
    public void setAttrOperType(java.lang.Long attrOperType) {
        this.attrOperType = attrOperType;
    }

    /**
     * 获取 记录业务对象属性操作方式。LOVB=RUL-C-0007
     */
    public java.lang.Long getAttrOperType() {
        return this.attrOperType;
    }

    /**
     * 设置 记录服务提供标识。
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 记录服务提供标识。
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 记录优先级，值越大优先级越高。
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 记录优先级，值越大优先级越高。
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 记录适用区域标识。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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
