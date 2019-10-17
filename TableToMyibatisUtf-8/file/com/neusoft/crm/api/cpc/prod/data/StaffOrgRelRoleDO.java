package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录员工组织关系角色信息；
 * @实体表  :STAFF_ORG_REL_ROLE
 */
public class StaffOrgRelRoleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "STAFF_ORG_REL_ROLE_S";

    /**
     * 记录员工组织关系角色的标识；
     */
    public java.lang.Long roleId;

    /**
     * 记录员工组织关系角色的上级标识。
     */
    public java.lang.Long parRoleId;

    /**
     * 记录员工组织关系角色的名称。
     */
    public java.lang.String roleName;

    /**
     * 记录角色编码
     */
    public java.lang.String roleCd;

    /**
     * 记录员工组织关系角色的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long manageRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 记录员工组织关系角色的标识；
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 记录员工组织关系角色的标识；
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.roleId = SeqUtils.createLongId(ID_SEQ);
         return this.roleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录员工组织关系角色的上级标识。
     */
    public void setParRoleId(java.lang.Long parRoleId) {
        this.parRoleId = parRoleId;
    }

    /**
     * 获取 记录员工组织关系角色的上级标识。
     */
    public java.lang.Long getParRoleId() {
        return this.parRoleId;
    }

    /**
     * 设置 记录员工组织关系角色的名称。
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取 记录员工组织关系角色的名称。
     */
    public java.lang.String getRoleName() {
        return this.roleName;
    }

    /**
     * 设置 记录角色编码
     */
    public void setRoleCd(java.lang.String roleCd) {
        this.roleCd = roleCd;
    }

    /**
     * 获取 记录角色编码
     */
    public java.lang.String getRoleCd() {
        return this.roleCd;
    }

    /**
     * 设置 记录员工组织关系角色的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
            
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录员工组织关系角色的管理区域，如省级区域、集团级区域，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
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
     * 设置 记录创建的员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
