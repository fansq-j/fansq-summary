package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:促销规则表
 * @实体表  :SALES_PROMOTION_RULE
 */
public class SalesPromotionRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALES_PROMOTION_RULE_S";

    /**
     * 促销规则主键
     */
    public java.lang.Integer salesPromotionRuleId;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套
            餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * 促销类型
     */
    public java.lang.String promotionType;

    /**
     * 促销类型名称
     */
    public java.lang.String promotionTypeName;

    /**
     * 促销规则编码
     */
    public java.lang.String procModeSpecCode;

    /**
     * 促销规则名称
     */
    public java.lang.String procModeInstName;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 促销规则主键
     */
    public void setSalesPromotionRuleId(java.lang.Integer salesPromotionRuleId) {
        this.salesPromotionRuleId = salesPromotionRuleId;
    }

    /**
     * 获取 促销规则主键
     */
    public java.lang.Integer getSalesPromotionRuleId() {
        return this.salesPromotionRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.salesPromotionRuleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.salesPromotionRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
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
     * 设置 促销类型
     */
    public void setPromotionType(java.lang.String promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * 获取 促销类型
     */
    public java.lang.String getPromotionType() {
        return this.promotionType;
    }

    /**
     * 设置 促销类型名称
     */
    public void setPromotionTypeName(java.lang.String promotionTypeName) {
        this.promotionTypeName = promotionTypeName;
    }

    /**
     * 获取 促销类型名称
     */
    public java.lang.String getPromotionTypeName() {
        return this.promotionTypeName;
    }

    /**
     * 设置 促销规则编码
     */
    public void setProcModeSpecCode(java.lang.String procModeSpecCode) {
        this.procModeSpecCode = procModeSpecCode;
    }

    /**
     * 获取 促销规则编码
     */
    public java.lang.String getProcModeSpecCode() {
        return this.procModeSpecCode;
    }

    /**
     * 设置 促销规则名称
     */
    public void setProcModeInstName(java.lang.String procModeInstName) {
        this.procModeInstName = procModeInstName;
    }

    /**
     * 获取 促销规则名称
     */
    public java.lang.String getProcModeInstName() {
        return this.procModeInstName;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
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
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
