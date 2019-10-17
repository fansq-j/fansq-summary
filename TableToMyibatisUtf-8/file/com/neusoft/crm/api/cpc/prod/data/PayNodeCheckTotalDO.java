package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录每个支付节点的对帐汇总信息
 * @实体表  :PAY_NODE_CHECK_TOTAL
 */
public class PayNodeCheckTotalDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_NODE_CHECK_TOTAL_S";

    /**
     * 对帐汇总标识主键
     */
    public java.lang.Long checkTotalId;

    /**
     * 对应支付节点标识主键
     */
    public java.lang.Integer payNodeId;

    /**
     * 被对帐的日期
     */
    public java.util.Date checkDate;

    /**
     * 总记录数
     */
    public java.lang.Integer totalRecord;

    /**
     * 差异记录数
     */
    public java.lang.Integer diffRecord;

    /**
     * 总金额
     */
    public java.lang.Long totalAmount;

    /**
     * 差异金额
     */
    public java.lang.Long diffAmount;

    /**
     * 处理日期
     */
    public java.util.Date statusDate;

    /**
     * 对帐结果，PAY-C-0005
     */
    public java.lang.Integer statusCd;

    /**
     * 对帐结果描述
     */
    public java.lang.String resultDesc;

    /**
     * 对帐结果是否确认，PAY-C-0002
     */
    public java.lang.Integer confirmFlag;

    /**
     * 对帐结果确认时间
     */
    public java.util.Date confirmDate;

    /**
     * 设置 对帐汇总标识主键
     */
    public void setCheckTotalId(java.lang.Long checkTotalId) {
        this.checkTotalId = checkTotalId;
    }

    /**
     * 获取 对帐汇总标识主键
     */
    public java.lang.Long getCheckTotalId() {
        return this.checkTotalId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.checkTotalId = SeqUtils.createLongId(ID_SEQ);
         return this.checkTotalId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 对应支付节点标识主键
     */
    public void setPayNodeId(java.lang.Integer payNodeId) {
        this.payNodeId = payNodeId;
    }

    /**
     * 获取 对应支付节点标识主键
     */
    public java.lang.Integer getPayNodeId() {
        return this.payNodeId;
    }

    /**
     * 设置 被对帐的日期
     */
    public void setCheckDate(java.util.Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取 被对帐的日期
     */
    public java.util.Date getCheckDate() {
        return this.checkDate;
    }

    /**
     * 设置 总记录数
     */
    public void setTotalRecord(java.lang.Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    /**
     * 获取 总记录数
     */
    public java.lang.Integer getTotalRecord() {
        return this.totalRecord;
    }

    /**
     * 设置 差异记录数
     */
    public void setDiffRecord(java.lang.Integer diffRecord) {
        this.diffRecord = diffRecord;
    }

    /**
     * 获取 差异记录数
     */
    public java.lang.Integer getDiffRecord() {
        return this.diffRecord;
    }

    /**
     * 设置 总金额
     */
    public void setTotalAmount(java.lang.Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取 总金额
     */
    public java.lang.Long getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * 设置 差异金额
     */
    public void setDiffAmount(java.lang.Long diffAmount) {
        this.diffAmount = diffAmount;
    }

    /**
     * 获取 差异金额
     */
    public java.lang.Long getDiffAmount() {
        return this.diffAmount;
    }

    /**
     * 设置 处理日期
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 处理日期
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 对帐结果，PAY-C-0005
     */
    public void setStatusCd(java.lang.Integer statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 对帐结果，PAY-C-0005
     */
    public java.lang.Integer getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 对帐结果描述
     */
    public void setResultDesc(java.lang.String resultDesc) {
        this.resultDesc = resultDesc;
    }

    /**
     * 获取 对帐结果描述
     */
    public java.lang.String getResultDesc() {
        return this.resultDesc;
    }

    /**
     * 设置 对帐结果是否确认，PAY-C-0002
     */
    public void setConfirmFlag(java.lang.Integer confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    /**
     * 获取 对帐结果是否确认，PAY-C-0002
     */
    public java.lang.Integer getConfirmFlag() {
        return this.confirmFlag;
    }

    /**
     * 设置 对帐结果确认时间
     */
    public void setConfirmDate(java.util.Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    /**
     * 获取 对帐结果确认时间
     */
    public java.util.Date getConfirmDate() {
        return this.confirmDate;
    }

}
