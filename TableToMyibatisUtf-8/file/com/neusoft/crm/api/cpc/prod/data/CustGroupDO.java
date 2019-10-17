package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:是指中国电信根据营销需要，按照某种共同特征进行分类后形成的客户集合
 * @实体表  :CUST_GROUP
 */
public class CustGroupDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_GROUP_S";

    /**
     * 记录客户群标识，作为主键
     */
    public java.lang.Long custGroupId;

    /**
     * 记录客户群特征标识，作为外键，指向客户群特征实体
     */
    public java.lang.Long custGroupFeatureId;

    /**
     * 记录客户群统一编码。
     */
    public java.lang.String custGroupCode;

    /**
     * 记录客户群名称。
     */
    public java.lang.String custGroupName;

    /**
     * 记录客户群描述。
     */
    public java.lang.String custGroupDesc;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

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
     * 设置 记录客户群标识，作为主键
     */
    public void setCustGroupId(java.lang.Long custGroupId) {
        this.custGroupId = custGroupId;
    }

    /**
     * 获取 记录客户群标识，作为主键
     */
    public java.lang.Long getCustGroupId() {
        return this.custGroupId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custGroupId = SeqUtils.createLongId(ID_SEQ);
         return this.custGroupId;
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
     * 设置 记录客户群统一编码。
     */
    public void setCustGroupCode(java.lang.String custGroupCode) {
        this.custGroupCode = custGroupCode;
    }

    /**
     * 获取 记录客户群统一编码。
     */
    public java.lang.String getCustGroupCode() {
        return this.custGroupCode;
    }

    /**
     * 设置 记录客户群名称。
     */
    public void setCustGroupName(java.lang.String custGroupName) {
        this.custGroupName = custGroupName;
    }

    /**
     * 获取 记录客户群名称。
     */
    public java.lang.String getCustGroupName() {
        return this.custGroupName;
    }

    /**
     * 设置 记录客户群描述。
     */
    public void setCustGroupDesc(java.lang.String custGroupDesc) {
        this.custGroupDesc = custGroupDesc;
    }

    /**
     * 获取 记录客户群描述。
     */
    public java.lang.String getCustGroupDesc() {
        return this.custGroupDesc;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
