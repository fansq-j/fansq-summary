package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录协议模版适用的中国电信公共管理区域
 * @实体表  :AGREE_TMP_REGION_REL
 */
public class AgreeTmpRegionRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_TMP_REGION_REL_S";

    /**
     * 主键
     */
    public java.lang.Long agreeTmpRegionRelId;

    /**
     * 协议模板主键
     */
    public java.lang.Long agreementTmpId;

    /**
     * 记录适用区域标识，指定公共管理区域
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 协议模板适用区域类型，LOVB=ARG-C-0007
            
     */
    public java.lang.String regionType;

    /**
     * 设置 主键
     */
    public void setAgreeTmpRegionRelId(java.lang.Long agreeTmpRegionRelId) {
        this.agreeTmpRegionRelId = agreeTmpRegionRelId;
    }

    /**
     * 获取 主键
     */
    public java.lang.Long getAgreeTmpRegionRelId() {
        return this.agreeTmpRegionRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeTmpRegionRelId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeTmpRegionRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议模板主键
     */
    public void setAgreementTmpId(java.lang.Long agreementTmpId) {
        this.agreementTmpId = agreementTmpId;
    }

    /**
     * 获取 协议模板主键
     */
    public java.lang.Long getAgreementTmpId() {
        return this.agreementTmpId;
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
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
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
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 协议模板适用区域类型，LOVB=ARG-C-0007
            
     */
    public void setRegionType(java.lang.String regionType) {
        this.regionType = regionType;
    }

    /**
     * 获取 协议模板适用区域类型，LOVB=ARG-C-0007
            
     */
    public java.lang.String getRegionType() {
        return this.regionType;
    }

}
