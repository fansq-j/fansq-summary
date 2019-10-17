package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:将优惠结果值摊分给多个优惠应用对象。建议的摊分方法只支持：均分、按费用总额摊分、按总时长摊分等，不建议支持太多的摊分方式
 * @实体表  :DISCOUNT_REPATITION_TYPE
 */
public class DiscountRepatitionTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DISCOUNT_REPATITION_TYPE_S";

    /**
     * 优惠摊分方式的标识
     */
    public java.lang.Integer repatitionTypeId;

    /**
     * 摊分类型名称，如均分、按金额均分等
     */
    public java.lang.String repatitionTypeName;

    /**
     * 均分、按贡献比摊分、指定比例摊分等
            PRC-C-0024
     */
    public java.lang.Integer repatitionMethod;

    /**
     * 定价参考对象标识
     */
    public java.lang.Integer pricingRefObjectId;

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
     * 设置 优惠摊分方式的标识
     */
    public void setRepatitionTypeId(java.lang.Integer repatitionTypeId) {
        this.repatitionTypeId = repatitionTypeId;
    }

    /**
     * 获取 优惠摊分方式的标识
     */
    public java.lang.Integer getRepatitionTypeId() {
        return this.repatitionTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.repatitionTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.repatitionTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 摊分类型名称，如均分、按金额均分等
     */
    public void setRepatitionTypeName(java.lang.String repatitionTypeName) {
        this.repatitionTypeName = repatitionTypeName;
    }

    /**
     * 获取 摊分类型名称，如均分、按金额均分等
     */
    public java.lang.String getRepatitionTypeName() {
        return this.repatitionTypeName;
    }

    /**
     * 设置 均分、按贡献比摊分、指定比例摊分等
            PRC-C-0024
     */
    public void setRepatitionMethod(java.lang.Integer repatitionMethod) {
        this.repatitionMethod = repatitionMethod;
    }

    /**
     * 获取 均分、按贡献比摊分、指定比例摊分等
            PRC-C-0024
     */
    public java.lang.Integer getRepatitionMethod() {
        return this.repatitionMethod;
    }

    /**
     * 设置 定价参考对象标识
     */
    public void setPricingRefObjectId(java.lang.Integer pricingRefObjectId) {
        this.pricingRefObjectId = pricingRefObjectId;
    }

    /**
     * 获取 定价参考对象标识
     */
    public java.lang.Integer getPricingRefObjectId() {
        return this.pricingRefObjectId;
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
