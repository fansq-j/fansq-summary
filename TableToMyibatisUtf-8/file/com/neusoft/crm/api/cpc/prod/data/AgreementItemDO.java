package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是协议双方对协议条件的表现和固定化，是确定协议当事人权利和义务的依据。协议条款是根据协议条款模板规格实例化的信息。
 * @实体表  :AGREEMENT_ITEM
 */
public class AgreementItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREEMENT_ITEM_S";

    /**
     * 记录协议条款标识
     */
    public java.lang.Long agreeItemId;

    /**
     * 协议模板项主键
     */
    public java.lang.Long agreeItemTmpId;

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
     * 协议条款名称
     */
    public java.lang.String agreeItemName;

    /**
     * 协议条款描述
     */
    public java.lang.String agreeItemDesc;

    /**
     * 协议条款内容
     */
    public java.lang.String agreeItemContent;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeItemId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议模板项主键
     */
    public void setAgreeItemTmpId(java.lang.Long agreeItemTmpId) {
        this.agreeItemTmpId = agreeItemTmpId;
    }

    /**
     * 获取 协议模板项主键
     */
    public java.lang.Long getAgreeItemTmpId() {
        return this.agreeItemTmpId;
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
     * 设置 协议条款名称
     */
    public void setAgreeItemName(java.lang.String agreeItemName) {
        this.agreeItemName = agreeItemName;
    }

    /**
     * 获取 协议条款名称
     */
    public java.lang.String getAgreeItemName() {
        return this.agreeItemName;
    }

    /**
     * 设置 协议条款描述
     */
    public void setAgreeItemDesc(java.lang.String agreeItemDesc) {
        this.agreeItemDesc = agreeItemDesc;
    }

    /**
     * 获取 协议条款描述
     */
    public java.lang.String getAgreeItemDesc() {
        return this.agreeItemDesc;
    }

    /**
     * 设置 协议条款内容
     */
    public void setAgreeItemContent(java.lang.String agreeItemContent) {
        this.agreeItemContent = agreeItemContent;
    }

    /**
     * 获取 协议条款内容
     */
    public java.lang.String getAgreeItemContent() {
        return this.agreeItemContent;
    }

}
