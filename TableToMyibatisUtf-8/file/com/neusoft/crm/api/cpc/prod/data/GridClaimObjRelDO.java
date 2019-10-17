package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录产品实例、客户根据网格划配关系划配到网格的结果，可用于佣金结算。1个网格划配对象（产品实例、客户）按照1种划配规则关
 * @实体表  :GRID_CLAIM_OBJ_REL
 */
public class GridClaimObjRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GRID_CLAIM_OBJ_REL_S";

    /**
     * 网格与划配对象关系标识
     */
    public java.lang.Long prodInstGridId;

    /**
     * 划配对象类型,LOVB=CHN-C-0007
     */
    public java.lang.String claimObjType;

    /**
     * 记录划配对象标识
            
     */
    public java.lang.Long claimObjId;

    /**
     * 网格标识
     */
    public java.lang.Long gridId;

    /**
     * 划配关系来源,LOVB=CHN-C-0008
     */
    public java.lang.String claimRuleSource;

    /**
     * 网格划配关系标识
     */
    public java.lang.Long gridClaimRelId;

    /**
     * 本地网标识
     */
    public java.lang.Long lanId;

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
     * 设置 网格与划配对象关系标识
     */
    public void setProdInstGridId(java.lang.Long prodInstGridId) {
        this.prodInstGridId = prodInstGridId;
    }

    /**
     * 获取 网格与划配对象关系标识
     */
    public java.lang.Long getProdInstGridId() {
        return this.prodInstGridId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.prodInstGridId = SeqUtils.createLongId(ID_SEQ);
         return this.prodInstGridId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 划配对象类型,LOVB=CHN-C-0007
     */
    public void setClaimObjType(java.lang.String claimObjType) {
        this.claimObjType = claimObjType;
    }

    /**
     * 获取 划配对象类型,LOVB=CHN-C-0007
     */
    public java.lang.String getClaimObjType() {
        return this.claimObjType;
    }

    /**
     * 设置 记录划配对象标识
            
     */
    public void setClaimObjId(java.lang.Long claimObjId) {
        this.claimObjId = claimObjId;
    }

    /**
     * 获取 记录划配对象标识
            
     */
    public java.lang.Long getClaimObjId() {
        return this.claimObjId;
    }

    /**
     * 设置 网格标识
     */
    public void setGridId(java.lang.Long gridId) {
        this.gridId = gridId;
    }

    /**
     * 获取 网格标识
     */
    public java.lang.Long getGridId() {
        return this.gridId;
    }

    /**
     * 设置 划配关系来源,LOVB=CHN-C-0008
     */
    public void setClaimRuleSource(java.lang.String claimRuleSource) {
        this.claimRuleSource = claimRuleSource;
    }

    /**
     * 获取 划配关系来源,LOVB=CHN-C-0008
     */
    public java.lang.String getClaimRuleSource() {
        return this.claimRuleSource;
    }

    /**
     * 设置 网格划配关系标识
     */
    public void setGridClaimRelId(java.lang.Long gridClaimRelId) {
        this.gridClaimRelId = gridClaimRelId;
    }

    /**
     * 获取 网格划配关系标识
     */
    public java.lang.Long getGridClaimRelId() {
        return this.gridClaimRelId;
    }

    /**
     * 设置 本地网标识
     */
    public void setLanId(java.lang.Long lanId) {
        this.lanId = lanId;
    }

    /**
     * 获取 本地网标识
     */
    public java.lang.Long getLanId() {
        return this.lanId;
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

}
