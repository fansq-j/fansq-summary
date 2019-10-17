package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:表达式
 * @实体表  :EXPRESS
 */
public class ExpressDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EXPRESS_S";

    /**
     * 主键
     */
    public java.lang.Long exprId;

    /**
     * 表达式模板标识
     */
    public java.lang.Long expressTemplateId;

    /**
     * 表达式名称
     */
    public java.lang.String expressName;

    /**
     * 表达式描述
     */
    public java.lang.String expressDesc;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 主键
     */
    public void setExprId(java.lang.Long exprId) {
        this.exprId = exprId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getExprId() {
        return this.exprId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.exprId = SeqUtils.createLongId(ID_SEQ);
         return this.exprId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 表达式模板标识
     */
    public void setExpressTemplateId(java.lang.Long expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    /**
     * 获取 表达式模板标识
     */
    public java.lang.Long getExpressTemplateId() {
        return this.expressTemplateId;
    }

    /**
     * 设置 表达式名称
     */
    public void setExpressName(java.lang.String expressName) {
        this.expressName = expressName;
    }

    /**
     * 获取 表达式名称
     */
    public java.lang.String getExpressName() {
        return this.expressName;
    }

    /**
     * 设置 表达式描述
     */
    public void setExpressDesc(java.lang.String expressDesc) {
        this.expressDesc = expressDesc;
    }

    /**
     * 获取 表达式描述
     */
    public java.lang.String getExpressDesc() {
        return this.expressDesc;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 记录修改的员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录修改的员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
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
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
