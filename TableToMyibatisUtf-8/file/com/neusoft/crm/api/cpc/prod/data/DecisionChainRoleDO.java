package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:决策链构成角色
 * @实体表  :DECISION_CHAIN_ROLE
 */
public class DecisionChainRoleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DECISION_CHAIN_ROLE_S";

    /**
     * 记录决策链构成角色标识，作为主键
     */
    public java.lang.Long chainRoleId;

    /**
     * 记录决策链标识，作为外键，指向决策链实体。
     */
    public java.lang.Long decisionChainId;

    /**
     * 记录决策链角色类型。LOVB=CUS-C-0009。
     */
    public java.lang.String roleType;

    /**
     * 记录角色名称。
     */
    public java.lang.String roleName;

    /**
     * 记录关键人标识，作为外键，指向关键人实体
     */
    public java.lang.Long keyPersonId;

    /**
     * 记录角色描述
     */
    public java.lang.String roleDesc;

    /**
     * 记录决策顺序。
     */
    public java.lang.Integer decisionSeq;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录决策链构成角色标识，作为主键
     */
    public void setChainRoleId(java.lang.Long chainRoleId) {
        this.chainRoleId = chainRoleId;
    }

    /**
     * 获取 记录决策链构成角色标识，作为主键
     */
    public java.lang.Long getChainRoleId() {
        return this.chainRoleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.chainRoleId = SeqUtils.createLongId(ID_SEQ);
         return this.chainRoleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录决策链标识，作为外键，指向决策链实体。
     */
    public void setDecisionChainId(java.lang.Long decisionChainId) {
        this.decisionChainId = decisionChainId;
    }

    /**
     * 获取 记录决策链标识，作为外键，指向决策链实体。
     */
    public java.lang.Long getDecisionChainId() {
        return this.decisionChainId;
    }

    /**
     * 设置 记录决策链角色类型。LOVB=CUS-C-0009。
     */
    public void setRoleType(java.lang.String roleType) {
        this.roleType = roleType;
    }

    /**
     * 获取 记录决策链角色类型。LOVB=CUS-C-0009。
     */
    public java.lang.String getRoleType() {
        return this.roleType;
    }

    /**
     * 设置 记录角色名称。
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取 记录角色名称。
     */
    public java.lang.String getRoleName() {
        return this.roleName;
    }

    /**
     * 设置 记录关键人标识，作为外键，指向关键人实体
     */
    public void setKeyPersonId(java.lang.Long keyPersonId) {
        this.keyPersonId = keyPersonId;
    }

    /**
     * 获取 记录关键人标识，作为外键，指向关键人实体
     */
    public java.lang.Long getKeyPersonId() {
        return this.keyPersonId;
    }

    /**
     * 设置 记录角色描述
     */
    public void setRoleDesc(java.lang.String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * 获取 记录角色描述
     */
    public java.lang.String getRoleDesc() {
        return this.roleDesc;
    }

    /**
     * 设置 记录决策顺序。
     */
    public void setDecisionSeq(java.lang.Integer decisionSeq) {
        this.decisionSeq = decisionSeq;
    }

    /**
     * 获取 记录决策顺序。
     */
    public java.lang.Integer getDecisionSeq() {
        return this.decisionSeq;
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

}
