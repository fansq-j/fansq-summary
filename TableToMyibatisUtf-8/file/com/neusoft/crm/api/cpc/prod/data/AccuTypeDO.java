package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表示量本的类型. 量本的增加是为了支持新的业务场景，如流量不清零、流量转赠、流量时长互转、流量共享等。
 * @实体表  :ACCU_TYPE
 */
public class AccuTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCU_TYPE_S";

    /**
     * 量本类型标识
     */
    public java.lang.Integer accuTypeId;

    /**
     * 资费单位标识
     */
    public java.lang.Integer tariffUnitId;

    /**
     * LOVB=PRC-C-0036
     */
    public java.lang.Integer canBeNegative;

    /**
     * LOVB=PRC-C-0032
     */
    public java.lang.Integer accuDirection;

    /**
     * 量本类型名称
     */
    public java.lang.String accuTypeName;

    /**
     * LOVB=PRC-C-0036
     */
    public java.lang.Integer canSend;

    /**
     * 量本类型描述. 定向流量可以在此说明。如百度，微信，腾讯等。
     */
    public java.lang.String accuDesc;

    /**
     * 区域标识
     */
    public java.lang.Integer regionId;

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
     * 设置 量本类型标识
     */
    public void setAccuTypeId(java.lang.Integer accuTypeId) {
        this.accuTypeId = accuTypeId;
    }

    /**
     * 获取 量本类型标识
     */
    public java.lang.Integer getAccuTypeId() {
        return this.accuTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.accuTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.accuTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 资费单位标识
     */
    public void setTariffUnitId(java.lang.Integer tariffUnitId) {
        this.tariffUnitId = tariffUnitId;
    }

    /**
     * 获取 资费单位标识
     */
    public java.lang.Integer getTariffUnitId() {
        return this.tariffUnitId;
    }

    /**
     * 设置 LOVB=PRC-C-0036
     */
    public void setCanBeNegative(java.lang.Integer canBeNegative) {
        this.canBeNegative = canBeNegative;
    }

    /**
     * 获取 LOVB=PRC-C-0036
     */
    public java.lang.Integer getCanBeNegative() {
        return this.canBeNegative;
    }

    /**
     * 设置 LOVB=PRC-C-0032
     */
    public void setAccuDirection(java.lang.Integer accuDirection) {
        this.accuDirection = accuDirection;
    }

    /**
     * 获取 LOVB=PRC-C-0032
     */
    public java.lang.Integer getAccuDirection() {
        return this.accuDirection;
    }

    /**
     * 设置 量本类型名称
     */
    public void setAccuTypeName(java.lang.String accuTypeName) {
        this.accuTypeName = accuTypeName;
    }

    /**
     * 获取 量本类型名称
     */
    public java.lang.String getAccuTypeName() {
        return this.accuTypeName;
    }

    /**
     * 设置 LOVB=PRC-C-0036
     */
    public void setCanSend(java.lang.Integer canSend) {
        this.canSend = canSend;
    }

    /**
     * 获取 LOVB=PRC-C-0036
     */
    public java.lang.Integer getCanSend() {
        return this.canSend;
    }

    /**
     * 设置 量本类型描述. 定向流量可以在此说明。如百度，微信，腾讯等。
     */
    public void setAccuDesc(java.lang.String accuDesc) {
        this.accuDesc = accuDesc;
    }

    /**
     * 获取 量本类型描述. 定向流量可以在此说明。如百度，微信，腾讯等。
     */
    public java.lang.String getAccuDesc() {
        return this.accuDesc;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
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
