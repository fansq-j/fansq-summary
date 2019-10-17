package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:客户树定义表
 * @实体表  :CUST_TREE
 */
public class CustTreeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_TREE_S";

    /**
     * 客户树标识，作为主键
     */
    public java.lang.Long custTreeId;

    /**
     * 客户树名称
     */
    public java.lang.String custTreeName;

    /**
     * 记录客户树类型。LOVB=CUS-C-0004。
     */
    public java.lang.String custTreeType;

    /**
     * 记录客户树的详细描述
     */
    public java.lang.String custTreeDesc;

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
     * 设置 客户树标识，作为主键
     */
    public void setCustTreeId(java.lang.Long custTreeId) {
        this.custTreeId = custTreeId;
    }

    /**
     * 获取 客户树标识，作为主键
     */
    public java.lang.Long getCustTreeId() {
        return this.custTreeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custTreeId = SeqUtils.createLongId(ID_SEQ);
         return this.custTreeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 客户树名称
     */
    public void setCustTreeName(java.lang.String custTreeName) {
        this.custTreeName = custTreeName;
    }

    /**
     * 获取 客户树名称
     */
    public java.lang.String getCustTreeName() {
        return this.custTreeName;
    }

    /**
     * 设置 记录客户树类型。LOVB=CUS-C-0004。
     */
    public void setCustTreeType(java.lang.String custTreeType) {
        this.custTreeType = custTreeType;
    }

    /**
     * 获取 记录客户树类型。LOVB=CUS-C-0004。
     */
    public java.lang.String getCustTreeType() {
        return this.custTreeType;
    }

    /**
     * 设置 记录客户树的详细描述
     */
    public void setCustTreeDesc(java.lang.String custTreeDesc) {
        this.custTreeDesc = custTreeDesc;
    }

    /**
     * 获取 记录客户树的详细描述
     */
    public java.lang.String getCustTreeDesc() {
        return this.custTreeDesc;
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
