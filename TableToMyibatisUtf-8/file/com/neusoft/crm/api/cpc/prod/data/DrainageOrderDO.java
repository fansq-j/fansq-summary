package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录客户引流单信息
 * @实体表  :DRAINAGE_ORDER
 */
public class DrainageOrderDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DRAINAGE_ORDER_S";

    /**
     * 引流单标识
     */
    public java.lang.Long drainageOrderId;

    /**
     * 商机单流水
     */
    public java.lang.String busiCaseOrderNbr;

    /**
     * 来源
     */
    public java.lang.String source;

    /**
     * 目标对象类型,LOVB=CAM-C-0005
     */
    public java.lang.String targetObjType;

    /**
     * 目标对象标识
     */
    public java.lang.String targetObjNbr;

    /**
     * 记录状态。LOVB=EVT-C-0020。
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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 引流单标识
     */
    public void setDrainageOrderId(java.lang.Long drainageOrderId) {
        this.drainageOrderId = drainageOrderId;
    }

    /**
     * 获取 引流单标识
     */
    public java.lang.Long getDrainageOrderId() {
        return this.drainageOrderId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.drainageOrderId = SeqUtils.createLongId(ID_SEQ);
         return this.drainageOrderId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 商机单流水
     */
    public void setBusiCaseOrderNbr(java.lang.String busiCaseOrderNbr) {
        this.busiCaseOrderNbr = busiCaseOrderNbr;
    }

    /**
     * 获取 商机单流水
     */
    public java.lang.String getBusiCaseOrderNbr() {
        return this.busiCaseOrderNbr;
    }

    /**
     * 设置 来源
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    /**
     * 获取 来源
     */
    public java.lang.String getSource() {
        return this.source;
    }

    /**
     * 设置 目标对象类型,LOVB=CAM-C-0005
     */
    public void setTargetObjType(java.lang.String targetObjType) {
        this.targetObjType = targetObjType;
    }

    /**
     * 获取 目标对象类型,LOVB=CAM-C-0005
     */
    public java.lang.String getTargetObjType() {
        return this.targetObjType;
    }

    /**
     * 设置 目标对象标识
     */
    public void setTargetObjNbr(java.lang.String targetObjNbr) {
        this.targetObjNbr = targetObjNbr;
    }

    /**
     * 获取 目标对象标识
     */
    public java.lang.String getTargetObjNbr() {
        return this.targetObjNbr;
    }

    /**
     * 设置 记录状态。LOVB=EVT-C-0020。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=EVT-C-0020。
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
