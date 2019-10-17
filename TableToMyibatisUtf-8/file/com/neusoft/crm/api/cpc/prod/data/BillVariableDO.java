package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述可变文本中包含的变量。
 * @实体表  :BILL_VARIABLE
 */
public class BillVariableDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_VARIABLE_S";

    /**
     * 变量的唯一标识号。
     */
    public java.lang.Integer billVariableId;

    /**
     * 帐单变量的变量名。
     */
    public java.lang.String billVariableName;

    /**
     * 用于定义表格单元内容展示格式
            。ACC-C-0183
     */
    public java.lang.Integer displayType;

    /**
     * 区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态。LOVB=ACC-C-0002
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
     * 设置 变量的唯一标识号。
     */
    public void setBillVariableId(java.lang.Integer billVariableId) {
        this.billVariableId = billVariableId;
    }

    /**
     * 获取 变量的唯一标识号。
     */
    public java.lang.Integer getBillVariableId() {
        return this.billVariableId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.billVariableId = SeqUtils.createIntegerId(ID_SEQ);
         return this.billVariableId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 帐单变量的变量名。
     */
    public void setBillVariableName(java.lang.String billVariableName) {
        this.billVariableName = billVariableName;
    }

    /**
     * 获取 帐单变量的变量名。
     */
    public java.lang.String getBillVariableName() {
        return this.billVariableName;
    }

    /**
     * 设置 用于定义表格单元内容展示格式
            。ACC-C-0183
     */
    public void setDisplayType(java.lang.Integer displayType) {
        this.displayType = displayType;
    }

    /**
     * 获取 用于定义表格单元内容展示格式
            。ACC-C-0183
     */
    public java.lang.Integer getDisplayType() {
        return this.displayType;
    }

    /**
     * 设置 区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录状态。LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=ACC-C-0002
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
