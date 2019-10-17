package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:资费模板实现关系
 * @实体表  :TEMPLATE_ACHIEVE_REL
 */
public class TemplateAchieveRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_ACHIEVE_REL_S";

    /**
     * 资费模板实现关系标识
     */
    public java.lang.Long templateAchieveRelId;

    /**
     * 资费模板标识
     */
    public java.lang.Long tariffTemplateId;

    /**
     * 模板序列
     */
    public java.lang.Integer seq;

    /**
     * 实体表名称
     */
    public java.lang.String tableName;

    /**
     * 实现模板实体主键名称
     */
    public java.lang.String colName;

    /**
     * 实现模板主键取值
     */
    public java.lang.Long colId;

    /**
     * PLC-C-0036
     */
    public java.lang.Integer ifParam;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 资费模板实现关系标识
     */
    public void setTemplateAchieveRelId(java.lang.Long templateAchieveRelId) {
        this.templateAchieveRelId = templateAchieveRelId;
    }

    /**
     * 获取 资费模板实现关系标识
     */
    public java.lang.Long getTemplateAchieveRelId() {
        return this.templateAchieveRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.templateAchieveRelId = SeqUtils.createLongId(ID_SEQ);
         return this.templateAchieveRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 资费模板标识
     */
    public void setTariffTemplateId(java.lang.Long tariffTemplateId) {
        this.tariffTemplateId = tariffTemplateId;
    }

    /**
     * 获取 资费模板标识
     */
    public java.lang.Long getTariffTemplateId() {
        return this.tariffTemplateId;
    }

    /**
     * 设置 模板序列
     */
    public void setSeq(java.lang.Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取 模板序列
     */
    public java.lang.Integer getSeq() {
        return this.seq;
    }

    /**
     * 设置 实体表名称
     */
    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取 实体表名称
     */
    public java.lang.String getTableName() {
        return this.tableName;
    }

    /**
     * 设置 实现模板实体主键名称
     */
    public void setColName(java.lang.String colName) {
        this.colName = colName;
    }

    /**
     * 获取 实现模板实体主键名称
     */
    public java.lang.String getColName() {
        return this.colName;
    }

    /**
     * 设置 实现模板主键取值
     */
    public void setColId(java.lang.Long colId) {
        this.colId = colId;
    }

    /**
     * 获取 实现模板主键取值
     */
    public java.lang.Long getColId() {
        return this.colId;
    }

    /**
     * 设置 PLC-C-0036
     */
    public void setIfParam(java.lang.Integer ifParam) {
        this.ifParam = ifParam;
    }

    /**
     * 获取 PLC-C-0036
     */
    public java.lang.Integer getIfParam() {
        return this.ifParam;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
