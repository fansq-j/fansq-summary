package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述服务提供通用限制，通过表达式方式实现。
 * @实体表  :SERV_RSTR_RUL
 */
public class ServRstrRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SERV_RSTR_RUL_S";

    /**
     * 记录服务提供通用限制标识。
     */
    public java.lang.Long servRstrRulId;

    /**
     * 例如提交订单前、提交订单时，结合应用实现定义
     */
    public java.lang.String rstrEvent;

    /**
     * 记录约束类型，LOVB=RUL-C-0019
     */
    public java.lang.String rstrType;

    /**
     * 记录服务提供标识
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 产品标识
     */
    public java.lang.Integer prodId;

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
     * 设置 记录服务提供通用限制标识。
     */
    public void setServRstrRulId(java.lang.Long servRstrRulId) {
        this.servRstrRulId = servRstrRulId;
    }

    /**
     * 获取 记录服务提供通用限制标识。
     */
    public java.lang.Long getServRstrRulId() {
        return this.servRstrRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.servRstrRulId = SeqUtils.createLongId(ID_SEQ);
         return this.servRstrRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 例如提交订单前、提交订单时，结合应用实现定义
     */
    public void setRstrEvent(java.lang.String rstrEvent) {
        this.rstrEvent = rstrEvent;
    }

    /**
     * 获取 例如提交订单前、提交订单时，结合应用实现定义
     */
    public java.lang.String getRstrEvent() {
        return this.rstrEvent;
    }

    /**
     * 设置 记录约束类型，LOVB=RUL-C-0019
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 记录约束类型，LOVB=RUL-C-0019
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 记录服务提供标识
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 记录服务提供标识
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 产品标识
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品标识
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
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
