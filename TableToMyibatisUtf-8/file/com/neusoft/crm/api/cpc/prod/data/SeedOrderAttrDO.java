package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:种子订单JSON属性
 * @实体表  :SEED_ORDER_ATTR
 */
public class SeedOrderAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SEED_ORDER_ATTR_S";

    /**
     * 种子订单属性标识
     */
    public java.lang.Long seedOrderAttrId;

    /**
     * 模板标识
     */
    public java.lang.Long batchTemplateId;

    /**
     * JSON对象名称
     */
    public java.lang.String jsonObjName;

    /**
     * JSON属性名称
     */
    public java.lang.String jsonAttrName;

    /**
     * JSON属性值
     */
    public java.lang.String jsonAttrValue;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 种子订单属性标识
     */
    public void setSeedOrderAttrId(java.lang.Long seedOrderAttrId) {
        this.seedOrderAttrId = seedOrderAttrId;
    }

    /**
     * 获取 种子订单属性标识
     */
    public java.lang.Long getSeedOrderAttrId() {
        return this.seedOrderAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.seedOrderAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.seedOrderAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 模板标识
     */
    public void setBatchTemplateId(java.lang.Long batchTemplateId) {
        this.batchTemplateId = batchTemplateId;
    }

    /**
     * 获取 模板标识
     */
    public java.lang.Long getBatchTemplateId() {
        return this.batchTemplateId;
    }

    /**
     * 设置 JSON对象名称
     */
    public void setJsonObjName(java.lang.String jsonObjName) {
        this.jsonObjName = jsonObjName;
    }

    /**
     * 获取 JSON对象名称
     */
    public java.lang.String getJsonObjName() {
        return this.jsonObjName;
    }

    /**
     * 设置 JSON属性名称
     */
    public void setJsonAttrName(java.lang.String jsonAttrName) {
        this.jsonAttrName = jsonAttrName;
    }

    /**
     * 获取 JSON属性名称
     */
    public java.lang.String getJsonAttrName() {
        return this.jsonAttrName;
    }

    /**
     * 设置 JSON属性值
     */
    public void setJsonAttrValue(java.lang.String jsonAttrValue) {
        this.jsonAttrValue = jsonAttrValue;
    }

    /**
     * 获取 JSON属性值
     */
    public java.lang.String getJsonAttrValue() {
        return this.jsonAttrValue;
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
