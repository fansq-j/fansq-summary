package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于记录累计分类，比如次数统计或金额统计分类等
 * @实体表  :HIGHFEE_ACCU_TYPE
 */
public class HighfeeAccuTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "HIGHFEE_ACCU_TYPE_S";

    /**
     * 高额类型标识
     */
    public java.lang.Integer highfeeAccuTypeId;

    /**
     * 高额类型名称
     */
    public java.lang.String highfeeAccuTypeName;

    /**
     * 高额类型描述
     */
    public java.lang.Integer highfeeAccuTypeUnit;

    /**
     * 是否可以为负
            LOVB=PRC-C-0058
     */
    public java.lang.Integer canBeNegative;

    /**
     * LOVB=PRC-C-0026
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
     * 设置 高额类型标识
     */
    public void setHighfeeAccuTypeId(java.lang.Integer highfeeAccuTypeId) {
        this.highfeeAccuTypeId = highfeeAccuTypeId;
    }

    /**
     * 获取 高额类型标识
     */
    public java.lang.Integer getHighfeeAccuTypeId() {
        return this.highfeeAccuTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.highfeeAccuTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.highfeeAccuTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 高额类型名称
     */
    public void setHighfeeAccuTypeName(java.lang.String highfeeAccuTypeName) {
        this.highfeeAccuTypeName = highfeeAccuTypeName;
    }

    /**
     * 获取 高额类型名称
     */
    public java.lang.String getHighfeeAccuTypeName() {
        return this.highfeeAccuTypeName;
    }

    /**
     * 设置 高额类型描述
     */
    public void setHighfeeAccuTypeUnit(java.lang.Integer highfeeAccuTypeUnit) {
        this.highfeeAccuTypeUnit = highfeeAccuTypeUnit;
    }

    /**
     * 获取 高额类型描述
     */
    public java.lang.Integer getHighfeeAccuTypeUnit() {
        return this.highfeeAccuTypeUnit;
    }

    /**
     * 设置 是否可以为负
            LOVB=PRC-C-0058
     */
    public void setCanBeNegative(java.lang.Integer canBeNegative) {
        this.canBeNegative = canBeNegative;
    }

    /**
     * 获取 是否可以为负
            LOVB=PRC-C-0058
     */
    public java.lang.Integer getCanBeNegative() {
        return this.canBeNegative;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
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
