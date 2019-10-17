package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :TEST_NAME
 */
public class TestNameDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "TEST_NAME_S";

    /**
     * 
     */
    public java.lang.Integer id;

    /**
     * 
     */
    public java.lang.String name;

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
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * 获取 
     */
    public java.lang.String getName() {
        return this.name;
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
