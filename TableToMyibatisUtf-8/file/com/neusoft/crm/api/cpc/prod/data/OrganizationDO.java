package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述所有参与电信运营活动的组织，包括内部组织、经营主体、销售点、店中商等。
 * @实体表  :ORGANIZATION
 */
public class OrganizationDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORGANIZATION_S";

    /**
     * 电信组织标识主键
     */
    public java.lang.Long orgId;

    /**
     * 参与人标识,参与人唯一标识
     */
    public java.lang.Long partyId;

    /**
     * 电信组织编码
     */
    public java.lang.String orgCode;

    /**
     * 电信组织名称
     */
    public java.lang.String orgName;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 记录电信组织类型,LOVB=STF-C-0002。
     */
    public java.lang.String orgType;

    /**
     * 记录电信组织小类,LOVB=STF-C-0001。
     */
    public java.lang.String orgSubtype;

    /**
     * 记录城乡标志,LOVB=PUB-C-0004。
     */
    public java.lang.String villageFlag;

    /**
     * 上级组织标识,直接记录组织的直接管理上级标识
     */
    public java.lang.Integer parentOrgId;

    /**
     * 电信组织级别,从0开始,0级为最高级
     */
    public java.lang.Integer orgLevel;

    /**
     * 电信组织排序号，同一级别组织的排序号，主要用于组织机构树展示先后排序
     */
    public java.lang.Integer orgIndex;

    /**
     * 销售点编码
     */
    public java.lang.String salesorgCode;

    /**
     * 是否划小机构
     */
    public java.lang.Integer divorgFlag;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 电信组织状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 电信组织标识主键
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 电信组织标识主键
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orgId = SeqUtils.createLongId(ID_SEQ);
         return this.orgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 参与人标识,参与人唯一标识
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 参与人标识,参与人唯一标识
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 电信组织编码
     */
    public void setOrgCode(java.lang.String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取 电信组织编码
     */
    public java.lang.String getOrgCode() {
        return this.orgCode;
    }

    /**
     * 设置 电信组织名称
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取 电信组织名称
     */
    public java.lang.String getOrgName() {
        return this.orgName;
    }

    /**
     * 设置 公用管理区域标识,记录区域唯一标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录电信组织类型,LOVB=STF-C-0002。
     */
    public void setOrgType(java.lang.String orgType) {
        this.orgType = orgType;
    }

    /**
     * 获取 记录电信组织类型,LOVB=STF-C-0002。
     */
    public java.lang.String getOrgType() {
        return this.orgType;
    }

    /**
     * 设置 记录电信组织小类,LOVB=STF-C-0001。
     */
    public void setOrgSubtype(java.lang.String orgSubtype) {
        this.orgSubtype = orgSubtype;
    }

    /**
     * 获取 记录电信组织小类,LOVB=STF-C-0001。
     */
    public java.lang.String getOrgSubtype() {
        return this.orgSubtype;
    }

    /**
     * 设置 记录城乡标志,LOVB=PUB-C-0004。
     */
    public void setVillageFlag(java.lang.String villageFlag) {
        this.villageFlag = villageFlag;
    }

    /**
     * 获取 记录城乡标志,LOVB=PUB-C-0004。
     */
    public java.lang.String getVillageFlag() {
        return this.villageFlag;
    }

    /**
     * 设置 上级组织标识,直接记录组织的直接管理上级标识
     */
    public void setParentOrgId(java.lang.Integer parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    /**
     * 获取 上级组织标识,直接记录组织的直接管理上级标识
     */
    public java.lang.Integer getParentOrgId() {
        return this.parentOrgId;
    }

    /**
     * 设置 电信组织级别,从0开始,0级为最高级
     */
    public void setOrgLevel(java.lang.Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    /**
     * 获取 电信组织级别,从0开始,0级为最高级
     */
    public java.lang.Integer getOrgLevel() {
        return this.orgLevel;
    }

    /**
     * 设置 电信组织排序号，同一级别组织的排序号，主要用于组织机构树展示先后排序
     */
    public void setOrgIndex(java.lang.Integer orgIndex) {
        this.orgIndex = orgIndex;
    }

    /**
     * 获取 电信组织排序号，同一级别组织的排序号，主要用于组织机构树展示先后排序
     */
    public java.lang.Integer getOrgIndex() {
        return this.orgIndex;
    }

    /**
     * 设置 销售点编码
     */
    public void setSalesorgCode(java.lang.String salesorgCode) {
        this.salesorgCode = salesorgCode;
    }

    /**
     * 获取 销售点编码
     */
    public java.lang.String getSalesorgCode() {
        return this.salesorgCode;
    }

    /**
     * 设置 是否划小机构
     */
    public void setDivorgFlag(java.lang.Integer divorgFlag) {
        this.divorgFlag = divorgFlag;
    }

    /**
     * 获取 是否划小机构
     */
    public java.lang.Integer getDivorgFlag() {
        return this.divorgFlag;
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
     * 设置 电信组织状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 电信组织状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
