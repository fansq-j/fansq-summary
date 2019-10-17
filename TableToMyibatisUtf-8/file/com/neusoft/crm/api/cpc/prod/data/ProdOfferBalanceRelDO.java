package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述销售品与余额规则的关系。
 * @实体表  :PROD_OFFER_BALANCE_REL
 */
public class ProdOfferBalanceRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_OFFER_BALANCE_REL_S";

    /**
     * 销售品余额分期规则关系标识。
     */
    public java.lang.Integer prodOfferBalanceRelId;

    /**
     * 余额预存赠送规则标识
     */
    public java.lang.Integer presentRuleId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 销售品余额分期规则关系标识。
     */
    public void setProdOfferBalanceRelId(java.lang.Integer prodOfferBalanceRelId) {
        this.prodOfferBalanceRelId = prodOfferBalanceRelId;
    }

    /**
     * 获取 销售品余额分期规则关系标识。
     */
    public java.lang.Integer getProdOfferBalanceRelId() {
        return this.prodOfferBalanceRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.prodOfferBalanceRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.prodOfferBalanceRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 余额预存赠送规则标识
     */
    public void setPresentRuleId(java.lang.Integer presentRuleId) {
        this.presentRuleId = presentRuleId;
    }

    /**
     * 获取 余额预存赠送规则标识
     */
    public java.lang.Integer getPresentRuleId() {
        return this.presentRuleId;
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
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
