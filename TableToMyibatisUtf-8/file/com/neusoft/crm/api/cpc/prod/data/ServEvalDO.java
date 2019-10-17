package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录客户对排号、订单受理等服务的评价信息以及管理员对员工的工作评价信息
 * @实体表  :SERV_EVAL
 */
public class ServEvalDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SERV_EVAL_S";

    /**
     * 评价标识，主键
     */
    public java.lang.Long evalId;

    /**
     * 主数据：订单、员工等.LOVB=STF-C-0031
     */
    public java.lang.String evalTarType;

    /**
     * 如订单标识、员工标识
     */
    public java.lang.Long evalTarId;

    /**
     * 主数据：总体评价、服务态度、等待时间等.LOVB=STF-C-0032
     */
    public java.lang.String evalType;

    /**
     * 主数据：1星  2星等.LOVB=STF-C-0033
     */
    public java.lang.String evalPoint;

    /**
     * 评价描述
     */
    public java.lang.String evalDesc;

    /**
     * 主数据：员工、客户等.LOVB=STF-C-0034
     */
    public java.lang.String objType;

    /**
     * 如客户标识、员工标识
     */
    public java.lang.String objId;

    /**
     * 线上，线下.LOVB=STF-C-0035
     */
    public java.lang.String evalChannel;

    /**
     * 评价时间
     */
    public java.util.Date evalDate;

    /**
     * 记录状态，LOVB=PUB-C-0001。
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
     * 设置 评价标识，主键
     */
    public void setEvalId(java.lang.Long evalId) {
        this.evalId = evalId;
    }

    /**
     * 获取 评价标识，主键
     */
    public java.lang.Long getEvalId() {
        return this.evalId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evalId = SeqUtils.createLongId(ID_SEQ);
         return this.evalId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 主数据：订单、员工等.LOVB=STF-C-0031
     */
    public void setEvalTarType(java.lang.String evalTarType) {
        this.evalTarType = evalTarType;
    }

    /**
     * 获取 主数据：订单、员工等.LOVB=STF-C-0031
     */
    public java.lang.String getEvalTarType() {
        return this.evalTarType;
    }

    /**
     * 设置 如订单标识、员工标识
     */
    public void setEvalTarId(java.lang.Long evalTarId) {
        this.evalTarId = evalTarId;
    }

    /**
     * 获取 如订单标识、员工标识
     */
    public java.lang.Long getEvalTarId() {
        return this.evalTarId;
    }

    /**
     * 设置 主数据：总体评价、服务态度、等待时间等.LOVB=STF-C-0032
     */
    public void setEvalType(java.lang.String evalType) {
        this.evalType = evalType;
    }

    /**
     * 获取 主数据：总体评价、服务态度、等待时间等.LOVB=STF-C-0032
     */
    public java.lang.String getEvalType() {
        return this.evalType;
    }

    /**
     * 设置 主数据：1星  2星等.LOVB=STF-C-0033
     */
    public void setEvalPoint(java.lang.String evalPoint) {
        this.evalPoint = evalPoint;
    }

    /**
     * 获取 主数据：1星  2星等.LOVB=STF-C-0033
     */
    public java.lang.String getEvalPoint() {
        return this.evalPoint;
    }

    /**
     * 设置 评价描述
     */
    public void setEvalDesc(java.lang.String evalDesc) {
        this.evalDesc = evalDesc;
    }

    /**
     * 获取 评价描述
     */
    public java.lang.String getEvalDesc() {
        return this.evalDesc;
    }

    /**
     * 设置 主数据：员工、客户等.LOVB=STF-C-0034
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 主数据：员工、客户等.LOVB=STF-C-0034
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 如客户标识、员工标识
     */
    public void setObjId(java.lang.String objId) {
        this.objId = objId;
    }

    /**
     * 获取 如客户标识、员工标识
     */
    public java.lang.String getObjId() {
        return this.objId;
    }

    /**
     * 设置 线上，线下.LOVB=STF-C-0035
     */
    public void setEvalChannel(java.lang.String evalChannel) {
        this.evalChannel = evalChannel;
    }

    /**
     * 获取 线上，线下.LOVB=STF-C-0035
     */
    public java.lang.String getEvalChannel() {
        return this.evalChannel;
    }

    /**
     * 设置 评价时间
     */
    public void setEvalDate(java.util.Date evalDate) {
        this.evalDate = evalDate;
    }

    /**
     * 获取 评价时间
     */
    public java.util.Date getEvalDate() {
        return this.evalDate;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
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
