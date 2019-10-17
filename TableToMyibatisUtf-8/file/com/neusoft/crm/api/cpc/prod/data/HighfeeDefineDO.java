package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:高额类型，记录高额计算的分类，比如同一用户产生的业务笔数超过系统设定的阈值等，笔数异常可以作为高额计算的一种类型
                                   -&
 * @实体表  :HIGHFEE_DEFINE
 */
public class HighfeeDefineDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "HIGHFEE_DEFINE_S";

    /**
     * 高额类型标识
     */
    public java.lang.Integer highfeeTypeId;

    /**
     * 高额类型标识
     */
    public java.lang.Integer highfeeAccuTypeId;

    /**
     * 高额类型名称
     */
    public java.lang.String highfeeName;

    /**
     * 高额类型描述
     */
    public java.lang.String highfeeDesc;

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
    public void setHighfeeTypeId(java.lang.Integer highfeeTypeId) {
        this.highfeeTypeId = highfeeTypeId;
    }

    /**
     * 获取 高额类型标识
     */
    public java.lang.Integer getHighfeeTypeId() {
        return this.highfeeTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.highfeeTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.highfeeTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

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
     * 设置 高额类型名称
     */
    public void setHighfeeName(java.lang.String highfeeName) {
        this.highfeeName = highfeeName;
    }

    /**
     * 获取 高额类型名称
     */
    public java.lang.String getHighfeeName() {
        return this.highfeeName;
    }

    /**
     * 设置 高额类型描述
     */
    public void setHighfeeDesc(java.lang.String highfeeDesc) {
        this.highfeeDesc = highfeeDesc;
    }

    /**
     * 获取 高额类型描述
     */
    public java.lang.String getHighfeeDesc() {
        return this.highfeeDesc;
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
