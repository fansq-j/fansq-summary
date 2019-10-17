package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营销资源的应用分组，简化配置要求。
 * @实体表  :MKT_RES_GRP
 */
public class MktResGrpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_GRP_S";

    /**
     * 营销资源组标识，主键。
     */
    public java.lang.Long mktResGrpId;

    /**
     * 营销资源组标准编码
     */
    public java.lang.String mktResGrpNbr;

    /**
     * 营销资源组名称
     */
    public java.lang.String mktResGrpName;

    /**
     * 营销资源组描述
     */
    public java.lang.String mktResGrpDesc;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
            
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 营销资源组标识，主键。
     */
    public void setMktResGrpId(java.lang.Long mktResGrpId) {
        this.mktResGrpId = mktResGrpId;
    }

    /**
     * 获取 营销资源组标识，主键。
     */
    public java.lang.Long getMktResGrpId() {
        return this.mktResGrpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResGrpId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResGrpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源组标准编码
     */
    public void setMktResGrpNbr(java.lang.String mktResGrpNbr) {
        this.mktResGrpNbr = mktResGrpNbr;
    }

    /**
     * 获取 营销资源组标准编码
     */
    public java.lang.String getMktResGrpNbr() {
        return this.mktResGrpNbr;
    }

    /**
     * 设置 营销资源组名称
     */
    public void setMktResGrpName(java.lang.String mktResGrpName) {
        this.mktResGrpName = mktResGrpName;
    }

    /**
     * 获取 营销资源组名称
     */
    public java.lang.String getMktResGrpName() {
        return this.mktResGrpName;
    }

    /**
     * 设置 营销资源组描述
     */
    public void setMktResGrpDesc(java.lang.String mktResGrpDesc) {
        this.mktResGrpDesc = mktResGrpDesc;
    }

    /**
     * 获取 营销资源组描述
     */
    public java.lang.String getMktResGrpDesc() {
        return this.mktResGrpDesc;
    }

    /**
     * 设置 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
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
