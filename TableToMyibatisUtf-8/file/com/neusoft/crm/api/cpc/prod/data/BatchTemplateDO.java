package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:批量模板表
 * @实体表  :BATCH_TEMPLATE
 */
public class BatchTemplateDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BATCH_TEMPLATE_S";

    /**
     * 模板标识
     */
    public java.lang.Long batchTemplateId;

    /**
     * 批量业务类型ID
     */
    public java.lang.Long batchActionId;

    /**
     * 模板名称
     */
    public java.lang.String templateName;

    /**
     * 种子客户订单标识
     */
    public java.lang.Long seedOrderId;

    /**
     * 种子订单购物车JSON
     */
    public java.lang.String orderJson;

    /**
     * 模板文件存放位置
     */
    public java.lang.String filePath;

    /**
     * 指向公共管理区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 组织标识
     */
    public java.lang.Long orgId;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.batchTemplateId = SeqUtils.createLongId(ID_SEQ);
         return this.batchTemplateId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 批量业务类型ID
     */
    public void setBatchActionId(java.lang.Long batchActionId) {
        this.batchActionId = batchActionId;
    }

    /**
     * 获取 批量业务类型ID
     */
    public java.lang.Long getBatchActionId() {
        return this.batchActionId;
    }

    /**
     * 设置 模板名称
     */
    public void setTemplateName(java.lang.String templateName) {
        this.templateName = templateName;
    }

    /**
     * 获取 模板名称
     */
    public java.lang.String getTemplateName() {
        return this.templateName;
    }

    /**
     * 设置 种子客户订单标识
     */
    public void setSeedOrderId(java.lang.Long seedOrderId) {
        this.seedOrderId = seedOrderId;
    }

    /**
     * 获取 种子客户订单标识
     */
    public java.lang.Long getSeedOrderId() {
        return this.seedOrderId;
    }

    /**
     * 设置 种子订单购物车JSON
     */
    public void setOrderJson(java.lang.String orderJson) {
        this.orderJson = orderJson;
    }

    /**
     * 获取 种子订单购物车JSON
     */
    public java.lang.String getOrderJson() {
        return this.orderJson;
    }

    /**
     * 设置 模板文件存放位置
     */
    public void setFilePath(java.lang.String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取 模板文件存放位置
     */
    public java.lang.String getFilePath() {
        return this.filePath;
    }

    /**
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 组织标识
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
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
