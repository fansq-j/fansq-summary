package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录客户订单所产生的物流
 * @实体表  :CUST_ORDER_LOGISTICS
 */
public class CustOrderLogisticsDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_ORDER_LOGISTICS_S";

    /**
     * 销售事件物流标识
     */
    public java.lang.Long custOrderLogisticsId;

    /**
     * 记录客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 收货人
     */
    public java.lang.String receiverName;

    /**
     * 收货地址
     */
    public java.lang.String receiverAddr;

    /**
     * 收货人联系电话
     */
    public java.lang.String receiverPhone;

    /**
     * 邮政编码
     */
    public java.lang.String postcode;

    /**
     * 物流单号
     */
    public java.lang.String logisticsNbr;

    /**
     * 物流公司
     */
    public java.lang.String logisticsCompany;

    /**
     * 状态。LOVB=EVT-C-0019
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 销售事件物流标识
     */
    public void setCustOrderLogisticsId(java.lang.Long custOrderLogisticsId) {
        this.custOrderLogisticsId = custOrderLogisticsId;
    }

    /**
     * 获取 销售事件物流标识
     */
    public java.lang.Long getCustOrderLogisticsId() {
        return this.custOrderLogisticsId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custOrderLogisticsId = SeqUtils.createLongId(ID_SEQ);
         return this.custOrderLogisticsId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户订单标识
     */
    public void setCustOrderId(java.lang.Long custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * 获取 记录客户订单标识
     */
    public java.lang.Long getCustOrderId() {
        return this.custOrderId;
    }

    /**
     * 设置 收货人
     */
    public void setReceiverName(java.lang.String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取 收货人
     */
    public java.lang.String getReceiverName() {
        return this.receiverName;
    }

    /**
     * 设置 收货地址
     */
    public void setReceiverAddr(java.lang.String receiverAddr) {
        this.receiverAddr = receiverAddr;
    }

    /**
     * 获取 收货地址
     */
    public java.lang.String getReceiverAddr() {
        return this.receiverAddr;
    }

    /**
     * 设置 收货人联系电话
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * 获取 收货人联系电话
     */
    public java.lang.String getReceiverPhone() {
        return this.receiverPhone;
    }

    /**
     * 设置 邮政编码
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取 邮政编码
     */
    public java.lang.String getPostcode() {
        return this.postcode;
    }

    /**
     * 设置 物流单号
     */
    public void setLogisticsNbr(java.lang.String logisticsNbr) {
        this.logisticsNbr = logisticsNbr;
    }

    /**
     * 获取 物流单号
     */
    public java.lang.String getLogisticsNbr() {
        return this.logisticsNbr;
    }

    /**
     * 设置 物流公司
     */
    public void setLogisticsCompany(java.lang.String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    /**
     * 获取 物流公司
     */
    public java.lang.String getLogisticsCompany() {
        return this.logisticsCompany;
    }

    /**
     * 设置 状态。LOVB=EVT-C-0019
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=EVT-C-0019
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
