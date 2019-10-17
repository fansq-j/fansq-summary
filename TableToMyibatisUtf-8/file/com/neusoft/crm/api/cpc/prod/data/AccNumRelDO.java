package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品实例接入号码之前的关联关系，如同号关系，主从关系。
 * @实体表  :ACC_NUM_REL
 */
public class AccNumRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACC_NUM_REL_S";

    /**
     * 记录号码关系标识，主键。
     */
    public java.lang.Long accNumRelId;

    /**
     * 记录A端号码标识。
     */
    public java.lang.Long aAccNumId;

    /**
     * 记录Z端号码标识。
     */
    public java.lang.Long zAccNumId;

    /**
     * 记录关系类型，LOVB=PRI-C-0035
     */
    public java.lang.String relType;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录号码关系标识，主键。
     */
    public void setAccNumRelId(java.lang.Long accNumRelId) {
        this.accNumRelId = accNumRelId;
    }

    /**
     * 获取 记录号码关系标识，主键。
     */
    public java.lang.Long getAccNumRelId() {
        return this.accNumRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accNumRelId = SeqUtils.createLongId(ID_SEQ);
         return this.accNumRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录A端号码标识。
     */
    public void setAAccNumId(java.lang.Long aAccNumId) {
        this.aAccNumId = aAccNumId;
    }

    /**
     * 获取 记录A端号码标识。
     */
    public java.lang.Long getAAccNumId() {
        return this.aAccNumId;
    }

    /**
     * 设置 记录Z端号码标识。
     */
    public void setZAccNumId(java.lang.Long zAccNumId) {
        this.zAccNumId = zAccNumId;
    }

    /**
     * 获取 记录Z端号码标识。
     */
    public java.lang.Long getZAccNumId() {
        return this.zAccNumId;
    }

    /**
     * 设置 记录关系类型，LOVB=PRI-C-0035
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录关系类型，LOVB=PRI-C-0035
     */
    public java.lang.String getRelType() {
        return this.relType;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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
