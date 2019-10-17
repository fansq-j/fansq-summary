package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述增值销售品产品之间的关联角色
 * @实体表  :VA_OFFER_PROD_REL_ROLE
 */
public class VaOfferProdRelRoleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VA_OFFER_PROD_REL_ROLE_S";

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
     * 角色名称
     */
    public java.lang.String roleName;

    /**
     * 角色数量上限
     */
    public java.lang.Integer maxNum;

    /**
     * 角色数量下限
     */
    public java.lang.Integer minNum;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态的修改时间
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
     * 设置 角色名称
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取 角色名称
     */
    public java.lang.String getRoleName() {
        return this.roleName;
    }

    /**
     * 设置 角色数量上限
     */
    public void setMaxNum(java.lang.Integer maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * 获取 角色数量上限
     */
    public java.lang.Integer getMaxNum() {
        return this.maxNum;
    }

    /**
     * 设置 角色数量下限
     */
    public void setMinNum(java.lang.Integer minNum) {
        this.minNum = minNum;
    }

    /**
     * 获取 角色数量下限
     */
    public java.lang.Integer getMinNum() {
        return this.minNum;
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
     * 设置 记录的创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态的修改时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的修改时间
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
