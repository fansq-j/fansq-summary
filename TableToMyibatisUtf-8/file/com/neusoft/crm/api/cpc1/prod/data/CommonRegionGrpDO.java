package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:区域组表。
 * @实体表  :COMMON_REGION_GRP
 */
public class CommonRegionGrpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COMMON_REGION_GRP_S";

    /**
     * 公共管理区域组标识
     */
    public java.lang.Long commonRegionGrpId;

    /**
     * 上级区域组标识
     */
    public java.lang.Long parRegionGrpId;

    /**
     * 区域组名称
     */
    public java.lang.String regionGrpName;

    /**
     * 区域组编码
     */
    public java.lang.String regionGrpNbr;

    /**
     * 区域组描述
     */
    public java.lang.String regionGrpDesc;

    /**
     * 状态
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
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 公共管理区域组标识
     */
    public void setCommonRegionGrpId(java.lang.Long commonRegionGrpId) {
        this.commonRegionGrpId = commonRegionGrpId;
    }

    /**
     * 获取 公共管理区域组标识
     */
    public java.lang.Long getCommonRegionGrpId() {
        return this.commonRegionGrpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.commonRegionGrpId = SeqUtils.createLongId(ID_SEQ);
         return this.commonRegionGrpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 上级区域组标识
     */
    public void setParRegionGrpId(java.lang.Long parRegionGrpId) {
        this.parRegionGrpId = parRegionGrpId;
    }

    /**
     * 获取 上级区域组标识
     */
    public java.lang.Long getParRegionGrpId() {
        return this.parRegionGrpId;
    }

    /**
     * 设置 区域组名称
     */
    public void setRegionGrpName(java.lang.String regionGrpName) {
        this.regionGrpName = regionGrpName;
    }

    /**
     * 获取 区域组名称
     */
    public java.lang.String getRegionGrpName() {
        return this.regionGrpName;
    }

    /**
     * 设置 区域组编码
     */
    public void setRegionGrpNbr(java.lang.String regionGrpNbr) {
        this.regionGrpNbr = regionGrpNbr;
    }

    /**
     * 获取 区域组编码
     */
    public java.lang.String getRegionGrpNbr() {
        return this.regionGrpNbr;
    }

    /**
     * 设置 区域组描述
     */
    public void setRegionGrpDesc(java.lang.String regionGrpDesc) {
        this.regionGrpDesc = regionGrpDesc;
    }

    /**
     * 获取 区域组描述
     */
    public java.lang.String getRegionGrpDesc() {
        return this.regionGrpDesc;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
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
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
