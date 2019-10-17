package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述通过向客户提供一些手续和体力工作，完成电信产品实例化的手段。比如提供给客户的一些手续和体力工作，服务提供分为两类：其
 * @实体表  :SERVICE_OFFER
 */
public class ServiceOfferDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SERVICE_OFFER_S";

    /**
     * 服务提供标识
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 父服务提供标识
     */
    public java.lang.Integer parServiceOfferId;

    /**
     * 服务提供名称
     */
    public java.lang.String serviceOfferName;

    /**
     * 服务提供描述
     */
    public java.lang.String serviceOfferDesc;

    /**
     * 记录状态。LOVB=EVT-0007
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 标准编码，LOVB=EVT-0006
     */
    public java.lang.String standardCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

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
     * 设置 服务提供标识
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供标识
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.serviceOfferId = SeqUtils.createIntegerId(ID_SEQ);
         return this.serviceOfferId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 父服务提供标识
     */
    public void setParServiceOfferId(java.lang.Integer parServiceOfferId) {
        this.parServiceOfferId = parServiceOfferId;
    }

    /**
     * 获取 父服务提供标识
     */
    public java.lang.Integer getParServiceOfferId() {
        return this.parServiceOfferId;
    }

    /**
     * 设置 服务提供名称
     */
    public void setServiceOfferName(java.lang.String serviceOfferName) {
        this.serviceOfferName = serviceOfferName;
    }

    /**
     * 获取 服务提供名称
     */
    public java.lang.String getServiceOfferName() {
        return this.serviceOfferName;
    }

    /**
     * 设置 服务提供描述
     */
    public void setServiceOfferDesc(java.lang.String serviceOfferDesc) {
        this.serviceOfferDesc = serviceOfferDesc;
    }

    /**
     * 获取 服务提供描述
     */
    public java.lang.String getServiceOfferDesc() {
        return this.serviceOfferDesc;
    }

    /**
     * 设置 记录状态。LOVB=EVT-0007
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=EVT-0007
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 标准编码，LOVB=EVT-0006
     */
    public void setStandardCd(java.lang.String standardCd) {
        this.standardCd = standardCd;
    }

    /**
     * 获取 标准编码，LOVB=EVT-0006
     */
    public java.lang.String getStandardCd() {
        return this.standardCd;
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
