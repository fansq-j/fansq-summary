package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:两级接口协议表
 * @实体表  :CPC_SERVICE_T
 */
public class CpcServiceTDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CPC_SERVICE_T_S";

    /**
     * 接口协议编码
     */
    public java.lang.String serviceCode;

    /**
     * 接口名称
     */
    public java.lang.String serviceName;

    /**
     * 对应cpc_kind_t接口类型表
     */
    public java.lang.String kindId;

    /**
     * 1:代表soo协议;0:非soo协议
     */
    public java.lang.Integer sooFlag;

    /**
     * 1:crm1;2:crm2;3:crm3
     */
    public java.lang.Integer appFlag;

    /**
     * 应用平台处理类
     */
    public java.lang.String appHandle;

    /**
     * 接口入参样例
     */
    public java.lang.String inParam;

    /**
     * 接口出参样例
     */
    public java.lang.String outParam;

    /**
     * 接口出参失败样例
     */
    public java.lang.String outFallParam;

    /**
     * 备注
     */
    public java.lang.String note;

    /**
     * 设置 接口协议编码
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * 获取 接口协议编码
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
     * 设置 接口名称
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取 接口名称
     */
    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    /**
     * 设置 对应cpc_kind_t接口类型表
     */
    public void setKindId(java.lang.String kindId) {
        this.kindId = kindId;
    }

    /**
     * 获取 对应cpc_kind_t接口类型表
     */
    public java.lang.String getKindId() {
        return this.kindId;
    }

    /**
     * 设置 1:代表soo协议;0:非soo协议
     */
    public void setSooFlag(java.lang.Integer sooFlag) {
        this.sooFlag = sooFlag;
    }

    /**
     * 获取 1:代表soo协议;0:非soo协议
     */
    public java.lang.Integer getSooFlag() {
        return this.sooFlag;
    }

    /**
     * 设置 1:crm1;2:crm2;3:crm3
     */
    public void setAppFlag(java.lang.Integer appFlag) {
        this.appFlag = appFlag;
    }

    /**
     * 获取 1:crm1;2:crm2;3:crm3
     */
    public java.lang.Integer getAppFlag() {
        return this.appFlag;
    }

    /**
     * 设置 应用平台处理类
     */
    public void setAppHandle(java.lang.String appHandle) {
        this.appHandle = appHandle;
    }

    /**
     * 获取 应用平台处理类
     */
    public java.lang.String getAppHandle() {
        return this.appHandle;
    }

    /**
     * 设置 接口入参样例
     */
    public void setInParam(java.lang.String inParam) {
        this.inParam = inParam;
    }

    /**
     * 获取 接口入参样例
     */
    public java.lang.String getInParam() {
        return this.inParam;
    }

    /**
     * 设置 接口出参样例
     */
    public void setOutParam(java.lang.String outParam) {
        this.outParam = outParam;
    }

    /**
     * 获取 接口出参样例
     */
    public java.lang.String getOutParam() {
        return this.outParam;
    }

    /**
     * 设置 接口出参失败样例
     */
    public void setOutFallParam(java.lang.String outFallParam) {
        this.outFallParam = outFallParam;
    }

    /**
     * 获取 接口出参失败样例
     */
    public java.lang.String getOutFallParam() {
        return this.outFallParam;
    }

    /**
     * 设置 备注
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getNote() {
        return this.note;
    }

}
