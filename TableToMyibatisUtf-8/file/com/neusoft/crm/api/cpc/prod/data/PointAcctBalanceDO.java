package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:在积分帐本中记录按积分类型、生效时间、失效时间区分的每一笔积分数据帐本。
 * @实体表  :POINT_ACCT_BALANCE
 */
public class PointAcctBalanceDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_ACCT_BALANCE_S";

    /**
     * 积分帐本标识，作为主键
     */
    public java.lang.Long pointAcctBalanceId;

    /**
     * 积分帐户标识，作为外键，指向积分帐户实体
     */
    public java.lang.Long pointAcctId;

    /**
     * 积分类型标识，作为外键，指向积分类型实体
     */
    public java.lang.Integer pointTypeId;

    /**
     * 是否转赠积分，LOVB=PUB-C-0006，当积分转赠业务受赠方生成积分账本，来区别普通积分账本。
     */
    public java.lang.Integer presentFlag;

    /**
     * 记录积分帐本的积分初始值。
     */
    public java.lang.Integer pointInitValue;

    /**
     * 记录积分余额。
     */
    public java.lang.Integer pointBalance;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 周期终止类型，LOVB=POI-C-0013
     */
    public java.lang.String pointCycleEndType;

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
     * 积分帐本状态，LOVB=POI-0004
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分帐本标识，作为主键
     */
    public void setPointAcctBalanceId(java.lang.Long pointAcctBalanceId) {
        this.pointAcctBalanceId = pointAcctBalanceId;
    }

    /**
     * 获取 积分帐本标识，作为主键
     */
    public java.lang.Long getPointAcctBalanceId() {
        return this.pointAcctBalanceId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.pointAcctBalanceId = SeqUtils.createLongId(ID_SEQ);
         return this.pointAcctBalanceId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 积分帐户标识，作为外键，指向积分帐户实体
     */
    public void setPointAcctId(java.lang.Long pointAcctId) {
        this.pointAcctId = pointAcctId;
    }

    /**
     * 获取 积分帐户标识，作为外键，指向积分帐户实体
     */
    public java.lang.Long getPointAcctId() {
        return this.pointAcctId;
    }

    /**
     * 设置 积分类型标识，作为外键，指向积分类型实体
     */
    public void setPointTypeId(java.lang.Integer pointTypeId) {
        this.pointTypeId = pointTypeId;
    }

    /**
     * 获取 积分类型标识，作为外键，指向积分类型实体
     */
    public java.lang.Integer getPointTypeId() {
        return this.pointTypeId;
    }

    /**
     * 设置 是否转赠积分，LOVB=PUB-C-0006，当积分转赠业务受赠方生成积分账本，来区别普通积分账本。
     */
    public void setPresentFlag(java.lang.Integer presentFlag) {
        this.presentFlag = presentFlag;
    }

    /**
     * 获取 是否转赠积分，LOVB=PUB-C-0006，当积分转赠业务受赠方生成积分账本，来区别普通积分账本。
     */
    public java.lang.Integer getPresentFlag() {
        return this.presentFlag;
    }

    /**
     * 设置 记录积分帐本的积分初始值。
     */
    public void setPointInitValue(java.lang.Integer pointInitValue) {
        this.pointInitValue = pointInitValue;
    }

    /**
     * 获取 记录积分帐本的积分初始值。
     */
    public java.lang.Integer getPointInitValue() {
        return this.pointInitValue;
    }

    /**
     * 设置 记录积分余额。
     */
    public void setPointBalance(java.lang.Integer pointBalance) {
        this.pointBalance = pointBalance;
    }

    /**
     * 获取 记录积分余额。
     */
    public java.lang.Integer getPointBalance() {
        return this.pointBalance;
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
     * 设置 周期终止类型，LOVB=POI-C-0013
     */
    public void setPointCycleEndType(java.lang.String pointCycleEndType) {
        this.pointCycleEndType = pointCycleEndType;
    }

    /**
     * 获取 周期终止类型，LOVB=POI-C-0013
     */
    public java.lang.String getPointCycleEndType() {
        return this.pointCycleEndType;
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
     * 设置 积分帐本状态，LOVB=POI-0004
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 积分帐本状态，LOVB=POI-0004
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

}
