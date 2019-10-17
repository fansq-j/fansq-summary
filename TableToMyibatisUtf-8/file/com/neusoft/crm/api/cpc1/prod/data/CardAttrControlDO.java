package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :CARD_ATTR_CONTROL
 */
public class CardAttrControlDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CARD_ATTR_CONTROL_S";

    /**
     * 主键
     */
    public java.lang.Integer attrShowControlId;

    /**
     * 属性id
     */
    public java.lang.Integer attrId;

    /**
     * 作用对象id
     */
    public java.lang.String attrObjId;

    /**
     * 最用对象类型  1 产品 2销售品
     */
    public java.lang.String attrObjType;

    /**
     * 属性的展示类型
     */
    public java.lang.String attrShowType;

    /**
     * 展示属性的自定义类型名
     */
    public java.lang.String attrShowName;

    /**
     * 操作类型 1000 新增，1100 删除，1200  修改，1300 保持
     */
    public java.lang.Integer operType;

    /**
     * 是否展示
     */
    public java.lang.Integer isDisplay;

    /**
     * 是否可修改
     */
    public java.lang.Integer isModify;

    /**
     * 是否默认展示
     */
    public java.lang.Integer isDefaultShow;

    /**
     * 备用
     */
    public java.lang.String reserve;

    /**
     * 设置 主键
     */
    public void setAttrShowControlId(java.lang.Integer attrShowControlId) {
        this.attrShowControlId = attrShowControlId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Integer getAttrShowControlId() {
        return this.attrShowControlId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.attrShowControlId = SeqUtils.createIntegerId(ID_SEQ);
         return this.attrShowControlId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 属性id
     */
    public void setAttrId(java.lang.Integer attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 属性id
     */
    public java.lang.Integer getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 作用对象id
     */
    public void setAttrObjId(java.lang.String attrObjId) {
        this.attrObjId = attrObjId;
    }

    /**
     * 获取 作用对象id
     */
    public java.lang.String getAttrObjId() {
        return this.attrObjId;
    }

    /**
     * 设置 最用对象类型  1 产品 2销售品
     */
    public void setAttrObjType(java.lang.String attrObjType) {
        this.attrObjType = attrObjType;
    }

    /**
     * 获取 最用对象类型  1 产品 2销售品
     */
    public java.lang.String getAttrObjType() {
        return this.attrObjType;
    }

    /**
     * 设置 属性的展示类型
     */
    public void setAttrShowType(java.lang.String attrShowType) {
        this.attrShowType = attrShowType;
    }

    /**
     * 获取 属性的展示类型
     */
    public java.lang.String getAttrShowType() {
        return this.attrShowType;
    }

    /**
     * 设置 展示属性的自定义类型名
     */
    public void setAttrShowName(java.lang.String attrShowName) {
        this.attrShowName = attrShowName;
    }

    /**
     * 获取 展示属性的自定义类型名
     */
    public java.lang.String getAttrShowName() {
        return this.attrShowName;
    }

    /**
     * 设置 操作类型 1000 新增，1100 删除，1200  修改，1300 保持
     */
    public void setOperType(java.lang.Integer operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型 1000 新增，1100 删除，1200  修改，1300 保持
     */
    public java.lang.Integer getOperType() {
        return this.operType;
    }

    /**
     * 设置 是否展示
     */
    public void setIsDisplay(java.lang.Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    /**
     * 获取 是否展示
     */
    public java.lang.Integer getIsDisplay() {
        return this.isDisplay;
    }

    /**
     * 设置 是否可修改
     */
    public void setIsModify(java.lang.Integer isModify) {
        this.isModify = isModify;
    }

    /**
     * 获取 是否可修改
     */
    public java.lang.Integer getIsModify() {
        return this.isModify;
    }

    /**
     * 设置 是否默认展示
     */
    public void setIsDefaultShow(java.lang.Integer isDefaultShow) {
        this.isDefaultShow = isDefaultShow;
    }

    /**
     * 获取 是否默认展示
     */
    public java.lang.Integer getIsDefaultShow() {
        return this.isDefaultShow;
    }

    /**
     * 设置 备用
     */
    public void setReserve(java.lang.String reserve) {
        this.reserve = reserve;
    }

    /**
     * 获取 备用
     */
    public java.lang.String getReserve() {
        return this.reserve;
    }

}
