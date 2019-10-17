package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:配置产品服务提供间的约束关系，即A业务订单未竣工时限制办理B业务；例如：固定电话
 * @实体表  :PROD_SERV_REL_RSTR_CFG
 */
public class ProdServRelRstrCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_SERV_REL_RSTR_CFG_S";

    /**
     * 产品服务提供关系约束标识，主键。
     */
    public java.lang.Long prodServiceRelRulId;

    /**
     * 产品的标识，主键。 当等于-1时代表适用于所有产品；
     */
    public java.lang.Long prodId;

    /**
     * A端服务提供的标识
     */
    public java.lang.Integer aServiceOfferId;

    /**
     * Z端服务提供标识
     */
    public java.lang.Integer zServiceOfferId;

    /**
     * 记录产品服务提供之间的约束关系；LOVB=PRD-C-0021 
     */
    public java.lang.String rstrType;

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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 产品服务提供关系约束标识，主键。
     */
    public void setProdServiceRelRulId(java.lang.Long prodServiceRelRulId) {
        this.prodServiceRelRulId = prodServiceRelRulId;
    }

    /**
     * 获取 产品服务提供关系约束标识，主键。
     */
    public java.lang.Long getProdServiceRelRulId() {
        return this.prodServiceRelRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodServiceRelRulId = SeqUtils.createLongId(ID_SEQ);
         return this.prodServiceRelRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 产品的标识，主键。 当等于-1时代表适用于所有产品；
     */
    public void setProdId(java.lang.Long prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品的标识，主键。 当等于-1时代表适用于所有产品；
     */
    public java.lang.Long getProdId() {
        return this.prodId;
    }

    /**
     * 设置 A端服务提供的标识
     */
    public void setAServiceOfferId(java.lang.Integer aServiceOfferId) {
        this.aServiceOfferId = aServiceOfferId;
    }

    /**
     * 获取 A端服务提供的标识
     */
    public java.lang.Integer getAServiceOfferId() {
        return this.aServiceOfferId;
    }

    /**
     * 设置 Z端服务提供标识
     */
    public void setZServiceOfferId(java.lang.Integer zServiceOfferId) {
        this.zServiceOfferId = zServiceOfferId;
    }

    /**
     * 获取 Z端服务提供标识
     */
    public java.lang.Integer getZServiceOfferId() {
        return this.zServiceOfferId;
    }

    /**
     * 设置 记录产品服务提供之间的约束关系；LOVB=PRD-C-0021 
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 记录产品服务提供之间的约束关系；LOVB=PRD-C-0021 
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
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
