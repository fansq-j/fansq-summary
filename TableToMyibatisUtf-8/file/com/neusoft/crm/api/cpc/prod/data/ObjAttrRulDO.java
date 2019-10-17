package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品、销售品等对象的属性校验规则。
 * @实体表  :OBJ_ATTR_RUL
 */
public class ObjAttrRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_ATTR_RUL_S";

    /**
     * 记录对象属性校验主键
     */
    public java.lang.Long objAttrRulId;

    /**
     * 记录对象类型，LOVB=RUL-C-0022
     */
    public java.lang.String objType;

    /**
     * 记录对象标识
     */
    public java.lang.Long objId;

    /**
     * 记录产品属性标识或销售品属性标识等
     */
    public java.lang.Long attrId;

    /**
     * 记录表达式类型，如正则表达式，逻辑表达式，伪代码，固定值等等，LOVB=RUL-C-0023
     */
    public java.lang.String expType;

    /**
     * 记录表达式内容
     */
    public java.lang.String expValue;

    /**
     * 记录适用区域标识。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录号码归属的本地网。
     */
    public java.lang.Long lanId;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

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
     * 设置 记录对象属性校验主键
     */
    public void setObjAttrRulId(java.lang.Long objAttrRulId) {
        this.objAttrRulId = objAttrRulId;
    }

    /**
     * 获取 记录对象属性校验主键
     */
    public java.lang.Long getObjAttrRulId() {
        return this.objAttrRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.objAttrRulId = SeqUtils.createLongId(ID_SEQ);
         return this.objAttrRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录对象类型，LOVB=RUL-C-0022
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录对象类型，LOVB=RUL-C-0022
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 记录产品属性标识或销售品属性标识等
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 记录产品属性标识或销售品属性标识等
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 记录表达式类型，如正则表达式，逻辑表达式，伪代码，固定值等等，LOVB=RUL-C-0023
     */
    public void setExpType(java.lang.String expType) {
        this.expType = expType;
    }

    /**
     * 获取 记录表达式类型，如正则表达式，逻辑表达式，伪代码，固定值等等，LOVB=RUL-C-0023
     */
    public java.lang.String getExpType() {
        return this.expType;
    }

    /**
     * 设置 记录表达式内容
     */
    public void setExpValue(java.lang.String expValue) {
        this.expValue = expValue;
    }

    /**
     * 获取 记录表达式内容
     */
    public java.lang.String getExpValue() {
        return this.expValue;
    }

    /**
     * 设置 记录适用区域标识。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录号码归属的本地网。
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录号码归属的本地网。
     */
    public java.lang.Long getLanId() {
        return this.lanId;
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

}
