package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录销售品实例关联的客户实例、帐户实例、银行卡号等。
 * @实体表  :OFFER_OBJ_INST_REL
 */
public class OfferObjInstRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_OBJ_INST_REL_S";

    /**
     * 记录销售品包含对象实例标识，主键。
     */
    public java.lang.Long offerObjInstRelId;

    /**
     * 记录销售品实例标识，外键。
     */
    public java.lang.Long offerInstId;

    /**
     * 记录对象类型，LOVB=OFF-C-0044
     */
    public java.lang.String objType;

    /**
     * 记录对象实例标识。
     */
    public java.lang.String objId;

    /**
     * 记录角色标识。
     */
    public java.lang.Long roleId;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 状态修改的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录销售品包含对象实例标识，主键。
     */
    public void setOfferObjInstRelId(java.lang.Long offerObjInstRelId) {
        this.offerObjInstRelId = offerObjInstRelId;
    }

    /**
     * 获取 记录销售品包含对象实例标识，主键。
     */
    public java.lang.Long getOfferObjInstRelId() {
        return this.offerObjInstRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerObjInstRelId = SeqUtils.createLongId(ID_SEQ);
         return this.offerObjInstRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录销售品实例标识，外键。
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 记录销售品实例标识，外键。
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 记录对象类型，LOVB=OFF-C-0044
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录对象类型，LOVB=OFF-C-0044
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录对象实例标识。
     */
    public void setObjId(java.lang.String objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录对象实例标识。
     */
    public java.lang.String getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录角色标识。
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 记录角色标识。
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 状态修改的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间。
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
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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
