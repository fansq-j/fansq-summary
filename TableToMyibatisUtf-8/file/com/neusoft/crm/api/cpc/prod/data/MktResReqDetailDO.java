package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录申请单的具体的营销资源详细信息，营销资源实例，号码实例，卡实例，发票实例等等。
 * @实体表  :MKT_RES_REQ_DETAIL
 */
public class MktResReqDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_REQ_DETAIL_S";

    /**
     * 记录营销资源申请单明细标识
     */
    public java.lang.Long mktResReqDetailId;

    /**
     * 营销资源申请单项标识
     */
    public java.lang.Long mktResReqItemId;

    /**
     * 营销资源实例ID的标识
     */
    public java.lang.Long mktResInstId;

    /**
     * 发货时间，在手机通知发货的时候需要记录发货时间，根据发货时间，如果超过设置的时间，会自动确认收货。
     */
    public java.util.Date dispDate;

    /**
     * 到货时间，在手机确认收货的时候记录到货时间
     */
    public java.util.Date arriveDate;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

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
     * 记录营销资源实例的数量
     */
    public java.lang.Long quantity;

    /**
     * 记录营销资源实例的数量单位，LOVB=RES-C-0011
     */
    public java.lang.String unit;

    /**
     * 记录出入库类型,LOVB=RES-C-0012
     */
    public java.lang.String chngType;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 记录营销资源申请单明细标识
     */
    public void setMktResReqDetailId(java.lang.Long mktResReqDetailId) {
        this.mktResReqDetailId = mktResReqDetailId;
    }

    /**
     * 获取 记录营销资源申请单明细标识
     */
    public java.lang.Long getMktResReqDetailId() {
        return this.mktResReqDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResReqDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResReqDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源申请单项标识
     */
    public void setMktResReqItemId(java.lang.Long mktResReqItemId) {
        this.mktResReqItemId = mktResReqItemId;
    }

    /**
     * 获取 营销资源申请单项标识
     */
    public java.lang.Long getMktResReqItemId() {
        return this.mktResReqItemId;
    }

    /**
     * 设置 营销资源实例ID的标识
     */
    public void setMktResInstId(java.lang.Long mktResInstId) {
        this.mktResInstId = mktResInstId;
    }

    /**
     * 获取 营销资源实例ID的标识
     */
    public java.lang.Long getMktResInstId() {
        return this.mktResInstId;
    }

    /**
     * 设置 发货时间，在手机通知发货的时候需要记录发货时间，根据发货时间，如果超过设置的时间，会自动确认收货。
     */
    public void setDispDate(java.util.Date dispDate) {
        this.dispDate = dispDate;
    }

    /**
     * 获取 发货时间，在手机通知发货的时候需要记录发货时间，根据发货时间，如果超过设置的时间，会自动确认收货。
     */
    public java.util.Date getDispDate() {
        return this.dispDate;
    }

    /**
     * 设置 到货时间，在手机确认收货的时候记录到货时间
     */
    public void setArriveDate(java.util.Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    /**
     * 获取 到货时间，在手机确认收货的时候记录到货时间
     */
    public java.util.Date getArriveDate() {
        return this.arriveDate;
    }

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录营销资源实例的数量
     */
    public void setQuantity(java.lang.Long quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取 记录营销资源实例的数量
     */
    public java.lang.Long getQuantity() {
        return this.quantity;
    }

    /**
     * 设置 记录营销资源实例的数量单位，LOVB=RES-C-0011
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    /**
     * 获取 记录营销资源实例的数量单位，LOVB=RES-C-0011
     */
    public java.lang.String getUnit() {
        return this.unit;
    }

    /**
     * 设置 记录出入库类型,LOVB=RES-C-0012
     */
    public void setChngType(java.lang.String chngType) {
        this.chngType = chngType;
    }

    /**
     * 获取 记录出入库类型,LOVB=RES-C-0012
     */
    public java.lang.String getChngType() {
        return this.chngType;
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

}
