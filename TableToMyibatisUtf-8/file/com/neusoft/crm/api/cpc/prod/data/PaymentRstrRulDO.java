package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录支付方式约束规则。表达销售品、终端、受理渠道等条件或条件组合对支付方式（现金、分期付款）的限制。
 * @实体表  :PAYMENT_RSTR_RUL
 */
public class PaymentRstrRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAYMENT_RSTR_RUL_S";

    /**
     * 记录约束规则标识
     */
    public java.lang.Long rstrRulId;

    /**
     * 记录支付方式类型，LOVB=RUL-C-0008
     */
    public java.lang.String paymentType;

    /**
     * 记录限制组(同组为与、组间为或)
     */
    public java.lang.Integer rstrGroup;

    /**
     * 记录对象类型，LOVB=RUL-C-0009
     */
    public java.lang.String objType;

    /**
     * 记录对象标识：账目项标识、销售品标识、终端标识、渠道标识
     */
    public java.lang.Long objId;

    /**
     * 记录状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态，LOVB=PUB-C-0001。
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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录约束规则标识
     */
    public void setRstrRulId(java.lang.Long rstrRulId) {
        this.rstrRulId = rstrRulId;
    }

    /**
     * 获取 记录约束规则标识
     */
    public java.lang.Long getRstrRulId() {
        return this.rstrRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rstrRulId = SeqUtils.createLongId(ID_SEQ);
         return this.rstrRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录支付方式类型，LOVB=RUL-C-0008
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取 记录支付方式类型，LOVB=RUL-C-0008
     */
    public java.lang.String getPaymentType() {
        return this.paymentType;
    }

    /**
     * 设置 记录限制组(同组为与、组间为或)
     */
    public void setRstrGroup(java.lang.Integer rstrGroup) {
        this.rstrGroup = rstrGroup;
    }

    /**
     * 获取 记录限制组(同组为与、组间为或)
     */
    public java.lang.Integer getRstrGroup() {
        return this.rstrGroup;
    }

    /**
     * 设置 记录对象类型，LOVB=RUL-C-0009
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录对象类型，LOVB=RUL-C-0009
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录对象标识：账目项标识、销售品标识、终端标识、渠道标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录对象标识：账目项标识、销售品标识、终端标识、渠道标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态修改的时间
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
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
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

}
