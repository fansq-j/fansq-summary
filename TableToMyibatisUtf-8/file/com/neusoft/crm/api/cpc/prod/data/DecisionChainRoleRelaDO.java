package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:决策链角色间的影响关系
 * @实体表  :DECISION_CHAIN_ROLE_RELA
 */
public class DecisionChainRoleRelaDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DECISION_CHAIN_ROLE_RELA_S";

    /**
     * 记录决策链角色关系标识，作为主键
     */
    public java.lang.Long decisionChainRoleRelaId;

    /**
     * 记录A角色标识，作为外键，指向决策链角色实体
     */
    public java.lang.Long aChainRoleId;

    /**
     * 记录Z角色标识，作为外键，指向决策链角色实体
     */
    public java.lang.Long zChainRoleId;

    /**
     * 记录决策链角色之间的关系类型。LOVB=CUS-C-0018。
     */
    public java.lang.String relType;

    /**
     * 记录描述信息
     */
    public java.lang.String description;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录决策链角色关系标识，作为主键
     */
    public void setDecisionChainRoleRelaId(java.lang.Long decisionChainRoleRelaId) {
        this.decisionChainRoleRelaId = decisionChainRoleRelaId;
    }

    /**
     * 获取 记录决策链角色关系标识，作为主键
     */
    public java.lang.Long getDecisionChainRoleRelaId() {
        return this.decisionChainRoleRelaId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.decisionChainRoleRelaId = SeqUtils.createLongId(ID_SEQ);
         return this.decisionChainRoleRelaId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录A角色标识，作为外键，指向决策链角色实体
     */
    public void setAChainRoleId(java.lang.Long aChainRoleId) {
        this.aChainRoleId = aChainRoleId;
    }

    /**
     * 获取 记录A角色标识，作为外键，指向决策链角色实体
     */
    public java.lang.Long getAChainRoleId() {
        return this.aChainRoleId;
    }

    /**
     * 设置 记录Z角色标识，作为外键，指向决策链角色实体
     */
    public void setZChainRoleId(java.lang.Long zChainRoleId) {
        this.zChainRoleId = zChainRoleId;
    }

    /**
     * 获取 记录Z角色标识，作为外键，指向决策链角色实体
     */
    public java.lang.Long getZChainRoleId() {
        return this.zChainRoleId;
    }

    /**
     * 设置 记录决策链角色之间的关系类型。LOVB=CUS-C-0018。
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录决策链角色之间的关系类型。LOVB=CUS-C-0018。
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录描述信息
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * 获取 记录描述信息
     */
    public java.lang.String getDescription() {
        return this.description;
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
