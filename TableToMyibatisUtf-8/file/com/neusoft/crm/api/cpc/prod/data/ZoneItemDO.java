package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:一个区表可包含多个分区，也可以是个树状的层次分区，区表节点是区表中的一个组成元素。
 * @实体表  :ZONE_ITEM
 */
public class ZoneItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ZONE_ITEM_S";

    /**
     * 区表节点的标识
     */
    public java.lang.Integer zoneItemId;

    /**
     * 名称字段，用于详细说明归并后的含义
     */
    public java.lang.String zoneItemName;

    /**
     * 
     */
    public java.lang.Integer parentZoneItemId;

    /**
     * 区表的标识
     */
    public java.lang.Integer zoneId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 
     */
    public java.lang.Integer pricingRefObjectId;

    /**
     * LOVB=PRC-C-0029
     */
    public java.lang.Integer matchingType;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 区表节点的标识
     */
    public void setZoneItemId(java.lang.Integer zoneItemId) {
        this.zoneItemId = zoneItemId;
    }

    /**
     * 获取 区表节点的标识
     */
    public java.lang.Integer getZoneItemId() {
        return this.zoneItemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.zoneItemId = SeqUtils.createIntegerId(ID_SEQ);
         return this.zoneItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 名称字段，用于详细说明归并后的含义
     */
    public void setZoneItemName(java.lang.String zoneItemName) {
        this.zoneItemName = zoneItemName;
    }

    /**
     * 获取 名称字段，用于详细说明归并后的含义
     */
    public java.lang.String getZoneItemName() {
        return this.zoneItemName;
    }

    /**
     * 设置 
     */
    public void setParentZoneItemId(java.lang.Integer parentZoneItemId) {
        this.parentZoneItemId = parentZoneItemId;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getParentZoneItemId() {
        return this.parentZoneItemId;
    }

    /**
     * 设置 区表的标识
     */
    public void setZoneId(java.lang.Integer zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * 获取 区表的标识
     */
    public java.lang.Integer getZoneId() {
        return this.zoneId;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 
     */
    public void setPricingRefObjectId(java.lang.Integer pricingRefObjectId) {
        this.pricingRefObjectId = pricingRefObjectId;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getPricingRefObjectId() {
        return this.pricingRefObjectId;
    }

    /**
     * 设置 LOVB=PRC-C-0029
     */
    public void setMatchingType(java.lang.Integer matchingType) {
        this.matchingType = matchingType;
    }

    /**
     * 获取 LOVB=PRC-C-0029
     */
    public java.lang.Integer getMatchingType() {
        return this.matchingType;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
