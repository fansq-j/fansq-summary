package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义销售品间的关系。
 * @实体表  :OFFER_REL
 */
public class OfferRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_REL_S";

    /**
     * 销售品关系主键
     */
    public java.lang.Long offerRelId;

    /**
     * A端销售品标识
     */
    public java.lang.Integer aOfferId;

    /**
     * Z端销售品标识
     */
    public java.lang.Integer zOfferId;

    /**
     * 角色标识
     */
    public java.lang.Long roleId;

    /**
     * 销售品关系类型。LOVB=OFF-0006
     */
    public java.lang.String relType;

    /**
     * 关联关系的生效时间。
     */
    public java.util.Date effDate;

    /**
     * 关联关系的失效时间。
     */
    public java.util.Date expDate;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 销售品关系的作用范围。LOVB=OFF-C-0065
     */
    public java.lang.String scope;

    /**
     * 设置 销售品关系主键
     */
    public void setOfferRelId(java.lang.Long offerRelId) {
        this.offerRelId = offerRelId;
    }

    /**
     * 获取 销售品关系主键
     */
    public java.lang.Long getOfferRelId() {
        return this.offerRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerRelId = SeqUtils.createLongId(ID_SEQ);
         return this.offerRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 A端销售品标识
     */
    public void setAOfferId(java.lang.Integer aOfferId) {
        this.aOfferId = aOfferId;
    }

    /**
     * 获取 A端销售品标识
     */
    public java.lang.Integer getAOfferId() {
        return this.aOfferId;
    }

    /**
     * 设置 Z端销售品标识
     */
    public void setZOfferId(java.lang.Integer zOfferId) {
        this.zOfferId = zOfferId;
    }

    /**
     * 获取 Z端销售品标识
     */
    public java.lang.Integer getZOfferId() {
        return this.zOfferId;
    }

    /**
     * 设置 角色标识
     */
    public void setRoleId(java.lang.Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色标识
     */
    public java.lang.Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 销售品关系类型。LOVB=OFF-0006
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 销售品关系类型。LOVB=OFF-0006
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 关联关系的生效时间。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 关联关系的生效时间。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 关联关系的失效时间。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 关联关系的失效时间。
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long getApplyRegionId() {
        return this.applyRegionId;
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
     * 设置 销售品关系的作用范围。LOVB=OFF-C-0065
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }

    /**
     * 获取 销售品关系的作用范围。LOVB=OFF-C-0065
     */
    public java.lang.String getScope() {
        return this.scope;
    }

}
