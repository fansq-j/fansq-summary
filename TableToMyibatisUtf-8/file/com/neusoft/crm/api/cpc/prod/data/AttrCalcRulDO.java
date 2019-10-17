package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录属性计算规则
 * @实体表  :ATTR_CALC_RUL
 */
public class AttrCalcRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "ATTR_CALC_RUL_S";

    /**
     * 记录属性计算规则主键
     */
    public java.lang.Long attrCalcRulId;

    /**
     * 记录对象类型，LOVB=RUL-C-0002
     */
    public java.lang.String objType;

    /**
     * 记录对象标识，销售品属性标识
     */
    public java.lang.Long objId;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录条件类型，LOVB=RUL-C-0003
     */
    public java.lang.String condType;

    /**
     * 记录条件表达式
     */
    public java.lang.Long condExpId;

    /**
     * 记录结果类型，固定值或表达式。LOVB=RUL-C-0021
     */
    public java.lang.String resultType;

    /**
     * 记录自定义结果值
     */
    public java.lang.String result;

    /**
     * 记录结果表达式，值通过表达式运算获取
     */
    public java.lang.Long resultExpId;

    /**
     * 记录备注
     */
    public java.lang.String remark;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 记录属性计算规则主键
     */
    public void setAttrCalcRulId(java.lang.Long attrCalcRulId) {
        this.attrCalcRulId = attrCalcRulId;
    }

    /**
     * 获取 记录属性计算规则主键
     */
    public java.lang.Long getAttrCalcRulId() {
        return this.attrCalcRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.attrCalcRulId = SeqUtils.createLongId(ID_SEQ);
         return this.attrCalcRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录对象类型，LOVB=RUL-C-0002
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录对象类型，LOVB=RUL-C-0002
     */
    public java.lang.String getObjType() {
        return this.objType;
    }

    /**
     * 设置 记录对象标识，销售品属性标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 记录对象标识，销售品属性标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
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
     * 设置 记录条件类型，LOVB=RUL-C-0003
     */
    public void setCondType(java.lang.String condType) {
        this.condType = condType;
    }

    /**
     * 获取 记录条件类型，LOVB=RUL-C-0003
     */
    public java.lang.String getCondType() {
        return this.condType;
    }

    /**
     * 设置 记录条件表达式
     */
    public void setCondExpId(java.lang.Long condExpId) {
        this.condExpId = condExpId;
    }

    /**
     * 获取 记录条件表达式
     */
    public java.lang.Long getCondExpId() {
        return this.condExpId;
    }

    /**
     * 设置 记录结果类型，固定值或表达式。LOVB=RUL-C-0021
     */
    public void setResultType(java.lang.String resultType) {
        this.resultType = resultType;
    }

    /**
     * 获取 记录结果类型，固定值或表达式。LOVB=RUL-C-0021
     */
    public java.lang.String getResultType() {
        return this.resultType;
    }

    /**
     * 设置 记录自定义结果值
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }

    /**
     * 获取 记录自定义结果值
     */
    public java.lang.String getResult() {
        return this.result;
    }

    /**
     * 设置 记录结果表达式，值通过表达式运算获取
     */
    public void setResultExpId(java.lang.Long resultExpId) {
        this.resultExpId = resultExpId;
    }

    /**
     * 获取 记录结果表达式，值通过表达式运算获取
     */
    public java.lang.Long getResultExpId() {
        return this.resultExpId;
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

}
