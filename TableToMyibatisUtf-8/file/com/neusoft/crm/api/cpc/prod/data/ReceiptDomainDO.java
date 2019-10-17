package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义回执区域
 * @实体表  :RECEIPT_DOMAIN
 */
public class ReceiptDomainDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RECEIPT_DOMAIN_S";

    /**
     * 回执区域标识
     */
    public java.lang.Long receiptDomainId;

    /**
     * 回执模板标识
     */
    public java.lang.Long receiptTemplateId;

    /**
     * 表达回执区域类型，LOVB=EVT-C-0022
     */
    public java.lang.String domainType;

    /**
     * 序列
     */
    public java.lang.Integer seq;

    /**
     * 是否允许重复，LOVB=PUB-C-0006
     */
    public java.lang.String isRepeat;

    /**
     * 区域名称
     */
    public java.lang.String domainName;

    /**
     * 区域标签
     */
    public java.lang.String domainLabel;

    /**
     * 主对象取值方式
     */
    public java.lang.String obtainValueType;

    /**
     * 主对象取值表达式
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
     * 设置 回执区域标识
     */
    public void setReceiptDomainId(java.lang.Long receiptDomainId) {
        this.receiptDomainId = receiptDomainId;
    }

    /**
     * 获取 回执区域标识
     */
    public java.lang.Long getReceiptDomainId() {
        return this.receiptDomainId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.receiptDomainId = SeqUtils.createLongId(ID_SEQ);
         return this.receiptDomainId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 回执模板标识
     */
    public void setReceiptTemplateId(java.lang.Long receiptTemplateId) {
        this.receiptTemplateId = receiptTemplateId;
    }

    /**
     * 获取 回执模板标识
     */
    public java.lang.Long getReceiptTemplateId() {
        return this.receiptTemplateId;
    }

    /**
     * 设置 表达回执区域类型，LOVB=EVT-C-0022
     */
    public void setDomainType(java.lang.String domainType) {
        this.domainType = domainType;
    }

    /**
     * 获取 表达回执区域类型，LOVB=EVT-C-0022
     */
    public java.lang.String getDomainType() {
        return this.domainType;
    }

    /**
     * 设置 序列
     */
    public void setSeq(java.lang.Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取 序列
     */
    public java.lang.Integer getSeq() {
        return this.seq;
    }

    /**
     * 设置 是否允许重复，LOVB=PUB-C-0006
     */
    public void setIsRepeat(java.lang.String isRepeat) {
        this.isRepeat = isRepeat;
    }

    /**
     * 获取 是否允许重复，LOVB=PUB-C-0006
     */
    public java.lang.String getIsRepeat() {
        return this.isRepeat;
    }

    /**
     * 设置 区域名称
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }

    /**
     * 获取 区域名称
     */
    public java.lang.String getDomainName() {
        return this.domainName;
    }

    /**
     * 设置 区域标签
     */
    public void setDomainLabel(java.lang.String domainLabel) {
        this.domainLabel = domainLabel;
    }

    /**
     * 获取 区域标签
     */
    public java.lang.String getDomainLabel() {
        return this.domainLabel;
    }

    /**
     * 设置 主对象取值方式
     */
    public void setObtainValueType(java.lang.String obtainValueType) {
        this.obtainValueType = obtainValueType;
    }

    /**
     * 获取 主对象取值方式
     */
    public java.lang.String getObtainValueType() {
        return this.obtainValueType;
    }

    /**
     * 设置 主对象取值表达式
     */
    public void setExpression(java.lang.String expression) {
        this.expression = expression;
    }

    /**
     * 获取 主对象取值表达式
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
