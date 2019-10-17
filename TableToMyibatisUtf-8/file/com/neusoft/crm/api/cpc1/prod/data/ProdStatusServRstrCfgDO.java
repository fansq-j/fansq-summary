package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:配置产品的同户实例在某种状态下，对服务提供的受理约束；例如：用户在欠费停机状态
 * @实体表  :PROD_STATUS_SERV_RSTR_CFG
 */
public class ProdStatusServRstrCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_STATUS_SERV_RSTR_CFG_S";

    /**
     * 产品状态服务提供约束配置标识
     */
    public java.lang.Long cfgId;

    /**
     * 产品标识
     */
    public java.lang.Integer prodId;

    /**
     * 服务提供标识
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 产品的实例状态，LOVB=PRD-0006
     */
    public java.lang.String prodStatusCd;

    /**
     * 记录约束类型，LOVB=PRD-C-0022
     */
    public java.lang.String rstrType;

    /**
     * 提示信息的具体内容
     */
    public java.lang.String promptMsg;

    /**
     * 适用区域标识，指向公共管理区域
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录产品实例的停机类型。LOVB=PRI-0018
     */
    public java.lang.String stopType;

    /**
     * 产品实例状态 判断 0：包含（等于）1：不包含（不等于）
     */
    public java.lang.Integer conditionType;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态的变更时间
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 产品状态服务提供约束配置标识
     */
    public void setCfgId(java.lang.Long cfgId) {
        this.cfgId = cfgId;
    }

    /**
     * 获取 产品状态服务提供约束配置标识
     */
    public java.lang.Long getCfgId() {
        return this.cfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.cfgId = SeqUtils.createLongId(ID_SEQ);
         return this.cfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 产品标识
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品标识
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 服务提供标识
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供标识
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 产品的实例状态，LOVB=PRD-0006
     */
    public void setProdStatusCd(java.lang.String prodStatusCd) {
        this.prodStatusCd = prodStatusCd;
    }

    /**
     * 获取 产品的实例状态，LOVB=PRD-0006
     */
    public java.lang.String getProdStatusCd() {
        return this.prodStatusCd;
    }

    /**
     * 设置 记录约束类型，LOVB=PRD-C-0022
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 记录约束类型，LOVB=PRD-C-0022
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 提示信息的具体内容
     */
    public void setPromptMsg(java.lang.String promptMsg) {
        this.promptMsg = promptMsg;
    }

    /**
     * 获取 提示信息的具体内容
     */
    public java.lang.String getPromptMsg() {
        return this.promptMsg;
    }

    /**
     * 设置 适用区域标识，指向公共管理区域
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识，指向公共管理区域
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录产品实例的停机类型。LOVB=PRI-0018
     */
    public void setStopType(java.lang.String stopType) {
        this.stopType = stopType;
    }

    /**
     * 获取 记录产品实例的停机类型。LOVB=PRI-0018
     */
    public java.lang.String getStopType() {
        return this.stopType;
    }

    /**
     * 设置 产品实例状态 判断 0：包含（等于）1：不包含（不等于）
     */
    public void setConditionType(java.lang.Integer conditionType) {
        this.conditionType = conditionType;
    }

    /**
     * 获取 产品实例状态 判断 0：包含（等于）1：不包含（不等于）
     */
    public java.lang.Integer getConditionType() {
        return this.conditionType;
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
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态的变更时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的变更时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

}
