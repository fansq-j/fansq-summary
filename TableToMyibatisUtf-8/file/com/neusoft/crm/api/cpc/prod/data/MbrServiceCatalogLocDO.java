package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:会员服务目录位置
 * @实体表  :MBR_SERVICE_CATALOG_LOC
 */
public class MbrServiceCatalogLocDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MBR_SERVICE_CATALOG_LOC_S";

    /**
     * 会员服务目录位置标识，主键
     */
    public java.lang.Long catalogLocId;

    /**
     * 俱乐部会员服务标识
     */
    public java.lang.Long memberServiceId;

    /**
     * 记录目录节点的主键
     */
    public java.lang.Long catalogItemId;

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
     * 记录备注信息
     */
    public java.lang.String remark;

    /**
     * 设置 会员服务目录位置标识，主键
     */
    public void setCatalogLocId(java.lang.Long catalogLocId) {
        this.catalogLocId = catalogLocId;
    }

    /**
     * 获取 会员服务目录位置标识，主键
     */
    public java.lang.Long getCatalogLocId() {
        return this.catalogLocId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.catalogLocId = SeqUtils.createLongId(ID_SEQ);
         return this.catalogLocId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 俱乐部会员服务标识
     */
    public void setMemberServiceId(java.lang.Long memberServiceId) {
        this.memberServiceId = memberServiceId;
    }

    /**
     * 获取 俱乐部会员服务标识
     */
    public java.lang.Long getMemberServiceId() {
        return this.memberServiceId;
    }

    /**
     * 设置 记录目录节点的主键
     */
    public void setCatalogItemId(java.lang.Long catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    /**
     * 获取 记录目录节点的主键
     */
    public java.lang.Long getCatalogItemId() {
        return this.catalogItemId;
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
