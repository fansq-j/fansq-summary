package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营销资源适用地区。
 * @实体表  :MKT_RES_REGION
 */
public class MktResRegionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_REGION_S";

    /**
     * 记录营销资源适用地区标识。
     */
    public java.lang.Long mktResRegionId;

    /**
     * 营销资源标识
     */
    public java.lang.Integer mktResId;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录营销资源的成本价格。
     */
    public java.lang.Long costPrice;

    /**
     * 记录建议的零售价格。
     */
    public java.lang.Long salesPrice;

    /**
     * 记录建议的结算价格。
     */
    public java.lang.Long clearingPrice;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 记录营销资源适用地区标识。
     */
    public void setMktResRegionId(java.lang.Long mktResRegionId) {
        this.mktResRegionId = mktResRegionId;
    }

    /**
     * 获取 记录营销资源适用地区标识。
     */
    public java.lang.Long getMktResRegionId() {
        return this.mktResRegionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResRegionId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResRegionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源标识
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 营销资源标识
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
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
     * 设置 记录营销资源的成本价格。
     */
    public void setCostPrice(java.lang.Long costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 获取 记录营销资源的成本价格。
     */
    public java.lang.Long getCostPrice() {
        return this.costPrice;
    }

    /**
     * 设置 记录建议的零售价格。
     */
    public void setSalesPrice(java.lang.Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * 获取 记录建议的零售价格。
     */
    public java.lang.Long getSalesPrice() {
        return this.salesPrice;
    }

    /**
     * 设置 记录建议的结算价格。
     */
    public void setClearingPrice(java.lang.Long clearingPrice) {
        this.clearingPrice = clearingPrice;
    }

    /**
     * 获取 记录建议的结算价格。
     */
    public java.lang.Long getClearingPrice() {
        return this.clearingPrice;
    }

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
