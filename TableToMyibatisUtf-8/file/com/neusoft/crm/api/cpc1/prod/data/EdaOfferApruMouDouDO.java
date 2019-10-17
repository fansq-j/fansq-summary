package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品APRU每用户平均收入、MOU平均每户每月通话时间、DOU平均每户每月上网流量
 * @实体表  :EDA_OFFER_APRU_MOU_DOU
 */
public class EdaOfferApruMouDouDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EDA_OFFER_APRU_MOU_DOU_S";

    /**
     * 序列值，主键
     */
    public java.lang.Long edaOfferAmdId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 年
     */
    public java.lang.Integer dateYear;

    /**
     * 月
     */
    public java.lang.Integer dateMonth;

    /**
     * APRU每用户平均收入值
     */
    public java.lang.Integer apruValue;

    /**
     * MOU平均每户每月通话时间值
     */
    public java.lang.Integer mouValue;

    /**
     * DOU平均每户每月上网流量值
     */
    public java.lang.Integer douValue;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 排序
     */
    public java.lang.Integer sort;

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
     * 扩展字段1。
     */
    public java.lang.String exp1;

    /**
     * 扩展字段2。
     */
    public java.lang.String exp2;

    /**
     * 备注。
     */
    public java.lang.String remark;

    /**
     * 设置 序列值，主键
     */
    public void setEdaOfferAmdId(java.lang.Long edaOfferAmdId) {
        this.edaOfferAmdId = edaOfferAmdId;
    }

    /**
     * 获取 序列值，主键
     */
    public java.lang.Long getEdaOfferAmdId() {
        return this.edaOfferAmdId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.edaOfferAmdId = SeqUtils.createLongId(ID_SEQ);
         return this.edaOfferAmdId;
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
     * 设置 年
     */
    public void setDateYear(java.lang.Integer dateYear) {
        this.dateYear = dateYear;
    }

    /**
     * 获取 年
     */
    public java.lang.Integer getDateYear() {
        return this.dateYear;
    }

    /**
     * 设置 月
     */
    public void setDateMonth(java.lang.Integer dateMonth) {
        this.dateMonth = dateMonth;
    }

    /**
     * 获取 月
     */
    public java.lang.Integer getDateMonth() {
        return this.dateMonth;
    }

    /**
     * 设置 APRU每用户平均收入值
     */
    public void setApruValue(java.lang.Integer apruValue) {
        this.apruValue = apruValue;
    }

    /**
     * 获取 APRU每用户平均收入值
     */
    public java.lang.Integer getApruValue() {
        return this.apruValue;
    }

    /**
     * 设置 MOU平均每户每月通话时间值
     */
    public void setMouValue(java.lang.Integer mouValue) {
        this.mouValue = mouValue;
    }

    /**
     * 获取 MOU平均每户每月通话时间值
     */
    public java.lang.Integer getMouValue() {
        return this.mouValue;
    }

    /**
     * 设置 DOU平均每户每月上网流量值
     */
    public void setDouValue(java.lang.Integer douValue) {
        this.douValue = douValue;
    }

    /**
     * 获取 DOU平均每户每月上网流量值
     */
    public java.lang.Integer getDouValue() {
        return this.douValue;
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
     * 设置 排序
     */
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取 排序
     */
    public java.lang.Integer getSort() {
        return this.sort;
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
     * 设置 扩展字段1。
     */
    public void setExp1(java.lang.String exp1) {
        this.exp1 = exp1;
    }

    /**
     * 获取 扩展字段1。
     */
    public java.lang.String getExp1() {
        return this.exp1;
    }

    /**
     * 设置 扩展字段2。
     */
    public void setExp2(java.lang.String exp2) {
        this.exp2 = exp2;
    }

    /**
     * 获取 扩展字段2。
     */
    public java.lang.String getExp2() {
        return this.exp2;
    }

    /**
     * 设置 备注。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
