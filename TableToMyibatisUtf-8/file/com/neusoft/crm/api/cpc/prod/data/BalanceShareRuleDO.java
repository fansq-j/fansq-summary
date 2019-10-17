package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述余额共享的规则
 * @实体表  :BALANCE_SHARE_RULE
 */
public class BalanceShareRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BALANCE_SHARE_RULE_S";

    /**
     * 共享规则标识
     */
    public java.lang.Long shareRuleId;

    /**
     * 为每个余额帐本生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long acctBalanceId;

    /**
     * 共享规则类型
     */
    public java.lang.Integer shareRuleTypeId;

    /**
     * 余额对象类型，LOVB=ACC-C-0036
     */
    public java.lang.Integer objType;

    /**
     * 余额对象标识
     */
    public java.lang.Long objId;

    /**
     * 共享规则优先级
     */
    public java.lang.Integer shareRuleTypePri;

    /**
     * 扣费上限金额
     */
    public java.lang.Long upperAmount;

    /**
     * 扣费下限金额
     */
    public java.lang.Long lowerAmount;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

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
     * 设置 共享规则标识
     */
    public void setShareRuleId(java.lang.Long shareRuleId) {
        this.shareRuleId = shareRuleId;
    }

    /**
     * 获取 共享规则标识
     */
    public java.lang.Long getShareRuleId() {
        return this.shareRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.shareRuleId = SeqUtils.createLongId(ID_SEQ);
         return this.shareRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 为每个余额帐本生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public void setAcctBalanceId(java.lang.Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    /**
     * 获取 为每个余额帐本生成的唯一编号，只具有逻辑上的含义，没有物理意义。
     */
    public java.lang.Long getAcctBalanceId() {
        return this.acctBalanceId;
    }

    /**
     * 设置 共享规则类型
     */
    public void setShareRuleTypeId(java.lang.Integer shareRuleTypeId) {
        this.shareRuleTypeId = shareRuleTypeId;
    }

    /**
     * 获取 共享规则类型
     */
    public java.lang.Integer getShareRuleTypeId() {
        return this.shareRuleTypeId;
    }

    /**
     * 设置 余额对象类型，LOVB=ACC-C-0036
     */
    public void setObjType(java.lang.Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取 余额对象类型，LOVB=ACC-C-0036
     */
    public java.lang.Integer getObjType() {
        return this.objType;
    }

    /**
     * 设置 余额对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 余额对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 共享规则优先级
     */
    public void setShareRuleTypePri(java.lang.Integer shareRuleTypePri) {
        this.shareRuleTypePri = shareRuleTypePri;
    }

    /**
     * 获取 共享规则优先级
     */
    public java.lang.Integer getShareRuleTypePri() {
        return this.shareRuleTypePri;
    }

    /**
     * 设置 扣费上限金额
     */
    public void setUpperAmount(java.lang.Long upperAmount) {
        this.upperAmount = upperAmount;
    }

    /**
     * 获取 扣费上限金额
     */
    public java.lang.Long getUpperAmount() {
        return this.upperAmount;
    }

    /**
     * 设置 扣费下限金额
     */
    public void setLowerAmount(java.lang.Long lowerAmount) {
        this.lowerAmount = lowerAmount;
    }

    /**
     * 获取 扣费下限金额
     */
    public java.lang.Long getLowerAmount() {
        return this.lowerAmount;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
