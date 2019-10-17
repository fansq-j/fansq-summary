package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录销售品实例关联的担保信息。如：某销售品实例通过身份证担保。
 * @实体表  :OFFER_INST_ASSURE
 */
public class OfferInstAssureDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_INST_ASSURE_S";

    /**
     * 记录销售品实例担保信息标识，主键。
     */
    public java.lang.Long offerInstAssureId;

    /**
     * 记录被担保的销售品实例，外键。
     */
    public java.lang.Long offerInstId;

    /**
     * 记录担保类型。LOVB=OFF-C-0002
     */
    public java.lang.String assureType;

    /**
     * 记录担保对象类型。LOVB=PRI-C-0008
     */
    public java.lang.String assureObjType;

    /**
     * 记录担保对象标识（记录员工标识、客户标识）。
     */
    public java.lang.Long assureObjId;

    /**
     * 记录担保生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录担保失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录适用区域标识。
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
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录销售品实例担保信息标识，主键。
     */
    public void setOfferInstAssureId(java.lang.Long offerInstAssureId) {
        this.offerInstAssureId = offerInstAssureId;
    }

    /**
     * 获取 记录销售品实例担保信息标识，主键。
     */
    public java.lang.Long getOfferInstAssureId() {
        return this.offerInstAssureId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerInstAssureId = SeqUtils.createLongId(ID_SEQ);
         return this.offerInstAssureId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录被担保的销售品实例，外键。
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 记录被担保的销售品实例，外键。
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 记录担保类型。LOVB=OFF-C-0002
     */
    public void setAssureType(java.lang.String assureType) {
        this.assureType = assureType;
    }

    /**
     * 获取 记录担保类型。LOVB=OFF-C-0002
     */
    public java.lang.String getAssureType() {
        return this.assureType;
    }

    /**
     * 设置 记录担保对象类型。LOVB=PRI-C-0008
     */
    public void setAssureObjType(java.lang.String assureObjType) {
        this.assureObjType = assureObjType;
    }

    /**
     * 获取 记录担保对象类型。LOVB=PRI-C-0008
     */
    public java.lang.String getAssureObjType() {
        return this.assureObjType;
    }

    /**
     * 设置 记录担保对象标识（记录员工标识、客户标识）。
     */
    public void setAssureObjId(java.lang.Long assureObjId) {
        this.assureObjId = assureObjId;
    }

    /**
     * 获取 记录担保对象标识（记录员工标识、客户标识）。
     */
    public java.lang.Long getAssureObjId() {
        return this.assureObjId;
    }

    /**
     * 设置 记录担保生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录担保生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录担保失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录担保失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 状态修改的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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

}
