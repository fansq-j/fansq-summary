package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录网格单元基本信息
 * @实体表  :GRID_UNIT
 */
public class GridUnitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GRID_UNIT_S";

    /**
     * 网格单元标识
     */
    public java.lang.Long gridUnitId;

    /**
     * 网格单元名称
     */
    public java.lang.String gridUnitName;

    /**
     * 网格单元编码
     */
    public java.lang.String gridUnitCode;

    /**
     * 网格单元类型。LOVB=CHN-C-0003
            
     */
    public java.lang.String gridUnitType;

    /**
     * 网格单元子类型。LOVB=CHN-C-0004
            
            
     */
    public java.lang.String gridUnitSubType;

    /**
     * 网格单元地址
     */
    public java.lang.String gridUnitAddress;

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
     * 记录公共管理区域标识
     */
    public java.lang.Long commonRegionId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

    /**
     * 设置 网格单元标识
     */
    public void setGridUnitId(java.lang.Long gridUnitId) {
        this.gridUnitId = gridUnitId;
    }

    /**
     * 获取 网格单元标识
     */
    public java.lang.Long getGridUnitId() {
        return this.gridUnitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.gridUnitId = SeqUtils.createLongId(ID_SEQ);
         return this.gridUnitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 网格单元名称
     */
    public void setGridUnitName(java.lang.String gridUnitName) {
        this.gridUnitName = gridUnitName;
    }

    /**
     * 获取 网格单元名称
     */
    public java.lang.String getGridUnitName() {
        return this.gridUnitName;
    }

    /**
     * 设置 网格单元编码
     */
    public void setGridUnitCode(java.lang.String gridUnitCode) {
        this.gridUnitCode = gridUnitCode;
    }

    /**
     * 获取 网格单元编码
     */
    public java.lang.String getGridUnitCode() {
        return this.gridUnitCode;
    }

    /**
     * 设置 网格单元类型。LOVB=CHN-C-0003
            
     */
    public void setGridUnitType(java.lang.String gridUnitType) {
        this.gridUnitType = gridUnitType;
    }

    /**
     * 获取 网格单元类型。LOVB=CHN-C-0003
            
     */
    public java.lang.String getGridUnitType() {
        return this.gridUnitType;
    }

    /**
     * 设置 网格单元子类型。LOVB=CHN-C-0004
            
            
     */
    public void setGridUnitSubType(java.lang.String gridUnitSubType) {
        this.gridUnitSubType = gridUnitSubType;
    }

    /**
     * 获取 网格单元子类型。LOVB=CHN-C-0004
            
            
     */
    public java.lang.String getGridUnitSubType() {
        return this.gridUnitSubType;
    }

    /**
     * 设置 网格单元地址
     */
    public void setGridUnitAddress(java.lang.String gridUnitAddress) {
        this.gridUnitAddress = gridUnitAddress;
    }

    /**
     * 获取 网格单元地址
     */
    public java.lang.String getGridUnitAddress() {
        return this.gridUnitAddress;
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

    /**
     * 设置 记录公共管理区域标识
     */
    public void setCommonRegionId(java.lang.Long commonRegionId) {
        this.commonRegionId = commonRegionId;
    }

    /**
     * 获取 记录公共管理区域标识
     */
    public java.lang.Long getCommonRegionId() {
        return this.commonRegionId;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

}
