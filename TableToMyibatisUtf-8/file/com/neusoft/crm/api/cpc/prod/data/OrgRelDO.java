package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:电信组织与电信组织存在多种关系，包括隶属管理关系、进驻关系、经营关系等。
 * @实体表  :ORG_REL
 */
public class OrgRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_REL_S";

    /**
     * 组织关系标识,PK
     */
    public java.lang.Long orgRelId;

    /**
     * A组织标识
     */
    public java.lang.Long aOrgId;

    /**
     * Z组织标识
     */
    public java.lang.Long zOrgId;

    /**
     * 组织关系类型,LOVB=STF-C-0004。
     */
    public java.lang.String orgRelType;

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
     * 设置 组织关系标识,PK
     */
    public void setOrgRelId(java.lang.Long orgRelId) {
        this.orgRelId = orgRelId;
    }

    /**
     * 获取 组织关系标识,PK
     */
    public java.lang.Long getOrgRelId() {
        return this.orgRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orgRelId = SeqUtils.createLongId(ID_SEQ);
         return this.orgRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 A组织标识
     */
    public void setAOrgId(java.lang.Long aOrgId) {
        this.aOrgId = aOrgId;
    }

    /**
     * 获取 A组织标识
     */
    public java.lang.Long getAOrgId() {
        return this.aOrgId;
    }

    /**
     * 设置 Z组织标识
     */
    public void setZOrgId(java.lang.Long zOrgId) {
        this.zOrgId = zOrgId;
    }

    /**
     * 获取 Z组织标识
     */
    public java.lang.Long getZOrgId() {
        return this.zOrgId;
    }

    /**
     * 设置 组织关系类型,LOVB=STF-C-0004。
     */
    public void setOrgRelType(java.lang.String orgRelType) {
        this.orgRelType = orgRelType;
    }

    /**
     * 获取 组织关系类型,LOVB=STF-C-0004。
     */
    public java.lang.String getOrgRelType() {
        return this.orgRelType;
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
