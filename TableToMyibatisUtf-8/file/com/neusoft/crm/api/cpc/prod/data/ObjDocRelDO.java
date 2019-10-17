package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录文档和对象的关系，比如公告和文档的关系等。
 * @实体表  :OBJ_DOC_REL
 */
public class ObjDocRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_DOC_REL_S";

    /**
     * 记录对象文档关系的主键
     */
    public java.lang.Long objDocRelId;

    /**
     * 记录关联文档的对象类型，包括公告、参与人证件照片、协议，LOVB=PUB-C-0010
     */
    public java.lang.String objType;

    /**
     * 记录关联文档的对象主键
     */
    public java.lang.Long objId;

    /**
     * 记录文档的主键
     */
    public java.lang.Long docId;

    /**
     * 当有多个文档时，记录文档的排序
     */
    public java.lang.Integer docSort;

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
     * 设置 记录对象文档关系的主键
     */
    public void setObjDocRelId(java.lang.Long objDocRelId) {
        this.objDocRelId = objDocRelId;
    }

    /**
     * 获取 记录对象文档关系的主键
     */
    public java.lang.Long getObjDocRelId() {
        return this.objDocRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.objDocRelId = SeqUtils.createLongId(ID_SEQ);
         return this.objDocRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录关联文档的对象类型，包括公告、参与人证件照片、协议，LOVB=PUB-C-0010
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录关联文档的对象类型，包括公告、参与人证件照片、协议，LOVB=PUB-C-0010
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录关联文档的对象主键
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录关联文档的对象主键
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
     * 设置 当有多个文档时，记录文档的排序
     */
    public void setDocSort(java.lang.Integer docSort) {
        this.docSort = docSort;
    }

    /**
     * 获取 当有多个文档时，记录文档的排序
     */
    public java.lang.Integer getDocSort() {
        return this.docSort;
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
