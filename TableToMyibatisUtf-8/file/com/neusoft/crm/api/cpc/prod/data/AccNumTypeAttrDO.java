package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:接入号码类型属性
 * @实体表  :ACC_NUM_TYPE_ATTR
 */
public class AccNumTypeAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACC_NUM_TYPE_ATTR_S";

    /**
     * 主键。
     */
    public java.lang.Long accNumAttrId;

    /**
     * 表达产品号码类型。LOVB=PRD-C-0003
     */
    public java.lang.String numType;

    /**
     * 号码属性对应的主数据标识
     */
    public java.lang.Long attrId;

    /**
     * 号码属性的默认值。
     */
    public java.lang.String defaultValue;

    /**
     * 号码属性的具体描述。
     */
    public java.lang.String comments;

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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 主键。
     */
    public void setAccNumAttrId(java.lang.Long accNumAttrId) {
        this.accNumAttrId = accNumAttrId;
    }

    /**
     * 获取 主键。
     */
    public java.lang.Long getAccNumAttrId() {
        return this.accNumAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.accNumAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.accNumAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 表达产品号码类型。LOVB=PRD-C-0003
     */
    public void setNumType(java.lang.String numType) {
        this.numType = numType;
    }

    /**
     * 获取 表达产品号码类型。LOVB=PRD-C-0003
     */
    public java.lang.String getNumType() {
        return this.numType;
    }

    /**
     * 设置 号码属性对应的主数据标识
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 号码属性对应的主数据标识
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 号码属性的默认值。
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 号码属性的默认值。
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 号码属性的具体描述。
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 号码属性的具体描述。
     */
    public java.lang.String getComments() {
        return this.comments;
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
