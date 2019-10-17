package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述某业务对象具体特征的属性信息。比如：行业类型、法人代表作为属性规格，政企客户业务对象需要选取该属性规格，而个人客户业
 * @实体表  :BUSI_OBJ_ATTR
 */
public class BusiObjAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSI_OBJ_ATTR_S";

    /**
     * 记录业务对象属性主键
     */
    public java.lang.Long busiObjAttrId;

    /**
     * 记录业务对象标识
     */
    public java.lang.Long busiObjId;

    /**
     * 记录业务对象属性规格业务编码
     */
    public java.lang.Long attrId;

    /**
     * 记录物理实例表标识
     */
    public java.lang.Long tabId;

    /**
     * 记录物理实例表字段标识
     */
    public java.lang.Long colId;

    /**
     * 记录版本号
     */
    public java.lang.Integer verNum;

    /**
     * 记录属性最大数量，如果值大于1，表示在同个业务对象中，同个属性规格可以实例化多条
     */
    public java.lang.Integer attrMaxCount;

    /**
     * 记录属性规格默认取值
     */
    public java.lang.String defaultValue;

    /**
     * 记录属性规格取值范围之最小值
     */
    public java.lang.String valueFrom;

    /**
     * 记录属性规格取值范围之最大值
     */
    public java.lang.String valueTo;

    /**
     * 记录属性值在业务对象实例中唯一.LOVB=PUB-C-0006
     */
    public java.lang.Integer isUnique;

    /**
     * 记录是否可空.LOVB=PUB-C-0006
     */
    public java.lang.Integer isNullable;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录业务对象属性主键
     */
    public void setBusiObjAttrId(java.lang.Long busiObjAttrId) {
        this.busiObjAttrId = busiObjAttrId;
    }

    /**
     * 获取 记录业务对象属性主键
     */
    public java.lang.Long getBusiObjAttrId() {
        return this.busiObjAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.busiObjAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.busiObjAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录业务对象标识
     */
    public void setBusiObjId(java.lang.Long busiObjId) {
        this.busiObjId = busiObjId;
    }

    /**
     * 获取 记录业务对象标识
     */
    public java.lang.Long getBusiObjId() {
        return this.busiObjId;
    }

    /**
     * 设置 记录业务对象属性规格业务编码
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录业务对象属性规格业务编码
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 记录物理实例表标识
     */
    public void setTabId(java.lang.Long tabId) {
        this.tabId = tabId;
    }

    /**
     * 获取 记录物理实例表标识
     */
    public java.lang.Long getTabId() {
        return this.tabId;
    }

    /**
     * 设置 记录物理实例表字段标识
     */
    public void setColId(java.lang.Long colId) {
        this.colId = colId;
    }

    /**
     * 获取 记录物理实例表字段标识
     */
    public java.lang.Long getColId() {
        return this.colId;
    }

    /**
     * 设置 记录版本号
     */
    public void setVerNum(java.lang.Integer verNum) {
        this.verNum = verNum;
    }

    /**
     * 获取 记录版本号
     */
    public java.lang.Integer getVerNum() {
        return this.verNum;
    }

    /**
     * 设置 记录属性最大数量，如果值大于1，表示在同个业务对象中，同个属性规格可以实例化多条
     */
    public void setAttrMaxCount(java.lang.Integer attrMaxCount) {
        this.attrMaxCount = attrMaxCount;
    }

    /**
     * 获取 记录属性最大数量，如果值大于1，表示在同个业务对象中，同个属性规格可以实例化多条
     */
    public java.lang.Integer getAttrMaxCount() {
        return this.attrMaxCount;
    }

    /**
     * 设置 记录属性规格默认取值
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * 获取 记录属性规格默认取值
     */
    public java.lang.String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * 设置 记录属性规格取值范围之最小值
     */
    public void setValueFrom(java.lang.String valueFrom) {
        this.valueFrom = valueFrom;
    }

    /**
     * 获取 记录属性规格取值范围之最小值
     */
    public java.lang.String getValueFrom() {
        return this.valueFrom;
    }

    /**
     * 设置 记录属性规格取值范围之最大值
     */
    public void setValueTo(java.lang.String valueTo) {
        this.valueTo = valueTo;
    }

    /**
     * 获取 记录属性规格取值范围之最大值
     */
    public java.lang.String getValueTo() {
        return this.valueTo;
    }

    /**
     * 设置 记录属性值在业务对象实例中唯一.LOVB=PUB-C-0006
     */
    public void setIsUnique(java.lang.Integer isUnique) {
        this.isUnique = isUnique;
    }

    /**
     * 获取 记录属性值在业务对象实例中唯一.LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsUnique() {
        return this.isUnique;
    }

    /**
     * 设置 记录是否可空.LOVB=PUB-C-0006
     */
    public void setIsNullable(java.lang.Integer isNullable) {
        this.isNullable = isNullable;
    }

    /**
     * 获取 记录是否可空.LOVB=PUB-C-0006
     */
    public java.lang.Integer getIsNullable() {
        return this.isNullable;
    }

    /**
     * 设置 记录适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
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
