package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表达式模板定义了一类表达式共性的参数要求、功能和显示格式模板；因为表达式模板上的参数仅仅   参数要求，而不是真实的参数
 * @实体表  :EXPRESS_TEMPLATE
 */
public class ExpressTemplateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EXPRESS_TEMPLATE_S";

    /**
     * 记录表达式模板的主键
     */
    public java.lang.Long expressTemplateId;

    /**
     * 记录表达式模板的名称
     */
    public java.lang.String expressTemplateName;

    /**
     * 记录表达式模板是原子表达是模板还是组合表达式模板，LOVB=RUL-C-0004
     */
    public java.lang.String expressTemplateType;

    /**
     * 记录表达式模版的具体处理类，该处理主要完成实际的规则解析执行和规则显示
     */
    public java.lang.String handleClass;

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
     * 设置 记录表达式模板的主键
     */
    public void setExpressTemplateId(java.lang.Long expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    /**
     * 获取 记录表达式模板的主键
     */
    public java.lang.Long getExpressTemplateId() {
        return this.expressTemplateId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.expressTemplateId = SeqUtils.createLongId(ID_SEQ);
         return this.expressTemplateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录表达式模板的名称
     */
    public void setExpressTemplateName(java.lang.String expressTemplateName) {
        this.expressTemplateName = expressTemplateName;
    }

    /**
     * 获取 记录表达式模板的名称
     */
    public java.lang.String getExpressTemplateName() {
        return this.expressTemplateName;
    }

    /**
     * 设置 记录表达式模板是原子表达是模板还是组合表达式模板，LOVB=RUL-C-0004
     */
    public void setExpressTemplateType(java.lang.String expressTemplateType) {
        this.expressTemplateType = expressTemplateType;
    }

    /**
     * 获取 记录表达式模板是原子表达是模板还是组合表达式模板，LOVB=RUL-C-0004
     */
    public java.lang.String getExpressTemplateType() {
        return this.expressTemplateType;
    }

    /**
     * 设置 记录表达式模版的具体处理类，该处理主要完成实际的规则解析执行和规则显示
     */
    public void setHandleClass(java.lang.String handleClass) {
        this.handleClass = handleClass;
    }

    /**
     * 获取 记录表达式模版的具体处理类，该处理主要完成实际的规则解析执行和规则显示
     */
    public java.lang.String getHandleClass() {
        return this.handleClass;
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
