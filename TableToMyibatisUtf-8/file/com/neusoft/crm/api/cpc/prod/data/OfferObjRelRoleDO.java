package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描叙 销售品所包含的对象关联角色之间的关系
 * @实体表  :OFFER_OBJ_REL_ROLE
 */
public class OfferObjRelRoleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_OBJ_REL_ROLE_S";

    /**
     * 记录复合产品构成角色ID。
     */
    public java.lang.Integer roleId;

    /**
     * 记录复合产品构成上级角色ID。
     */
    public java.lang.Integer parRoleId;

    /**
     * 记录复合产品构成角色CD。
     */
    public java.lang.String roleCd;

    /**
     * 记录角色名称
     */
    public java.lang.String roleName;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 记录复合产品构成角色ID。
     */
    public void setRoleId(java.lang.Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 记录复合产品构成角色ID。
     */
    public java.lang.Integer getRoleId() {
        return this.roleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.roleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.roleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录复合产品构成上级角色ID。
     */
    public void setParRoleId(java.lang.Integer parRoleId) {
        this.parRoleId = parRoleId;
    }

    /**
     * 获取 记录复合产品构成上级角色ID。
     */
    public java.lang.Integer getParRoleId() {
        return this.parRoleId;
    }

    /**
     * 设置 记录复合产品构成角色CD。
     */
    public void setRoleCd(java.lang.String roleCd) {
        this.roleCd = roleCd;
    }

    /**
     * 获取 记录复合产品构成角色CD。
     */
    public java.lang.String getRoleCd() {
        return this.roleCd;
    }

    /**
     * 设置 记录角色名称
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取 记录角色名称
     */
    public java.lang.String getRoleName() {
        return this.roleName;
    }

    /**
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
