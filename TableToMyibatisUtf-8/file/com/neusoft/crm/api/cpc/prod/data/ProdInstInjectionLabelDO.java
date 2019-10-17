package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:具体用户注智标签的实例化
 * @实体表  :PROD_INST_INJECTION_LABEL
 */
public class ProdInstInjectionLabelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_INJECTION_LABEL_S";

    /**
     * 用户注智标签的主键
     */
    public java.lang.Long prodInstLabelId;

    /**
     * 产品实例标识
     */
    public java.lang.Long prodInstId;

    /**
     * 注智标签标识
     */
    public java.lang.Long injectionLabelId;

    /**
     * 注智标签值标识
     */
    public java.lang.Long labelValueId;

    /**
     * 注智标签值
     */
    public java.lang.String labelValue;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 用户注智标签的主键
     */
    public void setProdInstLabelId(java.lang.Long prodInstLabelId) {
        this.prodInstLabelId = prodInstLabelId;
    }

    /**
     * 获取 用户注智标签的主键
     */
    public java.lang.Long getProdInstLabelId() {
        return this.prodInstLabelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodInstLabelId = SeqUtils.createLongId(ID_SEQ);
         return this.prodInstLabelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 产品实例标识
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 产品实例标识
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 注智标签标识
     */
    public void setInjectionLabelId(java.lang.Long injectionLabelId) {
        this.injectionLabelId = injectionLabelId;
    }

    /**
     * 获取 注智标签标识
     */
    public java.lang.Long getInjectionLabelId() {
        return this.injectionLabelId;
    }

    /**
     * 设置 注智标签值标识
     */
    public void setLabelValueId(java.lang.Long labelValueId) {
        this.labelValueId = labelValueId;
    }

    /**
     * 获取 注智标签值标识
     */
    public java.lang.Long getLabelValueId() {
        return this.labelValueId;
    }

    /**
     * 设置 注智标签值
     */
    public void setLabelValue(java.lang.String labelValue) {
        this.labelValue = labelValue;
    }

    /**
     * 获取 注智标签值
     */
    public java.lang.String getLabelValue() {
        return this.labelValue;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
