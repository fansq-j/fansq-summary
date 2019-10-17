package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的参与人关系。
 * @实体表  :ORD_PARTY_REL
 */
public class OrdPartyRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_PARTY_REL_S";

    /**
     * 记录参与人角色的唯一标识，作为主键。
     */
    public java.lang.Long partyRelId;

    /**
     * 记录参与人唯一标识。
     */
    public java.lang.Long partyAId;

    /**
     * 记录参与人2的唯一标识。
     */
    public java.lang.Long partyZId;

    /**
     * 记录参与人与参与人的关系类型，增加主数据：父子、兄弟、夫妻、法人、竞争对手。LOVB=PTY-C-0005。
     */
    public java.lang.String partyRelType;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，分为有效/无效/历史。
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
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 记录参与人角色的唯一标识，作为主键。
     */
    public void setPartyRelId(java.lang.Long partyRelId) {
        this.partyRelId = partyRelId;
    }

    /**
     * 获取 记录参与人角色的唯一标识，作为主键。
     */
    public java.lang.Long getPartyRelId() {
        return this.partyRelId;
    }

    /**
     * 设置 记录参与人唯一标识。
     */
    public void setPartyAId(java.lang.Long partyAId) {
        this.partyAId = partyAId;
    }

    /**
     * 获取 记录参与人唯一标识。
     */
    public java.lang.Long getPartyAId() {
        return this.partyAId;
    }

    /**
     * 设置 记录参与人2的唯一标识。
     */
    public void setPartyZId(java.lang.Long partyZId) {
        this.partyZId = partyZId;
    }

    /**
     * 获取 记录参与人2的唯一标识。
     */
    public java.lang.Long getPartyZId() {
        return this.partyZId;
    }

    /**
     * 设置 记录参与人与参与人的关系类型，增加主数据：父子、兄弟、夫妻、法人、竞争对手。LOVB=PTY-C-0005。
     */
    public void setPartyRelType(java.lang.String partyRelType) {
        this.partyRelType = partyRelType;
    }

    /**
     * 获取 记录参与人与参与人的关系类型，增加主数据：父子、兄弟、夫妻、法人、竞争对手。LOVB=PTY-C-0005。
     */
    public java.lang.String getPartyRelType() {
        return this.partyRelType;
    }

    /**
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
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

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
