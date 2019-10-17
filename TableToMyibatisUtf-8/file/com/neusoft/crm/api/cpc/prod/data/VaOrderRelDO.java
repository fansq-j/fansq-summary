package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录接入产品关联的增值产品和增加销售品。
 * @实体表  :VA_ORDER_REL
 */
public class VaOrderRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VA_ORDER_REL_S";

    /**
     * 订购关系主键
     */
    public java.lang.Long vaOrderRelId;

    /**
     * 增值产品标识
     */
    public java.lang.Long vaProdId;

    /**
     * 增值销售品标识
     */
    public java.lang.Long vaOfferId;

    /**
     * 接入产品实例标识
     */
    public java.lang.Long accProdInstId;

    /**
     * 捆绑销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 捆绑销售品实例标识
     */
    public java.lang.Long offerInstId;

    /**
     * 来源系统
     */
    public java.lang.Long platId;

    /**
     * 计费时间
     */
    public java.util.Date billDate;

    /**
     * 订购方式
     */
    public java.lang.String orderMode;

    /**
     * LOVB=PRI-C-0036,订购类型：0：正常订购 1：免费体验 2：积分兑换
     */
    public java.lang.String orderType;

    /**
     * 订购渠道
     */
    public java.lang.String orderChannel;

    /**
     * 状态。LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 订购关系主键
     */
    public void setVaOrderRelId(java.lang.Long vaOrderRelId) {
        this.vaOrderRelId = vaOrderRelId;
    }

    /**
     * 获取 订购关系主键
     */
    public java.lang.Long getVaOrderRelId() {
        return this.vaOrderRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vaOrderRelId = SeqUtils.createLongId(ID_SEQ);
         return this.vaOrderRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 增值产品标识
     */
    public void setVaProdId(java.lang.Long vaProdId) {
        this.vaProdId = vaProdId;
    }

    /**
     * 获取 增值产品标识
     */
    public java.lang.Long getVaProdId() {
        return this.vaProdId;
    }

    /**
     * 设置 增值销售品标识
     */
    public void setVaOfferId(java.lang.Long vaOfferId) {
        this.vaOfferId = vaOfferId;
    }

    /**
     * 获取 增值销售品标识
     */
    public java.lang.Long getVaOfferId() {
        return this.vaOfferId;
    }

    /**
     * 设置 接入产品实例标识
     */
    public void setAccProdInstId(java.lang.Long accProdInstId) {
        this.accProdInstId = accProdInstId;
    }

    /**
     * 获取 接入产品实例标识
     */
    public java.lang.Long getAccProdInstId() {
        return this.accProdInstId;
    }

    /**
     * 设置 捆绑销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 捆绑销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 捆绑销售品实例标识
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 捆绑销售品实例标识
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 来源系统
     */
    public void setPlatId(java.lang.Long platId) {
        this.platId = platId;
    }

    /**
     * 获取 来源系统
     */
    public java.lang.Long getPlatId() {
        return this.platId;
    }

    /**
     * 设置 计费时间
     */
    public void setBillDate(java.util.Date billDate) {
        this.billDate = billDate;
    }

    /**
     * 获取 计费时间
     */
    public java.util.Date getBillDate() {
        return this.billDate;
    }

    /**
     * 设置 订购方式
     */
    public void setOrderMode(java.lang.String orderMode) {
        this.orderMode = orderMode;
    }

    /**
     * 获取 订购方式
     */
    public java.lang.String getOrderMode() {
        return this.orderMode;
    }

    /**
     * 设置 LOVB=PRI-C-0036,订购类型：0：正常订购 1：免费体验 2：积分兑换
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取 LOVB=PRI-C-0036,订购类型：0：正常订购 1：免费体验 2：积分兑换
     */
    public java.lang.String getOrderType() {
        return this.orderType;
    }

    /**
     * 设置 订购渠道
     */
    public void setOrderChannel(java.lang.String orderChannel) {
        this.orderChannel = orderChannel;
    }

    /**
     * 获取 订购渠道
     */
    public java.lang.String getOrderChannel() {
        return this.orderChannel;
    }

    /**
     * 设置 状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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
