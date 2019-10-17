package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:产品接入号码类型定义

 * @实体表  :PROD_NUM_TYPE_REL
 */
public class ProdNumTypeRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_NUM_TYPE_REL_S";

    /**
     * 产品接入号码类型标识
     */
    public java.lang.Long prodNumTypeId;

    /**
     * 产品ID的标识
     */
    public java.lang.Integer prodId;

    /**
     * 产品号码类型。LOVB=PRD-C-0003
     */
    public java.lang.String numType;

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
     * 是否前台选号。LOVB=PRD-C-0024
     */
    public java.lang.Integer isSelectFlag;

    /**
     * 记录备注信息
     */
    public java.lang.String remark;

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
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodNumTypeId = SeqUtils.createLongId(ID_SEQ);
         return this.prodNumTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 产品ID的标识
     */
    public void setProdId(java.lang.Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取 产品ID的标识
     */
    public java.lang.Integer getProdId() {
        return this.prodId;
    }

    /**
     * 设置 产品号码类型。LOVB=PRD-C-0003
     */
    public void setNumType(java.lang.String numType) {
        this.numType = numType;
    }

    /**
     * 获取 产品号码类型。LOVB=PRD-C-0003
     */
    public java.lang.String getNumType() {
        return this.numType;
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
     * 设置 是否前台选号。LOVB=PRD-C-0024
     */
    public void setIsSelectFlag(java.lang.Integer isSelectFlag) {
        this.isSelectFlag = isSelectFlag;
    }

    /**
     * 获取 是否前台选号。LOVB=PRD-C-0024
     */
    public java.lang.Integer getIsSelectFlag() {
        return this.isSelectFlag;
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
