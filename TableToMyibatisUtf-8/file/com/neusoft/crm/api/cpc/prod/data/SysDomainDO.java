package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录业务大类归属分域的名称。
 * @实体表  :SYS_DOMAIN
 */
public class SysDomainDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SYS_DOMAIN_S";

    /**
     * 记录主题域主键
     */
    public java.lang.Long domainId;

    /**
     * 记录父级主题域标识
     */
    public java.lang.Long parDomainId;

    /**
     * 记录主题域名称
     */
    public java.lang.String domainName;

    /**
     * 记录主题域编码
     */
    public java.lang.String domainNbr;

    /**
     * 记录主题域描述
     */
    public java.lang.String domainDesc;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录主题域主键
     */
    public void setDomainId(java.lang.Long domainId) {
        this.domainId = domainId;
    }

    /**
     * 获取 记录主题域主键
     */
    public java.lang.Long getDomainId() {
        return this.domainId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.domainId = SeqUtils.createLongId(ID_SEQ);
         return this.domainId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录父级主题域标识
     */
    public void setParDomainId(java.lang.Long parDomainId) {
        this.parDomainId = parDomainId;
    }

    /**
     * 获取 记录父级主题域标识
     */
    public java.lang.Long getParDomainId() {
        return this.parDomainId;
    }

    /**
     * 设置 记录主题域名称
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }

    /**
     * 获取 记录主题域名称
     */
    public java.lang.String getDomainName() {
        return this.domainName;
    }

    /**
     * 设置 记录主题域编码
     */
    public void setDomainNbr(java.lang.String domainNbr) {
        this.domainNbr = domainNbr;
    }

    /**
     * 获取 记录主题域编码
     */
    public java.lang.String getDomainNbr() {
        return this.domainNbr;
    }

    /**
     * 设置 记录主题域描述
     */
    public void setDomainDesc(java.lang.String domainDesc) {
        this.domainDesc = domainDesc;
    }

    /**
     * 获取 记录主题域描述
     */
    public java.lang.String getDomainDesc() {
        return this.domainDesc;
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
     * 设置 记录创建的员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
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
     * 设置 记录修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
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
