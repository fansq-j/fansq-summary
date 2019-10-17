package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:记录记录网格单元第三方单位信息
 * @实体表  :GRID_UNIT_THIRD_PARTY
 */
public class GridUnitThirdPartyDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "GRID_UNIT_THIRD_PARTY_S";

    /**
     * 网格单元相关第三方单位标识
     */
    public java.lang.Long gridUnitThirdPartyId;

    /**
     * 网格单元标识
     */
    public java.lang.Long gridUnitId;

    /**
     * 记录第三方单位标识
     */
    public java.lang.Long thirdPartyId;

    /**
     * 记录第三方单位分类，LOVB=CHN-C-0005
            
     */
    public java.lang.String thirdPartyType;

    /**
     * 记录第三方单位的业务影响，比如高、中、低等
     */
    public java.lang.String thirdPartyInfluence;

    /**
     * 第三方单位与我方关系
     */
    public java.lang.String thirdPartyRelation;

    /**
     * 第三方单位对我方态度
     */
    public java.lang.String thirdPartyAttitude;

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
     * 设置 网格单元相关第三方单位标识
     */
    public void setGridUnitThirdPartyId(java.lang.Long gridUnitThirdPartyId) {
        this.gridUnitThirdPartyId = gridUnitThirdPartyId;
    }

    /**
     * 获取 网格单元相关第三方单位标识
     */
    public java.lang.Long getGridUnitThirdPartyId() {
        return this.gridUnitThirdPartyId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.gridUnitThirdPartyId = SeqUtils.createLongId(ID_SEQ);
         return this.gridUnitThirdPartyId;
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
     * 设置 记录第三方单位标识
     */
    public void setThirdPartyId(java.lang.Long thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    /**
     * 获取 记录第三方单位标识
     */
    public java.lang.Long getThirdPartyId() {
        return this.thirdPartyId;
    }

    /**
     * 设置 记录第三方单位分类，LOVB=CHN-C-0005
            
     */
    public void setThirdPartyType(java.lang.String thirdPartyType) {
        this.thirdPartyType = thirdPartyType;
    }

    /**
     * 获取 记录第三方单位分类，LOVB=CHN-C-0005
            
     */
    public java.lang.String getThirdPartyType() {
        return this.thirdPartyType;
    }

    /**
     * 设置 记录第三方单位的业务影响，比如高、中、低等
     */
    public void setThirdPartyInfluence(java.lang.String thirdPartyInfluence) {
        this.thirdPartyInfluence = thirdPartyInfluence;
    }

    /**
     * 获取 记录第三方单位的业务影响，比如高、中、低等
     */
    public java.lang.String getThirdPartyInfluence() {
        return this.thirdPartyInfluence;
    }

    /**
     * 设置 第三方单位与我方关系
     */
    public void setThirdPartyRelation(java.lang.String thirdPartyRelation) {
        this.thirdPartyRelation = thirdPartyRelation;
    }

    /**
     * 获取 第三方单位与我方关系
     */
    public java.lang.String getThirdPartyRelation() {
        return this.thirdPartyRelation;
    }

    /**
     * 设置 第三方单位对我方态度
     */
    public void setThirdPartyAttitude(java.lang.String thirdPartyAttitude) {
        this.thirdPartyAttitude = thirdPartyAttitude;
    }

    /**
     * 获取 第三方单位对我方态度
     */
    public java.lang.String getThirdPartyAttitude() {
        return this.thirdPartyAttitude;
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
