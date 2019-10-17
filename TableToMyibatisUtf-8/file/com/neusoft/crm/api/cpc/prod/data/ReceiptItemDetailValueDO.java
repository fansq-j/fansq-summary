package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:为满足销售品视图要求，记录打印项内容针对具体对象的值
 * @实体表  :RECEIPT_ITEM_DETAIL_VALUE
 */
public class ReceiptItemDetailValueDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RECEIPT_ITEM_DETAIL_VALUE_S";

    /**
     * 打印项内容值标识
     */
    public java.lang.Long detailValueId;

    /**
     * 信息项内容
     */
    public java.lang.Long receiptItemDetailId;

    /**
     * 内容值
     */
    public java.lang.String value;

    /**
     * 参数值归属业务对象类型
     */
    public java.lang.String objType;

    /**
     * 归属业务对象标识
     */
    public java.lang.Long objId;

    /**
     * 展现的顺序
     */
    public java.lang.Integer seq;

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
     * 设置 打印项内容值标识
     */
    public void setDetailValueId(java.lang.Long detailValueId) {
        this.detailValueId = detailValueId;
    }

    /**
     * 获取 打印项内容值标识
     */
    public java.lang.Long getDetailValueId() {
        return this.detailValueId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.detailValueId = SeqUtils.createLongId(ID_SEQ);
         return this.detailValueId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 内容值
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    /**
     * 获取 内容值
     */
    public java.lang.String getValue() {
        return this.value;
    }

    /**
     * 设置 参数值归属业务对象类型
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 参数值归属业务对象类型
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 归属业务对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 归属业务对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 展现的顺序
     */
    public void setSeq(java.lang.Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取 展现的顺序
     */
    public java.lang.Integer getSeq() {
        return this.seq;
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
