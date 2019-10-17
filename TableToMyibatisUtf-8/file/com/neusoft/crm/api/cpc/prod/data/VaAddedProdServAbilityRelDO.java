package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录增值产品拥有的业务能力
 * @实体表  :VA_ADDED_PROD_SERV_ABILITY_REL
 */
public class VaAddedProdServAbilityRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "VA_ADDED_PROD_SERV_ABILITY_REL_S";

    /**
     * 关系的主键。
     */
    public java.lang.Long vaProdServiceAbilityRelId;

    /**
     * 业务能力的主键。
     */
    public java.lang.Long serviceAbilityId;

    /**
     * 增值产品的主键。
     */
    public java.lang.Long vaProdId;

    /**
     * 关系类型。LOVB=PRD-C-0011
     */
    public java.lang.String relType;

    /**
     * 记录关系的适合区域。
     */
    public java.lang.Long applyRegionId;

    /**
     * 状态.LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 关系的主键。
     */
    public void setVaProdServiceAbilityRelId(java.lang.Long vaProdServiceAbilityRelId) {
        this.vaProdServiceAbilityRelId = vaProdServiceAbilityRelId;
    }

    /**
     * 获取 关系的主键。
     */
    public java.lang.Long getVaProdServiceAbilityRelId() {
        return this.vaProdServiceAbilityRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.vaProdServiceAbilityRelId = SeqUtils.createLongId(ID_SEQ);
         return this.vaProdServiceAbilityRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 业务能力的主键。
     */
    public void setServiceAbilityId(java.lang.Long serviceAbilityId) {
        this.serviceAbilityId = serviceAbilityId;
    }

    /**
     * 获取 业务能力的主键。
     */
    public java.lang.Long getServiceAbilityId() {
        return this.serviceAbilityId;
    }

    /**
     * 设置 增值产品的主键。
     */
    public void setVaProdId(java.lang.Long vaProdId) {
        this.vaProdId = vaProdId;
    }

    /**
     * 获取 增值产品的主键。
     */
    public java.lang.Long getVaProdId() {
        return this.vaProdId;
    }

    /**
     * 设置 关系类型。LOVB=PRD-C-0011
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 关系类型。LOVB=PRD-C-0011
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 记录关系的适合区域。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录关系的适合区域。
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
    }

    /**
     * 设置 状态.LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建的员工。
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建的员工。
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改的员工。
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改的员工。
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建的时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建的时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态变更的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态变更的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改的时间。
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改的时间。
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 记录备注信息
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注信息
     */
    public java.lang.String getRemark() {
        return this.remark;
    }

}
