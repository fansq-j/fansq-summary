package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:销售品宣传加载方案
 * @实体表  :OFFER_INFORM_PROG
 */
public class OfferInformProgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_INFORM_PROG_S";

    /**
     * 销售品宣传加载方案标识
     */
    public java.lang.Long offerIpId;

    /**
     * 销售品宣传加载方案编码
     */
    public java.lang.String offerIpCode;

    /**
     * 销售品宣传加载方案名称
     */
    public java.lang.String offerIpName;

    /**
     * 记录套餐标志。 主要有：1-组合套餐，2-单一套餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer offerId;

    /**
     * 对应渠道表的电信组织标识
     */
    public java.lang.Long orgId;

    /**
     * 内容
     */
    public java.lang.String content;

    /**
     * 内容类型. LOVB=OFF-C-0066
     */
    public java.lang.String contentType;

    /**
     * 是否对外. . LOVB=OFF-C-0067
     */
    public java.lang.String outFlag;

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
     * 设置 销售品宣传加载方案标识
     */
    public void setOfferIpId(java.lang.Long offerIpId) {
        this.offerIpId = offerIpId;
    }

    /**
     * 获取 销售品宣传加载方案标识
     */
    public java.lang.Long getOfferIpId() {
        return this.offerIpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerIpId = SeqUtils.createLongId(ID_SEQ);
         return this.offerIpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品宣传加载方案编码
     */
    public void setOfferIpCode(java.lang.String offerIpCode) {
        this.offerIpCode = offerIpCode;
    }

    /**
     * 获取 销售品宣传加载方案编码
     */
    public java.lang.String getOfferIpCode() {
        return this.offerIpCode;
    }

    /**
     * 设置 销售品宣传加载方案名称
     */
    public void setOfferIpName(java.lang.String offerIpName) {
        this.offerIpName = offerIpName;
    }

    /**
     * 获取 销售品宣传加载方案名称
     */
    public java.lang.String getOfferIpName() {
        return this.offerIpName;
    }

    /**
     * 设置 记录套餐标志。 主要有：1-组合套餐，2-单一套餐，3-基础销售品，0-品牌类销售品
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 记录套餐标志。 主要有：1-组合套餐，2-单一套餐，3-基础销售品，0-品牌类销售品
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 对应渠道表的电信组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 对应渠道表的电信组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 内容
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    /**
     * 获取 内容
     */
    public java.lang.String getContent() {
        return this.content;
    }

    /**
     * 设置 内容类型. LOVB=OFF-C-0066
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }

    /**
     * 获取 内容类型. LOVB=OFF-C-0066
     */
    public java.lang.String getContentType() {
        return this.contentType;
    }

    /**
     * 设置 是否对外. . LOVB=OFF-C-0067
     */
    public void setOutFlag(java.lang.String outFlag) {
        this.outFlag = outFlag;
    }

    /**
     * 获取 是否对外. . LOVB=OFF-C-0067
     */
    public java.lang.String getOutFlag() {
        return this.outFlag;
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
