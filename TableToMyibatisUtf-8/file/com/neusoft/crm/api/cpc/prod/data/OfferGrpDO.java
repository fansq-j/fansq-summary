package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录销售品的应用分组，简化配置要求。
 * @实体表  :OFFER_GRP
 */
public class OfferGrpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_GRP_S";

    /**
     * 销售品分组标识，主键。
     */
    public java.lang.Long offerGrpId;

    /**
     * 记录产品的业务编码。
     */
    public java.lang.String offerGrpNbr;

    /**
     * 销售品组名称
     */
    public java.lang.String offerGrpName;

    /**
     * 销售品组描述
     */
    public java.lang.String offerGrpDesc;

    /**
     * 类型划分：互斥组、续约组等，LOVB=OFF-C-0045
     */
    public java.lang.String grpRelType;

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
     * 表达是否自定义组，或者直接关联目录ID，LOVB=OFF-C-0046
     */
    public java.lang.String grpType;

    /**
     * 销售品目录节点ID
     */
    public java.lang.Long catalogItemId;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品分组标识，主键。
     */
    public void setOfferGrpId(java.lang.Long offerGrpId) {
        this.offerGrpId = offerGrpId;
    }

    /**
     * 获取 销售品分组标识，主键。
     */
    public java.lang.Long getOfferGrpId() {
        return this.offerGrpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerGrpId = SeqUtils.createLongId(ID_SEQ);
         return this.offerGrpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录产品的业务编码。
     */
    public void setOfferGrpNbr(java.lang.String offerGrpNbr) {
        this.offerGrpNbr = offerGrpNbr;
    }

    /**
     * 获取 记录产品的业务编码。
     */
    public java.lang.String getOfferGrpNbr() {
        return this.offerGrpNbr;
    }

    /**
     * 设置 销售品组名称
     */
    public void setOfferGrpName(java.lang.String offerGrpName) {
        this.offerGrpName = offerGrpName;
    }

    /**
     * 获取 销售品组名称
     */
    public java.lang.String getOfferGrpName() {
        return this.offerGrpName;
    }

    /**
     * 设置 销售品组描述
     */
    public void setOfferGrpDesc(java.lang.String offerGrpDesc) {
        this.offerGrpDesc = offerGrpDesc;
    }

    /**
     * 获取 销售品组描述
     */
    public java.lang.String getOfferGrpDesc() {
        return this.offerGrpDesc;
    }

    /**
     * 设置 类型划分：互斥组、续约组等，LOVB=OFF-C-0045
     */
    public void setGrpRelType(java.lang.String grpRelType) {
        this.grpRelType = grpRelType;
    }

    /**
     * 获取 类型划分：互斥组、续约组等，LOVB=OFF-C-0045
     */
    public java.lang.String getGrpRelType() {
        return this.grpRelType;
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
     * 设置 表达是否自定义组，或者直接关联目录ID，LOVB=OFF-C-0046
     */
    public void setGrpType(java.lang.String grpType) {
        this.grpType = grpType;
    }

    /**
     * 获取 表达是否自定义组，或者直接关联目录ID，LOVB=OFF-C-0046
     */
    public java.lang.String getGrpType() {
        return this.grpType;
    }

    /**
     * 设置 销售品目录节点ID
     */
    public void setCatalogItemId(java.lang.Long catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    /**
     * 获取 销售品目录节点ID
     */
    public java.lang.Long getCatalogItemId() {
        return this.catalogItemId;
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
