package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述销售品产品关联的关系，即销售品构成之间的关系：同产品关系、依赖等。
 * @实体表  :OFFER_COMP_REL_RSTR_CFG
 */
public class OfferCompRelRstrCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_COMP_REL_RSTR_CFG_S";

    /**
     * 销售品构成关联约束配置标识，主键。
     */
    public java.lang.Long offerCompRelRstrCfgId;

    /**
     * A端销售品产品关联主键
     */
    public java.lang.Long aOfferProdRelId;

    /**
     * Z端销售品产品关联主键
     */
    public java.lang.Long zOfferProdRelId;

    /**
     * 关系类型。LOVB=OFF-C-0016
     */
    public java.lang.String relType;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品构成关联约束配置标识，主键。
     */
    public void setOfferCompRelRstrCfgId(java.lang.Long offerCompRelRstrCfgId) {
        this.offerCompRelRstrCfgId = offerCompRelRstrCfgId;
    }

    /**
     * 获取 销售品构成关联约束配置标识，主键。
     */
    public java.lang.Long getOfferCompRelRstrCfgId() {
        return this.offerCompRelRstrCfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerCompRelRstrCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.offerCompRelRstrCfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 A端销售品产品关联主键
     */
    public void setAOfferProdRelId(java.lang.Long aOfferProdRelId) {
        this.aOfferProdRelId = aOfferProdRelId;
    }

    /**
     * 获取 A端销售品产品关联主键
     */
    public java.lang.Long getAOfferProdRelId() {
        return this.aOfferProdRelId;
    }

    /**
     * 设置 Z端销售品产品关联主键
     */
    public void setZOfferProdRelId(java.lang.Long zOfferProdRelId) {
        this.zOfferProdRelId = zOfferProdRelId;
    }

    /**
     * 获取 Z端销售品产品关联主键
     */
    public java.lang.Long getZOfferProdRelId() {
        return this.zOfferProdRelId;
    }

    /**
     * 设置 关系类型。LOVB=OFF-C-0016
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 关系类型。LOVB=OFF-C-0016
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间。
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
