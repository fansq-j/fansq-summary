package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营销资源某一属性的枚举取值，如颜色属性可能有黑、白、红等
 * @实体表  :MKT_PRICING_ENUM_PARAM
 */
public class MktPricingEnumParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_PRICING_ENUM_PARAM_S";

    /**
     * 营销资源属性离散取值的标识，主键
     */
    public java.lang.Integer enumId;

    /**
     * 营销资源属性标识
     */
    public java.lang.Integer pricingAttrId;

    /**
     * 营销资源属性离散取值的具体数值
     */
    public java.lang.String attrValue;

    /**
     * 该取值是否为默认取值.LOVB=PRC-C-0036.
     */
    public java.lang.Integer isDefault;

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
     * 设置 营销资源属性离散取值的标识，主键
     */
    public void setEnumId(java.lang.Integer enumId) {
        this.enumId = enumId;
    }

    /**
     * 获取 营销资源属性离散取值的标识，主键
     */
    public java.lang.Integer getEnumId() {
        return this.enumId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.enumId = SeqUtils.createIntegerId(ID_SEQ);
         return this.enumId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 营销资源属性标识
     */
    public void setPricingAttrId(java.lang.Integer pricingAttrId) {
        this.pricingAttrId = pricingAttrId;
    }

    /**
     * 获取 营销资源属性标识
     */
    public java.lang.Integer getPricingAttrId() {
        return this.pricingAttrId;
    }

    /**
     * 设置 营销资源属性离散取值的具体数值
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 营销资源属性离散取值的具体数值
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 该取值是否为默认取值.LOVB=PRC-C-0036.
     */
    public void setIsDefault(java.lang.Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取 该取值是否为默认取值.LOVB=PRC-C-0036.
     */
    public java.lang.Integer getIsDefault() {
        return this.isDefault;
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
