package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义使用积分进行兑换的独立对象单元，由一件或多件积分兑换货品构成。积分兑换对象中多个积分兑换货品只能一起兑换，不能拆开兑
 * @实体表  :POINT_EXCH_OBJ
 */
public class PointExchObjDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_OBJ_S";

    /**
     * 积分兑换对象标识，作为主键
     */
    public java.lang.Integer pointExchObjId;

    /**
     * 积分兑换对象名称
     */
    public java.lang.String pointExchObjName;

    /**
     * 积分兑换对象分类，LOVB=POI-C-0004
     */
    public java.lang.String exchObjKind;

    /**
     * 兑换支付类型，LOVB=POI-C-0002
     */
    public java.lang.String exchPayType;

    /**
     * 纯积分兑换金额
     */
    public java.lang.Integer purePointAmt;

    /**
     * 混合支付积分金额
     */
    public java.lang.Integer mixPointAmt;

    /**
     * 混合支付现金金额
     */
    public java.lang.Integer mixCashAmt;

    /**
     * 生效日期
     */
    public java.util.Date effDate;

    /**
     * 失效日期
     */
    public java.util.Date expDate;

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
     * 设置 积分兑换对象标识，作为主键
     */
    public void setPointExchObjId(java.lang.Integer pointExchObjId) {
        this.pointExchObjId = pointExchObjId;
    }

    /**
     * 获取 积分兑换对象标识，作为主键
     */
    public java.lang.Integer getPointExchObjId() {
        return this.pointExchObjId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointExchObjId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointExchObjId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分兑换对象名称
     */
    public void setPointExchObjName(java.lang.String pointExchObjName) {
        this.pointExchObjName = pointExchObjName;
    }

    /**
     * 获取 积分兑换对象名称
     */
    public java.lang.String getPointExchObjName() {
        return this.pointExchObjName;
    }

    /**
     * 设置 积分兑换对象分类，LOVB=POI-C-0004
     */
    public void setExchObjKind(java.lang.String exchObjKind) {
        this.exchObjKind = exchObjKind;
    }

    /**
     * 获取 积分兑换对象分类，LOVB=POI-C-0004
     */
    public java.lang.String getExchObjKind() {
        return this.exchObjKind;
    }

    /**
     * 设置 兑换支付类型，LOVB=POI-C-0002
     */
    public void setExchPayType(java.lang.String exchPayType) {
        this.exchPayType = exchPayType;
    }

    /**
     * 获取 兑换支付类型，LOVB=POI-C-0002
     */
    public java.lang.String getExchPayType() {
        return this.exchPayType;
    }

    /**
     * 设置 纯积分兑换金额
     */
    public void setPurePointAmt(java.lang.Integer purePointAmt) {
        this.purePointAmt = purePointAmt;
    }

    /**
     * 获取 纯积分兑换金额
     */
    public java.lang.Integer getPurePointAmt() {
        return this.purePointAmt;
    }

    /**
     * 设置 混合支付积分金额
     */
    public void setMixPointAmt(java.lang.Integer mixPointAmt) {
        this.mixPointAmt = mixPointAmt;
    }

    /**
     * 获取 混合支付积分金额
     */
    public java.lang.Integer getMixPointAmt() {
        return this.mixPointAmt;
    }

    /**
     * 设置 混合支付现金金额
     */
    public void setMixCashAmt(java.lang.Integer mixCashAmt) {
        this.mixCashAmt = mixCashAmt;
    }

    /**
     * 获取 混合支付现金金额
     */
    public java.lang.Integer getMixCashAmt() {
        return this.mixCashAmt;
    }

    /**
     * 设置 生效日期
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效日期
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效日期
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效日期
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
