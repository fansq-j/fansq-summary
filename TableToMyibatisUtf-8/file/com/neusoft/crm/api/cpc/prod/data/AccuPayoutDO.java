package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录量本使用明细. 如被谁使用.
 * @实体表  :ACCU_PAYOUT
 */
public class AccuPayoutDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCU_PAYOUT_S";

    /**
     * 量本支出记录标识
     */
    public java.lang.Long accuPayoutId;

    /**
     * 量本标识
     */
    public java.lang.Long accuId;

    /**
     * LOVB=PRC-C-0016
     */
    public java.lang.Integer payoutType;

    /**
     * 1-记录转赠流水号  2-记录转换流水号  3-记录计费事件序列号
     */
    public java.lang.Long payoutId;

    /**
     * 仅为支出类型为3时要填写。
     */
    public java.lang.Long prodInstId;

    /**
     * 操作值
     */
    public java.lang.Long opValue;

    /**
     * 备注
     */
    public java.lang.String remark;

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
     * 设置 量本支出记录标识
     */
    public void setAccuPayoutId(java.lang.Long accuPayoutId) {
        this.accuPayoutId = accuPayoutId;
    }

    /**
     * 获取 量本支出记录标识
     */
    public java.lang.Long getAccuPayoutId() {
        return this.accuPayoutId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accuPayoutId = SeqUtils.createLongId(ID_SEQ);
         return this.accuPayoutId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 量本标识
     */
    public void setAccuId(java.lang.Long accuId) {
        this.accuId = accuId;
    }

    /**
     * 获取 量本标识
     */
    public java.lang.Long getAccuId() {
        return this.accuId;
    }

    /**
     * 设置 LOVB=PRC-C-0016
     */
    public void setPayoutType(java.lang.Integer payoutType) {
        this.payoutType = payoutType;
    }

    /**
     * 获取 LOVB=PRC-C-0016
     */
    public java.lang.Integer getPayoutType() {
        return this.payoutType;
    }

    /**
     * 设置 1-记录转赠流水号  2-记录转换流水号  3-记录计费事件序列号
     */
    public void setPayoutId(java.lang.Long payoutId) {
        this.payoutId = payoutId;
    }

    /**
     * 获取 1-记录转赠流水号  2-记录转换流水号  3-记录计费事件序列号
     */
    public java.lang.Long getPayoutId() {
        return this.payoutId;
    }

    /**
     * 设置 仅为支出类型为3时要填写。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 仅为支出类型为3时要填写。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 操作值
     */
    public void setOpValue(java.lang.Long opValue) {
        this.opValue = opValue;
    }

    /**
     * 获取 操作值
     */
    public java.lang.Long getOpValue() {
        return this.opValue;
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
