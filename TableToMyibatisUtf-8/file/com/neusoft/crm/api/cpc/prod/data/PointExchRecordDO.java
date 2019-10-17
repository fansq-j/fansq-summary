package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分兑换记录，包括：兑换渠道、兑换时间、兑换人等。
 * @实体表  :POINT_EXCH_RECORD
 */
public class PointExchRecordDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_RECORD_S";

    /**
     * 积分兑换记录标识，作为主键
     */
    public java.lang.Long pointExchRecordId;

    /**
     * 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public java.lang.Integer pointExchObjId;

    /**
     * 兑换渠道，LOVB=POI-C-0017
     */
    public java.lang.String exchChnlId;

    /**
     * 兑换使用的业务号码
     */
    public java.lang.String pointExchAccNbr;

    /**
     * 记录兑换失败原因描述
     */
    public java.lang.String exchFailReasonDesc;

    /**
     * 被撤销兑换记录标识
     */
    public java.lang.Long revokeExchRecordId;

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
     * 积分兑换记录状态，LOVB=POI-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分兑换记录标识，作为主键
     */
    public void setPointExchRecordId(java.lang.Long pointExchRecordId) {
        this.pointExchRecordId = pointExchRecordId;
    }

    /**
     * 获取 积分兑换记录标识，作为主键
     */
    public java.lang.Long getPointExchRecordId() {
        return this.pointExchRecordId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointExchRecordId = SeqUtils.createLongId(ID_SEQ);
         return this.pointExchRecordId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public void setPointExchObjId(java.lang.Integer pointExchObjId) {
        this.pointExchObjId = pointExchObjId;
    }

    /**
     * 获取 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public java.lang.Integer getPointExchObjId() {
        return this.pointExchObjId;
    }

    /**
     * 设置 兑换渠道，LOVB=POI-C-0017
     */
    public void setExchChnlId(java.lang.String exchChnlId) {
        this.exchChnlId = exchChnlId;
    }

    /**
     * 获取 兑换渠道，LOVB=POI-C-0017
     */
    public java.lang.String getExchChnlId() {
        return this.exchChnlId;
    }

    /**
     * 设置 兑换使用的业务号码
     */
    public void setPointExchAccNbr(java.lang.String pointExchAccNbr) {
        this.pointExchAccNbr = pointExchAccNbr;
    }

    /**
     * 获取 兑换使用的业务号码
     */
    public java.lang.String getPointExchAccNbr() {
        return this.pointExchAccNbr;
    }

    /**
     * 设置 记录兑换失败原因描述
     */
    public void setExchFailReasonDesc(java.lang.String exchFailReasonDesc) {
        this.exchFailReasonDesc = exchFailReasonDesc;
    }

    /**
     * 获取 记录兑换失败原因描述
     */
    public java.lang.String getExchFailReasonDesc() {
        return this.exchFailReasonDesc;
    }

    /**
     * 设置 被撤销兑换记录标识
     */
    public void setRevokeExchRecordId(java.lang.Long revokeExchRecordId) {
        this.revokeExchRecordId = revokeExchRecordId;
    }

    /**
     * 获取 被撤销兑换记录标识
     */
    public java.lang.Long getRevokeExchRecordId() {
        return this.revokeExchRecordId;
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
     * 设置 积分兑换记录状态，LOVB=POI-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 积分兑换记录状态，LOVB=POI-C-0001
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
