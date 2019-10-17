package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:协议条款模板属性与对象属性关联
 * @实体表  :AGREE_ITEM_TMP_ATTR_OBJ
 */
public class AgreeItemTmpAttrObjDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_ITEM_TMP_ATTR_OBJ_S";

    /**
     * 参数关联标识
     */
    public java.lang.Integer paramRelId;

    /**
     * 记录条款模板包含对象标识
     */
    public java.lang.Long agreeItemTmpObjId;

    /**
     * 条款参数标识
     */
    public java.lang.Long itemAttrId;

    /**
     * 业务对象属性规格业务编码
     */
    public java.lang.Long attrId;

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
     * 设置 参数关联标识
     */
    public void setParamRelId(java.lang.Integer paramRelId) {
        this.paramRelId = paramRelId;
    }

    /**
     * 获取 参数关联标识
     */
    public java.lang.Integer getParamRelId() {
        return this.paramRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.paramRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.paramRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录条款模板包含对象标识
     */
    public void setAgreeItemTmpObjId(java.lang.Long agreeItemTmpObjId) {
        this.agreeItemTmpObjId = agreeItemTmpObjId;
    }

    /**
     * 获取 记录条款模板包含对象标识
     */
    public java.lang.Long getAgreeItemTmpObjId() {
        return this.agreeItemTmpObjId;
    }

    /**
     * 设置 条款参数标识
     */
    public void setItemAttrId(java.lang.Long itemAttrId) {
        this.itemAttrId = itemAttrId;
    }

    /**
     * 获取 条款参数标识
     */
    public java.lang.Long getItemAttrId() {
        return this.itemAttrId;
    }

    /**
     * 设置 业务对象属性规格业务编码
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 业务对象属性规格业务编码
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
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
