package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:业务规则
 * @实体表  :BUSI_RULE
 */
public class BusiRuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSI_RULE_S";

    /**
     * 业务规则标识
     */
    public java.lang.Integer busiRuleId;

    /**
     * 业务规则编码
     */
    public java.lang.String busiRuleCode;

    /**
     * 业务规则名称
     */
    public java.lang.String busiRuleName;

    /**
     * 业务规则描述
     */
    public java.lang.String busiRuleDesc;

    /**
     * 000 - 数据驱动类规则,100 - JAVA插件类规则,101 - SQL插件类规则,102 - 存储过程插件类规则,103 - JS插件类规则,201 - 自定义动态类规则,202 - 引擎
     */
    public java.lang.String ruleType;

    /**
     * 对于每种类型的规则，可以通过该字段定义相关的规则数据，例如：对于存储过程类规则， 该字段定义了相应的存储过程名字；对于JAVA类规则和数据驱动类规
     */
    public java.lang.String data;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 管控级别：1省级，2地市级
     */
    public java.lang.String manageLevelCd;

    /**
     * PPM规则编号
     */
    public java.lang.Long ppmRuleId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 0,一般性规则;1,查询数据库类规则,用于二次检测不满足规则条件时,关闭弹出页
     */
    public java.lang.Long ruleQueryType;

    /**
     * 规则表达式
     */
    public java.lang.String busiRuleExp;

    /**
     * 适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 业务规则标识
     */
    public void setBusiRuleId(java.lang.Integer busiRuleId) {
        this.busiRuleId = busiRuleId;
    }

    /**
     * 获取 业务规则标识
     */
    public java.lang.Integer getBusiRuleId() {
        return this.busiRuleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.busiRuleId = SeqUtils.createIntegerId(ID_SEQ);
         return this.busiRuleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 业务规则编码
     */
    public void setBusiRuleCode(java.lang.String busiRuleCode) {
        this.busiRuleCode = busiRuleCode;
    }

    /**
     * 获取 业务规则编码
     */
    public java.lang.String getBusiRuleCode() {
        return this.busiRuleCode;
    }

    /**
     * 设置 业务规则名称
     */
    public void setBusiRuleName(java.lang.String busiRuleName) {
        this.busiRuleName = busiRuleName;
    }

    /**
     * 获取 业务规则名称
     */
    public java.lang.String getBusiRuleName() {
        return this.busiRuleName;
    }

    /**
     * 设置 业务规则描述
     */
    public void setBusiRuleDesc(java.lang.String busiRuleDesc) {
        this.busiRuleDesc = busiRuleDesc;
    }

    /**
     * 获取 业务规则描述
     */
    public java.lang.String getBusiRuleDesc() {
        return this.busiRuleDesc;
    }

    /**
     * 设置 000 - 数据驱动类规则,100 - JAVA插件类规则,101 - SQL插件类规则,102 - 存储过程插件类规则,103 - JS插件类规则,201 - 自定义动态类规则,202 - 引擎
     */
    public void setRuleType(java.lang.String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * 获取 000 - 数据驱动类规则,100 - JAVA插件类规则,101 - SQL插件类规则,102 - 存储过程插件类规则,103 - JS插件类规则,201 - 自定义动态类规则,202 - 引擎
     */
    public java.lang.String getRuleType() {
        return this.ruleType;
    }

    /**
     * 设置 对于每种类型的规则，可以通过该字段定义相关的规则数据，例如：对于存储过程类规则， 该字段定义了相应的存储过程名字；对于JAVA类规则和数据驱动类规
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    /**
     * 获取 对于每种类型的规则，可以通过该字段定义相关的规则数据，例如：对于存储过程类规则， 该字段定义了相应的存储过程名字；对于JAVA类规则和数据驱动类规
     */
    public java.lang.String getData() {
        return this.data;
    }

    /**
     * 设置 状态
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态
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
     * 设置 记录修改的员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录修改的员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
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
     * 设置 管控级别：1省级，2地市级
     */
    public void setManageLevelCd(java.lang.String manageLevelCd) {
        this.manageLevelCd = manageLevelCd;
    }

    /**
     * 获取 管控级别：1省级，2地市级
     */
    public java.lang.String getManageLevelCd() {
        return this.manageLevelCd;
    }

    /**
     * 设置 PPM规则编号
     */
    public void setPpmRuleId(java.lang.Long ppmRuleId) {
        this.ppmRuleId = ppmRuleId;
    }

    /**
     * 获取 PPM规则编号
     */
    public java.lang.Long getPpmRuleId() {
        return this.ppmRuleId;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 0,一般性规则;1,查询数据库类规则,用于二次检测不满足规则条件时,关闭弹出页
     */
    public void setRuleQueryType(java.lang.Long ruleQueryType) {
        this.ruleQueryType = ruleQueryType;
    }

    /**
     * 获取 0,一般性规则;1,查询数据库类规则,用于二次检测不满足规则条件时,关闭弹出页
     */
    public java.lang.Long getRuleQueryType() {
        return this.ruleQueryType;
    }

    /**
     * 设置 规则表达式
     */
    public void setBusiRuleExp(java.lang.String busiRuleExp) {
        this.busiRuleExp = busiRuleExp;
    }

    /**
     * 获取 规则表达式
     */
    public java.lang.String getBusiRuleExp() {
        return this.busiRuleExp;
    }

    /**
     * 设置 适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
