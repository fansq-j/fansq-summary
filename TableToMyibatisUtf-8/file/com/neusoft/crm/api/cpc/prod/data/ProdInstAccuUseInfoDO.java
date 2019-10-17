package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用户对应的量本帐期使用量汇总信息

可能的场景： 用户某一量本类型使用量超过100m,   用户
 * @实体表  :PROD_INST_ACCU_USE_INFO
 */
public class ProdInstAccuUseInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_ACCU_USE_INFO_S";

    /**
     * 量本使用标识
     */
    public java.lang.Long accuUseId;

    /**
     * 量本标识
     */
    public java.lang.Long accuId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 销售品实例标识
     */
    public java.lang.Long offerInstId;

    /**
     * 帐务周期标识
     */
    public java.lang.Integer billingCycleId;

    /**
     * 使用量
     */
    public java.lang.Long usageAmount;

    /**
     * 用于记录语音转流量扣减的语音使用量
     */
    public java.lang.Long usageVoice;

    /**
     * 用于记录短信转流量扣减的短信使用量
     */
    public java.lang.Long usageSms;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

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
     * 设置 量本使用标识
     */
    public void setAccuUseId(java.lang.Long accuUseId) {
        this.accuUseId = accuUseId;
    }

    /**
     * 获取 量本使用标识
     */
    public java.lang.Long getAccuUseId() {
        return this.accuUseId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accuUseId = SeqUtils.createLongId(ID_SEQ);
         return this.accuUseId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 量本标识
     */
    public void setAccuId(java.lang.Long accuId) {
        this.accuId = accuId;
    }

    /**
     * 获取 量本标识
     */
    public java.lang.Long getAccuId() {
        return this.accuId;
    }

    /**
     * 设置 产品实例标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 销售品实例标识
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 销售品实例标识
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 帐务周期标识
     */
    public void setBillingCycleId(java.lang.Integer billingCycleId) {
        this.billingCycleId = billingCycleId;
    }

    /**
     * 获取 帐务周期标识
     */
    public java.lang.Integer getBillingCycleId() {
        return this.billingCycleId;
    }

    /**
     * 设置 使用量
     */
    public void setUsageAmount(java.lang.Long usageAmount) {
        this.usageAmount = usageAmount;
    }

    /**
     * 获取 使用量
     */
    public java.lang.Long getUsageAmount() {
        return this.usageAmount;
    }

    /**
     * 设置 用于记录语音转流量扣减的语音使用量
     */
    public void setUsageVoice(java.lang.Long usageVoice) {
        this.usageVoice = usageVoice;
    }

    /**
     * 获取 用于记录语音转流量扣减的语音使用量
     */
    public java.lang.Long getUsageVoice() {
        return this.usageVoice;
    }

    /**
     * 设置 用于记录短信转流量扣减的短信使用量
     */
    public void setUsageSms(java.lang.Long usageSms) {
        this.usageSms = usageSms;
    }

    /**
     * 获取 用于记录短信转流量扣减的短信使用量
     */
    public java.lang.Long getUsageSms() {
        return this.usageSms;
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
