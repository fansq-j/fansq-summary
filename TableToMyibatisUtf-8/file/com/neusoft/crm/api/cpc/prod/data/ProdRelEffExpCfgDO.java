package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:产品关系生失效时间配置
 * @实体表  :PROD_REL_EFF_EXP_CFG
 */
public class ProdRelEffExpCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_REL_EFF_EXP_CFG_S";

    /**
     * 生失效时间配置标识
     */
    public java.lang.Long effExpCfgId;

    /**
     * 群组产品的产品标识，此字段主要冗余产品关系的A端产品标识；
     */
    public java.lang.Integer prodId;

    /**
     * 产品关系标识
     */
    public java.lang.Long prodRelId;

    /**
     * 服务提供标识
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 生效基础时间类型：竣工时间、受理时间等。LOVB=PRD-C-0018
     */
    public java.lang.String effBaseType;

    /**
     * 生效方式：立即生效、次月生效等；LOVB=PRD-C-0019
     */
    public java.lang.String effType;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 是否默认。LOVB=PUB-C-0006
     */
    public java.lang.Integer isDefault;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 生失效时间配置标识
     */
    public void setEffExpCfgId(java.lang.Long effExpCfgId) {
        this.effExpCfgId = effExpCfgId;
    }

    /**
     * 获取 生失效时间配置标识
     */
    public java.lang.Long getEffExpCfgId() {
        return this.effExpCfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.effExpCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.effExpCfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 群组产品的产品标识，此字段主要冗余产品关系的A端产品标识；
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 群组产品的产品标识，此字段主要冗余产品关系的A端产品标识；
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 产品关系标识
     */
    public void setProdRelId(java.lang.Long prodRelId) {
        this.prodRelId = prodRelId;
    }

    /**
     * 获取 产品关系标识
     */
    public java.lang.Long getProdRelId() {
        return this.prodRelId;
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
     * 设置 生效基础时间类型：竣工时间、受理时间等。LOVB=PRD-C-0018
     */
    public void setEffBaseType(java.lang.String effBaseType) {
        this.effBaseType = effBaseType;
    }

    /**
     * 获取 生效基础时间类型：竣工时间、受理时间等。LOVB=PRD-C-0018
     */
    public java.lang.String getEffBaseType() {
        return this.effBaseType;
    }

    /**
     * 设置 生效方式：立即生效、次月生效等；LOVB=PRD-C-0019
     */
    public void setEffType(java.lang.String effType) {
        this.effType = effType;
    }

    /**
     * 获取 生效方式：立即生效、次月生效等；LOVB=PRD-C-0019
     */
    public java.lang.String getEffType() {
        return this.effType;
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
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 是否默认。LOVB=PUB-C-0006
     */
    public void setIsDefault(java.lang.Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取 是否默认。LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsDefault() {
        return this.isDefault;
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
