package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指根据不同的员工类型所具有的不同的扩展属性。记录员工属性规格的实例化信息。
 * @实体表  :STAFF_ATTR
 */
public class StaffAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "STAFF_ATTR_S";

    /**
     * 员工属性标识
     */
    public java.lang.Long staffAttrId;

    /**
     * 员工标识
     */
    public java.lang.Long staffId;

    /**
     * 属性标识
     */
    public java.lang.Long attrId;

    /**
     * 属性值标识
     */
    public java.lang.Long attrValueId;

    /**
     * 属性值
     */
    public java.lang.String attrValue;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 设置 员工属性标识
     */
    public void setStaffAttrId(java.lang.Long staffAttrId) {
        this.staffAttrId = staffAttrId;
    }

    /**
     * 获取 员工属性标识
     */
    public java.lang.Long getStaffAttrId() {
        return this.staffAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.staffAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.staffAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 员工标识
     */
    public void setStaffId(java.lang.Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取 员工标识
     */
    public java.lang.Long getStaffId() {
        return this.staffId;
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
     * 设置 属性值
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取 属性值
     */
    public java.lang.String getAttrValue() {
        return this.attrValue;
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
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

}
