package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述协议模板的规格化条款以及相关的协议管理规则。协议条款模板分“业务条款”和“文本条款”两类，业务条款构成对象包括产品、
 * @实体表  :AGREE_ITEM_TMP
 */
public class AgreeItemTmpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_ITEM_TMP_S";

    /**
     * 协议条款模板标识
     */
    public java.lang.Long agreeItemTmpId;

    /**
     * 协议条款模板编码
     */
    public java.lang.String agreeItemTmpNbr;

    /**
     * 协议条款模板名称
     */
    public java.lang.String agreeItemTmpName;

    /**
     * 协议条款模版的类型，LOVB=ARG-C-0004
     */
    public java.lang.String agreeItemTmpType;

    /**
     * 记录项描述
     */
    public java.lang.String agreeItemTmpDesc;

    /**
     * 记录生效时间
     */
    public java.util.Date effDate;

    /**
     * 记录失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录管理区域标识
     */
    public java.lang.Long manageRegionId;

    /**
     * 协议条款模板状态，LOVB=ARG-C-0005
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

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
     * 设置 协议条款模板标识
     */
    public void setAgreeItemTmpId(java.lang.Long agreeItemTmpId) {
        this.agreeItemTmpId = agreeItemTmpId;
    }

    /**
     * 获取 协议条款模板标识
     */
    public java.lang.Long getAgreeItemTmpId() {
        return this.agreeItemTmpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.agreeItemTmpId = SeqUtils.createLongId(ID_SEQ);
         return this.agreeItemTmpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议条款模板编码
     */
    public void setAgreeItemTmpNbr(java.lang.String agreeItemTmpNbr) {
        this.agreeItemTmpNbr = agreeItemTmpNbr;
    }

    /**
     * 获取 协议条款模板编码
     */
    public java.lang.String getAgreeItemTmpNbr() {
        return this.agreeItemTmpNbr;
    }

    /**
     * 设置 协议条款模板名称
     */
    public void setAgreeItemTmpName(java.lang.String agreeItemTmpName) {
        this.agreeItemTmpName = agreeItemTmpName;
    }

    /**
     * 获取 协议条款模板名称
     */
    public java.lang.String getAgreeItemTmpName() {
        return this.agreeItemTmpName;
    }

    /**
     * 设置 协议条款模版的类型，LOVB=ARG-C-0004
     */
    public void setAgreeItemTmpType(java.lang.String agreeItemTmpType) {
        this.agreeItemTmpType = agreeItemTmpType;
    }

    /**
     * 获取 协议条款模版的类型，LOVB=ARG-C-0004
     */
    public java.lang.String getAgreeItemTmpType() {
        return this.agreeItemTmpType;
    }

    /**
     * 设置 记录项描述
     */
    public void setAgreeItemTmpDesc(java.lang.String agreeItemTmpDesc) {
        this.agreeItemTmpDesc = agreeItemTmpDesc;
    }

    /**
     * 获取 记录项描述
     */
    public java.lang.String getAgreeItemTmpDesc() {
        return this.agreeItemTmpDesc;
    }

    /**
     * 设置 记录生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录适用区域标识
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录管理区域标识
     */
    public void setManageRegionId(java.lang.Long manageRegionId) {
        this.manageRegionId = manageRegionId;
    }

    /**
     * 获取 记录管理区域标识
     */
    public java.lang.Long getManageRegionId() {
        return this.manageRegionId;
    }

    /**
     * 设置 协议条款模板状态，LOVB=ARG-C-0005
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 协议条款模板状态，LOVB=ARG-C-0005
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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

}
