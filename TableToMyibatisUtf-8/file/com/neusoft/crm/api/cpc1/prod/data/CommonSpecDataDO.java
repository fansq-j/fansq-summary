package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:常用配置规格数据。
 * @实体表  :COMMON_SPEC_DATA
 */
public class CommonSpecDataDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "COMMON_SPEC_DATA_S";

    /**
     * 常用配置数据标识。
     */
    public java.lang.Long commonSpecDataId;

    /**
     * 对象标识，产品销售品id等。
     */
    public java.lang.Long objId;

    /**
     * 对象类型，产品销售品等。
     */
    public java.lang.String objType;

    /**
     * OBJID字段的所属类型，扩展字段，产品的功能类型。
     */
    public java.lang.String specDataType;

    /**
     * 使用次数。
     */
    public java.lang.Long usageCount;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

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
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 扩展字段1。
     */
    public java.lang.String exp1;

    /**
     * 扩展字段2。
     */
    public java.lang.String exp2;

    /**
     * 备注。
     */
    public java.lang.String remark;

    /**
     * 设置 常用配置数据标识。
     */
    public void setCommonSpecDataId(java.lang.Long commonSpecDataId) {
        this.commonSpecDataId = commonSpecDataId;
    }

    /**
     * 获取 常用配置数据标识。
     */
    public java.lang.Long getCommonSpecDataId() {
        return this.commonSpecDataId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.commonSpecDataId = SeqUtils.createLongId(ID_SEQ);
         return this.commonSpecDataId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 对象标识，产品销售品id等。
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识，产品销售品id等。
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 对象类型，产品销售品等。
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 对象类型，产品销售品等。
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 OBJID字段的所属类型，扩展字段，产品的功能类型。
     */
    public void setSpecDataType(java.lang.String specDataType) {
        this.specDataType = specDataType;
    }

    /**
     * 获取 OBJID字段的所属类型，扩展字段，产品的功能类型。
     */
    public java.lang.String getSpecDataType() {
        return this.specDataType;
    }

    /**
     * 设置 使用次数。
     */
    public void setUsageCount(java.lang.Long usageCount) {
        this.usageCount = usageCount;
    }

    /**
     * 获取 使用次数。
     */
    public java.lang.Long getUsageCount() {
        return this.usageCount;
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
     * 设置 扩展字段1。
     */
    public void setExp1(java.lang.String exp1) {
        this.exp1 = exp1;
    }

    /**
     * 获取 扩展字段1。
     */
    public java.lang.String getExp1() {
        return this.exp1;
    }

    /**
     * 设置 扩展字段2。
     */
    public void setExp2(java.lang.String exp2) {
        this.exp2 = exp2;
    }

    /**
     * 获取 扩展字段2。
     */
    public java.lang.String getExp2() {
        return this.exp2;
    }

    /**
     * 设置 备注。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注。
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
