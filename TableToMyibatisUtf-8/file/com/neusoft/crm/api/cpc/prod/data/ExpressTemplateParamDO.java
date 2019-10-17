package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录表达式模板可以使用的变量参数信息，规范表达式的配置。
 * @实体表  :EXPRESS_TEMPLATE_PARAM
 */
public class ExpressTemplateParamDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EXPRESS_TEMPLATE_PARAM_S";

    /**
     * 记录参数主键
     */
    public java.lang.Integer paramId;

    /**
     * 记录表达式模板标识
     */
    public java.lang.Long expressTemplateId;

    /**
     * 记录参数编码，程序解析时使用，例如 {$1011}表示客户名称
     */
    public java.lang.String paramCode;

    /**
     * 记录参数名称
     */
    public java.lang.String paramName;

    /**
     * 记录参数描述
     */
    public java.lang.String paramDesc;

    /**
     * 记录计算方法。
            100 - JAVA插件计算。
            101 - SQL计算。
            102 - 存储过程计算。
            103 - JS计算。
            201 - 程序固化的变量。
     */
    public java.lang.String calcType;

    /**
     * 对于每种类型的变量，通过该字段定义相关的计算公式，例如：
            对于存储过程类规则， 该字段定义了相应的存储过程名字；
            对于JAVA类规则和数据驱动类规则，该字段定义了相应的java类路径；
            对于SQL脚本类规则，该字段定义了相应的SQL语句；
            对于JS脚本类规则，该字段定义了JS脚本函数的URL；
            对于程序固化解析的变量，该字段为空
     */
    public java.lang.String data;

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
     * 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录参数主键
     */
    public void setParamId(java.lang.Integer paramId) {
        this.paramId = paramId;
    }

    /**
     * 获取 记录参数主键
     */
    public java.lang.Integer getParamId() {
        return this.paramId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.paramId = SeqUtils.createIntegerId(ID_SEQ);
         return this.paramId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 记录表达式模板标识
     */
    public void setExpressTemplateId(java.lang.Long expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    /**
     * 获取 记录表达式模板标识
     */
    public java.lang.Long getExpressTemplateId() {
        return this.expressTemplateId;
    }

    /**
     * 设置 记录参数编码，程序解析时使用，例如 {$1011}表示客户名称
     */
    public void setParamCode(java.lang.String paramCode) {
        this.paramCode = paramCode;
    }

    /**
     * 获取 记录参数编码，程序解析时使用，例如 {$1011}表示客户名称
     */
    public java.lang.String getParamCode() {
        return this.paramCode;
    }

    /**
     * 设置 记录参数名称
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }

    /**
     * 获取 记录参数名称
     */
    public java.lang.String getParamName() {
        return this.paramName;
    }

    /**
     * 设置 记录参数描述
     */
    public void setParamDesc(java.lang.String paramDesc) {
        this.paramDesc = paramDesc;
    }

    /**
     * 获取 记录参数描述
     */
    public java.lang.String getParamDesc() {
        return this.paramDesc;
    }

    /**
     * 设置 记录计算方法。
            100 - JAVA插件计算。
            101 - SQL计算。
            102 - 存储过程计算。
            103 - JS计算。
            201 - 程序固化的变量。
     */
    public void setCalcType(java.lang.String calcType) {
        this.calcType = calcType;
    }

    /**
     * 获取 记录计算方法。
            100 - JAVA插件计算。
            101 - SQL计算。
            102 - 存储过程计算。
            103 - JS计算。
            201 - 程序固化的变量。
     */
    public java.lang.String getCalcType() {
        return this.calcType;
    }

    /**
     * 设置 对于每种类型的变量，通过该字段定义相关的计算公式，例如：
            对于存储过程类规则， 该字段定义了相应的存储过程名字；
            对于JAVA类规则和数据驱动类规则，该字段定义了相应的java类路径；
            对于SQL脚本类规则，该字段定义了相应的SQL语句；
            对于JS脚本类规则，该字段定义了JS脚本函数的URL；
            对于程序固化解析的变量，该字段为空
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    /**
     * 获取 对于每种类型的变量，通过该字段定义相关的计算公式，例如：
            对于存储过程类规则， 该字段定义了相应的存储过程名字；
            对于JAVA类规则和数据驱动类规则，该字段定义了相应的java类路径；
            对于SQL脚本类规则，该字段定义了相应的SQL语句；
            对于JS脚本类规则，该字段定义了JS脚本函数的URL；
            对于程序固化解析的变量，该字段为空
     */
    public java.lang.String getData() {
        return this.data;
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
