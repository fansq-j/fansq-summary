package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:对协议结构化表达，协议条款由产品、销售品、业务规则等对象构成
 * @实体表  :AGREE_ITEM_OBJ
 */
public class AgreeItemObjDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_ITEM_OBJ_S";

    /**
     * 条款包含对象标识
     */
    public java.lang.Long agreeItemObjId;

    /**
     * 条款模板包含对象标识
     */
    public java.lang.Long agreeItemTmpObjId;

    /**
     * 协议条款标识
     */
    public java.lang.Long agreeItemId;

    /**
     * 条款构成对象类型，LOVB=ARG-C-0015
     */
    public java.lang.String objType;

    /**
     * 业务对象标识
     */
    public java.lang.Long busiObjId;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

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
     * 缺省数量
     */
    public java.lang.Integer defaultCount;

    /**
     * 最小数量
     */
    public java.lang.Integer minNum;

    /**
     * 最大数量
     */
    public java.lang.Integer maxNum;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeItemObjId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeItemObjId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 条款模板包含对象标识
     */
    public void setAgreeItemTmpObjId(java.lang.Long agreeItemTmpObjId) {
        this.agreeItemTmpObjId = agreeItemTmpObjId;
    }

    /**
     * 获取 条款模板包含对象标识
     */
    public java.lang.Long getAgreeItemTmpObjId() {
        return this.agreeItemTmpObjId;
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
     * 设置 条款构成对象类型，LOVB=ARG-C-0015
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 条款构成对象类型，LOVB=ARG-C-0015
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 业务对象标识
     */
    public void setBusiObjId(java.lang.Long busiObjId) {
        this.busiObjId = busiObjId;
    }

    /**
     * 获取 业务对象标识
     */
    public java.lang.Long getBusiObjId() {
        return this.busiObjId;
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

    /**
     * 设置 缺省数量
     */
    public void setDefaultCount(java.lang.Integer defaultCount) {
        this.defaultCount = defaultCount;
    }

    /**
     * 获取 缺省数量
     */
    public java.lang.Integer getDefaultCount() {
        return this.defaultCount;
    }

    /**
     * 设置 最小数量
     */
    public void setMinNum(java.lang.Integer minNum) {
        this.minNum = minNum;
    }

    /**
     * 获取 最小数量
     */
    public java.lang.Integer getMinNum() {
        return this.minNum;
    }

    /**
     * 设置 最大数量
     */
    public void setMaxNum(java.lang.Integer maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * 获取 最大数量
     */
    public java.lang.Integer getMaxNum() {
        return this.maxNum;
    }

}
