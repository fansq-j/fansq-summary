package com.neusoft.crm.api.cpc.prod.data;

import com.neusoft.crm.common.persistence.BaseDO;

import com.neusoft.crm.common.utils.SeqUtils;

/**
 * @实体描述:协议模板条款通过参数化方式表达规格化信息。
 * @实体表  :AGREE_ITEM_TMP_ATTR
 */
public class AgreeItemTmpAttrDO extends BaseDO{ 

   /**
    *主键对应的序列名称
    */
    public static final String ID_SEQ = "AGREE_ITEM_TMP_ATTR_S";

    /**
     * 条款模板属性标识
     */
    public java.lang.Long itemAttrId;

    /**
     * 协议模板项主键
     */
    public java.lang.Long agreeItemTmpId;

    /**
     * 属性标识
     */
    public java.lang.Long attrId;

    /**
     * 描述这个属性在该产品的所有属性中出现的次序
     */
    public java.lang.Integer attrSeq;

    /**
     * 描述
     */
    public java.lang.String remark;

    /**
     * 记录状态。LOVB=PUB-C-0001。
     */
    public java.lang.String statusCd;

    /**
     * 记录状态变更的时间
     */
    public java.util.Date statusDate;

    /**
     * 记录首次创建的员工标识
     */
    public java.lang.Long createStaff;

    /**
     * 记录首次创建的时间
     */
    public java.util.Date createDate;

    /**
     * 记录每次修改的员工标识
     */
    public java.lang.Long updateStaff;

    /**
     * 记录每次修改的时间
     */
    public java.util.Date updateDate;

    /**
     * 设置 条款模板属性标识
     */
    public void setItemAttrId(java.lang.Long itemAttrId) {
        this.itemAttrId = itemAttrId;
    }

    /**
     * 获取 条款模板属性标识
     */
    public java.lang.Long getItemAttrId() {
        return this.itemAttrId;
    }

    /**
     * 设置主键,并返回主键ID
     */
    public java.lang.Long doCreateId(){
         this.itemAttrId = SeqUtils.createLongId(ID_SEQ);
         return this.itemAttrId;
    }

    /**
     * 静态方法-生成主键ID
     */
    public static final java.lang.Long createId(){
    	  return SeqUtils.createLongId(ID_SEQ);
    }

    /**
     * 设置 协议模板项主键
     */
    public void setAgreeItemTmpId(java.lang.Long agreeItemTmpId) {
        this.agreeItemTmpId = agreeItemTmpId;
    }

    /**
     * 获取 协议模板项主键
     */
    public java.lang.Long getAgreeItemTmpId() {
        return this.agreeItemTmpId;
    }

    /**
     * 设置 属性标识
     */
    public void setAttrId(java.lang.Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取 属性标识
     */
    public java.lang.Long getAttrId() {
        return this.attrId;
    }

    /**
     * 设置 描述这个属性在该产品的所有属性中出现的次序
     */
    public void setAttrSeq(java.lang.Integer attrSeq) {
        this.attrSeq = attrSeq;
    }

    /**
     * 获取 描述这个属性在该产品的所有属性中出现的次序
     */
    public java.lang.Integer getAttrSeq() {
        return this.attrSeq;
    }

    /**
     * 设置 描述
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    /**
     * 获取 描述
     */
    public java.lang.String getRemark() {
        return this.remark;
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
     * 设置 记录状态变更的时间
     */
    public void setStatusDate(java.util.Date statusDate) {
        this.statusDate = statusDate;
    }

    /**
     * 获取 记录状态变更的时间
     */
    public java.util.Date getStatusDate() {
        return this.statusDate;
    }

    /**
     * 设置 记录首次创建的员工标识
     */
    public void setCreateStaff(java.lang.Long createStaff) {
        this.createStaff = createStaff;
    }

    /**
     * 获取 记录首次创建的员工标识
     */
    public java.lang.Long getCreateStaff() {
        return this.createStaff;
    }

    /**
     * 设置 记录首次创建的时间
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取 记录首次创建的时间
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 设置 记录每次修改的员工标识
     */
    public void setUpdateStaff(java.lang.Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    /**
     * 获取 记录每次修改的员工标识
     */
    public java.lang.Long getUpdateStaff() {
        return this.updateStaff;
    }

    /**
     * 设置 记录每次修改的时间
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取 记录每次修改的时间
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

}
