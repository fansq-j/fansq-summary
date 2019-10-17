package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于对销售器的订购次数进行限制的规则表达
 * @实体表  :OFFER_ORDER_TIMES_RULE
 */
public class OfferOrderTimesRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_ORDER_TIMES_RULE_S";

    /**
     * 订购次数规则标识
     */
    public java.lang.Long orderTimesRuleId;

    /**
     * 销售品标识
     */
    public java.lang.Integer offerId;

    /**
     * 约束对象类型。LOVB=OFF-C-0071
     */
    public java.lang.String objType;

    /**
     * 约束能够订购的次数
     */
    public java.lang.Integer orderTimes;

    /**
     * 时间限制的类型，包括相对时长、绝对时长。LOVB=OFF-C-0034
     */
    public java.lang.String timeType;

    /**
     * 限制时长，当时间限制的类型=相对时长的时候用到
     */
    public java.lang.Integer limitTime;

    /**
     * 时长单位，当约束时间类型=相对时长的时候用到。LOVB=OFF-C-0036
     */
    public java.lang.String timeUnit;

    /**
     * 生效时间，当约束时间类型=绝对时间的时候用到。
     */
    public java.util.Date effDate;

    /**
     * 失效时间，当约束时间类型=绝对时间的时候用到。
     */
    public java.util.Date expDate;

    /**
     * 约束订单类型。LOVB=OFF-C-0072
            订单类型为有效订单时，只能是当前有效的订单，才能统计在内进行数量约束；订单类型为所有订单时，只要是产生的订单，都统计在内进行数量约束
     */
    public java.lang.String orderType;

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
     * 设置 订购次数规则标识
     */
    public void setOrderTimesRuleId(java.lang.Long orderTimesRuleId) {
        this.orderTimesRuleId = orderTimesRuleId;
    }

    /**
     * 获取 订购次数规则标识
     */
    public java.lang.Long getOrderTimesRuleId() {
        return this.orderTimesRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orderTimesRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.orderTimesRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 销售品标识
     */
    public void setOfferId(java.lang.Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * 获取 销售品标识
     */
    public java.lang.Integer getOfferId() {
        return this.offerId;
    }

    /**
     * 设置 约束对象类型。LOVB=OFF-C-0071
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 约束对象类型。LOVB=OFF-C-0071
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 约束能够订购的次数
     */
    public void setOrderTimes(java.lang.Integer orderTimes) {
        this.orderTimes = orderTimes;
    }

    /**
     * 获取 约束能够订购的次数
     */
    public java.lang.Integer getOrderTimes() {
        return this.orderTimes;
    }

    /**
     * 设置 时间限制的类型，包括相对时长、绝对时长。LOVB=OFF-C-0034
     */
    public void setTimeType(java.lang.String timeType) {
        this.timeType = timeType;
    }

    /**
     * 获取 时间限制的类型，包括相对时长、绝对时长。LOVB=OFF-C-0034
     */
    public java.lang.String getTimeType() {
        return this.timeType;
    }

    /**
     * 设置 限制时长，当时间限制的类型=相对时长的时候用到
     */
    public void setLimitTime(java.lang.Integer limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * 获取 限制时长，当时间限制的类型=相对时长的时候用到
     */
    public java.lang.Integer getLimitTime() {
        return this.limitTime;
    }

    /**
     * 设置 时长单位，当约束时间类型=相对时长的时候用到。LOVB=OFF-C-0036
     */
    public void setTimeUnit(java.lang.String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * 获取 时长单位，当约束时间类型=相对时长的时候用到。LOVB=OFF-C-0036
     */
    public java.lang.String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * 设置 生效时间，当约束时间类型=绝对时间的时候用到。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间，当约束时间类型=绝对时间的时候用到。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间，当约束时间类型=绝对时间的时候用到。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间，当约束时间类型=绝对时间的时候用到。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 约束订单类型。LOVB=OFF-C-0072
            订单类型为有效订单时，只能是当前有效的订单，才能统计在内进行数量约束；订单类型为所有订单时，只要是产生的订单，都统计在内进行数量约束
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取 约束订单类型。LOVB=OFF-C-0072
            订单类型为有效订单时，只能是当前有效的订单，才能统计在内进行数量约束；订单类型为所有订单时，只要是产生的订单，都统计在内进行数量约束
     */
    public java.lang.String getOrderType() {
        return this.orderType;
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
