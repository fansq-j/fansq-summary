package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:关联产品和服务提供的关系信息
如：
    固定电话，用新装、拆机、移机、过户等服务提供
 * @实体表  :PROD_SERVICE_OFFER_REL
 */
public class ProdServiceOfferRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_SERVICE_OFFER_REL_S";

    /**
     * 产品服务提供关系标识
     */
    public java.lang.Long prodServiceRelId;

    /**
     * 产品的标识，主键。
     */
    public java.lang.Integer prodId;

    /**
     * 服务提供标识
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long applyRegionId;

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
     * 设置 产品服务提供关系标识
     */
    public void setProdServiceRelId(java.lang.Long prodServiceRelId) {
        this.prodServiceRelId = prodServiceRelId;
    }

    /**
     * 获取 产品服务提供关系标识
     */
    public java.lang.Long getProdServiceRelId() {
        return this.prodServiceRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodServiceRelId = SeqUtils.createLongId(ID_SEQ);
         return this.prodServiceRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 产品的标识，主键。
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品的标识，主键。
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 服务提供标识
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供标识
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用的区域范围，来源COMMON_REGION_ID。
            
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
