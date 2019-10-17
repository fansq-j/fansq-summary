package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述：为便于营业快速受理某些可以打包的业务，带有推荐性的业务。
 * @实体表  :OFFER_PACKAGE
 */
public class OfferPackageDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_PACKAGE_S";

    /**
     * 礼包的数据库主键标识
     */
    public java.lang.Long offerPackageId;

    /**
     * 礼包的名称
     */
    public java.lang.String offerPackageName;

    /**
     * 礼包描述
     */
    public java.lang.String offerPkgDesc;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

    /**
     * 管理级别。LOVB=OFF-0004
     */
    public java.lang.String manageGrade;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 归属区域标识，指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 礼包的状态。LOVB=PUB-C-0001。
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
     * 记录创建时间。
     */
    public java.util.Date createDate;

    /**
     * 记录状态变动时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 礼包的数据库主键标识
     */
    public void setOfferPackageId(java.lang.Long offerPackageId) {
        this.offerPackageId = offerPackageId;
    }

    /**
     * 获取 礼包的数据库主键标识
     */
    public java.lang.Long getOfferPackageId() {
        return this.offerPackageId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerPackageId = SeqUtils.createLongId(ID_SEQ);
         return this.offerPackageId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 礼包的名称
     */
    public void setOfferPackageName(java.lang.String offerPackageName) {
        this.offerPackageName = offerPackageName;
    }

    /**
     * 获取 礼包的名称
     */
    public java.lang.String getOfferPackageName() {
        return this.offerPackageName;
    }

    /**
     * 设置 礼包描述
     */
    public void setOfferPkgDesc(java.lang.String offerPkgDesc) {
        this.offerPkgDesc = offerPkgDesc;
    }

    /**
     * 获取 礼包描述
     */
    public java.lang.String getOfferPkgDesc() {
        return this.offerPkgDesc;
    }

    /**
     * 设置 记录生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 管理级别。LOVB=OFF-0004
     */
    public void setManageGrade(java.lang.String manageGrade) {
        this.manageGrade = manageGrade;
    }

    /**
     * 获取 管理级别。LOVB=OFF-0004
     */
    public java.lang.String getManageGrade() {
        return this.manageGrade;
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
     * 设置 归属区域标识，指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识，指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 礼包的状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 礼包的状态。LOVB=PUB-C-0001。
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
     * 设置 记录创建时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态变动时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变动时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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

}
