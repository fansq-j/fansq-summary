package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:产品与营销资源的关联
 * @实体表  :PROD_RES_REL
 */
public class ProdResRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_RES_REL_S";

    /**
     * 
     */
    public java.lang.Long prodResRelId;

    /**
     * 
     */
    public java.lang.Integer prodId;

    /**
     * 
     */
    public java.lang.Integer mktResId;

    /**
     * 产品和营销资源的关联方式。LOVB=PRD-0008
     */
    public java.lang.String relType;

    /**
     * 营销资源类型，冗余字段；LOVB=RES-0003
     */
    public java.lang.String mktResType;

    /**
     * 记录终端的使用类型：自备、租用、购买等。LOVB=PRD-C-0005
            
     */
    public java.lang.String propertyType;

    /**
     * 
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 
     */
    public java.lang.Long createStaff;

    /**
     * 
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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 
     */
    public void setProdResRelId(java.lang.Long prodResRelId) {
        this.prodResRelId = prodResRelId;
    }

    /**
     * 获取 
     */
    public java.lang.Long getProdResRelId() {
        return this.prodResRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodResRelId = SeqUtils.createLongId(ID_SEQ);
         return this.prodResRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 产品和营销资源的关联方式。LOVB=PRD-0008
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 产品和营销资源的关联方式。LOVB=PRD-0008
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 营销资源类型，冗余字段；LOVB=RES-0003
     */
    public void setMktResType(java.lang.String mktResType) {
        this.mktResType = mktResType;
    }

    /**
     * 获取 营销资源类型，冗余字段；LOVB=RES-0003
     */
    public java.lang.String getMktResType() {
        return this.mktResType;
    }

    /**
     * 设置 记录终端的使用类型：自备、租用、购买等。LOVB=PRD-C-0005
            
     */
    public void setPropertyType(java.lang.String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * 获取 记录终端的使用类型：自备、租用、购买等。LOVB=PRD-C-0005
            
     */
    public java.lang.String getPropertyType() {
        return this.propertyType;
    }

    /**
     * 设置 
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 
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
     * 设置 
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
