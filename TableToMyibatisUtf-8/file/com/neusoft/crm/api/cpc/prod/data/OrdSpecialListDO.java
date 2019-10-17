package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的特殊名单。
 * @实体表  :ORD_SPECIAL_LIST
 */
public class OrdSpecialListDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_SPECIAL_LIST_S";

    /**
     * 特殊名单标识
     */
    public java.lang.Long specialListId;

    /**
     * 作用对象类型，记录特殊名单的对象类型可以是参与人、客户、产品实例、账户等。LOVB=CUS-0012。
     */
    public java.lang.String objType;

    /**
     * 记录参与人唯一标识，作为主键。
     */
    public java.lang.Long objId;

    /**
     * 记录特殊名单类型，如一类客户、二类客户等。LOVB=CUS-0007。
     */
    public java.lang.String specialType;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录名单子类型，LOVB=CUS-C-0025。
     */
    public java.lang.String subSpecialType;

    /**
     * 记录设置为特殊名单原因。
     */
    public java.lang.String specialListReason;

    /**
     * 记录创建渠道，作为外键，指向渠道实体
     */
    public java.lang.Long createChannel;

    /**
     * 记录发起部门，作为外键，指向电信组织实体
     */
    public java.lang.Long fromDept;

    /**
     * 记录审核人，外键，指向员工标识
     */
    public java.lang.Long checker;

    /**
     * 记录特殊名单是否审核通过。LOVB=PUB-C-0006。
     */
    public java.lang.Integer checkFlag;

    /**
     * 记录评估时间。
     */
    public java.util.Date evaluateTime;

    /**
     * 记录生效时间。
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录数据的行号，主键。
     */
    public java.lang.Long rowId;

    /**
     * 记录订单项标识。
     */
    public java.lang.Long orderItemId;

    /**
     * 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long oldRowId;

    /**
     * 操作类型，新增/修改/删除/保持
     */
    public java.lang.String operType;

    /**
     * 记录数据的状态，分为有效/无效/历史。
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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 特殊名单标识
     */
    public void setSpecialListId(java.lang.Long specialListId) {
        this.specialListId = specialListId;
    }

    /**
     * 获取 特殊名单标识
     */
    public java.lang.Long getSpecialListId() {
        return this.specialListId;
    }

    /**
     * 设置 作用对象类型，记录特殊名单的对象类型可以是参与人、客户、产品实例、账户等。LOVB=CUS-0012。
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 作用对象类型，记录特殊名单的对象类型可以是参与人、客户、产品实例、账户等。LOVB=CUS-0012。
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录参与人唯一标识，作为主键。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录参与人唯一标识，作为主键。
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录特殊名单类型，如一类客户、二类客户等。LOVB=CUS-0007。
     */
    public void setSpecialType(java.lang.String specialType) {
        this.specialType = specialType;
    }

    /**
     * 获取 记录特殊名单类型，如一类客户、二类客户等。LOVB=CUS-0007。
     */
    public java.lang.String getSpecialType() {
        return this.specialType;
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
     * 设置 记录名单子类型，LOVB=CUS-C-0025。
     */
    public void setSubSpecialType(java.lang.String subSpecialType) {
        this.subSpecialType = subSpecialType;
    }

    /**
     * 获取 记录名单子类型，LOVB=CUS-C-0025。
     */
    public java.lang.String getSubSpecialType() {
        return this.subSpecialType;
    }

    /**
     * 设置 记录设置为特殊名单原因。
     */
    public void setSpecialListReason(java.lang.String specialListReason) {
        this.specialListReason = specialListReason;
    }

    /**
     * 获取 记录设置为特殊名单原因。
     */
    public java.lang.String getSpecialListReason() {
        return this.specialListReason;
    }

    /**
     * 设置 记录创建渠道，作为外键，指向渠道实体
     */
    public void setCreateChannel(java.lang.Long createChannel) {
        this.createChannel = createChannel;
    }

    /**
     * 获取 记录创建渠道，作为外键，指向渠道实体
     */
    public java.lang.Long getCreateChannel() {
        return this.createChannel;
    }

    /**
     * 设置 记录发起部门，作为外键，指向电信组织实体
     */
    public void setFromDept(java.lang.Long fromDept) {
        this.fromDept = fromDept;
    }

    /**
     * 获取 记录发起部门，作为外键，指向电信组织实体
     */
    public java.lang.Long getFromDept() {
        return this.fromDept;
    }

    /**
     * 设置 记录审核人，外键，指向员工标识
     */
    public void setChecker(java.lang.Long checker) {
        this.checker = checker;
    }

    /**
     * 获取 记录审核人，外键，指向员工标识
     */
    public java.lang.Long getChecker() {
        return this.checker;
    }

    /**
     * 设置 记录特殊名单是否审核通过。LOVB=PUB-C-0006。
     */
    public void setCheckFlag(java.lang.Integer checkFlag) {
        this.checkFlag = checkFlag;
    }

    /**
     * 获取 记录特殊名单是否审核通过。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getCheckFlag() {
        return this.checkFlag;
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
     * 设置 记录数据的行号，主键。
     */
    public void setRowId(java.lang.Long rowId) {
        this.rowId = rowId;
    }

    /**
     * 获取 记录数据的行号，主键。
     */
    public java.lang.Long getRowId() {
        return this.rowId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.rowId = SeqUtils.createLongId(ID_SEQ);
         return this.rowId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录订单项标识。
     */
    public void setOrderItemId(java.lang.Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取 记录订单项标识。
     */
    public java.lang.Long getOrderItemId() {
        return this.orderItemId;
    }

    /**
     * 设置 记录变更或删除记录对应的原始行号。
     */
    public void setOldRowId(java.lang.Long oldRowId) {
        this.oldRowId = oldRowId;
    }

    /**
     * 获取 记录变更或删除记录对应的原始行号。
     */
    public java.lang.Long getOldRowId() {
        return this.oldRowId;
    }

    /**
     * 设置 操作类型，新增/修改/删除/保持
     */
    public void setOperType(java.lang.String operType) {
        this.operType = operType;
    }

    /**
     * 获取 操作类型，新增/修改/删除/保持
     */
    public java.lang.String getOperType() {
        return this.operType;
    }

    /**
     * 设置 记录数据的状态，分为有效/无效/历史。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，分为有效/无效/历史。
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

    /**
     * 设置 记录订单项版本号。
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录订单项版本号。
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

}
