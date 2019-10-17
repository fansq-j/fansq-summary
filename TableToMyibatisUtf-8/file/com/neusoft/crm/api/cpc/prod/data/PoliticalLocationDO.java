package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述行政区域可以用“位于”的关系进行如下描述：如国家->省(直辖市、自治区、特别行政区) ->城市->城市行政区->路段
 * @实体表  :POLITICAL_LOCATION
 */
public class PoliticalLocationDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POLITICAL_LOCATION_S";

    /**
     * 行政区域标识
     */
    public java.lang.Long locId;

    /**
     * 上级行政区域标识
     */
    public java.lang.Long parLocId;

    /**
     * 行政区域编码
     */
    public java.lang.String locNbr;

    /**
     * 行政区域名称
     */
    public java.lang.String locName;

    /**
     * 行政区域描述
     */
    public java.lang.String locDesc;

    /**
     * 行政区域类型。LOVB=LOC-0003
     */
    public java.lang.String locType;

    /**
     * 行政区域简拼
     */
    public java.lang.String locAbbr;

    /**
     * 行政区域级别。LOVB=LOC-C-0003
     */
    public java.lang.String locLevel;

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
     * 设置 行政区域标识
     */
    public void setLocId(java.lang.Long locId) {
        this.locId = locId;
    }

    /**
     * 获取 行政区域标识
     */
    public java.lang.Long getLocId() {
        return this.locId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.locId = SeqUtils.createLongId(ID_SEQ);
         return this.locId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 上级行政区域标识
     */
    public void setParLocId(java.lang.Long parLocId) {
        this.parLocId = parLocId;
    }

    /**
     * 获取 上级行政区域标识
     */
    public java.lang.Long getParLocId() {
        return this.parLocId;
    }

    /**
     * 设置 行政区域编码
     */
    public void setLocNbr(java.lang.String locNbr) {
        this.locNbr = locNbr;
    }

    /**
     * 获取 行政区域编码
     */
    public java.lang.String getLocNbr() {
        return this.locNbr;
    }

    /**
     * 设置 行政区域名称
     */
    public void setLocName(java.lang.String locName) {
        this.locName = locName;
    }

    /**
     * 获取 行政区域名称
     */
    public java.lang.String getLocName() {
        return this.locName;
    }

    /**
     * 设置 行政区域描述
     */
    public void setLocDesc(java.lang.String locDesc) {
        this.locDesc = locDesc;
    }

    /**
     * 获取 行政区域描述
     */
    public java.lang.String getLocDesc() {
        return this.locDesc;
    }

    /**
     * 设置 行政区域类型。LOVB=LOC-0003
     */
    public void setLocType(java.lang.String locType) {
        this.locType = locType;
    }

    /**
     * 获取 行政区域类型。LOVB=LOC-0003
     */
    public java.lang.String getLocType() {
        return this.locType;
    }

    /**
     * 设置 行政区域简拼
     */
    public void setLocAbbr(java.lang.String locAbbr) {
        this.locAbbr = locAbbr;
    }

    /**
     * 获取 行政区域简拼
     */
    public java.lang.String getLocAbbr() {
        return this.locAbbr;
    }

    /**
     * 设置 行政区域级别。LOVB=LOC-C-0003
     */
    public void setLocLevel(java.lang.String locLevel) {
        this.locLevel = locLevel;
    }

    /**
     * 获取 行政区域级别。LOVB=LOC-C-0003
     */
    public java.lang.String getLocLevel() {
        return this.locLevel;
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
