package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:资费参数映射关系
 * @实体表  :PARAM_MAPPING_REL
 */
public class ParamMappingRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PARAM_MAPPING_REL_S";

    /**
     * 资费参数映射关系标识
     */
    public java.lang.Long paramMappingRelId;

    /**
     * 资费模板实现关系标识
     */
    public java.lang.Long templateAchieveRelId;

    /**
     * 资费模板参数关系标识
     */
    public java.lang.Long templateParameterRelId;

    /**
     * 参数映射实体字段
     */
    public java.lang.String tableCol;

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
     * 设置 资费参数映射关系标识
     */
    public void setParamMappingRelId(java.lang.Long paramMappingRelId) {
        this.paramMappingRelId = paramMappingRelId;
    }

    /**
     * 获取 资费参数映射关系标识
     */
    public java.lang.Long getParamMappingRelId() {
        return this.paramMappingRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.paramMappingRelId = SeqUtils.createLongId(ID_SEQ);
         return this.paramMappingRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 资费模板参数关系标识
     */
    public void setTemplateParameterRelId(java.lang.Long templateParameterRelId) {
        this.templateParameterRelId = templateParameterRelId;
    }

    /**
     * 获取 资费模板参数关系标识
     */
    public java.lang.Long getTemplateParameterRelId() {
        return this.templateParameterRelId;
    }

    /**
     * 设置 参数映射实体字段
     */
    public void setTableCol(java.lang.String tableCol) {
        this.tableCol = tableCol;
    }

    /**
     * 获取 参数映射实体字段
     */
    public java.lang.String getTableCol() {
        return this.tableCol;
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
