package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品的号码类型与平台的关系。
 * @实体表  :PROD_NUM_TYPE_PLAT_REL
 */
public class ProdNumTypePlatRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_NUM_TYPE_PLAT_REL_S";

    /**
     * 关联关系的标识，主键。
     */
    public java.lang.Long prodNumTypePlatRelId;

    /**
     * 平台标识
     */
    public java.lang.Long platId;

    /**
     * 产品接入号码类型标识
     */
    public java.lang.Long prodNumTypeId;

    /**
     * 号码回收前保留天数，-1表示不回收，0表示立即回收。
     */
    public java.lang.Integer keepDays;

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
     * 设置 关联关系的标识，主键。
     */
    public void setProdNumTypePlatRelId(java.lang.Long prodNumTypePlatRelId) {
        this.prodNumTypePlatRelId = prodNumTypePlatRelId;
    }

    /**
     * 获取 关联关系的标识，主键。
     */
    public java.lang.Long getProdNumTypePlatRelId() {
        return this.prodNumTypePlatRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodNumTypePlatRelId = SeqUtils.createLongId(ID_SEQ);
         return this.prodNumTypePlatRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 平台标识
     */
    public void setPlatId(java.lang.Long platId) {
        this.platId = platId;
    }

    /**
     * 获取 平台标识
     */
    public java.lang.Long getPlatId() {
        return this.platId;
    }

    /**
     * 设置 产品接入号码类型标识
     */
    public void setProdNumTypeId(java.lang.Long prodNumTypeId) {
        this.prodNumTypeId = prodNumTypeId;
    }

    /**
     * 获取 产品接入号码类型标识
     */
    public java.lang.Long getProdNumTypeId() {
        return this.prodNumTypeId;
    }

    /**
     * 设置 号码回收前保留天数，-1表示不回收，0表示立即回收。
     */
    public void setKeepDays(java.lang.Integer keepDays) {
        this.keepDays = keepDays;
    }

    /**
     * 获取 号码回收前保留天数，-1表示不回收，0表示立即回收。
     */
    public java.lang.Integer getKeepDays() {
        return this.keepDays;
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
