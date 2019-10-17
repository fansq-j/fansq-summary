package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述押金提取，押金转存的规则。
 * @实体表  :DEPOSIT_PAY_RULE
 */
public class DepositPayRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEPOSIT_PAY_RULE_S";

    /**
     * 押金提取规则标识，主键
     */
    public java.lang.Integer depositPayRoleId;

    /**
     * 押金类型标识，外键
     */
    public java.lang.Integer depositTypeId;

    /**
     * 延迟多少天后允许提取或转存
     */
    public java.lang.Integer delayDay;

    /**
     * 是否允许转为余额。ACC-C-0044
     */
    public java.lang.Integer ifSaveBalance;

    /**
     * 转存为余额时的余额类型
     */
    public java.lang.Integer balanceTypeId;

    /**
     * LOVB=ACC-C-0105
     */
    public java.lang.String operType;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

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
     * 设置 押金提取规则标识，主键
     */
    public void setDepositPayRoleId(java.lang.Integer depositPayRoleId) {
        this.depositPayRoleId = depositPayRoleId;
    }

    /**
     * 获取 押金提取规则标识，主键
     */
    public java.lang.Integer getDepositPayRoleId() {
        return this.depositPayRoleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.depositPayRoleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.depositPayRoleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 押金类型标识，外键
     */
    public void setDepositTypeId(java.lang.Integer depositTypeId) {
        this.depositTypeId = depositTypeId;
    }

    /**
     * 获取 押金类型标识，外键
     */
    public java.lang.Integer getDepositTypeId() {
        return this.depositTypeId;
    }

    /**
     * 设置 延迟多少天后允许提取或转存
     */
    public void setDelayDay(java.lang.Integer delayDay) {
        this.delayDay = delayDay;
    }

    /**
     * 获取 延迟多少天后允许提取或转存
     */
    public java.lang.Integer getDelayDay() {
        return this.delayDay;
    }

    /**
     * 设置 是否允许转为余额。ACC-C-0044
     */
    public void setIfSaveBalance(java.lang.Integer ifSaveBalance) {
        this.ifSaveBalance = ifSaveBalance;
    }

    /**
     * 获取 是否允许转为余额。ACC-C-0044
     */
    public java.lang.Integer getIfSaveBalance() {
        return this.ifSaveBalance;
    }

    /**
     * 设置 转存为余额时的余额类型
     */
    public void setBalanceTypeId(java.lang.Integer balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
    }

    /**
     * 获取 转存为余额时的余额类型
     */
    public java.lang.Integer getBalanceTypeId() {
        return this.balanceTypeId;
    }

    /**
     * 设置 LOVB=ACC-C-0105
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 LOVB=ACC-C-0105
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
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
