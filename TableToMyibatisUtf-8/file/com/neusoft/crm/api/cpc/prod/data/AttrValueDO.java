package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指对属性取值范围的定义。
 * @实体表  :ATTR_VALUE
 */
public class AttrValueDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ATTR_VALUE_S";

    /**
     * 记录属性值的主键
     */
    public java.lang.Long attrValueId;

    /**
     * 记录业务对象属性规格业务编码
     */
    public java.lang.Long attrId;

    /**
     * 记录属性值名称
     */
    public java.lang.String attrValueName;

    /**
     * 记录属性值描述
     */
    public java.lang.String attrValueDesc;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录属性值。
     */
    public java.lang.String attrValue;

    /**
     * 记录外部属性值标识，存集团集约属性值标识
     */
    public java.lang.String extAttrValueId;

    /**
     * 记录状态。LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录的创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录同个属性不同的属性值在界面展现的顺序号
     */
    public java.lang.String attrValueSort;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录属性值的主键
     */
    public void setAttrValueId(java.lang.Long attrValueId) {
        this.attrValueId = attrValueId;
    }

    /**
     * 获取 记录属性值的主键
     */
    public java.lang.Long getAttrValueId() {
        return this.attrValueId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.attrValueId = SeqUtils.createLongId(ID_SEQ);
         return this.attrValueId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
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
     * 设置 记录属性值名称
     */
    public void setAttrValueName(java.lang.String attrValueName) {
        this.attrValueName = attrValueName;
    }

    /**
     * 获取 记录属性值名称
     */
    public java.lang.String getAttrValueName() {
        return this.attrValueName;
    }

    /**
     * 设置 记录属性值描述
     */
    public void setAttrValueDesc(java.lang.String attrValueDesc) {
        this.attrValueDesc = attrValueDesc;
    }

    /**
     * 获取 记录属性值描述
     */
    public java.lang.String getAttrValueDesc() {
        return this.attrValueDesc;
    }

    /**
     * 设置 记录的创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录的创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录外部属性值标识，存集团集约属性值标识
     */
    public void setExtAttrValueId(java.lang.String extAttrValueId) {
        this.extAttrValueId = extAttrValueId;
    }

    /**
     * 获取 记录外部属性值标识，存集团集约属性值标识
     */
    public java.lang.String getExtAttrValueId() {
        return this.extAttrValueId;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录的创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录同个属性不同的属性值在界面展现的顺序号
     */
    public void setAttrValueSort(java.lang.String attrValueSort) {
        this.attrValueSort = attrValueSort;
    }

    /**
     * 获取 记录同个属性不同的属性值在界面展现的顺序号
     */
    public java.lang.String getAttrValueSort() {
        return this.attrValueSort;
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
