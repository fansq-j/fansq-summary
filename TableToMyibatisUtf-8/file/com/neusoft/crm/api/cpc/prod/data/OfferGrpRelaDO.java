package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表达销售品与销售品互斥，销售品与销售品组互斥，销售组与销售品组互斥。
 * @实体表  :OFFER_GRP_RELA
 */
public class OfferGrpRelaDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_GRP_RELA_S";

    /**
     * 销售品与销售品组关系标识，主键。
     */
    public java.lang.Long offerGrpRelId;

    /**
     * A端销售品组标识
     */
    public java.lang.Long aId;

    /**
     * A端类型，LOVB=OFF-C-0049
     */
    public java.lang.String aType;

    /**
     * Z端销售品组标识
     */
    public java.lang.Long zId;

    /**
     * Z端类型，LOVB=OFF-C-0050
     */
    public java.lang.String zType;

    /**
     * 销售品与销售品组关系类型,LOVB=OFF-C-0051
     */
    public java.lang.String relType;

    /**
     * 记录缺省值。
     */
    public java.util.Date effDate;

    /**
     * 记录最小值。
     */
    public java.util.Date expDate;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long applyRegionId;

    /**
     * 状态。LOVB=PUB-C-0001。
            
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
     * 设置 销售品与销售品组关系标识，主键。
     */
    public void setOfferGrpRelId(java.lang.Long offerGrpRelId) {
        this.offerGrpRelId = offerGrpRelId;
    }

    /**
     * 获取 销售品与销售品组关系标识，主键。
     */
    public java.lang.Long getOfferGrpRelId() {
        return this.offerGrpRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerGrpRelId = SeqUtils.createLongId(ID_SEQ);
         return this.offerGrpRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 A端销售品组标识
     */
    public void setAId(java.lang.Long aId) {
        this.aId = aId;
    }

    /**
     * 获取 A端销售品组标识
     */
    public java.lang.Long getAId() {
        return this.aId;
    }

    /**
     * 设置 A端类型，LOVB=OFF-C-0049
     */
    public void setAType(java.lang.String aType) {
        this.aType = aType;
    }

    /**
     * 获取 A端类型，LOVB=OFF-C-0049
     */
    public java.lang.String getAType() {
        return this.aType;
    }

    /**
     * 设置 Z端销售品组标识
     */
    public void setZId(java.lang.Long zId) {
        this.zId = zId;
    }

    /**
     * 获取 Z端销售品组标识
     */
    public java.lang.Long getZId() {
        return this.zId;
    }

    /**
     * 设置 Z端类型，LOVB=OFF-C-0050
     */
    public void setZType(java.lang.String zType) {
        this.zType = zType;
    }

    /**
     * 获取 Z端类型，LOVB=OFF-C-0050
     */
    public java.lang.String getZType() {
        return this.zType;
    }

    /**
     * 设置 销售品与销售品组关系类型,LOVB=OFF-C-0051
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 销售品与销售品组关系类型,LOVB=OFF-C-0051
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录缺省值。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录缺省值。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录最小值。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录最小值。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 状态。LOVB=PUB-C-0001。
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001。
            
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

}
