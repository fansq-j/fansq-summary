package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:资费模板参数关系
 * @实体表  :TEMPLATE_PARAMETER_REL
 */
public class TemplateParameterRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEMPLATE_PARAMETER_REL_S";

    /**
     * 资费模板参数关系标识
     */
    public java.lang.Long templateParameterRelId;

    /**
     * 模板参数标识
     */
    public java.lang.Long templateParamId;

    /**
     * 资费模板标识
     */
    public java.lang.Long tariffTemplateId;

    /**
     * 参数编号
     */
    public java.lang.Integer paramNbr;

    /**
     * PRC-C-0036
            1：表示该参数可以有多条实例取值，通过“模板参数实例取值”实体记录多条实例取值
            0：表示该参数只允许有一条实例，则通过“模板参数实例”实体记录实例取值
            
     */
    public java.lang.Integer canMulti;

    /**
     * PRC-C-0036
            1：表示该参数可以通过属性来读取，无需在下发时指定具体值
            0：表示该参数的取值在资费模板下发时必须录入具体的取值
            
     */
    public java.lang.Integer canAttrFlag;

    /**
     * 参数说明
     */
    public java.lang.String paramDesc;

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
     * 外部资费模板参数关系标识
     */
    public java.lang.Long extTemplateParameterRelId;

    /**
     * 是否隐藏
     */
    public java.lang.Integer ifHide;

    /**
     * 是否检验
     */
    public java.lang.Integer ifValid;

    /**
     * 是否排序
     */
    public java.lang.Integer ifSort;

    /**
     * 是否显示
     */
    public java.lang.Integer ifDisplay;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.templateParameterRelId = SeqUtils.createLongId(ID_SEQ);
         return this.templateParameterRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 模板参数标识
     */
    public void setTemplateParamId(java.lang.Long templateParamId) {
        this.templateParamId = templateParamId;
    }

    /**
     * 获取 模板参数标识
     */
    public java.lang.Long getTemplateParamId() {
        return this.templateParamId;
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
     * 设置 参数编号
     */
    public void setParamNbr(java.lang.Integer paramNbr) {
        this.paramNbr = paramNbr;
    }

    /**
     * 获取 参数编号
     */
    public java.lang.Integer getParamNbr() {
        return this.paramNbr;
    }

    /**
     * 设置 PRC-C-0036
            1：表示该参数可以有多条实例取值，通过“模板参数实例取值”实体记录多条实例取值
            0：表示该参数只允许有一条实例，则通过“模板参数实例”实体记录实例取值
            
     */
    public void setCanMulti(java.lang.Integer canMulti) {
        this.canMulti = canMulti;
    }

    /**
     * 获取 PRC-C-0036
            1：表示该参数可以有多条实例取值，通过“模板参数实例取值”实体记录多条实例取值
            0：表示该参数只允许有一条实例，则通过“模板参数实例”实体记录实例取值
            
     */
    public java.lang.Integer getCanMulti() {
        return this.canMulti;
    }

    /**
     * 设置 PRC-C-0036
            1：表示该参数可以通过属性来读取，无需在下发时指定具体值
            0：表示该参数的取值在资费模板下发时必须录入具体的取值
            
     */
    public void setCanAttrFlag(java.lang.Integer canAttrFlag) {
        this.canAttrFlag = canAttrFlag;
    }

    /**
     * 获取 PRC-C-0036
            1：表示该参数可以通过属性来读取，无需在下发时指定具体值
            0：表示该参数的取值在资费模板下发时必须录入具体的取值
            
     */
    public java.lang.Integer getCanAttrFlag() {
        return this.canAttrFlag;
    }

    /**
     * 设置 参数说明
     */
    public void setParamDesc(java.lang.String paramDesc) {
        this.paramDesc = paramDesc;
    }

    /**
     * 获取 参数说明
     */
    public java.lang.String getParamDesc() {
        return this.paramDesc;
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

    /**
     * 设置 外部资费模板参数关系标识
     */
    public void setExtTemplateParameterRelId(java.lang.Long extTemplateParameterRelId) {
        this.extTemplateParameterRelId = extTemplateParameterRelId;
    }

    /**
     * 获取 外部资费模板参数关系标识
     */
    public java.lang.Long getExtTemplateParameterRelId() {
        return this.extTemplateParameterRelId;
    }

    /**
     * 设置 是否隐藏
     */
    public void setIfHide(java.lang.Integer ifHide) {
        this.ifHide = ifHide;
    }

    /**
     * 获取 是否隐藏
     */
    public java.lang.Integer getIfHide() {
        return this.ifHide;
    }

    /**
     * 设置 是否检验
     */
    public void setIfValid(java.lang.Integer ifValid) {
        this.ifValid = ifValid;
    }

    /**
     * 获取 是否检验
     */
    public java.lang.Integer getIfValid() {
        return this.ifValid;
    }

    /**
     * 设置 是否排序
     */
    public void setIfSort(java.lang.Integer ifSort) {
        this.ifSort = ifSort;
    }

    /**
     * 获取 是否排序
     */
    public java.lang.Integer getIfSort() {
        return this.ifSort;
    }

    /**
     * 设置 是否显示
     */
    public void setIfDisplay(java.lang.Integer ifDisplay) {
        this.ifDisplay = ifDisplay;
    }

    /**
     * 获取 是否显示
     */
    public java.lang.Integer getIfDisplay() {
        return this.ifDisplay;
    }

}
