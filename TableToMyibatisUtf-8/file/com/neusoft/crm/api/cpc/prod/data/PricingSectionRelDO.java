package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:定价段落关系用于描述定价段落之间的关系，如依赖关系、互斥关系等。定价段落关系与定价段落中的计算优先级共同决定当有多个段落
 * @实体表  :PRICING_SECTION_REL
 */
public class PricingSectionRelDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "PRICING_SECTION_REL_S";

    /**
     * 定价段落关系标识
     */
    public java.lang.Integer pricingSectionRelId;

    /**
     * A端段落标识
     */
    public java.lang.Integer aSectionId;

    /**
     * Z端段落标识
     */
    public java.lang.Integer zSectionId;

    /**
     * LOVB=PRC-C-0009
     */
    public java.lang.String relType;

    /**
     * 状态.LOVB=PRC-C-0026.
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
     * 设置 定价段落关系标识
     */
    public void setPricingSectionRelId(java.lang.Integer pricingSectionRelId) {
        this.pricingSectionRelId = pricingSectionRelId;
    }

    /**
     * 获取 定价段落关系标识
     */
    public java.lang.Integer getPricingSectionRelId() {
        return this.pricingSectionRelId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Integer doCreateId(){
         this.pricingSectionRelId = SeqUtils.createIntegerId(ID_SEQ);
         return this.pricingSectionRelId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Integer createId(){
    	  return SeqUtils.createIntegerId(ID_SEQ);
    }

    /**
     * 设置 A端段落标识
     */
    public void setASectionId(java.lang.Integer aSectionId) {
        this.aSectionId = aSectionId;
    }

    /**
     * 获取 A端段落标识
     */
    public java.lang.Integer getASectionId() {
        return this.aSectionId;
    }

    /**
     * 设置 Z端段落标识
     */
    public void setZSectionId(java.lang.Integer zSectionId) {
        this.zSectionId = zSectionId;
    }

    /**
     * 获取 Z端段落标识
     */
    public java.lang.Integer getZSectionId() {
        return this.zSectionId;
    }

    /**
     * 设置 LOVB=PRC-C-0009
     */
    public void setRelType(java.lang.String relType) {
        this.relType = relType;
    }

    /**
     * 获取 LOVB=PRC-C-0009
     */
    public java.lang.String getRelType() {
        return this.relType;
    }

    /**
     * 设置 状态.LOVB=PRC-C-0026.
     */
    public void setStatusCd(java.lang.String statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * 获取 状态.LOVB=PRC-C-0026.
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
