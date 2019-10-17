package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:商机审批是指销售人员向上级领导，或下级部门向上级部门申报批准重大或涉及相关部门配合的商机的过程。
 * @实体表  :SALE_OPP_APPROVAL
 */
public class SaleOppApprovalDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALE_OPP_APPROVAL_S";

    /**
     * 生成商机审批标识即序列号，表的主键。
     */
    public java.lang.Long saleOppApprovalId;

    /**
     * 商机标识。
     */
    public java.lang.Long saleOppId;

    /**
     * 记录审批内容。
     */
    public java.lang.String approvalContent;

    /**
     * 记录审批意见。
     */
    public java.lang.String approvalOpinion;

    /**
     * 记录审批内容。
     */
    public java.lang.Long approvalStaff;

    /**
     * 记录审批意见。
     */
    public java.lang.Long approvalOrgId;

    /**
     * 记录审批意见。
     */
    public java.lang.String approvalRole;

    /**
     * 记录审批状态，LOVB=SAL-C-0002
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
     * 设置 生成商机审批标识即序列号，表的主键。
     */
    public void setSaleOppApprovalId(java.lang.Long saleOppApprovalId) {
        this.saleOppApprovalId = saleOppApprovalId;
    }

    /**
     * 获取 生成商机审批标识即序列号，表的主键。
     */
    public java.lang.Long getSaleOppApprovalId() {
        return this.saleOppApprovalId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.saleOppApprovalId = SeqUtils.createLongId(ID_SEQ);
         return this.saleOppApprovalId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 商机标识。
     */
    public void setSaleOppId(java.lang.Long saleOppId) {
        this.saleOppId = saleOppId;
    }

    /**
     * 获取 商机标识。
     */
    public java.lang.Long getSaleOppId() {
        return this.saleOppId;
    }

    /**
     * 设置 记录审批内容。
     */
    public void setApprovalContent(java.lang.String approvalContent) {
        this.approvalContent = approvalContent;
    }

    /**
     * 获取 记录审批内容。
     */
    public java.lang.String getApprovalContent() {
        return this.approvalContent;
    }

    /**
     * 设置 记录审批意见。
     */
    public void setApprovalOpinion(java.lang.String approvalOpinion) {
        this.approvalOpinion = approvalOpinion;
    }

    /**
     * 获取 记录审批意见。
     */
    public java.lang.String getApprovalOpinion() {
        return this.approvalOpinion;
    }

    /**
     * 设置 记录审批内容。
     */
    public void setApprovalStaff(java.lang.Long approvalStaff) {
        this.approvalStaff = approvalStaff;
    }

    /**
     * 获取 记录审批内容。
     */
    public java.lang.Long getApprovalStaff() {
        return this.approvalStaff;
    }

    /**
     * 设置 记录审批意见。
     */
    public void setApprovalOrgId(java.lang.Long approvalOrgId) {
        this.approvalOrgId = approvalOrgId;
    }

    /**
     * 获取 记录审批意见。
     */
    public java.lang.Long getApprovalOrgId() {
        return this.approvalOrgId;
    }

    /**
     * 设置 记录审批意见。
     */
    public void setApprovalRole(java.lang.String approvalRole) {
        this.approvalRole = approvalRole;
    }

    /**
     * 获取 记录审批意见。
     */
    public java.lang.String getApprovalRole() {
        return this.approvalRole;
    }

    /**
     * 设置 记录审批状态，LOVB=SAL-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录审批状态，LOVB=SAL-C-0002
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
