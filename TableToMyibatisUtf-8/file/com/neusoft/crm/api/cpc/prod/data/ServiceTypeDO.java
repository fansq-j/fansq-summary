package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:电信通过各种渠道向客户提供的关怀、咨询、提醒等各类服务的分类信息定义
 * @实体表  :SERVICE_TYPE
 */
public class ServiceTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SERVICE_TYPE_S";

    /**
     * 服务类型标识,主键
     */
    public java.lang.Long serviceTypeId;

    /**
     * 服务类型编码
     */
    public java.lang.String serviceTypeNbr;

    /**
     * 服务类型名称
     */
    public java.lang.String serviceTypeName;

    /**
     * 上级服务类型标识
     */
    public java.lang.Long parServiceTypeId;

    /**
     * 记录外部服务类型标识
     */
    public java.lang.Long extServiceTypeId;

    /**
     * 服务的详细描述
     */
    public java.lang.String serviceTypeDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 服务类型标识,主键
     */
    public void setServiceTypeId(java.lang.Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * 获取 服务类型标识,主键
     */
    public java.lang.Long getServiceTypeId() {
        return this.serviceTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.serviceTypeId = SeqUtils.createLongId(ID_SEQ);
         return this.serviceTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 服务类型编码
     */
    public void setServiceTypeNbr(java.lang.String serviceTypeNbr) {
        this.serviceTypeNbr = serviceTypeNbr;
    }

    /**
     * 获取 服务类型编码
     */
    public java.lang.String getServiceTypeNbr() {
        return this.serviceTypeNbr;
    }

    /**
     * 设置 服务类型名称
     */
    public void setServiceTypeName(java.lang.String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    /**
     * 获取 服务类型名称
     */
    public java.lang.String getServiceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * 设置 上级服务类型标识
     */
    public void setParServiceTypeId(java.lang.Long parServiceTypeId) {
        this.parServiceTypeId = parServiceTypeId;
    }

    /**
     * 获取 上级服务类型标识
     */
    public java.lang.Long getParServiceTypeId() {
        return this.parServiceTypeId;
    }

    /**
     * 设置 记录外部服务类型标识
     */
    public void setExtServiceTypeId(java.lang.Long extServiceTypeId) {
        this.extServiceTypeId = extServiceTypeId;
    }

    /**
     * 获取 记录外部服务类型标识
     */
    public java.lang.Long getExtServiceTypeId() {
        return this.extServiceTypeId;
    }

    /**
     * 设置 服务的详细描述
     */
    public void setServiceTypeDesc(java.lang.String serviceTypeDesc) {
        this.serviceTypeDesc = serviceTypeDesc;
    }

    /**
     * 获取 服务的详细描述
     */
    public java.lang.String getServiceTypeDesc() {
        return this.serviceTypeDesc;
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
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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
