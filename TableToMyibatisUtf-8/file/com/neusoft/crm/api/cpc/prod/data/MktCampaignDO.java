package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:营销维挽活动是指在一段时间内，使用某种方法来达成特定的营销目标或执行特定的营销维挽方案的市场活动。
 * @实体表  :MKT_CAMPAIGN
 */
public class MktCampaignDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_CAMPAIGN_S";

    /**
     * 营销活动标识，主键
     */
    public java.lang.Long mktCampaignId;

    /**
     * 营销活动触发类型，区分是：批量营销活动、实时营销活动,LOVB=CAM-C-0009
     */
    public java.lang.String tiggerType;

    /**
     * 定义营销活动名称。
     */
    public java.lang.String mktCampaignName;

    /**
     * 记录计划开始时间。
     */
    public java.util.Date planBeginTime;

    /**
     * 记录计划结束时间。
     */
    public java.util.Date planEndTime;

    /**
     * 记录实际开始时间。
     */
    public java.util.Date beginTime;

    /**
     * 记录实际结束时间。
     */
    public java.util.Date endTime;

    /**
     * 记录营销活动分类，LOVB=CAM-C-0033
     */
    public java.lang.String mktCampaignType;

    /**
     * 分配营销活动编号。LOVB=CAM-C-0036
     */
    public java.lang.String mktActivityNbr;

    /**
     * 记录对营销活动目标的描述。
     */
    public java.lang.String mktActivityTarget;

    /**
     * 记录营销活动的详细描述。
     */
    public java.lang.String mktCampaignDesc;

    /**
     * 营销活动执行类型,LOVB=CAM-C-0034
            一次性
            周期性
     */
    public java.lang.String execType;

    /**
     * 记录周期性营销活动执行的间隔时长
     */
    public java.lang.String execInvl;

    /**
     * 记录周期性营销活动总的执行次数
     */
    public java.lang.Integer execNum;

    /**
     * 根据管控方式的不同，可以分为框架活动、 强制活动和自主活动。LOVB=CAM-C-0037
     */
    public java.lang.String manageType;

    /**
     * 记录营销维挽活动外部编码，用于两级交互
     */
    public java.lang.String extMktCampaignId;

    /**
     * 记录营销活动状态,LOVB=CAM-0001
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
     * 记录区域标识，数据来源于公共管理区域。
     */
    public java.lang.Long regionId;

    /**
     * 设置 营销活动标识，主键
     */
    public void setMktCampaignId(java.lang.Long mktCampaignId) {
        this.mktCampaignId = mktCampaignId;
    }

    /**
     * 获取 营销活动标识，主键
     */
    public java.lang.Long getMktCampaignId() {
        return this.mktCampaignId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktCampaignId = SeqUtils.createLongId(ID_SEQ);
         return this.mktCampaignId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销活动触发类型，区分是：批量营销活动、实时营销活动,LOVB=CAM-C-0009
     */
    public void setTiggerType(java.lang.String tiggerType) {
        this.tiggerType = tiggerType;
    }

    /**
     * 获取 营销活动触发类型，区分是：批量营销活动、实时营销活动,LOVB=CAM-C-0009
     */
    public java.lang.String getTiggerType() {
        return this.tiggerType;
    }

    /**
     * 设置 定义营销活动名称。
     */
    public void setMktCampaignName(java.lang.String mktCampaignName) {
        this.mktCampaignName = mktCampaignName;
    }

    /**
     * 获取 定义营销活动名称。
     */
    public java.lang.String getMktCampaignName() {
        return this.mktCampaignName;
    }

    /**
     * 设置 记录计划开始时间。
     */
    public void setPlanBeginTime(java.util.Date planBeginTime) {
        this.planBeginTime = planBeginTime;
    }

    /**
     * 获取 记录计划开始时间。
     */
    public java.util.Date getPlanBeginTime() {
        return this.planBeginTime;
    }

    /**
     * 设置 记录计划结束时间。
     */
    public void setPlanEndTime(java.util.Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    /**
     * 获取 记录计划结束时间。
     */
    public java.util.Date getPlanEndTime() {
        return this.planEndTime;
    }

    /**
     * 设置 记录实际开始时间。
     */
    public void setBeginTime(java.util.Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取 记录实际开始时间。
     */
    public java.util.Date getBeginTime() {
        return this.beginTime;
    }

    /**
     * 设置 记录实际结束时间。
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 记录实际结束时间。
     */
    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * 设置 记录营销活动分类，LOVB=CAM-C-0033
     */
    public void setMktCampaignType(java.lang.String mktCampaignType) {
        this.mktCampaignType = mktCampaignType;
    }

    /**
     * 获取 记录营销活动分类，LOVB=CAM-C-0033
     */
    public java.lang.String getMktCampaignType() {
        return this.mktCampaignType;
    }

    /**
     * 设置 分配营销活动编号。LOVB=CAM-C-0036
     */
    public void setMktActivityNbr(java.lang.String mktActivityNbr) {
        this.mktActivityNbr = mktActivityNbr;
    }

    /**
     * 获取 分配营销活动编号。LOVB=CAM-C-0036
     */
    public java.lang.String getMktActivityNbr() {
        return this.mktActivityNbr;
    }

    /**
     * 设置 记录对营销活动目标的描述。
     */
    public void setMktActivityTarget(java.lang.String mktActivityTarget) {
        this.mktActivityTarget = mktActivityTarget;
    }

    /**
     * 获取 记录对营销活动目标的描述。
     */
    public java.lang.String getMktActivityTarget() {
        return this.mktActivityTarget;
    }

    /**
     * 设置 记录营销活动的详细描述。
     */
    public void setMktCampaignDesc(java.lang.String mktCampaignDesc) {
        this.mktCampaignDesc = mktCampaignDesc;
    }

    /**
     * 获取 记录营销活动的详细描述。
     */
    public java.lang.String getMktCampaignDesc() {
        return this.mktCampaignDesc;
    }

    /**
     * 设置 营销活动执行类型,LOVB=CAM-C-0034
            一次性
            周期性
     */
    public void setExecType(java.lang.String execType) {
        this.execType = execType;
    }

    /**
     * 获取 营销活动执行类型,LOVB=CAM-C-0034
            一次性
            周期性
     */
    public java.lang.String getExecType() {
        return this.execType;
    }

    /**
     * 设置 记录周期性营销活动执行的间隔时长
     */
    public void setExecInvl(java.lang.String execInvl) {
        this.execInvl = execInvl;
    }

    /**
     * 获取 记录周期性营销活动执行的间隔时长
     */
    public java.lang.String getExecInvl() {
        return this.execInvl;
    }

    /**
     * 设置 记录周期性营销活动总的执行次数
     */
    public void setExecNum(java.lang.Integer execNum) {
        this.execNum = execNum;
    }

    /**
     * 获取 记录周期性营销活动总的执行次数
     */
    public java.lang.Integer getExecNum() {
        return this.execNum;
    }

    /**
     * 设置 根据管控方式的不同，可以分为框架活动、 强制活动和自主活动。LOVB=CAM-C-0037
     */
    public void setManageType(java.lang.String manageType) {
        this.manageType = manageType;
    }

    /**
     * 获取 根据管控方式的不同，可以分为框架活动、 强制活动和自主活动。LOVB=CAM-C-0037
     */
    public java.lang.String getManageType() {
        return this.manageType;
    }

    /**
     * 设置 记录营销维挽活动外部编码，用于两级交互
     */
    public void setExtMktCampaignId(java.lang.String extMktCampaignId) {
        this.extMktCampaignId = extMktCampaignId;
    }

    /**
     * 获取 记录营销维挽活动外部编码，用于两级交互
     */
    public java.lang.String getExtMktCampaignId() {
        return this.extMktCampaignId;
    }

    /**
     * 设置 记录营销活动状态,LOVB=CAM-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录营销活动状态,LOVB=CAM-0001
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
     * 设置 记录区域标识，数据来源于公共管理区域。
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录区域标识，数据来源于公共管理区域。
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

}
