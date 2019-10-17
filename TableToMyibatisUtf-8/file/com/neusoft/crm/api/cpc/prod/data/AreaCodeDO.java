package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指电话区号，如010是北京的区号。
 * @实体表  :AREA_CODE
 */
public class AreaCodeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AREA_CODE_S";

    /**
     * 记录区号标识。
     */
    public java.lang.Long areaCodeId;

    /**
     * 记录公共管理区域标识。
     */
    public java.lang.Long regionId;

    /**
     * 记录区号编码。
     */
    public java.lang.String areaNbr;

    /**
     * 记录区号。
     */
    public java.lang.String areaCode;

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
     * 设置 记录区号标识。
     */
    public void setAreaCodeId(java.lang.Long areaCodeId) {
        this.areaCodeId = areaCodeId;
    }

    /**
     * 获取 记录区号标识。
     */
    public java.lang.Long getAreaCodeId() {
        return this.areaCodeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.areaCodeId = SeqUtils.createLongId(ID_SEQ);
         return this.areaCodeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录公共管理区域标识。
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录公共管理区域标识。
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录区号编码。
     */
    public void setAreaNbr(java.lang.String areaNbr) {
        this.areaNbr = areaNbr;
    }

    /**
     * 获取 记录区号编码。
     */
    public java.lang.String getAreaNbr() {
        return this.areaNbr;
    }

    /**
     * 设置 记录区号。
     */
    public void setAreaCode(java.lang.String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 获取 记录区号。
     */
    public java.lang.String getAreaCode() {
        return this.areaCode;
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
