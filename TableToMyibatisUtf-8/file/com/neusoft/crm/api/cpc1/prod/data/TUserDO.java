package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :T_USER
 */
public class TUserDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "T_USER_S";

    /**
     * 
     */
    public java.lang.Integer uid;

    /**
     * 
     */
    public java.lang.String uname;

    /**
     * 
     */
    public java.lang.String upwd;

    /**
     * 
     */
    public java.lang.String umessage;

    /**
     * 
     */
    public java.util.Date utime;

    /**
     * 设置 
     */
    public void setUid(java.lang.Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getUid() {
        return this.uid;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.uid = SeqUtils.createIntegerId(ID_SEQ);
         return this.uid;
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
    public void setUname(java.lang.String uname) {
        this.uname = uname;
    }

    /**
     * 获取 
     */
    public java.lang.String getUname() {
        return this.uname;
    }

    /**
     * 设置 
     */
    public void setUpwd(java.lang.String upwd) {
        this.upwd = upwd;
    }

    /**
     * 获取 
     */
    public java.lang.String getUpwd() {
        return this.upwd;
    }

    /**
     * 设置 
     */
    public void setUmessage(java.lang.String umessage) {
        this.umessage = umessage;
    }

    /**
     * 获取 
     */
    public java.lang.String getUmessage() {
        return this.umessage;
    }

    /**
     * 设置 
     */
    public void setUtime(java.util.Date utime) {
        this.utime = utime;
    }

    /**
     * 获取 
     */
    public java.util.Date getUtime() {
        return this.utime;
    }

}
