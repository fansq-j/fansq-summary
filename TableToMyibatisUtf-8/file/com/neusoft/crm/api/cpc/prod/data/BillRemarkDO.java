package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述帐单的可变文本。
 * @实体表  :BILL_REMARK
 */
public class BillRemarkDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BILL_REMARK_S";

    /**
     * 为每个帐单项生成的唯一编号。
     */
    public java.lang.Integer billRemarkId;

    /**
     * 变量的唯一标识号。
     */
    public java.lang.Integer billVariableId;

    /**
     * 对各种可变情况的简单控制条件，如果条件复杂可以再建一个实体来详细描述。ACC-C-0108
     */
    public java.lang.Integer printCondition;

    /**
     * 对可变文本的约定打印格式。
     */
    public java.lang.Integer printFormat;

    /**
     * 帐单文本中的文本内容（含变量）。
     */
    public java.lang.String content;

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
     * 设置 为每个帐单项生成的唯一编号。
     */
    public void setBillRemarkId(java.lang.Integer billRemarkId) {
        this.billRemarkId = billRemarkId;
    }

    /**
     * 获取 为每个帐单项生成的唯一编号。
     */
    public java.lang.Integer getBillRemarkId() {
        return this.billRemarkId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.billRemarkId = SeqUtils.createIntegerId(ID_SEQ);
         return this.billRemarkId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

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
     * 设置 对各种可变情况的简单控制条件，如果条件复杂可以再建一个实体来详细描述。ACC-C-0108
     */
    public void setPrintCondition(java.lang.Integer printCondition) {
        this.printCondition = printCondition;
    }

    /**
     * 获取 对各种可变情况的简单控制条件，如果条件复杂可以再建一个实体来详细描述。ACC-C-0108
     */
    public java.lang.Integer getPrintCondition() {
        return this.printCondition;
    }

    /**
     * 设置 对可变文本的约定打印格式。
     */
    public void setPrintFormat(java.lang.Integer printFormat) {
        this.printFormat = printFormat;
    }

    /**
     * 获取 对可变文本的约定打印格式。
     */
    public java.lang.Integer getPrintFormat() {
        return this.printFormat;
    }

    /**
     * 设置 帐单文本中的文本内容（含变量）。
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    /**
     * 获取 帐单文本中的文本内容（含变量）。
     */
    public java.lang.String getContent() {
        return this.content;
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
