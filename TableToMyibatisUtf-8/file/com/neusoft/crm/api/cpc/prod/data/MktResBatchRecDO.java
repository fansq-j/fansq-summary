package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:批次信息记录:规格号,成本价,数量及相应时间。中国电信实物采购，或信息同步导入，或号码数据生成时，会分批次进行；或者UI
 * @实体表  :MKT_RES_BATCH_REC
 */
public class MktResBatchRecDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "MKT_RES_BATCH_REC_S";

    /**
     * 来源于物资管理系统时产生的数据
     */
    public java.lang.Integer mktResBatchId;

    /**
     * 资源管理批次编码，如外系统同步的批次号
     */
    public java.lang.String mktResBatchNbr;

    /**
     * 营销资源标识
     */
    public java.lang.Integer mktResId;

    /**
     * 记录营销资源批次的成本价格
     */
    public java.lang.Long costPrice;

    /**
     * 记录批次记录的数量
     */
    public java.lang.Long quantity;

    /**
     * 记录备注。
     */
    public java.lang.String remark;

    /**
     * 记录状态变更的时间。
     */
    public java.util.Date statusDate;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

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
     * 指向公共管理区域标识
     */
    public java.lang.Long regionId;

    /**
     * C3本地网标示
     */
    public java.lang.Long lanId;

    /**
     * 设置 来源于物资管理系统时产生的数据
     */
    public void setMktResBatchId(java.lang.Integer mktResBatchId) {
        this.mktResBatchId = mktResBatchId;
    }

    /**
     * 获取 来源于物资管理系统时产生的数据
     */
    public java.lang.Integer getMktResBatchId() {
        return this.mktResBatchId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.mktResBatchId = SeqUtils.createIntegerId(ID_SEQ);
         return this.mktResBatchId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 资源管理批次编码，如外系统同步的批次号
     */
    public void setMktResBatchNbr(java.lang.String mktResBatchNbr) {
        this.mktResBatchNbr = mktResBatchNbr;
    }

    /**
     * 获取 资源管理批次编码，如外系统同步的批次号
     */
    public java.lang.String getMktResBatchNbr() {
        return this.mktResBatchNbr;
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
     * 设置 记录营销资源批次的成本价格
     */
    public void setCostPrice(java.lang.Long costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 获取 记录营销资源批次的成本价格
     */
    public java.lang.Long getCostPrice() {
        return this.costPrice;
    }

    /**
     * 设置 记录批次记录的数量
     */
    public void setQuantity(java.lang.Long quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取 记录批次记录的数量
     */
    public java.lang.Long getQuantity() {
        return this.quantity;
    }

    /**
     * 设置 记录备注。
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 记录备注。
     */
    public java.lang.String getRemark() {
        return this.remark;
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
     * 设置 指向公共管理区域标识
     */
    public void setRegionId(java.lang.Long regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取 指向公共管理区域标识
     */
    public java.lang.Long getRegionId() {
        return this.regionId;
    }

    /**
     * 设置 C3本地网标示
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 C3本地网标示
     */
    public java.lang.Long getLanId() {
        return this.lanId;
    }

}
