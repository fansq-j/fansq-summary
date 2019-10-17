package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录信息项具体的内容，包括取值方式
 * @实体表  :RECEIPT_ITEM_DETAIL
 */
public class ReceiptItemDetailDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RECEIPT_ITEM_DETAIL_S";

    /**
     * 信息项内容
     */
    public java.lang.Long receiptItemDetailId;

    /**
     * 信息项内容类型
     */
    public java.lang.String itemDetailType;

    /**
     * 回执打印项标识
     */
    public java.lang.Long receiptItemId;

    /**
     * 是否强制换行，LOVB=PUB-C-0006
     */
    public java.lang.String isForceNewline;

    /**
     * 标签
     */
    public java.lang.String label;

    /**
     * 间隔符
     */
    public java.lang.String spaceChar;

    /**
     * 取值方式
     */
    public java.lang.String obtainValueType;

    /**
     * 取值表达式
     */
    public java.lang.String expression;

    /**
     * 状态，LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 信息项内容
     */
    public void setReceiptItemDetailId(java.lang.Long receiptItemDetailId) {
        this.receiptItemDetailId = receiptItemDetailId;
    }

    /**
     * 获取 信息项内容
     */
    public java.lang.Long getReceiptItemDetailId() {
        return this.receiptItemDetailId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.receiptItemDetailId = SeqUtils.createLongId(ID_SEQ);
         return this.receiptItemDetailId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 信息项内容类型
     */
    public void setItemDetailType(java.lang.String itemDetailType) {
        this.itemDetailType = itemDetailType;
    }

    /**
     * 获取 信息项内容类型
     */
    public java.lang.String getItemDetailType() {
        return this.itemDetailType;
    }

    /**
     * 设置 回执打印项标识
     */
    public void setReceiptItemId(java.lang.Long receiptItemId) {
        this.receiptItemId = receiptItemId;
    }

    /**
     * 获取 回执打印项标识
     */
    public java.lang.Long getReceiptItemId() {
        return this.receiptItemId;
    }

    /**
     * 设置 是否强制换行，LOVB=PUB-C-0006
     */
    public void setIsForceNewline(java.lang.String isForceNewline) {
        this.isForceNewline = isForceNewline;
    }

    /**
     * 获取 是否强制换行，LOVB=PUB-C-0006
     */
    public java.lang.String getIsForceNewline() {
        return this.isForceNewline;
    }

    /**
     * 设置 标签
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    /**
     * 获取 标签
     */
    public java.lang.String getLabel() {
        return this.label;
    }

    /**
     * 设置 间隔符
     */
    public void setSpaceChar(java.lang.String spaceChar) {
        this.spaceChar = spaceChar;
    }

    /**
     * 获取 间隔符
     */
    public java.lang.String getSpaceChar() {
        return this.spaceChar;
    }

    /**
     * 设置 取值方式
     */
    public void setObtainValueType(java.lang.String obtainValueType) {
        this.obtainValueType = obtainValueType;
    }

    /**
     * 获取 取值方式
     */
    public java.lang.String getObtainValueType() {
        return this.obtainValueType;
    }

    /**
     * 设置 取值表达式
     */
    public void setExpression(java.lang.String expression) {
        this.expression = expression;
    }

    /**
     * 获取 取值表达式
     */
    public java.lang.String getExpression() {
        return this.expression;
    }

    /**
     * 设置 状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
            
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
            
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
            
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
            
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
            
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
            
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
            
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
            
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
            
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
