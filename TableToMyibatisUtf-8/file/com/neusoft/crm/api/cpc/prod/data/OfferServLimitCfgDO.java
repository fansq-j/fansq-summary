package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品在有效期内销售品及其构成能办理的服务限制
 * @实体表  :OFFER_SERV_LIMIT_CFG
 */
public class OfferServLimitCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_SERV_LIMIT_CFG_S";

    /**
     * 服务限制标识，主键
     */
    public java.lang.Long servLimitCfgId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 限制对象类型。LOVB=OFF-C-0026
     */
    public java.lang.String objType;

    /**
     * 限制对象标识
     */
    public java.lang.Long objId;

    /**
     * 服务提供标识
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 时间限制的类型。LOVB=OFF-C-0020
     */
    public java.lang.String limitType;

    /**
     * 限制时长
     */
    public java.lang.Integer limitTime;

    /**
     * 时长单位。LOVB=OFF-C-0022
     */
    public java.lang.String timeUnit;

    /**
     * 限制时间
     */
    public java.util.Date limitDate;

    /**
     * 记录限制类型。LOVB=OFF-C-0021
     */
    public java.lang.String operType;

    /**
     * 描述
     */
    public java.lang.String description;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 服务限制标识，主键
     */
    public void setServLimitCfgId(java.lang.Long servLimitCfgId) {
        this.servLimitCfgId = servLimitCfgId;
    }

    /**
     * 获取 服务限制标识，主键
     */
    public java.lang.Long getServLimitCfgId() {
        return this.servLimitCfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.servLimitCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.servLimitCfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 限制对象类型。LOVB=OFF-C-0026
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 限制对象类型。LOVB=OFF-C-0026
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 限制对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 限制对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
     * 设置 时间限制的类型。LOVB=OFF-C-0020
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }

    /**
     * 获取 时间限制的类型。LOVB=OFF-C-0020
     */
    public java.lang.String getLimitType() {
        return this.limitType;
    }

    /**
     * 设置 限制时长
     */
    public void setLimitTime(java.lang.Integer limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * 获取 限制时长
     */
    public java.lang.Integer getLimitTime() {
        return this.limitTime;
    }

    /**
     * 设置 时长单位。LOVB=OFF-C-0022
     */
    public void setTimeUnit(java.lang.String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * 获取 时长单位。LOVB=OFF-C-0022
     */
    public java.lang.String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * 设置 限制时间
     */
    public void setLimitDate(java.util.Date limitDate) {
        this.limitDate = limitDate;
    }

    /**
     * 获取 限制时间
     */
    public java.util.Date getLimitDate() {
        return this.limitDate;
    }

    /**
     * 设置 记录限制类型。LOVB=OFF-C-0021
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 记录限制类型。LOVB=OFF-C-0021
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 描述
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * 获取 描述
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
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
     * 设置 记录的创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
