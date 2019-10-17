package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指针对系统的操作功能和需要，设置一个或数个系统操作职能的集合。
 * @实体表  :SYSTEM_POST
 */
public class SystemPostDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_POST_S";

    /**
     * 系统岗位标识，主键
     */
    public java.lang.Long sysPostId;

    /**
     * 系统岗位编码
     */
    public java.lang.String sysPostCode;

    /**
     * 系统岗位名称
     */
    public java.lang.String sysPostName;

    /**
     * 系统岗位类型，如分配普通岗位、管控岗位。管控岗位可能涉及敏感信息，需要多级流程审批才能分配。LOVB=STF-C-0011。
     */
    public java.lang.String sysPostType;

    /**
     * 系统岗位描述
     */
    public java.lang.String sysPostDesc;

    /**
     * 是否系统初始数据
     */
    public java.lang.Integer initFlag;

    /**
     * 系统岗位对应的管理组织
     */
    public java.lang.Long orgId;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    public java.lang.Long regionId;

    /**
     * 系统岗位的归属系统
     */
    public java.lang.Long systemInfoId;

    /**
     * 系统岗位状态,LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 系统岗位状态的修改时间
     */
    public java.util.Date statusDate;

    /**
     * 系统岗位创建时间
     */
    public java.util.Date createDate;

    /**
     * 系统岗位创建系统用户
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
     * 设置 系统岗位标识，主键
     */
    public void setSysPostId(java.lang.Long sysPostId) {
        this.sysPostId = sysPostId;
    }

    /**
     * 获取 系统岗位标识，主键
     */
    public java.lang.Long getSysPostId() {
        return this.sysPostId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.sysPostId = SeqUtils.createLongId(ID_SEQ);
         return this.sysPostId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 系统岗位编码
     */
    public void setSysPostCode(java.lang.String sysPostCode) {
        this.sysPostCode = sysPostCode;
    }

    /**
     * 获取 系统岗位编码
     */
    public java.lang.String getSysPostCode() {
        return this.sysPostCode;
    }

    /**
     * 设置 系统岗位名称
     */
    public void setSysPostName(java.lang.String sysPostName) {
        this.sysPostName = sysPostName;
    }

    /**
     * 获取 系统岗位名称
     */
    public java.lang.String getSysPostName() {
        return this.sysPostName;
    }

    /**
     * 设置 系统岗位类型，如分配普通岗位、管控岗位。管控岗位可能涉及敏感信息，需要多级流程审批才能分配。LOVB=STF-C-0011。
     */
    public void setSysPostType(java.lang.String sysPostType) {
        this.sysPostType = sysPostType;
    }

    /**
     * 获取 系统岗位类型，如分配普通岗位、管控岗位。管控岗位可能涉及敏感信息，需要多级流程审批才能分配。LOVB=STF-C-0011。
     */
    public java.lang.String getSysPostType() {
        return this.sysPostType;
    }

    /**
     * 设置 系统岗位描述
     */
    public void setSysPostDesc(java.lang.String sysPostDesc) {
        this.sysPostDesc = sysPostDesc;
    }

    /**
     * 获取 系统岗位描述
     */
    public java.lang.String getSysPostDesc() {
        return this.sysPostDesc;
    }

    /**
     * 设置 是否系统初始数据
     */
    public void setInitFlag(java.lang.Integer initFlag) {
        this.initFlag = initFlag;
    }

    /**
     * 获取 是否系统初始数据
     */
    public java.lang.Integer getInitFlag() {
        return this.initFlag;
    }

    /**
     * 设置 系统岗位对应的管理组织
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 系统岗位对应的管理组织
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
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
     * 设置 系统岗位的归属系统
     */
    public void setSystemInfoId(java.lang.Long systemInfoId) {
        this.systemInfoId = systemInfoId;
    }

    /**
     * 获取 系统岗位的归属系统
     */
    public java.lang.Long getSystemInfoId() {
        return this.systemInfoId;
    }

    /**
     * 设置 系统岗位状态,LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 系统岗位状态,LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 系统岗位状态的修改时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 系统岗位状态的修改时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 系统岗位创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 系统岗位创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 系统岗位创建系统用户
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 系统岗位创建系统用户
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
