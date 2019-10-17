package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:配置销售品能订购的先决条件：
如产品实例的属性为特定值；
 * @实体表  :OFFER_SALE_LIMIT_CFG
 */
public class OfferSaleLimitCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_SALE_LIMIT_CFG_S";

    /**
     * 订购限制配置标识，主键
     */
    public java.lang.Long saleLimitCfgId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 对象类型，LOVB=OFF-C-0017
     */
    public java.lang.String objType;

    /**
     * 对象标识，如套餐对应的宽带产品构成标识
     */
    public java.lang.Long objId;

    /**
     * 限制条件的类型。LOVB=OFF-C-0018
     */
    public java.lang.String condObjType;

    /**
     * 条件标识：具体的产品属性标识
     */
    public java.lang.Long condObjId;

    /**
     * 条件值
     */
    public java.lang.Long condValue;

    /**
     * 条件满足的结果：强制限制、提示限制、允许受理。LOVB=OFF-C-0019
     */
    public java.lang.String limitType;

    /**
     * 限制条件描述
     */
    public java.lang.String limitConditionDesc;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录的创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的修改时间。
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 订购限制配置标识，主键
     */
    public void setSaleLimitCfgId(java.lang.Long saleLimitCfgId) {
        this.saleLimitCfgId = saleLimitCfgId;
    }

    /**
     * 获取 订购限制配置标识，主键
     */
    public java.lang.Long getSaleLimitCfgId() {
        return this.saleLimitCfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.saleLimitCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.saleLimitCfgId;
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
     * 设置 对象类型，LOVB=OFF-C-0017
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 对象类型，LOVB=OFF-C-0017
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象标识，如套餐对应的宽带产品构成标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识，如套餐对应的宽带产品构成标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 限制条件的类型。LOVB=OFF-C-0018
     */
    public void setCondObjType(java.lang.String condObjType) {
        this.condObjType = condObjType;
    }

    /**
     * 获取 限制条件的类型。LOVB=OFF-C-0018
     */
    public java.lang.String getCondObjType() {
        return this.condObjType;
    }

    /**
     * 设置 条件标识：具体的产品属性标识
     */
    public void setCondObjId(java.lang.Long condObjId) {
        this.condObjId = condObjId;
    }

    /**
     * 获取 条件标识：具体的产品属性标识
     */
    public java.lang.Long getCondObjId() {
        return this.condObjId;
    }

    /**
     * 设置 条件值
     */
    public void setCondValue(java.lang.Long condValue) {
        this.condValue = condValue;
    }

    /**
     * 获取 条件值
     */
    public java.lang.Long getCondValue() {
        return this.condValue;
    }

    /**
     * 设置 条件满足的结果：强制限制、提示限制、允许受理。LOVB=OFF-C-0019
     */
    public void setLimitType(java.lang.String limitType) {
        this.limitType = limitType;
    }

    /**
     * 获取 条件满足的结果：强制限制、提示限制、允许受理。LOVB=OFF-C-0019
     */
    public java.lang.String getLimitType() {
        return this.limitType;
    }

    /**
     * 设置 限制条件描述
     */
    public void setLimitConditionDesc(java.lang.String limitConditionDesc) {
        this.limitConditionDesc = limitConditionDesc;
    }

    /**
     * 获取 限制条件描述
     */
    public java.lang.String getLimitConditionDesc() {
        return this.limitConditionDesc;
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
     * 设置 状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录的创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的修改时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间。
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
