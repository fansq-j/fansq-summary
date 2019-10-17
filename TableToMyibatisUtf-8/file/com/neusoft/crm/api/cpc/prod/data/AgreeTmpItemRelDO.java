package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:协议可用条款模板是根据协议模板规则对特定类型协议模板（如e6模板）进行条款模板约束定义的结果，是协议条款模板的子集。
 * @实体表  :AGREE_TMP_ITEM_REL
 */
public class AgreeTmpItemRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_TMP_ITEM_REL_S";

    /**
     * 关联标识
     */
    public java.lang.Long agreeTmpItemRelId;

    /**
     * 协议模板标识
     */
    public java.lang.Long agreementTmpId;

    /**
     * 协议条款模板标识
     */
    public java.lang.Long agreeItemTmpId;

    /**
     * 协议模板条款组标识
     */
    public java.lang.Long itemGroupId;

    /**
     * 条款标号
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
     * 设置 关联标识
     */
    public void setAgreeTmpItemRelId(java.lang.Long agreeTmpItemRelId) {
        this.agreeTmpItemRelId = agreeTmpItemRelId;
    }

    /**
     * 获取 关联标识
     */
    public java.lang.Long getAgreeTmpItemRelId() {
        return this.agreeTmpItemRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeTmpItemRelId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeTmpItemRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议模板标识
     */
    public void setAgreementTmpId(java.lang.Long agreementTmpId) {
        this.agreementTmpId = agreementTmpId;
    }

    /**
     * 获取 协议模板标识
     */
    public java.lang.Long getAgreementTmpId() {
        return this.agreementTmpId;
    }

    /**
     * 设置 协议条款模板标识
     */
    public void setAgreeItemTmpId(java.lang.Long agreeItemTmpId) {
        this.agreeItemTmpId = agreeItemTmpId;
    }

    /**
     * 获取 协议条款模板标识
     */
    public java.lang.Long getAgreeItemTmpId() {
        return this.agreeItemTmpId;
    }

    /**
     * 设置 协议模板条款组标识
     */
    public void setItemGroupId(java.lang.Long itemGroupId) {
        this.itemGroupId = itemGroupId;
    }

    /**
     * 获取 协议模板条款组标识
     */
    public java.lang.Long getItemGroupId() {
        return this.itemGroupId;
    }

    /**
     * 设置 条款标号
     */
    public void setAgrItemSign(java.lang.String agrItemSign) {
        this.agrItemSign = agrItemSign;
    }

    /**
     * 获取 条款标号
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

}
