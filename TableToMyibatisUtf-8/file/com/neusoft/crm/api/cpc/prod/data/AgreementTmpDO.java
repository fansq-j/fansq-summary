package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是对协议的规格化抽象描述，用来进行协议的生成。电信销售的产品和服务，往往是通过销售品的形式包装、组合、定价上架销售的，同
 * @实体表  :AGREEMENT_TMP
 */
public class AgreementTmpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREEMENT_TMP_S";

    /**
     * 协议模板主键
     */
    public java.lang.Long agreementTmpId;

    /**
     * 模板编码
     */
    public java.lang.String agreementTmpNbr;

    /**
     * 记录模板名称
     */
    public java.lang.String templetName;

    /**
     * 记录模板描述
     */
    public java.lang.String agreementTmpDesc;

    /**
     * 协议模板定义的协议类型，LOVB=ARG-0001
     */
    public java.lang.String agreeType;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

    /**
     * 协议模版的状态，LOVB=ARG-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录管理区域标识
     */
    public java.lang.Long manageRegionId;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 协议模版的管控级别，LOVB=ARG-C-0003
     */
    public java.lang.String manageLevel;

    /**
     * 管理部门标识
     */
    public java.lang.Long manageOrg;

    /**
     * 客户品牌标识
     */
    public java.lang.Integer brandId;

    /**
     * 设置 协议模板主键
     */
    public void setAgreementTmpId(java.lang.Long agreementTmpId) {
        this.agreementTmpId = agreementTmpId;
    }

    /**
     * 获取 协议模板主键
     */
    public java.lang.Long getAgreementTmpId() {
        return this.agreementTmpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreementTmpId = SeqUtils.createLongId(ID_SEQ);
         return this.agreementTmpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 模板编码
     */
    public void setAgreementTmpNbr(java.lang.String agreementTmpNbr) {
        this.agreementTmpNbr = agreementTmpNbr;
    }

    /**
     * 获取 模板编码
     */
    public java.lang.String getAgreementTmpNbr() {
        return this.agreementTmpNbr;
    }

    /**
     * 设置 记录模板名称
     */
    public void setTempletName(java.lang.String templetName) {
        this.templetName = templetName;
    }

    /**
     * 获取 记录模板名称
     */
    public java.lang.String getTempletName() {
        return this.templetName;
    }

    /**
     * 设置 记录模板描述
     */
    public void setAgreementTmpDesc(java.lang.String agreementTmpDesc) {
        this.agreementTmpDesc = agreementTmpDesc;
    }

    /**
     * 获取 记录模板描述
     */
    public java.lang.String getAgreementTmpDesc() {
        return this.agreementTmpDesc;
    }

    /**
     * 设置 协议模板定义的协议类型，LOVB=ARG-0001
     */
    public void setAgreeType(java.lang.String agreeType) {
        this.agreeType = agreeType;
    }

    /**
     * 获取 协议模板定义的协议类型，LOVB=ARG-0001
     */
    public java.lang.String getAgreeType() {
        return this.agreeType;
    }

    /**
     * 设置 记录生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 协议模版的状态，LOVB=ARG-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 协议模版的状态，LOVB=ARG-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录管理区域标识
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录管理区域标识
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
    }

    /**
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 协议模版的管控级别，LOVB=ARG-C-0003
     */
    public void setManageLevel(java.lang.String manageLevel) {
        this.manageLevel = manageLevel;
    }

    /**
     * 获取 协议模版的管控级别，LOVB=ARG-C-0003
     */
    public java.lang.String getManageLevel() {
        return this.manageLevel;
    }

    /**
     * 设置 管理部门标识
     */
    public void setManageOrg(java.lang.Long manageOrg) {
        this.manageOrg = manageOrg;
    }

    /**
     * 获取 管理部门标识
     */
    public java.lang.Long getManageOrg() {
        return this.manageOrg;
    }

    /**
     * 设置 客户品牌标识
     */
    public void setBrandId(java.lang.Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取 客户品牌标识
     */
    public java.lang.Integer getBrandId() {
        return this.brandId;
    }

}
