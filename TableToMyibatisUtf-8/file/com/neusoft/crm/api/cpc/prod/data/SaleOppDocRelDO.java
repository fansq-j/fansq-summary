package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述商机文档关系,如销售建议书、竞争对手分析报告等。
 * @实体表  :SALE_OPP_DOC_REL
 */
public class SaleOppDocRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALE_OPP_DOC_REL_S";

    /**
     * 关系标识，主键
     */
    public java.lang.Long relId;

    /**
     * 商机标识
     */
    public java.lang.Long saleOppId;

    /**
     * 记录文档的主键
     */
    public java.lang.Long docId;

    /**
     * 文档类型.LOVB=SAL-C-0003
     */
    public java.lang.String docType;

    /**
     * 记录状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 关系标识，主键
     */
    public void setRelId(java.lang.Long relId) {
        this.relId = relId;
    }

    /**
     * 获取 关系标识，主键
     */
    public java.lang.Long getRelId() {
        return this.relId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.relId = SeqUtils.createLongId(ID_SEQ);
         return this.relId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 商机标识
     */
    public void setSaleOppId(java.lang.Long saleOppId) {
        this.saleOppId = saleOppId;
    }

    /**
     * 获取 商机标识
     */
    public java.lang.Long getSaleOppId() {
        return this.saleOppId;
    }

    /**
     * 设置 记录文档的主键
     */
    public void setDocId(java.lang.Long docId) {
        this.docId = docId;
    }

    /**
     * 获取 记录文档的主键
     */
    public java.lang.Long getDocId() {
        return this.docId;
    }

    /**
     * 设置 文档类型.LOVB=SAL-C-0003
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }

    /**
     * 获取 文档类型.LOVB=SAL-C-0003
     */
    public java.lang.String getDocType() {
        return this.docType;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
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
