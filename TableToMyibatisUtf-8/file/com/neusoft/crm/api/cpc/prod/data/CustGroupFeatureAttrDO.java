package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述了客户群的特征属性信息。客户群特征明细详细定义了客户群特征具备的客户属性。
 * @实体表  :CUST_GROUP_FEATURE_ATTR
 */
public class CustGroupFeatureAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_GROUP_FEATURE_ATTR_S";

    /**
     * 记录客户群特征扩展属性标识，作为主键
     */
    public java.lang.Long custGroupFeatureAttrId;

    /**
     * 记录客户群特征标识，作为外键，指向客户群特征实体
     */
    public java.lang.Long custGroupFeatureId;

    /**
     * 记录属性标识，作为外键，指向属性规格实体
     */
    public java.lang.Long attrId;

    /**
     * 记录属性值。
     */
    public java.lang.String attrValue;

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
     * 设置 记录客户群特征扩展属性标识，作为主键
     */
    public void setCustGroupFeatureAttrId(java.lang.Long custGroupFeatureAttrId) {
        this.custGroupFeatureAttrId = custGroupFeatureAttrId;
    }

    /**
     * 获取 记录客户群特征扩展属性标识，作为主键
     */
    public java.lang.Long getCustGroupFeatureAttrId() {
        return this.custGroupFeatureAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custGroupFeatureAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.custGroupFeatureAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户群特征标识，作为外键，指向客户群特征实体
     */
    public void setCustGroupFeatureId(java.lang.Long custGroupFeatureId) {
        this.custGroupFeatureId = custGroupFeatureId;
    }

    /**
     * 获取 记录客户群特征标识，作为外键，指向客户群特征实体
     */
    public java.lang.Long getCustGroupFeatureId() {
        return this.custGroupFeatureId;
    }

    /**
     * 设置 记录属性标识，作为外键，指向属性规格实体
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录属性标识，作为外键，指向属性规格实体
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 记录属性值。
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 记录属性值。
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
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
