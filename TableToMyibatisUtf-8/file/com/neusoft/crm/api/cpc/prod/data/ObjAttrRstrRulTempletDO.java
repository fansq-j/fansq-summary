package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录对象属性约束规则的模板，表达的是规则的规格。
 * @实体表  :OBJ_ATTR_RSTR_RUL_TEMPLET
 */
public class ObjAttrRstrRulTempletDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_ATTR_RSTR_RUL_TEMPLET_S";

    /**
     * 记录对象属性约束规则模板主键
     */
    public java.lang.Long attrRstrTempId;

    /**
     * 记录规则分类，LOVB=RUL-C-0013
     */
    public java.lang.String ruleType;

    /**
     * 记录关联对象类型，LOVB=RUL-C-0014
     */
    public java.lang.String relObjType;

    /**
     * 记录A端业务对象类型，LOVB=RUL-C-0014
     */
    public java.lang.String aObjType;

    /**
     * 记录A端属性类型
     */
    public java.lang.String aAttrType;

    /**
     * 记录A端适用服务提供
     */
    public java.lang.String aServerOfferId;

    /**
     * 记录Z段业务对象类型，LOVB=RUL-C-0014
     */
    public java.lang.String zObjType;

    /**
     * 记录Z端属性类型
     */
    public java.lang.String zAttrType;

    /**
     * 记录Z端适用服务提供
     */
    public java.lang.String zServerOfferId;

    /**
     * 记录取值约束，LOVB=RUL-C-0015
     */
    public java.lang.String restrictType;

    /**
     * 记录约束方向，LOVB=RUL-C-0016
     */
    public java.lang.String direction;

    /**
     * 记录规则提示
     */
    public java.lang.String rulePrompt;

    /**
     * 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态的变更时间
     */
    public java.util.Date statusDate;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录对象属性约束规则模板主键
     */
    public void setAttrRstrTempId(java.lang.Long attrRstrTempId) {
        this.attrRstrTempId = attrRstrTempId;
    }

    /**
     * 获取 记录对象属性约束规则模板主键
     */
    public java.lang.Long getAttrRstrTempId() {
        return this.attrRstrTempId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.attrRstrTempId = SeqUtils.createLongId(ID_SEQ);
         return this.attrRstrTempId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录规则分类，LOVB=RUL-C-0013
     */
    public void setRuleType(java.lang.String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * 获取 记录规则分类，LOVB=RUL-C-0013
     */
    public java.lang.String getRuleType() {
        return this.ruleType;
    }

    /**
     * 设置 记录关联对象类型，LOVB=RUL-C-0014
     */
    public void setRelObjType(java.lang.String relObjType) {
        this.relObjType = relObjType;
    }

    /**
     * 获取 记录关联对象类型，LOVB=RUL-C-0014
     */
    public java.lang.String getRelObjType() {
        return this.relObjType;
    }

    /**
     * 设置 记录A端业务对象类型，LOVB=RUL-C-0014
     */
    public void setAObjType(java.lang.String aObjType) {
        this.aObjType = aObjType;
    }

    /**
     * 获取 记录A端业务对象类型，LOVB=RUL-C-0014
     */
    public java.lang.String getAObjType() {
        return this.aObjType;
    }

    /**
     * 设置 记录A端属性类型
     */
    public void setAAttrType(java.lang.String aAttrType) {
        this.aAttrType = aAttrType;
    }

    /**
     * 获取 记录A端属性类型
     */
    public java.lang.String getAAttrType() {
        return this.aAttrType;
    }

    /**
     * 设置 记录A端适用服务提供
     */
    public void setAServerOfferId(java.lang.String aServerOfferId) {
        this.aServerOfferId = aServerOfferId;
    }

    /**
     * 获取 记录A端适用服务提供
     */
    public java.lang.String getAServerOfferId() {
        return this.aServerOfferId;
    }

    /**
     * 设置 记录Z段业务对象类型，LOVB=RUL-C-0014
     */
    public void setZObjType(java.lang.String zObjType) {
        this.zObjType = zObjType;
    }

    /**
     * 获取 记录Z段业务对象类型，LOVB=RUL-C-0014
     */
    public java.lang.String getZObjType() {
        return this.zObjType;
    }

    /**
     * 设置 记录Z端属性类型
     */
    public void setZAttrType(java.lang.String zAttrType) {
        this.zAttrType = zAttrType;
    }

    /**
     * 获取 记录Z端属性类型
     */
    public java.lang.String getZAttrType() {
        return this.zAttrType;
    }

    /**
     * 设置 记录Z端适用服务提供
     */
    public void setZServerOfferId(java.lang.String zServerOfferId) {
        this.zServerOfferId = zServerOfferId;
    }

    /**
     * 获取 记录Z端适用服务提供
     */
    public java.lang.String getZServerOfferId() {
        return this.zServerOfferId;
    }

    /**
     * 设置 记录取值约束，LOVB=RUL-C-0015
     */
    public void setRestrictType(java.lang.String restrictType) {
        this.restrictType = restrictType;
    }

    /**
     * 获取 记录取值约束，LOVB=RUL-C-0015
     */
    public java.lang.String getRestrictType() {
        return this.restrictType;
    }

    /**
     * 设置 记录约束方向，LOVB=RUL-C-0016
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }

    /**
     * 获取 记录约束方向，LOVB=RUL-C-0016
     */
    public java.lang.String getDirection() {
        return this.direction;
    }

    /**
     * 设置 记录规则提示
     */
    public void setRulePrompt(java.lang.String rulePrompt) {
        this.rulePrompt = rulePrompt;
    }

    /**
     * 获取 记录规则提示
     */
    public java.lang.String getRulePrompt() {
        return this.rulePrompt;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
     * 设置 状态的变更时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态的变更时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
