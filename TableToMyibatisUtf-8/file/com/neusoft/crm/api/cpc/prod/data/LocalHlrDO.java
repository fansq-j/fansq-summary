package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录归属HLR网元信息。
 * @实体表  :LOCAL_HLR
 */
public class LocalHlrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LOCAL_HLR_S";

    /**
     * HLR标识
     */
    public java.lang.Integer hlrId;

    /**
     * 网元名称
     */
    public java.lang.String hlrName;

    /**
     * 记录网元类型.LOVB=RES-C-0049
     */
    public java.lang.String hlrType;

    /**
     * 记录网元编码
     */
    public java.lang.String hlrNbr;

    /**
     * 记录适用区域标识。指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 记录号码归属的本地网。
     */
    public java.lang.Long lanId;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

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
     * 设置 HLR标识
     */
    public void setHlrId(java.lang.Integer hlrId) {
        this.hlrId = hlrId;
    }

    /**
     * 获取 HLR标识
     */
    public java.lang.Integer getHlrId() {
        return this.hlrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.hlrId = SeqUtils.createIntegerId(ID_SEQ);
         return this.hlrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 网元名称
     */
    public void setHlrName(java.lang.String hlrName) {
        this.hlrName = hlrName;
    }

    /**
     * 获取 网元名称
     */
    public java.lang.String getHlrName() {
        return this.hlrName;
    }

    /**
     * 设置 记录网元类型.LOVB=RES-C-0049
     */
    public void setHlrType(java.lang.String hlrType) {
        this.hlrType = hlrType;
    }

    /**
     * 获取 记录网元类型.LOVB=RES-C-0049
     */
    public java.lang.String getHlrType() {
        return this.hlrType;
    }

    /**
     * 设置 记录网元编码
     */
    public void setHlrNbr(java.lang.String hlrNbr) {
        this.hlrNbr = hlrNbr;
    }

    /**
     * 获取 记录网元编码
     */
    public java.lang.String getHlrNbr() {
        return this.hlrNbr;
    }

    /**
     * 设置 记录适用区域标识。指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录适用区域标识。指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录号码归属的本地网。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录号码归属的本地网。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
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

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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

}
