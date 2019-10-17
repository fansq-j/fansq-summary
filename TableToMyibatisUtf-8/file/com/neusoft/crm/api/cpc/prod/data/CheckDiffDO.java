package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录每个交易节点有差异交易记录明细
 * @实体表  :CHECK_DIFF
 */
public class CheckDiffDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CHECK_DIFF_S";

    /**
     * 差异记录标识主键
     */
    public java.lang.Long checkDiffId;

    /**
     * 对应到对帐文件记录主键
     */
    public java.lang.Long recordIdA;

    /**
     * 对应到对帐文件记录主键
     */
    public java.lang.Long recordIdZ;

    /**
     * 对应支付节点对帐汇总实体的主键
     */
    public java.lang.Long checkTotalId;

    /**
     * 交易类型
     */
    public java.lang.Integer payTypeId;

    /**
     * 被对帐记录的日期
     */
    public java.util.Date checkDate;

    /**
     * 支付流水
     */
    public java.lang.String paySerialId;

    /**
     * 支付渠道流水
     */
    public java.lang.String payChannelSerial;

    /**
     * 使用系统流水
     */
    public java.lang.String payUserSerial;

    /**
     * 使用系统交易金额
     */
    public java.lang.Long userAmount;

    /**
     * 支付渠道交易金额
     */
    public java.lang.Long channelAmount;

    /**
     * 如果交易类型是撤销或者退款时，该字段填写对应支付的那笔支付流水
     */
    public java.lang.String operSerialId;

    /**
     * 如果交易类型是撤销或者退款时，该字段填写对应支付记录的外部流水
     */
    public java.lang.String operSerialNbr;

    /**
     * 处理状态，PAY-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 交易创建时间
     */
    public java.util.Date createDate;

    /**
     * 交易支付时间
     */
    public java.util.Date payDate;

    /**
     * 状态变更时间
     */
    public java.util.Date statusDate;

    /**
     * 操作工号
     */
    public java.lang.Integer staffId;

    /**
     * 商品名称
     */
    public java.lang.String commodityName;

    /**
     * 商品描述
     */
    public java.lang.String commodityDesc;

    /**
     * BSS系统的帐户标识
     */
    public java.lang.Long accountId;

    /**
     * 消费者在第三方平台的帐号
     */
    public java.lang.String customerAccount;

    /**
     * 归属区域
     */
    public java.lang.Integer regionId;

    /**
     * 设置 差异记录标识主键
     */
    public void setCheckDiffId(java.lang.Long checkDiffId) {
        this.checkDiffId = checkDiffId;
    }

    /**
     * 获取 差异记录标识主键
     */
    public java.lang.Long getCheckDiffId() {
        return this.checkDiffId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.checkDiffId = SeqUtils.createLongId(ID_SEQ);
         return this.checkDiffId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 对应到对帐文件记录主键
     */
    public void setRecordIdA(java.lang.Long recordIdA) {
        this.recordIdA = recordIdA;
    }

    /**
     * 获取 对应到对帐文件记录主键
     */
    public java.lang.Long getRecordIdA() {
        return this.recordIdA;
    }

    /**
     * 设置 对应到对帐文件记录主键
     */
    public void setRecordIdZ(java.lang.Long recordIdZ) {
        this.recordIdZ = recordIdZ;
    }

    /**
     * 获取 对应到对帐文件记录主键
     */
    public java.lang.Long getRecordIdZ() {
        return this.recordIdZ;
    }

    /**
     * 设置 对应支付节点对帐汇总实体的主键
     */
    public void setCheckTotalId(java.lang.Long checkTotalId) {
        this.checkTotalId = checkTotalId;
    }

    /**
     * 获取 对应支付节点对帐汇总实体的主键
     */
    public java.lang.Long getCheckTotalId() {
        return this.checkTotalId;
    }

    /**
     * 设置 交易类型
     */
    public void setPayTypeId(java.lang.Integer payTypeId) {
        this.payTypeId = payTypeId;
    }

    /**
     * 获取 交易类型
     */
    public java.lang.Integer getPayTypeId() {
        return this.payTypeId;
    }

    /**
     * 设置 被对帐记录的日期
     */
    public void setCheckDate(java.util.Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取 被对帐记录的日期
     */
    public java.util.Date getCheckDate() {
        return this.checkDate;
    }

    /**
     * 设置 支付流水
     */
    public void setPaySerialId(java.lang.String paySerialId) {
        this.paySerialId = paySerialId;
    }

    /**
     * 获取 支付流水
     */
    public java.lang.String getPaySerialId() {
        return this.paySerialId;
    }

    /**
     * 设置 支付渠道流水
     */
    public void setPayChannelSerial(java.lang.String payChannelSerial) {
        this.payChannelSerial = payChannelSerial;
    }

    /**
     * 获取 支付渠道流水
     */
    public java.lang.String getPayChannelSerial() {
        return this.payChannelSerial;
    }

    /**
     * 设置 使用系统流水
     */
    public void setPayUserSerial(java.lang.String payUserSerial) {
        this.payUserSerial = payUserSerial;
    }

    /**
     * 获取 使用系统流水
     */
    public java.lang.String getPayUserSerial() {
        return this.payUserSerial;
    }

    /**
     * 设置 使用系统交易金额
     */
    public void setUserAmount(java.lang.Long userAmount) {
        this.userAmount = userAmount;
    }

    /**
     * 获取 使用系统交易金额
     */
    public java.lang.Long getUserAmount() {
        return this.userAmount;
    }

    /**
     * 设置 支付渠道交易金额
     */
    public void setChannelAmount(java.lang.Long channelAmount) {
        this.channelAmount = channelAmount;
    }

    /**
     * 获取 支付渠道交易金额
     */
    public java.lang.Long getChannelAmount() {
        return this.channelAmount;
    }

    /**
     * 设置 如果交易类型是撤销或者退款时，该字段填写对应支付的那笔支付流水
     */
    public void setOperSerialId(java.lang.String operSerialId) {
        this.operSerialId = operSerialId;
    }

    /**
     * 获取 如果交易类型是撤销或者退款时，该字段填写对应支付的那笔支付流水
     */
    public java.lang.String getOperSerialId() {
        return this.operSerialId;
    }

    /**
     * 设置 如果交易类型是撤销或者退款时，该字段填写对应支付记录的外部流水
     */
    public void setOperSerialNbr(java.lang.String operSerialNbr) {
        this.operSerialNbr = operSerialNbr;
    }

    /**
     * 获取 如果交易类型是撤销或者退款时，该字段填写对应支付记录的外部流水
     */
    public java.lang.String getOperSerialNbr() {
        return this.operSerialNbr;
    }

    /**
     * 设置 处理状态，PAY-C-0005
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 处理状态，PAY-C-0005
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 交易创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 交易创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 交易支付时间
     */
    public void setPayDate(java.util.Date payDate) {
        this.payDate = payDate;
    }

    /**
     * 获取 交易支付时间
     */
    public java.util.Date getPayDate() {
        return this.payDate;
    }

    /**
     * 设置 状态变更时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 操作工号
     */
    public void setStaffId(java.lang.Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 操作工号
     */
    public java.lang.Integer getStaffId() {
        return this.staffId;
    }

    /**
     * 设置 商品名称
     */
    public void setCommodityName(java.lang.String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * 获取 商品名称
     */
    public java.lang.String getCommodityName() {
        return this.commodityName;
    }

    /**
     * 设置 商品描述
     */
    public void setCommodityDesc(java.lang.String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    /**
     * 获取 商品描述
     */
    public java.lang.String getCommodityDesc() {
        return this.commodityDesc;
    }

    /**
     * 设置 BSS系统的帐户标识
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取 BSS系统的帐户标识
     */
    public java.lang.Long getAccountId() {
        return this.accountId;
    }

    /**
     * 设置 消费者在第三方平台的帐号
     */
    public void setCustomerAccount(java.lang.String customerAccount) {
        this.customerAccount = customerAccount;
    }

    /**
     * 获取 消费者在第三方平台的帐号
     */
    public java.lang.String getCustomerAccount() {
        return this.customerAccount;
    }

    /**
     * 设置 归属区域
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

}
