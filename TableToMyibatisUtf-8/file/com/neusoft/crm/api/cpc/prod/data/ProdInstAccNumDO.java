package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品实例接入号码。
 * @实体表  :PROD_INST_ACC_NUM
 */
public class ProdInstAccNumDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_INST_ACC_NUM_S";

    /**
     * 记录号码实例标识，主键。
     */
    public java.lang.Long prodInstAccNumId;

    /**
     * 记录产品实例标识，外键。
     */
    public java.lang.Long prodInstId;

    /**
     * 记录接入号的类型。LOVB=PRI-C-0006
     */
    public java.lang.String accNumType;

    /**
     * 记录接入号码。
     */
    public java.lang.String accNum;

    /**
     * 记录有产品同平台有关系的平台标识。
     */
    public java.lang.Long platId;

    /**
     * 记录密码。
     */
    public java.lang.String password;

    /**
     * 记录号码的适用区域范围。
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
     * 记录修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 状态修改的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long lastOrderItemId;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 记录号码实例标识，主键。
     */
    public void setProdInstAccNumId(java.lang.Long prodInstAccNumId) {
        this.prodInstAccNumId = prodInstAccNumId;
    }

    /**
     * 获取 记录号码实例标识，主键。
     */
    public java.lang.Long getProdInstAccNumId() {
        return this.prodInstAccNumId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodInstAccNumId = SeqUtils.createLongId(ID_SEQ);
         return this.prodInstAccNumId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 记录产品实例标识，外键。
     */
    public void setProdInstId(java.lang.Long prodInstId) {
        this.prodInstId = prodInstId;
    }

    /**
     * 获取 记录产品实例标识，外键。
     */
    public java.lang.Long getProdInstId() {
        return this.prodInstId;
    }

    /**
     * 设置 记录接入号的类型。LOVB=PRI-C-0006
     */
    public void setAccNumType(java.lang.String accNumType) {
        this.accNumType = accNumType;
    }

    /**
     * 获取 记录接入号的类型。LOVB=PRI-C-0006
     */
    public java.lang.String getAccNumType() {
        return this.accNumType;
    }

    /**
     * 设置 记录接入号码。
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }

    /**
     * 获取 记录接入号码。
     */
    public java.lang.String getAccNum() {
        return this.accNum;
    }

    /**
     * 设置 记录有产品同平台有关系的平台标识。
     */
    public void setPlatId(java.lang.Long platId) {
        this.platId = platId;
    }

    /**
     * 获取 记录有产品同平台有关系的平台标识。
     */
    public java.lang.Long getPlatId() {
        return this.platId;
    }

    /**
     * 设置 记录密码。
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    /**
     * 获取 记录密码。
     */
    public java.lang.String getPassword() {
        return this.password;
    }

    /**
     * 设置 记录号码的适用区域范围。
     */
    public void setApplyRegionId(java.lang.Long applyRegionId) {
        this.applyRegionId = applyRegionId;
    }

    /**
     * 获取 记录号码的适用区域范围。
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
     * 设置 状态修改的时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态修改的时间。
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录上一次维护记录的订单项标识。
     */
    public void setLastOrderItemId(java.lang.Long lastOrderItemId) {
        this.lastOrderItemId = lastOrderItemId;
    }

    /**
     * 获取 记录上一次维护记录的订单项标识。
     */
    public java.lang.Long getLastOrderItemId() {
        return this.lastOrderItemId;
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
