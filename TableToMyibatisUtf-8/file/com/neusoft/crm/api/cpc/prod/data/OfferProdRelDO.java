package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表达销售品产品构成关系，全国统一格式。
 * @实体表  :OFFER_PROD_REL
 */
public class OfferProdRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_PROD_REL_S";

    /**
     * 销售品产品关联主键
     */
    public java.lang.Long offerProdRelId;

    /**
     * 记录表达同一个销售品功能产品构成适用的接入产品构成关系。
     */
    public java.lang.Long parOfferProdRelId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 产品ID的标识，主键
     */
    public java.lang.Integer prodId;

    /**
     * 销售品产品关系类型，LOVB=OFF-C-0004
     */
    public java.lang.String relType;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录产品的存在方式，LOVB=OFF-C-0027
     */
    public java.lang.String prodExistType;

    /**
     * 角色标识
     */
    public java.lang.Long roleId;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品产品关联主键
     */
    public void setOfferProdRelId(java.lang.Long offerProdRelId) {
        this.offerProdRelId = offerProdRelId;
    }

    /**
     * 获取 销售品产品关联主键
     */
    public java.lang.Long getOfferProdRelId() {
        return this.offerProdRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerProdRelId = SeqUtils.createLongId(ID_SEQ);
         return this.offerProdRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录表达同一个销售品功能产品构成适用的接入产品构成关系。
     */
    public void setParOfferProdRelId(java.lang.Long parOfferProdRelId) {
        this.parOfferProdRelId = parOfferProdRelId;
    }

    /**
     * 获取 记录表达同一个销售品功能产品构成适用的接入产品构成关系。
     */
    public java.lang.Long getParOfferProdRelId() {
        return this.parOfferProdRelId;
    }

    /**
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 产品ID的标识，主键
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品ID的标识，主键
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 销售品产品关系类型，LOVB=OFF-C-0004
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 销售品产品关系类型，LOVB=OFF-C-0004
     */
    public java.lang.String getRelType() {
        return this.relType;
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
     * 设置 记录产品的存在方式，LOVB=OFF-C-0027
     */
    public void setProdExistType(java.lang.String prodExistType) {
        this.prodExistType = prodExistType;
    }

    /**
     * 获取 记录产品的存在方式，LOVB=OFF-C-0027
     */
    public java.lang.String getProdExistType() {
        return this.prodExistType;
    }

    /**
     * 设置 角色标识
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色标识
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
