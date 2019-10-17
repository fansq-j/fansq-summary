package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述对象属性值约束规则参数，表达的是约束规则的具体属性值
 * @实体表  :OBJ_ATTR_VALUE_RSTR_RUL
 */
public class ObjAttrValueRstrRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_ATTR_VALUE_RSTR_RUL_S";

    /**
     * 记录对象属性值约束规则主键
     */
    public java.lang.Long valueRstrId;

    /**
     * 记录属性限制标识
     */
    public java.lang.Long restrictId;

    /**
     * 记录A端属性值标识
     */
    public java.lang.Long aAttrValueId;

    /**
     * 记录Z端属性值标识
     */
    public java.lang.Long zAttrValueId;

    /**
     * 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录备注
     */
    public java.lang.String remark;

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
     * 设置 记录对象属性值约束规则主键
     */
    public void setValueRstrId(java.lang.Long valueRstrId) {
        this.valueRstrId = valueRstrId;
    }

    /**
     * 获取 记录对象属性值约束规则主键
     */
    public java.lang.Long getValueRstrId() {
        return this.valueRstrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.valueRstrId = SeqUtils.createLongId(ID_SEQ);
         return this.valueRstrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录属性限制标识
     */
    public void setRestrictId(java.lang.Long restrictId) {
        this.restrictId = restrictId;
    }

    /**
     * 获取 记录属性限制标识
     */
    public java.lang.Long getRestrictId() {
        return this.restrictId;
    }

    /**
     * 设置 记录A端属性值标识
     */
    public void setAAttrValueId(java.lang.Long aAttrValueId) {
        this.aAttrValueId = aAttrValueId;
    }

    /**
     * 获取 记录A端属性值标识
     */
    public java.lang.Long getAAttrValueId() {
        return this.aAttrValueId;
    }

    /**
     * 设置 记录Z端属性值标识
     */
    public void setZAttrValueId(java.lang.Long zAttrValueId) {
        this.zAttrValueId = zAttrValueId;
    }

    /**
     * 获取 记录Z端属性值标识
     */
    public java.lang.Long getZAttrValueId() {
        return this.zAttrValueId;
    }

    /**
     * 设置 记录适用区域标识，指定公共管理区域
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注
     */
    public java.lang.String getRemark() {
        return this.remark;
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

}
