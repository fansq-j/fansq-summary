package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录描述订单或者订单项的联系信息。
 * @实体表  :ORDER_CONTACT_INFO
 */
public class OrderContactInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORDER_CONTACT_INFO_S";

    /**
     * 订单联系人信息标识
     */
    public java.lang.Long orderContactInfoId;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录客户订单标识
     */
    public java.lang.Long custOrderId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 联系人姓名（数据可以来源于参与人联系信息，这里是副本）
     */
    public java.lang.String contactName;

    /**
     * 联系人号码
     */
    public java.lang.String contactPhone;

    /**
     * 记录是否首选。LOVB=PUB-C-0006
     */
    public java.lang.String fisrtChange;

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
     * 设置 订单联系人信息标识
     */
    public void setOrderContactInfoId(java.lang.Long orderContactInfoId) {
        this.orderContactInfoId = orderContactInfoId;
    }

    /**
     * 获取 订单联系人信息标识
     */
    public java.lang.Long getOrderContactInfoId() {
        return this.orderContactInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.orderContactInfoId = SeqUtils.createLongId(ID_SEQ);
         return this.orderContactInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
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
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 联系人姓名（数据可以来源于参与人联系信息，这里是副本）
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取 联系人姓名（数据可以来源于参与人联系信息，这里是副本）
     */
    public java.lang.String getContactName() {
        return this.contactName;
    }

    /**
     * 设置 联系人号码
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取 联系人号码
     */
    public java.lang.String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * 设置 记录是否首选。LOVB=PUB-C-0006
     */
    public void setFisrtChange(java.lang.String fisrtChange) {
        this.fisrtChange = fisrtChange;
    }

    /**
     * 获取 记录是否首选。LOVB=PUB-C-0006
     */
    public java.lang.String getFisrtChange() {
        return this.fisrtChange;
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
