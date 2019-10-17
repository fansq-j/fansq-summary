package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:高额段落，高额计划的具体实现逻辑，通过多个段落的规则计算来实现具体高额计划等

 * @实体表  :HIGHFEE_SECTION
 */
public class HighfeeSectionDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "HIGHFEE_SECTION_S";

    /**
     * 高额段落标识
     */
    public java.lang.Long highfeeSectionId;

    /**
     * 高额计划标识
     */
    public java.lang.Long highfeePlanId;

    /**
     * 高额告警级别标识
     */
    public java.lang.Integer highfeeLevelId;

    /**
     * 高额段落起始值
     */
    public java.lang.Integer highfeeStartValue;

    /**
     * 高额段落终止值
     */
    public java.lang.Integer highfeeEndValue;

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
     * 设置 高额段落标识
     */
    public void setHighfeeSectionId(java.lang.Long highfeeSectionId) {
        this.highfeeSectionId = highfeeSectionId;
    }

    /**
     * 获取 高额段落标识
     */
    public java.lang.Long getHighfeeSectionId() {
        return this.highfeeSectionId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.highfeeSectionId = SeqUtils.createLongId(ID_SEQ);
         return this.highfeeSectionId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 高额计划标识
     */
    public void setHighfeePlanId(java.lang.Long highfeePlanId) {
        this.highfeePlanId = highfeePlanId;
    }

    /**
     * 获取 高额计划标识
     */
    public java.lang.Long getHighfeePlanId() {
        return this.highfeePlanId;
    }

    /**
     * 设置 高额告警级别标识
     */
    public void setHighfeeLevelId(java.lang.Integer highfeeLevelId) {
        this.highfeeLevelId = highfeeLevelId;
    }

    /**
     * 获取 高额告警级别标识
     */
    public java.lang.Integer getHighfeeLevelId() {
        return this.highfeeLevelId;
    }

    /**
     * 设置 高额段落起始值
     */
    public void setHighfeeStartValue(java.lang.Integer highfeeStartValue) {
        this.highfeeStartValue = highfeeStartValue;
    }

    /**
     * 获取 高额段落起始值
     */
    public java.lang.Integer getHighfeeStartValue() {
        return this.highfeeStartValue;
    }

    /**
     * 设置 高额段落终止值
     */
    public void setHighfeeEndValue(java.lang.Integer highfeeEndValue) {
        this.highfeeEndValue = highfeeEndValue;
    }

    /**
     * 获取 高额段落终止值
     */
    public java.lang.Integer getHighfeeEndValue() {
        return this.highfeeEndValue;
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
