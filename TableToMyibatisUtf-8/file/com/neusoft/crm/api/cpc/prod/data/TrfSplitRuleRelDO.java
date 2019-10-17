package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:佣金资费标准跟佣金结算周期拆分规则的关系，比如一个资费可以拆分成多个周期计算
 * @实体表  :TRF_SPLIT_RULE_REL
 */
public class TrfSplitRuleRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TRF_SPLIT_RULE_REL_S";

    /**
     * 佣金积分类型标识
     */
    public java.lang.Long trfSplitRuleRelId;

    /**
     * 资费标准的标识
     */
    public java.lang.Integer tariffId;

    /**
     * 佣金积分类型标识
     */
    public java.lang.Long cycleSplitRuleId;

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
     * 设置 佣金积分类型标识
     */
    public void setTrfSplitRuleRelId(java.lang.Long trfSplitRuleRelId) {
        this.trfSplitRuleRelId = trfSplitRuleRelId;
    }

    /**
     * 获取 佣金积分类型标识
     */
    public java.lang.Long getTrfSplitRuleRelId() {
        return this.trfSplitRuleRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.trfSplitRuleRelId = SeqUtils.createLongId(ID_SEQ);
         return this.trfSplitRuleRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 资费标准的标识
     */
    public void setTariffId(java.lang.Integer tariffId) {
        this.tariffId = tariffId;
    }

    /**
     * 获取 资费标准的标识
     */
    public java.lang.Integer getTariffId() {
        return this.tariffId;
    }

    /**
     * 设置 佣金积分类型标识
     */
    public void setCycleSplitRuleId(java.lang.Long cycleSplitRuleId) {
        this.cycleSplitRuleId = cycleSplitRuleId;
    }

    /**
     * 获取 佣金积分类型标识
     */
    public java.lang.Long getCycleSplitRuleId() {
        return this.cycleSplitRuleId;
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
