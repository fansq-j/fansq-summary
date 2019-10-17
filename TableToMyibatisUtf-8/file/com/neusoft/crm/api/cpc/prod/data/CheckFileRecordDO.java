package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录各个平台提供的交易流水信息
 * @实体表  :CHECK_FILE_RECORD
 */
public class CheckFileRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CHECK_FILE_RECORD_S";

    /**
     * 对帐文件记录标识主键
     */
    public java.lang.Long recordId;

    /**
     * 对应对帐文件列表主键
     */
    public java.lang.Integer fileId;

    /**
     * 交易类型
     */
    public java.lang.Integer payTypeId;

    /**
     * PAY-C-0004:1-支付使用系统；2-支付渠道
     */
    public java.lang.Integer objType;

    /**
     * 当对象类型为1时，为使用系统标识；但是对象类型为2时，为支付渠道标识
     */
    public java.lang.Integer objId;

    /**
     * 被对帐记录的日期
     */
    public java.util.Date checkDate;

    /**
     * 对应支付流水主键
     */
    public java.lang.String paySerialId;

    /**
     * 记录外部支付流水，当对象类型为1时，为使用系统流水；当对象类型为2时，为支付渠道流水
     */
    public java.lang.String paySerialNbr;

    /**
     * 交易金额
     */
    public java.lang.Long amount;

    /**
     * 处理状态，PAY-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 交易创建日期
     */
    public java.util.Date createDate;

    /**
     * 交易支付日期
     */
    public java.util.Date payDate;

    /**
     * 状态变更日期
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
     * 消费者在支付渠道的帐号信息
     */
    public java.lang.String customerAccount;

    /**
     * 归属区域
     */
    public java.lang.Integer regionId;

    /**
     * 设置 对帐文件记录标识主键
     */
    public void setRecordId(java.lang.Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取 对帐文件记录标识主键
     */
    public java.lang.Long getRecordId() {
        return this.recordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.recordId = SeqUtils.createLongId(ID_SEQ);
         return this.recordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 对应对帐文件列表主键
     */
    public void setFileId(java.lang.Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取 对应对帐文件列表主键
     */
    public java.lang.Integer getFileId() {
        return this.fileId;
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
     * 设置 PAY-C-0004:1-支付使用系统；2-支付渠道
     */
    public void setObjType(java.lang.Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取 PAY-C-0004:1-支付使用系统；2-支付渠道
     */
    public java.lang.Integer getObjType() {
        return this.objType;
    }

    /**
     * 设置 当对象类型为1时，为使用系统标识；但是对象类型为2时，为支付渠道标识
     */
    public void setObjId(java.lang.Integer objId) {
        this.objId = objId;
    }

    /**
     * 获取 当对象类型为1时，为使用系统标识；但是对象类型为2时，为支付渠道标识
     */
    public java.lang.Integer getObjId() {
        return this.objId;
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
     * 设置 对应支付流水主键
     */
    public void setPaySerialId(java.lang.String paySerialId) {
        this.paySerialId = paySerialId;
    }

    /**
     * 获取 对应支付流水主键
     */
    public java.lang.String getPaySerialId() {
        return this.paySerialId;
    }

    /**
     * 设置 记录外部支付流水，当对象类型为1时，为使用系统流水；当对象类型为2时，为支付渠道流水
     */
    public void setPaySerialNbr(java.lang.String paySerialNbr) {
        this.paySerialNbr = paySerialNbr;
    }

    /**
     * 获取 记录外部支付流水，当对象类型为1时，为使用系统流水；当对象类型为2时，为支付渠道流水
     */
    public java.lang.String getPaySerialNbr() {
        return this.paySerialNbr;
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
     * 设置 交易创建日期
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 交易创建日期
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 交易支付日期
     */
    public void setPayDate(java.util.Date payDate) {
        this.payDate = payDate;
    }

    /**
     * 获取 交易支付日期
     */
    public java.util.Date getPayDate() {
        return this.payDate;
    }

    /**
     * 设置 状态变更日期
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更日期
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
