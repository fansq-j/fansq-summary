package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述协议条款具体的参数取值，例如对于DDN协议条款中限定DDN产品的速率取值。
 * @实体表  :AGREE_ITEM_ATTR
 */
public class AgreeItemAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_ITEM_ATTR_S";

    /**
     * 协议条款属性标识
     */
    public java.lang.Long agreeItemAttrId;

    /**
     * 条款包含对象标识
     */
    public java.lang.Long agreeItemObjId;

    /**
     * 条款模板参数标识
     */
    public java.lang.Long itemAttrId;

    /**
     * 协议条款标识
     */
    public java.lang.Long agreeItemId;

    /**
     * 属性值,当只有一个取值的时候记录在这里
     */
    public java.lang.String paramValue;

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
     * 设置 协议条款属性标识
     */
    public void setAgreeItemAttrId(java.lang.Long agreeItemAttrId) {
        this.agreeItemAttrId = agreeItemAttrId;
    }

    /**
     * 获取 协议条款属性标识
     */
    public java.lang.Long getAgreeItemAttrId() {
        return this.agreeItemAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeItemAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeItemAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 条款包含对象标识
     */
    public void setAgreeItemObjId(java.lang.Long agreeItemObjId) {
        this.agreeItemObjId = agreeItemObjId;
    }

    /**
     * 获取 条款包含对象标识
     */
    public java.lang.Long getAgreeItemObjId() {
        return this.agreeItemObjId;
    }

    /**
     * 设置 条款模板参数标识
     */
    public void setItemAttrId(java.lang.Long itemAttrId) {
        this.itemAttrId = itemAttrId;
    }

    /**
     * 获取 条款模板参数标识
     */
    public java.lang.Long getItemAttrId() {
        return this.itemAttrId;
    }

    /**
     * 设置 协议条款标识
     */
    public void setAgreeItemId(java.lang.Long agreeItemId) {
        this.agreeItemId = agreeItemId;
    }

    /**
     * 获取 协议条款标识
     */
    public java.lang.Long getAgreeItemId() {
        return this.agreeItemId;
    }

    /**
     * 设置 属性值,当只有一个取值的时候记录在这里
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }

    /**
     * 获取 属性值,当只有一个取值的时候记录在这里
     */
    public java.lang.String getParamValue() {
        return this.paramValue;
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
