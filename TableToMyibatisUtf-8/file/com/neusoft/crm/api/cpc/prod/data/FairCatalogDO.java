package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:说明不同产品不同项目的具体公允价值信息。
 * @实体表  :FAIR_CATALOG
 */
public class FairCatalogDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "FAIR_CATALOG_S";

    /**
     * 目录项标识
     */
    public java.lang.Integer fairCatalogId;

    /**
     * 目录项名称
     */
    public java.lang.String fairCatalogName;

    /**
     * 公允值大类
     */
    public java.lang.Integer fairValueClass;

    /**
     * 价值类型标识
     */
    public java.lang.Integer fairValueTypeId;

    /**
     * 如果价值类型标识为1-数值，本字段填写公允值，如果为2-单价，本字段填写公允价值的单价
     */
    public java.lang.Long fairValue;

    /**
     * 调节系数
     */
    public java.lang.Double adjustRate;

    /**
     * LOVB=FAIR-C-0004
            0-单产品分摊公允值
            1-跨产品的共享业务分摊公允值，这种情况下，分摊产品标识和分摊项目标识都为空
     */
    public java.lang.Integer shareBusiFlag;

    /**
     * 共享业务分摊标识
     */
    public java.lang.Integer apportionId;

    /**
     * 分摊产品标识
     */
    public java.lang.Integer productId;

    /**
     * 分摊项目标识
     */
    public java.lang.Integer apportionObjectId;

    /**
     * 分摊处理优先级
     */
    public java.lang.Integer priorityValue;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.fairCatalogId = SeqUtils.createIntegerId(ID_SEQ);
         return this.fairCatalogId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 目录项名称
     */
    public void setFairCatalogName(java.lang.String fairCatalogName) {
        this.fairCatalogName = fairCatalogName;
    }

    /**
     * 获取 目录项名称
     */
    public java.lang.String getFairCatalogName() {
        return this.fairCatalogName;
    }

    /**
     * 设置 公允值大类
     */
    public void setFairValueClass(java.lang.Integer fairValueClass) {
        this.fairValueClass = fairValueClass;
    }

    /**
     * 获取 公允值大类
     */
    public java.lang.Integer getFairValueClass() {
        return this.fairValueClass;
    }

    /**
     * 设置 价值类型标识
     */
    public void setFairValueTypeId(java.lang.Integer fairValueTypeId) {
        this.fairValueTypeId = fairValueTypeId;
    }

    /**
     * 获取 价值类型标识
     */
    public java.lang.Integer getFairValueTypeId() {
        return this.fairValueTypeId;
    }

    /**
     * 设置 如果价值类型标识为1-数值，本字段填写公允值，如果为2-单价，本字段填写公允价值的单价
     */
    public void setFairValue(java.lang.Long fairValue) {
        this.fairValue = fairValue;
    }

    /**
     * 获取 如果价值类型标识为1-数值，本字段填写公允值，如果为2-单价，本字段填写公允价值的单价
     */
    public java.lang.Long getFairValue() {
        return this.fairValue;
    }

    /**
     * 设置 调节系数
     */
    public void setAdjustRate(java.lang.Double adjustRate) {
        this.adjustRate = adjustRate;
    }

    /**
     * 获取 调节系数
     */
    public java.lang.Double getAdjustRate() {
        return this.adjustRate;
    }

    /**
     * 设置 LOVB=FAIR-C-0004
            0-单产品分摊公允值
            1-跨产品的共享业务分摊公允值，这种情况下，分摊产品标识和分摊项目标识都为空
     */
    public void setShareBusiFlag(java.lang.Integer shareBusiFlag) {
        this.shareBusiFlag = shareBusiFlag;
    }

    /**
     * 获取 LOVB=FAIR-C-0004
            0-单产品分摊公允值
            1-跨产品的共享业务分摊公允值，这种情况下，分摊产品标识和分摊项目标识都为空
     */
    public java.lang.Integer getShareBusiFlag() {
        return this.shareBusiFlag;
    }

    /**
     * 设置 共享业务分摊标识
     */
    public void setApportionId(java.lang.Integer apportionId) {
        this.apportionId = apportionId;
    }

    /**
     * 获取 共享业务分摊标识
     */
    public java.lang.Integer getApportionId() {
        return this.apportionId;
    }

    /**
     * 设置 分摊产品标识
     */
    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取 分摊产品标识
     */
    public java.lang.Integer getProductId() {
        return this.productId;
    }

    /**
     * 设置 分摊项目标识
     */
    public void setApportionObjectId(java.lang.Integer apportionObjectId) {
        this.apportionObjectId = apportionObjectId;
    }

    /**
     * 获取 分摊项目标识
     */
    public java.lang.Integer getApportionObjectId() {
        return this.apportionObjectId;
    }

    /**
     * 设置 分摊处理优先级
     */
    public void setPriorityValue(java.lang.Integer priorityValue) {
        this.priorityValue = priorityValue;
    }

    /**
     * 获取 分摊处理优先级
     */
    public java.lang.Integer getPriorityValue() {
        return this.priorityValue;
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
