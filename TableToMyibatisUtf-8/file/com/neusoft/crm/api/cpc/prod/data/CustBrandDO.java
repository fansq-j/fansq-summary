package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录客户和品牌的关系，当客户购买品牌销售品后标记成品牌客户，品牌标签标记客户所归属的客户品牌和子品牌
 * @实体表  :CUST_BRAND
 */
public class CustBrandDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "CUST_BRAND_S";

    /**
     * 记录客户品牌标识，作为主键
     */
    public java.lang.Long custBrandId;

    /**
     * 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long custId;

    /**
     * 记录品牌标识，外键，指向品牌实体。
     */
    public java.lang.Long brandId;

    /**
     * 记录客户品牌的子品牌标识，作为外键，指向品牌实体。
     */
    public java.lang.Long subBrandId;

    /**
     * 一个客户有多个品牌情况下，标识哪个是主品牌。LOVB=PUB-C-0006。
     */
    public java.lang.Integer mainFlag;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 状态变更的时间。
            
     */
    public java.util.Date statusDate;

    /**
     * 记录创建的员工。
            
     */
    public java.lang.Long createStaff;

    /**
     * 记录创建的时间。
            
     */
    public java.util.Date createDate;

    /**
     * 记录修改的员工。
            
     */
    public java.lang.Long updateStaff;

    /**
     * 记录修改的时间。
            
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录客户品牌标识，作为主键
     */
    public void setCustBrandId(java.lang.Long custBrandId) {
        this.custBrandId = custBrandId;
    }

    /**
     * 获取 记录客户品牌标识，作为主键
     */
    public java.lang.Long getCustBrandId() {
        return this.custBrandId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.custBrandId = SeqUtils.createLongId(ID_SEQ);
         return this.custBrandId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录客户标识，作为外键，指向客户实体
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 记录客户标识，作为外键，指向客户实体
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 记录品牌标识，外键，指向品牌实体。
     */
    public void setBrandId(java.lang.Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取 记录品牌标识，外键，指向品牌实体。
     */
    public java.lang.Long getBrandId() {
        return this.brandId;
    }

    /**
     * 设置 记录客户品牌的子品牌标识，作为外键，指向品牌实体。
     */
    public void setSubBrandId(java.lang.Long subBrandId) {
        this.subBrandId = subBrandId;
    }

    /**
     * 获取 记录客户品牌的子品牌标识，作为外键，指向品牌实体。
     */
    public java.lang.Long getSubBrandId() {
        return this.subBrandId;
    }

    /**
     * 设置 一个客户有多个品牌情况下，标识哪个是主品牌。LOVB=PUB-C-0006。
     */
    public void setMainFlag(java.lang.Integer mainFlag) {
        this.mainFlag = mainFlag;
    }

    /**
     * 获取 一个客户有多个品牌情况下，标识哪个是主品牌。LOVB=PUB-C-0006。
     */
    public java.lang.Integer getMainFlag() {
        return this.mainFlag;
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
