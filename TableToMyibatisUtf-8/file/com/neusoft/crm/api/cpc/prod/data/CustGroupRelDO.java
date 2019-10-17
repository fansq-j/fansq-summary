package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录客户群与客户群之间的关系
 * @实体表  :CUST_GROUP_REL
 */
public class CustGroupRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_GROUP_REL_S";

    /**
     * 记录客户群关系标识，作为主键
     */
    public java.lang.Long custGroupRelId;

    /**
     * 记录A端客户群标识，外键，指向客户群实体。
     */
    public java.lang.Long aCustGroupId;

    /**
     * 记录Z端客户群标识，外键，指向客户群实体。
     */
    public java.lang.Long zCustGroupId;

    /**
     * 记录客户群之间的关系。LOVB=CUS-C-0024
     */
    public java.lang.String relType;

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
     * 设置 记录客户群关系标识，作为主键
     */
    public void setCustGroupRelId(java.lang.Long custGroupRelId) {
        this.custGroupRelId = custGroupRelId;
    }

    /**
     * 获取 记录客户群关系标识，作为主键
     */
    public java.lang.Long getCustGroupRelId() {
        return this.custGroupRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custGroupRelId = SeqUtils.createLongId(ID_SEQ);
         return this.custGroupRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录A端客户群标识，外键，指向客户群实体。
     */
    public void setACustGroupId(java.lang.Long aCustGroupId) {
        this.aCustGroupId = aCustGroupId;
    }

    /**
     * 获取 记录A端客户群标识，外键，指向客户群实体。
     */
    public java.lang.Long getACustGroupId() {
        return this.aCustGroupId;
    }

    /**
     * 设置 记录Z端客户群标识，外键，指向客户群实体。
     */
    public void setZCustGroupId(java.lang.Long zCustGroupId) {
        this.zCustGroupId = zCustGroupId;
    }

    /**
     * 获取 记录Z端客户群标识，外键，指向客户群实体。
     */
    public java.lang.Long getZCustGroupId() {
        return this.zCustGroupId;
    }

    /**
     * 设置 记录客户群之间的关系。LOVB=CUS-C-0024
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 记录客户群之间的关系。LOVB=CUS-C-0024
     */
    public java.lang.String getRelType() {
        return this.relType;
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
