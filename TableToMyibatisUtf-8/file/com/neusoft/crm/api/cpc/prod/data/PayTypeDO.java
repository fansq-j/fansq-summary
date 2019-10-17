package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:交易类型定义，支付、撤销、退款等
 * @实体表  :PAY_TYPE
 */
public class PayTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PAY_TYPE_S";

    /**
     * 交易类型标识
     */
    public java.lang.Integer payTypeId;

    /**
     * 交易类型名称
     */
    public java.lang.String payTypeName;

    /**
     * 记录状态。PAY-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 创建日期
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 交易类型标识
     */
    public void setPayTypeId(java.lang.Integer payTypeId) {
        this.payTypeId = payTypeId;
    }

    /**
     * 获取 交易类型标识
     */
    public java.lang.Integer getPayTypeId() {
        return this.payTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.payTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.payTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 交易类型名称
     */
    public void setPayTypeName(java.lang.String payTypeName) {
        this.payTypeName = payTypeName;
    }

    /**
     * 获取 交易类型名称
     */
    public java.lang.String getPayTypeName() {
        return this.payTypeName;
    }

    /**
     * 设置 记录状态。PAY-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。PAY-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建日期
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建日期
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
