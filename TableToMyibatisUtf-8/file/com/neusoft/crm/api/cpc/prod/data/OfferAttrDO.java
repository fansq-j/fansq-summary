package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述销售品所需要实例化的参数，包括定价参数定义，定价参数是被定价计划所引用。
 * @实体表  :OFFER_ATTR
 */
public class OfferAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_ATTR_S";

    /**
     * 销售品属性的主键
     */
    public java.lang.Integer offerAttrId;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * 父级销售品属性标识。通过这个字段，实现销售品属性分组
     */
    public java.lang.Integer parOfferAttrId;

    /**
     * 业务对象属性规格业务编码
     */
    public java.lang.Long attrId;

    /**
     * 记录参数默认值。
     */
    public java.lang.String defaultValue;

    /**
     * 作用对象类型，LOVB=OFF-C-0001
     */
    public java.lang.String objType;

    /**
     * 作用对象标识，属主标识，譬如，某个event，某个产品等
     */
    public java.lang.Long objId;

    /**
     * 记录最小值。
     */
    public java.lang.String minValue;

    /**
     * 记录最大值。
     */
    public java.lang.String maxValue;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间。
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 销售品属性的主键
     */
    public void setOfferAttrId(java.lang.Integer offerAttrId) {
        this.offerAttrId = offerAttrId;
    }

    /**
     * 获取 销售品属性的主键
     */
    public java.lang.Integer getOfferAttrId() {
        return this.offerAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.offerAttrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.offerAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 父级销售品属性标识。通过这个字段，实现销售品属性分组
     */
    public void setParOfferAttrId(java.lang.Integer parOfferAttrId) {
        this.parOfferAttrId = parOfferAttrId;
    }

    /**
     * 获取 父级销售品属性标识。通过这个字段，实现销售品属性分组
     */
    public java.lang.Integer getParOfferAttrId() {
        return this.parOfferAttrId;
    }

    /**
     * 设置 业务对象属性规格业务编码
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 业务对象属性规格业务编码
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 记录参数默认值。
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 记录参数默认值。
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 作用对象类型，LOVB=OFF-C-0001
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 作用对象类型，LOVB=OFF-C-0001
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 作用对象标识，属主标识，譬如，某个event，某个产品等
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 作用对象标识，属主标识，譬如，某个event，某个产品等
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录最小值。
     */
    public void setMinValue(java.lang.String minValue) {
        this.minValue = minValue;
    }

    /**
     * 获取 记录最小值。
     */
    public java.lang.String getMinValue() {
        return this.minValue;
    }

    /**
     * 设置 记录最大值。
     */
    public void setMaxValue(java.lang.String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 获取 记录最大值。
     */
    public java.lang.String getMaxValue() {
        return this.maxValue;
    }

    /**
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
