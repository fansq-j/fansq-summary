package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:评估模版定义了评估的框架模板，并对评估指标进行了选择配置
 * @实体表  :EVAL_TEMPLATE
 */
public class EvalTemplateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EVAL_TEMPLATE_S";

    /**
     * 记录评估模板的主键标识
     */
    public java.lang.Long evalTemplateId;

    /**
     * 记录评估模板的名称
     */
    public java.lang.String evalTemplateName;

    /**
     * 记录评估指标模板的描述说明
     */
    public java.lang.String evalTemplateDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 记录评估模板的主键标识
     */
    public void setEvalTemplateId(java.lang.Long evalTemplateId) {
        this.evalTemplateId = evalTemplateId;
    }

    /**
     * 获取 记录评估模板的主键标识
     */
    public java.lang.Long getEvalTemplateId() {
        return this.evalTemplateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.evalTemplateId = SeqUtils.createLongId(ID_SEQ);
         return this.evalTemplateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录评估模板的名称
     */
    public void setEvalTemplateName(java.lang.String evalTemplateName) {
        this.evalTemplateName = evalTemplateName;
    }

    /**
     * 获取 记录评估模板的名称
     */
    public java.lang.String getEvalTemplateName() {
        return this.evalTemplateName;
    }

    /**
     * 设置 记录评估指标模板的描述说明
     */
    public void setEvalTemplateDesc(java.lang.String evalTemplateDesc) {
        this.evalTemplateDesc = evalTemplateDesc;
    }

    /**
     * 获取 记录评估指标模板的描述说明
     */
    public java.lang.String getEvalTemplateDesc() {
        return this.evalTemplateDesc;
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
