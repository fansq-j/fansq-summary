package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销活动、算法、算法规则的关联表；
 * @实体表  :MKT_CAM_RECOM_CALC_REL
 */
public class MktCamRecomCalcRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_CAM_RECOM_CALC_REL_S";

    /**
     * 事件算法规则关联标识
     */
    public java.lang.Long evtRecomCalcRelId;

    /**
     * 营销活动标识
     */
    public java.lang.Long mktCampaignId;

    /**
     * 算法定义标识
     */
    public java.lang.Integer algoId;

    /**
     * 算法规则标识
     */
    public java.lang.Long algorithmsRulId;

    /**
     * 优先级
     */
    public java.lang.Integer priority;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 事件算法规则关联标识
     */
    public void setEvtRecomCalcRelId(java.lang.Long evtRecomCalcRelId) {
        this.evtRecomCalcRelId = evtRecomCalcRelId;
    }

    /**
     * 获取 事件算法规则关联标识
     */
    public java.lang.Long getEvtRecomCalcRelId() {
        return this.evtRecomCalcRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evtRecomCalcRelId = SeqUtils.createLongId(ID_SEQ);
         return this.evtRecomCalcRelId;
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
     * 设置 算法定义标识
     */
    public void setAlgoId(java.lang.Integer algoId) {
        this.algoId = algoId;
    }

    /**
     * 获取 算法定义标识
     */
    public java.lang.Integer getAlgoId() {
        return this.algoId;
    }

    /**
     * 设置 算法规则标识
     */
    public void setAlgorithmsRulId(java.lang.Long algorithmsRulId) {
        this.algorithmsRulId = algorithmsRulId;
    }

    /**
     * 获取 算法规则标识
     */
    public java.lang.Long getAlgorithmsRulId() {
        return this.algorithmsRulId;
    }

    /**
     * 设置 优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
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
