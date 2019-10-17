package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述余额来源的类型。
余额的来源分类，如：
1 现金
2 合家欢余额
3
 * @实体表  :BALANCE_SOURCE_TYPE
 */
public class BalanceSourceTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_SOURCE_TYPE_S";

    /**
     * LOVB=ACC-C-0012
     */
    public java.lang.Integer balanceSourceTypeId;

    /**
     * 来源类型描述
     */
    public java.lang.String balanceSourceTypeDesc;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 LOVB=ACC-C-0012
     */
    public void setBalanceSourceTypeId(java.lang.Integer balanceSourceTypeId) {
        this.balanceSourceTypeId = balanceSourceTypeId;
    }

    /**
     * 获取 LOVB=ACC-C-0012
     */
    public java.lang.Integer getBalanceSourceTypeId() {
        return this.balanceSourceTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.balanceSourceTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.balanceSourceTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 来源类型描述
     */
    public void setBalanceSourceTypeDesc(java.lang.String balanceSourceTypeDesc) {
        this.balanceSourceTypeDesc = balanceSourceTypeDesc;
    }

    /**
     * 获取 来源类型描述
     */
    public java.lang.String getBalanceSourceTypeDesc() {
        return this.balanceSourceTypeDesc;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
