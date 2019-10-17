package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录营销资源与组织的关系，包括商品类营销资源在商铺或实体营业厅进行销售的关系，优惠券类营销资源在商铺或实体营业厅进行兑换
 * @实体表  :MKT_RES_ORG_REL
 */
public class MktResOrgRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_ORG_REL_S";

    /**
     * 营销资源组织关系标识
     */
    public java.lang.Long mktResOrgRelId;

    /**
     * 营销资源标识
     */
    public java.lang.Integer mktResId;

    /**
     * 组织标识，可以是商铺或者实体渠道等
     */
    public java.lang.Long orgId;

    /**
     * 关系类型,LOVB=RES-C-0043
            销售关系：记录商品等营销资源在商铺或实体营业厅进行售卖的关系
            使用关系：记录优惠券等营销资源在商铺或实体营业厅进行兑换使用的关系
     */
    public java.lang.String relType;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

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
     * 备注
     */
    public java.lang.String remark;

    /**
     * 设置 营销资源组织关系标识
     */
    public void setMktResOrgRelId(java.lang.Long mktResOrgRelId) {
        this.mktResOrgRelId = mktResOrgRelId;
    }

    /**
     * 获取 营销资源组织关系标识
     */
    public java.lang.Long getMktResOrgRelId() {
        return this.mktResOrgRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.mktResOrgRelId = SeqUtils.createLongId(ID_SEQ);
         return this.mktResOrgRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 营销资源标识
     */
    public void setMktResId(java.lang.Integer mktResId) {
        this.mktResId = mktResId;
    }

    /**
     * 获取 营销资源标识
     */
    public java.lang.Integer getMktResId() {
        return this.mktResId;
    }

    /**
     * 设置 组织标识，可以是商铺或者实体渠道等
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织标识，可以是商铺或者实体渠道等
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 关系类型,LOVB=RES-C-0043
            销售关系：记录商品等营销资源在商铺或实体营业厅进行售卖的关系
            使用关系：记录优惠券等营销资源在商铺或实体营业厅进行兑换使用的关系
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 关系类型,LOVB=RES-C-0043
            销售关系：记录商品等营销资源在商铺或实体营业厅进行售卖的关系
            使用关系：记录优惠券等营销资源在商铺或实体营业厅进行兑换使用的关系
     */
    public java.lang.String getRelType() {
        return this.relType;
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
