package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:团购活动的门限与价格配置


团购订单详情在订单子域实现
 * @实体表  :GROUP_PURCHASE
 */
public class GroupPurchaseDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GROUP_PURCHASE_S";

    /**
     * 团购资费标识
     */
    public java.lang.Long groupPurchaseId;

    /**
     * 促销活动资费标识
     */
    public java.lang.Integer promActiTariffId;

    /**
     * 团购成立的数量下限
     */
    public java.lang.Integer numLow;

    /**
     * 团购的数量上限
     */
    public java.lang.Integer numUpp;

    /**
     * 团购价格，不含税价格
     */
    public java.lang.Long price;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 普通记录状态.LOVB=PRC-C-0026.
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
     * 设置 团购资费标识
     */
    public void setGroupPurchaseId(java.lang.Long groupPurchaseId) {
        this.groupPurchaseId = groupPurchaseId;
    }

    /**
     * 获取 团购资费标识
     */
    public java.lang.Long getGroupPurchaseId() {
        return this.groupPurchaseId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.groupPurchaseId = SeqUtils.createLongId(ID_SEQ);
         return this.groupPurchaseId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 促销活动资费标识
     */
    public void setPromActiTariffId(java.lang.Integer promActiTariffId) {
        this.promActiTariffId = promActiTariffId;
    }

    /**
     * 获取 促销活动资费标识
     */
    public java.lang.Integer getPromActiTariffId() {
        return this.promActiTariffId;
    }

    /**
     * 设置 团购成立的数量下限
     */
    public void setNumLow(java.lang.Integer numLow) {
        this.numLow = numLow;
    }

    /**
     * 获取 团购成立的数量下限
     */
    public java.lang.Integer getNumLow() {
        return this.numLow;
    }

    /**
     * 设置 团购的数量上限
     */
    public void setNumUpp(java.lang.Integer numUpp) {
        this.numUpp = numUpp;
    }

    /**
     * 获取 团购的数量上限
     */
    public java.lang.Integer getNumUpp() {
        return this.numUpp;
    }

    /**
     * 设置 团购价格，不含税价格
     */
    public void setPrice(java.lang.Long price) {
        this.price = price;
    }

    /**
     * 获取 团购价格，不含税价格
     */
    public java.lang.Long getPrice() {
        return this.price;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 普通记录状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.LOVB=PRC-C-0026.
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
