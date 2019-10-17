package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营销活动、触点事件的渠道执行脚本，同一营销活动或触点事件的不同渠道执行环节可以配置不同的营销脚本
 * @实体表  :MKT_CAM_SCRIPT
 */
public class MktCamScriptDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_CAM_SCRIPT_S";

    /**
     * 营销活动脚本标识，主键
     */
    public java.lang.Long mktCampaignScptId;

    /**
     * 营销活动标识
     */
    public java.lang.Long mktCampaignId;

    /**
     * 事件推送策略标识
     */
    public java.lang.Long evtContactConfId;

    /**
     * 记录营销活动该渠道执行环节的具体脚本内容
     */
    public java.lang.String scriptDesc;

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
     * 设置 营销活动脚本标识，主键
     */
    public void setMktCampaignScptId(java.lang.Long mktCampaignScptId) {
        this.mktCampaignScptId = mktCampaignScptId;
    }

    /**
     * 获取 营销活动脚本标识，主键
     */
    public java.lang.Long getMktCampaignScptId() {
        return this.mktCampaignScptId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktCampaignScptId = SeqUtils.createLongId(ID_SEQ);
         return this.mktCampaignScptId;
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
     * 设置 事件推送策略标识
     */
    public void setEvtContactConfId(java.lang.Long evtContactConfId) {
        this.evtContactConfId = evtContactConfId;
    }

    /**
     * 获取 事件推送策略标识
     */
    public java.lang.Long getEvtContactConfId() {
        return this.evtContactConfId;
    }

    /**
     * 设置 记录营销活动该渠道执行环节的具体脚本内容
     */
    public void setScriptDesc(java.lang.String scriptDesc) {
        this.scriptDesc = scriptDesc;
    }

    /**
     * 获取 记录营销活动该渠道执行环节的具体脚本内容
     */
    public java.lang.String getScriptDesc() {
        return this.scriptDesc;
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
