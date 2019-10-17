package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品实例与营销类资源实例的关联。
 * @实体表  :PROD_RES_INST_REL
 */
public class ProdResInstRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_RES_INST_REL_S";

    /**
     * 记录关系标识，主键。
     */
    public java.lang.Long prodResInstRelId;

    /**
     * 记录产品实例标识，外键。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录营销资源类型，LOVB=RES-0003
     */
    public java.lang.String mktResType;

    /**
     * 记录营销资源实例标识，外键。根据营销资源标识，指向不同的营销资源实例实体。
     */
    public java.lang.Long mktResInstId;

    /**
     * 记录营销资源标识，外键。
     */
    public java.lang.Integer mktResId;

    /**
     * 记录产品实例和营销类资源实例的关联方式。LOVB=PRI-C-0024
     */
    public java.lang.String relType;

    /**
     * 记录终端的使用类型，LOVB=PRI-C-0010
     */
    public java.lang.String propertyType;

    /**
     * 记录营销资源数量。
     */
    public java.lang.Integer mktResNum;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 状态修改的时间。
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
     * 设置 记录关系标识，主键。
     */
    public void setProdResInstRelId(java.lang.Long prodResInstRelId) {
        this.prodResInstRelId = prodResInstRelId;
    }

    /**
     * 获取 记录关系标识，主键。
     */
    public java.lang.Long getProdResInstRelId() {
        return this.prodResInstRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodResInstRelId = SeqUtils.createLongId(ID_SEQ);
         return this.prodResInstRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录产品实例标识，外键。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识，外键。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录营销资源类型，LOVB=RES-0003
     */
    public void setMktResType(java.lang.String mktResType) {
        this.mktResType = mktResType;
    }

    /**
     * 获取 记录营销资源类型，LOVB=RES-0003
     */
    public java.lang.String getMktResType() {
        return this.mktResType;
    }

    /**
     * 设置 记录营销资源实例标识，外键。根据营销资源标识，指向不同的营销资源实例实体。
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 记录营销资源实例标识，外键。根据营销资源标识，指向不同的营销资源实例实体。
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 记录营销资源标识，外键。
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 记录营销资源标识，外键。
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 记录产品实例和营销类资源实例的关联方式。LOVB=PRI-C-0024
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录产品实例和营销类资源实例的关联方式。LOVB=PRI-C-0024
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录终端的使用类型，LOVB=PRI-C-0010
     */
    public void setPropertyType(java.lang.String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * 获取 记录终端的使用类型，LOVB=PRI-C-0010
     */
    public java.lang.String getPropertyType() {
        return this.propertyType;
    }

    /**
     * 设置 记录营销资源数量。
     */
    public void setMktResNum(java.lang.Integer mktResNum) {
        this.mktResNum = mktResNum;
    }

    /**
     * 获取 记录营销资源数量。
     */
    public java.lang.Integer getMktResNum() {
        return this.mktResNum;
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
     * 设置 状态修改的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间。
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
