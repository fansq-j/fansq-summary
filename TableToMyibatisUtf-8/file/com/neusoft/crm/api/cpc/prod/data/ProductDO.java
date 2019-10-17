package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指电信企业可销售给客户，利用企业资源提供的实物或通信功能、信息、服务的单元。
 * @实体表  :PRODUCT
 */
public class ProductDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRODUCT_S";

    /**
     * 产品的标识，主键
     */
    public java.lang.Integer prodId;

    /**
     * 记录产品的业务编码。
     */
    public java.lang.String prodNbr;

    /**
     * 记录产品的系统编码，用于IT内部使用。与原来的EXT_PROD_ID相对应。
     */
    public java.lang.String prodSysNbr;

    /**
     * 记录产品名称。
     */
    public java.lang.String prodName;

    /**
     * 记录产品描述。
     */
    public java.lang.String prodDesc;

    /**
     * 产品管理级别。LOVB=PRD-0005
     */
    public java.lang.String manageGrade;

    /**
     * 产品大类
     */
    public java.lang.Integer netType;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效日期。
     */
    public java.util.Date expDate;

    /**
     * 产品构成类型。LOVB=PRD-0003。
     */
    public java.lang.String prodCompType;

    /**
     * 产品功能类型。LOVB=PRD-0004。
            
     */
    public java.lang.String prodFuncType;

    /**
     * 产品IT分类，与产品功能分类相比，IT分类更面向IT系统实现；LOVB=PRD-C-0001
     */
    public java.lang.String billProdType;

    /**
     * 产品使用类型：
            主：代表产品只能作为主产品存在；
            附：代表产品只能作为附属产品存在；
            主附并存：代表产品既可作为主产品又可以作为附属产品存在。LOVB=PRD-C-0002
     */
    public java.lang.String prodUseType;

    /**
     * 指定产品的基础销售品标识，一个产品对应唯一对应一个基础销售品；
            
     */
    public java.lang.Integer baseOfferId;

    /**
     * 记录产品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long manageRegionId;

    /**
     * 记录产品状态编码。LOVB=PRD-0006
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 对于产品名称比较专业、复杂的，可以通过别名来简单命名；
            一般用于票据打印、对外查询的场景。
     */
    public java.lang.String aliasName;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 产品的标识，主键
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品的标识，主键
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.prodId = SeqUtils.createIntegerId(ID_SEQ);
         return this.prodId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录产品的业务编码。
     */
    public void setProdNbr(java.lang.String prodNbr) {
        this.prodNbr = prodNbr;
    }

    /**
     * 获取 记录产品的业务编码。
     */
    public java.lang.String getProdNbr() {
        return this.prodNbr;
    }

    /**
     * 设置 记录产品的系统编码，用于IT内部使用。与原来的EXT_PROD_ID相对应。
     */
    public void setProdSysNbr(java.lang.String prodSysNbr) {
        this.prodSysNbr = prodSysNbr;
    }

    /**
     * 获取 记录产品的系统编码，用于IT内部使用。与原来的EXT_PROD_ID相对应。
     */
    public java.lang.String getProdSysNbr() {
        return this.prodSysNbr;
    }

    /**
     * 设置 记录产品名称。
     */
    public void setProdName(java.lang.String prodName) {
        this.prodName = prodName;
    }

    /**
     * 获取 记录产品名称。
     */
    public java.lang.String getProdName() {
        return this.prodName;
    }

    /**
     * 设置 记录产品描述。
     */
    public void setProdDesc(java.lang.String prodDesc) {
        this.prodDesc = prodDesc;
    }

    /**
     * 获取 记录产品描述。
     */
    public java.lang.String getProdDesc() {
        return this.prodDesc;
    }

    /**
     * 设置 产品管理级别。LOVB=PRD-0005
     */
    public void setManageGrade(java.lang.String manageGrade) {
        this.manageGrade = manageGrade;
    }

    /**
     * 获取 产品管理级别。LOVB=PRD-0005
     */
    public java.lang.String getManageGrade() {
        return this.manageGrade;
    }

    /**
     * 设置 产品大类
     */
    public void setNetType(java.lang.Integer netType) {
        this.netType = netType;
    }

    /**
     * 获取 产品大类
     */
    public java.lang.Integer getNetType() {
        return this.netType;
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
     * 设置 产品构成类型。LOVB=PRD-0003。
     */
    public void setProdCompType(java.lang.String prodCompType) {
        this.prodCompType = prodCompType;
    }

    /**
     * 获取 产品构成类型。LOVB=PRD-0003。
     */
    public java.lang.String getProdCompType() {
        return this.prodCompType;
    }

    /**
     * 设置 产品功能类型。LOVB=PRD-0004。
            
     */
    public void setProdFuncType(java.lang.String prodFuncType) {
        this.prodFuncType = prodFuncType;
    }

    /**
     * 获取 产品功能类型。LOVB=PRD-0004。
            
     */
    public java.lang.String getProdFuncType() {
        return this.prodFuncType;
    }

    /**
     * 设置 产品IT分类，与产品功能分类相比，IT分类更面向IT系统实现；LOVB=PRD-C-0001
     */
    public void setBillProdType(java.lang.String billProdType) {
        this.billProdType = billProdType;
    }

    /**
     * 获取 产品IT分类，与产品功能分类相比，IT分类更面向IT系统实现；LOVB=PRD-C-0001
     */
    public java.lang.String getBillProdType() {
        return this.billProdType;
    }

    /**
     * 设置 产品使用类型：
            主：代表产品只能作为主产品存在；
            附：代表产品只能作为附属产品存在；
            主附并存：代表产品既可作为主产品又可以作为附属产品存在。LOVB=PRD-C-0002
     */
    public void setProdUseType(java.lang.String prodUseType) {
        this.prodUseType = prodUseType;
    }

    /**
     * 获取 产品使用类型：
            主：代表产品只能作为主产品存在；
            附：代表产品只能作为附属产品存在；
            主附并存：代表产品既可作为主产品又可以作为附属产品存在。LOVB=PRD-C-0002
     */
    public java.lang.String getProdUseType() {
        return this.prodUseType;
    }

    /**
     * 设置 指定产品的基础销售品标识，一个产品对应唯一对应一个基础销售品；
            
     */
    public void setBaseOfferId(java.lang.Integer baseOfferId) {
        this.baseOfferId = baseOfferId;
    }

    /**
     * 获取 指定产品的基础销售品标识，一个产品对应唯一对应一个基础销售品；
            
     */
    public java.lang.Integer getBaseOfferId() {
        return this.baseOfferId;
    }

    /**
     * 设置 记录产品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录产品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
    }

    /**
     * 设置 记录产品状态编码。LOVB=PRD-0006
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录产品状态编码。LOVB=PRD-0006
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工。
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
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
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
     * 设置 对于产品名称比较专业、复杂的，可以通过别名来简单命名；
            一般用于票据打印、对外查询的场景。
     */
    public void setAliasName(java.lang.String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * 获取 对于产品名称比较专业、复杂的，可以通过别名来简单命名；
            一般用于票据打印、对外查询的场景。
     */
    public java.lang.String getAliasName() {
        return this.aliasName;
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
