package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营销维挽活动之间的关系。
父子关系：省公司定义的活动与下发地市做了修改的活动间的关系
接续关
 * @实体表  :MKT_CAMPAIGN_REL
 */
public class MktCampaignRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_CAMPAIGN_REL_S";

    /**
     * 营销维挽活动关系标识
     */
    public java.lang.Long mktCampaignRelId;

    /**
     * 关系类型：LOVB=LOVB=CAM-C-0035。
            父子关系
            接续关系
     */
    public java.lang.String relType;

    /**
     * 记录A端产品标识
     */
    public java.lang.Long aMktCampaignId;

    /**
     * 记录Z端产品标识
     */
    public java.lang.Long zMktCampaignId;

    /**
     * 记录关系的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录关系的失效时间。
     */
    public java.util.Date expDate;

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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 营销维挽活动关系标识
     */
    public void setMktCampaignRelId(java.lang.Long mktCampaignRelId) {
        this.mktCampaignRelId = mktCampaignRelId;
    }

    /**
     * 获取 营销维挽活动关系标识
     */
    public java.lang.Long getMktCampaignRelId() {
        return this.mktCampaignRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktCampaignRelId = SeqUtils.createLongId(ID_SEQ);
         return this.mktCampaignRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 关系类型：LOVB=LOVB=CAM-C-0035。
            父子关系
            接续关系
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 关系类型：LOVB=LOVB=CAM-C-0035。
            父子关系
            接续关系
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录A端产品标识
     */
    public void setAMktCampaignId(java.lang.Long aMktCampaignId) {
        this.aMktCampaignId = aMktCampaignId;
    }

    /**
     * 获取 记录A端产品标识
     */
    public java.lang.Long getAMktCampaignId() {
        return this.aMktCampaignId;
    }

    /**
     * 设置 记录Z端产品标识
     */
    public void setZMktCampaignId(java.lang.Long zMktCampaignId) {
        this.zMktCampaignId = zMktCampaignId;
    }

    /**
     * 获取 记录Z端产品标识
     */
    public java.lang.Long getZMktCampaignId() {
        return this.zMktCampaignId;
    }

    /**
     * 设置 记录关系的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录关系的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录关系的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录关系的失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
