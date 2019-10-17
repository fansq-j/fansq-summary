package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:协议与协议条款关联
 * @实体表  :AGREE_ITEM_REL
 */
public class AgreeItemRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_ITEM_REL_S";

    /**
     * 协议协议条款关系标识
     */
    public java.lang.Long argArgItemRelId;

    /**
     * 记录协议标识
     */
    public java.lang.Long agreeId;

    /**
     * 记录协议条款标识
     */
    public java.lang.Long agreeItemId;

    /**
     * 记录条款标号
     */
    public java.lang.String agrItemSign;

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
     * 构成顺序
     */
    public java.lang.Integer agrItemOrder;

    /**
     * 设置 协议协议条款关系标识
     */
    public void setArgArgItemRelId(java.lang.Long argArgItemRelId) {
        this.argArgItemRelId = argArgItemRelId;
    }

    /**
     * 获取 协议协议条款关系标识
     */
    public java.lang.Long getArgArgItemRelId() {
        return this.argArgItemRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.argArgItemRelId = SeqUtils.createLongId(ID_SEQ);
         return this.argArgItemRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录协议标识
     */
    public void setAgreeId(java.lang.Long agreeId) {
        this.agreeId = agreeId;
    }

    /**
     * 获取 记录协议标识
     */
    public java.lang.Long getAgreeId() {
        return this.agreeId;
    }

    /**
     * 设置 记录协议条款标识
     */
    public void setAgreeItemId(java.lang.Long agreeItemId) {
        this.agreeItemId = agreeItemId;
    }

    /**
     * 获取 记录协议条款标识
     */
    public java.lang.Long getAgreeItemId() {
        return this.agreeItemId;
    }

    /**
     * 设置 记录条款标号
     */
    public void setAgrItemSign(java.lang.String agrItemSign) {
        this.agrItemSign = agrItemSign;
    }

    /**
     * 获取 记录条款标号
     */
    public java.lang.String getAgrItemSign() {
        return this.agrItemSign;
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

    /**
     * 设置 构成顺序
     */
    public void setAgrItemOrder(java.lang.Integer agrItemOrder) {
        this.agrItemOrder = agrItemOrder;
    }

    /**
     * 获取 构成顺序
     */
    public java.lang.Integer getAgrItemOrder() {
        return this.agrItemOrder;
    }

}
