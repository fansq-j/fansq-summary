package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:新增佣金结算清单实体，记录各类业务佣金清单结果数据，包括：结算账期、结算对象、发展渠道、业务类型、产品实例信息、业务订单
 * @实体表  :POLICY_TEMPLATE
 */
public class PolicyTemplateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POLICY_TEMPLATE_S";

    /**
     * 佣金政策模板标识
     */
    public java.lang.Long policyTemplateId;

    /**
     * 佣金政策模板编码
     */
    public java.lang.String policyTemplateCode;

    /**
     * 佣金政策模板名称
     */
    public java.lang.String policyTemplateName;

    /**
     * 佣金政策模板类型标识
     */
    public java.lang.Integer policyTypeId;

    /**
     * 佣金标准
     */
    public java.lang.String standardCharge;

    /**
     * 佣金政策模板适用的销售品分组标识，引用销售品子域中销售品组实体的主键
     */
    public java.lang.Long offerGrpId;

    /**
     * 佣金政策模板的业务整理描述，说明了政策模板的业务内容
     */
    public java.lang.String policyTemplateCom;

    /**
     * 描述了佣金政策模板的结算资费信息，如：
            1.销售佣金：1倍月费
            2.质态佣金：语音、流量均达标的0.5倍月费
            3.4G终端佣金：0.5倍月费
            4.二次充值：0.5倍月费
            
     */
    public java.lang.String billRule;

    /**
     * 描述了佣金政策的业务规则条件，如：
            1.销售品19元语音王、19元流量王套餐
            2.语音达标：前3个月月均语音>=50分钟
            3.流量达标：前3个月月均流量>=50M
            4.4G终端匹配：匹配4G智能机
            5.二次充值：充值金额>=50元
     */
    public java.lang.String billCond;

    /**
     * 描述了佣金政策的支付月份与支付要求，如：
            1.销售佣金：用户入网次月、第4个月、第7个月分别支付3分之1
            2.质态佣金：语音累计主叫xx分钟、流量累计使用xxM，第4个月支付
            3.4G终端匹配佣金：4G终端匹配，第7个月支付
            4.二次充值佣金：累计充值缴费>=XX元，第9个月支付
     */
    public java.lang.String billDesc;

    /**
     * 记录佣金政策单的清算时间
     */
    public java.util.Date clearTime;

    /**
     * 记录佣金政策模板的清算要求及说明
     */
    public java.lang.String clearDesc;

    /**
     * LOVB=PRC-C-0026
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
     * 设置 佣金政策模板标识
     */
    public void setPolicyTemplateId(java.lang.Long policyTemplateId) {
        this.policyTemplateId = policyTemplateId;
    }

    /**
     * 获取 佣金政策模板标识
     */
    public java.lang.Long getPolicyTemplateId() {
        return this.policyTemplateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.policyTemplateId = SeqUtils.createLongId(ID_SEQ);
         return this.policyTemplateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 佣金政策模板编码
     */
    public void setPolicyTemplateCode(java.lang.String policyTemplateCode) {
        this.policyTemplateCode = policyTemplateCode;
    }

    /**
     * 获取 佣金政策模板编码
     */
    public java.lang.String getPolicyTemplateCode() {
        return this.policyTemplateCode;
    }

    /**
     * 设置 佣金政策模板名称
     */
    public void setPolicyTemplateName(java.lang.String policyTemplateName) {
        this.policyTemplateName = policyTemplateName;
    }

    /**
     * 获取 佣金政策模板名称
     */
    public java.lang.String getPolicyTemplateName() {
        return this.policyTemplateName;
    }

    /**
     * 设置 佣金政策模板类型标识
     */
    public void setPolicyTypeId(java.lang.Integer policyTypeId) {
        this.policyTypeId = policyTypeId;
    }

    /**
     * 获取 佣金政策模板类型标识
     */
    public java.lang.Integer getPolicyTypeId() {
        return this.policyTypeId;
    }

    /**
     * 设置 佣金标准
     */
    public void setStandardCharge(java.lang.String standardCharge) {
        this.standardCharge = standardCharge;
    }

    /**
     * 获取 佣金标准
     */
    public java.lang.String getStandardCharge() {
        return this.standardCharge;
    }

    /**
     * 设置 佣金政策模板适用的销售品分组标识，引用销售品子域中销售品组实体的主键
     */
    public void setOfferGrpId(java.lang.Long offerGrpId) {
        this.offerGrpId = offerGrpId;
    }

    /**
     * 获取 佣金政策模板适用的销售品分组标识，引用销售品子域中销售品组实体的主键
     */
    public java.lang.Long getOfferGrpId() {
        return this.offerGrpId;
    }

    /**
     * 设置 佣金政策模板的业务整理描述，说明了政策模板的业务内容
     */
    public void setPolicyTemplateCom(java.lang.String policyTemplateCom) {
        this.policyTemplateCom = policyTemplateCom;
    }

    /**
     * 获取 佣金政策模板的业务整理描述，说明了政策模板的业务内容
     */
    public java.lang.String getPolicyTemplateCom() {
        return this.policyTemplateCom;
    }

    /**
     * 设置 描述了佣金政策模板的结算资费信息，如：
            1.销售佣金：1倍月费
            2.质态佣金：语音、流量均达标的0.5倍月费
            3.4G终端佣金：0.5倍月费
            4.二次充值：0.5倍月费
            
     */
    public void setBillRule(java.lang.String billRule) {
        this.billRule = billRule;
    }

    /**
     * 获取 描述了佣金政策模板的结算资费信息，如：
            1.销售佣金：1倍月费
            2.质态佣金：语音、流量均达标的0.5倍月费
            3.4G终端佣金：0.5倍月费
            4.二次充值：0.5倍月费
            
     */
    public java.lang.String getBillRule() {
        return this.billRule;
    }

    /**
     * 设置 描述了佣金政策的业务规则条件，如：
            1.销售品19元语音王、19元流量王套餐
            2.语音达标：前3个月月均语音>=50分钟
            3.流量达标：前3个月月均流量>=50M
            4.4G终端匹配：匹配4G智能机
            5.二次充值：充值金额>=50元
     */
    public void setBillCond(java.lang.String billCond) {
        this.billCond = billCond;
    }

    /**
     * 获取 描述了佣金政策的业务规则条件，如：
            1.销售品19元语音王、19元流量王套餐
            2.语音达标：前3个月月均语音>=50分钟
            3.流量达标：前3个月月均流量>=50M
            4.4G终端匹配：匹配4G智能机
            5.二次充值：充值金额>=50元
     */
    public java.lang.String getBillCond() {
        return this.billCond;
    }

    /**
     * 设置 描述了佣金政策的支付月份与支付要求，如：
            1.销售佣金：用户入网次月、第4个月、第7个月分别支付3分之1
            2.质态佣金：语音累计主叫xx分钟、流量累计使用xxM，第4个月支付
            3.4G终端匹配佣金：4G终端匹配，第7个月支付
            4.二次充值佣金：累计充值缴费>=XX元，第9个月支付
     */
    public void setBillDesc(java.lang.String billDesc) {
        this.billDesc = billDesc;
    }

    /**
     * 获取 描述了佣金政策的支付月份与支付要求，如：
            1.销售佣金：用户入网次月、第4个月、第7个月分别支付3分之1
            2.质态佣金：语音累计主叫xx分钟、流量累计使用xxM，第4个月支付
            3.4G终端匹配佣金：4G终端匹配，第7个月支付
            4.二次充值佣金：累计充值缴费>=XX元，第9个月支付
     */
    public java.lang.String getBillDesc() {
        return this.billDesc;
    }

    /**
     * 设置 记录佣金政策单的清算时间
     */
    public void setClearTime(java.util.Date clearTime) {
        this.clearTime = clearTime;
    }

    /**
     * 获取 记录佣金政策单的清算时间
     */
    public java.util.Date getClearTime() {
        return this.clearTime;
    }

    /**
     * 设置 记录佣金政策模板的清算要求及说明
     */
    public void setClearDesc(java.lang.String clearDesc) {
        this.clearDesc = clearDesc;
    }

    /**
     * 获取 记录佣金政策模板的清算要求及说明
     */
    public java.lang.String getClearDesc() {
        return this.clearDesc;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
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
