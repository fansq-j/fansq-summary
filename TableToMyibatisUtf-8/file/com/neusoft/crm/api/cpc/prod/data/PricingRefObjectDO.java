package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:在对产品/销售品进行定价的过程中所牵涉的对定价有影响的数据实体的相关参照属性，可以是（但不限于）产品、销售品、客户协议、
 * @实体表  :PRICING_REF_OBJECT
 */
public class PricingRefObjectDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_REF_OBJECT_S";

    /**
     * 
     */
    public java.lang.Integer pricingRefObjectId;

    /**
     * 参考对象名称
     */
    public java.lang.String refObjectName;

    /**
     * 度量方法的标识
     */
    public java.lang.Integer measureMethodId;

    /**
     * 属主标识，譬如，某个event，某个产品等
     */
    public java.lang.Integer ownerId;

    /**
     * LOVB=PRC-C-0007
     */
    public java.lang.Integer propertyType;

    /**
     * 说明引用哪个属性，外键引用属性定义表. 当属主属性类型为定价参数属性时,该标识为定价参数标识.
     */
    public java.lang.Integer propertyDefineId;

    /**
     * 定价参考对象的外部属性标识，用字符串表示。
     */
    public java.lang.String externPropertyString;

    /**
     * LOVB=PRC-C-0008
     */
    public java.lang.Integer historyTimeType;

    /**
     * 定价参考对象时间偏移量，如向前第3个帐期，则取值＝－3
     */
    public java.lang.Integer historyTimeDuration;

    /**
     * 定价参考对象所属的周期时间对象。
     */
    public java.lang.Integer historyTimeQuantity;

    /**
     * 状态.LOVB=PRC-C-0026.
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
     * 设置 
     */
    public void setPricingRefObjectId(java.lang.Integer pricingRefObjectId) {
        this.pricingRefObjectId = pricingRefObjectId;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getPricingRefObjectId() {
        return this.pricingRefObjectId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingRefObjectId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingRefObjectId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 参考对象名称
     */
    public void setRefObjectName(java.lang.String refObjectName) {
        this.refObjectName = refObjectName;
    }

    /**
     * 获取 参考对象名称
     */
    public java.lang.String getRefObjectName() {
        return this.refObjectName;
    }

    /**
     * 设置 度量方法的标识
     */
    public void setMeasureMethodId(java.lang.Integer measureMethodId) {
        this.measureMethodId = measureMethodId;
    }

    /**
     * 获取 度量方法的标识
     */
    public java.lang.Integer getMeasureMethodId() {
        return this.measureMethodId;
    }

    /**
     * 设置 属主标识，譬如，某个event，某个产品等
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 获取 属主标识，譬如，某个event，某个产品等
     */
    public java.lang.Integer getOwnerId() {
        return this.ownerId;
    }

    /**
     * 设置 LOVB=PRC-C-0007
     */
    public void setPropertyType(java.lang.Integer propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * 获取 LOVB=PRC-C-0007
     */
    public java.lang.Integer getPropertyType() {
        return this.propertyType;
    }

    /**
     * 设置 说明引用哪个属性，外键引用属性定义表. 当属主属性类型为定价参数属性时,该标识为定价参数标识.
     */
    public void setPropertyDefineId(java.lang.Integer propertyDefineId) {
        this.propertyDefineId = propertyDefineId;
    }

    /**
     * 获取 说明引用哪个属性，外键引用属性定义表. 当属主属性类型为定价参数属性时,该标识为定价参数标识.
     */
    public java.lang.Integer getPropertyDefineId() {
        return this.propertyDefineId;
    }

    /**
     * 设置 定价参考对象的外部属性标识，用字符串表示。
     */
    public void setExternPropertyString(java.lang.String externPropertyString) {
        this.externPropertyString = externPropertyString;
    }

    /**
     * 获取 定价参考对象的外部属性标识，用字符串表示。
     */
    public java.lang.String getExternPropertyString() {
        return this.externPropertyString;
    }

    /**
     * 设置 LOVB=PRC-C-0008
     */
    public void setHistoryTimeType(java.lang.Integer historyTimeType) {
        this.historyTimeType = historyTimeType;
    }

    /**
     * 获取 LOVB=PRC-C-0008
     */
    public java.lang.Integer getHistoryTimeType() {
        return this.historyTimeType;
    }

    /**
     * 设置 定价参考对象时间偏移量，如向前第3个帐期，则取值＝－3
     */
    public void setHistoryTimeDuration(java.lang.Integer historyTimeDuration) {
        this.historyTimeDuration = historyTimeDuration;
    }

    /**
     * 获取 定价参考对象时间偏移量，如向前第3个帐期，则取值＝－3
     */
    public java.lang.Integer getHistoryTimeDuration() {
        return this.historyTimeDuration;
    }

    /**
     * 设置 定价参考对象所属的周期时间对象。
     */
    public void setHistoryTimeQuantity(java.lang.Integer historyTimeQuantity) {
        this.historyTimeQuantity = historyTimeQuantity;
    }

    /**
     * 获取 定价参考对象所属的周期时间对象。
     */
    public java.lang.Integer getHistoryTimeQuantity() {
        return this.historyTimeQuantity;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
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
