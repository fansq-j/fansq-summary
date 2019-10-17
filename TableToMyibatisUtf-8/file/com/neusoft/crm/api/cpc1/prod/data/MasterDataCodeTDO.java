package com.neusoft.crm.api.cpc1.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:主数据编码表
 * @实体表  :MASTER_DATA_CODE_T
 */
public class MasterDataCodeTDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MASTER_DATA_CODE_T_S";

    /**
     * 主数据序列
     */
    public java.lang.Long masterId;

    /**
     * 主数据编码
     */
    public java.lang.String masterCode;

    /**
     * 主数据名称
     */
    public java.lang.String masterName;

    /**
     * 值编码
     */
    public java.lang.String valueCode;

    /**
     * 值名称
     */
    public java.lang.String valueName;

    /**
     * 是否有效 1:有效 0:失效
     */
    public java.lang.Long ifValid;

    /**
     * 父节点值编码
     */
    public java.lang.String upperValueCode;

    /**
     * 说明
     */
    public java.lang.String explainInfo;

    /**
     * 备注
     */
    public java.lang.String remark;

    /**
     * 创建工号
     */
    public java.lang.Long createStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改工号
     */
    public java.lang.Long updateStaff;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 扩展信息
     */
    public java.lang.String extendInfo;

    /**
     * 记录状态。LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 排序字段
     */
    public java.lang.Integer sort;

    /**
     * 设置 主数据序列
     */
    public void setMasterId(java.lang.Long masterId) {
        this.masterId = masterId;
    }

    /**
     * 获取 主数据序列
     */
    public java.lang.Long getMasterId() {
        return this.masterId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.masterId = SeqUtils.createLongId(ID_SEQ);
         return this.masterId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 主数据编码
     */
    public void setMasterCode(java.lang.String masterCode) {
        this.masterCode = masterCode;
    }

    /**
     * 获取 主数据编码
     */
    public java.lang.String getMasterCode() {
        return this.masterCode;
    }

    /**
     * 设置 主数据名称
     */
    public void setMasterName(java.lang.String masterName) {
        this.masterName = masterName;
    }

    /**
     * 获取 主数据名称
     */
    public java.lang.String getMasterName() {
        return this.masterName;
    }

    /**
     * 设置 值编码
     */
    public void setValueCode(java.lang.String valueCode) {
        this.valueCode = valueCode;
    }

    /**
     * 获取 值编码
     */
    public java.lang.String getValueCode() {
        return this.valueCode;
    }

    /**
     * 设置 值名称
     */
    public void setValueName(java.lang.String valueName) {
        this.valueName = valueName;
    }

    /**
     * 获取 值名称
     */
    public java.lang.String getValueName() {
        return this.valueName;
    }

    /**
     * 设置 是否有效 1:有效 0:失效
     */
    public void setIfValid(java.lang.Long ifValid) {
        this.ifValid = ifValid;
    }

    /**
     * 获取 是否有效 1:有效 0:失效
     */
    public java.lang.Long getIfValid() {
        return this.ifValid;
    }

    /**
     * 设置 父节点值编码
     */
    public void setUpperValueCode(java.lang.String upperValueCode) {
        this.upperValueCode = upperValueCode;
    }

    /**
     * 获取 父节点值编码
     */
    public java.lang.String getUpperValueCode() {
        return this.upperValueCode;
    }

    /**
     * 设置 说明
     */
    public void setExplainInfo(java.lang.String explainInfo) {
        this.explainInfo = explainInfo;
    }

    /**
     * 获取 说明
     */
    public java.lang.String getExplainInfo() {
        return this.explainInfo;
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

    /**
     * 设置 创建工号
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建工号
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 创建时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 修改工号
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改工号
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 修改时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 修改时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 设置 扩展信息
     */
    public void setExtendInfo(java.lang.String extendInfo) {
        this.extendInfo = extendInfo;
    }

    /**
     * 获取 扩展信息
     */
    public java.lang.String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * 设置 记录状态。LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态。LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 排序字段
     */
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取 排序字段
     */
    public java.lang.Integer getSort() {
        return this.sort;
    }

}
