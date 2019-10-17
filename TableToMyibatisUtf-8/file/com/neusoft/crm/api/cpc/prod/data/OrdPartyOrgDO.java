package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的组织。
 * @实体表  :ORD_PARTY_ORG
 */
public class OrdPartyOrgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_PARTY_ORG_S";

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

    /**
     * 记录组织名称
     */
    public java.lang.String orgName;

    /**
     * 参与人标识
     */
    public java.lang.Long partyId;

    /**
     * 记录组织的不同分类，如内部组织、外部组织。LOVB=PTY-0012。
     */
    public java.lang.String orgType;

    /**
     * 记录组织的性质，例如：国有、私营等。LOVB=PTY-C-0001。
     */
    public java.lang.String orgProperty;

    /**
     * 简要描述组织信息。
     */
    public java.lang.String orgIntro;

    /**
     * 记录组织的人员规模。LOVB=PTY-C-0002。
     */
    public java.lang.String orgScale;

    /**
     * 记录组织的资产规模。LOVB=PTY-C-0003
     */
    public java.lang.String orgAssets;

    /**
     * 记录组织的主要负责人信息。
     */
    public java.lang.String principal;

    /**
     * 记录组织的总部地址。
     */
    public java.lang.String hqAddr;

    /**
     * 记录政企成立日期。
     */
    public java.util.Date custBulidDate;

    /**
     * 记录楼宇名称。
     */
    public java.lang.String bulidName;

    /**
     * 增加主数据；纯住宅、商住两用、纯商务、其他。LOVB=PTY-C-0006。
     */
    public java.lang.String bulidAttr;

    /**
     * 记录组织的主页。
     */
    public java.lang.String orgHomepage;

    /**
     * 记录组织的地址。
     */
    public java.lang.String orgAddr;

    /**
     * 记录组织的特殊区域ID。LOVB=PTY-C-0009。
     */
    public java.lang.Integer specialAreaId;

    /**
     * 记录组织的法定代表人。
     */
    public java.lang.String legalRepr;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 记录组织名称
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取 记录组织名称
     */
    public java.lang.String getOrgName() {
        return this.orgName;
    }

    /**
     * 设置 参与人标识
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 参与人标识
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录组织的不同分类，如内部组织、外部组织。LOVB=PTY-0012。
     */
    public void setOrgType(java.lang.String orgType) {
        this.orgType = orgType;
    }

    /**
     * 获取 记录组织的不同分类，如内部组织、外部组织。LOVB=PTY-0012。
     */
    public java.lang.String getOrgType() {
        return this.orgType;
    }

    /**
     * 设置 记录组织的性质，例如：国有、私营等。LOVB=PTY-C-0001。
     */
    public void setOrgProperty(java.lang.String orgProperty) {
        this.orgProperty = orgProperty;
    }

    /**
     * 获取 记录组织的性质，例如：国有、私营等。LOVB=PTY-C-0001。
     */
    public java.lang.String getOrgProperty() {
        return this.orgProperty;
    }

    /**
     * 设置 简要描述组织信息。
     */
    public void setOrgIntro(java.lang.String orgIntro) {
        this.orgIntro = orgIntro;
    }

    /**
     * 获取 简要描述组织信息。
     */
    public java.lang.String getOrgIntro() {
        return this.orgIntro;
    }

    /**
     * 设置 记录组织的人员规模。LOVB=PTY-C-0002。
     */
    public void setOrgScale(java.lang.String orgScale) {
        this.orgScale = orgScale;
    }

    /**
     * 获取 记录组织的人员规模。LOVB=PTY-C-0002。
     */
    public java.lang.String getOrgScale() {
        return this.orgScale;
    }

    /**
     * 设置 记录组织的资产规模。LOVB=PTY-C-0003
     */
    public void setOrgAssets(java.lang.String orgAssets) {
        this.orgAssets = orgAssets;
    }

    /**
     * 获取 记录组织的资产规模。LOVB=PTY-C-0003
     */
    public java.lang.String getOrgAssets() {
        return this.orgAssets;
    }

    /**
     * 设置 记录组织的主要负责人信息。
     */
    public void setPrincipal(java.lang.String principal) {
        this.principal = principal;
    }

    /**
     * 获取 记录组织的主要负责人信息。
     */
    public java.lang.String getPrincipal() {
        return this.principal;
    }

    /**
     * 设置 记录组织的总部地址。
     */
    public void setHqAddr(java.lang.String hqAddr) {
        this.hqAddr = hqAddr;
    }

    /**
     * 获取 记录组织的总部地址。
     */
    public java.lang.String getHqAddr() {
        return this.hqAddr;
    }

    /**
     * 设置 记录政企成立日期。
     */
    public void setCustBulidDate(java.util.Date custBulidDate) {
        this.custBulidDate = custBulidDate;
    }

    /**
     * 获取 记录政企成立日期。
     */
    public java.util.Date getCustBulidDate() {
        return this.custBulidDate;
    }

    /**
     * 设置 记录楼宇名称。
     */
    public void setBulidName(java.lang.String bulidName) {
        this.bulidName = bulidName;
    }

    /**
     * 获取 记录楼宇名称。
     */
    public java.lang.String getBulidName() {
        return this.bulidName;
    }

    /**
     * 设置 增加主数据；纯住宅、商住两用、纯商务、其他。LOVB=PTY-C-0006。
     */
    public void setBulidAttr(java.lang.String bulidAttr) {
        this.bulidAttr = bulidAttr;
    }

    /**
     * 获取 增加主数据；纯住宅、商住两用、纯商务、其他。LOVB=PTY-C-0006。
     */
    public java.lang.String getBulidAttr() {
        return this.bulidAttr;
    }

    /**
     * 设置 记录组织的主页。
     */
    public void setOrgHomepage(java.lang.String orgHomepage) {
        this.orgHomepage = orgHomepage;
    }

    /**
     * 获取 记录组织的主页。
     */
    public java.lang.String getOrgHomepage() {
        return this.orgHomepage;
    }

    /**
     * 设置 记录组织的地址。
     */
    public void setOrgAddr(java.lang.String orgAddr) {
        this.orgAddr = orgAddr;
    }

    /**
     * 获取 记录组织的地址。
     */
    public java.lang.String getOrgAddr() {
        return this.orgAddr;
    }

    /**
     * 设置 记录组织的特殊区域ID。LOVB=PTY-C-0009。
     */
    public void setSpecialAreaId(java.lang.Integer specialAreaId) {
        this.specialAreaId = specialAreaId;
    }

    /**
     * 获取 记录组织的特殊区域ID。LOVB=PTY-C-0009。
     */
    public java.lang.Integer getSpecialAreaId() {
        return this.specialAreaId;
    }

    /**
     * 设置 记录组织的法定代表人。
     */
    public void setLegalRepr(java.lang.String legalRepr) {
        this.legalRepr = legalRepr;
    }

    /**
     * 获取 记录组织的法定代表人。
     */
    public java.lang.String getLegalRepr() {
        return this.legalRepr;
    }

    /**
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
