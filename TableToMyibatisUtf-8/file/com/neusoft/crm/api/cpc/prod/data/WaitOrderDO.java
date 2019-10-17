package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营业厅线下排号及线上预约取号信息，包括业务服务类型、排队号码等信息
 * @实体表  :WAIT_ORDER
 */
public class WaitOrderDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "WAIT_ORDER_S";

    /**
     * 排号单标识，主键
     */
    public java.lang.Long waitOrderId;

    /**
     * 排号单编码
     */
    public java.lang.String waitOrderNbr;

    /**
     * 营业厅
     */
    public java.lang.Long orgId;

    /**
     * 预约单标识
     */
    public java.lang.Long bookOrderId;

    /**
     * 业务服务类型标识
     */
    public java.lang.Long servTypeId;

    /**
     * 区域标识
     */
    public java.lang.Long regionId;

    /**
     * 本地网
     */
    public java.lang.Integer lanId;

    /**
     * 对象类型，客户、证件、号码等。LOVB=STF-C-0028
     */
    public java.lang.String objType;

    /**
     * 对象信息，客户标识、证件号码，手机号码
     */
    public java.lang.String objId;

    /**
     * 排号时间
     */
    public java.util.Date orderDate;

    /**
     * 主数据：已取号、已叫号、已作废.LOVB=STF-C-0030
     */
    public java.lang.String statusCd;

    /**
     * 叫号工号
     */
    public java.lang.Long callStaff;

    /**
     * 叫号坐席标识
     */
    public java.lang.Long seatId;

    /**
     * 叫号时间
     */
    public java.util.Date callDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 排号单标识，主键
     */
    public void setWaitOrderId(java.lang.Long waitOrderId) {
        this.waitOrderId = waitOrderId;
    }

    /**
     * 获取 排号单标识，主键
     */
    public java.lang.Long getWaitOrderId() {
        return this.waitOrderId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.waitOrderId = SeqUtils.createLongId(ID_SEQ);
         return this.waitOrderId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 排号单编码
     */
    public void setWaitOrderNbr(java.lang.String waitOrderNbr) {
        this.waitOrderNbr = waitOrderNbr;
    }

    /**
     * 获取 排号单编码
     */
    public java.lang.String getWaitOrderNbr() {
        return this.waitOrderNbr;
    }

    /**
     * 设置 营业厅
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 营业厅
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 预约单标识
     */
    public void setBookOrderId(java.lang.Long bookOrderId) {
        this.bookOrderId = bookOrderId;
    }

    /**
     * 获取 预约单标识
     */
    public java.lang.Long getBookOrderId() {
        return this.bookOrderId;
    }

    /**
     * 设置 业务服务类型标识
     */
    public void setServTypeId(java.lang.Long servTypeId) {
        this.servTypeId = servTypeId;
    }

    /**
     * 获取 业务服务类型标识
     */
    public java.lang.Long getServTypeId() {
        return this.servTypeId;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 本地网
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网
     */
    public java.lang.Integer getLanId() {
        return this.lanId;
    }

    /**
     * 设置 对象类型，客户、证件、号码等。LOVB=STF-C-0028
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 对象类型，客户、证件、号码等。LOVB=STF-C-0028
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象信息，客户标识、证件号码，手机号码
     */
    public void setObjId(java.lang.String objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象信息，客户标识、证件号码，手机号码
     */
    public java.lang.String getObjId() {
        return this.objId;
    }

    /**
     * 设置 排号时间
     */
    public void setOrderDate(java.util.Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取 排号时间
     */
    public java.util.Date getOrderDate() {
        return this.orderDate;
    }

    /**
     * 设置 主数据：已取号、已叫号、已作废.LOVB=STF-C-0030
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 主数据：已取号、已叫号、已作废.LOVB=STF-C-0030
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 叫号工号
     */
    public void setCallStaff(java.lang.Long callStaff) {
        this.callStaff = callStaff;
    }

    /**
     * 获取 叫号工号
     */
    public java.lang.Long getCallStaff() {
        return this.callStaff;
    }

    /**
     * 设置 叫号坐席标识
     */
    public void setSeatId(java.lang.Long seatId) {
        this.seatId = seatId;
    }

    /**
     * 获取 叫号坐席标识
     */
    public java.lang.Long getSeatId() {
        return this.seatId;
    }

    /**
     * 设置 叫号时间
     */
    public void setCallDate(java.util.Date callDate) {
        this.callDate = callDate;
    }

    /**
     * 获取 叫号时间
     */
    public java.util.Date getCallDate() {
        return this.callDate;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
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
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
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
