package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:规则,在一定的业务场景中（例如新建客户、订单录入、产品管理等）被触发，并通过管理和控制业务场景
 * @实体表  :RULE
 */
public class RuleDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "RULE_S";

    /**
     * 用于唯一标识规则的内部编号
     */
    public java.lang.Long ruleId;

    /**
     * 规则的名称
     */
    public java.lang.String ruleName;

    /**
     * 规则的描述
     */
    public java.lang.String comments;

    /**
     * 000 - 数据驱动类规则,100 - JAVA插件类规则,101 - SQL插件类规则,102 - 存储过程插件类规则,103 - JS插件类规则,201 - 自定义动态类规则,202 - 引擎类规则 ,999 - 组合规则
     */
    public java.lang.String ruleType;

    /**
     * 对于每种类型的规则，可以通过该字段定义相关的规则数据，例如：对于存储过程类规则， 该字段定义了相应的存储过程名字；对于JAVA类规则和数据驱动类规则，该字段定义了相应的java类路径；对于SQL脚本类规则，该字段定义了相应的SQL语句；对于JS脚本类规则，该字段定义了JS脚本函数的URL；对于引擎类规则，该字段定义了规则引擎的入口，例如ILOG的规则流程ID；对于动态了规则，该字段为空
     */
    public java.lang.String data;

    /**
     * 管控级别：1省级，2地市级
     */
    public java.lang.String manageLevelCd;

    /**
     * PPM规则编号
     */
    public java.lang.Long ppmRuleId;

    /**
     * 0,一般性规则;1,查询数据库类规则,用于二次检测不满足规则条件时,关闭弹出页
     */
    public java.lang.Integer ruleQueryType;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 状态
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 用于唯一标识规则的内部编号
     */
    public void setRuleId(java.lang.Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取 用于唯一标识规则的内部编号
     */
    public java.lang.Long getRuleId() {
        return this.ruleId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.ruleId = SeqUtils.createLongId(ID_SEQ);
         return this.ruleId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 规则的名称
     */
    public void setRuleName(java.lang.String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 获取 规则的名称
     */
    public java.lang.String getRuleName() {
        return this.ruleName;
    }

    /**
     * 设置 规则的描述
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * 获取 规则的描述
     */
    public java.lang.String getComments() {
        return this.comments;
    }

    /**
     * 设置 000 - 数据驱动类规则,100 - JAVA插件类规则,101 - SQL插件类规则,102 - 存储过程插件类规则,103 - JS插件类规则,201 - 自定义动态类规则,202 - 引擎类规则 ,999 - 组合规则
     */
    public void setRuleType(java.lang.String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * 获取 000 - 数据驱动类规则,100 - JAVA插件类规则,101 - SQL插件类规则,102 - 存储过程插件类规则,103 - JS插件类规则,201 - 自定义动态类规则,202 - 引擎类规则 ,999 - 组合规则
     */
    public java.lang.String getRuleType() {
        return this.ruleType;
    }

    /**
     * 设置 对于每种类型的规则，可以通过该字段定义相关的规则数据，例如：对于存储过程类规则， 该字段定义了相应的存储过程名字；对于JAVA类规则和数据驱动类规则，该字段定义了相应的java类路径；对于SQL脚本类规则，该字段定义了相应的SQL语句；对于JS脚本类规则，该字段定义了JS脚本函数的URL；对于引擎类规则，该字段定义了规则引擎的入口，例如ILOG的规则流程ID；对于动态了规则，该字段为空
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    /**
     * 获取 对于每种类型的规则，可以通过该字段定义相关的规则数据，例如：对于存储过程类规则， 该字段定义了相应的存储过程名字；对于JAVA类规则和数据驱动类规则，该字段定义了相应的java类路径；对于SQL脚本类规则，该字段定义了相应的SQL语句；对于JS脚本类规则，该字段定义了JS脚本函数的URL；对于引擎类规则，该字段定义了规则引擎的入口，例如ILOG的规则流程ID；对于动态了规则，该字段为空
     */
    public java.lang.String getData() {
        return this.data;
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
     * 设置 0,一般性规则;1,查询数据库类规则,用于二次检测不满足规则条件时,关闭弹出页
     */
    public void setRuleQueryType(java.lang.Integer ruleQueryType) {
        this.ruleQueryType = ruleQueryType;
    }

    /**
     * 获取 0,一般性规则;1,查询数据库类规则,用于二次检测不满足规则条件时,关闭弹出页
     */
    public java.lang.Integer getRuleQueryType() {
        return this.ruleQueryType;
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
