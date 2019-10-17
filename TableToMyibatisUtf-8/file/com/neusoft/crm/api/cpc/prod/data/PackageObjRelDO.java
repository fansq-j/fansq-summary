package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述一个礼包的构成，包含哪些内容
 * @实体表  :PACKAGE_OBJ_REL
 */
public class PackageObjRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PACKAGE_OBJ_REL_S";

    /**
     * 礼包构成标识
     */
    public java.lang.Long pkgObjRelId;

    /**
     * 上级礼包构成标识
     */
    public java.lang.Long parPkgObjRelId;

    /**
     * 记录礼包的构成对象类型.LOVB=OFF-C-0052
     */
    public java.lang.String objType;

    /**
     * 礼包构成对象标识
     */
    public java.lang.Long objId;

    /**
     * 是否主对象标志。LOVB=PUB-C-0006
     */
    public java.lang.String mainObjFlag;

    /**
     * 记录礼包的构成类型，LOVB=OFF-C-0062。
     */
    public java.lang.String relType;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

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
     * 礼包的数据库主键标识
     */
    public java.lang.Long offerPackageId;

    /**
     * 礼包构成的状态 LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 设置 礼包构成标识
     */
    public void setPkgObjRelId(java.lang.Long pkgObjRelId) {
        this.pkgObjRelId = pkgObjRelId;
    }

    /**
     * 获取 礼包构成标识
     */
    public java.lang.Long getPkgObjRelId() {
        return this.pkgObjRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pkgObjRelId = SeqUtils.createLongId(ID_SEQ);
         return this.pkgObjRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 上级礼包构成标识
     */
    public void setParPkgObjRelId(java.lang.Long parPkgObjRelId) {
        this.parPkgObjRelId = parPkgObjRelId;
    }

    /**
     * 获取 上级礼包构成标识
     */
    public java.lang.Long getParPkgObjRelId() {
        return this.parPkgObjRelId;
    }

    /**
     * 设置 记录礼包的构成对象类型.LOVB=OFF-C-0052
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录礼包的构成对象类型.LOVB=OFF-C-0052
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 礼包构成对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 礼包构成对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 是否主对象标志。LOVB=PUB-C-0006
     */
    public void setMainObjFlag(java.lang.String mainObjFlag) {
        this.mainObjFlag = mainObjFlag;
    }

    /**
     * 获取 是否主对象标志。LOVB=PUB-C-0006
     */
    public java.lang.String getMainObjFlag() {
        return this.mainObjFlag;
    }

    /**
     * 设置 记录礼包的构成类型，LOVB=OFF-C-0062。
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录礼包的构成类型，LOVB=OFF-C-0062。
     */
    public java.lang.String getRelType() {
        return this.relType;
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
     * 设置 礼包构成的状态 LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 礼包构成的状态 LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

}
