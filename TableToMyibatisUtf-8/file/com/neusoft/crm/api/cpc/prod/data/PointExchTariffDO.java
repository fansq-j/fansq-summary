package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录积分兑换对象兑换需要支付的积分类型、积分值、现金值
 * @实体表  :POINT_EXCH_TARIFF
 */
public class PointExchTariffDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "POINT_EXCH_TARIFF_S";

    /**
     * 积分兑换支付规则标识，作为主键
     */
    public java.lang.Integer pointExchTariffId;

    /**
     * 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public java.lang.Integer pointExchObjId;

    /**
     * 定义分组情况；同组，分组标识相同；异组，分组标识不同；规则：同组与、异组或
     */
    public java.lang.Integer groupId;

    /**
     * 兑换支付类型，LOVB=POI-C-0002
     */
    public java.lang.String exchPayType;

    /**
     * 积分兑换支付规则的积分支付类型的分类，LOVB=POI-C-0003
     */
    public java.lang.String pointPayKind;

    /**
     * 当积分支付类型标志：1，填积分类型标识，-1 标识所有积分类型；当积分类型标志：2，填积分类型组标识. 
     */
    public java.lang.Integer pointTypeId;

    /**
     * 当支付类型：1，为支付的积分值；当支付类型：2，为需支付的现金金额
     */
    public java.lang.Integer exchValue;

    /**
     * 如果兑换支付类型为现金时，系统生成帐目项的帐目类型标识。作为外键，指向帐目类型实体。
     */
    public java.lang.Integer acctItemTypeId;

    /**
     * 生效日期
     */
    public java.util.Date effDate;

    /**
     * 失效日期
     */
    public java.util.Date expDate;

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
     * 状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 设置 积分兑换支付规则标识，作为主键
     */
    public void setPointExchTariffId(java.lang.Integer pointExchTariffId) {
        this.pointExchTariffId = pointExchTariffId;
    }

    /**
     * 获取 积分兑换支付规则标识，作为主键
     */
    public java.lang.Integer getPointExchTariffId() {
        return this.pointExchTariffId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pointExchTariffId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pointExchTariffId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public void setPointExchObjId(java.lang.Integer pointExchObjId) {
        this.pointExchObjId = pointExchObjId;
    }

    /**
     * 获取 积分兑换对象标识，作为外键，指向积分兑换对象实体
     */
    public java.lang.Integer getPointExchObjId() {
        return this.pointExchObjId;
    }

    /**
     * 设置 定义分组情况；同组，分组标识相同；异组，分组标识不同；规则：同组与、异组或
     */
    public void setGroupId(java.lang.Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取 定义分组情况；同组，分组标识相同；异组，分组标识不同；规则：同组与、异组或
     */
    public java.lang.Integer getGroupId() {
        return this.groupId;
    }

    /**
     * 设置 兑换支付类型，LOVB=POI-C-0002
     */
    public void setExchPayType(java.lang.String exchPayType) {
        this.exchPayType = exchPayType;
    }

    /**
     * 获取 兑换支付类型，LOVB=POI-C-0002
     */
    public java.lang.String getExchPayType() {
        return this.exchPayType;
    }

    /**
     * 设置 积分兑换支付规则的积分支付类型的分类，LOVB=POI-C-0003
     */
    public void setPointPayKind(java.lang.String pointPayKind) {
        this.pointPayKind = pointPayKind;
    }

    /**
     * 获取 积分兑换支付规则的积分支付类型的分类，LOVB=POI-C-0003
     */
    public java.lang.String getPointPayKind() {
        return this.pointPayKind;
    }

    /**
     * 设置 当积分支付类型标志：1，填积分类型标识，-1 标识所有积分类型；当积分类型标志：2，填积分类型组标识. 
     */
    public void setPointTypeId(java.lang.Integer pointTypeId) {
        this.pointTypeId = pointTypeId;
    }

    /**
     * 获取 当积分支付类型标志：1，填积分类型标识，-1 标识所有积分类型；当积分类型标志：2，填积分类型组标识. 
     */
    public java.lang.Integer getPointTypeId() {
        return this.pointTypeId;
    }

    /**
     * 设置 当支付类型：1，为支付的积分值；当支付类型：2，为需支付的现金金额
     */
    public void setExchValue(java.lang.Integer exchValue) {
        this.exchValue = exchValue;
    }

    /**
     * 获取 当支付类型：1，为支付的积分值；当支付类型：2，为需支付的现金金额
     */
    public java.lang.Integer getExchValue() {
        return this.exchValue;
    }

    /**
     * 设置 如果兑换支付类型为现金时，系统生成帐目项的帐目类型标识。作为外键，指向帐目类型实体。
     */
    public void setAcctItemTypeId(java.lang.Integer acctItemTypeId) {
        this.acctItemTypeId = acctItemTypeId;
    }

    /**
     * 获取 如果兑换支付类型为现金时，系统生成帐目项的帐目类型标识。作为外键，指向帐目类型实体。
     */
    public java.lang.Integer getAcctItemTypeId() {
        return this.acctItemTypeId;
    }

    /**
     * 设置 生效日期
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效日期
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效日期
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效日期
     */
    public java.util.Date getExpDate() {
        return this.expDate;
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
     * 设置 状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态，LOVB=PUB-C-0001
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
