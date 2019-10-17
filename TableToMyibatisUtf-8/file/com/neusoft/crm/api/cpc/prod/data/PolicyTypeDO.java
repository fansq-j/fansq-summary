package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义佣金政策业务类型，如：移动新发展、维系服务类、充值缴费类、达量奖励等
 * @实体表  :POLICY_TYPE
 */
public class PolicyTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POLICY_TYPE_S";

    /**
     * 佣金政策模板类型标识
     */
    public java.lang.Integer policyTypeId;

    /**
     * 佣金政策模板名称
     */
    public java.lang.String policyTypeName;

    /**
     * 佣金政策模板描述
     */
    public java.lang.String policyTypeDesc;

    /**
     * 上级模板类型
     */
    public java.lang.Integer orgPolicyTypeId;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 佣金政策模板类型标识
     */
    public void setPolicyTypeId(java.lang.Integer policyTypeId) {
        this.policyTypeId = policyTypeId;
    }

    /**
     * 获取 佣金政策模板类型标识
     */
    public java.lang.Integer getPolicyTypeId() {
        return this.policyTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.policyTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.policyTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 佣金政策模板名称
     */
    public void setPolicyTypeName(java.lang.String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

    /**
     * 获取 佣金政策模板名称
     */
    public java.lang.String getPolicyTypeName() {
        return this.policyTypeName;
    }

    /**
     * 设置 佣金政策模板描述
     */
    public void setPolicyTypeDesc(java.lang.String policyTypeDesc) {
        this.policyTypeDesc = policyTypeDesc;
    }

    /**
     * 获取 佣金政策模板描述
     */
    public java.lang.String getPolicyTypeDesc() {
        return this.policyTypeDesc;
    }

    /**
     * 设置 上级模板类型
     */
    public void setOrgPolicyTypeId(java.lang.Integer orgPolicyTypeId) {
        this.orgPolicyTypeId = orgPolicyTypeId;
    }

    /**
     * 获取 上级模板类型
     */
    public java.lang.Integer getOrgPolicyTypeId() {
        return this.orgPolicyTypeId;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
