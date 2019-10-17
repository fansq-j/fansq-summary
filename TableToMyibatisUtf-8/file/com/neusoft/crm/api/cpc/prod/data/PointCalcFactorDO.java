package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分计算的计算因子定义，积分计算因子包括：客户星级、产品实例属性、产品实例计费模式、销售品实例属性等。
 * @实体表  :POINT_CALC_FACTOR
 */
public class PointCalcFactorDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_CALC_FACTOR_S";

    /**
     * 积分计算因子标识，作为主键
     */
    public java.lang.Integer pointCalcFactorId;

    /**
     * 积分计算因子名称
     */
    public java.lang.String calcFactorName;

    /**
     * 记录计算对象类型，LOVB=POI-C-0014
     */
    public java.lang.String pointCalcObjType;

    /**
     * 积分计算对象的标识，如客户标识，销售品规格标识，销售品实例标识、产品实例标识等
     */
    public java.lang.Long pointCalcObjId;

    /**
     * 积分计算对象的属主属性类型，LOVB=POI-C-0010
     */
    public java.lang.String calcObjAttrType;

    /**
     * 记录属主属性标识，指向对象属性类型对应的实体
     */
    public java.lang.Long calcObjAttrId;

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
     * 设置 积分计算因子标识，作为主键
     */
    public void setPointCalcFactorId(java.lang.Integer pointCalcFactorId) {
        this.pointCalcFactorId = pointCalcFactorId;
    }

    /**
     * 获取 积分计算因子标识，作为主键
     */
    public java.lang.Integer getPointCalcFactorId() {
        return this.pointCalcFactorId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointCalcFactorId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointCalcFactorId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分计算因子名称
     */
    public void setCalcFactorName(java.lang.String calcFactorName) {
        this.calcFactorName = calcFactorName;
    }

    /**
     * 获取 积分计算因子名称
     */
    public java.lang.String getCalcFactorName() {
        return this.calcFactorName;
    }

    /**
     * 设置 记录计算对象类型，LOVB=POI-C-0014
     */
    public void setPointCalcObjType(java.lang.String pointCalcObjType) {
        this.pointCalcObjType = pointCalcObjType;
    }

    /**
     * 获取 记录计算对象类型，LOVB=POI-C-0014
     */
    public java.lang.String getPointCalcObjType() {
        return this.pointCalcObjType;
    }

    /**
     * 设置 积分计算对象的标识，如客户标识，销售品规格标识，销售品实例标识、产品实例标识等
     */
    public void setPointCalcObjId(java.lang.Long pointCalcObjId) {
        this.pointCalcObjId = pointCalcObjId;
    }

    /**
     * 获取 积分计算对象的标识，如客户标识，销售品规格标识，销售品实例标识、产品实例标识等
     */
    public java.lang.Long getPointCalcObjId() {
        return this.pointCalcObjId;
    }

    /**
     * 设置 积分计算对象的属主属性类型，LOVB=POI-C-0010
     */
    public void setCalcObjAttrType(java.lang.String calcObjAttrType) {
        this.calcObjAttrType = calcObjAttrType;
    }

    /**
     * 获取 积分计算对象的属主属性类型，LOVB=POI-C-0010
     */
    public java.lang.String getCalcObjAttrType() {
        return this.calcObjAttrType;
    }

    /**
     * 设置 记录属主属性标识，指向对象属性类型对应的实体
     */
    public void setCalcObjAttrId(java.lang.Long calcObjAttrId) {
        this.calcObjAttrId = calcObjAttrId;
    }

    /**
     * 获取 记录属主属性标识，指向对象属性类型对应的实体
     */
    public java.lang.Long getCalcObjAttrId() {
        return this.calcObjAttrId;
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
