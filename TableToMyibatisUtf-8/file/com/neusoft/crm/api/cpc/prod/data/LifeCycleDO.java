package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:用于定义定价域模型中相关实体的生命周期，以描述特定实体实例的生效时间、失效时间、时间偏移计算方式等。
 * @实体表  :LIFE_CYCLE
 */
public class LifeCycleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LIFE_CYCLE_S";

    /**
     * 生命周期的标识
     */
    public java.lang.Integer lifeCycleId;

    /**
     * LOVB=PRC-C-0005
     */
    public java.lang.Integer effType;

    /**
     * 何时生效
     */
    public java.util.Date effDate;

    /**
     * 何时失效，为空时表示还没有决定何时生效
     */
    public java.util.Date expDate;

    /**
     * 相对生效值
     */
    public java.lang.Integer relativeEffValue;

    /**
     * 相对失效值
     */
    public java.lang.Integer relativeExpValue;

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
     * 设置 生命周期的标识
     */
    public void setLifeCycleId(java.lang.Integer lifeCycleId) {
        this.lifeCycleId = lifeCycleId;
    }

    /**
     * 获取 生命周期的标识
     */
    public java.lang.Integer getLifeCycleId() {
        return this.lifeCycleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.lifeCycleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.lifeCycleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 LOVB=PRC-C-0005
     */
    public void setEffType(java.lang.Integer effType) {
        this.effType = effType;
    }

    /**
     * 获取 LOVB=PRC-C-0005
     */
    public java.lang.Integer getEffType() {
        return this.effType;
    }

    /**
     * 设置 何时生效
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 何时生效
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 何时失效，为空时表示还没有决定何时生效
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 何时失效，为空时表示还没有决定何时生效
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 相对生效值
     */
    public void setRelativeEffValue(java.lang.Integer relativeEffValue) {
        this.relativeEffValue = relativeEffValue;
    }

    /**
     * 获取 相对生效值
     */
    public java.lang.Integer getRelativeEffValue() {
        return this.relativeEffValue;
    }

    /**
     * 设置 相对失效值
     */
    public void setRelativeExpValue(java.lang.Integer relativeExpValue) {
        this.relativeExpValue = relativeExpValue;
    }

    /**
     * 获取 相对失效值
     */
    public java.lang.Integer getRelativeExpValue() {
        return this.relativeExpValue;
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
