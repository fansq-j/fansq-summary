package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录描述订单或者订单项的经办人信息，可供多个订单项复用。
 * @实体表  :ORDER_HANDLER
 */
public class OrderHandlerDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORDER_HANDLER_S";

    /**
     * 订单经办人信息标识
     */
    public java.lang.Long orderHandlerId;

    /**
     * 记录客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 经办人
     */
    public java.lang.String handler;

    /**
     * 经办人的证件类型，LOVB=PTY-0004
     */
    public java.lang.String certType;

    /**
     * 经办人的证件号码
     */
    public java.lang.String certNum;

    /**
     * 经办人联系号码
     */
    public java.lang.String handlerPhone;

    /**
     * 记录二代身份证的扫描信息
     */
    public java.lang.String certInfo;

    /**
     * 记录数据的状态，LOVB=EVT-C-0014
            
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 订单经办人信息标识
     */
    public void setOrderHandlerId(java.lang.Long orderHandlerId) {
        this.orderHandlerId = orderHandlerId;
    }

    /**
     * 获取 订单经办人信息标识
     */
    public java.lang.Long getOrderHandlerId() {
        return this.orderHandlerId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orderHandlerId = SeqUtils.createLongId(ID_SEQ);
         return this.orderHandlerId;
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
     * 设置 经办人
     */
    public void setHandler(java.lang.String handler) {
        this.handler = handler;
    }

    /**
     * 获取 经办人
     */
    public java.lang.String getHandler() {
        return this.handler;
    }

    /**
     * 设置 经办人的证件类型，LOVB=PTY-0004
     */
    public void setCertType(java.lang.String certType) {
        this.certType = certType;
    }

    /**
     * 获取 经办人的证件类型，LOVB=PTY-0004
     */
    public java.lang.String getCertType() {
        return this.certType;
    }

    /**
     * 设置 经办人的证件号码
     */
    public void setCertNum(java.lang.String certNum) {
        this.certNum = certNum;
    }

    /**
     * 获取 经办人的证件号码
     */
    public java.lang.String getCertNum() {
        return this.certNum;
    }

    /**
     * 设置 经办人联系号码
     */
    public void setHandlerPhone(java.lang.String handlerPhone) {
        this.handlerPhone = handlerPhone;
    }

    /**
     * 获取 经办人联系号码
     */
    public java.lang.String getHandlerPhone() {
        return this.handlerPhone;
    }

    /**
     * 设置 记录二代身份证的扫描信息
     */
    public void setCertInfo(java.lang.String certInfo) {
        this.certInfo = certInfo;
    }

    /**
     * 获取 记录二代身份证的扫描信息
     */
    public java.lang.String getCertInfo() {
        return this.certInfo;
    }

    /**
     * 设置 记录数据的状态，LOVB=EVT-C-0014
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，LOVB=EVT-C-0014
            
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
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
