package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述电信组织的属性信息，或作为渠道的纵表属性，或作为经营主体的纵表属性。
 * @实体表  :ORG_ATTR
 */
public class OrgAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORG_ATTR_S";

    /**
     * 电信组织属性标识
     */
    public java.lang.Integer orgAttrId;

    /**
     * 电信组织标识
     */
    public java.lang.Long orgId;

    /**
     * 电信组织角色类型,分为：内部组织、渠道、经营主体.LOVB=STF-C-0022
     */
    public java.lang.String orgRoleType;

    /**
     * 属性标识
     */
    public java.lang.Long attrId;

    /**
     * 属性值标识，选填
     */
    public java.lang.Long attrValueId;

    /**
     * 属性值
     */
    public java.lang.String attrValue;

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
     * 设置 电信组织属性标识
     */
    public void setOrgAttrId(java.lang.Integer orgAttrId) {
        this.orgAttrId = orgAttrId;
    }

    /**
     * 获取 电信组织属性标识
     */
    public java.lang.Integer getOrgAttrId() {
        return this.orgAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.orgAttrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.orgAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 电信组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 电信组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 电信组织角色类型,分为：内部组织、渠道、经营主体.LOVB=STF-C-0022
     */
    public void setOrgRoleType(java.lang.String orgRoleType) {
        this.orgRoleType = orgRoleType;
    }

    /**
     * 获取 电信组织角色类型,分为：内部组织、渠道、经营主体.LOVB=STF-C-0022
     */
    public java.lang.String getOrgRoleType() {
        return this.orgRoleType;
    }

    /**
     * 设置 属性标识
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 属性标识
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 属性值标识，选填
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值标识，选填
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 属性值
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 属性值
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
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
