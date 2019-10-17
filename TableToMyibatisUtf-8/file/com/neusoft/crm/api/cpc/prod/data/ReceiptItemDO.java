package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义回执打印具体项
 * @实体表  :RECEIPT_ITEM
 */
public class ReceiptItemDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RECEIPT_ITEM_S";

    /**
     * 回执打印项标识
     */
    public java.lang.Long receiptItemId;

    /**
     * 回执区域标识
     */
    public java.lang.Long receiptDomainId;

    /**
     * 打印项信息类型，VLOB=EVT-C-0023
     */
    public java.lang.String itemType;

    /**
     * 上级打印项
     */
    public java.lang.Long perItemId;

    /**
     * 序号
     */
    public java.lang.Integer seq;

    /**
     * 文本模板
     */
    public java.lang.String contentTemplate;

    /**
     * 标签
     */
    public java.lang.String label;

    /**
     * 打印项名称
     */
    public java.lang.String itemName;

    /**
     * 子项编号类型，VLOB=EVT-C-0024
     */
    public java.lang.String seqType;

    /**
     * 是否合并处理，LOVB=PUB-C-0006
     */
    public java.lang.String isMerge;

    /**
     * 状态
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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.receiptItemId = SeqUtils.createLongId(ID_SEQ);
         return this.receiptItemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 打印项信息类型，VLOB=EVT-C-0023
     */
    public void setItemType(java.lang.String itemType) {
        this.itemType = itemType;
    }

    /**
     * 获取 打印项信息类型，VLOB=EVT-C-0023
     */
    public java.lang.String getItemType() {
        return this.itemType;
    }

    /**
     * 设置 上级打印项
     */
    public void setPerItemId(java.lang.Long perItemId) {
        this.perItemId = perItemId;
    }

    /**
     * 获取 上级打印项
     */
    public java.lang.Long getPerItemId() {
        return this.perItemId;
    }

    /**
     * 设置 序号
     */
    public void setSeq(java.lang.Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取 序号
     */
    public java.lang.Integer getSeq() {
        return this.seq;
    }

    /**
     * 设置 文本模板
     */
    public void setContentTemplate(java.lang.String contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    /**
     * 获取 文本模板
     */
    public java.lang.String getContentTemplate() {
        return this.contentTemplate;
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
     * 设置 打印项名称
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取 打印项名称
     */
    public java.lang.String getItemName() {
        return this.itemName;
    }

    /**
     * 设置 子项编号类型，VLOB=EVT-C-0024
     */
    public void setSeqType(java.lang.String seqType) {
        this.seqType = seqType;
    }

    /**
     * 获取 子项编号类型，VLOB=EVT-C-0024
     */
    public java.lang.String getSeqType() {
        return this.seqType;
    }

    /**
     * 设置 是否合并处理，LOVB=PUB-C-0006
     */
    public void setIsMerge(java.lang.String isMerge) {
        this.isMerge = isMerge;
    }

    /**
     * 获取 是否合并处理，LOVB=PUB-C-0006
     */
    public java.lang.String getIsMerge() {
        return this.isMerge;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
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
