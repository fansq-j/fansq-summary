package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:配置[对象]服务提供互斥约束关系 1.功能产品与服务提供互斥 2.证件类型与服务提供互斥 3.销售品与服务提供互斥 4.销售品实例属性值与服务提供互斥 5.产品实例属性值与服务提供互斥
 * @实体表  :OBJ_SERV_RSTR_CFG
 */
public class ObjServRstrCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OBJ_SERV_RSTR_CFG_S";

    /**
     * 对象服务提供关系约束标识，主键。
     */
    public java.lang.Long objServRstrRulId;

    /**
     * 对象类型 1	证件类型 2	产品 3	产品实例属性 4	销售品实例属性 5	产品实例属性值 
     */
    public java.lang.Long objType;

    /**
     * 对象标识
     */
    public java.lang.Long objId;

    /**
     * 对象约束值
     */
    public java.lang.Long objValue;

    /**
     * 服务提供
     */
    public java.lang.Integer serviceOfferId;

    /**
     * 记录产品服务提供之间的约束关系；LOVB=PRD-C-0021 
     */
    public java.lang.String rstrType;

    /**
     * 服务类型
     */
    public java.lang.String serviceKind;

    /**
     * 服务提供判断位 判断 0：包含（等于）1：不包含（不等于）
     */
    public java.lang.Integer conditionType;

    /**
     * 提示信息的具体内容
     */
    public java.lang.String promptMsg;

    /**
     * 记录适用的区域
     */
    public java.lang.Long lanId;

    /**
     * 记录状态。LOVB=PUB-C-0001
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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 对象服务提供关系约束标识，主键。
     */
    public void setObjServRstrRulId(java.lang.Long objServRstrRulId) {
        this.objServRstrRulId = objServRstrRulId;
    }

    /**
     * 获取 对象服务提供关系约束标识，主键。
     */
    public java.lang.Long getObjServRstrRulId() {
        return this.objServRstrRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.objServRstrRulId = SeqUtils.createLongId(ID_SEQ);
         return this.objServRstrRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 对象类型 1	证件类型 2	产品 3	产品实例属性 4	销售品实例属性 5	产品实例属性值 
     */
    public void setObjType(java.lang.Long objType) {
        this.objType = objType;
    }

    /**
     * 获取 对象类型 1	证件类型 2	产品 3	产品实例属性 4	销售品实例属性 5	产品实例属性值 
     */
    public java.lang.Long getObjType() {
        return this.objType;
    }

    /**
     * 设置 对象标识
     */
    public void setObjId(java.lang.Long objId) {
        this.objId = objId;
    }

    /**
     * 获取 对象标识
     */
    public java.lang.Long getObjId() {
        return this.objId;
    }

    /**
     * 设置 对象约束值
     */
    public void setObjValue(java.lang.Long objValue) {
        this.objValue = objValue;
    }

    /**
     * 获取 对象约束值
     */
    public java.lang.Long getObjValue() {
        return this.objValue;
    }

    /**
     * 设置 服务提供
     */
    public void setServiceOfferId(java.lang.Integer serviceOfferId) {
        this.serviceOfferId = serviceOfferId;
    }

    /**
     * 获取 服务提供
     */
    public java.lang.Integer getServiceOfferId() {
        return this.serviceOfferId;
    }

    /**
     * 设置 记录产品服务提供之间的约束关系；LOVB=PRD-C-0021 
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 记录产品服务提供之间的约束关系；LOVB=PRD-C-0021 
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 服务类型
     */
    public void setServiceKind(java.lang.String serviceKind) {
        this.serviceKind = serviceKind;
    }

    /**
     * 获取 服务类型
     */
    public java.lang.String getServiceKind() {
        return this.serviceKind;
    }

    /**
     * 设置 服务提供判断位 判断 0：包含（等于）1：不包含（不等于）
     */
    public void setConditionType(java.lang.Integer conditionType) {
        this.conditionType = conditionType;
    }

    /**
     * 获取 服务提供判断位 判断 0：包含（等于）1：不包含（不等于）
     */
    public java.lang.Integer getConditionType() {
        return this.conditionType;
    }

    /**
     * 设置 提示信息的具体内容
     */
    public void setPromptMsg(java.lang.String promptMsg) {
        this.promptMsg = promptMsg;
    }

    /**
     * 获取 提示信息的具体内容
     */
    public java.lang.String getPromptMsg() {
        return this.promptMsg;
    }

    /**
     * 设置 记录适用的区域
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 记录适用的区域
     */
    public java.lang.Long getLanId() {
        return this.lanId;
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
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
