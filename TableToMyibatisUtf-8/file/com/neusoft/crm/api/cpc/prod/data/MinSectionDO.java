package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述MIN段信息，通常对应MIN码中的M0M1M2M3，在UIM卡与移动号码的混配规则中会使用。表名从MIN_INFO改
 * @实体表  :MIN_SECTION
 */
public class MinSectionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MIN_SECTION_S";

    /**
     * 记录MIN段标识。
     */
    public java.lang.Integer minInfoId;

    /**
     * HLR标识
     */
    public java.lang.Integer hlrId;

    /**
     * 运营商的唯一标识。PARTY_ROLE_ID修改为PARTNER_ID
     */
    public java.lang.Integer partnerId;

    /**
     * 记录适用区域标识。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录起始值。
     */
    public java.lang.String valueFrom;

    /**
     * 记录终止值。
     */
    public java.lang.String endMin;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 记录MIN段标识。
     */
    public void setMinInfoId(java.lang.Integer minInfoId) {
        this.minInfoId = minInfoId;
    }

    /**
     * 获取 记录MIN段标识。
     */
    public java.lang.Integer getMinInfoId() {
        return this.minInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.minInfoId = SeqUtils.createIntegerId(ID_SEQ);
         return this.minInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 HLR标识
     */
    public void setHlrId(java.lang.Integer hlrId) {
        this.hlrId = hlrId;
    }

    /**
     * 获取 HLR标识
     */
    public java.lang.Integer getHlrId() {
        return this.hlrId;
    }

    /**
     * 设置 运营商的唯一标识。PARTY_ROLE_ID修改为PARTNER_ID
     */
    public void setPartnerId(java.lang.Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取 运营商的唯一标识。PARTY_ROLE_ID修改为PARTNER_ID
     */
    public java.lang.Integer getPartnerId() {
        return this.partnerId;
    }

    /**
     * 设置 记录适用区域标识。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录起始值。
     */
    public void setValueFrom(java.lang.String valueFrom) {
        this.valueFrom = valueFrom;
    }

    /**
     * 获取 记录起始值。
     */
    public java.lang.String getValueFrom() {
        return this.valueFrom;
    }

    /**
     * 设置 记录终止值。
     */
    public void setEndMin(java.lang.String endMin) {
        this.endMin = endMin;
    }

    /**
     * 获取 记录终止值。
     */
    public java.lang.String getEndMin() {
        return this.endMin;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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
