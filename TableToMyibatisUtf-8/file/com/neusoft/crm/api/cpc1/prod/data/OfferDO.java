package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品是中国电信以营销为目的，按照一定的市场策略，对产品进行组合、定价、包装后形成的可直接提供给客户选择的销售单元
                          -
 * @实体表  :OFFER
 */
public class OfferDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_S";

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * LOVB=OFF-0005
     */
    public java.lang.String offerType;

    /**
     * 记录内部的系统分类，如可选包分单接入、多接入等对销售品类型更进一步的划分。LOVB=OFF-C-0064
     */
    public java.lang.String offerSysType;

    /**
     * 记录市场部定义的销售品名称，通常用于宣传口径。
     */
    public java.lang.String offerName;

    /**
     * 记录IT内部的销售品名称，通常包括：上市年月+销售品名称+资费等内容。
     */
    public java.lang.String offerSysName;

    /**
     * 记录IT内部的销售品名称的拼音缩写。
     */
    public java.lang.String offerSysPyName;

    /**
     * 记录销售品业务编码。
     */
    public java.lang.String offerNbr;

    /**
     * 记录销售品外部标识。与原集团EXT_PROD_OFFER_ID与其对应。
     */
    public java.lang.String extOfferId;

    /**
     * 记录销售品名称。
     */
    public java.lang.String offerDesc;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录销售品的管理级别，LOVB=OFF-0004
     */
    public java.lang.String manageGrade;

    /**
     * 记录失效日期。
     */
    public java.util.Date expDate;

    /**
     * 记录销售品管理部门信息。
     */
    public java.lang.String offerProviderId;

    /**
     * 
     */
    public java.lang.Long brandId;

    /**
     * 增值销售品类型，LOVB=OFF-C-0057
            
     */
    public java.lang.String valueAddedFlag;

    /**
     * 销售品初始信用额度
     */
    public java.lang.Integer initialCredValue;

    /**
     * 定价计划标识
     */
    public java.lang.Integer pricingPlanId;

    /**
     * 可独立订购标记，LOVB=OFF-C-0029
     */
    public java.lang.String isIndependent;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 
     */
    public java.lang.Long manageRegionId;

    /**
     * 记录销售品状态,LOVB=OFF-0003
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
     * 
     */
    public java.lang.Integer ifGrp;

    /**
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套餐，3-基础销售品，0-品牌类销售品
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.offerId = SeqUtils.createIntegerId(ID_SEQ);
         return this.offerId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 LOVB=OFF-0005
     */
    public void setOfferType(java.lang.String offerType) {
        this.offerType = offerType;
    }

    /**
     * 获取 LOVB=OFF-0005
     */
    public java.lang.String getOfferType() {
        return this.offerType;
    }

    /**
     * 设置 记录内部的系统分类，如可选包分单接入、多接入等对销售品类型更进一步的划分。LOVB=OFF-C-0064
     */
    public void setOfferSysType(java.lang.String offerSysType) {
        this.offerSysType = offerSysType;
    }

    /**
     * 获取 记录内部的系统分类，如可选包分单接入、多接入等对销售品类型更进一步的划分。LOVB=OFF-C-0064
     */
    public java.lang.String getOfferSysType() {
        return this.offerSysType;
    }

    /**
     * 设置 记录市场部定义的销售品名称，通常用于宣传口径。
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }

    /**
     * 获取 记录市场部定义的销售品名称，通常用于宣传口径。
     */
    public java.lang.String getOfferName() {
        return this.offerName;
    }

    /**
     * 设置 记录IT内部的销售品名称，通常包括：上市年月+销售品名称+资费等内容。
     */
    public void setOfferSysName(java.lang.String offerSysName) {
        this.offerSysName = offerSysName;
    }

    /**
     * 获取 记录IT内部的销售品名称，通常包括：上市年月+销售品名称+资费等内容。
     */
    public java.lang.String getOfferSysName() {
        return this.offerSysName;
    }

    /**
     * 设置 记录IT内部的销售品名称的拼音缩写。
     */
    public void setOfferSysPyName(java.lang.String offerSysPyName) {
        this.offerSysPyName = offerSysPyName;
    }

    /**
     * 获取 记录IT内部的销售品名称的拼音缩写。
     */
    public java.lang.String getOfferSysPyName() {
        return this.offerSysPyName;
    }

    /**
     * 设置 记录销售品业务编码。
     */
    public void setOfferNbr(java.lang.String offerNbr) {
        this.offerNbr = offerNbr;
    }

    /**
     * 获取 记录销售品业务编码。
     */
    public java.lang.String getOfferNbr() {
        return this.offerNbr;
    }

    /**
     * 设置 记录销售品外部标识。与原集团EXT_PROD_OFFER_ID与其对应。
     */
    public void setExtOfferId(java.lang.String extOfferId) {
        this.extOfferId = extOfferId;
    }

    /**
     * 获取 记录销售品外部标识。与原集团EXT_PROD_OFFER_ID与其对应。
     */
    public java.lang.String getExtOfferId() {
        return this.extOfferId;
    }

    /**
     * 设置 记录销售品名称。
     */
    public void setOfferDesc(java.lang.String offerDesc) {
        this.offerDesc = offerDesc;
    }

    /**
     * 获取 记录销售品名称。
     */
    public java.lang.String getOfferDesc() {
        return this.offerDesc;
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
     * 设置 记录销售品的管理级别，LOVB=OFF-0004
     */
    public void setManageGrade(java.lang.String manageGrade) {
        this.manageGrade = manageGrade;
    }

    /**
     * 获取 记录销售品的管理级别，LOVB=OFF-0004
     */
    public java.lang.String getManageGrade() {
        return this.manageGrade;
    }

    /**
     * 设置 记录失效日期。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效日期。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录销售品管理部门信息。
     */
    public void setOfferProviderId(java.lang.String offerProviderId) {
        this.offerProviderId = offerProviderId;
    }

    /**
     * 获取 记录销售品管理部门信息。
     */
    public java.lang.String getOfferProviderId() {
        return this.offerProviderId;
    }

    /**
     * 设置 
     */
    public void setBrandId(java.lang.Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取 
     */
    public java.lang.Long getBrandId() {
        return this.brandId;
    }

    /**
     * 设置 增值销售品类型，LOVB=OFF-C-0057
            
     */
    public void setValueAddedFlag(java.lang.String valueAddedFlag) {
        this.valueAddedFlag = valueAddedFlag;
    }

    /**
     * 获取 增值销售品类型，LOVB=OFF-C-0057
            
     */
    public java.lang.String getValueAddedFlag() {
        return this.valueAddedFlag;
    }

    /**
     * 设置 销售品初始信用额度
     */
    public void setInitialCredValue(java.lang.Integer initialCredValue) {
        this.initialCredValue = initialCredValue;
    }

    /**
     * 获取 销售品初始信用额度
     */
    public java.lang.Integer getInitialCredValue() {
        return this.initialCredValue;
    }

    /**
     * 设置 定价计划标识
     */
    public void setPricingPlanId(java.lang.Integer pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    /**
     * 获取 定价计划标识
     */
    public java.lang.Integer getPricingPlanId() {
        return this.pricingPlanId;
    }

    /**
     * 设置 可独立订购标记，LOVB=OFF-C-0029
     */
    public void setIsIndependent(java.lang.String isIndependent) {
        this.isIndependent = isIndependent;
    }

    /**
     * 获取 可独立订购标记，LOVB=OFF-C-0029
     */
    public java.lang.String getIsIndependent() {
        return this.isIndependent;
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

    /**
     * 设置 
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
    }

    /**
     * 设置 记录销售品状态,LOVB=OFF-0003
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录销售品状态,LOVB=OFF-0003
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
     * 设置 
     */
    public void setIfGrp(java.lang.Integer ifGrp) {
        this.ifGrp = ifGrp;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getIfGrp() {
        return this.ifGrp;
    }

}
