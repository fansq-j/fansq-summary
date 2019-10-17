package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:套餐分摊项明细表
 * @实体表  :FAIR_CATALOG_MEMBER
 */
public class FairCatalogMemberDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_CATALOG_MEMBER_S";

    /**
     * 套餐分摊项明细标识
     */
    public java.lang.Integer fairCatalogMemberId;

    /**
     * 名称
     */
    public java.lang.String fairCatalogMemberName;

    /**
     * 目录项标识
     */
    public java.lang.Integer fairCatalogId;

    /**
     * 定位标识
     */
    public java.lang.Integer fairOfferId;

    /**
     * 套餐设计使用量
     */
    public java.lang.Long offerUsage;

    /**
     * LOVB=FAIR-C-0002
            0-直接填值
            1-取属性
            可以扩展取值类型定义不同的取值方法
     */
    public java.lang.Integer valueFlag;

    /**
     * 使用量单位
     */
    public java.lang.String unit;

    /**
     * 引用自PLCA_SECTION，用于做摊分项的条件判断，有填值的情况下，符合条件的摊分项才能参与摊分计算
     */
    public java.lang.Integer sectionId;

    /**
     * 当前分摊项在套餐中的数目，一个分摊项可以有多个，如2个产品等。
     */
    public java.lang.Long amount;

    /**
     * LOVB=FAIR-C-0002
            0-直接填值
            1-取属性
     */
    public java.lang.Integer amountFlag;

    /**
     * LOVB=FAIR-C-0003
            0-分摊项公允值参与综合折扣率时需要乘上分摊项数量
            1-分摊项公允值参与综合折扣率时仍然按1个分摊项计算，分摊后的公允值还需要再均摊到这两个分摊项上
     */
    public java.lang.Integer amountUsage;

    /**
     * 仅用于配置摊分结果需要指定到套餐内角色的情况下，需要在这张表配置产品和套餐内角色
     */
    public java.lang.Integer productId;

    /**
     * 仅用于配置摊分结果需要指定到套餐内角色的情况下，需要在这张表配置产品和套餐内角色
     */
    public java.lang.Long roleId;

    /**
     * LOVB=PLC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 套餐分摊项明细标识
     */
    public void setFairCatalogMemberId(java.lang.Integer fairCatalogMemberId) {
        this.fairCatalogMemberId = fairCatalogMemberId;
    }

    /**
     * 获取 套餐分摊项明细标识
     */
    public java.lang.Integer getFairCatalogMemberId() {
        return this.fairCatalogMemberId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.fairCatalogMemberId = SeqUtils.createIntegerId(ID_SEQ);
         return this.fairCatalogMemberId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 名称
     */
    public void setFairCatalogMemberName(java.lang.String fairCatalogMemberName) {
        this.fairCatalogMemberName = fairCatalogMemberName;
    }

    /**
     * 获取 名称
     */
    public java.lang.String getFairCatalogMemberName() {
        return this.fairCatalogMemberName;
    }

    /**
     * 设置 目录项标识
     */
    public void setFairCatalogId(java.lang.Integer fairCatalogId) {
        this.fairCatalogId = fairCatalogId;
    }

    /**
     * 获取 目录项标识
     */
    public java.lang.Integer getFairCatalogId() {
        return this.fairCatalogId;
    }

    /**
     * 设置 定位标识
     */
    public void setFairOfferId(java.lang.Integer fairOfferId) {
        this.fairOfferId = fairOfferId;
    }

    /**
     * 获取 定位标识
     */
    public java.lang.Integer getFairOfferId() {
        return this.fairOfferId;
    }

    /**
     * 设置 套餐设计使用量
     */
    public void setOfferUsage(java.lang.Long offerUsage) {
        this.offerUsage = offerUsage;
    }

    /**
     * 获取 套餐设计使用量
     */
    public java.lang.Long getOfferUsage() {
        return this.offerUsage;
    }

    /**
     * 设置 LOVB=FAIR-C-0002
            0-直接填值
            1-取属性
            可以扩展取值类型定义不同的取值方法
     */
    public void setValueFlag(java.lang.Integer valueFlag) {
        this.valueFlag = valueFlag;
    }

    /**
     * 获取 LOVB=FAIR-C-0002
            0-直接填值
            1-取属性
            可以扩展取值类型定义不同的取值方法
     */
    public java.lang.Integer getValueFlag() {
        return this.valueFlag;
    }

    /**
     * 设置 使用量单位
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    /**
     * 获取 使用量单位
     */
    public java.lang.String getUnit() {
        return this.unit;
    }

    /**
     * 设置 引用自PLCA_SECTION，用于做摊分项的条件判断，有填值的情况下，符合条件的摊分项才能参与摊分计算
     */
    public void setSectionId(java.lang.Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 获取 引用自PLCA_SECTION，用于做摊分项的条件判断，有填值的情况下，符合条件的摊分项才能参与摊分计算
     */
    public java.lang.Integer getSectionId() {
        return this.sectionId;
    }

    /**
     * 设置 当前分摊项在套餐中的数目，一个分摊项可以有多个，如2个产品等。
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 当前分摊项在套餐中的数目，一个分摊项可以有多个，如2个产品等。
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 LOVB=FAIR-C-0002
            0-直接填值
            1-取属性
     */
    public void setAmountFlag(java.lang.Integer amountFlag) {
        this.amountFlag = amountFlag;
    }

    /**
     * 获取 LOVB=FAIR-C-0002
            0-直接填值
            1-取属性
     */
    public java.lang.Integer getAmountFlag() {
        return this.amountFlag;
    }

    /**
     * 设置 LOVB=FAIR-C-0003
            0-分摊项公允值参与综合折扣率时需要乘上分摊项数量
            1-分摊项公允值参与综合折扣率时仍然按1个分摊项计算，分摊后的公允值还需要再均摊到这两个分摊项上
     */
    public void setAmountUsage(java.lang.Integer amountUsage) {
        this.amountUsage = amountUsage;
    }

    /**
     * 获取 LOVB=FAIR-C-0003
            0-分摊项公允值参与综合折扣率时需要乘上分摊项数量
            1-分摊项公允值参与综合折扣率时仍然按1个分摊项计算，分摊后的公允值还需要再均摊到这两个分摊项上
     */
    public java.lang.Integer getAmountUsage() {
        return this.amountUsage;
    }

    /**
     * 设置 仅用于配置摊分结果需要指定到套餐内角色的情况下，需要在这张表配置产品和套餐内角色
     */
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取 仅用于配置摊分结果需要指定到套餐内角色的情况下，需要在这张表配置产品和套餐内角色
     */
    public java.lang.Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置 仅用于配置摊分结果需要指定到套餐内角色的情况下，需要在这张表配置产品和套餐内角色
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 仅用于配置摊分结果需要指定到套餐内角色的情况下，需要在这张表配置产品和套餐内角色
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
