package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品赠送营销资源判断条件，主要记录销售品赠送积分红包的判断规则。
 * @实体表  :OFFER_RES_REL_COND
 */
public class OfferResRelCondDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_RES_REL_COND_S";

    /**
     * 销售品赠送营销资源判断条件标识
     */
    public java.lang.Long offerResRelCondId;

    /**
     * 销售品营销资源关联标识
     */
    public java.lang.Long offerResRelId;

    /**
     * 判断条件描述
     */
    public java.lang.String condDesc;

    /**
     * 计算表达式
     */
    public java.lang.String condExpression;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录的创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的修改时间。
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 销售品赠送营销资源判断条件标识
     */
    public void setOfferResRelCondId(java.lang.Long offerResRelCondId) {
        this.offerResRelCondId = offerResRelCondId;
    }

    /**
     * 获取 销售品赠送营销资源判断条件标识
     */
    public java.lang.Long getOfferResRelCondId() {
        return this.offerResRelCondId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerResRelCondId = SeqUtils.createLongId(ID_SEQ);
         return this.offerResRelCondId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品营销资源关联标识
     */
    public void setOfferResRelId(java.lang.Long offerResRelId) {
        this.offerResRelId = offerResRelId;
    }

    /**
     * 获取 销售品营销资源关联标识
     */
    public java.lang.Long getOfferResRelId() {
        return this.offerResRelId;
    }

    /**
     * 设置 判断条件描述
     */
    public void setCondDesc(java.lang.String condDesc) {
        this.condDesc = condDesc;
    }

    /**
     * 获取 判断条件描述
     */
    public java.lang.String getCondDesc() {
        return this.condDesc;
    }

    /**
     * 设置 计算表达式
     */
    public void setCondExpression(java.lang.String condExpression) {
        this.condExpression = condExpression;
    }

    /**
     * 获取 计算表达式
     */
    public java.lang.String getCondExpression() {
        return this.condExpression;
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
     * 设置 状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录的创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的修改时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间。
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
