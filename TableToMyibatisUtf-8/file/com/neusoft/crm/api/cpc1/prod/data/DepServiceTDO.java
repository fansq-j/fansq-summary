package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :DEP_SERVICE_T
 */
public class DepServiceTDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEP_SERVICE_T_S";

    /**
     * 服务编码(对应规范中的能力编码)
     */
    public java.lang.String serviceCode;

    /**
     * 服务名称(对应于规范中的能力名称)
     */
    public java.lang.String serviceName;

    /**
     * 服务类型，Q:查询单，M:正式单(受理类)，C:校验单
     */
    public java.lang.String serviceType;

    /**
     * 业务处理Bean的id
     */
    public java.lang.String boCode;

    /**
     * 业务处理bean的具体方法
     */
    public java.lang.String methodName;

    /**
     * 方法形参对应类的完整路径
     */
    public java.lang.String paramClass;

    /**
     * 服务提供方(具体的各个中心名称，先按照样例报文写)
     */
    public java.lang.String serviceProvider;

    /**
     * 每个能力都归属于一个服务，这里指能力编码对应的上层服务编码。
     */
    public java.lang.String upServiceCode;

    /**
     * 是否记录接口访问历史,0:不记录,1:记录
     */
    public java.lang.Integer ifHisLog;

    /**
     * 是否记录入参报文,0:不记录,1:记录
     */
    public java.lang.Integer ifInLog;

    /**
     * 是否记录出参报文,0:不记录,1:记录
     */
    public java.lang.Integer ifOutLog;

    /**
     * 是否需要调用集团CRM-4G提供的能力开放接口，0：不调用 1:调用
     */
    public java.lang.Integer ifCallGrp;

    /**
     * 调用集团CRM-4G提供的能力开放接口是否记录日志，0：记录，1：不记录
     */
    public java.lang.Integer ifGrpLog;

    /**
     * 是否有效,0：无效，1：有效
     */
    public java.lang.Integer ifValid;

    /**
     * 开发人员
     */
    public java.lang.String developer;

    /**
     * 接口创建时间
     */
    public java.util.Date createTime;

    /**
     * 
     */
    public java.lang.Integer ifHisRel;

    /**
     * 设置 服务编码(对应规范中的能力编码)
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * 获取 服务编码(对应规范中的能力编码)
     */
    public java.lang.String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.String doCreateId(){
         this.serviceCode = SeqUtils.createStrId(ID_SEQ);
         return this.serviceCode;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.String createId(){
    	  return SeqUtils.createStrId(ID_SEQ);
    }

    /**
     * 设置 服务名称(对应于规范中的能力名称)
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取 服务名称(对应于规范中的能力名称)
     */
    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    /**
     * 设置 服务类型，Q:查询单，M:正式单(受理类)，C:校验单
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 获取 服务类型，Q:查询单，M:正式单(受理类)，C:校验单
     */
    public java.lang.String getServiceType() {
        return this.serviceType;
    }

    /**
     * 设置 业务处理Bean的id
     */
    public void setBoCode(java.lang.String boCode) {
        this.boCode = boCode;
    }

    /**
     * 获取 业务处理Bean的id
     */
    public java.lang.String getBoCode() {
        return this.boCode;
    }

    /**
     * 设置 业务处理bean的具体方法
     */
    public void setMethodName(java.lang.String methodName) {
        this.methodName = methodName;
    }

    /**
     * 获取 业务处理bean的具体方法
     */
    public java.lang.String getMethodName() {
        return this.methodName;
    }

    /**
     * 设置 方法形参对应类的完整路径
     */
    public void setParamClass(java.lang.String paramClass) {
        this.paramClass = paramClass;
    }

    /**
     * 获取 方法形参对应类的完整路径
     */
    public java.lang.String getParamClass() {
        return this.paramClass;
    }

    /**
     * 设置 服务提供方(具体的各个中心名称，先按照样例报文写)
     */
    public void setServiceProvider(java.lang.String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    /**
     * 获取 服务提供方(具体的各个中心名称，先按照样例报文写)
     */
    public java.lang.String getServiceProvider() {
        return this.serviceProvider;
    }

    /**
     * 设置 每个能力都归属于一个服务，这里指能力编码对应的上层服务编码。
     */
    public void setUpServiceCode(java.lang.String upServiceCode) {
        this.upServiceCode = upServiceCode;
    }

    /**
     * 获取 每个能力都归属于一个服务，这里指能力编码对应的上层服务编码。
     */
    public java.lang.String getUpServiceCode() {
        return this.upServiceCode;
    }

    /**
     * 设置 是否记录接口访问历史,0:不记录,1:记录
     */
    public void setIfHisLog(java.lang.Integer ifHisLog) {
        this.ifHisLog = ifHisLog;
    }

    /**
     * 获取 是否记录接口访问历史,0:不记录,1:记录
     */
    public java.lang.Integer getIfHisLog() {
        return this.ifHisLog;
    }

    /**
     * 设置 是否记录入参报文,0:不记录,1:记录
     */
    public void setIfInLog(java.lang.Integer ifInLog) {
        this.ifInLog = ifInLog;
    }

    /**
     * 获取 是否记录入参报文,0:不记录,1:记录
     */
    public java.lang.Integer getIfInLog() {
        return this.ifInLog;
    }

    /**
     * 设置 是否记录出参报文,0:不记录,1:记录
     */
    public void setIfOutLog(java.lang.Integer ifOutLog) {
        this.ifOutLog = ifOutLog;
    }

    /**
     * 获取 是否记录出参报文,0:不记录,1:记录
     */
    public java.lang.Integer getIfOutLog() {
        return this.ifOutLog;
    }

    /**
     * 设置 是否需要调用集团CRM-4G提供的能力开放接口，0：不调用 1:调用
     */
    public void setIfCallGrp(java.lang.Integer ifCallGrp) {
        this.ifCallGrp = ifCallGrp;
    }

    /**
     * 获取 是否需要调用集团CRM-4G提供的能力开放接口，0：不调用 1:调用
     */
    public java.lang.Integer getIfCallGrp() {
        return this.ifCallGrp;
    }

    /**
     * 设置 调用集团CRM-4G提供的能力开放接口是否记录日志，0：记录，1：不记录
     */
    public void setIfGrpLog(java.lang.Integer ifGrpLog) {
        this.ifGrpLog = ifGrpLog;
    }

    /**
     * 获取 调用集团CRM-4G提供的能力开放接口是否记录日志，0：记录，1：不记录
     */
    public java.lang.Integer getIfGrpLog() {
        return this.ifGrpLog;
    }

    /**
     * 设置 是否有效,0：无效，1：有效
     */
    public void setIfValid(java.lang.Integer ifValid) {
        this.ifValid = ifValid;
    }

    /**
     * 获取 是否有效,0：无效，1：有效
     */
    public java.lang.Integer getIfValid() {
        return this.ifValid;
    }

    /**
     * 设置 开发人员
     */
    public void setDeveloper(java.lang.String developer) {
        this.developer = developer;
    }

    /**
     * 获取 开发人员
     */
    public java.lang.String getDeveloper() {
        return this.developer;
    }

    /**
     * 设置 接口创建时间
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 接口创建时间
     */
    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 
     */
    public void setIfHisRel(java.lang.Integer ifHisRel) {
        this.ifHisRel = ifHisRel;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getIfHisRel() {
        return this.ifHisRel;
    }

}
