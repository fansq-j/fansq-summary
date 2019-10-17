package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:指对系统对象的抽象表达，如产品、客户、组织等。
 * @实体表  :BUSI_TYPE
 */
public class BusiTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "BUSI_TYPE_S";

    /**
     * 记录业务大类主键
     */
    public java.lang.Long busiTypeId;

    /**
     * 记录主题域主键
     */
    public java.lang.Long domainId;

    /**
     * 记录业务大类名称
     */
    public java.lang.String busiTypeName;

    /**
     * 记录业务大类编码
     */
    public java.lang.String busiTypeNbr;

    /**
     * 记录业务大类描述
     */
    public java.lang.String busiTypeDesc;

    /**
     * 记录状态修改的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的时间
     */
    public java.util.Date createDate;

    /**
     * 状态。LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录的创建员工
     */
    public java.lang.Long createStaff;

    /**
     * 记录的修改员工
     */
    public java.lang.Long updateStaff;

    /**
     * 记录的修改时间
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录业务大类主键
     */
    public void setBusiTypeId(java.lang.Long busiTypeId) {
        this.busiTypeId = busiTypeId;
    }

    /**
     * 获取 记录业务大类主键
     */
    public java.lang.Long getBusiTypeId() {
        return this.busiTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.busiTypeId = SeqUtils.createLongId(ID_SEQ);
         return this.busiTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

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
     * 设置 记录业务大类名称
     */
    public void setBusiTypeName(java.lang.String busiTypeName) {
        this.busiTypeName = busiTypeName;
    }

    /**
     * 获取 记录业务大类名称
     */
    public java.lang.String getBusiTypeName() {
        return this.busiTypeName;
    }

    /**
     * 设置 记录业务大类编码
     */
    public void setBusiTypeNbr(java.lang.String busiTypeNbr) {
        this.busiTypeNbr = busiTypeNbr;
    }

    /**
     * 获取 记录业务大类编码
     */
    public java.lang.String getBusiTypeNbr() {
        return this.busiTypeNbr;
    }

    /**
     * 设置 记录业务大类描述
     */
    public void setBusiTypeDesc(java.lang.String busiTypeDesc) {
        this.busiTypeDesc = busiTypeDesc;
    }

    /**
     * 获取 记录业务大类描述
     */
    public java.lang.String getBusiTypeDesc() {
        return this.busiTypeDesc;
    }

    /**
     * 设置 记录状态修改的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态修改的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录的创建员工
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录的创建员工
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录的修改员工
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录的修改员工
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录的修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录的修改时间
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
