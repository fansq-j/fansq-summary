package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:描述积分类型，比如销售发展积分，奖励积分等
 * @实体表  :SETT_SCORE_TYPE
 */
public class SettScoreTypeDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "SETT_SCORE_TYPE_S";

    /**
     * 佣金积分类型标识
     */
    public java.lang.Integer settScoreTypeId;

    /**
     * 佣金积分类型名称
     */
    public java.lang.String settScoreTypeName;

    /**
     * 上级积分类型标识
     */
    public java.lang.Integer parentScoreTypeId;

    /**
     * LOVB=PRC-C-0026
     */
    public java.lang.String statusCd;

    /**
     * 创建人
     */
    public java.lang.Long createStaff;

    /**
     * 修改人
     */
    public java.lang.Long updateStaff;

    /**
     * 创建时间
     */
    public java.util.Date createDate;

    /**
     * 修改时间
     */
    public java.util.Date updateDate;

    /**
     * 状态时间
     */
    public java.util.Date statusDate;

    /**
     * 设置 佣金积分类型标识
     */
    public void setSettScoreTypeId(java.lang.Integer settScoreTypeId) {
        this.settScoreTypeId = settScoreTypeId;
    }

    /**
     * 获取 佣金积分类型标识
     */
    public java.lang.Integer getSettScoreTypeId() {
        return this.settScoreTypeId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.settScoreTypeId = SeqUtils.createIntegerId(ID_SEQ);
         return this.settScoreTypeId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 佣金积分类型名称
     */
    public void setSettScoreTypeName(java.lang.String settScoreTypeName) {
        this.settScoreTypeName = settScoreTypeName;
    }

    /**
     * 获取 佣金积分类型名称
     */
    public java.lang.String getSettScoreTypeName() {
        return this.settScoreTypeName;
    }

    /**
     * 设置 上级积分类型标识
     */
    public void setParentScoreTypeId(java.lang.Integer parentScoreTypeId) {
        this.parentScoreTypeId = parentScoreTypeId;
    }

    /**
     * 获取 上级积分类型标识
     */
    public java.lang.Integer getParentScoreTypeId() {
        return this.parentScoreTypeId;
    }

    /**
     * 设置 LOVB=PRC-C-0026
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 LOVB=PRC-C-0026
     */
    public java.lang.String getStatusCd() {
        return this.statusCd;
    }

    /**
     * 设置 创建人
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 创建人
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 修改人
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 修改人
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
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

}
