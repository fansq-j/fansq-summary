package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:配置产品关系间默认、必选约束；
例如：
接入产品默认连带开通功能产品；
接入产品必须
 * @实体表  :PROD_REL_RSTR_CFG
 */
public class ProdRelRstrCfgDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROD_REL_RSTR_CFG_S";

    /**
     * 产品关系约束标识
     */
    public java.lang.Long prodRelRstrCfgId;

    /**
     * 产品关系标识
     */
    public java.lang.Long prodRelId;

    /**
     * 约束类型：默认约束、可选约束。LOVB=PRD-C-0020
     */
    public java.lang.String rstrType;

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
     * 最小数量
     */
    public java.lang.Integer minNum;

    /**
     * 最大数量
     */
    public java.lang.Integer maxNum;

    /**
     * 设置 产品关系约束标识
     */
    public void setProdRelRstrCfgId(java.lang.Long prodRelRstrCfgId) {
        this.prodRelRstrCfgId = prodRelRstrCfgId;
    }

    /**
     * 获取 产品关系约束标识
     */
    public java.lang.Long getProdRelRstrCfgId() {
        return this.prodRelRstrCfgId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodRelRstrCfgId = SeqUtils.createLongId(ID_SEQ);
         return this.prodRelRstrCfgId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 产品关系标识
     */
    public void setProdRelId(java.lang.Long prodRelId) {
        this.prodRelId = prodRelId;
    }

    /**
     * 获取 产品关系标识
     */
    public java.lang.Long getProdRelId() {
        return this.prodRelId;
    }

    /**
     * 设置 约束类型：默认约束、可选约束。LOVB=PRD-C-0020
     */
    public void setRstrType(java.lang.String rstrType) {
        this.rstrType = rstrType;
    }

    /**
     * 获取 约束类型：默认约束、可选约束。LOVB=PRD-C-0020
     */
    public java.lang.String getRstrType() {
        return this.rstrType;
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

    /**
     * 设置 最小数量
     */
    public void setMinNum(java.lang.Integer minNum) {
        this.minNum = minNum;
    }

    /**
     * 获取 最小数量
     */
    public java.lang.Integer getMinNum() {
        return this.minNum;
    }

    /**
     * 设置 最大数量
     */
    public void setMaxNum(java.lang.Integer maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * 获取 最大数量
     */
    public java.lang.Integer getMaxNum() {
        return this.maxNum;
    }

}
