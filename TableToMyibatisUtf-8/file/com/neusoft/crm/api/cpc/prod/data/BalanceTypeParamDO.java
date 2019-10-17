package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述余额类型的附加属性，如是否抵收入抵旧欠，是否允许拆机、过户转帐，余额类型分析，使用分类等。
 * @实体表  :BALANCE_TYPE_PARAM
 */
public class BalanceTypeParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_TYPE_PARAM_S";

    /**
     * 余额类型参数标识
     */
    public java.lang.Long balanceTypeParamId;

    /**
     * 余额帐本所属的余额类型ACC-C-0009
     */
    public java.lang.Integer balanceTypeId;

    /**
     * 参数属性标识
     */
    public java.lang.Integer paramAttrId;

    /**
     * 参数名称
     */
    public java.lang.String paramName;

    /**
     * 参数默认值
     */
    public java.lang.String paramDefaultValue;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 余额类型参数标识
     */
    public void setBalanceTypeParamId(java.lang.Long balanceTypeParamId) {
        this.balanceTypeParamId = balanceTypeParamId;
    }

    /**
     * 获取 余额类型参数标识
     */
    public java.lang.Long getBalanceTypeParamId() {
        return this.balanceTypeParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.balanceTypeParamId = SeqUtils.createLongId(ID_SEQ);
         return this.balanceTypeParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 余额帐本所属的余额类型ACC-C-0009
     */
    public void setBalanceTypeId(java.lang.Integer balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
    }

    /**
     * 获取 余额帐本所属的余额类型ACC-C-0009
     */
    public java.lang.Integer getBalanceTypeId() {
        return this.balanceTypeId;
    }

    /**
     * 设置 参数属性标识
     */
    public void setParamAttrId(java.lang.Integer paramAttrId) {
        this.paramAttrId = paramAttrId;
    }

    /**
     * 获取 参数属性标识
     */
    public java.lang.Integer getParamAttrId() {
        return this.paramAttrId;
    }

    /**
     * 设置 参数名称
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }

    /**
     * 获取 参数名称
     */
    public java.lang.String getParamName() {
        return this.paramName;
    }

    /**
     * 设置 参数默认值
     */
    public void setParamDefaultValue(java.lang.String paramDefaultValue) {
        this.paramDefaultValue = paramDefaultValue;
    }

    /**
     * 获取 参数默认值
     */
    public java.lang.String getParamDefaultValue() {
        return this.paramDefaultValue;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
