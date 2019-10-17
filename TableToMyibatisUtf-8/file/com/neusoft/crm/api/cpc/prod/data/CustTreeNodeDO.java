package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:客户树节点表
 * @实体表  :CUST_TREE_NODE
 */
public class CustTreeNodeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_TREE_NODE_S";

    /**
     * 客户树节点标识，作为主键
     */
    public java.lang.Long custTreeNodeId;

    /**
     * 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long custId;

    /**
     * 客户树标识，作为外键，指向客户树实体
     */
    public java.lang.Long custTreeId;

    /**
     * 客户树节点编码。
     */
    public java.lang.String custTreeNodeCode;

    /**
     * 客户树节点名称。
     */
    public java.lang.String custTreeNodeName;

    /**
     * 记录客户树节点的上级节点标识，外键，指向客户树节点实体。
     */
    public java.lang.Long parentNodeId;

    /**
     * 客户树层级。
     */
    public java.lang.Integer custTreeLevel;

    /**
     * 记录客户树节点是否是叶子节点。LOVB=PUB-C-0006。
     */
    public java.lang.Integer leafFlag;

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
     * 设置 客户树节点标识，作为主键
     */
    public void setCustTreeNodeId(java.lang.Long custTreeNodeId) {
        this.custTreeNodeId = custTreeNodeId;
    }

    /**
     * 获取 客户树节点标识，作为主键
     */
    public java.lang.Long getCustTreeNodeId() {
        return this.custTreeNodeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custTreeNodeId = SeqUtils.createLongId(ID_SEQ);
         return this.custTreeNodeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户标识，作为外键，指向客户实体
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 客户树标识，作为外键，指向客户树实体
     */
    public void setCustTreeId(java.lang.Long custTreeId) {
        this.custTreeId = custTreeId;
    }

    /**
     * 获取 客户树标识，作为外键，指向客户树实体
     */
    public java.lang.Long getCustTreeId() {
        return this.custTreeId;
    }

    /**
     * 设置 客户树节点编码。
     */
    public void setCustTreeNodeCode(java.lang.String custTreeNodeCode) {
        this.custTreeNodeCode = custTreeNodeCode;
    }

    /**
     * 获取 客户树节点编码。
     */
    public java.lang.String getCustTreeNodeCode() {
        return this.custTreeNodeCode;
    }

    /**
     * 设置 客户树节点名称。
     */
    public void setCustTreeNodeName(java.lang.String custTreeNodeName) {
        this.custTreeNodeName = custTreeNodeName;
    }

    /**
     * 获取 客户树节点名称。
     */
    public java.lang.String getCustTreeNodeName() {
        return this.custTreeNodeName;
    }

    /**
     * 设置 记录客户树节点的上级节点标识，外键，指向客户树节点实体。
     */
    public void setParentNodeId(java.lang.Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    /**
     * 获取 记录客户树节点的上级节点标识，外键，指向客户树节点实体。
     */
    public java.lang.Long getParentNodeId() {
        return this.parentNodeId;
    }

    /**
     * 设置 客户树层级。
     */
    public void setCustTreeLevel(java.lang.Integer custTreeLevel) {
        this.custTreeLevel = custTreeLevel;
    }

    /**
     * 获取 客户树层级。
     */
    public java.lang.Integer getCustTreeLevel() {
        return this.custTreeLevel;
    }

    /**
     * 设置 记录客户树节点是否是叶子节点。LOVB=PUB-C-0006。
     */
    public void setLeafFlag(java.lang.Integer leafFlag) {
        this.leafFlag = leafFlag;
    }

    /**
     * 获取 记录客户树节点是否是叶子节点。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getLeafFlag() {
        return this.leafFlag;
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
