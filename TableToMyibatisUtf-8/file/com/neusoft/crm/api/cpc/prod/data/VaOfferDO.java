package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述增值产品类的销售品
 * @实体表  :VA_OFFER
 */
public class VaOfferDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VA_OFFER_S";

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Long vaOfferId;

    /**
     * 增值销售品类型：0：单增值销售品1：增值捆绑套餐 2：（传统+增值）捆绑套餐 9：非增值类销售品
            
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
     * 增值产品的英文名称。
     */
    public java.lang.String offerEnName;

    /**
     * 增值产品的英文描述。
     */
    public java.lang.String offerEnDesc;

    /**
     * 记录销售品业务编码。
     */
    public java.lang.String offerNbr;

    /**
     * 记录销售品系统编码。原集团EXT_PROD_OFFER_ID与其对应。
     */
    public java.lang.String offerSysNbr;

    /**
     * 记录销售品名称。
     */
    public java.lang.String offerDesc;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 01=本地网 02=省 03=集团
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
     * 品牌标识，外键，指向品牌实体【BRAND】
     */
    public java.lang.Long brandId;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录销售品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long manageRegionId;

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
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public void setVaOfferId(java.lang.Long vaOfferId) {
        this.vaOfferId = vaOfferId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Long getVaOfferId() {
        return this.vaOfferId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vaOfferId = SeqUtils.createLongId(ID_SEQ);
         return this.vaOfferId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 增值销售品类型：0：单增值销售品1：增值捆绑套餐 2：（传统+增值）捆绑套餐 9：非增值类销售品
            
     */
    public void setOfferType(java.lang.String offerType) {
        this.offerType = offerType;
    }

    /**
     * 获取 增值销售品类型：0：单增值销售品1：增值捆绑套餐 2：（传统+增值）捆绑套餐 9：非增值类销售品
            
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
     * 设置 增值产品的英文名称。
     */
    public void setOfferEnName(java.lang.String offerEnName) {
        this.offerEnName = offerEnName;
    }

    /**
     * 获取 增值产品的英文名称。
     */
    public java.lang.String getOfferEnName() {
        return this.offerEnName;
    }

    /**
     * 设置 增值产品的英文描述。
     */
    public void setOfferEnDesc(java.lang.String offerEnDesc) {
        this.offerEnDesc = offerEnDesc;
    }

    /**
     * 获取 增值产品的英文描述。
     */
    public java.lang.String getOfferEnDesc() {
        return this.offerEnDesc;
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
     * 设置 记录销售品系统编码。原集团EXT_PROD_OFFER_ID与其对应。
     */
    public void setOfferSysNbr(java.lang.String offerSysNbr) {
        this.offerSysNbr = offerSysNbr;
    }

    /**
     * 获取 记录销售品系统编码。原集团EXT_PROD_OFFER_ID与其对应。
     */
    public java.lang.String getOfferSysNbr() {
        return this.offerSysNbr;
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
     * 设置 01=本地网 02=省 03=集团
     */
    public void setManageGrade(java.lang.String manageGrade) {
        this.manageGrade = manageGrade;
    }

    /**
     * 获取 01=本地网 02=省 03=集团
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
     * 设置 品牌标识，外键，指向品牌实体【BRAND】
     */
    public void setBrandId(java.lang.Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取 品牌标识，外键，指向品牌实体【BRAND】
     */
    public java.lang.Long getBrandId() {
        return this.brandId;
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
     * 设置 记录销售品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录销售品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
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

}
