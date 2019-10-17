package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述商圈的基本信息
 * @实体表  :BIZ_ZONE
 */
public class BizZoneDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BIZ_ZONE_S";

    /**
     * 商圈标识
     */
    public java.lang.Long bizZoneId;

    /**
     * 商圈编码,12位，类型码1位(S)，地区码6位、序列码5位两部分组成
     */
    public java.lang.String busiStoreNbr;

    /**
     * 商圈名称
     */
    public java.lang.String bizZoneName;

    /**
     * 商圈级别。LOVB=CHN-0019
     */
    public java.lang.String bizZoneLever;

    /**
     * 商圈类型。LOVB=CHN-0018
     */
    public java.lang.String bizZoneTypeCd;

    /**
     * 描述
     */
    public java.lang.String description;

    /**
     * 区域标识
     */
    public java.lang.Long regionId;

    /**
     * 商圈记录的状态。LOVB=CHN-C-0014
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
     * 设置 商圈标识
     */
    public void setBizZoneId(java.lang.Long bizZoneId) {
        this.bizZoneId = bizZoneId;
    }

    /**
     * 获取 商圈标识
     */
    public java.lang.Long getBizZoneId() {
        return this.bizZoneId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.bizZoneId = SeqUtils.createLongId(ID_SEQ);
         return this.bizZoneId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 商圈编码,12位，类型码1位(S)，地区码6位、序列码5位两部分组成
     */
    public void setBusiStoreNbr(java.lang.String busiStoreNbr) {
        this.busiStoreNbr = busiStoreNbr;
    }

    /**
     * 获取 商圈编码,12位，类型码1位(S)，地区码6位、序列码5位两部分组成
     */
    public java.lang.String getBusiStoreNbr() {
        return this.busiStoreNbr;
    }

    /**
     * 设置 商圈名称
     */
    public void setBizZoneName(java.lang.String bizZoneName) {
        this.bizZoneName = bizZoneName;
    }

    /**
     * 获取 商圈名称
     */
    public java.lang.String getBizZoneName() {
        return this.bizZoneName;
    }

    /**
     * 设置 商圈级别。LOVB=CHN-0019
     */
    public void setBizZoneLever(java.lang.String bizZoneLever) {
        this.bizZoneLever = bizZoneLever;
    }

    /**
     * 获取 商圈级别。LOVB=CHN-0019
     */
    public java.lang.String getBizZoneLever() {
        return this.bizZoneLever;
    }

    /**
     * 设置 商圈类型。LOVB=CHN-0018
     */
    public void setBizZoneTypeCd(java.lang.String bizZoneTypeCd) {
        this.bizZoneTypeCd = bizZoneTypeCd;
    }

    /**
     * 获取 商圈类型。LOVB=CHN-0018
     */
    public java.lang.String getBizZoneTypeCd() {
        return this.bizZoneTypeCd;
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
     * 设置 商圈记录的状态。LOVB=CHN-C-0014
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 商圈记录的状态。LOVB=CHN-C-0014
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
