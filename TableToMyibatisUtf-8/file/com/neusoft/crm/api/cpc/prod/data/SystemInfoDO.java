package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述记录订单、红包、认证等用到系统的详细信息。
 * @实体表  :SYSTEM_INFO
 */
public class SystemInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYSTEM_INFO_S";

    /**
     * 记录系统信息的标识，主键。
     */
    public java.lang.Long systemInfoId;

    /**
     * 记录系统名称。
     */
    public java.lang.String systemName;

    /**
     * 记录系统编码。
     */
    public java.lang.String systemNbr;

    /**
     * 记录系统类型，LOVB=PUB-C-0017
     */
    public java.lang.String systemType;

    /**
     * 记录系统归属区域。指向公共管理区域标识
     */
    public java.lang.Long regionId;

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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 记录系统信息的标识，主键。
     */
    public void setSystemInfoId(java.lang.Long systemInfoId) {
        this.systemInfoId = systemInfoId;
    }

    /**
     * 获取 记录系统信息的标识，主键。
     */
    public java.lang.Long getSystemInfoId() {
        return this.systemInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.systemInfoId = SeqUtils.createLongId(ID_SEQ);
         return this.systemInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录系统名称。
     */
    public void setSystemName(java.lang.String systemName) {
        this.systemName = systemName;
    }

    /**
     * 获取 记录系统名称。
     */
    public java.lang.String getSystemName() {
        return this.systemName;
    }

    /**
     * 设置 记录系统编码。
     */
    public void setSystemNbr(java.lang.String systemNbr) {
        this.systemNbr = systemNbr;
    }

    /**
     * 获取 记录系统编码。
     */
    public java.lang.String getSystemNbr() {
        return this.systemNbr;
    }

    /**
     * 设置 记录系统类型，LOVB=PUB-C-0017
     */
    public void setSystemType(java.lang.String systemType) {
        this.systemType = systemType;
    }

    /**
     * 获取 记录系统类型，LOVB=PUB-C-0017
     */
    public java.lang.String getSystemType() {
        return this.systemType;
    }

    /**
     * 设置 记录系统归属区域。指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录系统归属区域。指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
