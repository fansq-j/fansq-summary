package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指对于各种专业电信管理区域的共性管理区域信息的抽象表达，包括省公司、本地网、营业区。因为使用目的不同，可以定义不同使用类型的管理区域，如：CRM使用、计费使用、营销使用等。
 * @实体表  :COMMON_REGION
 */
public class CommonRegionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COMMON_REGION_S";

    /**
     * 公共管理区域标识
     */
    public java.lang.Long commonRegionId;

    /**
     * 上级区域标识
     */
    public java.lang.Long parRegionId;

    /**
     * 区域名称
     */
    public java.lang.String regionName;

    /**
     * 区域拼音名称
     */
    public java.lang.String regionPyName;

    /**
     * 区域编码
     */
    public java.lang.String regionNbr;

    /**
     * 区域类型
     */
    public java.lang.String regionType;

    /**
     * 区域描述
     */
    public java.lang.String regionDesc;

    /**
     * 区域级别
     */
    public java.lang.Integer regionLevel;

    /**
     * 区域排序
     */
    public java.lang.Integer regionSort;

    /**
     * 省分编码
     */
    public java.lang.String provinceNbr;

    /**
     * 城乡标识
     */
    public java.lang.String cityFlag;

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
     * 设置 公共管理区域标识
     */
    public void setCommonRegionId(java.lang.Long commonRegionId) {
        this.commonRegionId = commonRegionId;
    }

    /**
     * 获取 公共管理区域标识
     */
    public java.lang.Long getCommonRegionId() {
        return this.commonRegionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.commonRegionId = SeqUtils.createLongId(ID_SEQ);
         return this.commonRegionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 上级区域标识
     */
    public void setParRegionId(java.lang.Long parRegionId) {
        this.parRegionId = parRegionId;
    }

    /**
     * 获取 上级区域标识
     */
    public java.lang.Long getParRegionId() {
        return this.parRegionId;
    }

    /**
     * 设置 区域名称
     */
    public void setRegionName(java.lang.String regionName) {
        this.regionName = regionName;
    }

    /**
     * 获取 区域名称
     */
    public java.lang.String getRegionName() {
        return this.regionName;
    }

    /**
     * 设置 区域拼音名称
     */
    public void setRegionPyName(java.lang.String regionPyName) {
        this.regionPyName = regionPyName;
    }

    /**
     * 获取 区域拼音名称
     */
    public java.lang.String getRegionPyName() {
        return this.regionPyName;
    }

    /**
     * 设置 区域编码
     */
    public void setRegionNbr(java.lang.String regionNbr) {
        this.regionNbr = regionNbr;
    }

    /**
     * 获取 区域编码
     */
    public java.lang.String getRegionNbr() {
        return this.regionNbr;
    }

    /**
     * 设置 区域类型
     */
    public void setRegionType(java.lang.String regionType) {
        this.regionType = regionType;
    }

    /**
     * 获取 区域类型
     */
    public java.lang.String getRegionType() {
        return this.regionType;
    }

    /**
     * 设置 区域描述
     */
    public void setRegionDesc(java.lang.String regionDesc) {
        this.regionDesc = regionDesc;
    }

    /**
     * 获取 区域描述
     */
    public java.lang.String getRegionDesc() {
        return this.regionDesc;
    }

    /**
     * 设置 区域级别
     */
    public void setRegionLevel(java.lang.Integer regionLevel) {
        this.regionLevel = regionLevel;
    }

    /**
     * 获取 区域级别
     */
    public java.lang.Integer getRegionLevel() {
        return this.regionLevel;
    }

    /**
     * 设置 区域排序
     */
    public void setRegionSort(java.lang.Integer regionSort) {
        this.regionSort = regionSort;
    }

    /**
     * 获取 区域排序
     */
    public java.lang.Integer getRegionSort() {
        return this.regionSort;
    }

    /**
     * 设置 省分编码
     */
    public void setProvinceNbr(java.lang.String provinceNbr) {
        this.provinceNbr = provinceNbr;
    }

    /**
     * 获取 省分编码
     */
    public java.lang.String getProvinceNbr() {
        return this.provinceNbr;
    }

    /**
     * 设置 城乡标识
     */
    public void setCityFlag(java.lang.String cityFlag) {
        this.cityFlag = cityFlag;
    }

    /**
     * 获取 城乡标识
     */
    public java.lang.String getCityFlag() {
        return this.cityFlag;
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
