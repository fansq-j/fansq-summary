package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录外部的营销资源型号，方便配置运营时根据营销资源型号一次生成多个营销资源规格信息。
 * @实体表  :MKT_RES_EXTTYPE
 */
public class MktResExttypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_EXTTYPE_S";

    /**
     * 营销资源标识
     */
    public java.lang.Integer mktResExttypeId;

    /**
     * 记录营销资源编码。
     */
    public java.lang.String mktResExttypeNbr;

    /**
     * 营销资源类别标识
     */
    public java.lang.Integer mktResTypeId;

    /**
     * 记录营销资源名称。
     */
    public java.lang.String mktResExttypeName;

    /**
     * 记录营销资源描述。
     */
    public java.lang.String mktResExttypeDesc;

    /**
     * 记录管理区域标识。
     */
    public java.lang.Long manageRegionId;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 备注
     */
    public java.lang.String remark;

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
     * 设置 营销资源标识
     */
    public void setMktResExttypeId(java.lang.Integer mktResExttypeId) {
        this.mktResExttypeId = mktResExttypeId;
    }

    /**
     * 获取 营销资源标识
     */
    public java.lang.Integer getMktResExttypeId() {
        return this.mktResExttypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.mktResExttypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.mktResExttypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录营销资源编码。
     */
    public void setMktResExttypeNbr(java.lang.String mktResExttypeNbr) {
        this.mktResExttypeNbr = mktResExttypeNbr;
    }

    /**
     * 获取 记录营销资源编码。
     */
    public java.lang.String getMktResExttypeNbr() {
        return this.mktResExttypeNbr;
    }

    /**
     * 设置 营销资源类别标识
     */
    public void setMktResTypeId(java.lang.Integer mktResTypeId) {
        this.mktResTypeId = mktResTypeId;
    }

    /**
     * 获取 营销资源类别标识
     */
    public java.lang.Integer getMktResTypeId() {
        return this.mktResTypeId;
    }

    /**
     * 设置 记录营销资源名称。
     */
    public void setMktResExttypeName(java.lang.String mktResExttypeName) {
        this.mktResExttypeName = mktResExttypeName;
    }

    /**
     * 获取 记录营销资源名称。
     */
    public java.lang.String getMktResExttypeName() {
        return this.mktResExttypeName;
    }

    /**
     * 设置 记录营销资源描述。
     */
    public void setMktResExttypeDesc(java.lang.String mktResExttypeDesc) {
        this.mktResExttypeDesc = mktResExttypeDesc;
    }

    /**
     * 获取 记录营销资源描述。
     */
    public java.lang.String getMktResExttypeDesc() {
        return this.mktResExttypeDesc;
    }

    /**
     * 设置 记录管理区域标识。
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录管理区域标识。
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
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
