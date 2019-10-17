package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录基站信息，用于小区优惠的引用或边界漫游的判断CELL区域。
 * @实体表  :CELL_INFO
 */
public class CellInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CELL_INFO_S";

    /**
     * 唯一标识电信设备的序列。
     */
    public java.lang.Long cellInfoId;

    /**
     * CELL信息的指定名称。
     */
    public java.lang.String cellInfoName;

    /**
     * 移动交换中心标识，来源OSS。
     */
    public java.lang.String mscId;

    /**
     * 移动通信系统中位置区码标识，来源OSS。
     */
    public java.lang.String lacId;

    /**
     * CELL编码
     */
    public java.lang.String cellId;

    /**
     * 生效时间。
     */
    public java.util.Date effDate;

    /**
     * 失效时间。
     */
    public java.util.Date expDate;

    /**
     * 归属区域标识，指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录实例信息创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次信息变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录任何变动时，修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 唯一标识电信设备的序列。
     */
    public void setCellInfoId(java.lang.Long cellInfoId) {
        this.cellInfoId = cellInfoId;
    }

    /**
     * 获取 唯一标识电信设备的序列。
     */
    public java.lang.Long getCellInfoId() {
        return this.cellInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.cellInfoId = SeqUtils.createLongId(ID_SEQ);
         return this.cellInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 CELL信息的指定名称。
     */
    public void setCellInfoName(java.lang.String cellInfoName) {
        this.cellInfoName = cellInfoName;
    }

    /**
     * 获取 CELL信息的指定名称。
     */
    public java.lang.String getCellInfoName() {
        return this.cellInfoName;
    }

    /**
     * 设置 移动交换中心标识，来源OSS。
     */
    public void setMscId(java.lang.String mscId) {
        this.mscId = mscId;
    }

    /**
     * 获取 移动交换中心标识，来源OSS。
     */
    public java.lang.String getMscId() {
        return this.mscId;
    }

    /**
     * 设置 移动通信系统中位置区码标识，来源OSS。
     */
    public void setLacId(java.lang.String lacId) {
        this.lacId = lacId;
    }

    /**
     * 获取 移动通信系统中位置区码标识，来源OSS。
     */
    public java.lang.String getLacId() {
        return this.lacId;
    }

    /**
     * 设置 CELL编码
     */
    public void setCellId(java.lang.String cellId) {
        this.cellId = cellId;
    }

    /**
     * 获取 CELL编码
     */
    public java.lang.String getCellId() {
        return this.cellId;
    }

    /**
     * 设置 生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 归属区域标识，指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识，指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
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
     * 设置 记录实例信息创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录实例信息创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次信息变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录每次信息变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录任何变动时，修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录任何变动时，修改的时间。
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
