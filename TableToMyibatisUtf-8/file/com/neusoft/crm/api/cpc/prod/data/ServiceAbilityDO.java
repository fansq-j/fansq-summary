package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录业务能力基本信息
 * @实体表  :SERVICE_ABILITY
 */
public class ServiceAbilityDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SERVICE_ABILITY_S";

    /**
     * 业务能力的主键。
     */
    public java.lang.Long serviceAbilityId;

    /**
     * 记录业务能力的编码，用于IT内部使用。
     */
    public java.lang.String serviceNbr;

    /**
     * 记录业务能力的名称。
     */
    public java.lang.String serviceName;

    /**
     * 记录业务能力的描述。
     */
    public java.lang.String serviceDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工。
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
     * 设置 业务能力的主键。
     */
    public void setServiceAbilityId(java.lang.Long serviceAbilityId) {
        this.serviceAbilityId = serviceAbilityId;
    }

    /**
     * 获取 业务能力的主键。
     */
    public java.lang.Long getServiceAbilityId() {
        return this.serviceAbilityId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.serviceAbilityId = SeqUtils.createLongId(ID_SEQ);
         return this.serviceAbilityId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录业务能力的编码，用于IT内部使用。
     */
    public void setServiceNbr(java.lang.String serviceNbr) {
        this.serviceNbr = serviceNbr;
    }

    /**
     * 获取 记录业务能力的编码，用于IT内部使用。
     */
    public java.lang.String getServiceNbr() {
        return this.serviceNbr;
    }

    /**
     * 设置 记录业务能力的名称。
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取 记录业务能力的名称。
     */
    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    /**
     * 设置 记录业务能力的描述。
     */
    public void setServiceDesc(java.lang.String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    /**
     * 获取 记录业务能力的描述。
     */
    public java.lang.String getServiceDesc() {
        return this.serviceDesc;
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
     * 设置 记录的创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工。
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
