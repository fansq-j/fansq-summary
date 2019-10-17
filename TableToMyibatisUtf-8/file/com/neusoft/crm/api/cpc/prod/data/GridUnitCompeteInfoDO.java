package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录网格单元竞争信息
 * @实体表  :GRID_UNIT_COMPETE_INFO
 */
public class GridUnitCompeteInfoDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GRID_UNIT_COMPETE_INFO_S";

    /**
     * 网格单元竞争信息标识
     */
    public java.lang.Long gridUnitCompeteInfoId;

    /**
     * 网格单元标识
     */
    public java.lang.Long gridUnitId;

    /**
     * 竞争业务
     */
    public java.lang.String competeBusiness;

    /**
     * 竞争对手名称
     */
    public java.lang.String competeName;

    /**
     * 记录客户对竞争对手的态度
     */
    public java.lang.String custToCompAttitude;

    /**
     * 记录客户对我方态度
     */
    public java.lang.String custToMineAttitude;

    /**
     * 竞争对手进入时间
     */
    public java.lang.String competitorEnterTime;

    /**
     * 竞争对手主要优势
     */
    public java.lang.String competeParty;

    /**
     * 竞争对手维护方式
     */
    public java.lang.String competitorMaintainWay;

    /**
     * 竞争对手与物业关系
     */
    public java.lang.String competitor;

    /**
     * 竞争对手产品资费
     */
    public java.lang.String comptitorProductFee;

    /**
     * 记录状态。LOVB=PUB-C-0001。
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
     * 设置 网格单元竞争信息标识
     */
    public void setGridUnitCompeteInfoId(java.lang.Long gridUnitCompeteInfoId) {
        this.gridUnitCompeteInfoId = gridUnitCompeteInfoId;
    }

    /**
     * 获取 网格单元竞争信息标识
     */
    public java.lang.Long getGridUnitCompeteInfoId() {
        return this.gridUnitCompeteInfoId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.gridUnitCompeteInfoId = SeqUtils.createLongId(ID_SEQ);
         return this.gridUnitCompeteInfoId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 网格单元标识
     */
    public void setGridUnitId(java.lang.Long gridUnitId) {
        this.gridUnitId = gridUnitId;
    }

    /**
     * 获取 网格单元标识
     */
    public java.lang.Long getGridUnitId() {
        return this.gridUnitId;
    }

    /**
     * 设置 竞争业务
     */
    public void setCompeteBusiness(java.lang.String competeBusiness) {
        this.competeBusiness = competeBusiness;
    }

    /**
     * 获取 竞争业务
     */
    public java.lang.String getCompeteBusiness() {
        return this.competeBusiness;
    }

    /**
     * 设置 竞争对手名称
     */
    public void setCompeteName(java.lang.String competeName) {
        this.competeName = competeName;
    }

    /**
     * 获取 竞争对手名称
     */
    public java.lang.String getCompeteName() {
        return this.competeName;
    }

    /**
     * 设置 记录客户对竞争对手的态度
     */
    public void setCustToCompAttitude(java.lang.String custToCompAttitude) {
        this.custToCompAttitude = custToCompAttitude;
    }

    /**
     * 获取 记录客户对竞争对手的态度
     */
    public java.lang.String getCustToCompAttitude() {
        return this.custToCompAttitude;
    }

    /**
     * 设置 记录客户对我方态度
     */
    public void setCustToMineAttitude(java.lang.String custToMineAttitude) {
        this.custToMineAttitude = custToMineAttitude;
    }

    /**
     * 获取 记录客户对我方态度
     */
    public java.lang.String getCustToMineAttitude() {
        return this.custToMineAttitude;
    }

    /**
     * 设置 竞争对手进入时间
     */
    public void setCompetitorEnterTime(java.lang.String competitorEnterTime) {
        this.competitorEnterTime = competitorEnterTime;
    }

    /**
     * 获取 竞争对手进入时间
     */
    public java.lang.String getCompetitorEnterTime() {
        return this.competitorEnterTime;
    }

    /**
     * 设置 竞争对手主要优势
     */
    public void setCompeteParty(java.lang.String competeParty) {
        this.competeParty = competeParty;
    }

    /**
     * 获取 竞争对手主要优势
     */
    public java.lang.String getCompeteParty() {
        return this.competeParty;
    }

    /**
     * 设置 竞争对手维护方式
     */
    public void setCompetitorMaintainWay(java.lang.String competitorMaintainWay) {
        this.competitorMaintainWay = competitorMaintainWay;
    }

    /**
     * 获取 竞争对手维护方式
     */
    public java.lang.String getCompetitorMaintainWay() {
        return this.competitorMaintainWay;
    }

    /**
     * 设置 竞争对手与物业关系
     */
    public void setCompetitor(java.lang.String competitor) {
        this.competitor = competitor;
    }

    /**
     * 获取 竞争对手与物业关系
     */
    public java.lang.String getCompetitor() {
        return this.competitor;
    }

    /**
     * 设置 竞争对手产品资费
     */
    public void setComptitorProductFee(java.lang.String comptitorProductFee) {
        this.comptitorProductFee = comptitorProductFee;
    }

    /**
     * 获取 竞争对手产品资费
     */
    public java.lang.String getComptitorProductFee() {
        return this.comptitorProductFee;
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
