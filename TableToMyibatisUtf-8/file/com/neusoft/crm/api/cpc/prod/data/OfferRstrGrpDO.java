package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述销售品多个构成的同组类约束关系(如同客户关系、同账户关系关系等），使用的组的描述及定义。
 * @实体表  :OFFER_RSTR_GRP
 */
public class OfferRstrGrpDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "OFFER_RSTR_GRP_S";

    /**
     * 销售品构成约束组标识，主键。
     */
    public java.lang.Long offerRstrGrpId;

    /**
     * 约束对象类型，LOVB=OFF-C-0047
     */
    public java.lang.String rstrObjType;

    /**
     * 约束对象标识，如销售品标识、销售品关系标识
     */
    public java.lang.Long rstrObjId;

    /**
     * 约束类型； LOVB=OFF-C-0048
     */
    public java.lang.String rstrType;

    /**
     * 记录缺省值。
     */
    public java.util.Date effDate;

    /**
     * 记录最小值。
     */
    public java.util.Date expDate;

    /**
     * 记录适用的区域范围，来源COMMON_REGION_ID。
            
     */
    public java.lang.Long applyRegionId;

    /**
     * 状态。LOVB=PUB-C-0001。
            
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
     * 设置 销售品构成约束组标识，主键。
     */
    public void setOfferRstrGrpId(java.lang.Long offerRstrGrpId) {
        this.offerRstrGrpId = offerRstrGrpId;
    }

    /**
     * 获取 销售品构成约束组标识，主键。
     */
    public java.lang.Long getOfferRstrGrpId() {
        return this.offerRstrGrpId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.offerRstrGrpId = SeqUtils.createLongId(ID_SEQ);
         return this.offerRstrGrpId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 约束对象类型，LOVB=OFF-C-0047
     */
    public void setRstrObjType(java.lang.String rstrObjType) {
        this.rstrObjType = rstrObjType;
    }

    /**
     * 获取 约束对象类型，LOVB=OFF-C-0047
     */
    public java.lang.String getRstrObjType() {
        return this.rstrObjType;
    }

    /**
     * 设置 约束对象标识，如销售品标识、销售品关系标识
     */
    public void setRstrObjId(java.lang.Long rstrObjId) {
        this.rstrObjId = rstrObjId;
    }

    /**
     * 获取 约束对象标识，如销售品标识、销售品关系标识
     */
    public java.lang.Long getRstrObjId() {
        return this.rstrObjId;
    }

    /**
     * 设置 约束类型； LOVB=OFF-C-0048
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 约束类型； LOVB=OFF-C-0048
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 记录缺省值。
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 记录缺省值。
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 记录最小值。
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 记录最小值。
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
     * 设置 状态。LOVB=PUB-C-0001。
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态。LOVB=PUB-C-0001。
            
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

}
