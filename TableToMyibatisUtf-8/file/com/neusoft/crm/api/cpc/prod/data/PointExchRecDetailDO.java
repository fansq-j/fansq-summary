package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:积分兑换记录对象明细，记录积分兑换具体货品对象的兑换交付情况数据
 * @实体表  :POINT_EXCH_REC_DETAIL
 */
public class PointExchRecDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_REC_DETAIL_S";

    /**
     * 积分兑换记录对象明细标识，作为主键
     */
    public java.lang.Long pointExchRecDetailId;

    /**
     * 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public java.lang.Long pointExchRecordId;

    /**
     * 兑换对象类型，LOVB=POI-C-0005
     */
    public java.lang.String exchObjType;

    /**
     * 兑换对象的标识，指向兑换对象类型对应的实体
     */
    public java.lang.Long exchObjId;

    /**
     * 兑换对象数量
     */
    public java.lang.Integer exchObjAmt;

    /**
     * 记录兑换对象描述
     */
    public java.lang.String exchObjDesc;

    /**
     * 外系统标识
     */
    public java.lang.String extSysId;

    /**
     * 外系统流水
     */
    public java.lang.String extSerialId;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分兑换记录对象明细标识，作为主键
     */
    public void setPointExchRecDetailId(java.lang.Long pointExchRecDetailId) {
        this.pointExchRecDetailId = pointExchRecDetailId;
    }

    /**
     * 获取 积分兑换记录对象明细标识，作为主键
     */
    public java.lang.Long getPointExchRecDetailId() {
        return this.pointExchRecDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointExchRecDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.pointExchRecDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public void setPointExchRecordId(java.lang.Long pointExchRecordId) {
        this.pointExchRecordId = pointExchRecordId;
    }

    /**
     * 获取 积分兑换记录标识，作为外键，指向积分兑换记录实体
     */
    public java.lang.Long getPointExchRecordId() {
        return this.pointExchRecordId;
    }

    /**
     * 设置 兑换对象类型，LOVB=POI-C-0005
     */
    public void setExchObjType(java.lang.String exchObjType) {
        this.exchObjType = exchObjType;
    }

    /**
     * 获取 兑换对象类型，LOVB=POI-C-0005
     */
    public java.lang.String getExchObjType() {
        return this.exchObjType;
    }

    /**
     * 设置 兑换对象的标识，指向兑换对象类型对应的实体
     */
    public void setExchObjId(java.lang.Long exchObjId) {
        this.exchObjId = exchObjId;
    }

    /**
     * 获取 兑换对象的标识，指向兑换对象类型对应的实体
     */
    public java.lang.Long getExchObjId() {
        return this.exchObjId;
    }

    /**
     * 设置 兑换对象数量
     */
    public void setExchObjAmt(java.lang.Integer exchObjAmt) {
        this.exchObjAmt = exchObjAmt;
    }

    /**
     * 获取 兑换对象数量
     */
    public java.lang.Integer getExchObjAmt() {
        return this.exchObjAmt;
    }

    /**
     * 设置 记录兑换对象描述
     */
    public void setExchObjDesc(java.lang.String exchObjDesc) {
        this.exchObjDesc = exchObjDesc;
    }

    /**
     * 获取 记录兑换对象描述
     */
    public java.lang.String getExchObjDesc() {
        return this.exchObjDesc;
    }

    /**
     * 设置 外系统标识
     */
    public void setExtSysId(java.lang.String extSysId) {
        this.extSysId = extSysId;
    }

    /**
     * 获取 外系统标识
     */
    public java.lang.String getExtSysId() {
        return this.extSysId;
    }

    /**
     * 设置 外系统流水
     */
    public void setExtSerialId(java.lang.String extSerialId) {
        this.extSerialId = extSerialId;
    }

    /**
     * 获取 外系统流水
     */
    public java.lang.String getExtSerialId() {
        return this.extSerialId;
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
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
