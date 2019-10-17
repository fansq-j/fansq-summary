package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述商机竞争对手
 * @实体表  :SALE_OPP_COMPETITOR
 */
public class SaleOppCompetitorDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SALE_OPP_COMPETITOR_S";

    /**
     * 竞争对手标识，主键
     */
    public java.lang.Long competitorId;

    /**
     * 商机标识
     */
    public java.lang.Long saleOppId;

    /**
     * 参与人标识
     */
    public java.lang.Long partyId;

    /**
     * 竞争对手名称
     */
    public java.lang.String competitorName;

    /**
     * 竞争对手描述
     */
    public java.lang.String competitorDesc;

    /**
     * 记录数据的状态，LOVB=PUB-C-0001
            
     */
    public java.lang.String statusCd;

    /**
     * 记录状态时间。
     */
    public java.util.Date statusDate;

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
     * 记录备注信息。
     */
    public java.lang.String remark;

    /**
     * 设置 竞争对手标识，主键
     */
    public void setCompetitorId(java.lang.Long competitorId) {
        this.competitorId = competitorId;
    }

    /**
     * 获取 竞争对手标识，主键
     */
    public java.lang.Long getCompetitorId() {
        return this.competitorId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.competitorId = SeqUtils.createLongId(ID_SEQ);
         return this.competitorId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 商机标识
     */
    public void setSaleOppId(java.lang.Long saleOppId) {
        this.saleOppId = saleOppId;
    }

    /**
     * 获取 商机标识
     */
    public java.lang.Long getSaleOppId() {
        return this.saleOppId;
    }

    /**
     * 设置 参与人标识
     */
    public void setPartyId(java.lang.Long partyId) {
        this.partyId = partyId;
    }

    /**
     * 获取 参与人标识
     */
    public java.lang.Long getPartyId() {
        return this.partyId;
    }

    /**
     * 设置 竞争对手名称
     */
    public void setCompetitorName(java.lang.String competitorName) {
        this.competitorName = competitorName;
    }

    /**
     * 获取 竞争对手名称
     */
    public java.lang.String getCompetitorName() {
        return this.competitorName;
    }

    /**
     * 设置 竞争对手描述
     */
    public void setCompetitorDesc(java.lang.String competitorDesc) {
        this.competitorDesc = competitorDesc;
    }

    /**
     * 获取 竞争对手描述
     */
    public java.lang.String getCompetitorDesc() {
        return this.competitorDesc;
    }

    /**
     * 设置 记录数据的状态，LOVB=PUB-C-0001
            
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 记录数据的状态，LOVB=PUB-C-0001
            
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 记录状态时间。
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态时间。
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
