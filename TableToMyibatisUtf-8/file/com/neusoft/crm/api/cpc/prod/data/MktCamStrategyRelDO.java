package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销推荐渠道执行策略，定义营销活动的渠道执行策略
 * @实体表  :MKT_CAM_STRATEGY_REL
 */
public class MktCamStrategyRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_CAM_STRATEGY_REL_S";

    /**
     * 营销推荐渠道执行策略标识，主键
     */
    public java.lang.Long campStrRelId;

    /**
     * 营销活动标识
     */
    public java.lang.Long mktCampaignId;

    /**
     * 营销活动脚本标识
     */
    public java.lang.Long strategyId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long lanId;

    /**
     * 设置 营销推荐渠道执行策略标识，主键
     */
    public void setCampStrRelId(java.lang.Long campStrRelId) {
        this.campStrRelId = campStrRelId;
    }

    /**
     * 获取 营销推荐渠道执行策略标识，主键
     */
    public java.lang.Long getCampStrRelId() {
        return this.campStrRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.campStrRelId = SeqUtils.createLongId(ID_SEQ);
         return this.campStrRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销活动标识
     */
    public void setMktCampaignId(java.lang.Long mktCampaignId) {
        this.mktCampaignId = mktCampaignId;
    }

    /**
     * 获取 营销活动标识
     */
    public java.lang.Long getMktCampaignId() {
        return this.mktCampaignId;
    }

    /**
     * 设置 营销活动脚本标识
     */
    public void setStrategyId(java.lang.Long strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * 获取 营销活动脚本标识
     */
    public java.lang.Long getStrategyId() {
        return this.strategyId;
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

    /**
     * 设置 记录本地网标识，数据来源于公共管理区域。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识，数据来源于公共管理区域。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

}
