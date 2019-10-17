package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定价计划是在产品成本、企业回报目的以及国家相关政策的基础上，结合企业市场营销计划而制定的针对产品/销售品的价格方案，它与
 * @实体表  :PRICING_PLAN
 */
public class PricingPlanDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_PLAN_S";

    /**
     * 定价计划的标识
     */
    public java.lang.Integer pricingPlanId;

    /**
     * 该定价计划的名称
     */
    public java.lang.String pricingPlanName;

    /**
     * 定价计划的资费说明。
     */
    public java.lang.String pricingDesc;

    /**
     * 定价计划参数的说明。
     */
    public java.lang.String paramDesc;

    /**
     * 定价计划类型.LOVB=PRC-C-0002.
     */
    public java.lang.Integer pricingPlanType;

    /**
     * 0-定价计划  1-定价包. 定价包是由一组定价计划组成。销售品可以引用定价包，也可以直接引用定价计划。LOVB=PRC-C-0021.
     */
    public java.lang.Integer pricingPacketFlag;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 是否缺省. 如果是普适性定价计划时，则置1，其它置0；LOVB=PRC-C-0036.
     */
    public java.lang.Integer ifDefault;

    /**
     * 优先级
     */
    public java.lang.Integer priority;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 状态.LOVB=PRC-C-0026.
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
     * 设置 定价计划的标识
     */
    public void setPricingPlanId(java.lang.Integer pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    /**
     * 获取 定价计划的标识
     */
    public java.lang.Integer getPricingPlanId() {
        return this.pricingPlanId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingPlanId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingPlanId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 该定价计划的名称
     */
    public void setPricingPlanName(java.lang.String pricingPlanName) {
        this.pricingPlanName = pricingPlanName;
    }

    /**
     * 获取 该定价计划的名称
     */
    public java.lang.String getPricingPlanName() {
        return this.pricingPlanName;
    }

    /**
     * 设置 定价计划的资费说明。
     */
    public void setPricingDesc(java.lang.String pricingDesc) {
        this.pricingDesc = pricingDesc;
    }

    /**
     * 获取 定价计划的资费说明。
     */
    public java.lang.String getPricingDesc() {
        return this.pricingDesc;
    }

    /**
     * 设置 定价计划参数的说明。
     */
    public void setParamDesc(java.lang.String paramDesc) {
        this.paramDesc = paramDesc;
    }

    /**
     * 获取 定价计划参数的说明。
     */
    public java.lang.String getParamDesc() {
        return this.paramDesc;
    }

    /**
     * 设置 定价计划类型.LOVB=PRC-C-0002.
     */
    public void setPricingPlanType(java.lang.Integer pricingPlanType) {
        this.pricingPlanType = pricingPlanType;
    }

    /**
     * 获取 定价计划类型.LOVB=PRC-C-0002.
     */
    public java.lang.Integer getPricingPlanType() {
        return this.pricingPlanType;
    }

    /**
     * 设置 0-定价计划  1-定价包. 定价包是由一组定价计划组成。销售品可以引用定价包，也可以直接引用定价计划。LOVB=PRC-C-0021.
     */
    public void setPricingPacketFlag(java.lang.Integer pricingPacketFlag) {
        this.pricingPacketFlag = pricingPacketFlag;
    }

    /**
     * 获取 0-定价计划  1-定价包. 定价包是由一组定价计划组成。销售品可以引用定价包，也可以直接引用定价计划。LOVB=PRC-C-0021.
     */
    public java.lang.Integer getPricingPacketFlag() {
        return this.pricingPacketFlag;
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
     * 设置 是否缺省. 如果是普适性定价计划时，则置1，其它置0；LOVB=PRC-C-0036.
     */
    public void setIfDefault(java.lang.Integer ifDefault) {
        this.ifDefault = ifDefault;
    }

    /**
     * 获取 是否缺省. 如果是普适性定价计划时，则置1，其它置0；LOVB=PRC-C-0036.
     */
    public java.lang.Integer getIfDefault() {
        return this.ifDefault;
    }

    /**
     * 设置 优先级
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取 优先级
     */
    public java.lang.Integer getPriority() {
        return this.priority;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
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
