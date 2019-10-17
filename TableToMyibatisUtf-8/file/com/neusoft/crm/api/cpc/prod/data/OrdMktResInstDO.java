package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的营销资源实例。
 * @实体表  :ORD_MKT_RES_INST
 */
public class OrdMktResInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_MKT_RES_INST_S";

    /**
     * 营销资源实例的标识，主键
     */
    public java.lang.Long mktResInstId;

    /**
     * 记录营销资源实例编码。
     */
    public java.lang.String mktResInstNbr;

    /**
     * 来源于物资管理系统时产生的数据
     */
    public java.lang.Integer mktResBatchId;

    /**
     * 营销资源标识
     */
    public java.lang.Integer mktResId;

    /**
     * 营销资源仓库标识
     */
    public java.lang.Integer mktResStoreId;

    /**
     * 根资源实例的标识，资源拆分时，记录最初的资源实例标识，便于描述新实例的来源
     */
    public java.lang.Long rootInstId;

    /**
     * 营销资源实例的销售价格
     */
    public java.lang.Long salesPrice;

    /**
     * 记录来源平台标识，如MSS或集团终端系统
     */
    public java.lang.Long platId;

    /**
     * 记录本地网标识。
     */
    public java.lang.Long lanId;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 资源供应商ID
     */
    public java.lang.Long partnerId;

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
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录数据的状态，分为有效/无效/历史。
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
     * 记录营销资源实例的回收类型,LOVE,分为:回收类型：无需退还、实物遗失、实物损坏、正常归还等
     */
    public java.lang.String recycleType;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 营销资源实例的标识，主键
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 营销资源实例的标识，主键
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 记录营销资源实例编码。
     */
    public void setMktResInstNbr(java.lang.String mktResInstNbr) {
        this.mktResInstNbr = mktResInstNbr;
    }

    /**
     * 获取 记录营销资源实例编码。
     */
    public java.lang.String getMktResInstNbr() {
        return this.mktResInstNbr;
    }

    /**
     * 设置 来源于物资管理系统时产生的数据
     */
    public void setMktResBatchId(java.lang.Integer mktResBatchId) {
        this.mktResBatchId = mktResBatchId;
    }

    /**
     * 获取 来源于物资管理系统时产生的数据
     */
    public java.lang.Integer getMktResBatchId() {
        return this.mktResBatchId;
    }

    /**
     * 设置 营销资源标识
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 营销资源标识
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 营销资源仓库标识
     */
    public void setMktResStoreId(java.lang.Integer mktResStoreId) {
        this.mktResStoreId = mktResStoreId;
    }

    /**
     * 获取 营销资源仓库标识
     */
    public java.lang.Integer getMktResStoreId() {
        return this.mktResStoreId;
    }

    /**
     * 设置 根资源实例的标识，资源拆分时，记录最初的资源实例标识，便于描述新实例的来源
     */
    public void setRootInstId(java.lang.Long rootInstId) {
        this.rootInstId = rootInstId;
    }

    /**
     * 获取 根资源实例的标识，资源拆分时，记录最初的资源实例标识，便于描述新实例的来源
     */
    public java.lang.Long getRootInstId() {
        return this.rootInstId;
    }

    /**
     * 设置 营销资源实例的销售价格
     */
    public void setSalesPrice(java.lang.Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * 获取 营销资源实例的销售价格
     */
    public java.lang.Long getSalesPrice() {
        return this.salesPrice;
    }

    /**
     * 设置 记录来源平台标识，如MSS或集团终端系统
     */
    public void setPlatId(java.lang.Long platId) {
        this.platId = platId;
    }

    /**
     * 获取 记录来源平台标识，如MSS或集团终端系统
     */
    public java.lang.Long getPlatId() {
        return this.platId;
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
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 资源供应商ID
     */
    public void setPartnerId(java.lang.Long partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取 资源供应商ID
     */
    public java.lang.Long getPartnerId() {
        return this.partnerId;
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

    /**
     * 设置 记录营销资源实例的回收类型,LOVE,分为:回收类型：无需退还、实物遗失、实物损坏、正常归还等
     */
    public void setRecycleType(java.lang.String recycleType) {
        this.recycleType = recycleType;
    }

    /**
     * 获取 记录营销资源实例的回收类型,LOVE,分为:回收类型：无需退还、实物遗失、实物损坏、正常归还等
     */
    public java.lang.String getRecycleType() {
        return this.recycleType;
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

}
