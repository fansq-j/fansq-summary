package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于描述PLCA转换转赠的系数、取整方式和精度。
 * @实体表  :PLCA_ACCUM_EXPRESS
 */
public class PlcaAccumExpressDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_ACCUM_EXPRESS_S";

    /**
     * 转换表达式标识
     */
    public java.lang.Integer accumExpressId;

    /**
     * 转换表达式名称
     */
    public java.lang.String accumExpressName;

    /**
     * 转换系数，表示来源类型转换为目标类型的系数，例如1M=0.8分钟，也支持复杂的公式运算，引用PLCA_REF_VALUE参考值标识
     */
    public java.lang.Integer transCoefficient;

    /**
     * 运算精度
     */
    public java.lang.Integer calcPrecision;

    /**
     * LOVB=PLC-C-0008
     */
    public java.lang.Integer calcPrecisionMethod;

    /**
     * LOVB=PLC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 转换表达式标识
     */
    public void setAccumExpressId(java.lang.Integer accumExpressId) {
        this.accumExpressId = accumExpressId;
    }

    /**
     * 获取 转换表达式标识
     */
    public java.lang.Integer getAccumExpressId() {
        return this.accumExpressId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.accumExpressId = SeqUtils.createIntegerId(ID_SEQ);
         return this.accumExpressId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 转换表达式名称
     */
    public void setAccumExpressName(java.lang.String accumExpressName) {
        this.accumExpressName = accumExpressName;
    }

    /**
     * 获取 转换表达式名称
     */
    public java.lang.String getAccumExpressName() {
        return this.accumExpressName;
    }

    /**
     * 设置 转换系数，表示来源类型转换为目标类型的系数，例如1M=0.8分钟，也支持复杂的公式运算，引用PLCA_REF_VALUE参考值标识
     */
    public void setTransCoefficient(java.lang.Integer transCoefficient) {
        this.transCoefficient = transCoefficient;
    }

    /**
     * 获取 转换系数，表示来源类型转换为目标类型的系数，例如1M=0.8分钟，也支持复杂的公式运算，引用PLCA_REF_VALUE参考值标识
     */
    public java.lang.Integer getTransCoefficient() {
        return this.transCoefficient;
    }

    /**
     * 设置 运算精度
     */
    public void setCalcPrecision(java.lang.Integer calcPrecision) {
        this.calcPrecision = calcPrecision;
    }

    /**
     * 获取 运算精度
     */
    public java.lang.Integer getCalcPrecision() {
        return this.calcPrecision;
    }

    /**
     * 设置 LOVB=PLC-C-0008
     */
    public void setCalcPrecisionMethod(java.lang.Integer calcPrecisionMethod) {
        this.calcPrecisionMethod = calcPrecisionMethod;
    }

    /**
     * 获取 LOVB=PLC-C-0008
     */
    public java.lang.Integer getCalcPrecisionMethod() {
        return this.calcPrecisionMethod;
    }

    /**
     * 设置 LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PLC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
