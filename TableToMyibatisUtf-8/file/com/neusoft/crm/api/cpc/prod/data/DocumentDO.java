package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指纳入系统管理的非结构化文件信息。如照片、图片、扫描件等。
 * @实体表  :DOCUMENT
 */
public class DocumentDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DOCUMENT_S";

    /**
     * 记录文档的主键
     */
    public java.lang.Long docId;

    /**
     * 记录文档的名称
     */
    public java.lang.String docName;

    /**
     * 记录文档编码
     */
    public java.lang.String docNbr;

    /**
     * 记录文档的描述信息
     */
    public java.lang.String docDesc;

    /**
     * 记录文档格式，如文档文件的后缀名.LOVB=PUB-C-0019
     */
    public java.lang.String formatType;

    /**
     * 记录文档的版本
     */
    public java.lang.Integer verNum;

    /**
     * 记录文档占用空间的大小
     */
    public java.lang.String docSize;

    /**
     * 记录文档的作者
     */
    public java.lang.String author;

    /**
     * 记录文档存储类型，LOVB=PUB-C-0008
     */
    public java.lang.String storeType;

    /**
     * 记录文档存放路径链接
     */
    public java.lang.String docLink;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的创建时间。
     */
    public java.util.Date createDate;

    /**
     * 状态的修改时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.docId = SeqUtils.createLongId(ID_SEQ);
         return this.docId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录文档的名称
     */
    public void setDocName(java.lang.String docName) {
        this.docName = docName;
    }

    /**
     * 获取 记录文档的名称
     */
    public java.lang.String getDocName() {
        return this.docName;
    }

    /**
     * 设置 记录文档编码
     */
    public void setDocNbr(java.lang.String docNbr) {
        this.docNbr = docNbr;
    }

    /**
     * 获取 记录文档编码
     */
    public java.lang.String getDocNbr() {
        return this.docNbr;
    }

    /**
     * 设置 记录文档的描述信息
     */
    public void setDocDesc(java.lang.String docDesc) {
        this.docDesc = docDesc;
    }

    /**
     * 获取 记录文档的描述信息
     */
    public java.lang.String getDocDesc() {
        return this.docDesc;
    }

    /**
     * 设置 记录文档格式，如文档文件的后缀名.LOVB=PUB-C-0019
     */
    public void setFormatType(java.lang.String formatType) {
        this.formatType = formatType;
    }

    /**
     * 获取 记录文档格式，如文档文件的后缀名.LOVB=PUB-C-0019
     */
    public java.lang.String getFormatType() {
        return this.formatType;
    }

    /**
     * 设置 记录文档的版本
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录文档的版本
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

    /**
     * 设置 记录文档占用空间的大小
     */
    public void setDocSize(java.lang.String docSize) {
        this.docSize = docSize;
    }

    /**
     * 获取 记录文档占用空间的大小
     */
    public java.lang.String getDocSize() {
        return this.docSize;
    }

    /**
     * 设置 记录文档的作者
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    /**
     * 获取 记录文档的作者
     */
    public java.lang.String getAuthor() {
        return this.author;
    }

    /**
     * 设置 记录文档存储类型，LOVB=PUB-C-0008
     */
    public void setStoreType(java.lang.String storeType) {
        this.storeType = storeType;
    }

    /**
     * 获取 记录文档存储类型，LOVB=PUB-C-0008
     */
    public java.lang.String getStoreType() {
        return this.storeType;
    }

    /**
     * 设置 记录文档存放路径链接
     */
    public void setDocLink(java.lang.String docLink) {
        this.docLink = docLink;
    }

    /**
     * 获取 记录文档存放路径链接
     */
    public java.lang.String getDocLink() {
        return this.docLink;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录的创建员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的创建时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态的修改时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的修改时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间。
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
