package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则变量因子配置表
 * @实体表  :VARIABLE_FACTOR
 */
public class VariableFactorDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VARIABLE_FACTOR_S";

    /**
     * 主键
     */
    public java.lang.Long variableFactorId;

    /**
     * 因子编码
     */
    public java.lang.Long variableFactorNbr;

    /**
     * 因子名称
     */
    public java.lang.String variableFactorName;

    /**
     * 类，JAVA类的类路径
     */
    public java.lang.String factorClass;

    /**
     * 方法，JAVA方法名
     */
    public java.lang.String factorMethod;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态的变更时间
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 主键
     */
    public void setVariableFactorId(java.lang.Long variableFactorId) {
        this.variableFactorId = variableFactorId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getVariableFactorId() {
        return this.variableFactorId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.variableFactorId = SeqUtils.createLongId(ID_SEQ);
         return this.variableFactorId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 因子编码
     */
    public void setVariableFactorNbr(java.lang.Long variableFactorNbr) {
        this.variableFactorNbr = variableFactorNbr;
    }

    /**
     * 获取 因子编码
     */
    public java.lang.Long getVariableFactorNbr() {
        return this.variableFactorNbr;
    }

    /**
     * 设置 因子名称
     */
    public void setVariableFactorName(java.lang.String variableFactorName) {
        this.variableFactorName = variableFactorName;
    }

    /**
     * 获取 因子名称
     */
    public java.lang.String getVariableFactorName() {
        return this.variableFactorName;
    }

    /**
     * 设置 类，JAVA类的类路径
     */
    public void setFactorClass(java.lang.String factorClass) {
        this.factorClass = factorClass;
    }

    /**
     * 获取 类，JAVA类的类路径
     */
    public java.lang.String getFactorClass() {
        return this.factorClass;
    }

    /**
     * 设置 方法，JAVA方法名
     */
    public void setFactorMethod(java.lang.String factorMethod) {
        this.factorMethod = factorMethod;
    }

    /**
     * 获取 方法，JAVA方法名
     */
    public java.lang.String getFactorMethod() {
        return this.factorMethod;
    }

    /**
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态的变更时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的变更时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
