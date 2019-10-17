package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录流量识别的基本信息
 * @实体表  :TRAFFIC_IDENTIFY
 */
public class TrafficIdentifyDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TRAFFIC_IDENTIFY_S";

    /**
     * 流量识别的主键。
     */
    public java.lang.Long trafficIdentifyId;

    /**
     * 流量识别的编码。
     */
    public java.lang.String trafficIdentifyNbr;

    /**
     * 流量识别的名称。
     */
    public java.lang.String trafficIdentifyName;

    /**
     * 流量识别的详细描述。
     */
    public java.lang.String trafficIdentifyDesc;

    /**
     * 流量识别的资费说明。
     */
    public java.lang.String billContent;

    /**
     * 流量识别的优先级别。LOVB=PRD-C-0014
     */
    public java.lang.Integer contentRank;

    /**
     * 流量识别的管理级别。LOVB=PRD-C-0015
     */
    public java.lang.String manageGrade;

    /**
     * 流量识别的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 流量识别的失效时间。
     */
    public java.util.Date expDate;

    /**
     * 流量识别的应用系统。LOVB=PRD-C-0016
     */
    public java.lang.String appSys;

    /**
     * 流量识别的适用区域，来源CMMON_REGION_ID.
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
     * 设置 流量识别的主键。
     */
    public void setTrafficIdentifyId(java.lang.Long trafficIdentifyId) {
        this.trafficIdentifyId = trafficIdentifyId;
    }

    /**
     * 获取 流量识别的主键。
     */
    public java.lang.Long getTrafficIdentifyId() {
        return this.trafficIdentifyId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.trafficIdentifyId = SeqUtils.createLongId(ID_SEQ);
         return this.trafficIdentifyId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 流量识别的编码。
     */
    public void setTrafficIdentifyNbr(java.lang.String trafficIdentifyNbr) {
        this.trafficIdentifyNbr = trafficIdentifyNbr;
    }

    /**
     * 获取 流量识别的编码。
     */
    public java.lang.String getTrafficIdentifyNbr() {
        return this.trafficIdentifyNbr;
    }

    /**
     * 设置 流量识别的名称。
     */
    public void setTrafficIdentifyName(java.lang.String trafficIdentifyName) {
        this.trafficIdentifyName = trafficIdentifyName;
    }

    /**
     * 获取 流量识别的名称。
     */
    public java.lang.String getTrafficIdentifyName() {
        return this.trafficIdentifyName;
    }

    /**
     * 设置 流量识别的详细描述。
     */
    public void setTrafficIdentifyDesc(java.lang.String trafficIdentifyDesc) {
        this.trafficIdentifyDesc = trafficIdentifyDesc;
    }

    /**
     * 获取 流量识别的详细描述。
     */
    public java.lang.String getTrafficIdentifyDesc() {
        return this.trafficIdentifyDesc;
    }

    /**
     * 设置 流量识别的资费说明。
     */
    public void setBillContent(java.lang.String billContent) {
        this.billContent = billContent;
    }

    /**
     * 获取 流量识别的资费说明。
     */
    public java.lang.String getBillContent() {
        return this.billContent;
    }

    /**
     * 设置 流量识别的优先级别。LOVB=PRD-C-0014
     */
    public void setContentRank(java.lang.Integer contentRank) {
        this.contentRank = contentRank;
    }

    /**
     * 获取 流量识别的优先级别。LOVB=PRD-C-0014
     */
    public java.lang.Integer getContentRank() {
        return this.contentRank;
    }

    /**
     * 设置 流量识别的管理级别。LOVB=PRD-C-0015
     */
    public void setManageGrade(java.lang.String manageGrade) {
        this.manageGrade = manageGrade;
    }

    /**
     * 获取 流量识别的管理级别。LOVB=PRD-C-0015
     */
    public java.lang.String getManageGrade() {
        return this.manageGrade;
    }

    /**
     * 设置 流量识别的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 流量识别的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 流量识别的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 流量识别的失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 流量识别的应用系统。LOVB=PRD-C-0016
     */
    public void setAppSys(java.lang.String appSys) {
        this.appSys = appSys;
    }

    /**
     * 获取 流量识别的应用系统。LOVB=PRD-C-0016
     */
    public java.lang.String getAppSys() {
        return this.appSys;
    }

    /**
     * 设置 流量识别的适用区域，来源CMMON_REGION_ID.
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 流量识别的适用区域，来源CMMON_REGION_ID.
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
