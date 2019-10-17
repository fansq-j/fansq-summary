package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述押金类型进行具体的定义，例：押金到期转余额等。
 * @实体表  :DEPOSIT_TYPE
 */
public class DepositTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "DEPOSIT_TYPE_S";

    /**
     * 押金类型明细
     */
    public java.lang.Integer depositTypeId;

    /**
     * 押金类型名称
     */
    public java.lang.String depositTypeName;

    /**
     * LOVB=ACC-C-0187
     */
    public java.lang.Integer depositTypeClass;

    /**
     * 归属区域标识
     */
    public java.lang.Integer regionId;

    /**
     * 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String statusCd;

    /**
     * 记录创建员工号
     */
    public java.lang.Long createStaff;

    /**
     * 记录修改员工号
     */
    public java.lang.Long updateStaff;

    /**
     * 记录创建时间
     */
    public java.util.Date createDate;

    /**
     * 记录状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录修改时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 押金类型明细
     */
    public void setDepositTypeId(java.lang.Integer depositTypeId) {
        this.depositTypeId = depositTypeId;
    }

    /**
     * 获取 押金类型明细
     */
    public java.lang.Integer getDepositTypeId() {
        return this.depositTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.depositTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.depositTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 押金类型名称
     */
    public void setDepositTypeName(java.lang.String depositTypeName) {
        this.depositTypeName = depositTypeName;
    }

    /**
     * 获取 押金类型名称
     */
    public java.lang.String getDepositTypeName() {
        return this.depositTypeName;
    }

    /**
     * 设置 LOVB=ACC-C-0187
     */
    public void setDepositTypeClass(java.lang.Integer depositTypeClass) {
        this.depositTypeClass = depositTypeClass;
    }

    /**
     * 获取 LOVB=ACC-C-0187
     */
    public java.lang.Integer getDepositTypeClass() {
        return this.depositTypeClass;
    }

    /**
     * 设置 归属区域标识
     */
    public void setRegionId(java.lang.Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 归属区域标识
     */
    public java.lang.Integer getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 记录状态，LOVB=ACC-C-0002
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=ACC-C-0002
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建员工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录创建员工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录修改员工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录修改员工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
