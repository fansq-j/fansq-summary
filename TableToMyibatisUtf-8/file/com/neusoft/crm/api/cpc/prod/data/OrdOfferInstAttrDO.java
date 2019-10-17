package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录订单变更的销售品实例属性。
 * @实体表  :ORD_OFFER_INST_ATTR
 */
public class OrdOfferInstAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ORD_OFFER_INST_ATTR_S";

    /**
     * 销售品实例属性的主键
     */
    public java.lang.Long offerInstAttrId;

    /**
     * 销售品实例标识
     */
    public java.lang.Long offerInstId;

    /**
     * 父级销售品实例属性标识，表达销售品实例属性组
     */
    public java.lang.Long parOfferInstAttrId;

    /**
     * 作用对象类型，01=销售品；02=产品（销售品产品构成标识）；03=角色，04、销售品包含对象标识，主数据
     */
    public java.lang.String objType;

    /**
     * 作用对象标识，属主标识，如：销售品实例、产品实例
     */
    public java.lang.Long objId;

    /**
     * 属性标识
     */
    public java.lang.Long attrId;

    /**
     * 属性值标识
     */
    public java.lang.Long attrValueId;

    /**
     * 记录属性值。
     */
    public java.lang.String attrValue;

    /**
     * 记录生效的时间。
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 区域ID
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录产品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。(记录的可以是立即竣工的时间或次月生效的时间)
     */
    public java.util.Date busiModEffDate;

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
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 记录订单项版本号。
     */
    public java.lang.Integer verNum;

    /**
     * 设置 销售品实例属性的主键
     */
    public void setOfferInstAttrId(java.lang.Long offerInstAttrId) {
        this.offerInstAttrId = offerInstAttrId;
    }

    /**
     * 获取 销售品实例属性的主键
     */
    public java.lang.Long getOfferInstAttrId() {
        return this.offerInstAttrId;
    }

    /**
     * 设置 销售品实例标识
     */
    public void setOfferInstId(java.lang.Long offerInstId) {
        this.offerInstId = offerInstId;
    }

    /**
     * 获取 销售品实例标识
     */
    public java.lang.Long getOfferInstId() {
        return this.offerInstId;
    }

    /**
     * 设置 父级销售品实例属性标识，表达销售品实例属性组
     */
    public void setParOfferInstAttrId(java.lang.Long parOfferInstAttrId) {
        this.parOfferInstAttrId = parOfferInstAttrId;
    }

    /**
     * 获取 父级销售品实例属性标识，表达销售品实例属性组
     */
    public java.lang.Long getParOfferInstAttrId() {
        return this.parOfferInstAttrId;
    }

    /**
     * 设置 作用对象类型，01=销售品；02=产品（销售品产品构成标识）；03=角色，04、销售品包含对象标识，主数据
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 作用对象类型，01=销售品；02=产品（销售品产品构成标识）；03=角色，04、销售品包含对象标识，主数据
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 作用对象标识，属主标识，如：销售品实例、产品实例
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 作用对象标识，属主标识，如：销售品实例、产品实例
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 属性标识
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 属性标识
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 属性值标识
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 属性值标识
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置 记录属性值。
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 记录属性值。
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
    }

    /**
     * 设置 记录生效的时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效的时间。
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
     * 设置 区域ID
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 区域ID
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录产品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。(记录的可以是立即竣工的时间或次月生效的时间)
     */
    public void setBusiModEffDate(java.util.Date busiModEffDate) {
        this.busiModEffDate = busiModEffDate;
    }

    /**
     * 获取 记录产品信息业务变更的时间，保持档案时间的连续性，手动维护或人工信息维护不需进历史表用修改时间表达，不用修改这个时间，由客户发起的要进历史表。(记录的可以是立即竣工的时间或次月生效的时间)
     */
    public java.util.Date getBusiModEffDate() {
        return this.busiModEffDate;
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
