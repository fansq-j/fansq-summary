package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:促销政策明细项实体
 * @实体表  :SALES_PROMOTION_ITEM
 */
public class SalesPromotionItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALES_PROMOTION_ITEM_S";

    /**
     * 促销政策明细项标识
     */
    public java.lang.Integer itemId;

    /**
     * 促销政策标识
     */
    public java.lang.Integer promotionId;

    /**
     * 属性分组号
     */
    public java.lang.Integer itemAttrGroup;

    /**
     * 对应属性标识
     */
    public java.lang.Integer itemAttrId;

    /**
     * 促销政策明细项值
     */
    public java.lang.String attrValue;

    /**
     * 促销政策明细项值描述
     */
    public java.lang.String attrValueDesc;

    /**
     * 明细项分类标识
     */
    public java.lang.Integer itemKind;

    /**
     * 明细项功能分类标识
     */
    public java.lang.Integer itemFuncType;

    /**
     * 受理是否可见
     */
    public java.lang.String ifVisible;

    /**
     * 受理是否可修改
     */
    public java.lang.String ifReadonly;

    /**
     * 受理是否必填
     */
    public java.lang.String ifNecessary;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 促销政策明细项标识
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取 促销政策明细项标识
     */
    public java.lang.Integer getItemId() {
        return this.itemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.itemId = SeqUtils.createIntegerId(ID_SEQ);
         return this.itemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 促销政策标识
     */
    public void setPromotionId(java.lang.Integer promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * 获取 促销政策标识
     */
    public java.lang.Integer getPromotionId() {
        return this.promotionId;
    }

    /**
     * 设置 属性分组号
     */
    public void setItemAttrGroup(java.lang.Integer itemAttrGroup) {
        this.itemAttrGroup = itemAttrGroup;
    }

    /**
     * 获取 属性分组号
     */
    public java.lang.Integer getItemAttrGroup() {
        return this.itemAttrGroup;
    }

    /**
     * 设置 对应属性标识
     */
    public void setItemAttrId(java.lang.Integer itemAttrId) {
        this.itemAttrId = itemAttrId;
    }

    /**
     * 获取 对应属性标识
     */
    public java.lang.Integer getItemAttrId() {
        return this.itemAttrId;
    }

    /**
     * 设置 促销政策明细项值
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 促销政策明细项值
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 促销政策明细项值描述
     */
    public void setAttrValueDesc(java.lang.String attrValueDesc) {
        this.attrValueDesc = attrValueDesc;
    }

    /**
     * 获取 促销政策明细项值描述
     */
    public java.lang.String getAttrValueDesc() {
        return this.attrValueDesc;
    }

    /**
     * 设置 明细项分类标识
     */
    public void setItemKind(java.lang.Integer itemKind) {
        this.itemKind = itemKind;
    }

    /**
     * 获取 明细项分类标识
     */
    public java.lang.Integer getItemKind() {
        return this.itemKind;
    }

    /**
     * 设置 明细项功能分类标识
     */
    public void setItemFuncType(java.lang.Integer itemFuncType) {
        this.itemFuncType = itemFuncType;
    }

    /**
     * 获取 明细项功能分类标识
     */
    public java.lang.Integer getItemFuncType() {
        return this.itemFuncType;
    }

    /**
     * 设置 受理是否可见
     */
    public void setIfVisible(java.lang.String ifVisible) {
        this.ifVisible = ifVisible;
    }

    /**
     * 获取 受理是否可见
     */
    public java.lang.String getIfVisible() {
        return this.ifVisible;
    }

    /**
     * 设置 受理是否可修改
     */
    public void setIfReadonly(java.lang.String ifReadonly) {
        this.ifReadonly = ifReadonly;
    }

    /**
     * 获取 受理是否可修改
     */
    public java.lang.String getIfReadonly() {
        return this.ifReadonly;
    }

    /**
     * 设置 受理是否必填
     */
    public void setIfNecessary(java.lang.String ifNecessary) {
        this.ifNecessary = ifNecessary;
    }

    /**
     * 获取 受理是否必填
     */
    public java.lang.String getIfNecessary() {
        return this.ifNecessary;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
