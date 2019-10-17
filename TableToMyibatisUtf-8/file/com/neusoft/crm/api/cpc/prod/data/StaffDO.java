package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指与中国电信存在雇佣关系的个人，包括内部员工和外部员工。例如：支撑系统的操作人员、合作伙伴员工、政企客户的自助人员。
 * @实体表  :STAFF
 */
public class StaffDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "STAFF_S";

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 参与人标识,参与人唯一标识
     */
    public java.lang.Long partyId;

    /**
     * 员工编码
     */
    public java.lang.String staffCode;

    /**
     * 员工账号
     */
    public java.lang.String staffAccount;

    /**
     * 组织标识外键,员工的归属管理组织
     */
    public java.lang.Long orgId;

    /**
     * 员工类型，LOVB=STF-C-0005。
     */
    public java.lang.String staffType;

    /**
     * 员工名称
     */
    public java.lang.String staffName;

    /**
     * 员工描述
     */
    public java.lang.String staffDesc;

    /**
     * 记录员工状态，LOVB=STF-0003。
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
     * 销售员编码，LOVB=STF-0004。
     */
    public java.lang.String salesstaffCode;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long commonRegionId;

    /**
     * 设置 员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.staffId = SeqUtils.createLongId(ID_SEQ);
         return this.staffId;
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
     * 设置 员工编码
     */
    public void setStaffCode(java.lang.String staffCode) {
        this.staffCode = staffCode;
    }

    /**
     * 获取 员工编码
     */
    public java.lang.String getStaffCode() {
        return this.staffCode;
    }

    /**
     * 设置 员工账号
     */
    public void setStaffAccount(java.lang.String staffAccount) {
        this.staffAccount = staffAccount;
    }

    /**
     * 获取 员工账号
     */
    public java.lang.String getStaffAccount() {
        return this.staffAccount;
    }

    /**
     * 设置 组织标识外键,员工的归属管理组织
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识外键,员工的归属管理组织
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 员工类型，LOVB=STF-C-0005。
     */
    public void setStaffType(java.lang.String staffType) {
        this.staffType = staffType;
    }

    /**
     * 获取 员工类型，LOVB=STF-C-0005。
     */
    public java.lang.String getStaffType() {
        return this.staffType;
    }

    /**
     * 设置 员工名称
     */
    public void setStaffName(java.lang.String staffName) {
        this.staffName = staffName;
    }

    /**
     * 获取 员工名称
     */
    public java.lang.String getStaffName() {
        return this.staffName;
    }

    /**
     * 设置 员工描述
     */
    public void setStaffDesc(java.lang.String staffDesc) {
        this.staffDesc = staffDesc;
    }

    /**
     * 获取 员工描述
     */
    public java.lang.String getStaffDesc() {
        return this.staffDesc;
    }

    /**
     * 设置 记录员工状态，LOVB=STF-0003。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录员工状态，LOVB=STF-0003。
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

    /**
     * 设置 销售员编码，LOVB=STF-0004。
     */
    public void setSalesstaffCode(java.lang.String salesstaffCode) {
        this.salesstaffCode = salesstaffCode;
    }

    /**
     * 获取 销售员编码，LOVB=STF-0004。
     */
    public java.lang.String getSalesstaffCode() {
        return this.salesstaffCode;
    }

    /**
     * 设置 公用管理区域标识,记录区域唯一标识
     */
    public void setCommonRegionId(java.lang.Long commonRegionId) {
        this.commonRegionId = commonRegionId;
    }

    /**
     * 获取 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long getCommonRegionId() {
        return this.commonRegionId;
    }

}
