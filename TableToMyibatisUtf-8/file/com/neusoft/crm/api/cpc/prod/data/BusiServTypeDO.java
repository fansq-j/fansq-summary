package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义电信对外提供的业务服务分类，用户线上预约或线下排号时，需要支撑办理的业务类型
 * @实体表  :BUSI_SERV_TYPE
 */
public class BusiServTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSI_SERV_TYPE_S";

    /**
     * 主键，服务类型标识
     */
    public java.lang.Long servTypeId;

    /**
     * 服务类型编码
     */
    public java.lang.String servTypeNbr;

    /**
     * 服务类型名称
     */
    public java.lang.String servTypeName;

    /**
     * 服务类型英文名称
     */
    public java.lang.String enName;

    /**
     * 上级服务类型标识
     */
    public java.lang.Long parServTypeId;

    /**
     * 服务提供标识
     */
    public java.lang.Long serviceOfferId;

    /**
     * 记录状态，LOVB=PUB-C-0001。
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
     * 设置 主键，服务类型标识
     */
    public void setServTypeId(java.lang.Long servTypeId) {
        this.servTypeId = servTypeId;
    }

    /**
     * 获取 主键，服务类型标识
     */
    public java.lang.Long getServTypeId() {
        return this.servTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.servTypeId = SeqUtils.createLongId(ID_SEQ);
         return this.servTypeId;
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
    public void setServTypeNbr(java.lang.String servTypeNbr) {
        this.servTypeNbr = servTypeNbr;
    }

    /**
     * 获取 服务类型编码
     */
    public java.lang.String getServTypeNbr() {
        return this.servTypeNbr;
    }

    /**
     * 设置 服务类型名称
     */
    public void setServTypeName(java.lang.String servTypeName) {
        this.servTypeName = servTypeName;
    }

    /**
     * 获取 服务类型名称
     */
    public java.lang.String getServTypeName() {
        return this.servTypeName;
    }

    /**
     * 设置 服务类型英文名称
     */
    public void setEnName(java.lang.String enName) {
        this.enName = enName;
    }

    /**
     * 获取 服务类型英文名称
     */
    public java.lang.String getEnName() {
        return this.enName;
    }

    /**
     * 设置 上级服务类型标识
     */
    public void setParServTypeId(java.lang.Long parServTypeId) {
        this.parServTypeId = parServTypeId;
    }

    /**
     * 获取 上级服务类型标识
     */
    public java.lang.Long getParServTypeId() {
        return this.parServTypeId;
    }

    /**
     * 设置 服务提供标识
     */
    public void setServiceOfferId(java.lang.Long serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供标识
     */
    public java.lang.Long getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
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
