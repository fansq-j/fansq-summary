package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:支持量本转换转赠时的总量、百分比或次数限制。
 * @实体表  :PLCA_ACCUM_TRANSFORM_LIMIT
 */
public class PlcaAccumTransformLimitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PLCA_ACCUM_TRANSFORM_LIMIT_S";

    /**
     * 限制标识
     */
    public java.lang.Integer limitId;

    /**
     * 转换标识
     */
    public java.lang.Integer ruleId;

    /**
     * LOVB=PLC-C-0018
     */
    public java.lang.Integer plcaLimitType;

    /**
     * 限制取值。
            限制类型为总量限制时，限制取值表示转出的最大限额；限制类型为占比限制时，限制取值表示转出的比例限制；限制类型为次数时，限制取值表示转出的次数限制。
     */
    public java.lang.Double limitValue;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 状态LOVB=PLC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

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
     * 设置 限制标识
     */
    public void setLimitId(java.lang.Integer limitId) {
        this.limitId = limitId;
    }

    /**
     * 获取 限制标识
     */
    public java.lang.Integer getLimitId() {
        return this.limitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.limitId = SeqUtils.createIntegerId(ID_SEQ);
         return this.limitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 转换标识
     */
    public void setRuleId(java.lang.Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取 转换标识
     */
    public java.lang.Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * 设置 LOVB=PLC-C-0018
     */
    public void setPlcaLimitType(java.lang.Integer plcaLimitType) {
        this.plcaLimitType = plcaLimitType;
    }

    /**
     * 获取 LOVB=PLC-C-0018
     */
    public java.lang.Integer getPlcaLimitType() {
        return this.plcaLimitType;
    }

    /**
     * 设置 限制取值。
            限制类型为总量限制时，限制取值表示转出的最大限额；限制类型为占比限制时，限制取值表示转出的比例限制；限制类型为次数时，限制取值表示转出的次数限制。
     */
    public void setLimitValue(java.lang.Double limitValue) {
        this.limitValue = limitValue;
    }

    /**
     * 获取 限制取值。
            限制类型为总量限制时，限制取值表示转出的最大限额；限制类型为占比限制时，限制取值表示转出的比例限制；限制类型为次数时，限制取值表示转出的次数限制。
     */
    public java.lang.Double getLimitValue() {
        return this.limitValue;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 状态LOVB=PLC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态LOVB=PLC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
