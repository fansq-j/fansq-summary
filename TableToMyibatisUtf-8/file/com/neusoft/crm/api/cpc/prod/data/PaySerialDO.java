package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录每一笔支付流水信息
 * @实体表  :PAY_SERIAL
 */
public class PaySerialDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_SERIAL_S";

    /**
     * 支付流水标识主键
     */
    public java.lang.Integer paySerialId;

    /**
     * 对应支付节点主键
     */
    public java.lang.Integer payNodeId;

    /**
     * 对应支付方式
     */
    public java.lang.Integer nodePayMethodId;

    /**
     * 交易类型
     */
    public java.lang.Integer payTypeId;

    /**
     * 业务类型
     */
    public java.lang.Integer tradeTypeId;

    /**
     * 支付渠道流水
     */
    public java.lang.String payChannelSerial;

    /**
     * 使用系统流水
     */
    public java.lang.String payUserSerial;

    /**
     * 交易金额
     */
    public java.lang.Long amount;

    /**
     * 
     */
    public java.lang.Long realAmount;

    /**
     * 当时交易类型为撤销或退款时，填写对应的支付流水
     */
    public java.lang.String operSerialId;

    /**
     * 当交易类型为撤销或退款时，填写对应的使用系统流水
     */
    public java.lang.String operSerialNbr;

    /**
     * 交易状态，PAY-C-0006
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
     * 回调前台地址
     */
    public java.lang.String notifyUrl;

    /**
     * 回调后后台地址
     */
    public java.lang.String returnUrl;

    /**
     * POS结算批次
     */
    public java.lang.String posSettleSerial;

    /**
     * POS终端号
     */
    public java.lang.String posTermialnbr;

    /**
     * POS收银流水
     */
    public java.lang.String posPaySerial;

    /**
     * 支付渠道返回码
     */
    public java.lang.String channelReturnCode;

    /**
     * 支付渠道返回信息
     */
    public java.lang.String channelReturnMsg;

    /**
     * 操作工号
     */
    public java.lang.Integer staffId;

    /**
     * 工号对应操作的组织机构
     */
    public java.lang.Integer orgId;

    /**
     * 商品名称
     */
    public java.lang.String commodityName;

    /**
     * 商品描述
     */
    public java.lang.String commodityDesc;

    /**
     * BSS系统的帐号标识
     */
    public java.lang.Long accountId;

    /**
     * 消费者在支付渠道的帐号信息
     */
    public java.lang.String customerAccount;

    /**
     * 归属区域
     */
    public java.lang.Integer regionId;

    /**
     * 设置 支付流水标识主键
     */
    public void setPaySerialId(java.lang.Integer paySerialId) {
        this.paySerialId = paySerialId;
    }

    /**
     * 获取 支付流水标识主键
     */
    public java.lang.Integer getPaySerialId() {
        return this.paySerialId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.paySerialId = SeqUtils.createIntegerId(ID_SEQ);
         return this.paySerialId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 对应支付节点主键
     */
    public void setPayNodeId(java.lang.Integer payNodeId) {
        this.payNodeId = payNodeId;
    }

    /**
     * 获取 对应支付节点主键
     */
    public java.lang.Integer getPayNodeId() {
        return this.payNodeId;
    }

    /**
     * 设置 对应支付方式
     */
    public void setNodePayMethodId(java.lang.Integer nodePayMethodId) {
        this.nodePayMethodId = nodePayMethodId;
    }

    /**
     * 获取 对应支付方式
     */
    public java.lang.Integer getNodePayMethodId() {
        return this.nodePayMethodId;
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
     * 设置 业务类型
     */
    public void setTradeTypeId(java.lang.Integer tradeTypeId) {
        this.tradeTypeId = tradeTypeId;
    }

    /**
     * 获取 业务类型
     */
    public java.lang.Integer getTradeTypeId() {
        return this.tradeTypeId;
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
     * 设置 交易金额
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    /**
     * 获取 交易金额
     */
    public java.lang.Long getAmount() {
        return this.amount;
    }

    /**
     * 设置 
     */
    public void setRealAmount(java.lang.Long realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取 
     */
    public java.lang.Long getRealAmount() {
        return this.realAmount;
    }

    /**
     * 设置 当时交易类型为撤销或退款时，填写对应的支付流水
     */
    public void setOperSerialId(java.lang.String operSerialId) {
        this.operSerialId = operSerialId;
    }

    /**
     * 获取 当时交易类型为撤销或退款时，填写对应的支付流水
     */
    public java.lang.String getOperSerialId() {
        return this.operSerialId;
    }

    /**
     * 设置 当交易类型为撤销或退款时，填写对应的使用系统流水
     */
    public void setOperSerialNbr(java.lang.String operSerialNbr) {
        this.operSerialNbr = operSerialNbr;
    }

    /**
     * 获取 当交易类型为撤销或退款时，填写对应的使用系统流水
     */
    public java.lang.String getOperSerialNbr() {
        return this.operSerialNbr;
    }

    /**
     * 设置 交易状态，PAY-C-0006
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 交易状态，PAY-C-0006
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
     * 设置 回调前台地址
     */
    public void setNotifyUrl(java.lang.String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 获取 回调前台地址
     */
    public java.lang.String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * 设置 回调后后台地址
     */
    public void setReturnUrl(java.lang.String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * 获取 回调后后台地址
     */
    public java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    /**
     * 设置 POS结算批次
     */
    public void setPosSettleSerial(java.lang.String posSettleSerial) {
        this.posSettleSerial = posSettleSerial;
    }

    /**
     * 获取 POS结算批次
     */
    public java.lang.String getPosSettleSerial() {
        return this.posSettleSerial;
    }

    /**
     * 设置 POS终端号
     */
    public void setPosTermialnbr(java.lang.String posTermialnbr) {
        this.posTermialnbr = posTermialnbr;
    }

    /**
     * 获取 POS终端号
     */
    public java.lang.String getPosTermialnbr() {
        return this.posTermialnbr;
    }

    /**
     * 设置 POS收银流水
     */
    public void setPosPaySerial(java.lang.String posPaySerial) {
        this.posPaySerial = posPaySerial;
    }

    /**
     * 获取 POS收银流水
     */
    public java.lang.String getPosPaySerial() {
        return this.posPaySerial;
    }

    /**
     * 设置 支付渠道返回码
     */
    public void setChannelReturnCode(java.lang.String channelReturnCode) {
        this.channelReturnCode = channelReturnCode;
    }

    /**
     * 获取 支付渠道返回码
     */
    public java.lang.String getChannelReturnCode() {
        return this.channelReturnCode;
    }

    /**
     * 设置 支付渠道返回信息
     */
    public void setChannelReturnMsg(java.lang.String channelReturnMsg) {
        this.channelReturnMsg = channelReturnMsg;
    }

    /**
     * 获取 支付渠道返回信息
     */
    public java.lang.String getChannelReturnMsg() {
        return this.channelReturnMsg;
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
     * 设置 工号对应操作的组织机构
     */
    public void setOrgId(java.lang.Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 工号对应操作的组织机构
     */
    public java.lang.Integer getOrgId() {
        return this.orgId;
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
     * 设置 BSS系统的帐号标识
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取 BSS系统的帐号标识
     */
    public java.lang.Long getAccountId() {
        return this.accountId;
    }

    /**
     * 设置 消费者在支付渠道的帐号信息
     */
    public void setCustomerAccount(java.lang.String customerAccount) {
        this.customerAccount = customerAccount;
    }

    /**
     * 获取 消费者在支付渠道的帐号信息
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
