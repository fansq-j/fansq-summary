package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定义营销资源的促销活动的资费关系

关系类型目前只有一种取值：可叠加
 * @实体表  :PROMOTIONAL_ACTIVITY_RELA
 */
public class PromotionalActivityRelaDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PROMOTIONAL_ACTIVITY_RELA_S";

    /**
     * 促销活动关系标识，主键
     */
    public java.lang.Integer promActiRelaId;

    /**
     * A端促销活动的标识
     */
    public java.lang.Integer promActiIdA;

    /**
     * B端促销活动的标识
     */
    public java.lang.Integer promActiIdZ;

    /**
     * LOVB=PRC-C-0048
     */
    public java.lang.String relType;

    /**
     * 促销活动关系生效时间
     */
    public java.util.Date effDate;

    /**
     * 促销活动关系失效时间
     */
    public java.util.Date expDate;

    /**
     * 普通记录状态.PRC-C-0026
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
     * 设置 促销活动关系标识，主键
     */
    public void setPromActiRelaId(java.lang.Integer promActiRelaId) {
        this.promActiRelaId = promActiRelaId;
    }

    /**
     * 获取 促销活动关系标识，主键
     */
    public java.lang.Integer getPromActiRelaId() {
        return this.promActiRelaId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.promActiRelaId = SeqUtils.createIntegerId(ID_SEQ);
         return this.promActiRelaId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 A端促销活动的标识
     */
    public void setPromActiIdA(java.lang.Integer promActiIdA) {
        this.promActiIdA = promActiIdA;
    }

    /**
     * 获取 A端促销活动的标识
     */
    public java.lang.Integer getPromActiIdA() {
        return this.promActiIdA;
    }

    /**
     * 设置 B端促销活动的标识
     */
    public void setPromActiIdZ(java.lang.Integer promActiIdZ) {
        this.promActiIdZ = promActiIdZ;
    }

    /**
     * 获取 B端促销活动的标识
     */
    public java.lang.Integer getPromActiIdZ() {
        return this.promActiIdZ;
    }

    /**
     * 设置 LOVB=PRC-C-0048
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 LOVB=PRC-C-0048
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 促销活动关系生效时间
     */
    public void setEffDate(java.util.Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 获取 促销活动关系生效时间
     */
    public java.util.Date getEffDate() {
        return this.effDate;
    }

    /**
     * 设置 促销活动关系失效时间
     */
    public void setExpDate(java.util.Date expDate) {
        this.expDate = expDate;
    }

    /**
     * 获取 促销活动关系失效时间
     */
    public java.util.Date getExpDate() {
        return this.expDate;
    }

    /**
     * 设置 普通记录状态.PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 普通记录状态.PRC-C-0026
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
