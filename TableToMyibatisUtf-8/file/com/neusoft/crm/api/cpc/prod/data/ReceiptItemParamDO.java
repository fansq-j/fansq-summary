package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:打印项参数取值配置
 * @实体表  :RECEIPT_ITEM_PARAM
 */
public class ReceiptItemParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RECEIPT_ITEM_PARAM_S";

    /**
     * 回执打印项标识
     */
    public java.lang.Long receiptItemId;

    /**
     * 打印项业务参数标识
     */
    public java.lang.Long receiptItemParamId;

    /**
     * 参数编码
     */
    public java.lang.String paramCode;

    /**
     * 取值方式
     */
    public java.lang.String obtainValueType;

    /**
     * 取值表达式
     */
    public java.lang.String expression;

    /**
     * 是否列表，LOVB=PUB-C-0006
     */
    public java.lang.String isArray;

    /**
     * 参数名称
     */
    public java.lang.String paramName;

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
     * 设置 打印项业务参数标识
     */
    public void setReceiptItemParamId(java.lang.Long receiptItemParamId) {
        this.receiptItemParamId = receiptItemParamId;
    }

    /**
     * 获取 打印项业务参数标识
     */
    public java.lang.Long getReceiptItemParamId() {
        return this.receiptItemParamId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.receiptItemParamId = SeqUtils.createLongId(ID_SEQ);
         return this.receiptItemParamId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 参数编码
     */
    public void setParamCode(java.lang.String paramCode) {
        this.paramCode = paramCode;
    }

    /**
     * 获取 参数编码
     */
    public java.lang.String getParamCode() {
        return this.paramCode;
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
     * 设置 是否列表，LOVB=PUB-C-0006
     */
    public void setIsArray(java.lang.String isArray) {
        this.isArray = isArray;
    }

    /**
     * 获取 是否列表，LOVB=PUB-C-0006
     */
    public java.lang.String getIsArray() {
        return this.isArray;
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
