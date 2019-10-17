package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:量本类型组. ( 新增一种量本类型，所有资费标准要调整,考虑增加量本类型组,减少配置量. )  在量本扣减时用.
 * @实体表  :ACCU_TYPE_GROUP
 */
public class AccuTypeGroupDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCU_TYPE_GROUP_S";

    /**
     * 量本类型组标识
     */
    public java.lang.Integer accuTypeGroupId;

    /**
     * 量本类型组名称
     */
    public java.lang.String accuTypeGroupName;

    /**
     * 区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 状态.LOVB=PRC-C-0026.
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
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 量本类型组标识
     */
    public void setAccuTypeGroupId(java.lang.Integer accuTypeGroupId) {
        this.accuTypeGroupId = accuTypeGroupId;
    }

    /**
     * 获取 量本类型组标识
     */
    public java.lang.Integer getAccuTypeGroupId() {
        return this.accuTypeGroupId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.accuTypeGroupId = SeqUtils.createIntegerId(ID_SEQ);
         return this.accuTypeGroupId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 量本类型组名称
     */
    public void setAccuTypeGroupName(java.lang.String accuTypeGroupName) {
        this.accuTypeGroupName = accuTypeGroupName;
    }

    /**
     * 获取 量本类型组名称
     */
    public java.lang.String getAccuTypeGroupName() {
        return this.accuTypeGroupName;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
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

}
