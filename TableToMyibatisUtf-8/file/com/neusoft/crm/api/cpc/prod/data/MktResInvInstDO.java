package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营销资源发票实例。专票的实例数量小，每张都生成一条实例记录；非专票资源的，按每本生成一条实例记录，同时记录开始和结束
 * @实体表  :MKT_RES_INV_INST
 */
public class MktResInvInstDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_INV_INST_S";

    /**
     * 营销资源实例的标识，主键
     */
    public java.lang.Long mktResInvInstId;

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
     * 记录营销资源实例的发票代码，计费建议。
     */
    public java.lang.String invoiceCode;

    /**
     * 记录一本非专票的发票实例的最初的票号。
     */
    public java.lang.Long invStaNum;

    /**
     * 记录一本非专票的发票实例的最后一张的票号，如一本是100张，则结束票号等与开始票号+100。
     */
    public java.lang.Long invEndNum;

    /**
     * 记录一本非专票的发票实例的当前还未使用的最小票号（第一张），最开始未使用时当前票号等于起始票号，每次使用后入库时把当前票号更新还未使用的最小票号。
     */
    public java.lang.Long invCurNum;

    /**
     * 记录当前使用发票的员工标识，以便计费打印发票使用。2015-3-20
     */
    public java.lang.Long useStaffId;

    /**
     * 记录当前使用发票的员工的当前组织标识，以便计费打印发票使用。2015-3-20
     */
    public java.lang.Long useOrgId;

    /**
     * 记录营销资源实例的数量
     */
    public java.lang.Long quantity;

    /**
     * 记录发票单位,LOVB=RES-C-0022
     */
    public java.lang.String unit;

    /**
     * 记录营销资源实例的剩余数量，针对无序资源。
     */
    public java.lang.Long restQuantity;

    /**
     * 根资源实例的标识，资源拆分时，记录最初的资源实例标识，便于描述新实例的来源
     */
    public java.lang.Long rootInstId;

    /**
     * 记录来源平台标识，如MSS或集团终端系统
     */
    public java.lang.Long platId;

    /**
     * 记录本地网标识。
     */
    public java.lang.Long lanId;

    /**
     * 记录区域标识。指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录发票实例状态。LOVB=RES-C-0027
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
     * 资源供应商ID
     */
    public java.lang.Long partnerId;

    /**
     * 设置 营销资源实例的标识，主键
     */
    public void setMktResInvInstId(java.lang.Long mktResInvInstId) {
        this.mktResInvInstId = mktResInvInstId;
    }

    /**
     * 获取 营销资源实例的标识，主键
     */
    public java.lang.Long getMktResInvInstId() {
        return this.mktResInvInstId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResInvInstId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResInvInstId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 记录营销资源实例的发票代码，计费建议。
     */
    public void setInvoiceCode(java.lang.String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    /**
     * 获取 记录营销资源实例的发票代码，计费建议。
     */
    public java.lang.String getInvoiceCode() {
        return this.invoiceCode;
    }

    /**
     * 设置 记录一本非专票的发票实例的最初的票号。
     */
    public void setInvStaNum(java.lang.Long invStaNum) {
        this.invStaNum = invStaNum;
    }

    /**
     * 获取 记录一本非专票的发票实例的最初的票号。
     */
    public java.lang.Long getInvStaNum() {
        return this.invStaNum;
    }

    /**
     * 设置 记录一本非专票的发票实例的最后一张的票号，如一本是100张，则结束票号等与开始票号+100。
     */
    public void setInvEndNum(java.lang.Long invEndNum) {
        this.invEndNum = invEndNum;
    }

    /**
     * 获取 记录一本非专票的发票实例的最后一张的票号，如一本是100张，则结束票号等与开始票号+100。
     */
    public java.lang.Long getInvEndNum() {
        return this.invEndNum;
    }

    /**
     * 设置 记录一本非专票的发票实例的当前还未使用的最小票号（第一张），最开始未使用时当前票号等于起始票号，每次使用后入库时把当前票号更新还未使用的最小票号。
     */
    public void setInvCurNum(java.lang.Long invCurNum) {
        this.invCurNum = invCurNum;
    }

    /**
     * 获取 记录一本非专票的发票实例的当前还未使用的最小票号（第一张），最开始未使用时当前票号等于起始票号，每次使用后入库时把当前票号更新还未使用的最小票号。
     */
    public java.lang.Long getInvCurNum() {
        return this.invCurNum;
    }

    /**
     * 设置 记录当前使用发票的员工标识，以便计费打印发票使用。2015-3-20
     */
    public void setUseStaffId(java.lang.Long useStaffId) {
        this.useStaffId = useStaffId;
    }

    /**
     * 获取 记录当前使用发票的员工标识，以便计费打印发票使用。2015-3-20
     */
    public java.lang.Long getUseStaffId() {
        return this.useStaffId;
    }

    /**
     * 设置 记录当前使用发票的员工的当前组织标识，以便计费打印发票使用。2015-3-20
     */
    public void setUseOrgId(java.lang.Long useOrgId) {
        this.useOrgId = useOrgId;
    }

    /**
     * 获取 记录当前使用发票的员工的当前组织标识，以便计费打印发票使用。2015-3-20
     */
    public java.lang.Long getUseOrgId() {
        return this.useOrgId;
    }

    /**
     * 设置 记录营销资源实例的数量
     */
    public void setQuantity(java.lang.Long quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取 记录营销资源实例的数量
     */
    public java.lang.Long getQuantity() {
        return this.quantity;
    }

    /**
     * 设置 记录发票单位,LOVB=RES-C-0022
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    /**
     * 获取 记录发票单位,LOVB=RES-C-0022
     */
    public java.lang.String getUnit() {
        return this.unit;
    }

    /**
     * 设置 记录营销资源实例的剩余数量，针对无序资源。
     */
    public void setRestQuantity(java.lang.Long restQuantity) {
        this.restQuantity = restQuantity;
    }

    /**
     * 获取 记录营销资源实例的剩余数量，针对无序资源。
     */
    public java.lang.Long getRestQuantity() {
        return this.restQuantity;
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
     * 设置 记录区域标识。指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录区域标识。指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
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
     * 设置 记录发票实例状态。LOVB=RES-C-0027
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录发票实例状态。LOVB=RES-C-0027
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

}
