package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:接口分发表
 * @实体表  :CPC_SCENE_CONFIG_T
 */
public class CpcSceneConfigTDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CPC_SCENE_CONFIG_T_S";

    /**
     * 接口协议编码
     */
    public java.lang.String serviceCode;

    /**
     * 处理类
     */
    public java.lang.String boCode;

    /**
     * 方法名
     */
    public java.lang.String methodCode;

    /**
     * 是否有效  0.无效   1.有效
     */
    public java.lang.Integer ifValid;

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
     * 设置 处理类
     */
    public void setBoCode(java.lang.String boCode) {
        this.boCode = boCode;
    }

    /**
     * 获取 处理类
     */
    public java.lang.String getBoCode() {
        return this.boCode;
    }

    /**
     * 设置 方法名
     */
    public void setMethodCode(java.lang.String methodCode) {
        this.methodCode = methodCode;
    }

    /**
     * 获取 方法名
     */
    public java.lang.String getMethodCode() {
        return this.methodCode;
    }

    /**
     * 设置 是否有效  0.无效   1.有效
     */
    public void setIfValid(java.lang.Integer ifValid) {
        this.ifValid = ifValid;
    }

    /**
     * 获取 是否有效  0.无效   1.有效
     */
    public java.lang.Integer getIfValid() {
        return this.ifValid;
    }

}
