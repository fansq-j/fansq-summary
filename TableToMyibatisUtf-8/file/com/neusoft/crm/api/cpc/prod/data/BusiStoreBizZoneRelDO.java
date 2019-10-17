package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述经营场所与商圈关系。
 * @实体表  :BUSI_STORE_BIZ_ZONE_REL
 */
public class BusiStoreBizZoneRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSI_STORE_BIZ_ZONE_REL_S";

    /**
     * 经营场所商圈关系标识
     */
    public java.lang.Long busiStoreBizZoneRelId;

    /**
     * 商圈标识
     */
    public java.lang.Long bizZoneId;

    /**
     * 经营场所标识
     */
    public java.lang.Long busiStoreId;

    /**
     * 经营场所与商圈关系类型。LOVB=CHN-C-0015
     */
    public java.lang.String relType;

    /**
     * 描述
     */
    public java.lang.String description;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
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
     * 设置 经营场所商圈关系标识
     */
    public void setBusiStoreBizZoneRelId(java.lang.Long busiStoreBizZoneRelId) {
        this.busiStoreBizZoneRelId = busiStoreBizZoneRelId;
    }

    /**
     * 获取 经营场所商圈关系标识
     */
    public java.lang.Long getBusiStoreBizZoneRelId() {
        return this.busiStoreBizZoneRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.busiStoreBizZoneRelId = SeqUtils.createLongId(ID_SEQ);
         return this.busiStoreBizZoneRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 经营场所与商圈关系类型。LOVB=CHN-C-0015
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 经营场所与商圈关系类型。LOVB=CHN-C-0015
     */
    public java.lang.String getRelType() {
        return this.relType;
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
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
