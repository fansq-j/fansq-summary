package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述业务对象的号码生成规则，如产品实例的业务号码、帐号的生成规则。
 * @实体表  :NUM_GENER_RUL
 */
public class NumGenerRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "NUM_GENER_RUL_S";

    /**
     * 记录号码生成规则标识
     */
    public java.lang.Long numGenerRulId;

    /**
     * 记录对象类型，LOVB=RUL-C-0017
     */
    public java.lang.String objType;

    /**
     * 记录对象标识
     */
    public java.lang.Long objId;

    /**
     * 记录号码类型，LOVB=RUL-C-0018
     */
    public java.lang.String numType;

    /**
     * 记录号码前缀名
     */
    public java.lang.String prefixName;

    /**
     * 记录号码后缀名
     */
    public java.lang.String postfixName;

    /**
     * 记录号码对应的sequence名称
     */
    public java.lang.String seqName;

    /**
     * 记录号码总长度
     */
    public java.lang.Long numLength;

    /**
     * 记录号码格式验证
     */
    public java.lang.String regex;

    /**
     * 记录号码格式描述
     */
    public java.lang.String regexDesc;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录号码生成规则标识
     */
    public void setNumGenerRulId(java.lang.Long numGenerRulId) {
        this.numGenerRulId = numGenerRulId;
    }

    /**
     * 获取 记录号码生成规则标识
     */
    public java.lang.Long getNumGenerRulId() {
        return this.numGenerRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.numGenerRulId = SeqUtils.createLongId(ID_SEQ);
         return this.numGenerRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录对象类型，LOVB=RUL-C-0017
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    /**
     * 获取 记录对象类型，LOVB=RUL-C-0017
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
     * 设置 记录号码类型，LOVB=RUL-C-0018
     */
    public void setNumType(java.lang.String numType) {
        this.numType = numType;
    }

    /**
     * 获取 记录号码类型，LOVB=RUL-C-0018
     */
    public java.lang.String getNumType() {
        return this.numType;
    }

    /**
     * 设置 记录号码前缀名
     */
    public void setPrefixName(java.lang.String prefixName) {
        this.prefixName = prefixName;
    }

    /**
     * 获取 记录号码前缀名
     */
    public java.lang.String getPrefixName() {
        return this.prefixName;
    }

    /**
     * 设置 记录号码后缀名
     */
    public void setPostfixName(java.lang.String postfixName) {
        this.postfixName = postfixName;
    }

    /**
     * 获取 记录号码后缀名
     */
    public java.lang.String getPostfixName() {
        return this.postfixName;
    }

    /**
     * 设置 记录号码对应的sequence名称
     */
    public void setSeqName(java.lang.String seqName) {
        this.seqName = seqName;
    }

    /**
     * 获取 记录号码对应的sequence名称
     */
    public java.lang.String getSeqName() {
        return this.seqName;
    }

    /**
     * 设置 记录号码总长度
     */
    public void setNumLength(java.lang.Long numLength) {
        this.numLength = numLength;
    }

    /**
     * 获取 记录号码总长度
     */
    public java.lang.Long getNumLength() {
        return this.numLength;
    }

    /**
     * 设置 记录号码格式验证
     */
    public void setRegex(java.lang.String regex) {
        this.regex = regex;
    }

    /**
     * 获取 记录号码格式验证
     */
    public java.lang.String getRegex() {
        return this.regex;
    }

    /**
     * 设置 记录号码格式描述
     */
    public void setRegexDesc(java.lang.String regexDesc) {
        this.regexDesc = regexDesc;
    }

    /**
     * 获取 记录号码格式描述
     */
    public java.lang.String getRegexDesc() {
        return this.regexDesc;
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
