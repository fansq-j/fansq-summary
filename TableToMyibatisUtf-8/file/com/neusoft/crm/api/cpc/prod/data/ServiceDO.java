package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:电信通过各种渠道向客户提供的关怀、咨询、提醒等各类服务的基本信息定义
 * @实体表  :SERVICE
 */
public class ServiceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SERVICE_S";

    /**
     * 服务标识,主键
     */
    public java.lang.Long serviceId;

    /**
     * 服务编码
     */
    public java.lang.String serviceNbr;

    /**
     * 服务名称
     */
    public java.lang.String serviceName;

    /**
     * 对服务内容的描述
     */
    public java.lang.String serviceContent;

    /**
     * 服务类型标识,主键
     */
    public java.lang.Long serviceTypeId;

    /**
     * 记录外部服务标识
     */
    public java.lang.Long extServiceId;

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
     * 设置 服务标识,主键
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 获取 服务标识,主键
     */
    public java.lang.Long getServiceId() {
        return this.serviceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.serviceId = SeqUtils.createLongId(ID_SEQ);
         return this.serviceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 服务编码
     */
    public void setServiceNbr(java.lang.String serviceNbr) {
        this.serviceNbr = serviceNbr;
    }

    /**
     * 获取 服务编码
     */
    public java.lang.String getServiceNbr() {
        return this.serviceNbr;
    }

    /**
     * 设置 服务名称
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取 服务名称
     */
    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    /**
     * 设置 对服务内容的描述
     */
    public void setServiceContent(java.lang.String serviceContent) {
        this.serviceContent = serviceContent;
    }

    /**
     * 获取 对服务内容的描述
     */
    public java.lang.String getServiceContent() {
        return this.serviceContent;
    }

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
     * 设置 记录外部服务标识
     */
    public void setExtServiceId(java.lang.Long extServiceId) {
        this.extServiceId = extServiceId;
    }

    /**
     * 获取 记录外部服务标识
     */
    public java.lang.Long getExtServiceId() {
        return this.extServiceId;
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
