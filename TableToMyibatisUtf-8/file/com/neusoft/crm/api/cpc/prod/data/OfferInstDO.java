package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述销售品的具体信息
 * @实体表  :OFFER_INST
 */
public class OfferInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_INST_S";

    /**
     * 记录销售品实例标识，主键。
     */
    public java.lang.Long offerInstId;

    /**
     * 记录套餐标志。
     */
    public java.lang.Integer offerId;

    /**
     * 记录销售品标识归属的销售品类型，冗余存储。LOVB=OFF-0005
     */
    public java.lang.String offerType;

    /**
     * 记录产权客户标识。
     */
    public java.lang.Long ownerCustId;

    /**
     * 记录销售品实例具体的生效时间，不因销售品信息变更而改变。
     */
    public java.util.Date effDate;

    /**
     * 记录销售品实例具体的失效时间，指同客户约定的协议失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录销售品协议项的标识，协议子域的外键。
     */
    public java.lang.Long offerAgreeId;

    /**
     * 记录实例创建的组织标识。
     */
    public java.lang.Long createOrgId;

    /**
     * 记录套餐到期是否自动续约、自动退订，也可以由10000客户确认后自动退订改自动续约。LOVB=OFF-0008
     */
    public java.lang.String expProcMethod;

    /**
     * 记录本地网标识。
     */
    public java.lang.Long lanId;

    /**
     * 记录销售品实例所属的区域。指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 记录状态。LOVB=PRI-0004。
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
     * 记录每次销售品信息变更的时间，保持时间的连续性。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间，可用于人工维护。
     */
    public java.util.Date updateDate;

    /**
     * 记录销售品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。
     */
    public java.util.Date busiModDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录外部销售品实例标识
     */
    public java.lang.String extOfferInstId;

    /**
     * 设置 记录销售品实例标识，主键。
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 记录销售品实例标识，主键。
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerInstId = SeqUtils.createLongId(ID_SEQ);
         return this.offerInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录套餐标志。
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录套餐标志。
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 记录销售品标识归属的销售品类型，冗余存储。LOVB=OFF-0005
     */
    public void setOfferType(java.lang.String offerType) {
        this.offerType = offerType;
    }

    /**
     * 获取 记录销售品标识归属的销售品类型，冗余存储。LOVB=OFF-0005
     */
    public java.lang.String getOfferType() {
        return this.offerType;
    }

    /**
     * 设置 记录产权客户标识。
     */
    public void setOwnerCustId(java.lang.Long ownerCustId) {
        this.ownerCustId = ownerCustId;
    }

    /**
     * 获取 记录产权客户标识。
     */
    public java.lang.Long getOwnerCustId() {
        return this.ownerCustId;
    }

    /**
     * 设置 记录销售品实例具体的生效时间，不因销售品信息变更而改变。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录销售品实例具体的生效时间，不因销售品信息变更而改变。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录销售品实例具体的失效时间，指同客户约定的协议失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录销售品实例具体的失效时间，指同客户约定的协议失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录销售品协议项的标识，协议子域的外键。
     */
    public void setOfferAgreeId(java.lang.Long offerAgreeId) {
        this.offerAgreeId = offerAgreeId;
    }

    /**
     * 获取 记录销售品协议项的标识，协议子域的外键。
     */
    public java.lang.Long getOfferAgreeId() {
        return this.offerAgreeId;
    }

    /**
     * 设置 记录实例创建的组织标识。
     */
    public void setCreateOrgId(java.lang.Long createOrgId) {
        this.createOrgId = createOrgId;
    }

    /**
     * 获取 记录实例创建的组织标识。
     */
    public java.lang.Long getCreateOrgId() {
        return this.createOrgId;
    }

    /**
     * 设置 记录套餐到期是否自动续约、自动退订，也可以由10000客户确认后自动退订改自动续约。LOVB=OFF-0008
     */
    public void setExpProcMethod(java.lang.String expProcMethod) {
        this.expProcMethod = expProcMethod;
    }

    /**
     * 获取 记录套餐到期是否自动续约、自动退订，也可以由10000客户确认后自动退订改自动续约。LOVB=OFF-0008
     */
    public java.lang.String getExpProcMethod() {
        return this.expProcMethod;
    }

    /**
     * 设置 记录本地网标识。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录本地网标识。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

    /**
     * 设置 记录销售品实例所属的区域。指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录销售品实例所属的区域。指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录状态。LOVB=PRI-0004。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PRI-0004。
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
     * 设置 记录每次销售品信息变更的时间，保持时间的连续性。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录每次销售品信息变更的时间，保持时间的连续性。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间，可用于人工维护。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间，可用于人工维护。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录销售品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。
     */
    public void setBusiModDate(java.util.Date busiModDate) {
        this.busiModDate = busiModDate;
    }

    /**
     * 获取 记录销售品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。
     */
    public java.util.Date getBusiModDate() {
        return this.busiModDate;
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

    /**
     * 设置 记录外部销售品实例标识
     */
    public void setExtOfferInstId(java.lang.String extOfferInstId) {
        this.extOfferInstId = extOfferInstId;
    }

    /**
     * 获取 记录外部销售品实例标识
     */
    public java.lang.String getExtOfferInstId() {
        return this.extOfferInstId;
    }

}
