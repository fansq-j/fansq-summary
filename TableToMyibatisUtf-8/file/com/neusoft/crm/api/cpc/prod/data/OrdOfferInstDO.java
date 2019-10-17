package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的销售品实例。
 * @实体表  :ORD_OFFER_INST
 */
public class OrdOfferInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_OFFER_INST_S";

    /**
     * 记录销售品实例标识，主键。
     */
    public java.lang.Long offerInstId;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * 记录销售品标识归属的销售品类型，冗余存储。
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
     * 记录套餐到期是否自动续约、自动退订，也可以由10000客户确认后自动退订改自动续约。
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
     * 记录销售品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。
     */
    public java.util.Date busiModDate;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

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
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 记录销售品标识归属的销售品类型，冗余存储。
     */
    public void setOfferType(java.lang.String offerType) {
        this.offerType = offerType;
    }

    /**
     * 获取 记录销售品标识归属的销售品类型，冗余存储。
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
     * 设置 记录套餐到期是否自动续约、自动退订，也可以由10000客户确认后自动退订改自动续约。
     */
    public void setExpProcMethod(java.lang.String expProcMethod) {
        this.expProcMethod = expProcMethod;
    }

    /**
     * 获取 记录套餐到期是否自动续约、自动退订，也可以由10000客户确认后自动退订改自动续约。
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
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
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
