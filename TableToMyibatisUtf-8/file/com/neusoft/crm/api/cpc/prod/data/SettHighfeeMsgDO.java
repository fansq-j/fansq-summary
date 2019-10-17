package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:佣金高额告警信息，记录高额计算输出的告警信息清单
 * @实体表  :SETT_HIGHFEE_MSG
 */
public class SettHighfeeMsgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_HIGHFEE_MSG_S";

    /**
     * 高额告警级别标识
     */
    public java.lang.Long settHighfeeMsgId;

    /**
     * 高额告警级别名称
     */
    public java.lang.Integer highfeePlanId;

    /**
     * 高额类型标识
     */
    public java.lang.Integer highfeeTypeId;

    /**
     * 目标事件类型标识
     */
    public java.lang.Integer destEventTypeId;

    /**
     * 高额告警级别标识
     */
    public java.lang.Integer highfeeLevelId;

    /**
     * 帐期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 对象类型
     */
    public java.lang.Integer objType;

    /**
     * 对象标识
     */
    public java.lang.Integer objId;

    /**
     * 金额
     */
    public java.lang.Integer charge;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 高额告警级别标识
     */
    public void setSettHighfeeMsgId(java.lang.Long settHighfeeMsgId) {
        this.settHighfeeMsgId = settHighfeeMsgId;
    }

    /**
     * 获取 高额告警级别标识
     */
    public java.lang.Long getSettHighfeeMsgId() {
        return this.settHighfeeMsgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.settHighfeeMsgId = SeqUtils.createLongId(ID_SEQ);
         return this.settHighfeeMsgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 高额告警级别名称
     */
    public void setHighfeePlanId(java.lang.Integer highfeePlanId) {
        this.highfeePlanId = highfeePlanId;
    }

    /**
     * 获取 高额告警级别名称
     */
    public java.lang.Integer getHighfeePlanId() {
        return this.highfeePlanId;
    }

    /**
     * 设置 高额类型标识
     */
    public void setHighfeeTypeId(java.lang.Integer highfeeTypeId) {
        this.highfeeTypeId = highfeeTypeId;
    }

    /**
     * 获取 高额类型标识
     */
    public java.lang.Integer getHighfeeTypeId() {
        return this.highfeeTypeId;
    }

    /**
     * 设置 目标事件类型标识
     */
    public void setDestEventTypeId(java.lang.Integer destEventTypeId) {
        this.destEventTypeId = destEventTypeId;
    }

    /**
     * 获取 目标事件类型标识
     */
    public java.lang.Integer getDestEventTypeId() {
        return this.destEventTypeId;
    }

    /**
     * 设置 高额告警级别标识
     */
    public void setHighfeeLevelId(java.lang.Integer highfeeLevelId) {
        this.highfeeLevelId = highfeeLevelId;
    }

    /**
     * 获取 高额告警级别标识
     */
    public java.lang.Integer getHighfeeLevelId() {
        return this.highfeeLevelId;
    }

    /**
     * 设置 帐期标识
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 帐期标识
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 对象类型
     */
    public void setObjType(java.lang.Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取 对象类型
     */
    public java.lang.Integer getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象标识
     */
    public void setObjId(java.lang.Integer objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识
     */
    public java.lang.Integer getObjId() {
        return this.objId;
    }

    /**
     * 设置 金额
     */
    public void setCharge(java.lang.Integer charge) {
        this.charge = charge;
    }

    /**
     * 获取 金额
     */
    public java.lang.Integer getCharge() {
        return this.charge;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
