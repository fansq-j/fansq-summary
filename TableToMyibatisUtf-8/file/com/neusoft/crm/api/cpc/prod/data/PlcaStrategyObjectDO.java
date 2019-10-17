package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述PLCA策略组和用户、销售品、客户、账户等对象关联关系
 * @实体表  :PLCA_STRATEGY_OBJECT
 */
public class PlcaStrategyObjectDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_STRATEGY_OBJECT_S";

    /**
     * 策略对象标识，主键
     */
    public java.lang.Integer strategyObjectId;

    /**
     * 策略对象名称
     */
    public java.lang.String strategyObjectName;

    /**
     * LOVB=PLC-C-0001
     */
    public java.lang.String objType;

    /**
     * 对象类型为产品时，填产品规格标识
            对象类型为销售品时，填销售品规格标识
            
     */
    public java.lang.Long objId;

    /**
     * 策略组标识
     */
    public java.lang.Integer strategyGroupId;

    /**
     * LOVB=PLC-C-0026
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
     * 设置 策略对象标识，主键
     */
    public void setStrategyObjectId(java.lang.Integer strategyObjectId) {
        this.strategyObjectId = strategyObjectId;
    }

    /**
     * 获取 策略对象标识，主键
     */
    public java.lang.Integer getStrategyObjectId() {
        return this.strategyObjectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.strategyObjectId = SeqUtils.createIntegerId(ID_SEQ);
         return this.strategyObjectId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 策略对象名称
     */
    public void setStrategyObjectName(java.lang.String strategyObjectName) {
        this.strategyObjectName = strategyObjectName;
    }

    /**
     * 获取 策略对象名称
     */
    public java.lang.String getStrategyObjectName() {
        return this.strategyObjectName;
    }

    /**
     * 设置 LOVB=PLC-C-0001
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 LOVB=PLC-C-0001
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象类型为产品时，填产品规格标识
            对象类型为销售品时，填销售品规格标识
            
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象类型为产品时，填产品规格标识
            对象类型为销售品时，填销售品规格标识
            
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 策略组标识
     */
    public void setStrategyGroupId(java.lang.Integer strategyGroupId) {
        this.strategyGroupId = strategyGroupId;
    }

    /**
     * 获取 策略组标识
     */
    public java.lang.Integer getStrategyGroupId() {
        return this.strategyGroupId;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
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
