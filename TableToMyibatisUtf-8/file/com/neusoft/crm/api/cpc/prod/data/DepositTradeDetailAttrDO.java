package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:存放押金收支明细的附加属性，
如租机时的手机串号信息等
销售品类型等
 * @实体表  :DEPOSIT_TRADE_DETAIL_ATTR
 */
public class DepositTradeDetailAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEPOSIT_TRADE_DETAIL_ATTR_S";

    /**
     * 押金收支明细属性标识
     */
    public java.lang.Long depositSoDtlAttrId;

    /**
     * 押金收支明细流水，外键
     */
    public java.lang.Long depositSoDetailId;

    /**
     * 押金收支明细附加属性的类型。ACC-C-0188
     */
    public java.lang.Integer attrType;

    /**
     * 属性的取值，比如手机串码值等
     */
    public java.lang.String attrValue;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 创建记录的员工
     */
    public java.lang.Long createStaff;

    /**
     * 修改记录的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 创建记录的时间
     */
    public java.util.Date createDate;

    /**
     * 记录的状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改记录的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 押金收支明细属性标识
     */
    public void setDepositSoDtlAttrId(java.lang.Long depositSoDtlAttrId) {
        this.depositSoDtlAttrId = depositSoDtlAttrId;
    }

    /**
     * 获取 押金收支明细属性标识
     */
    public java.lang.Long getDepositSoDtlAttrId() {
        return this.depositSoDtlAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.depositSoDtlAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.depositSoDtlAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 押金收支明细流水，外键
     */
    public void setDepositSoDetailId(java.lang.Long depositSoDetailId) {
        this.depositSoDetailId = depositSoDetailId;
    }

    /**
     * 获取 押金收支明细流水，外键
     */
    public java.lang.Long getDepositSoDetailId() {
        return this.depositSoDetailId;
    }

    /**
     * 设置 押金收支明细附加属性的类型。ACC-C-0188
     */
    public void setAttrType(java.lang.Integer attrType) {
        this.attrType = attrType;
    }

    /**
     * 获取 押金收支明细附加属性的类型。ACC-C-0188
     */
    public java.lang.Integer getAttrType() {
        return this.attrType;
    }

    /**
     * 设置 属性的取值，比如手机串码值等
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 属性的取值，比如手机串码值等
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建记录的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建记录的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改记录的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改记录的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建记录的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建记录的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录的状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录的状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 修改记录的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改记录的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
