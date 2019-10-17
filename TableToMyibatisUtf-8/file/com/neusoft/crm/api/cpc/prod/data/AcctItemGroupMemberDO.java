package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义每个帐目组包含哪些帐目。
 * @实体表  :ACCT_ITEM_GROUP_MEMBER
 */
public class AcctItemGroupMemberDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ACCT_ITEM_GROUP_MEMBER_S";

    /**
     * 帐目组帐目标识
     */
    public java.lang.Integer acctItemGroupMemId;

    /**
     * 帐目类型的唯一标识。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 为每个帐目组生成的唯一编号。
     */
    public java.lang.Integer acctItemGroupId;

    /**
     * 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer itemSourceId;

    /**
     * 记录状态 。 LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 帐目组帐目标识
     */
    public void setAcctItemGroupMemId(java.lang.Integer acctItemGroupMemId) {
        this.acctItemGroupMemId = acctItemGroupMemId;
    }

    /**
     * 获取 帐目组帐目标识
     */
    public java.lang.Integer getAcctItemGroupMemId() {
        return this.acctItemGroupMemId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.acctItemGroupMemId = SeqUtils.createIntegerId(ID_SEQ);
         return this.acctItemGroupMemId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 帐目类型的唯一标识。
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 帐目类型的唯一标识。
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 为每个帐目组生成的唯一编号。
     */
    public void setAcctItemGroupId(java.lang.Integer acctItemGroupId) {
        this.acctItemGroupId = acctItemGroupId;
    }

    /**
     * 获取 为每个帐目组生成的唯一编号。
     */
    public java.lang.Integer getAcctItemGroupId() {
        return this.acctItemGroupId;
    }

    /**
     * 设置 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public void setItemSourceId(java.lang.Integer itemSourceId) {
        this.itemSourceId = itemSourceId;
    }

    /**
     * 获取 为每一种帐目类型的帐目的来源生成的唯一标识。
     */
    public java.lang.Integer getItemSourceId() {
        return this.itemSourceId;
    }

    /**
     * 设置 记录状态 。 LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态 。 LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

}
