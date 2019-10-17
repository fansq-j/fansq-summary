package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录销售品、礼包、营销资源的关键字描述
 * @实体表  :MKT_OBJ_KEYWORDS_REL
 */
public class MktObjKeywordsRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_OBJ_KEYWORDS_REL_S";

    /**
     * 对象关键字标识
     */
    public java.lang.Long relId;

    /**
     * 关键字标识
     */
    public java.lang.String keywordId;

    /**
     * 记录关键字类型,LOVB=CAM-C-0001
            可以是实体类型,如横表对应的某一字段（关键字所属对象为实体表名，如客户，产品实例表），也可以是属性类型,如纵表对应的某一属性ID（关键字所属对象为通用属性规格表)
     */
    public java.lang.String keywordType;

    /**
     * 关键字所属对象,对象名为实体对应的表名
     */
    public java.lang.String keywordObj;

    /**
     * 记录关键字对应的对象字段或属性
            如果关键字类型是实体，则记录的是实体表的横表字段名，如果是扩展属性，则记录的是属性对应的attr_id
            
     */
    public java.lang.String keywordCol;

    /**
     * 记录关键字对应对象字段或属性的取值
     */
    public java.lang.String keywordValue;

    /**
     * 记录状态。LOVB=PUB-C-0001
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
     * 记录公共管理区域标识。
     */
    public java.lang.Long regionId;

    /**
     * 设置 对象关键字标识
     */
    public void setRelId(java.lang.Long relId) {
        this.relId = relId;
    }

    /**
     * 获取 对象关键字标识
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
     * 设置 关键字标识
     */
    public void setKeywordId(java.lang.String keywordId) {
        this.keywordId = keywordId;
    }

    /**
     * 获取 关键字标识
     */
    public java.lang.String getKeywordId() {
        return this.keywordId;
    }

    /**
     * 设置 记录关键字类型,LOVB=CAM-C-0001
            可以是实体类型,如横表对应的某一字段（关键字所属对象为实体表名，如客户，产品实例表），也可以是属性类型,如纵表对应的某一属性ID（关键字所属对象为通用属性规格表)
     */
    public void setKeywordType(java.lang.String keywordType) {
        this.keywordType = keywordType;
    }

    /**
     * 获取 记录关键字类型,LOVB=CAM-C-0001
            可以是实体类型,如横表对应的某一字段（关键字所属对象为实体表名，如客户，产品实例表），也可以是属性类型,如纵表对应的某一属性ID（关键字所属对象为通用属性规格表)
     */
    public java.lang.String getKeywordType() {
        return this.keywordType;
    }

    /**
     * 设置 关键字所属对象,对象名为实体对应的表名
     */
    public void setKeywordObj(java.lang.String keywordObj) {
        this.keywordObj = keywordObj;
    }

    /**
     * 获取 关键字所属对象,对象名为实体对应的表名
     */
    public java.lang.String getKeywordObj() {
        return this.keywordObj;
    }

    /**
     * 设置 记录关键字对应的对象字段或属性
            如果关键字类型是实体，则记录的是实体表的横表字段名，如果是扩展属性，则记录的是属性对应的attr_id
            
     */
    public void setKeywordCol(java.lang.String keywordCol) {
        this.keywordCol = keywordCol;
    }

    /**
     * 获取 记录关键字对应的对象字段或属性
            如果关键字类型是实体，则记录的是实体表的横表字段名，如果是扩展属性，则记录的是属性对应的attr_id
            
     */
    public java.lang.String getKeywordCol() {
        return this.keywordCol;
    }

    /**
     * 设置 记录关键字对应对象字段或属性的取值
     */
    public void setKeywordValue(java.lang.String keywordValue) {
        this.keywordValue = keywordValue;
    }

    /**
     * 获取 记录关键字对应对象字段或属性的取值
     */
    public java.lang.String getKeywordValue() {
        return this.keywordValue;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001
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

    /**
     * 设置 记录公共管理区域标识。
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 记录公共管理区域标识。
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

}
