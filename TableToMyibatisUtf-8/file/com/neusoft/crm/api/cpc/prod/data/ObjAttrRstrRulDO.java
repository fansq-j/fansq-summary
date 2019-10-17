package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录对象属性约束规则，表达的是规则的实例
 * @实体表  :OBJ_ATTR_RSTR_RUL
 */
public class ObjAttrRstrRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_ATTR_RSTR_RUL_S";

    /**
     * 记录对象属性约束规则主键
     */
    public java.lang.Long objAttrRstrRulId;

    /**
     * 记录规则约束模板主键
     */
    public java.lang.Long attrRstrTempId;

    /**
     * 记录业务对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public java.lang.String relObjId;

    /**
     * 记录A端对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public java.lang.String aObjId;

    /**
     * 记录A端业务对象的属性标识
     */
    public java.lang.Long aAttrId;

    /**
     * 记录A端适用服务提供标识
     */
    public java.lang.Long aServerOffer;

    /**
     * 记录Z端业务对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public java.lang.String zObjId;

    /**
     * Z端业务对象的属性标识
     */
    public java.lang.Long zAttrId;

    /**
     * 记录Z端适用服务提供标识
     */
    public java.lang.Long zServerOffer;

    /**
     * 记录约束方向，LOVB=RUL-C-0016
     */
    public java.lang.String direction;

    /**
     * 记录个性化规则提示，统一的提示在规格层面表达
     */
    public java.lang.String rulePrompt;

    /**
     * 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状，LOVB=PUB-C-0001。
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
     * 设置 记录对象属性约束规则主键
     */
    public void setObjAttrRstrRulId(java.lang.Long objAttrRstrRulId) {
        this.objAttrRstrRulId = objAttrRstrRulId;
    }

    /**
     * 获取 记录对象属性约束规则主键
     */
    public java.lang.Long getObjAttrRstrRulId() {
        return this.objAttrRstrRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.objAttrRstrRulId = SeqUtils.createLongId(ID_SEQ);
         return this.objAttrRstrRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录规则约束模板主键
     */
    public void setAttrRstrTempId(java.lang.Long attrRstrTempId) {
        this.attrRstrTempId = attrRstrTempId;
    }

    /**
     * 获取 记录规则约束模板主键
     */
    public java.lang.Long getAttrRstrTempId() {
        return this.attrRstrTempId;
    }

    /**
     * 设置 记录业务对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public void setRelObjId(java.lang.String relObjId) {
        this.relObjId = relObjId;
    }

    /**
     * 获取 记录业务对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public java.lang.String getRelObjId() {
        return this.relObjId;
    }

    /**
     * 设置 记录A端对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public void setAObjId(java.lang.String aObjId) {
        this.aObjId = aObjId;
    }

    /**
     * 获取 记录A端对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public java.lang.String getAObjId() {
        return this.aObjId;
    }

    /**
     * 设置 记录A端业务对象的属性标识
     */
    public void setAAttrId(java.lang.Long aAttrId) {
        this.aAttrId = aAttrId;
    }

    /**
     * 获取 记录A端业务对象的属性标识
     */
    public java.lang.Long getAAttrId() {
        return this.aAttrId;
    }

    /**
     * 设置 记录A端适用服务提供标识
     */
    public void setAServerOffer(java.lang.Long aServerOffer) {
        this.aServerOffer = aServerOffer;
    }

    /**
     * 获取 记录A端适用服务提供标识
     */
    public java.lang.Long getAServerOffer() {
        return this.aServerOffer;
    }

    /**
     * 设置 记录Z端业务对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public void setZObjId(java.lang.String zObjId) {
        this.zObjId = zObjId;
    }

    /**
     * 获取 记录Z端业务对象标识，如产品标识，销售品标识，销售品产品关系标识，销售品关系标识
     */
    public java.lang.String getZObjId() {
        return this.zObjId;
    }

    /**
     * 设置 Z端业务对象的属性标识
     */
    public void setZAttrId(java.lang.Long zAttrId) {
        this.zAttrId = zAttrId;
    }

    /**
     * 获取 Z端业务对象的属性标识
     */
    public java.lang.Long getZAttrId() {
        return this.zAttrId;
    }

    /**
     * 设置 记录Z端适用服务提供标识
     */
    public void setZServerOffer(java.lang.Long zServerOffer) {
        this.zServerOffer = zServerOffer;
    }

    /**
     * 获取 记录Z端适用服务提供标识
     */
    public java.lang.Long getZServerOffer() {
        return this.zServerOffer;
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
     * 设置 记录个性化规则提示，统一的提示在规格层面表达
     */
    public void setRulePrompt(java.lang.String rulePrompt) {
        this.rulePrompt = rulePrompt;
    }

    /**
     * 获取 记录个性化规则提示，统一的提示在规格层面表达
     */
    public java.lang.String getRulePrompt() {
        return this.rulePrompt;
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
     * 设置 记录状，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状，LOVB=PUB-C-0001。
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
