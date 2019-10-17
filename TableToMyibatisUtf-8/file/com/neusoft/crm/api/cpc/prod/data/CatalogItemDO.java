package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录目录中具体位置，体现了目录的上下级关系。
 * @实体表  :CATALOG_ITEM
 */
public class CatalogItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CATALOG_ITEM_S";

    /**
     * 记录目录节点的主键
     */
    public java.lang.Long catalogItemId;

    /**
     * 记录目录的主键
     */
    public java.lang.Long catalogId;

    /**
     * 记录父级目录节点的主键
     */
    public java.lang.Long parCatalogItemId;

    /**
     * 记录目录节点名称
     */
    public java.lang.String catalogItemName;

    /**
     * 记录目录节点描述
     */
    public java.lang.String catalogItemDesc;

    /**
     * 记录目录节点类型，LOVB=PUB-C-0002
     */
    public java.lang.String catalogItemType;

    /**
     * 记录目录节点编码
     */
    public java.lang.String catalogItemNbr;

    /**
     * 记录目录节点排序号
     */
    public java.lang.Integer catalogItemSort;

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
     * 状态的修改时间
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录目录节点的主键
     */
    public void setCatalogItemId(java.lang.Long catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    /**
     * 获取 记录目录节点的主键
     */
    public java.lang.Long getCatalogItemId() {
        return this.catalogItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.catalogItemId = SeqUtils.createLongId(ID_SEQ);
         return this.catalogItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 记录父级目录节点的主键
     */
    public void setParCatalogItemId(java.lang.Long parCatalogItemId) {
        this.parCatalogItemId = parCatalogItemId;
    }

    /**
     * 获取 记录父级目录节点的主键
     */
    public java.lang.Long getParCatalogItemId() {
        return this.parCatalogItemId;
    }

    /**
     * 设置 记录目录节点名称
     */
    public void setCatalogItemName(java.lang.String catalogItemName) {
        this.catalogItemName = catalogItemName;
    }

    /**
     * 获取 记录目录节点名称
     */
    public java.lang.String getCatalogItemName() {
        return this.catalogItemName;
    }

    /**
     * 设置 记录目录节点描述
     */
    public void setCatalogItemDesc(java.lang.String catalogItemDesc) {
        this.catalogItemDesc = catalogItemDesc;
    }

    /**
     * 获取 记录目录节点描述
     */
    public java.lang.String getCatalogItemDesc() {
        return this.catalogItemDesc;
    }

    /**
     * 设置 记录目录节点类型，LOVB=PUB-C-0002
     */
    public void setCatalogItemType(java.lang.String catalogItemType) {
        this.catalogItemType = catalogItemType;
    }

    /**
     * 获取 记录目录节点类型，LOVB=PUB-C-0002
     */
    public java.lang.String getCatalogItemType() {
        return this.catalogItemType;
    }

    /**
     * 设置 记录目录节点编码
     */
    public void setCatalogItemNbr(java.lang.String catalogItemNbr) {
        this.catalogItemNbr = catalogItemNbr;
    }

    /**
     * 获取 记录目录节点编码
     */
    public java.lang.String getCatalogItemNbr() {
        return this.catalogItemNbr;
    }

    /**
     * 设置 记录目录节点排序号
     */
    public void setCatalogItemSort(java.lang.Integer catalogItemSort) {
        this.catalogItemSort = catalogItemSort;
    }

    /**
     * 获取 记录目录节点排序号
     */
    public java.lang.Integer getCatalogItemSort() {
        return this.catalogItemSort;
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
     * 设置 状态的修改时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的修改时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
