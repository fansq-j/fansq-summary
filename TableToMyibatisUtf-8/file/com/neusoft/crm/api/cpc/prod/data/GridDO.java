package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:网格是以地域上可划分的最小单元的各种属性进行归并得到的，以区域特征为第一特征的客户群管理单元。小网格是地域上可划分的最小
 * @实体表  :GRID
 */
public class GridDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GRID_S";

    /**
     * 网格标识
     */
    public java.lang.Long gridId;

    /**
     * 网格编码
     */
    public java.lang.String gridNbr;

    /**
     * 网格名称
     */
    public java.lang.String gridName;

    /**
     * 网格类型。LOVB=CHN-C-0002
            
     */
    public java.lang.String gridType;

    /**
     * 记录公共管理区域标识
     */
    public java.lang.Long commonRegionId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

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
     * 设置 网格标识
     */
    public void setGridId(java.lang.Long gridId) {
        this.gridId = gridId;
    }

    /**
     * 获取 网格标识
     */
    public java.lang.Long getGridId() {
        return this.gridId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.gridId = SeqUtils.createLongId(ID_SEQ);
         return this.gridId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 网格编码
     */
    public void setGridNbr(java.lang.String gridNbr) {
        this.gridNbr = gridNbr;
    }

    /**
     * 获取 网格编码
     */
    public java.lang.String getGridNbr() {
        return this.gridNbr;
    }

    /**
     * 设置 网格名称
     */
    public void setGridName(java.lang.String gridName) {
        this.gridName = gridName;
    }

    /**
     * 获取 网格名称
     */
    public java.lang.String getGridName() {
        return this.gridName;
    }

    /**
     * 设置 网格类型。LOVB=CHN-C-0002
            
     */
    public void setGridType(java.lang.String gridType) {
        this.gridType = gridType;
    }

    /**
     * 获取 网格类型。LOVB=CHN-C-0002
            
     */
    public java.lang.String getGridType() {
        return this.gridType;
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
