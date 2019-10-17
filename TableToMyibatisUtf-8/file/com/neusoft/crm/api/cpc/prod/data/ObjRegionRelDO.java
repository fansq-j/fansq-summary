package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表达实体对象适用区域的关系。
 * @实体表  :OBJ_REGION_REL
 */
public class ObjRegionRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_REGION_REL_S";

    /**
     * 记录对象区域关系标识，主键。
     */
    public java.lang.Long objRegionRelId;

    /**
     * 记录对象实体对应的编码。
     */
    public java.lang.String objNbr;

    /**
     * 主键对象实体标识，外键。
     */
    public java.lang.Long objId;

    /**
     * 记录适用区域标识，外键。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的创建时间。
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 记录对象区域关系标识，主键。
     */
    public void setObjRegionRelId(java.lang.Long objRegionRelId) {
        this.objRegionRelId = objRegionRelId;
    }

    /**
     * 获取 记录对象区域关系标识，主键。
     */
    public java.lang.Long getObjRegionRelId() {
        return this.objRegionRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.objRegionRelId = SeqUtils.createLongId(ID_SEQ);
         return this.objRegionRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录对象实体对应的编码。
     */
    public void setObjNbr(java.lang.String objNbr) {
        this.objNbr = objNbr;
    }

    /**
     * 获取 记录对象实体对应的编码。
     */
    public java.lang.String getObjNbr() {
        return this.objNbr;
    }

    /**
     * 设置 主键对象实体标识，外键。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 主键对象实体标识，外键。
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录适用区域标识，外键。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识，外键。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录的修改的员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改的员工。
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
     * 设置 状态修改的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
