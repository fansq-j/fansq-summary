package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述销售品通用限制，通过表达式方式实现。
 * @实体表  :OFFER_RSTR_RUL
 */
public class OfferRstrRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_RSTR_RUL_S";

    /**
     * 记录销售品通用限制标识。
     */
    public java.lang.Long offerRstrRulId;

    /**
     * 例如提交成员加入、成员退出，结合应用实现定义
     */
    public java.lang.String rstrEvent;

    /**
     * 记录约束类型，LOVB=RUL-C-0020
     */
    public java.lang.String rstrType;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 提示信息的具体内容
     */
    public java.lang.String promptMsg;

    /**
     * 记录条件表达式。
     */
    public java.lang.Long exprId;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录记录状态。LOVB=PUB-C-0001。
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
     * 设置 记录销售品通用限制标识。
     */
    public void setOfferRstrRulId(java.lang.Long offerRstrRulId) {
        this.offerRstrRulId = offerRstrRulId;
    }

    /**
     * 获取 记录销售品通用限制标识。
     */
    public java.lang.Long getOfferRstrRulId() {
        return this.offerRstrRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerRstrRulId = SeqUtils.createLongId(ID_SEQ);
         return this.offerRstrRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 例如提交成员加入、成员退出，结合应用实现定义
     */
    public void setRstrEvent(java.lang.String rstrEvent) {
        this.rstrEvent = rstrEvent;
    }

    /**
     * 获取 例如提交成员加入、成员退出，结合应用实现定义
     */
    public java.lang.String getRstrEvent() {
        return this.rstrEvent;
    }

    /**
     * 设置 记录约束类型，LOVB=RUL-C-0020
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 记录约束类型，LOVB=RUL-C-0020
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 提示信息的具体内容
     */
    public void setPromptMsg(java.lang.String promptMsg) {
        this.promptMsg = promptMsg;
    }

    /**
     * 获取 提示信息的具体内容
     */
    public java.lang.String getPromptMsg() {
        return this.promptMsg;
    }

    /**
     * 设置 记录条件表达式。
     */
    public void setExprId(java.lang.Long exprId) {
        this.exprId = exprId;
    }

    /**
     * 获取 记录条件表达式。
     */
    public java.lang.Long getExprId() {
        return this.exprId;
    }

    /**
     * 设置 记录适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录记录状态。LOVB=PUB-C-0001。
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
