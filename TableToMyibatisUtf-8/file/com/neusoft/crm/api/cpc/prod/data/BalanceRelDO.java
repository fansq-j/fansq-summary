package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录余额对象之间的关系。
 * @实体表  :BALANCE_REL
 */
public class BalanceRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_REL_S";

    /**
     * 余额对象关系的唯一标识。
     */
    public java.lang.Long balanceRelationId;

    /**
     * 标示余额帐本。------------
     */
    public java.lang.Long acctBalanceId;

    /**
     * 余额对象类型，表明余额对象性质。ACC-C-0036
     */
    public java.lang.Integer objectType;

    /**
     * 余额对象标识，可选客户/帐户/用户/销售品（群组）的实例标识
     */
    public java.lang.Long objId;

    /**
     * 设置 余额对象关系的唯一标识。
     */
    public void setBalanceRelationId(java.lang.Long balanceRelationId) {
        this.balanceRelationId = balanceRelationId;
    }

    /**
     * 获取 余额对象关系的唯一标识。
     */
    public java.lang.Long getBalanceRelationId() {
        return this.balanceRelationId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.balanceRelationId = SeqUtils.createLongId(ID_SEQ);
         return this.balanceRelationId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 标示余额帐本。------------
     */
    public void setAcctBalanceId(java.lang.Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    /**
     * 获取 标示余额帐本。------------
     */
    public java.lang.Long getAcctBalanceId() {
        return this.acctBalanceId;
    }

    /**
     * 设置 余额对象类型，表明余额对象性质。ACC-C-0036
     */
    public void setObjectType(java.lang.Integer objectType) {
        this.objectType = objectType;
    }

    /**
     * 获取 余额对象类型，表明余额对象性质。ACC-C-0036
     */
    public java.lang.Integer getObjectType() {
        return this.objectType;
    }

    /**
     * 设置 余额对象标识，可选客户/帐户/用户/销售品（群组）的实例标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 余额对象标识，可选客户/帐户/用户/销售品（群组）的实例标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

}
