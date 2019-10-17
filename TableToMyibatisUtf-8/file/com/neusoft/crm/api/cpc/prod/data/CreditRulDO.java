package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述初始信用度规则。
 * @实体表  :CREDIT_RUL
 */
public class CreditRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CREDIT_RUL_S";

    /**
     * 记录规则标识，主键。
     */
    public java.lang.Long creditRulId;

    /**
     * 记录规则名称。
     */
    public java.lang.String ruleName;

    /**
     * 记录结果类型，LOVB=RUL-C-0001
     */
    public java.lang.String resultType;

    /**
     * 记录自定义结果值
     */
    public java.lang.String result;

    /**
     * 记录结果表达式。
     */
    public java.lang.Long resultExpId;

    /**
     * 记录规则描述。
     */
    public java.lang.String description;

    /**
     * 记录备注。
     */
    public java.lang.String remark;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long applyRegionId;

    /**
     * 设置 记录规则标识，主键。
     */
    public void setCreditRulId(java.lang.Long creditRulId) {
        this.creditRulId = creditRulId;
    }

    /**
     * 获取 记录规则标识，主键。
     */
    public java.lang.Long getCreditRulId() {
        return this.creditRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.creditRulId = SeqUtils.createLongId(ID_SEQ);
         return this.creditRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录规则名称。
     */
    public void setRuleName(java.lang.String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 获取 记录规则名称。
     */
    public java.lang.String getRuleName() {
        return this.ruleName;
    }

    /**
     * 设置 记录结果类型，LOVB=RUL-C-0001
     */
    public void setResultType(java.lang.String resultType) {
        this.resultType = resultType;
    }

    /**
     * 获取 记录结果类型，LOVB=RUL-C-0001
     */
    public java.lang.String getResultType() {
        return this.resultType;
    }

    /**
     * 设置 记录自定义结果值
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }

    /**
     * 获取 记录自定义结果值
     */
    public java.lang.String getResult() {
        return this.result;
    }

    /**
     * 设置 记录结果表达式。
     */
    public void setResultExpId(java.lang.Long resultExpId) {
        this.resultExpId = resultExpId;
    }

    /**
     * 获取 记录结果表达式。
     */
    public java.lang.Long getResultExpId() {
        return this.resultExpId;
    }

    /**
     * 设置 记录规则描述。
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * 获取 记录规则描述。
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * 设置 记录备注。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注。
     */
    public java.lang.String getRemark() {
        return this.remark;
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
     * 设置 记录适用区域标识，指定公共管理区域
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

}
