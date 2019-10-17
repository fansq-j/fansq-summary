package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述产品关系和服务提供联动约束规则。比如固定电话和有线宽带存在计费号码关系，当固定电话做停机时，同时触发有线宽带做停机。
 * @实体表  :PROD_REL_SERV_LINK_RUL
 */
public class ProdRelServLinkRulDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_REL_SERV_LINK_RUL_S";

    /**
     * 记录产品关系服务提供联动规则主键
     */
    public java.lang.Long prodRelServLinkRulId;

    /**
     * 记录产品关系主键
     */
    public java.lang.Long prodRelId;

    /**
     * 记录关联对象A服务提供
     */
    public java.lang.Long aServiceOffer;

    /**
     * 记录关联对象Z服务提供
     */
    public java.lang.Long zServiceOffer;

    /**
     * 记录约束类型，LOVB=RUL-C-0011
     */
    public java.lang.String rstrType;

    /**
     * 记录默认标识，对于提示同步中有多条记录时，默认指定其中的一条记录，LOVB=PUB-C-0006
     */
    public java.lang.Integer defaultFlag;

    /**
     * 记录约束方向，LOVB=RUL-C-0012
     */
    public java.lang.String operDirect;

    /**
     * 记录适用区域标识
     */
    public java.lang.Long applyRegionId;

    /**
     * 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录创建的时间。
     */
    public java.util.Date createDate;

    /**
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改的员工。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录产品关系服务提供联动规则主键
     */
    public void setProdRelServLinkRulId(java.lang.Long prodRelServLinkRulId) {
        this.prodRelServLinkRulId = prodRelServLinkRulId;
    }

    /**
     * 获取 记录产品关系服务提供联动规则主键
     */
    public java.lang.Long getProdRelServLinkRulId() {
        return this.prodRelServLinkRulId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodRelServLinkRulId = SeqUtils.createLongId(ID_SEQ);
         return this.prodRelServLinkRulId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录产品关系主键
     */
    public void setProdRelId(java.lang.Long prodRelId) {
        this.prodRelId = prodRelId;
    }

    /**
     * 获取 记录产品关系主键
     */
    public java.lang.Long getProdRelId() {
        return this.prodRelId;
    }

    /**
     * 设置 记录关联对象A服务提供
     */
    public void setAServiceOffer(java.lang.Long aServiceOffer) {
        this.aServiceOffer = aServiceOffer;
    }

    /**
     * 获取 记录关联对象A服务提供
     */
    public java.lang.Long getAServiceOffer() {
        return this.aServiceOffer;
    }

    /**
     * 设置 记录关联对象Z服务提供
     */
    public void setZServiceOffer(java.lang.Long zServiceOffer) {
        this.zServiceOffer = zServiceOffer;
    }

    /**
     * 获取 记录关联对象Z服务提供
     */
    public java.lang.Long getZServiceOffer() {
        return this.zServiceOffer;
    }

    /**
     * 设置 记录约束类型，LOVB=RUL-C-0011
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 记录约束类型，LOVB=RUL-C-0011
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
    }

    /**
     * 设置 记录默认标识，对于提示同步中有多条记录时，默认指定其中的一条记录，LOVB=PUB-C-0006
     */
    public void setDefaultFlag(java.lang.Integer defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    /**
     * 获取 记录默认标识，对于提示同步中有多条记录时，默认指定其中的一条记录，LOVB=PUB-C-0006
     */
    public java.lang.Integer getDefaultFlag() {
        return this.defaultFlag;
    }

    /**
     * 设置 记录约束方向，LOVB=RUL-C-0012
     */
    public void setOperDirect(java.lang.String operDirect) {
        this.operDirect = operDirect;
    }

    /**
     * 获取 记录约束方向，LOVB=RUL-C-0012
     */
    public java.lang.String getOperDirect() {
        return this.operDirect;
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
     * 设置 记录状态，LOVB=PUB-C-0001。
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001。
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
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
