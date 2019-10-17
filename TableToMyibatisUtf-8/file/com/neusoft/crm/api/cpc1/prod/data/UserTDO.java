package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :USER_T
 */
public class UserTDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "USER_T_S";

    /**
     * 
     */
    public java.lang.Integer id;

    /**
     * 
     */
    public java.lang.String userName;

    /**
     * 
     */
    public java.lang.String password;

    /**
     * 
     */
    public java.lang.Integer age;

    /**
     * 设置 
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.id = SeqUtils.createIntegerId(ID_SEQ);
         return this.id;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    /**
     * 获取 
     */
    public java.lang.String getUserName() {
        return this.userName;
    }

    /**
     * 设置 
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * 获取 
     */
    public java.lang.String getPassword() {
        return this.password;
    }

    /**
     * 设置 
     */
    public void setAge(java.lang.Integer age) {
        this.age = age;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getAge() {
        return this.age;
    }

}
