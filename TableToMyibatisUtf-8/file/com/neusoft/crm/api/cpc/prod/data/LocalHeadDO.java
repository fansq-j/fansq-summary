package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述号码头信息，包括固话号码头、移动号码头等信息。
特殊号头SPECIAL_HEAD也合到一起，用号头类型区
 * @实体表  :LOCAL_HEAD
 */
public class LocalHeadDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "LOCAL_HEAD_S";

    /**
     * 号头标识
     */
    public java.lang.Integer headId;

    /**
     * HLR标识
     */
    public java.lang.Integer hlrId;

    /**
     * 号头
     */
    public java.lang.String head;

    /**
     * 表达不同的号头类型，LOVB=RES-C-0021
     */
    public java.lang.String headType;

    /**
     * 运营商的唯一标识。从EMULATORY_PARTNER_ID修改为PARTY_ROLE_ID，与MIN段实体中的运营商标识一致
     */
    public java.lang.Integer partnerId;

    /**
     * 生效时间
     */
    public java.util.Date effDate;

    /**
     * 失效时间
     */
    public java.util.Date expDate;

    /**
     * 记录适用区域标识。
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录生成号码的长度
     */
    public java.lang.Integer headLen;

    /**
     * 记录号码字头创建的依据
     */
    public java.lang.String createOrderNum;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录号码头状态。LOVB=RES-C-0020
     */
    public java.lang.String statusCd;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 设置 号头标识
     */
    public void setHeadId(java.lang.Integer headId) {
        this.headId = headId;
    }

    /**
     * 获取 号头标识
     */
    public java.lang.Integer getHeadId() {
        return this.headId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.headId = SeqUtils.createIntegerId(ID_SEQ);
         return this.headId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 HLR标识
     */
    public void setHlrId(java.lang.Integer hlrId) {
        this.hlrId = hlrId;
    }

    /**
     * 获取 HLR标识
     */
    public java.lang.Integer getHlrId() {
        return this.hlrId;
    }

    /**
     * 设置 号头
     */
    public void setHead(java.lang.String head) {
        this.head = head;
    }

    /**
     * 获取 号头
     */
    public java.lang.String getHead() {
        return this.head;
    }

    /**
     * 设置 表达不同的号头类型，LOVB=RES-C-0021
     */
    public void setHeadType(java.lang.String headType) {
        this.headType = headType;
    }

    /**
     * 获取 表达不同的号头类型，LOVB=RES-C-0021
     */
    public java.lang.String getHeadType() {
        return this.headType;
    }

    /**
     * 设置 运营商的唯一标识。从EMULATORY_PARTNER_ID修改为PARTY_ROLE_ID，与MIN段实体中的运营商标识一致
     */
    public void setPartnerId(java.lang.Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取 运营商的唯一标识。从EMULATORY_PARTNER_ID修改为PARTY_ROLE_ID，与MIN段实体中的运营商标识一致
     */
    public java.lang.Integer getPartnerId() {
        return this.partnerId;
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
     * 设置 记录适用区域标识。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用区域标识。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 记录生成号码的长度
     */
    public void setHeadLen(java.lang.Integer headLen) {
        this.headLen = headLen;
    }

    /**
     * 获取 记录生成号码的长度
     */
    public java.lang.Integer getHeadLen() {
        return this.headLen;
    }

    /**
     * 设置 记录号码字头创建的依据
     */
    public void setCreateOrderNum(java.lang.String createOrderNum) {
        this.createOrderNum = createOrderNum;
    }

    /**
     * 获取 记录号码字头创建的依据
     */
    public java.lang.String getCreateOrderNum() {
        return this.createOrderNum;
    }

    /**
     * 设置 备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 备注
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 设置 记录状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录号码头状态。LOVB=RES-C-0020
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录号码头状态。LOVB=RES-C-0020
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录首次创建的员工标识。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
