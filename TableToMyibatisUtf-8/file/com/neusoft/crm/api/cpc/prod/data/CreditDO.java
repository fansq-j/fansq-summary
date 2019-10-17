package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:信用度分为：参与人信用度、客户信用度、账户信用度、产品信用度。信用度是中国电信根据参与人、客户、账户、产品实例等维度的欠
 * @实体表  :CREDIT
 */
public class CreditDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CREDIT_S";

    /**
     * 记录信用度标识，作为主键
     */
    public java.lang.Long creditId;

    /**
     * 记录参与人标识，作为主键。
     */
    public java.lang.Long partyId;

    /**
     * 记录客户标识，作为主键
     */
    public java.lang.Long custId;

    /**
     * 记录信用度等级。LOVB=CUS-0008。
     */
    public java.lang.String creditLevel;

    /**
     * 记录信用度的作用对象类型。LOVB=CUS-0012。
     */
    public java.lang.String objType;

    /**
     * 作用对象标识，如果对象类型是客户，记录客户标识；如果对象类型是参与人，记录参与人标识；如果对象类型是产品实例，记录产品实例标识；如果对象类型是账户，记录电信账户标识。
     */
    public java.lang.Long objId;

    /**
     * 记录信用度值。
     */
    public java.lang.Integer creditValue;

    /**
     * 记录评估时间。
     */
    public java.util.Date evaluateTime;

    /**
     * 记录信用度的评估方式，分为：固定值设定、系统计算等。LOVB=CUS-C-0021。
     */
    public java.lang.String evaluateType;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录信用度标识，作为主键
     */
    public void setCreditId(java.lang.Long creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取 记录信用度标识，作为主键
     */
    public java.lang.Long getCreditId() {
        return this.creditId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.creditId = SeqUtils.createLongId(ID_SEQ);
         return this.creditId;
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
     * 设置 记录信用度等级。LOVB=CUS-0008。
     */
    public void setCreditLevel(java.lang.String creditLevel) {
        this.creditLevel = creditLevel;
    }

    /**
     * 获取 记录信用度等级。LOVB=CUS-0008。
     */
    public java.lang.String getCreditLevel() {
        return this.creditLevel;
    }

    /**
     * 设置 记录信用度的作用对象类型。LOVB=CUS-0012。
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录信用度的作用对象类型。LOVB=CUS-0012。
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
     * 设置 记录信用度值。
     */
    public void setCreditValue(java.lang.Integer creditValue) {
        this.creditValue = creditValue;
    }

    /**
     * 获取 记录信用度值。
     */
    public java.lang.Integer getCreditValue() {
        return this.creditValue;
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
     * 设置 记录信用度的评估方式，分为：固定值设定、系统计算等。LOVB=CUS-C-0021。
     */
    public void setEvaluateType(java.lang.String evaluateType) {
        this.evaluateType = evaluateType;
    }

    /**
     * 获取 记录信用度的评估方式，分为：固定值设定、系统计算等。LOVB=CUS-C-0021。
     */
    public java.lang.String getEvaluateType() {
        return this.evaluateType;
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
