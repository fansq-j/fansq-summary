package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录客户的积分帐户。客户的积分帐户包括：倍增积分帐户、红包积分帐户、抵用券积分帐户、定级成长帐户、直享成长帐户。红包积分
 * @实体表  :POINT_ACCT
 */
public class PointAcctDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_ACCT_S";

    /**
     * 积分帐户标识，作为主键
     */
    public java.lang.Long pointAcctId;

    /**
     * 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long custId;

    /**
     * 积分帐户类型，LOVB=POI-0002
     */
    public java.lang.String pointAccType;

    /**
     * 积分帐户名称
     */
    public java.lang.String pointAccName;

    /**
     * 记录积分帐户归属对象的类型，包括：参与人、客户、产品实例、销售品实例。LOVB=POI-C-0008
     */
    public java.lang.String objType;

    /**
     * 对象标识，指向对象类型对应的实体
     */
    public java.lang.Long objId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录积分余额。积分帐本下所有积分余额的总和。
     */
    public java.lang.Integer pointBalance;

    /**
     * 积分帐户状态，LOVB=POI-0003
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
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
     * 设置 积分帐户标识，作为主键
     */
    public void setPointAcctId(java.lang.Long pointAcctId) {
        this.pointAcctId = pointAcctId;
    }

    /**
     * 获取 积分帐户标识，作为主键
     */
    public java.lang.Long getPointAcctId() {
        return this.pointAcctId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointAcctId = SeqUtils.createLongId(ID_SEQ);
         return this.pointAcctId;
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
     * 设置 积分帐户类型，LOVB=POI-0002
     */
    public void setPointAccType(java.lang.String pointAccType) {
        this.pointAccType = pointAccType;
    }

    /**
     * 获取 积分帐户类型，LOVB=POI-0002
     */
    public java.lang.String getPointAccType() {
        return this.pointAccType;
    }

    /**
     * 设置 积分帐户名称
     */
    public void setPointAccName(java.lang.String pointAccName) {
        this.pointAccName = pointAccName;
    }

    /**
     * 获取 积分帐户名称
     */
    public java.lang.String getPointAccName() {
        return this.pointAccName;
    }

    /**
     * 设置 记录积分帐户归属对象的类型，包括：参与人、客户、产品实例、销售品实例。LOVB=POI-C-0008
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录积分帐户归属对象的类型，包括：参与人、客户、产品实例、销售品实例。LOVB=POI-C-0008
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象标识，指向对象类型对应的实体
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识，指向对象类型对应的实体
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
     * 设置 记录积分余额。积分帐本下所有积分余额的总和。
     */
    public void setPointBalance(java.lang.Integer pointBalance) {
        this.pointBalance = pointBalance;
    }

    /**
     * 获取 记录积分余额。积分帐本下所有积分余额的总和。
     */
    public java.lang.Integer getPointBalance() {
        return this.pointBalance;
    }

    /**
     * 设置 积分帐户状态，LOVB=POI-0003
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 积分帐户状态，LOVB=POI-0003
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态变更的时间。
            
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
            
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

}
