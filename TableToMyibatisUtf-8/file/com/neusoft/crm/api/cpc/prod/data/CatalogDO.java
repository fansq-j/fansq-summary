package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指将电信的所有产品、销售品和对外的业务提供等进行排列，给出一个整体的目录。
 * @实体表  :CATALOG
 */
public class CatalogDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CATALOG_S";

    /**
     * 记录目录的主键
     */
    public java.lang.Long catalogId;

    /**
     * 记录目录的名称
     */
    public java.lang.String catalogName;

    /**
     * 记录目录的类型，LOVB=PUB-C-0005
     */
    public java.lang.String catalogType;

    /**
     * 记录目录的描述
     */
    public java.lang.String catalogDesc;

    /**
     * 记录目录的编码
     */
    public java.lang.String catalogNbr;

    /**
     * 记录目录的用途
     */
    public java.lang.String catalogUsage;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录的修改员工
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录目录的主键
     */
    public void setCatalogId(java.lang.Long catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * 获取 记录目录的主键
     */
    public java.lang.Long getCatalogId() {
        return this.catalogId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.catalogId = SeqUtils.createLongId(ID_SEQ);
         return this.catalogId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录目录的名称
     */
    public void setCatalogName(java.lang.String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * 获取 记录目录的名称
     */
    public java.lang.String getCatalogName() {
        return this.catalogName;
    }

    /**
     * 设置 记录目录的类型，LOVB=PUB-C-0005
     */
    public void setCatalogType(java.lang.String catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * 获取 记录目录的类型，LOVB=PUB-C-0005
     */
    public java.lang.String getCatalogType() {
        return this.catalogType;
    }

    /**
     * 设置 记录目录的描述
     */
    public void setCatalogDesc(java.lang.String catalogDesc) {
        this.catalogDesc = catalogDesc;
    }

    /**
     * 获取 记录目录的描述
     */
    public java.lang.String getCatalogDesc() {
        return this.catalogDesc;
    }

    /**
     * 设置 记录目录的编码
     */
    public void setCatalogNbr(java.lang.String catalogNbr) {
        this.catalogNbr = catalogNbr;
    }

    /**
     * 获取 记录目录的编码
     */
    public java.lang.String getCatalogNbr() {
        return this.catalogNbr;
    }

    /**
     * 设置 记录目录的用途
     */
    public void setCatalogUsage(java.lang.String catalogUsage) {
        this.catalogUsage = catalogUsage;
    }

    /**
     * 获取 记录目录的用途
     */
    public java.lang.String getCatalogUsage() {
        return this.catalogUsage;
    }

    /**
     * 设置 记录适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识
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
     * 设置 记录的创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改员工
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
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
