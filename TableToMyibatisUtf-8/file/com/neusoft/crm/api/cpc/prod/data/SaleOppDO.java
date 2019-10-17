package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:商机是指通过对各种渠道收集的市场销售线索分析，或者通过客户洞察分析发现的客户购买中国电信产品或服务的意向。包含有明确的客
 * @实体表  :SALE_OPP
 */
public class SaleOppDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALE_OPP_S";

    /**
     * 商机标识，主键。
     */
    public java.lang.Long saleOppId;

    /**
     * 来源标识
     */
    public java.lang.Long oppSourceId;

    /**
     * 主键。
     */
    public java.lang.Long custId;

    /**
     * 电信组织标识主键
     */
    public java.lang.Long orgId;

    /**
     * 定义商机名称。
     */
    public java.lang.String saleOppName;

    /**
     * 商机编码
     */
    public java.lang.String saleOppCode;

    /**
     * 商机类型。LOVB=SAL-C-0001
     */
    public java.lang.String saleOppType;

    /**
     * 客户需求
     */
    public java.lang.String custRequire;

    /**
     * 记录对商机的描述。
     */
    public java.lang.String saleOppDesc;

    /**
     * 记录预计签约时间。
     */
    public java.util.Date planSignDate;

    /**
     * 记录状态，LOVB=PUB-C-0001
     */
    public java.lang.String statusCd;

    /**
     * 记录创建时间。
     */
    public java.util.Date createDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识。
     */
    public java.lang.Long createStaff;

    /**
     * 记录每次修改的员工标识。
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间。
     */
    public java.util.Date updateDate;

    /**
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 商机标识，主键。
     */
    public void setSaleOppId(java.lang.Long saleOppId) {
        this.saleOppId = saleOppId;
    }

    /**
     * 获取 商机标识，主键。
     */
    public java.lang.Long getSaleOppId() {
        return this.saleOppId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.saleOppId = SeqUtils.createLongId(ID_SEQ);
         return this.saleOppId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 来源标识
     */
    public void setOppSourceId(java.lang.Long oppSourceId) {
        this.oppSourceId = oppSourceId;
    }

    /**
     * 获取 来源标识
     */
    public java.lang.Long getOppSourceId() {
        return this.oppSourceId;
    }

    /**
     * 设置 主键。
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }

    /**
     * 获取 主键。
     */
    public java.lang.Long getCustId() {
        return this.custId;
    }

    /**
     * 设置 电信组织标识主键
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 电信组织标识主键
     */
    public java.lang.Long getOrgId() {
        return this.orgId;
    }

    /**
     * 设置 定义商机名称。
     */
    public void setSaleOppName(java.lang.String saleOppName) {
        this.saleOppName = saleOppName;
    }

    /**
     * 获取 定义商机名称。
     */
    public java.lang.String getSaleOppName() {
        return this.saleOppName;
    }

    /**
     * 设置 商机编码
     */
    public void setSaleOppCode(java.lang.String saleOppCode) {
        this.saleOppCode = saleOppCode;
    }

    /**
     * 获取 商机编码
     */
    public java.lang.String getSaleOppCode() {
        return this.saleOppCode;
    }

    /**
     * 设置 商机类型。LOVB=SAL-C-0001
     */
    public void setSaleOppType(java.lang.String saleOppType) {
        this.saleOppType = saleOppType;
    }

    /**
     * 获取 商机类型。LOVB=SAL-C-0001
     */
    public java.lang.String getSaleOppType() {
        return this.saleOppType;
    }

    /**
     * 设置 客户需求
     */
    public void setCustRequire(java.lang.String custRequire) {
        this.custRequire = custRequire;
    }

    /**
     * 获取 客户需求
     */
    public java.lang.String getCustRequire() {
        return this.custRequire;
    }

    /**
     * 设置 记录对商机的描述。
     */
    public void setSaleOppDesc(java.lang.String saleOppDesc) {
        this.saleOppDesc = saleOppDesc;
    }

    /**
     * 获取 记录对商机的描述。
     */
    public java.lang.String getSaleOppDesc() {
        return this.saleOppDesc;
    }

    /**
     * 设置 记录预计签约时间。
     */
    public void setPlanSignDate(java.util.Date planSignDate) {
        this.planSignDate = planSignDate;
    }

    /**
     * 获取 记录预计签约时间。
     */
    public java.util.Date getPlanSignDate() {
        return this.planSignDate;
    }

    /**
     * 设置 记录状态，LOVB=PUB-C-0001
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录状态，LOVB=PUB-C-0001
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录创建时间。
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录创建时间。
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 状态时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 状态时间
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
