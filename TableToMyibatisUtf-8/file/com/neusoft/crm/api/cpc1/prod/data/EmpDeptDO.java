package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:
 * @实体表  :EMP_DEPT
 */
public class EmpDeptDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "EMP_DEPT_S";

    /**
     * 
     */
    public java.lang.Integer pid;

    /**
     * 
     */
    public java.lang.String deptname;

    /**
     * 
     */
    public java.lang.String empname;

    /**
     * 
     */
    public java.lang.String email;

    /**
     * 
     */
    public java.lang.String workplace;

    /**
     * 
     */
    public java.lang.String password;

    /**
     * 设置 
     */
    public void setPid(java.lang.Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取 
     */
    public java.lang.Integer getPid() {
        return this.pid;
    }

    /**
     * 设置 
     */
    public void setDeptname(java.lang.String deptname) {
        this.deptname = deptname;
    }

    /**
     * 获取 
     */
    public java.lang.String getDeptname() {
        return this.deptname;
    }

    /**
     * 设置 
     */
    public void setEmpname(java.lang.String empname) {
        this.empname = empname;
    }

    /**
     * 获取 
     */
    public java.lang.String getEmpname() {
        return this.empname;
    }

    /**
     * 设置 
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    /**
     * 获取 
     */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
     * 设置 
     */
    public void setWorkplace(java.lang.String workplace) {
        this.workplace = workplace;
    }

    /**
     * 获取 
     */
    public java.lang.String getWorkplace() {
        return this.workplace;
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

}
