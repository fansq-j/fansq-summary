package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:品牌是一种名称、术语、标记、符号或图案，或是它们的相互组合，用以识别企业提供给某个或某群消费者的产品或服务，并使之与竞争
 * @实体表  :BRAND
 */
public class BrandDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BRAND_S";

    /**
     * 品牌的标识,主键
     */
    public java.lang.Long brandId;

    /**
     * 记录品牌的编码
     */
    public java.lang.String brandCode;

    /**
     * 记录品牌的类型
     */
    public java.lang.String brandType;

    /**
     * 记录品牌的名称
     */
    public java.lang.String brandName;

    /**
     * 记录品牌的详细描述
     */
    public java.lang.String brandDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 品牌的标识,主键
     */
    public void setBrandId(java.lang.Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取 品牌的标识,主键
     */
    public java.lang.Long getBrandId() {
        return this.brandId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.brandId = SeqUtils.createLongId(ID_SEQ);
         return this.brandId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录品牌的编码
     */
    public void setBrandCode(java.lang.String brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * 获取 记录品牌的编码
     */
    public java.lang.String getBrandCode() {
        return this.brandCode;
    }

    /**
     * 设置 记录品牌的类型
     */
    public void setBrandType(java.lang.String brandType) {
        this.brandType = brandType;
    }

    /**
     * 获取 记录品牌的类型
     */
    public java.lang.String getBrandType() {
        return this.brandType;
    }

    /**
     * 设置 记录品牌的名称
     */
    public void setBrandName(java.lang.String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取 记录品牌的名称
     */
    public java.lang.String getBrandName() {
        return this.brandName;
    }

    /**
     * 设置 记录品牌的详细描述
     */
    public void setBrandDesc(java.lang.String brandDesc) {
        this.brandDesc = brandDesc;
    }

    /**
     * 获取 记录品牌的详细描述
     */
    public java.lang.String getBrandDesc() {
        return this.brandDesc;
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
