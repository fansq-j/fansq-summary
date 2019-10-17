package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分帐户或积分帐本冻结和解冻的操作记录
 * @实体表  :POINT_FROZEN_RECORD
 */
public class PointFrozenRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_FROZEN_RECORD_S";

    /**
     * 积分冻结/解冻记录标识，作为主键
     */
    public java.lang.Long pointFrozenRecordId;

    /**
     * 记录积分冻结/解冻的操作类型，LOVB=POI-C-0016
     */
    public java.lang.String operType;

    /**
     * 记录冻结解冻的对象类型，包括：积分帐户、积分帐本，LOVB=POI-C-0015
     */
    public java.lang.String objType;

    /**
     * 操作对象标识，指向操作对象类型对应的实体
     */
    public java.lang.Long objId;

    /**
     * 外系统标识
     */
    public java.lang.String extSysId;

    /**
     * 外系统流水
     */
    public java.lang.String extSerialId;

    /**
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

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
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 设置 积分冻结/解冻记录标识，作为主键
     */
    public void setPointFrozenRecordId(java.lang.Long pointFrozenRecordId) {
        this.pointFrozenRecordId = pointFrozenRecordId;
    }

    /**
     * 获取 积分冻结/解冻记录标识，作为主键
     */
    public java.lang.Long getPointFrozenRecordId() {
        return this.pointFrozenRecordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointFrozenRecordId = SeqUtils.createLongId(ID_SEQ);
         return this.pointFrozenRecordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录积分冻结/解冻的操作类型，LOVB=POI-C-0016
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 记录积分冻结/解冻的操作类型，LOVB=POI-C-0016
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录冻结解冻的对象类型，包括：积分帐户、积分帐本，LOVB=POI-C-0015
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录冻结解冻的对象类型，包括：积分帐户、积分帐本，LOVB=POI-C-0015
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 操作对象标识，指向操作对象类型对应的实体
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 操作对象标识，指向操作对象类型对应的实体
     */
    public java.lang.Long getObjId() {
        return this.objId;
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

}
