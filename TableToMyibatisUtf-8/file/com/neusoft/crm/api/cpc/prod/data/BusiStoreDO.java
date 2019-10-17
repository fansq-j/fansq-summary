package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:经营场所基本信息
 * @实体表  :BUSI_STORE
 */
public class BusiStoreDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSI_STORE_S";

    /**
     * 经营场所标识
     */
    public java.lang.Long busiStoreId;

    /**
     * 经营场所编码13位：类型码1位（C)、地区码6位、序列码6位
     */
    public java.lang.String busiStoreNbr;

    /**
     * 经营场所名称
     */
    public java.lang.String busiStoreName;

    /**
     * 房产类型，LOVB=CHN-C-0011
     */
    public java.lang.String busiStoreHouseType;

    /**
     * 地址
     */
    public java.lang.String address;

    /**
     * 描述
     */
    public java.lang.String description;

    /**
     * 区域标识
     */
    public java.lang.Long regionId;

    /**
     * 该条记录的状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 经营场所标识
     */
    public void setBusiStoreId(java.lang.Long busiStoreId) {
        this.busiStoreId = busiStoreId;
    }

    /**
     * 获取 经营场所标识
     */
    public java.lang.Long getBusiStoreId() {
        return this.busiStoreId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.busiStoreId = SeqUtils.createLongId(ID_SEQ);
         return this.busiStoreId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 经营场所编码13位：类型码1位（C)、地区码6位、序列码6位
     */
    public void setBusiStoreNbr(java.lang.String busiStoreNbr) {
        this.busiStoreNbr = busiStoreNbr;
    }

    /**
     * 获取 经营场所编码13位：类型码1位（C)、地区码6位、序列码6位
     */
    public java.lang.String getBusiStoreNbr() {
        return this.busiStoreNbr;
    }

    /**
     * 设置 经营场所名称
     */
    public void setBusiStoreName(java.lang.String busiStoreName) {
        this.busiStoreName = busiStoreName;
    }

    /**
     * 获取 经营场所名称
     */
    public java.lang.String getBusiStoreName() {
        return this.busiStoreName;
    }

    /**
     * 设置 房产类型，LOVB=CHN-C-0011
     */
    public void setBusiStoreHouseType(java.lang.String busiStoreHouseType) {
        this.busiStoreHouseType = busiStoreHouseType;
    }

    /**
     * 获取 房产类型，LOVB=CHN-C-0011
     */
    public java.lang.String getBusiStoreHouseType() {
        return this.busiStoreHouseType;
    }

    /**
     * 设置 地址
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    /**
     * 获取 地址
     */
    public java.lang.String getAddress() {
        return this.address;
    }

    /**
     * 设置 描述
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * 获取 描述
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 该条记录的状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 该条记录的状态，LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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

}
