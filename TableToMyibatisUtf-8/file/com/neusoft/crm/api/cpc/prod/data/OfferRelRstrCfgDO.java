package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:针对可选关系的销售品（可选包、促销）的默选和必选，按区域不同各自配置。表达“销售品关系”与“销售品产品构成”、“销售品产
 * @实体表  :OFFER_REL_RSTR_CFG
 */
public class OfferRelRstrCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_REL_RSTR_CFG_S";

    /**
     * 主键
     */
    public java.lang.Long offerRelRstrCfgId;

    /**
     * 关联关系标识，外键。
     */
    public java.lang.Long offerRelId;

    /**
     * 表达可选销售品的约束类型.LOVB=OFF-C-0005
     */
    public java.lang.String rstrType;

    /**
     * 关联关系的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 关联关系的失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long applyRegionId;

    /**
     * 关联销售品产品构成标识，表达“销售品关系”与“销售品产品构成”、“销售品产品构成角色”之间的关系。
     */
    public java.lang.Long rstrOfferProdRelId;

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
     * 设置 主键
     */
    public void setOfferRelRstrCfgId(java.lang.Long offerRelRstrCfgId) {
        this.offerRelRstrCfgId = offerRelRstrCfgId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getOfferRelRstrCfgId() {
        return this.offerRelRstrCfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerRelRstrCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.offerRelRstrCfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 关联关系标识，外键。
     */
    public void setOfferRelId(java.lang.Long offerRelId) {
        this.offerRelId = offerRelId;
    }

    /**
     * 获取 关联关系标识，外键。
     */
    public java.lang.Long getOfferRelId() {
        return this.offerRelId;
    }

    /**
     * 设置 表达可选销售品的约束类型.LOVB=OFF-C-0005
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 表达可选销售品的约束类型.LOVB=OFF-C-0005
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 关联关系的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 关联关系的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 关联关系的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 关联关系的失效时间。
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
     * 设置 关联销售品产品构成标识，表达“销售品关系”与“销售品产品构成”、“销售品产品构成角色”之间的关系。
     */
    public void setRstrOfferProdRelId(java.lang.Long rstrOfferProdRelId) {
        this.rstrOfferProdRelId = rstrOfferProdRelId;
    }

    /**
     * 获取 关联销售品产品构成标识，表达“销售品关系”与“销售品产品构成”、“销售品产品构成角色”之间的关系。
     */
    public java.lang.Long getRstrOfferProdRelId() {
        return this.rstrOfferProdRelId;
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
