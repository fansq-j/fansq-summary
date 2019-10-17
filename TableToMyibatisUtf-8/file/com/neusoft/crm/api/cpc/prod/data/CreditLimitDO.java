package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:参与人、客户、账户、产品在特定时间内付款或还款的意愿和能力
 * @实体表  :CREDIT_LIMIT
 */
public class CreditLimitDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CREDIT_LIMIT_S";

    /**
     * 记录信用额度标识，作为主键。
     */
    public java.lang.Long creditLimitId;

    /**
     * 记录参与人标识，作为主键。
     */
    public java.lang.Long partyId;

    /**
     * 记录客户标识，作为主键
     */
    public java.lang.Long custId;

    /**
     * 记录信用额度的作用对象类型。LOVB=CUS-0012。
     */
    public java.lang.String objType;

    /**
     * 作用对象标识，如果对象类型是客户，记录客户标识；如果对象类型是参与人，记录参与人标识；如果对象类型是产品实例，记录产品实例标识；如果对象类型是账户，记录电信账户标识。
     */
    public java.lang.Long objId;

    /**
     * 记录客户的信用额度值
     */
    public java.lang.Long creditLimitFee;

    /**
     * 记录指产生欠费扣除信用额度后剩余的信用额度
     */
    public java.lang.Long availableCreditLimitFee;

    /**
     * 记录评估时间。
     */
    public java.util.Date evaluateTime;

    /**
     * 记录信用额度的评估方式，分为：固定值设定、系统计算等。LOVB=CUS-C-0021。
     */
    public java.lang.String evaluateType;

    /**
     * 设定原因，如评估方式为：固定值设定时，记录具体的设定原因
     */
    public java.lang.String setReason;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录信用额度状态。LOVB=CUS-C-0022。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录信用额度标识，作为主键。
     */
    public void setCreditLimitId(java.lang.Long creditLimitId) {
        this.creditLimitId = creditLimitId;
    }

    /**
     * 获取 记录信用额度标识，作为主键。
     */
    public java.lang.Long getCreditLimitId() {
        return this.creditLimitId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.creditLimitId = SeqUtils.createLongId(ID_SEQ);
         return this.creditLimitId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录参与人标识，作为主键。
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 记录参与人标识，作为主键。
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 记录客户标识，作为主键
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 记录客户标识，作为主键
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 记录信用额度的作用对象类型。LOVB=CUS-0012。
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录信用额度的作用对象类型。LOVB=CUS-0012。
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 作用对象标识，如果对象类型是客户，记录客户标识；如果对象类型是参与人，记录参与人标识；如果对象类型是产品实例，记录产品实例标识；如果对象类型是账户，记录电信账户标识。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 作用对象标识，如果对象类型是客户，记录客户标识；如果对象类型是参与人，记录参与人标识；如果对象类型是产品实例，记录产品实例标识；如果对象类型是账户，记录电信账户标识。
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录客户的信用额度值
     */
    public void setCreditLimitFee(java.lang.Long creditLimitFee) {
        this.creditLimitFee = creditLimitFee;
    }

    /**
     * 获取 记录客户的信用额度值
     */
    public java.lang.Long getCreditLimitFee() {
        return this.creditLimitFee;
    }

    /**
     * 设置 记录指产生欠费扣除信用额度后剩余的信用额度
     */
    public void setAvailableCreditLimitFee(java.lang.Long availableCreditLimitFee) {
        this.availableCreditLimitFee = availableCreditLimitFee;
    }

    /**
     * 获取 记录指产生欠费扣除信用额度后剩余的信用额度
     */
    public java.lang.Long getAvailableCreditLimitFee() {
        return this.availableCreditLimitFee;
    }

    /**
     * 设置 记录评估时间。
     */
    public void setEvaluateTime(java.util.Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    /**
     * 获取 记录评估时间。
     */
    public java.util.Date getEvaluateTime() {
        return this.evaluateTime;
    }

    /**
     * 设置 记录信用额度的评估方式，分为：固定值设定、系统计算等。LOVB=CUS-C-0021。
     */
    public void setEvaluateType(java.lang.String evaluateType) {
        this.evaluateType = evaluateType;
    }

    /**
     * 获取 记录信用额度的评估方式，分为：固定值设定、系统计算等。LOVB=CUS-C-0021。
     */
    public java.lang.String getEvaluateType() {
        return this.evaluateType;
    }

    /**
     * 设置 设定原因，如评估方式为：固定值设定时，记录具体的设定原因
     */
    public void setSetReason(java.lang.String setReason) {
        this.setReason = setReason;
    }

    /**
     * 获取 设定原因，如评估方式为：固定值设定时，记录具体的设定原因
     */
    public java.lang.String getSetReason() {
        return this.setReason;
    }

    /**
     * 设置 记录生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录信用额度状态。LOVB=CUS-C-0022。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录信用额度状态。LOVB=CUS-C-0022。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
