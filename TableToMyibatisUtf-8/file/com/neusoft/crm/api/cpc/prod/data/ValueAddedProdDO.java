package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录增值产品基本信息
 * @实体表  :VALUE_ADDED_PROD
 */
public class ValueAddedProdDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VALUE_ADDED_PROD_S";

    /**
     * 增值产品的标识，主键
     */
    public java.lang.Long vaProdId;

    /**
     * 记录增值产品业务编码。
     */
    public java.lang.String prodNbr;

    /**
     * 记录增值产品产品名称。
     */
    public java.lang.String prodName;

    /**
     * 记录增值产品产品描述。
     */
    public java.lang.String prodDesc;

    /**
     * 增值产品的英文名称。
     */
    public java.lang.String prodEnName;

    /**
     * 增值产品的英文描述。
     */
    public java.lang.String prodEnDesc;

    /**
     * 记录增值产品管理级别。LOVB=PRD-0005
     */
    public java.lang.String manageGrade;

    /**
     * 增值产品的功能类型。LOVB=PRD-0004
     */
    public java.lang.String prodFuncType;

    /**
     * 增值产品构成类型。LOVB=PRD-C-0008。
     */
    public java.lang.String prodCompType;

    /**
     * 增值产品使用类型。LOVB=PRD-C-0009
     */
    public java.lang.String prodUseType;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效日期。
     */
    public java.util.Date expDate;

    /**
     * 用于配置数据来源，例是否由PPM同步来的配置数据。LOVB=PRD-C-0010
     */
    public java.lang.String dataSource;

    /**
     * 记录增值产品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long manageRegionId;

    /**
     * 记录增值产品状态。
            LOVB=PRD-0006
            
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
     * 设置 增值产品的标识，主键
     */
    public void setVaProdId(java.lang.Long vaProdId) {
        this.vaProdId = vaProdId;
    }

    /**
     * 获取 增值产品的标识，主键
     */
    public java.lang.Long getVaProdId() {
        return this.vaProdId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vaProdId = SeqUtils.createLongId(ID_SEQ);
         return this.vaProdId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录增值产品业务编码。
     */
    public void setProdNbr(java.lang.String prodNbr) {
        this.prodNbr = prodNbr;
    }

    /**
     * 获取 记录增值产品业务编码。
     */
    public java.lang.String getProdNbr() {
        return this.prodNbr;
    }

    /**
     * 设置 记录增值产品产品名称。
     */
    public void setProdName(java.lang.String prodName) {
        this.prodName = prodName;
    }

    /**
     * 获取 记录增值产品产品名称。
     */
    public java.lang.String getProdName() {
        return this.prodName;
    }

    /**
     * 设置 记录增值产品产品描述。
     */
    public void setProdDesc(java.lang.String prodDesc) {
        this.prodDesc = prodDesc;
    }

    /**
     * 获取 记录增值产品产品描述。
     */
    public java.lang.String getProdDesc() {
        return this.prodDesc;
    }

    /**
     * 设置 增值产品的英文名称。
     */
    public void setProdEnName(java.lang.String prodEnName) {
        this.prodEnName = prodEnName;
    }

    /**
     * 获取 增值产品的英文名称。
     */
    public java.lang.String getProdEnName() {
        return this.prodEnName;
    }

    /**
     * 设置 增值产品的英文描述。
     */
    public void setProdEnDesc(java.lang.String prodEnDesc) {
        this.prodEnDesc = prodEnDesc;
    }

    /**
     * 获取 增值产品的英文描述。
     */
    public java.lang.String getProdEnDesc() {
        return this.prodEnDesc;
    }

    /**
     * 设置 记录增值产品管理级别。LOVB=PRD-0005
     */
    public void setManageGrade(java.lang.String manageGrade) {
        this.manageGrade = manageGrade;
    }

    /**
     * 获取 记录增值产品管理级别。LOVB=PRD-0005
     */
    public java.lang.String getManageGrade() {
        return this.manageGrade;
    }

    /**
     * 设置 增值产品的功能类型。LOVB=PRD-0004
     */
    public void setProdFuncType(java.lang.String prodFuncType) {
        this.prodFuncType = prodFuncType;
    }

    /**
     * 获取 增值产品的功能类型。LOVB=PRD-0004
     */
    public java.lang.String getProdFuncType() {
        return this.prodFuncType;
    }

    /**
     * 设置 增值产品构成类型。LOVB=PRD-C-0008。
     */
    public void setProdCompType(java.lang.String prodCompType) {
        this.prodCompType = prodCompType;
    }

    /**
     * 获取 增值产品构成类型。LOVB=PRD-C-0008。
     */
    public java.lang.String getProdCompType() {
        return this.prodCompType;
    }

    /**
     * 设置 增值产品使用类型。LOVB=PRD-C-0009
     */
    public void setProdUseType(java.lang.String prodUseType) {
        this.prodUseType = prodUseType;
    }

    /**
     * 获取 增值产品使用类型。LOVB=PRD-C-0009
     */
    public java.lang.String getProdUseType() {
        return this.prodUseType;
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
     * 设置 用于配置数据来源，例是否由PPM同步来的配置数据。LOVB=PRD-C-0010
     */
    public void setDataSource(java.lang.String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取 用于配置数据来源，例是否由PPM同步来的配置数据。LOVB=PRD-C-0010
     */
    public java.lang.String getDataSource() {
        return this.dataSource;
    }

    /**
     * 设置 记录增值产品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录增值产品的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
    }

    /**
     * 设置 记录增值产品状态。
            LOVB=PRD-0006
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录增值产品状态。
            LOVB=PRD-0006
            
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
