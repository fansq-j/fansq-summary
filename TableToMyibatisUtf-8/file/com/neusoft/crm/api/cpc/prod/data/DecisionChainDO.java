package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:决策链
 * @实体表  :DECISION_CHAIN
 */
public class DecisionChainDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DECISION_CHAIN_S";

    /**
     * 记录决策链标识，作为主键
     */
    public java.lang.Long decisionChainId;

    /**
     * 记录决策链业务类型；LOVB=CUS-C-0008。
     */
    public java.lang.String decisionType;

    /**
     * 记录决策链详细信息
     */
    public java.lang.String decisionChainDesc;

    /**
     * 决策链对象类型，LOVB=CUS-C-0023
     */
    public java.lang.String objType;

    /**
     * 决策链对象标识，作为外键，指向对象类型对应的实体
     */
    public java.lang.Long objId;

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
     * 设置 记录决策链标识，作为主键
     */
    public void setDecisionChainId(java.lang.Long decisionChainId) {
        this.decisionChainId = decisionChainId;
    }

    /**
     * 获取 记录决策链标识，作为主键
     */
    public java.lang.Long getDecisionChainId() {
        return this.decisionChainId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.decisionChainId = SeqUtils.createLongId(ID_SEQ);
         return this.decisionChainId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录决策链业务类型；LOVB=CUS-C-0008。
     */
    public void setDecisionType(java.lang.String decisionType) {
        this.decisionType = decisionType;
    }

    /**
     * 获取 记录决策链业务类型；LOVB=CUS-C-0008。
     */
    public java.lang.String getDecisionType() {
        return this.decisionType;
    }

    /**
     * 设置 记录决策链详细信息
     */
    public void setDecisionChainDesc(java.lang.String decisionChainDesc) {
        this.decisionChainDesc = decisionChainDesc;
    }

    /**
     * 获取 记录决策链详细信息
     */
    public java.lang.String getDecisionChainDesc() {
        return this.decisionChainDesc;
    }

    /**
     * 设置 决策链对象类型，LOVB=CUS-C-0023
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 决策链对象类型，LOVB=CUS-C-0023
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 决策链对象标识，作为外键，指向对象类型对应的实体
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 决策链对象标识，作为外键，指向对象类型对应的实体
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
